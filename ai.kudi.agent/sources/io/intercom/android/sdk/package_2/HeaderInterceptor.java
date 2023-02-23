package io.intercom.android.sdk.package_2;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Base64;
import io.intercom.android.sdk.commons.utilities.DeviceUtils;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.okhttp3.Interceptor;
import io.intercom.okhttp3.Request;
import io.intercom.okhttp3.Response;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;
/* loaded from: classes.dex */
class HeaderInterceptor implements Interceptor {
    private static final String ACCEPT_LANGUAGE = "Accept-Language";
    private static final String ANDROID_HEADER = "intercom-android-sdk/";
    private static final String AUTHORIZATION = "Authorization";
    private static final String CONTENT_TYPE_KEY = "Content-Type";
    private static final String CONTENT_TYPE_VALUE = "application/json";
    private static final String CORDOVA_HEADER = "intercom-sdk-cordova/";
    private static final String CORDOVA_PREFS = "intercomsdk_cordova_prefs";
    private static final String CORDOVA_VERSION = "cordova_version";
    private static final String HOST_APP_VERSION_KEY = "X-INTERCOM-HOST-APP-VERSION";
    private static final String IDEMPOTENCY_KEY = "Idempotency-Key";
    private static final String INTERCOM_AGENT = "X-INTERCOM-AGENT";
    private static final String INTERCOM_AGENT_WRAPPER = "X-INTERCOM-AGENT-WRAPPER";
    private static final String SUPPORTED_LANGUAGES_KEY = "X-INTERCOM-SUPPORTED-LANGUAGES";
    private static final String SUPPORTED_LANGUAGE_LIST = "ar,bg,bs,ca,cs,da,de,de-form,el,es,et,fi,fr,he,hr,hu,id,it,ja,ko,lt,lv,mn,nb,nl,pl,pt-PT,pt-BR,ro,ru,sl,sr,sv,tr,vi,zh-Hant,zh-Hans";
    private final AppIdentity appIdentity;
    private final String appVersion;
    private final String cordovaVersion;
    private final Random random;
    private final Locale userLocale;
    private final String versionName;

    HeaderInterceptor(String str, String str2, AppIdentity appIdentity, Locale locale, String str3, Random random) {
        this.cordovaVersion = str;
        this.versionName = str2;
        this.appIdentity = appIdentity;
        this.userLocale = locale;
        this.appVersion = str3;
        this.random = random;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static HeaderInterceptor create(Context context, AppIdentity appIdentity) {
        SharedPreferences $r4 = context.getSharedPreferences(CORDOVA_PREFS, 0);
        String $r5 = $r4.getString(CORDOVA_VERSION, "");
        Resources $r6 = context.getResources();
        Configuration $r7 = $r6.getConfiguration();
        Locale $r1 = $r7.locale;
        String $r8 = DeviceUtils.getAppVersion(context);
        Random $r2 = new Random();
        HeaderInterceptor $r9 = new HeaderInterceptor($r5, "5.5.0", appIdentity, $r1, $r8, $r2);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private String getBasicAuth() {
        StringBuilder $r1 = new StringBuilder();
        AppIdentity $r2 = this.appIdentity;
        String $r3 = $r2.appId();
        $r1.append($r3);
        $r1.append(":");
        AppIdentity $r22 = this.appIdentity;
        String $r32 = $r22.apiKey();
        $r1.append($r32);
        String $r33 = $r1.toString();
        StringBuilder $r12 = new StringBuilder();
        $r12.append("Basic ");
        byte[] $r4 = $r33.getBytes();
        String $r34 = Base64.encodeToString($r4, 2);
        $r12.append($r34);
        String $r35 = $r12.toString();
        return $r35;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static void setCordovaVersion(Context context, String str) {
        SharedPreferences $r2 = context.getSharedPreferences(CORDOVA_PREFS, 0);
        SharedPreferences.Editor $r3 = $r2.edit();
        $r3.putString(CORDOVA_VERSION, str).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request $r2 = chain.request();
        Request.Builder $r3 = $r2.newBuilder();
        Request.Builder $r32 = $r3.header(CONTENT_TYPE_KEY, CONTENT_TYPE_VALUE);
        String $r4 = getBasicAuth();
        Request.Builder $r33 = $r32.header(AUTHORIZATION, $r4);
        Random $r5 = this.random;
        long $l0 = $r5.nextLong();
        String $r42 = Long.toHexString($l0);
        Request.Builder $r34 = $r33.header(IDEMPOTENCY_KEY, $r42);
        StringBuilder $r6 = new StringBuilder();
        $r6.append(ANDROID_HEADER);
        String $r43 = this.versionName;
        $r6.append($r43);
        String $r44 = $r6.toString();
        Request.Builder $r35 = $r34.header(INTERCOM_AGENT, $r44);
        StringBuilder $r62 = new StringBuilder();
        Locale $r7 = this.userLocale;
        String $r45 = $r7.getLanguage();
        $r62.append($r45);
        $r62.append("-");
        Locale $r72 = this.userLocale;
        String $r46 = $r72.getCountry();
        $r62.append($r46);
        String $r47 = $r62.toString();
        Request.Builder $r36 = $r35.header(ACCEPT_LANGUAGE, $r47).header(SUPPORTED_LANGUAGES_KEY, SUPPORTED_LANGUAGE_LIST);
        String $r48 = this.appVersion;
        Request.Builder $r37 = $r36.header(HOST_APP_VERSION_KEY, $r48);
        String $r49 = this.cordovaVersion;
        boolean $z0 = $r49.isEmpty();
        if (!$z0) {
            StringBuilder $r63 = new StringBuilder();
            $r63.append(CORDOVA_HEADER);
            String $r410 = this.cordovaVersion;
            $r63.append($r410);
            String $r411 = $r63.toString();
            $r37.header(INTERCOM_AGENT_WRAPPER, $r411);
        }
        Request $r22 = $r37.build();
        Response $r8 = chain.proceed($r22);
        return $r8;
    }
}
