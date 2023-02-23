package com.google.firebase.remoteconfig.internal;

import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.core.content.p056d.C1344a;
import com.google.android.gms.common.util.C2963a;
import com.google.android.gms.common.util.C2972j;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.C6754k;
import com.google.firebase.remoteconfig.internal.C6757l;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h */
    private static final Pattern f16215h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a */
    private final Context f16216a;

    /* renamed from: b */
    private final String f16217b;

    /* renamed from: c */
    private final String f16218c;

    /* renamed from: d */
    private final String f16219d;

    /* renamed from: e */
    private final String f16220e;

    /* renamed from: f */
    private final long f16221f;

    /* renamed from: g */
    private final long f16222g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        this.f16216a = context;
        this.f16217b = str;
        this.f16218c = str2;
        this.f16219d = m20902e(str);
        this.f16220e = str3;
        this.f16221f = j;
        this.f16222g = j2;
    }

    /* renamed from: a */
    private boolean m20906a(JSONObject jSONObject) {
        try {
            return !jSONObject.get(SendReceiptToTerminalConfirmationBottomSheet.STATE).equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    /* renamed from: b */
    private JSONObject m20905b(String str, String str2, Map<String, String> map) throws FirebaseRemoteConfigClientException {
        String locale;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f16217b);
            Locale locale2 = this.f16216a.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale2.getCountry());
            if (Build.VERSION.SDK_INT >= 21) {
                locale = locale2.toLanguageTag();
            } else {
                locale = locale2.toString();
            }
            hashMap.put("languageCode", locale);
            hashMap.put("platformVersion", Integer.toString(Build.VERSION.SDK_INT));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.f16216a.getPackageManager().getPackageInfo(this.f16216a.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    hashMap.put("appBuild", Long.toString(C1344a.m36296a(packageInfo)));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put(BanksWithMethods.PACKAGE_NAME, this.f16216a.getPackageName());
            hashMap.put("sdkVersion", "21.0.1");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            return new JSONObject(hashMap);
        }
        throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
    }

    /* renamed from: d */
    private static C6754k m20903d(JSONObject jSONObject, Date date) throws FirebaseRemoteConfigClientException {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        try {
            C6754k.C6756b m20873g = C6754k.m20873g();
            m20873g.m20868e(date);
            JSONObject jSONObject3 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject("entries");
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                m20873g.m20870c(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray("experimentDescriptions");
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                m20873g.m20869d(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject("personalizationMetadata");
            } catch (JSONException unused3) {
            }
            if (jSONObject3 != null) {
                m20873g.m20867f(jSONObject3);
            }
            return m20873g.m20872a();
        } catch (JSONException e) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e);
        }
    }

    /* renamed from: e */
    private static String m20902e(String str) {
        Matcher matcher = f16215h.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: f */
    private JSONObject m20901f(URLConnection uRLConnection) throws IOException, JSONException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                sb.append((char) read);
            } else {
                return new JSONObject(sb.toString());
            }
        }
    }

    /* renamed from: g */
    private String m20900g(String str, String str2) {
        return String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", str, str2);
    }

    /* renamed from: h */
    private String m20899h() {
        try {
            byte[] m31546a = C2963a.m31546a(this.f16216a, this.f16216a.getPackageName());
            if (m31546a == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f16216a.getPackageName());
                return null;
            }
            return C2972j.m31524c(m31546a, false);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("FirebaseRemoteConfig", "No such package: " + this.f16216a.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: i */
    private void m20898i(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f16218c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.f16216a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", m20899h());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    /* renamed from: j */
    private void m20897j(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: k */
    private void m20896k(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* renamed from: l */
    private void m20895l(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map) {
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout((int) TimeUnit.SECONDS.toMillis(this.f16221f));
        httpURLConnection.setReadTimeout((int) TimeUnit.SECONDS.toMillis(this.f16222g));
        httpURLConnection.setRequestProperty("If-None-Match", str);
        m20898i(httpURLConnection, str2);
        m20897j(httpURLConnection, map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public HttpURLConnection m20904c() throws FirebaseRemoteConfigException {
        try {
            return (HttpURLConnection) new URL(m20900g(this.f16219d, this.f16220e)).openConnection();
        } catch (IOException e) {
            throw new FirebaseRemoteConfigException(e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Keep
    public C6757l.C6758a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Date date) throws FirebaseRemoteConfigException {
        m20895l(httpURLConnection, str3, str2, map2);
        try {
            try {
                m20896k(httpURLConnection, m20905b(str, str2, map).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    String headerField = httpURLConnection.getHeaderField("ETag");
                    JSONObject m20901f = m20901f(httpURLConnection);
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (IOException unused) {
                    }
                    if (!m20906a(m20901f)) {
                        return C6757l.C6758a.m20846a(date);
                    }
                    return C6757l.C6758a.m20845b(m20903d(m20901f, date), headerField);
                }
                throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
            } finally {
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused2) {
                }
            }
        } catch (IOException | JSONException e) {
            throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e);
        }
    }
}
