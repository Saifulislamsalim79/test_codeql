package p565l.p574h0;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import p565l.AbstractC14120b0;
import p565l.AbstractC14135d0;
import p565l.C14116a0;
import p565l.C14131c0;
import p565l.C14229s;
import p565l.C14235v;
import p565l.EnumC14242y;
import p565l.InterfaceC14211i;
import p565l.InterfaceC14233u;
import p565l.p566g0.p568f.C14172e;
import p565l.p566g0.p571i.C14198f;
import p576m.C14342c;
import p576m.InterfaceC14346e;
/* compiled from: HttpLoggingInterceptor.java */
/* renamed from: l.h0.a */
/* loaded from: classes3.dex */
public final class C14207a implements InterfaceC14233u {

    /* renamed from: c */
    private static final Charset f31087c = Charset.forName("UTF-8");

    /* renamed from: a */
    private final InterfaceC14209b f31088a;

    /* renamed from: b */
    private volatile EnumC14208a f31089b;

    /* compiled from: HttpLoggingInterceptor.java */
    /* renamed from: l.h0.a$a */
    /* loaded from: classes3.dex */
    public enum EnumC14208a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* compiled from: HttpLoggingInterceptor.java */
    /* renamed from: l.h0.a$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC14209b {

        /* renamed from: a */
        public static final InterfaceC14209b f31095a = new C14210a();

        /* compiled from: HttpLoggingInterceptor.java */
        /* renamed from: l.h0.a$b$a */
        /* loaded from: classes3.dex */
        final class C14210a implements InterfaceC14209b {
            C14210a() {
            }

            @Override // p565l.p574h0.C14207a.InterfaceC14209b
            /* renamed from: a */
            public void mo2626a(String str) {
                C14198f.m2653j().mo2646q(4, str, null);
            }
        }

        /* renamed from: a */
        void mo2626a(String str);
    }

    public C14207a() {
        this(InterfaceC14209b.f31095a);
    }

    /* renamed from: a */
    private boolean m2629a(C14229s c14229s) {
        String m2550c = c14229s.m2550c("Content-Encoding");
        return (m2550c == null || m2550c.equalsIgnoreCase("identity")) ? false : true;
    }

    /* renamed from: b */
    static boolean m2628b(C14342c c14342c) {
        try {
            C14342c c14342c2 = new C14342c();
            c14342c.m2070I(c14342c2, 0L, c14342c.m2072F0() < 64 ? c14342c.m2072F0() : 64L);
            for (int i = 0; i < 16; i++) {
                if (c14342c2.mo1987l()) {
                    return true;
                }
                int m2075A0 = c14342c2.m2075A0();
                if (Character.isISOControl(m2075A0) && !Character.isWhitespace(m2075A0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public C14207a m2627c(EnumC14208a enumC14208a) {
        if (enumC14208a != null) {
            this.f31089b = enumC14208a;
            return this;
        }
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }

    @Override // p565l.InterfaceC14233u
    public C14131c0 intercept(InterfaceC14233u.InterfaceC14234a interfaceC14234a) throws IOException {
        boolean z;
        C14229s m2883P;
        boolean z2;
        EnumC14208a enumC14208a = this.f31089b;
        C14116a0 request = interfaceC14234a.request();
        if (enumC14208a == EnumC14208a.NONE) {
            return interfaceC14234a.mo2478a(request);
        }
        boolean z3 = enumC14208a == EnumC14208a.BODY;
        boolean z4 = z3 || enumC14208a == EnumC14208a.HEADERS;
        AbstractC14120b0 m2921a = request.m2921a();
        boolean z5 = m2921a != null;
        InterfaceC14211i connection = interfaceC14234a.connection();
        String str = "--> " + request.m2915g() + ' ' + request.m2913i() + ' ' + (connection != null ? connection.protocol() : EnumC14242y.HTTP_1_1);
        if (!z4 && z5) {
            str = str + " (" + m2921a.contentLength() + "-byte body)";
        }
        this.f31088a.mo2626a(str);
        if (z4) {
            if (z5) {
                if (m2921a.contentType() != null) {
                    this.f31088a.mo2626a("Content-Type: " + m2921a.contentType());
                }
                if (m2921a.contentLength() != -1) {
                    this.f31088a.mo2626a("Content-Length: " + m2921a.contentLength());
                }
            }
            C14229s m2917e = request.m2917e();
            int m2545h = m2917e.m2545h();
            int i = 0;
            while (i < m2545h) {
                String m2548e = m2917e.m2548e(i);
                int i2 = m2545h;
                if ("Content-Type".equalsIgnoreCase(m2548e) || "Content-Length".equalsIgnoreCase(m2548e)) {
                    z2 = z4;
                } else {
                    z2 = z4;
                    this.f31088a.mo2626a(m2548e + ": " + m2917e.m2544i(i));
                }
                i++;
                m2545h = i2;
                z4 = z2;
            }
            z = z4;
            if (z3 && z5) {
                if (m2629a(request.m2917e())) {
                    this.f31088a.mo2626a("--> END " + request.m2915g() + " (encoded body omitted)");
                } else {
                    C14342c c14342c = new C14342c();
                    m2921a.writeTo(c14342c);
                    Charset charset = f31087c;
                    C14235v contentType = m2921a.contentType();
                    if (contentType != null) {
                        charset = contentType.m2476b(f31087c);
                    }
                    this.f31088a.mo2626a("");
                    if (m2628b(c14342c)) {
                        this.f31088a.mo2626a(c14342c.mo1983s(charset));
                        this.f31088a.mo2626a("--> END " + request.m2915g() + " (" + m2921a.contentLength() + "-byte body)");
                    } else {
                        this.f31088a.mo2626a("--> END " + request.m2915g() + " (binary " + m2921a.contentLength() + "-byte body omitted)");
                    }
                }
            } else {
                this.f31088a.mo2626a("--> END " + request.m2915g());
            }
        } else {
            z = z4;
        }
        long nanoTime = System.nanoTime();
        try {
            C14131c0 mo2478a = interfaceC14234a.mo2478a(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            AbstractC14135d0 m2878c = mo2478a.m2878c();
            long mo309m = m2878c.mo309m();
            String str2 = mo309m != -1 ? mo309m + "-byte" : "unknown-length";
            InterfaceC14209b interfaceC14209b = this.f31088a;
            StringBuilder sb = new StringBuilder();
            sb.append("<-- ");
            sb.append(mo2478a.m2887F());
            sb.append(' ');
            sb.append(mo2478a.m2881X());
            sb.append(' ');
            sb.append(mo2478a.m2873k0().m2913i());
            sb.append(" (");
            sb.append(millis);
            sb.append("ms");
            sb.append(z ? "" : ", " + str2 + " body");
            sb.append(')');
            interfaceC14209b.mo2626a(sb.toString());
            if (z) {
                int m2545h2 = mo2478a.m2883P().m2545h();
                for (int i3 = 0; i3 < m2545h2; i3++) {
                    this.f31088a.mo2626a(m2883P.m2548e(i3) + ": " + m2883P.m2544i(i3));
                }
                if (z3 && C14172e.m2727c(mo2478a)) {
                    if (m2629a(mo2478a.m2883P())) {
                        this.f31088a.mo2626a("<-- END HTTP (encoded body omitted)");
                    } else {
                        InterfaceC14346e mo310O = m2878c.mo310O();
                        mo310O.mo1991e(Long.MAX_VALUE);
                        C14342c mo1992d = mo310O.mo1992d();
                        Charset charset2 = f31087c;
                        C14235v mo311F = m2878c.mo311F();
                        if (mo311F != null) {
                            charset2 = mo311F.m2476b(f31087c);
                        }
                        if (!m2628b(mo1992d)) {
                            this.f31088a.mo2626a("");
                            this.f31088a.mo2626a("<-- END HTTP (binary " + mo1992d.m2072F0() + "-byte body omitted)");
                            return mo2478a;
                        }
                        if (mo309m != 0) {
                            this.f31088a.mo2626a("");
                            this.f31088a.mo2626a(mo1992d.clone().mo1983s(charset2));
                        }
                        this.f31088a.mo2626a("<-- END HTTP (" + mo1992d.m2072F0() + "-byte body)");
                    }
                } else {
                    this.f31088a.mo2626a("<-- END HTTP");
                }
            }
            return mo2478a;
        } catch (Exception e) {
            this.f31088a.mo2626a("<-- HTTP FAILED: " + e);
            throw e;
        }
    }

    public C14207a(InterfaceC14209b interfaceC14209b) {
        this.f31089b = EnumC14208a.NONE;
        this.f31088a = interfaceC14209b;
    }
}
