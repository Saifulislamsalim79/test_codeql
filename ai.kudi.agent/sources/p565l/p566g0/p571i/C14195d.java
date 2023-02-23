package p565l.p566g0.p571i;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p565l.EnumC14242y;
import p565l.p566g0.C14148c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JdkWithJettyBootPlatform.java */
/* renamed from: l.g0.i.d */
/* loaded from: classes3.dex */
public class C14195d extends C14198f {

    /* renamed from: c */
    private final Method f31050c;

    /* renamed from: d */
    private final Method f31051d;

    /* renamed from: e */
    private final Method f31052e;

    /* renamed from: f */
    private final Class<?> f31053f;

    /* renamed from: g */
    private final Class<?> f31054g;

    /* compiled from: JdkWithJettyBootPlatform.java */
    /* renamed from: l.g0.i.d$a */
    /* loaded from: classes3.dex */
    private static class C14196a implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f31055a;

        /* renamed from: b */
        boolean f31056b;

        /* renamed from: c */
        String f31057c;

        C14196a(List<String> list) {
            this.f31055a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C14148c.f30906b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f31056b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f31055a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f31055a.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.f31057c = str;
                            return str;
                        }
                    }
                    String str2 = this.f31055a.get(0);
                    this.f31057c = str2;
                    return str2;
                } else if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
                    this.f31057c = (String) objArr[0];
                    return null;
                } else {
                    return method.invoke(this, objArr);
                }
            }
        }
    }

    C14195d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f31050c = method;
        this.f31051d = method2;
        this.f31052e = method3;
        this.f31053f = cls;
        this.f31054g = cls2;
    }

    /* renamed from: s */
    public static C14198f m2670s() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider");
            return new C14195d(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), cls3, Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // p565l.p566g0.p571i.C14198f
    /* renamed from: a */
    public void mo2662a(SSLSocket sSLSocket) {
        try {
            this.f31052e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C14148c.m2806b("unable to remove alpn", e);
        }
    }

    @Override // p565l.p566g0.p571i.C14198f
    /* renamed from: g */
    public void mo2656g(SSLSocket sSLSocket, String str, List<EnumC14242y> list) {
        try {
            this.f31050c.invoke(null, sSLSocket, Proxy.newProxyInstance(C14198f.class.getClassLoader(), new Class[]{this.f31053f, this.f31054g}, new C14196a(C14198f.m2661b(list))));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C14148c.m2806b("unable to set alpn", e);
        }
    }

    @Override // p565l.p566g0.p571i.C14198f
    /* renamed from: m */
    public String mo2650m(SSLSocket sSLSocket) {
        try {
            C14196a c14196a = (C14196a) Proxy.getInvocationHandler(this.f31051d.invoke(null, sSLSocket));
            if (!c14196a.f31056b && c14196a.f31057c == null) {
                C14198f.m2653j().mo2646q(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            } else if (c14196a.f31056b) {
                return null;
            } else {
                return c14196a.f31057c;
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C14148c.m2806b("unable to get selected protocol", e);
        }
    }
}
