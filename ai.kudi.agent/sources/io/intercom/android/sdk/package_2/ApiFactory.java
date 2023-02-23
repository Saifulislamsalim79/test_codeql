package io.intercom.android.sdk.package_2;

import android.content.Context;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.commons.utilities.TimeProvider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.package_2.RetryInterceptor;
import io.intercom.android.sdk.store.Store;
import io.intercom.com.google.gson.C10916e;
import io.intercom.okhttp3.Cache;
import io.intercom.okhttp3.CertificatePinner;
import io.intercom.okhttp3.OkHttpClient;
import io.intercom.retrofit2.Retrofit;
import io.intercom.retrofit2.converter.gson.GsonConverterFactory;
import java.io.File;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import p425j.p429b.p430a.p431a.p432a.C11129b;
/* loaded from: classes.dex */
public class ApiFactory {
    private static final String CACHE_NAME = "Intercom_SDK/HttpCache";
    private static final int CACHE_SIZE = 10485760;
    private static final String ENDPOINT = "/messenger/mobile/";
    private static final int INTERCOM_TRAFFIC_TAG = 46837266;
    private static final int MAX_DNS_SEGMENT_SIZE = 63;
    private static final String PARTIAL_HOSTNAME = ".mobile-sdk-api.intercom.io";
    private static final String PROTOCOL = "https://";

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static String convertHostnameToUrl(String str) {
        String $r1 = PROTOCOL + str + ENDPOINT;
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FeedbackDialog create(Context context, AppIdentity appIdentity, UserIdentity userIdentity, C11129b c11129b, Store store, String str, Provider provider, C10916e c10916e) {
        OkHttpClient.Builder $r8 = createConfigurableHttpClient(context, appIdentity, userIdentity);
        OkHttpClient $r9 = $r8.build();
        FeedbackDialog $r10 = createWithNetworkClient(context, appIdentity, userIdentity, c11129b, $r9, store, str, provider, c10916e);
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OkHttpClient.Builder createConfigurableHttpClient(Context context, AppIdentity appIdentity, UserIdentity userIdentity) {
        OkHttpClient.Builder $r3 = new OkHttpClient.Builder();
        TimeUnit $r4 = TimeUnit.MINUTES;
        OkHttpClient.Builder $r32 = $r3.readTimeout(2L, $r4);
        TimeUnit $r42 = TimeUnit.MINUTES;
        OkHttpClient.Builder $r33 = $r32.connectTimeout(2L, $r42);
        TimeUnit $r43 = TimeUnit.MINUTES;
        OkHttpClient.Builder $r34 = $r33.writeTimeout(2L, $r43);
        SocketFactory $r6 = SocketFactory.getDefault();
        TaggingSocketFactory $r5 = new TaggingSocketFactory($r6, INTERCOM_TRAFFIC_TAG);
        OkHttpClient.Builder $r35 = $r34.socketFactory($r5);
        UserIdentityInterceptor $r7 = new UserIdentityInterceptor(userIdentity);
        OkHttpClient.Builder $r36 = $r35.addInterceptor($r7);
        RetryInterceptor.Sleeper $r9 = new RetryInterceptor.Sleeper();
        RetryInterceptor $r8 = new RetryInterceptor($r9);
        OkHttpClient.Builder $r37 = $r36.addInterceptor($r8);
        TimeProvider $r12 = TimeProvider.SYSTEM;
        ShutdownState $r11 = new ShutdownState(context, appIdentity, $r12);
        ShutdownInterceptor $r10 = new ShutdownInterceptor($r11);
        OkHttpClient.Builder $r38 = $r37.addInterceptor($r10);
        HeaderInterceptor $r13 = HeaderInterceptor.create(context, appIdentity);
        OkHttpClient.Builder $r39 = $r38.addNetworkInterceptor($r13);
        File $r14 = context.getCacheDir();
        if ($r14 != null) {
            String $r16 = $r14.getAbsolutePath();
            File $r15 = new File($r16, CACHE_NAME);
            Cache $r17 = new Cache($r15, 10485760L);
            $r39.cache($r17);
        }
        String $r162 = appIdentity.appId();
        String $r163 = getFullHostname($r162);
        CertificatePinner.Builder $r18 = new CertificatePinner.Builder();
        String[] $r19 = {"sha1/BiCgk94N+oILO/VULX+wYS6gWKU="};
        CertificatePinner $r20 = $r18.add($r163, $r19).build();
        $r39.certificatePinner($r20);
        return $r39;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private static MessengerApi createRetrofitClient(OkHttpClient okHttpClient, String str, C10916e c10916e) {
        Retrofit.Builder $r1 = new Retrofit.Builder();
        Retrofit.Builder $r12 = $r1.baseUrl(str).client(okHttpClient);
        GsonConverterFactory $r4 = GsonConverterFactory.create(c10916e);
        Retrofit $r5 = $r12.addConverterFactory($r4).build();
        Object $r6 = $r5.create(io.intercom.android.sdk.api.MessengerApi.class);
        MessengerApi $r7 = (MessengerApi) $r6;
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static String createUniqueIdentifier(String str) {
        String $r0 = removeInvalidCharacters(str) + "-android";
        int $i0 = $r0.length();
        if ($i0 > 63) {
            char $c2 = $r0.charAt(62);
            byte $b1 = $c2 == '-' ? (byte) 62 : (byte) 63;
            return $r0.substring(0, $b1);
        }
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FeedbackDialog createWithNetworkClient(Context context, AppIdentity appIdentity, UserIdentity userIdentity, C11129b c11129b, OkHttpClient okHttpClient, Store store, String str, Provider provider, C10916e c10916e) {
        MessengerApi $r12 = createRetrofitClient(okHttpClient, str, c10916e);
        CallbackHolder $r9 = new CallbackHolder(c11129b, store);
        Object $r13 = provider.get();
        RateLimiter $r10 = new RateLimiter((AppConfig) $r13);
        FeedbackDialog $r11 = new FeedbackDialog(context, appIdentity, userIdentity, c11129b, okHttpClient, $r12, $r9, $r10, store, provider, c10916e);
        return $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static String getFullHostname(String str) {
        StringBuilder $r0 = new StringBuilder();
        String $r1 = createUniqueIdentifier(str);
        $r0.append($r1);
        $r0.append(PARTIAL_HOSTNAME);
        String $r12 = $r0.toString();
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static String getHostname(AppIdentity appIdentity) {
        String $r1 = appIdentity.appId();
        return convertHostnameToUrl(getFullHostname($r1));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static String removeInvalidCharacters(String str) {
        String $r0 = str.replaceAll("[^A-Za-z0-9\\-$]", "");
        return $r0;
    }
}
