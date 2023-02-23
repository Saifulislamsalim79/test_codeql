package p565l.p566g0.p571i;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p565l.EnumC14242y;
import p565l.p566g0.C14148c;
import p565l.p566g0.p573k.AbstractC14202c;
import p565l.p566g0.p573k.InterfaceC14204e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidPlatform.java */
/* renamed from: l.g0.i.a */
/* loaded from: classes3.dex */
public class C14189a extends C14198f {

    /* renamed from: c */
    private final C14197e<Socket> f31036c;

    /* renamed from: d */
    private final C14197e<Socket> f31037d;

    /* renamed from: e */
    private final C14197e<Socket> f31038e;

    /* renamed from: f */
    private final C14197e<Socket> f31039f;

    /* renamed from: g */
    private final C14192c f31040g = C14192c.m2675b();

    /* compiled from: AndroidPlatform.java */
    /* renamed from: l.g0.i.a$a */
    /* loaded from: classes3.dex */
    static final class C14190a extends AbstractC14202c {

        /* renamed from: a */
        private final Object f31041a;

        /* renamed from: b */
        private final Method f31042b;

        C14190a(Object obj, Method method) {
            this.f31041a = obj;
            this.f31042b = method;
        }

        @Override // p565l.p566g0.p573k.AbstractC14202c
        /* renamed from: a */
        public List<Certificate> mo2643a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f31042b.invoke(this.f31041a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C14190a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* compiled from: AndroidPlatform.java */
    /* renamed from: l.g0.i.a$b */
    /* loaded from: classes3.dex */
    static final class C14191b implements InterfaceC14204e {

        /* renamed from: a */
        private final X509TrustManager f31043a;

        /* renamed from: b */
        private final Method f31044b;

        C14191b(X509TrustManager x509TrustManager, Method method) {
            this.f31044b = method;
            this.f31043a = x509TrustManager;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C14191b) {
                C14191b c14191b = (C14191b) obj;
                return this.f31043a.equals(c14191b.f31043a) && this.f31044b.equals(c14191b.f31044b);
            }
            return false;
        }

        @Override // p565l.p566g0.p573k.InterfaceC14204e
        public X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f31044b.invoke(this.f31043a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e) {
                throw C14148c.m2806b("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public int hashCode() {
            return this.f31043a.hashCode() + (this.f31044b.hashCode() * 31);
        }
    }

    /* compiled from: AndroidPlatform.java */
    /* renamed from: l.g0.i.a$c */
    /* loaded from: classes3.dex */
    static final class C14192c {

        /* renamed from: a */
        private final Method f31045a;

        /* renamed from: b */
        private final Method f31046b;

        /* renamed from: c */
        private final Method f31047c;

        C14192c(Method method, Method method2, Method method3) {
            this.f31045a = method;
            this.f31046b = method2;
            this.f31047c = method3;
        }

        /* renamed from: b */
        static C14192c m2675b() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new C14192c(method3, method2, method);
        }

        /* renamed from: a */
        Object m2676a(String str) {
            Method method = this.f31045a;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.f31046b.invoke(invoke, str);
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* renamed from: c */
        boolean m2674c(Object obj) {
            if (obj != null) {
                try {
                    this.f31047c.invoke(obj, new Object[0]);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
            return false;
        }
    }

    C14189a(Class<?> cls, C14197e<Socket> c14197e, C14197e<Socket> c14197e2, C14197e<Socket> c14197e3, C14197e<Socket> c14197e4) {
        this.f31036c = c14197e;
        this.f31037d = c14197e2;
        this.f31038e = c14197e3;
        this.f31039f = c14197e4;
    }

    /* renamed from: s */
    private boolean m2680s(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo2648o(str);
        }
    }

    /* renamed from: t */
    private boolean m2679t(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m2680s(str, cls, obj);
        }
    }

    /* renamed from: u */
    public static C14198f m2678u() {
        Class<?> cls;
        C14197e c14197e;
        C14197e c14197e2;
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Class<?> cls2 = cls;
            C14197e c14197e3 = new C14197e(null, "setUseSessionTickets", Boolean.TYPE);
            C14197e c14197e4 = new C14197e(null, "setHostname", String.class);
            if (m2677v()) {
                C14197e c14197e5 = new C14197e(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                c14197e2 = new C14197e(null, "setAlpnProtocols", byte[].class);
                c14197e = c14197e5;
            } else {
                c14197e = null;
                c14197e2 = null;
            }
            return new C14189a(cls2, c14197e3, c14197e4, c14197e, c14197e2);
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    /* renamed from: v */
    private static boolean m2677v() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // p565l.p566g0.p571i.C14198f
    /* renamed from: c */
    public AbstractC14202c mo2660c(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C14190a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.mo2660c(x509TrustManager);
        }
    }

    @Override // p565l.p566g0.p571i.C14198f
    /* renamed from: d */
    public InterfaceC14204e mo2659d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C14191b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo2659d(x509TrustManager);
        }
    }

    @Override // p565l.p566g0.p571i.C14198f
    /* renamed from: g */
    public void mo2656g(SSLSocket sSLSocket, String str, List<EnumC14242y> list) {
        if (str != null) {
            this.f31036c.m2665e(sSLSocket, Boolean.TRUE);
            this.f31037d.m2665e(sSLSocket, str);
        }
        C14197e<Socket> c14197e = this.f31039f;
        if (c14197e == null || !c14197e.m2663g(sSLSocket)) {
            return;
        }
        this.f31039f.m2664f(sSLSocket, C14198f.m2658e(list));
    }

    @Override // p565l.p566g0.p571i.C14198f
    /* renamed from: h */
    public void mo2655h(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!C14148c.m2817A(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e2);
                throw iOException;
            }
            throw e2;
        } catch (SecurityException e3) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e3);
            throw iOException2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000b, code lost:
        if (android.os.Build.VERSION.SDK_INT < 22) goto L8;
     */
    @Override // p565l.p566g0.p571i.C14198f
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public javax.net.ssl.SSLContext mo2651l() {
        /*
            r3 = this;
            r0 = 1
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoClassDefFoundError -> L10
            r2 = 16
            if (r1 < r2) goto Le
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoClassDefFoundError -> L10
            r2 = 22
            if (r1 >= r2) goto Le
            goto L11
        Le:
            r0 = 0
            goto L11
        L10:
        L11:
            if (r0 == 0) goto L1a
            java.lang.String r0 = "TLSv1.2"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L1a
            return r0
        L1a:
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L21
            return r0
        L21:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No TLS provider"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p565l.p566g0.p571i.C14189a.mo2651l():javax.net.ssl.SSLContext");
    }

    @Override // p565l.p566g0.p571i.C14198f
    /* renamed from: m */
    public String mo2650m(SSLSocket sSLSocket) {
        byte[] bArr;
        C14197e<Socket> c14197e = this.f31038e;
        if (c14197e == null || !c14197e.m2663g(sSLSocket) || (bArr = (byte[]) this.f31038e.m2664f(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, C14148c.f30913i);
    }

    @Override // p565l.p566g0.p571i.C14198f
    /* renamed from: n */
    public Object mo2649n(String str) {
        return this.f31040g.m2676a(str);
    }

    @Override // p565l.p566g0.p571i.C14198f
    /* renamed from: o */
    public boolean mo2648o(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m2679t(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo2648o(str);
        } catch (IllegalAccessException e) {
            e = e;
            throw C14148c.m2806b("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw C14148c.m2806b("unable to determine cleartext support", e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw C14148c.m2806b("unable to determine cleartext support", e);
        }
    }

    @Override // p565l.p566g0.p571i.C14198f
    /* renamed from: q */
    public void mo2646q(int i, String str, Throwable th) {
        int min;
        int i2 = i != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    @Override // p565l.p566g0.p571i.C14198f
    /* renamed from: r */
    public void mo2645r(String str, Object obj) {
        if (this.f31040g.m2674c(obj)) {
            return;
        }
        mo2646q(5, str, null);
    }
}
