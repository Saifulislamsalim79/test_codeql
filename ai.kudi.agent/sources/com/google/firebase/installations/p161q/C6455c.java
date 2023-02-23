package com.google.firebase.installations.p161q;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.util.C2963a;
import com.google.android.gms.common.util.C2972j;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.p161q.AbstractC6456d;
import com.google.firebase.installations.p161q.AbstractC6460f;
import com.google.firebase.p169n.InterfaceC6555f;
import com.google.firebase.p170o.InterfaceC6560b;
import com.google.firebase.p181q.InterfaceC6732i;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: FirebaseInstallationServiceClient.java */
/* renamed from: com.google.firebase.installations.q.c */
/* loaded from: classes2.dex */
public class C6455c {

    /* renamed from: e */
    private static final Pattern f15590e = Pattern.compile("[0-9]+s");

    /* renamed from: f */
    private static final Charset f15591f = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Context f15592a;

    /* renamed from: b */
    private final InterfaceC6560b<InterfaceC6732i> f15593b;

    /* renamed from: c */
    private final InterfaceC6560b<InterfaceC6555f> f15594c;

    /* renamed from: d */
    private final C6459e f15595d = new C6459e();

    public C6455c(Context context, InterfaceC6560b<InterfaceC6732i> interfaceC6560b, InterfaceC6560b<InterfaceC6555f> interfaceC6560b2) {
        this.f15592a = context;
        this.f15593b = interfaceC6560b;
        this.f15594c = interfaceC6560b2;
    }

    /* renamed from: a */
    private static String m21986a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    private static JSONObject m21985b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.0");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    private static JSONObject m21984c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: f */
    private String m21981f() {
        try {
            byte[] m31546a = C2963a.m31546a(this.f15592a, this.f15592a.getPackageName());
            if (m31546a == null) {
                Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f15592a.getPackageName());
                return null;
            }
            return C2972j.m31524c(m31546a, false);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ContentValues", "No such package: " + this.f15592a.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: g */
    private URL m21980g(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e) {
            throw new FirebaseInstallationsException(e.getMessage(), FirebaseInstallationsException.EnumC6420a.UNAVAILABLE);
        }
    }

    /* renamed from: h */
    private static byte[] m21979h(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: i */
    private static boolean m21978i(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: j */
    private static void m21977j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: k */
    private static void m21976k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String m21972o = m21972o(httpURLConnection);
        if (TextUtils.isEmpty(m21972o)) {
            return;
        }
        Log.w("Firebase-Installations", m21972o);
        Log.w("Firebase-Installations", m21986a(str, str2, str3));
    }

    /* renamed from: l */
    private HttpURLConnection m21975l(URL url, String str) throws FirebaseInstallationsException {
        InterfaceC6555f.EnumC6556a mo21645a;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f15592a.getPackageName());
            if (this.f15594c.get() != null && this.f15593b.get() != null && (mo21645a = this.f15594c.get().mo21645a("fire-installations-id")) != InterfaceC6555f.EnumC6556a.NONE) {
                httpURLConnection.addRequestProperty("x-firebase-client", this.f15593b.get().mo20931a());
                httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(mo21645a.m21644a()));
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m21981f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC6420a.UNAVAILABLE);
        }
    }

    /* renamed from: m */
    static long m21974m(String str) {
        s.b(f15590e.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: n */
    private AbstractC6456d m21973n(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f15591f));
        AbstractC6460f.AbstractC6461a m21949a = AbstractC6460f.m21949a();
        AbstractC6456d.AbstractC6457a m21967a = AbstractC6456d.m21967a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                m21967a.mo21956f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                m21967a.mo21959c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                m21967a.mo21958d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        m21949a.mo21943c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        m21949a.mo21942d(m21974m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                m21967a.mo21960b(m21949a.mo21945a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        m21967a.mo21957e(AbstractC6456d.EnumC6458b.OK);
        return m21967a.mo21961a();
    }

    /* renamed from: o */
    private static String m21972o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f15591f));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    /* renamed from: p */
    private AbstractC6460f m21971p(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f15591f));
        AbstractC6460f.AbstractC6461a m21949a = AbstractC6460f.m21949a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                m21949a.mo21943c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                m21949a.mo21942d(m21974m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        m21949a.mo21944b(AbstractC6460f.EnumC6462b.OK);
        return m21949a.mo21945a();
    }

    /* renamed from: q */
    private void m21970q(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        m21968s(httpURLConnection, m21979h(m21985b(str, str2)));
    }

    /* renamed from: r */
    private void m21969r(HttpURLConnection httpURLConnection) throws IOException {
        m21968s(httpURLConnection, m21979h(m21984c()));
    }

    /* renamed from: s */
    private static void m21968s(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    /* renamed from: d */
    public AbstractC6456d m21983d(String str, String str2, String str3, String str4, String str5) throws FirebaseInstallationsException {
        int responseCode;
        AbstractC6456d m21973n;
        if (this.f15595d.m21954b()) {
            URL m21980g = m21980g(String.format("projects/%s/installations", str3));
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection m21975l = m21975l(m21980g, str);
                try {
                    m21975l.setRequestMethod("POST");
                    m21975l.setDoOutput(true);
                    if (str5 != null) {
                        m21975l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    m21970q(m21975l, str2, str4);
                    responseCode = m21975l.getResponseCode();
                    this.f15595d.m21950f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    m21975l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (m21978i(responseCode)) {
                    m21973n = m21973n(m21975l);
                } else {
                    m21976k(m21975l, str4, str, str3);
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.EnumC6420a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        m21977j();
                        AbstractC6456d.AbstractC6457a m21967a = AbstractC6456d.m21967a();
                        m21967a.mo21957e(AbstractC6456d.EnumC6458b.BAD_CONFIG);
                        m21973n = m21967a.mo21961a();
                    } else {
                        m21975l.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                m21975l.disconnect();
                TrafficStats.clearThreadStatsTag();
                return m21973n;
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC6420a.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC6420a.UNAVAILABLE);
    }

    /* renamed from: e */
    public AbstractC6460f m21982e(String str, String str2, String str3, String str4) throws FirebaseInstallationsException {
        int responseCode;
        AbstractC6460f m21971p;
        if (this.f15595d.m21954b()) {
            URL m21980g = m21980g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection m21975l = m21975l(m21980g, str);
                try {
                    m21975l.setRequestMethod("POST");
                    m21975l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    m21975l.setDoOutput(true);
                    m21969r(m21975l);
                    responseCode = m21975l.getResponseCode();
                    this.f15595d.m21950f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    m21975l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (m21978i(responseCode)) {
                    m21971p = m21971p(m21975l);
                } else {
                    m21976k(m21975l, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.EnumC6420a.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            m21977j();
                            AbstractC6460f.AbstractC6461a m21949a = AbstractC6460f.m21949a();
                            m21949a.mo21944b(AbstractC6460f.EnumC6462b.BAD_CONFIG);
                            m21971p = m21949a.mo21945a();
                        } else {
                            m21975l.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    AbstractC6460f.AbstractC6461a m21949a2 = AbstractC6460f.m21949a();
                    m21949a2.mo21944b(AbstractC6460f.EnumC6462b.AUTH_ERROR);
                    m21971p = m21949a2.mo21945a();
                }
                m21975l.disconnect();
                TrafficStats.clearThreadStatsTag();
                return m21971p;
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC6420a.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC6420a.UNAVAILABLE);
    }
}
