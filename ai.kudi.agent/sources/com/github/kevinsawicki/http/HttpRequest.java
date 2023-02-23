package com.github.kevinsawicki.http;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
/* loaded from: classes2.dex */
public class HttpRequest {

    /* renamed from: k */
    private static InterfaceC2416a f6952k = InterfaceC2416a.f6963a;

    /* renamed from: b */
    private final URL f6954b;

    /* renamed from: c */
    private final String f6955c;

    /* renamed from: d */
    private C2418b f6956d;

    /* renamed from: e */
    private boolean f6957e;

    /* renamed from: i */
    private String f6961i;

    /* renamed from: j */
    private int f6962j;

    /* renamed from: a */
    private HttpURLConnection f6953a = null;

    /* renamed from: f */
    private boolean f6958f = true;

    /* renamed from: g */
    private boolean f6959g = false;

    /* renamed from: h */
    private int f6960h = 8192;

    /* loaded from: classes2.dex */
    public static class HttpRequestException extends RuntimeException {
        public HttpRequestException(IOException iOException) {
            super(iOException);
        }

        @Override // java.lang.Throwable
        /* renamed from: a */
        public IOException getCause() {
            return (IOException) super.getCause();
        }
    }

    /* renamed from: com.github.kevinsawicki.http.HttpRequest$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC2416a {

        /* renamed from: a */
        public static final InterfaceC2416a f6963a = new C2417a();

        /* renamed from: com.github.kevinsawicki.http.HttpRequest$a$a */
        /* loaded from: classes2.dex */
        static class C2417a implements InterfaceC2416a {
            C2417a() {
            }

            @Override // com.github.kevinsawicki.http.HttpRequest.InterfaceC2416a
            /* renamed from: a */
            public HttpURLConnection mo32907a(URL url, Proxy proxy) throws IOException {
                return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection(proxy)));
            }

            @Override // com.github.kevinsawicki.http.HttpRequest.InterfaceC2416a
            /* renamed from: b */
            public HttpURLConnection mo32906b(URL url) throws IOException {
                return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            }
        }

        /* renamed from: a */
        HttpURLConnection mo32907a(URL url, Proxy proxy) throws IOException;

        /* renamed from: b */
        HttpURLConnection mo32906b(URL url) throws IOException;
    }

    /* renamed from: com.github.kevinsawicki.http.HttpRequest$b */
    /* loaded from: classes2.dex */
    public static class C2418b extends BufferedOutputStream {
        /* renamed from: c */
        public C2418b m32905c(String str) throws IOException {
            throw null;
        }
    }

    /* renamed from: com.github.kevinsawicki.http.HttpRequest$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC2419c {

        /* renamed from: a */
        public static final InterfaceC2419c f6964a = new C2420a();

        /* renamed from: com.github.kevinsawicki.http.HttpRequest$c$a */
        /* loaded from: classes2.dex */
        static class C2420a implements InterfaceC2419c {
            C2420a() {
            }
        }
    }

    public HttpRequest(CharSequence charSequence, String str) throws HttpRequestException {
        InterfaceC2419c interfaceC2419c = InterfaceC2419c.f6964a;
        try {
            this.f6954b = new URL(charSequence.toString());
            this.f6955c = str;
        } catch (MalformedURLException e) {
            throw new HttpRequestException(e);
        }
    }

    /* renamed from: g */
    private HttpURLConnection m32919g() {
        HttpURLConnection mo32906b;
        try {
            if (this.f6961i != null) {
                mo32906b = f6952k.mo32907a(this.f6954b, m32918h());
            } else {
                mo32906b = f6952k.mo32906b(this.f6954b);
            }
            mo32906b.setRequestMethod(this.f6955c);
            return mo32906b;
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    /* renamed from: h */
    private Proxy m32918h() {
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.f6961i, this.f6962j));
    }

    /* renamed from: i */
    public static HttpRequest m32917i(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, "GET");
    }

    /* renamed from: a */
    public BufferedInputStream m32925a() throws HttpRequestException {
        return new BufferedInputStream(m32910p(), this.f6960h);
    }

    /* renamed from: b */
    protected HttpRequest m32924b() throws IOException {
        m32911o(null);
        C2418b c2418b = this.f6956d;
        if (c2418b == null) {
            return this;
        }
        if (!this.f6957e) {
            if (this.f6958f) {
                try {
                    c2418b.close();
                } catch (IOException unused) {
                }
            } else {
                c2418b.close();
            }
            this.f6956d = null;
            return this;
        }
        c2418b.m32905c("\r\n--00content0boundary00--\r\n");
        throw null;
    }

    /* renamed from: c */
    protected HttpRequest m32923c() throws HttpRequestException {
        try {
            m32924b();
            return this;
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    /* renamed from: d */
    public int m32922d() throws HttpRequestException {
        try {
            m32924b();
            return m32916j().getResponseCode();
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    /* renamed from: e */
    public String m32921e() {
        return m32915k("Content-Encoding");
    }

    /* renamed from: f */
    public int m32920f() {
        return m32914l("Content-Length");
    }

    /* renamed from: j */
    public HttpURLConnection m32916j() {
        if (this.f6953a == null) {
            this.f6953a = m32919g();
        }
        return this.f6953a;
    }

    /* renamed from: k */
    public String m32915k(String str) throws HttpRequestException {
        m32923c();
        return m32916j().getHeaderField(str);
    }

    /* renamed from: l */
    public int m32914l(String str) throws HttpRequestException {
        return m32913m(str, -1);
    }

    /* renamed from: m */
    public int m32913m(String str, int i) throws HttpRequestException {
        m32923c();
        return m32916j().getHeaderFieldInt(str, i);
    }

    /* renamed from: n */
    public String m32912n() {
        return m32916j().getRequestMethod();
    }

    /* renamed from: o */
    public HttpRequest m32911o(InterfaceC2419c interfaceC2419c) {
        if (interfaceC2419c == null) {
            InterfaceC2419c interfaceC2419c2 = InterfaceC2419c.f6964a;
        }
        return this;
    }

    /* renamed from: p */
    public InputStream m32910p() throws HttpRequestException {
        InputStream inputStream;
        if (m32922d() < 400) {
            try {
                inputStream = m32916j().getInputStream();
            } catch (IOException e) {
                throw new HttpRequestException(e);
            }
        } else {
            inputStream = m32916j().getErrorStream();
            if (inputStream == null) {
                try {
                    inputStream = m32916j().getInputStream();
                } catch (IOException e2) {
                    if (m32920f() <= 0) {
                        inputStream = new ByteArrayInputStream(new byte[0]);
                    } else {
                        throw new HttpRequestException(e2);
                    }
                }
            }
        }
        if (this.f6959g && "gzip".equals(m32921e())) {
            try {
                return new GZIPInputStream(inputStream);
            } catch (IOException e3) {
                throw new HttpRequestException(e3);
            }
        }
        return inputStream;
    }

    /* renamed from: q */
    public URL m32909q() {
        return m32916j().getURL();
    }

    public String toString() {
        return m32912n() + ' ' + m32909q();
    }
}
