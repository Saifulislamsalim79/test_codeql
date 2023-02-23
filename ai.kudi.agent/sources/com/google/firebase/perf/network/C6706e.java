package com.google.firebase.perf.network;

import android.os.Build;
import com.google.firebase.perf.metrics.C6695b;
import com.google.firebase.perf.p176h.C6609a;
import com.google.firebase.perf.p178j.C6637h;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InstrURLConnectionBase.java */
/* renamed from: com.google.firebase.perf.network.e */
/* loaded from: classes2.dex */
public class C6706e {

    /* renamed from: f */
    private static final C6609a f16126f = C6609a.m21475e();

    /* renamed from: a */
    private final HttpURLConnection f16127a;

    /* renamed from: b */
    private final C6695b f16128b;

    /* renamed from: c */
    private long f16129c = -1;

    /* renamed from: d */
    private long f16130d = -1;

    /* renamed from: e */
    private final C6637h f16131e;

    public C6706e(HttpURLConnection httpURLConnection, C6637h c6637h, C6695b c6695b) {
        this.f16127a = httpURLConnection;
        this.f16128b = c6695b;
        this.f16131e = c6637h;
        c6695b.m21092t(httpURLConnection.getURL().toString());
    }

    /* renamed from: a0 */
    private void m21020a0() {
        if (this.f16129c == -1) {
            this.f16131e.m21398e();
            long m21399d = this.f16131e.m21399d();
            this.f16129c = m21399d;
            this.f16128b.m21098n(m21399d);
        }
        String m21042F = m21042F();
        if (m21042F != null) {
            this.f16128b.m21102j(m21042F);
        } else if (m21005o()) {
            this.f16128b.m21102j("POST");
        } else {
            this.f16128b.m21102j("GET");
        }
    }

    /* renamed from: A */
    public boolean m21047A() {
        return this.f16127a.getInstanceFollowRedirects();
    }

    /* renamed from: B */
    public long m21046B() {
        m21020a0();
        return this.f16127a.getLastModified();
    }

    /* renamed from: C */
    public OutputStream m21045C() throws IOException {
        try {
            return new C6703b(this.f16127a.getOutputStream(), this.f16128b, this.f16131e);
        } catch (IOException e) {
            this.f16128b.m21094r(this.f16131e.m21401b());
            C6709h.m20990d(this.f16128b);
            throw e;
        }
    }

    /* renamed from: D */
    public Permission m21044D() throws IOException {
        try {
            return this.f16127a.getPermission();
        } catch (IOException e) {
            this.f16128b.m21094r(this.f16131e.m21401b());
            C6709h.m20990d(this.f16128b);
            throw e;
        }
    }

    /* renamed from: E */
    public int m21043E() {
        return this.f16127a.getReadTimeout();
    }

    /* renamed from: F */
    public String m21042F() {
        return this.f16127a.getRequestMethod();
    }

    /* renamed from: G */
    public Map<String, List<String>> m21041G() {
        return this.f16127a.getRequestProperties();
    }

    /* renamed from: H */
    public String m21040H(String str) {
        return this.f16127a.getRequestProperty(str);
    }

    /* renamed from: I */
    public int m21039I() throws IOException {
        m21020a0();
        if (this.f16130d == -1) {
            long m21401b = this.f16131e.m21401b();
            this.f16130d = m21401b;
            this.f16128b.m21093s(m21401b);
        }
        try {
            int responseCode = this.f16127a.getResponseCode();
            this.f16128b.m21101k(responseCode);
            return responseCode;
        } catch (IOException e) {
            this.f16128b.m21094r(this.f16131e.m21401b());
            C6709h.m20990d(this.f16128b);
            throw e;
        }
    }

    /* renamed from: J */
    public String m21038J() throws IOException {
        m21020a0();
        if (this.f16130d == -1) {
            long m21401b = this.f16131e.m21401b();
            this.f16130d = m21401b;
            this.f16128b.m21093s(m21401b);
        }
        try {
            String responseMessage = this.f16127a.getResponseMessage();
            this.f16128b.m21101k(this.f16127a.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            this.f16128b.m21094r(this.f16131e.m21401b());
            C6709h.m20990d(this.f16128b);
            throw e;
        }
    }

    /* renamed from: K */
    public URL m21037K() {
        return this.f16127a.getURL();
    }

    /* renamed from: L */
    public boolean m21036L() {
        return this.f16127a.getUseCaches();
    }

    /* renamed from: M */
    public void m21035M(boolean z) {
        this.f16127a.setAllowUserInteraction(z);
    }

    /* renamed from: N */
    public void m21034N(int i) {
        this.f16127a.setChunkedStreamingMode(i);
    }

    /* renamed from: O */
    public void m21033O(int i) {
        this.f16127a.setConnectTimeout(i);
    }

    /* renamed from: P */
    public void m21032P(boolean z) {
        this.f16127a.setDefaultUseCaches(z);
    }

    /* renamed from: Q */
    public void m21031Q(boolean z) {
        this.f16127a.setDoInput(z);
    }

    /* renamed from: R */
    public void m21030R(boolean z) {
        this.f16127a.setDoOutput(z);
    }

    /* renamed from: S */
    public void m21029S(int i) {
        this.f16127a.setFixedLengthStreamingMode(i);
    }

    /* renamed from: T */
    public void m21028T(long j) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f16127a.setFixedLengthStreamingMode(j);
        }
    }

    /* renamed from: U */
    public void m21027U(long j) {
        this.f16127a.setIfModifiedSince(j);
    }

    /* renamed from: V */
    public void m21026V(boolean z) {
        this.f16127a.setInstanceFollowRedirects(z);
    }

    /* renamed from: W */
    public void m21025W(int i) {
        this.f16127a.setReadTimeout(i);
    }

    /* renamed from: X */
    public void m21024X(String str) throws ProtocolException {
        this.f16127a.setRequestMethod(str);
    }

    /* renamed from: Y */
    public void m21023Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f16128b.m21091u(str2);
        }
        this.f16127a.setRequestProperty(str, str2);
    }

    /* renamed from: Z */
    public void m21022Z(boolean z) {
        this.f16127a.setUseCaches(z);
    }

    /* renamed from: a */
    public void m21021a(String str, String str2) {
        this.f16127a.addRequestProperty(str, str2);
    }

    /* renamed from: b */
    public void m21019b() throws IOException {
        if (this.f16129c == -1) {
            this.f16131e.m21398e();
            long m21399d = this.f16131e.m21399d();
            this.f16129c = m21399d;
            this.f16128b.m21098n(m21399d);
        }
        try {
            this.f16127a.connect();
        } catch (IOException e) {
            this.f16128b.m21094r(this.f16131e.m21401b());
            C6709h.m20990d(this.f16128b);
            throw e;
        }
    }

    /* renamed from: b0 */
    public boolean m21018b0() {
        return this.f16127a.usingProxy();
    }

    /* renamed from: c */
    public void m21017c() {
        this.f16128b.m21094r(this.f16131e.m21401b());
        this.f16128b.m21110b();
        this.f16127a.disconnect();
    }

    /* renamed from: d */
    public boolean m21016d() {
        return this.f16127a.getAllowUserInteraction();
    }

    /* renamed from: e */
    public int m21015e() {
        return this.f16127a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f16127a.equals(obj);
    }

    /* renamed from: f */
    public Object m21014f() throws IOException {
        m21020a0();
        this.f16128b.m21101k(this.f16127a.getResponseCode());
        try {
            Object content = this.f16127a.getContent();
            if (content instanceof InputStream) {
                this.f16128b.m21097o(this.f16127a.getContentType());
                return new C6702a((InputStream) content, this.f16128b, this.f16131e);
            }
            this.f16128b.m21097o(this.f16127a.getContentType());
            this.f16128b.m21096p(this.f16127a.getContentLength());
            this.f16128b.m21094r(this.f16131e.m21401b());
            this.f16128b.m21110b();
            return content;
        } catch (IOException e) {
            this.f16128b.m21094r(this.f16131e.m21401b());
            C6709h.m20990d(this.f16128b);
            throw e;
        }
    }

    /* renamed from: g */
    public Object m21013g(Class[] clsArr) throws IOException {
        m21020a0();
        this.f16128b.m21101k(this.f16127a.getResponseCode());
        try {
            Object content = this.f16127a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f16128b.m21097o(this.f16127a.getContentType());
                return new C6702a((InputStream) content, this.f16128b, this.f16131e);
            }
            this.f16128b.m21097o(this.f16127a.getContentType());
            this.f16128b.m21096p(this.f16127a.getContentLength());
            this.f16128b.m21094r(this.f16131e.m21401b());
            this.f16128b.m21110b();
            return content;
        } catch (IOException e) {
            this.f16128b.m21094r(this.f16131e.m21401b());
            C6709h.m20990d(this.f16128b);
            throw e;
        }
    }

    /* renamed from: h */
    public String m21012h() {
        m21020a0();
        return this.f16127a.getContentEncoding();
    }

    public int hashCode() {
        return this.f16127a.hashCode();
    }

    /* renamed from: i */
    public int m21011i() {
        m21020a0();
        return this.f16127a.getContentLength();
    }

    /* renamed from: j */
    public long m21010j() {
        m21020a0();
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f16127a.getContentLengthLong();
        }
        return 0L;
    }

    /* renamed from: k */
    public String m21009k() {
        m21020a0();
        return this.f16127a.getContentType();
    }

    /* renamed from: l */
    public long m21008l() {
        m21020a0();
        return this.f16127a.getDate();
    }

    /* renamed from: m */
    public boolean m21007m() {
        return this.f16127a.getDefaultUseCaches();
    }

    /* renamed from: n */
    public boolean m21006n() {
        return this.f16127a.getDoInput();
    }

    /* renamed from: o */
    public boolean m21005o() {
        return this.f16127a.getDoOutput();
    }

    /* renamed from: p */
    public InputStream m21004p() {
        m21020a0();
        try {
            this.f16128b.m21101k(this.f16127a.getResponseCode());
        } catch (IOException unused) {
            f16126f.m21479a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f16127a.getErrorStream();
        return errorStream != null ? new C6702a(errorStream, this.f16128b, this.f16131e) : errorStream;
    }

    /* renamed from: q */
    public long m21003q() {
        m21020a0();
        return this.f16127a.getExpiration();
    }

    /* renamed from: r */
    public String m21002r(int i) {
        m21020a0();
        return this.f16127a.getHeaderField(i);
    }

    /* renamed from: s */
    public String m21001s(String str) {
        m21020a0();
        return this.f16127a.getHeaderField(str);
    }

    /* renamed from: t */
    public long m21000t(String str, long j) {
        m21020a0();
        return this.f16127a.getHeaderFieldDate(str, j);
    }

    public String toString() {
        return this.f16127a.toString();
    }

    /* renamed from: u */
    public int m20999u(String str, int i) {
        m21020a0();
        return this.f16127a.getHeaderFieldInt(str, i);
    }

    /* renamed from: v */
    public String m20998v(int i) {
        m21020a0();
        return this.f16127a.getHeaderFieldKey(i);
    }

    /* renamed from: w */
    public long m20997w(String str, long j) {
        m21020a0();
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f16127a.getHeaderFieldLong(str, j);
        }
        return 0L;
    }

    /* renamed from: x */
    public Map<String, List<String>> m20996x() {
        m21020a0();
        return this.f16127a.getHeaderFields();
    }

    /* renamed from: y */
    public long m20995y() {
        return this.f16127a.getIfModifiedSince();
    }

    /* renamed from: z */
    public InputStream m20994z() throws IOException {
        m21020a0();
        this.f16128b.m21101k(this.f16127a.getResponseCode());
        this.f16128b.m21097o(this.f16127a.getContentType());
        try {
            return new C6702a(this.f16127a.getInputStream(), this.f16128b, this.f16131e);
        } catch (IOException e) {
            this.f16128b.m21094r(this.f16131e.m21401b());
            C6709h.m20990d(this.f16128b);
            throw e;
        }
    }
}
