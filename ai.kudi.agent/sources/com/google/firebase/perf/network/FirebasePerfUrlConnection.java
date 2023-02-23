package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.C6695b;
import com.google.firebase.perf.p177i.C6623k;
import com.google.firebase.perf.p178j.C6637h;
import com.google.firebase.perf.p178j.C6640j;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
/* loaded from: classes2.dex */
public class FirebasePerfUrlConnection {
    private FirebasePerfUrlConnection() {
    }

    /* renamed from: a */
    static Object m21050a(C6640j c6640j, C6623k c6623k, C6637h c6637h) throws IOException {
        c6637h.m21398e();
        long m21399d = c6637h.m21399d();
        C6695b m21109c = C6695b.m21109c(c6623k);
        try {
            URLConnection m21394a = c6640j.m21394a();
            if (m21394a instanceof HttpsURLConnection) {
                return new C6705d((HttpsURLConnection) m21394a, c6637h, m21109c).getContent();
            }
            if (m21394a instanceof HttpURLConnection) {
                return new C6704c((HttpURLConnection) m21394a, c6637h, m21109c).getContent();
            }
            return m21394a.getContent();
        } catch (IOException e) {
            m21109c.m21098n(m21399d);
            m21109c.m21094r(c6637h.m21401b());
            m21109c.m21092t(c6640j.toString());
            C6709h.m20990d(m21109c);
            throw e;
        }
    }

    /* renamed from: b */
    static Object m21049b(C6640j c6640j, Class[] clsArr, C6623k c6623k, C6637h c6637h) throws IOException {
        c6637h.m21398e();
        long m21399d = c6637h.m21399d();
        C6695b m21109c = C6695b.m21109c(c6623k);
        try {
            URLConnection m21394a = c6640j.m21394a();
            if (m21394a instanceof HttpsURLConnection) {
                return new C6705d((HttpsURLConnection) m21394a, c6637h, m21109c).getContent(clsArr);
            }
            if (m21394a instanceof HttpURLConnection) {
                return new C6704c((HttpURLConnection) m21394a, c6637h, m21109c).getContent(clsArr);
            }
            return m21394a.getContent(clsArr);
        } catch (IOException e) {
            m21109c.m21098n(m21399d);
            m21109c.m21094r(c6637h.m21401b());
            m21109c.m21092t(c6640j.toString());
            C6709h.m20990d(m21109c);
            throw e;
        }
    }

    /* renamed from: c */
    static InputStream m21048c(C6640j c6640j, C6623k c6623k, C6637h c6637h) throws IOException {
        c6637h.m21398e();
        long m21399d = c6637h.m21399d();
        C6695b m21109c = C6695b.m21109c(c6623k);
        try {
            URLConnection m21394a = c6640j.m21394a();
            if (m21394a instanceof HttpsURLConnection) {
                return new C6705d((HttpsURLConnection) m21394a, c6637h, m21109c).getInputStream();
            }
            if (m21394a instanceof HttpURLConnection) {
                return new C6704c((HttpURLConnection) m21394a, c6637h, m21109c).getInputStream();
            }
            return m21394a.getInputStream();
        } catch (IOException e) {
            m21109c.m21098n(m21399d);
            m21109c.m21094r(c6637h.m21401b());
            m21109c.m21092t(c6640j.toString());
            C6709h.m20990d(m21109c);
            throw e;
        }
    }

    @Keep
    public static Object getContent(URL url) throws IOException {
        return m21050a(new C6640j(url), C6623k.m21437e(), new C6637h());
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new C6705d((HttpsURLConnection) obj, new C6637h(), C6695b.m21109c(C6623k.m21437e()));
        }
        return obj instanceof HttpURLConnection ? new C6704c((HttpURLConnection) obj, new C6637h(), C6695b.m21109c(C6623k.m21437e())) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        return m21048c(new C6640j(url), C6623k.m21437e(), new C6637h());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        return m21049b(new C6640j(url), clsArr, C6623k.m21437e(), new C6637h());
    }
}
