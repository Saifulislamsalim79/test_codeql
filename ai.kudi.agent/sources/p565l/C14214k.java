package p565l;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p565l.p566g0.C14148c;
/* compiled from: ConnectionSpec.java */
/* renamed from: l.k */
/* loaded from: classes3.dex */
public final class C14214k {

    /* renamed from: e */
    private static final C14205h[] f31104e = {C14205h.f31081q, C14205h.f31082r, C14205h.f31083s, C14205h.f31084t, C14205h.f31085u, C14205h.f31075k, C14205h.f31077m, C14205h.f31076l, C14205h.f31078n, C14205h.f31080p, C14205h.f31079o};

    /* renamed from: f */
    private static final C14205h[] f31105f = {C14205h.f31081q, C14205h.f31082r, C14205h.f31083s, C14205h.f31084t, C14205h.f31085u, C14205h.f31075k, C14205h.f31077m, C14205h.f31076l, C14205h.f31078n, C14205h.f31080p, C14205h.f31079o, C14205h.f31073i, C14205h.f31074j, C14205h.f31071g, C14205h.f31072h, C14205h.f31069e, C14205h.f31070f, C14205h.f31068d};

    /* renamed from: g */
    public static final C14214k f31106g;

    /* renamed from: h */
    public static final C14214k f31107h;

    /* renamed from: a */
    final boolean f31108a;

    /* renamed from: b */
    final boolean f31109b;

    /* renamed from: c */
    final String[] f31110c;

    /* renamed from: d */
    final String[] f31111d;

    static {
        C14215a c14215a = new C14215a(true);
        c14215a.m2610c(f31104e);
        c14215a.m2607f(EnumC14142f0.TLS_1_3, EnumC14142f0.TLS_1_2);
        c14215a.m2609d(true);
        c14215a.m2612a();
        C14215a c14215a2 = new C14215a(true);
        c14215a2.m2610c(f31105f);
        c14215a2.m2607f(EnumC14142f0.TLS_1_3, EnumC14142f0.TLS_1_2, EnumC14142f0.TLS_1_1, EnumC14142f0.TLS_1_0);
        c14215a2.m2609d(true);
        f31106g = c14215a2.m2612a();
        C14215a c14215a3 = new C14215a(true);
        c14215a3.m2610c(f31105f);
        c14215a3.m2607f(EnumC14142f0.TLS_1_0);
        c14215a3.m2609d(true);
        c14215a3.m2612a();
        f31107h = new C14215a(false).m2612a();
    }

    C14214k(C14215a c14215a) {
        this.f31108a = c14215a.f31112a;
        this.f31110c = c14215a.f31113b;
        this.f31111d = c14215a.f31114c;
        this.f31109b = c14215a.f31115d;
    }

    /* renamed from: e */
    private C14214k m2615e(SSLSocket sSLSocket, boolean z) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.f31110c != null) {
            enabledCipherSuites = C14148c.m2782z(C14205h.f31066b, sSLSocket.getEnabledCipherSuites(), this.f31110c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f31111d != null) {
            enabledProtocols = C14148c.m2782z(C14148c.f30919o, sSLSocket.getEnabledProtocols(), this.f31111d);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int m2785w = C14148c.m2785w(C14205h.f31066b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && m2785w != -1) {
            enabledCipherSuites = C14148c.m2799i(enabledCipherSuites, supportedCipherSuites[m2785w]);
        }
        C14215a c14215a = new C14215a(this);
        c14215a.m2611b(enabledCipherSuites);
        c14215a.m2608e(enabledProtocols);
        return c14215a.m2612a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2619a(SSLSocket sSLSocket, boolean z) {
        C14214k m2615e = m2615e(sSLSocket, z);
        String[] strArr = m2615e.f31111d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = m2615e.f31110c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    /* renamed from: b */
    public List<C14205h> m2618b() {
        String[] strArr = this.f31110c;
        if (strArr != null) {
            return C14205h.m2634b(strArr);
        }
        return null;
    }

    /* renamed from: c */
    public boolean m2617c(SSLSocket sSLSocket) {
        if (this.f31108a) {
            String[] strArr = this.f31111d;
            if (strArr == null || C14148c.m2816B(C14148c.f30919o, strArr, sSLSocket.getEnabledProtocols())) {
                String[] strArr2 = this.f31110c;
                return strArr2 == null || C14148c.m2816B(C14205h.f31066b, strArr2, sSLSocket.getEnabledCipherSuites());
            }
            return false;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m2616d() {
        return this.f31108a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C14214k) {
            if (obj == this) {
                return true;
            }
            C14214k c14214k = (C14214k) obj;
            boolean z = this.f31108a;
            if (z != c14214k.f31108a) {
                return false;
            }
            return !z || (Arrays.equals(this.f31110c, c14214k.f31110c) && Arrays.equals(this.f31111d, c14214k.f31111d) && this.f31109b == c14214k.f31109b);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m2614f() {
        return this.f31109b;
    }

    /* renamed from: g */
    public List<EnumC14142f0> m2613g() {
        String[] strArr = this.f31111d;
        if (strArr != null) {
            return EnumC14142f0.m2827b(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f31108a) {
            return ((((527 + Arrays.hashCode(this.f31110c)) * 31) + Arrays.hashCode(this.f31111d)) * 31) + (!this.f31109b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (this.f31108a) {
            String obj = this.f31110c != null ? m2618b().toString() : "[all enabled]";
            String obj2 = this.f31111d != null ? m2613g().toString() : "[all enabled]";
            return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + obj2 + ", supportsTlsExtensions=" + this.f31109b + ")";
        }
        return "ConnectionSpec()";
    }

    /* compiled from: ConnectionSpec.java */
    /* renamed from: l.k$a */
    /* loaded from: classes3.dex */
    public static final class C14215a {

        /* renamed from: a */
        boolean f31112a;

        /* renamed from: b */
        String[] f31113b;

        /* renamed from: c */
        String[] f31114c;

        /* renamed from: d */
        boolean f31115d;

        C14215a(boolean z) {
            this.f31112a = z;
        }

        /* renamed from: a */
        public C14214k m2612a() {
            return new C14214k(this);
        }

        /* renamed from: b */
        public C14215a m2611b(String... strArr) {
            if (this.f31112a) {
                if (strArr.length != 0) {
                    this.f31113b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: c */
        public C14215a m2610c(C14205h... c14205hArr) {
            if (this.f31112a) {
                String[] strArr = new String[c14205hArr.length];
                for (int i = 0; i < c14205hArr.length; i++) {
                    strArr[i] = c14205hArr[i].f31086a;
                }
                m2611b(strArr);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: d */
        public C14215a m2609d(boolean z) {
            if (this.f31112a) {
                this.f31115d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: e */
        public C14215a m2608e(String... strArr) {
            if (this.f31112a) {
                if (strArr.length != 0) {
                    this.f31114c = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        /* renamed from: f */
        public C14215a m2607f(EnumC14142f0... enumC14142f0Arr) {
            if (this.f31112a) {
                String[] strArr = new String[enumC14142f0Arr.length];
                for (int i = 0; i < enumC14142f0Arr.length; i++) {
                    strArr[i] = enumC14142f0Arr[i].f30894c;
                }
                m2608e(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public C14215a(C14214k c14214k) {
            this.f31112a = c14214k.f31108a;
            this.f31113b = c14214k.f31110c;
            this.f31114c = c14214k.f31111d;
            this.f31115d = c14214k.f31109b;
        }
    }
}
