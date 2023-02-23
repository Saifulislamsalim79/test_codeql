package io.grpc.p385i1.p386r;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
/* compiled from: ConnectionSpec.java */
/* renamed from: io.grpc.i1.r.b */
/* loaded from: classes2.dex */
public final class C9944b {

    /* renamed from: e */
    private static final EnumC9943a[] f23549e = {EnumC9943a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, EnumC9943a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, EnumC9943a.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, EnumC9943a.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, EnumC9943a.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, EnumC9943a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, EnumC9943a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, EnumC9943a.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, EnumC9943a.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, EnumC9943a.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, EnumC9943a.TLS_RSA_WITH_AES_128_GCM_SHA256, EnumC9943a.TLS_RSA_WITH_AES_128_CBC_SHA, EnumC9943a.TLS_RSA_WITH_AES_256_CBC_SHA, EnumC9943a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};

    /* renamed from: f */
    public static final C9944b f23550f;

    /* renamed from: a */
    final boolean f23551a;

    /* renamed from: b */
    private final String[] f23552b;

    /* renamed from: c */
    private final String[] f23553c;

    /* renamed from: d */
    final boolean f23554d;

    static {
        C9946b c9946b = new C9946b(true);
        c9946b.m13515f(f23549e);
        c9946b.m13512i(EnumC9960h.TLS_1_2, EnumC9960h.TLS_1_1, EnumC9960h.TLS_1_0);
        c9946b.m13513h(true);
        C9944b m13516e = c9946b.m13516e();
        f23550f = m13516e;
        C9946b c9946b2 = new C9946b(m13516e);
        c9946b2.m13512i(EnumC9960h.TLS_1_0);
        c9946b2.m13513h(true);
        c9946b2.m13516e();
        new C9946b(false).m13516e();
    }

    /* renamed from: e */
    private C9944b m13523e(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        if (this.f23552b != null) {
            strArr = (String[]) C9961i.m13469c(String.class, this.f23552b, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = null;
        }
        if (z && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (strArr == null) {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            int length = strArr.length + 1;
            String[] strArr2 = new String[length];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArr2[length - 1] = "TLS_FALLBACK_SCSV";
            strArr = strArr2;
        }
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        C9946b c9946b = new C9946b(this);
        c9946b.m13514g(strArr);
        c9946b.m13511j((String[]) C9961i.m13469c(String.class, this.f23553c, enabledProtocols));
        return c9946b.m13516e();
    }

    /* renamed from: c */
    public void m13525c(SSLSocket sSLSocket, boolean z) {
        C9944b m13523e = m13523e(sSLSocket, z);
        sSLSocket.setEnabledProtocols(m13523e.f23553c);
        String[] strArr = m13523e.f23552b;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    /* renamed from: d */
    public List<EnumC9943a> m13524d() {
        String[] strArr = this.f23552b;
        if (strArr == null) {
            return null;
        }
        EnumC9943a[] enumC9943aArr = new EnumC9943a[strArr.length];
        int i = 0;
        while (true) {
            String[] strArr2 = this.f23552b;
            if (i < strArr2.length) {
                enumC9943aArr[i] = EnumC9943a.m13528a(strArr2[i]);
                i++;
            } else {
                return C9961i.m13471a(enumC9943aArr);
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9944b) {
            if (obj == this) {
                return true;
            }
            C9944b c9944b = (C9944b) obj;
            boolean z = this.f23551a;
            if (z != c9944b.f23551a) {
                return false;
            }
            return !z || (Arrays.equals(this.f23552b, c9944b.f23552b) && Arrays.equals(this.f23553c, c9944b.f23553c) && this.f23554d == c9944b.f23554d);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m13522f() {
        return this.f23554d;
    }

    /* renamed from: g */
    public List<EnumC9960h> m13521g() {
        EnumC9960h[] enumC9960hArr = new EnumC9960h[this.f23553c.length];
        int i = 0;
        while (true) {
            String[] strArr = this.f23553c;
            if (i < strArr.length) {
                enumC9960hArr[i] = EnumC9960h.m13472a(strArr[i]);
                i++;
            } else {
                return C9961i.m13471a(enumC9960hArr);
            }
        }
    }

    public int hashCode() {
        if (this.f23551a) {
            return ((((527 + Arrays.hashCode(this.f23552b)) * 31) + Arrays.hashCode(this.f23553c)) * 31) + (!this.f23554d ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (this.f23551a) {
            List<EnumC9943a> m13524d = m13524d();
            String obj = m13524d == null ? "[use default]" : m13524d.toString();
            return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + m13521g() + ", supportsTlsExtensions=" + this.f23554d + ")";
        }
        return "ConnectionSpec()";
    }

    /* compiled from: ConnectionSpec.java */
    /* renamed from: io.grpc.i1.r.b$b */
    /* loaded from: classes2.dex */
    public static final class C9946b {

        /* renamed from: a */
        private boolean f23555a;

        /* renamed from: b */
        private String[] f23556b;

        /* renamed from: c */
        private String[] f23557c;

        /* renamed from: d */
        private boolean f23558d;

        public C9946b(boolean z) {
            this.f23555a = z;
        }

        /* renamed from: e */
        public C9944b m13516e() {
            return new C9944b(this);
        }

        /* renamed from: f */
        public C9946b m13515f(EnumC9943a... enumC9943aArr) {
            if (this.f23555a) {
                String[] strArr = new String[enumC9943aArr.length];
                for (int i = 0; i < enumC9943aArr.length; i++) {
                    strArr[i] = enumC9943aArr[i].f23548c;
                }
                this.f23556b = strArr;
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: g */
        public C9946b m13514g(String... strArr) {
            if (this.f23555a) {
                if (strArr == null) {
                    this.f23556b = null;
                } else {
                    this.f23556b = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: h */
        public C9946b m13513h(boolean z) {
            if (this.f23555a) {
                this.f23558d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: i */
        public C9946b m13512i(EnumC9960h... enumC9960hArr) {
            if (this.f23555a) {
                if (enumC9960hArr.length != 0) {
                    String[] strArr = new String[enumC9960hArr.length];
                    for (int i = 0; i < enumC9960hArr.length; i++) {
                        strArr[i] = enumC9960hArr[i].f23605c;
                    }
                    this.f23557c = strArr;
                    return this;
                }
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        /* renamed from: j */
        public C9946b m13511j(String... strArr) {
            if (this.f23555a) {
                if (strArr == null) {
                    this.f23557c = null;
                } else {
                    this.f23557c = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public C9946b(C9944b c9944b) {
            this.f23555a = c9944b.f23551a;
            this.f23556b = c9944b.f23552b;
            this.f23557c = c9944b.f23553c;
            this.f23558d = c9944b.f23554d;
        }
    }

    private C9944b(C9946b c9946b) {
        this.f23551a = c9946b.f23555a;
        this.f23552b = c9946b.f23556b;
        this.f23553c = c9946b.f23557c;
        this.f23554d = c9946b.f23558d;
    }
}
