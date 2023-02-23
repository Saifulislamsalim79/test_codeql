package p565l.p566g0.p571i;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p565l.EnumC14242y;
import p565l.p566g0.C14148c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Jdk9Platform.java */
/* renamed from: l.g0.i.c */
/* loaded from: classes3.dex */
public final class C14194c extends C14198f {

    /* renamed from: c */
    final Method f31048c;

    /* renamed from: d */
    final Method f31049d;

    C14194c(Method method, Method method2) {
        this.f31048c = method;
        this.f31049d = method2;
    }

    /* renamed from: s */
    public static C14194c m2671s() {
        try {
            return new C14194c(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // p565l.p566g0.p571i.C14198f
    /* renamed from: g */
    public void mo2656g(SSLSocket sSLSocket, String str, List<EnumC14242y> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> m2661b = C14198f.m2661b(list);
            this.f31048c.invoke(sSLParameters, m2661b.toArray(new String[m2661b.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C14148c.m2806b("unable to set ssl parameters", e);
        }
    }

    @Override // p565l.p566g0.p571i.C14198f
    /* renamed from: m */
    public String mo2650m(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f31049d.invoke(sSLSocket, new Object[0]);
            if (str != null) {
                if (str.equals("")) {
                    return null;
                }
                return str;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C14148c.m2806b("unable to get selected protocols", e);
        }
    }
}
