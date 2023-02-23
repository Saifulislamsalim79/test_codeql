package com.google.firebase.crashlytics.p112h.p119m;

import com.google.firebase.crashlytics.p112h.C5335f;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
/* compiled from: HttpGetRequest.java */
/* renamed from: com.google.firebase.crashlytics.h.m.a */
/* loaded from: classes2.dex */
public class C5567a {

    /* renamed from: a */
    private final String f13739a;

    /* renamed from: b */
    private final Map<String, String> f13740b;

    /* renamed from: c */
    private final Map<String, String> f13741c = new HashMap();

    public C5567a(String str, Map<String, String> map) {
        this.f13739a = str;
        this.f13740b = map;
    }

    /* renamed from: a */
    private String m24457a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(next.getKey());
        sb2.append("=");
        sb2.append(next.getValue() != null ? next.getValue() : "");
        sb.append(sb2.toString());
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("&");
            sb3.append(next2.getKey());
            sb3.append("=");
            sb3.append(next2.getValue() != null ? next2.getValue() : "");
            sb.append(sb3.toString());
        }
        return sb.toString();
    }

    /* renamed from: b */
    private String m24456b(String str, Map<String, String> map) {
        String m24457a = m24457a(map);
        if (m24457a.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                m24457a = "&" + m24457a;
            }
            return str + m24457a;
        }
        return str + "?" + m24457a;
    }

    /* renamed from: e */
    private String m24453e(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
            } else {
                return sb.toString();
            }
        }
    }

    /* renamed from: c */
    public C5569c m24455c() throws IOException {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String m24453e = null;
        inputStream = null;
        try {
            String m24456b = m24456b(this.f13739a, this.f13740b);
            C5335f.m25102f().m25099i("GET Request URL: " + m24456b);
            httpsURLConnection = (HttpsURLConnection) new URL(m24456b).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.f13741c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        m24453e = m24453e(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                return new C5569c(responseCode, m24453e);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    /* renamed from: d */
    public C5567a m24454d(String str, String str2) {
        this.f13741c.put(str, str2);
        return this;
    }
}
