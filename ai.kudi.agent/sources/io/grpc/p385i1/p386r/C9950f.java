package io.grpc.p385i1.p386r;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p576m.C14342c;
/* compiled from: Platform.java */
/* renamed from: io.grpc.i1.r.f */
/* loaded from: classes2.dex */
public class C9950f {

    /* renamed from: b */
    public static final Logger f23571b = Logger.getLogger(C9950f.class.getName());

    /* renamed from: c */
    private static final String[] f23572c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: d */
    private static final C9950f f23573d = m13488d();

    /* renamed from: a */
    private final Provider f23574a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Platform.java */
    /* renamed from: io.grpc.i1.r.f$a */
    /* loaded from: classes2.dex */
    public class C9951a implements PrivilegedExceptionAction<Method> {
        C9951a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Method run() throws Exception {
            return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Platform.java */
    /* renamed from: io.grpc.i1.r.f$b */
    /* loaded from: classes2.dex */
    public class C9952b implements PrivilegedExceptionAction<Method> {
        C9952b() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Method run() throws Exception {
            return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Platform.java */
    /* renamed from: io.grpc.i1.r.f$c */
    /* loaded from: classes2.dex */
    public class C9953c implements PrivilegedExceptionAction<Method> {
        C9953c() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Method run() throws Exception {
            return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Platform.java */
    /* renamed from: io.grpc.i1.r.f$d */
    /* loaded from: classes2.dex */
    public static class C9954d extends C9950f {

        /* renamed from: e */
        private final C9949e<Socket> f23575e;

        /* renamed from: f */
        private final C9949e<Socket> f23576f;

        /* renamed from: g */
        private final C9949e<Socket> f23577g;

        /* renamed from: h */
        private final C9949e<Socket> f23578h;

        /* renamed from: i */
        private final EnumC9958h f23579i;

        public C9954d(C9949e<Socket> c9949e, C9949e<Socket> c9949e2, Method method, Method method2, C9949e<Socket> c9949e3, C9949e<Socket> c9949e4, Provider provider, EnumC9958h enumC9958h) {
            super(provider);
            this.f23575e = c9949e;
            this.f23576f = c9949e2;
            this.f23577g = c9949e3;
            this.f23578h = c9949e4;
            this.f23579i = enumC9958h;
        }

        @Override // io.grpc.p385i1.p386r.C9950f
        /* renamed from: c */
        public void mo13478c(SSLSocket sSLSocket, String str, List<EnumC9959g> list) {
            if (str != null) {
                this.f23575e.m13492e(sSLSocket, Boolean.TRUE);
                this.f23576f.m13492e(sSLSocket, str);
            }
            if (this.f23578h.m13490g(sSLSocket)) {
                this.f23578h.m13491f(sSLSocket, C9950f.m13489b(list));
            }
        }

        @Override // io.grpc.p385i1.p386r.C9950f
        /* renamed from: h */
        public String mo13477h(SSLSocket sSLSocket) {
            byte[] bArr;
            if (this.f23577g.m13490g(sSLSocket) && (bArr = (byte[]) this.f23577g.m13491f(sSLSocket, new Object[0])) != null) {
                return new String(bArr, C9961i.f23607b);
            }
            return null;
        }

        @Override // io.grpc.p385i1.p386r.C9950f
        /* renamed from: i */
        public EnumC9958h mo13476i() {
            return this.f23579i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Platform.java */
    /* renamed from: io.grpc.i1.r.f$e */
    /* loaded from: classes2.dex */
    public static class C9955e extends C9950f {

        /* renamed from: e */
        private final Method f23580e;

        /* renamed from: f */
        private final Method f23581f;

        /* synthetic */ C9955e(Provider provider, Method method, Method method2, C9951a c9951a) {
            this(provider, method, method2);
        }

        @Override // io.grpc.p385i1.p386r.C9950f
        /* renamed from: c */
        public void mo13478c(SSLSocket sSLSocket, String str, List<EnumC9959g> list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            for (EnumC9959g enumC9959g : list) {
                if (enumC9959g != EnumC9959g.HTTP_1_0) {
                    arrayList.add(enumC9959g.toString());
                }
            }
            try {
                this.f23580e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // io.grpc.p385i1.p386r.C9950f
        /* renamed from: h */
        public String mo13477h(SSLSocket sSLSocket) {
            try {
                return (String) this.f23581f.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // io.grpc.p385i1.p386r.C9950f
        /* renamed from: i */
        public EnumC9958h mo13476i() {
            return EnumC9958h.ALPN_AND_NPN;
        }

        private C9955e(Provider provider, Method method, Method method2) {
            super(provider);
            this.f23580e = method;
            this.f23581f = method2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Platform.java */
    /* renamed from: io.grpc.i1.r.f$f */
    /* loaded from: classes2.dex */
    public static class C9956f extends C9950f {

        /* renamed from: e */
        private final Method f23582e;

        /* renamed from: f */
        private final Method f23583f;

        /* renamed from: g */
        private final Method f23584g;

        /* renamed from: h */
        private final Class<?> f23585h;

        /* renamed from: i */
        private final Class<?> f23586i;

        public C9956f(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2, Provider provider) {
            super(provider);
            this.f23582e = method;
            this.f23583f = method2;
            this.f23584g = method3;
            this.f23585h = cls;
            this.f23586i = cls2;
        }

        @Override // io.grpc.p385i1.p386r.C9950f
        /* renamed from: a */
        public void mo13479a(SSLSocket sSLSocket) {
            try {
                this.f23584g.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e) {
                C9950f.f23571b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e);
            }
        }

        @Override // io.grpc.p385i1.p386r.C9950f
        /* renamed from: c */
        public void mo13478c(SSLSocket sSLSocket, String str, List<EnumC9959g> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                EnumC9959g enumC9959g = list.get(i);
                if (enumC9959g != EnumC9959g.HTTP_1_0) {
                    arrayList.add(enumC9959g.toString());
                }
            }
            try {
                this.f23582e.invoke(null, sSLSocket, Proxy.newProxyInstance(C9950f.class.getClassLoader(), new Class[]{this.f23585h, this.f23586i}, new C9957g(arrayList)));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // io.grpc.p385i1.p386r.C9950f
        /* renamed from: h */
        public String mo13477h(SSLSocket sSLSocket) {
            try {
                C9957g c9957g = (C9957g) Proxy.getInvocationHandler(this.f23583f.invoke(null, sSLSocket));
                if (c9957g.f23588b || c9957g.f23589c != null) {
                    if (c9957g.f23588b) {
                        return null;
                    }
                    return c9957g.f23589c;
                }
                C9950f.f23571b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // io.grpc.p385i1.p386r.C9950f
        /* renamed from: i */
        public EnumC9958h mo13476i() {
            return EnumC9958h.ALPN_AND_NPN;
        }
    }

    /* compiled from: Platform.java */
    /* renamed from: io.grpc.i1.r.f$g */
    /* loaded from: classes2.dex */
    private static class C9957g implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f23587a;

        /* renamed from: b */
        private boolean f23588b;

        /* renamed from: c */
        private String f23589c;

        public C9957g(List<String> list) {
            this.f23587a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C9961i.f23606a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f23588b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f23587a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f23587a.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.f23589c = str;
                            return str;
                        }
                    }
                    String str2 = this.f23587a.get(0);
                    this.f23589c = str2;
                    return str2;
                } else if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
                    this.f23589c = (String) objArr[0];
                    return null;
                } else {
                    return method.invoke(this, objArr);
                }
            }
        }
    }

    /* compiled from: Platform.java */
    /* renamed from: io.grpc.i1.r.f$h */
    /* loaded from: classes2.dex */
    public enum EnumC9958h {
        ALPN_AND_NPN,
        NPN,
        NONE
    }

    public C9950f(Provider provider) {
        this.f23574a = provider;
    }

    /* renamed from: b */
    public static byte[] m13489b(List<EnumC9959g> list) {
        C14342c c14342c = new C14342c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC9959g enumC9959g = list.get(i);
            if (enumC9959g != EnumC9959g.HTTP_1_0) {
                c14342c.m2061Z0(enumC9959g.toString().length());
                c14342c.m2050h1(enumC9959g.toString());
            }
        }
        return c14342c.mo1988k();
    }

    /* renamed from: d */
    private static C9950f m13488d() {
        Method method;
        Method method2;
        EnumC9958h enumC9958h;
        Provider m13486f = m13486f();
        if (m13486f != null) {
            C9949e c9949e = new C9949e(null, "setUseSessionTickets", Boolean.TYPE);
            C9949e c9949e2 = new C9949e(null, "setHostname", String.class);
            C9949e c9949e3 = new C9949e(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            C9949e c9949e4 = new C9949e(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                method = cls.getMethod("tagSocket", Socket.class);
                try {
                    method2 = cls.getMethod("untagSocket", Socket.class);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    method2 = null;
                    if (m13486f.getName().equals("GmsCore_OpenSSL")) {
                    }
                    enumC9958h = EnumC9958h.ALPN_AND_NPN;
                    return new C9954d(c9949e, c9949e2, method, method2, c9949e3, c9949e4, m13486f, enumC9958h);
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method = null;
            }
            if (m13486f.getName().equals("GmsCore_OpenSSL") && !m13486f.getName().equals("Conscrypt") && !m13486f.getName().equals("Ssl_Guard")) {
                if (m13483k()) {
                    enumC9958h = EnumC9958h.ALPN_AND_NPN;
                } else if (m13484j()) {
                    enumC9958h = EnumC9958h.NPN;
                } else {
                    enumC9958h = EnumC9958h.NONE;
                }
            } else {
                enumC9958h = EnumC9958h.ALPN_AND_NPN;
            }
            return new C9954d(c9949e, c9949e2, method, method2, c9949e3, c9949e4, m13486f, enumC9958h);
        }
        try {
            Provider provider = SSLContext.getDefault().getProvider();
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS", provider);
                sSLContext.init(null, null, null);
                ((Method) AccessController.doPrivileged(new C9951a())).invoke(sSLContext.createSSLEngine(), new Object[0]);
                return new C9955e(provider, (Method) AccessController.doPrivileged(new C9952b()), (Method) AccessController.doPrivileged(new C9953c()), null);
            } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused3) {
                try {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                    return new C9956f(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider);
                } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    return new C9950f(provider);
                }
            }
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: e */
    public static C9950f m13487e() {
        return f23573d;
    }

    /* renamed from: f */
    private static Provider m13486f() {
        Provider[] providers;
        String[] strArr;
        for (Provider provider : Security.getProviders()) {
            for (String str : f23572c) {
                if (str.equals(provider.getClass().getName())) {
                    f23571b.log(Level.FINE, "Found registered provider {0}", str);
                    return provider;
                }
            }
        }
        f23571b.log(Level.WARNING, "Unable to find Conscrypt");
        return null;
    }

    /* renamed from: j */
    private static boolean m13484j() {
        try {
            C9950f.class.getClassLoader().loadClass("android.app.ActivityOptions");
            return true;
        } catch (ClassNotFoundException e) {
            f23571b.log(Level.FINE, "Can't find class", (Throwable) e);
            return false;
        }
    }

    /* renamed from: k */
    private static boolean m13483k() {
        try {
            C9950f.class.getClassLoader().loadClass("android.net.Network");
            return true;
        } catch (ClassNotFoundException e) {
            f23571b.log(Level.FINE, "Can't find class", (Throwable) e);
            return false;
        }
    }

    /* renamed from: a */
    public void mo13479a(SSLSocket sSLSocket) {
    }

    /* renamed from: c */
    public void mo13478c(SSLSocket sSLSocket, String str, List<EnumC9959g> list) {
    }

    /* renamed from: g */
    public Provider m13485g() {
        return this.f23574a;
    }

    /* renamed from: h */
    public String mo13477h(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: i */
    public EnumC9958h mo13476i() {
        return EnumC9958h.NONE;
    }
}
