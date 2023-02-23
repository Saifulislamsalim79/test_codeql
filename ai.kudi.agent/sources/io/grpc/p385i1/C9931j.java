package io.grpc.p385i1;

import com.google.common.base.C5051n;
import io.grpc.p384h1.C9755r0;
import io.grpc.p385i1.p386r.C9949e;
import io.grpc.p385i1.p386r.C9950f;
import io.grpc.p385i1.p386r.C9961i;
import io.grpc.p385i1.p386r.EnumC9959g;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OkHttpProtocolNegotiator.java */
/* renamed from: io.grpc.i1.j */
/* loaded from: classes2.dex */
public class C9931j {

    /* renamed from: b */
    private static final Logger f23417b = Logger.getLogger(C9931j.class.getName());

    /* renamed from: c */
    private static final C9950f f23418c = C9950f.m13487e();

    /* renamed from: d */
    private static C9931j f23419d = m13577d(C9931j.class.getClassLoader());

    /* renamed from: a */
    protected final C9950f f23420a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OkHttpProtocolNegotiator.java */
    /* renamed from: io.grpc.i1.j$a */
    /* loaded from: classes2.dex */
    public static final class C9932a extends C9931j {

        /* renamed from: e */
        private static final C9949e<Socket> f23421e = new C9949e<>(null, "setUseSessionTickets", Boolean.TYPE);

        /* renamed from: f */
        private static final C9949e<Socket> f23422f = new C9949e<>(null, "setHostname", String.class);

        /* renamed from: g */
        private static final C9949e<Socket> f23423g = new C9949e<>(byte[].class, "getAlpnSelectedProtocol", new Class[0]);

        /* renamed from: h */
        private static final C9949e<Socket> f23424h = new C9949e<>(null, "setAlpnProtocols", byte[].class);

        /* renamed from: i */
        private static final C9949e<Socket> f23425i = new C9949e<>(byte[].class, "getNpnSelectedProtocol", new Class[0]);

        /* renamed from: j */
        private static final C9949e<Socket> f23426j = new C9949e<>(null, "setNpnProtocols", byte[].class);

        /* renamed from: k */
        private static final Method f23427k;

        /* renamed from: l */
        private static final Method f23428l;

        /* renamed from: m */
        private static final Method f23429m;

        /* renamed from: n */
        private static final Method f23430n;

        /* renamed from: o */
        private static final Method f23431o;

        /* renamed from: p */
        private static final Method f23432p;

        /* renamed from: q */
        private static final Constructor<?> f23433q;

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            Method method6;
            Constructor<?> constructor = null;
            try {
                method2 = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
                try {
                    method = SSLParameters.class.getMethod("getApplicationProtocols", new Class[0]);
                    try {
                        method3 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                        try {
                            Class<?> cls = Class.forName("android.net.ssl.SSLSockets");
                            method4 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                            try {
                                method5 = cls.getMethod("setUseSessionTickets", SSLSocket.class, Boolean.TYPE);
                            } catch (ClassNotFoundException e) {
                                e = e;
                                C9931j.f23417b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                                method5 = null;
                                f23429m = method2;
                                f23430n = method;
                                f23431o = method3;
                                f23427k = method4;
                                f23428l = method5;
                                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                                f23432p = method6;
                                f23433q = constructor;
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                C9931j.f23417b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                                method5 = null;
                                f23429m = method2;
                                f23430n = method;
                                f23431o = method3;
                                f23427k = method4;
                                f23428l = method5;
                                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                                f23432p = method6;
                                f23433q = constructor;
                            }
                        } catch (ClassNotFoundException e3) {
                            e = e3;
                            method4 = null;
                        } catch (NoSuchMethodException e4) {
                            e = e4;
                            method4 = null;
                        }
                    } catch (ClassNotFoundException e5) {
                        e = e5;
                        method3 = null;
                        method4 = method3;
                        C9931j.f23417b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f23429m = method2;
                        f23430n = method;
                        f23431o = method3;
                        f23427k = method4;
                        f23428l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f23432p = method6;
                        f23433q = constructor;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        method3 = null;
                        method4 = method3;
                        C9931j.f23417b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f23429m = method2;
                        f23430n = method;
                        f23431o = method3;
                        f23427k = method4;
                        f23428l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f23432p = method6;
                        f23433q = constructor;
                    }
                } catch (ClassNotFoundException e7) {
                    e = e7;
                    method = null;
                    method3 = null;
                } catch (NoSuchMethodException e8) {
                    e = e8;
                    method = null;
                    method3 = null;
                }
            } catch (ClassNotFoundException e9) {
                e = e9;
                method = null;
                method2 = null;
                method3 = null;
            } catch (NoSuchMethodException e10) {
                e = e10;
                method = null;
                method2 = null;
                method3 = null;
            }
            f23429m = method2;
            f23430n = method;
            f23431o = method3;
            f23427k = method4;
            f23428l = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
            } catch (ClassNotFoundException e11) {
                e = e11;
                method6 = null;
            } catch (NoSuchMethodException e12) {
                e = e12;
                method6 = null;
            }
            try {
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException e13) {
                e = e13;
                C9931j.f23417b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                f23432p = method6;
                f23433q = constructor;
            } catch (NoSuchMethodException e14) {
                e = e14;
                C9931j.f23417b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                f23432p = method6;
                f23433q = constructor;
            }
            f23432p = method6;
            f23433q = constructor;
        }

        C9932a(C9950f c9950f) {
            super(c9950f);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
        @Override // io.grpc.p385i1.C9931j
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected void mo13573c(javax.net.ssl.SSLSocket r9, java.lang.String r10, java.util.List<io.grpc.p385i1.p386r.EnumC9959g> r11) {
            /*
                Method dump skipped, instructions count: 251
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.p385i1.C9931j.C9932a.mo13573c(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
        }

        @Override // io.grpc.p385i1.C9931j
        /* renamed from: f */
        public String mo13572f(SSLSocket sSLSocket) {
            Method method = f23431o;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, new Object[0]);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    if (e2.getTargetException() instanceof UnsupportedOperationException) {
                        C9931j.f23417b.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                    } else {
                        throw new RuntimeException(e2);
                    }
                }
            }
            if (this.f23420a.mo13476i() == C9950f.EnumC9958h.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) f23423g.m13491f(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, C9961i.f23607b);
                    }
                } catch (Exception e3) {
                    C9931j.f23417b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e3);
                }
            }
            if (this.f23420a.mo13476i() != C9950f.EnumC9958h.NONE) {
                try {
                    byte[] bArr2 = (byte[]) f23425i.m13491f(sSLSocket, new Object[0]);
                    if (bArr2 != null) {
                        return new String(bArr2, C9961i.f23607b);
                    }
                    return null;
                } catch (Exception e4) {
                    C9931j.f23417b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e4);
                    return null;
                }
            }
            return null;
        }

        @Override // io.grpc.p385i1.C9931j
        /* renamed from: h */
        public String mo13571h(SSLSocket sSLSocket, String str, List<EnumC9959g> list) throws IOException {
            String mo13572f = mo13572f(sSLSocket);
            return mo13572f == null ? super.mo13571h(sSLSocket, str, list) : mo13572f;
        }
    }

    C9931j(C9950f c9950f) {
        C5051n.m25779o(c9950f, "platform");
        this.f23420a = c9950f;
    }

    /* renamed from: d */
    static C9931j m13577d(ClassLoader classLoader) {
        boolean z;
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            f23417b.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                f23417b.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                z = false;
            }
        }
        z = true;
        if (z) {
            return new C9932a(f23418c);
        }
        return new C9931j(f23418c);
    }

    /* renamed from: e */
    public static C9931j m13576e() {
        return f23419d;
    }

    /* renamed from: g */
    static boolean m13575g(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            C9755r0.m14065c(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static String[] m13574i(List<EnumC9959g> list) {
        ArrayList arrayList = new ArrayList();
        for (EnumC9959g enumC9959g : list) {
            arrayList.add(enumC9959g.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: c */
    protected void mo13573c(SSLSocket sSLSocket, String str, List<EnumC9959g> list) {
        this.f23420a.mo13478c(sSLSocket, str, list);
    }

    /* renamed from: f */
    public String mo13572f(SSLSocket sSLSocket) {
        return this.f23420a.mo13477h(sSLSocket);
    }

    /* renamed from: h */
    public String mo13571h(SSLSocket sSLSocket, String str, List<EnumC9959g> list) throws IOException {
        if (list != null) {
            mo13573c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String mo13572f = mo13572f(sSLSocket);
            if (mo13572f != null) {
                return mo13572f;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            this.f23420a.mo13479a(sSLSocket);
        }
    }
}
