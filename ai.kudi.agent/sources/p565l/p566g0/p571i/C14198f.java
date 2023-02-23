package p565l.p566g0.p571i;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p565l.C14239x;
import p565l.EnumC14242y;
import p565l.p566g0.p573k.AbstractC14202c;
import p565l.p566g0.p573k.C14200a;
import p565l.p566g0.p573k.C14201b;
import p565l.p566g0.p573k.InterfaceC14204e;
import p576m.C14342c;
/* compiled from: Platform.java */
/* renamed from: l.g0.i.f */
/* loaded from: classes3.dex */
public class C14198f {

    /* renamed from: a */
    private static final C14198f f31061a = m2654i();

    /* renamed from: b */
    private static final Logger f31062b = Logger.getLogger(C14239x.class.getName());

    /* renamed from: b */
    public static List<String> m2661b(List<EnumC14242y> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC14242y enumC14242y = list.get(i);
            if (enumC14242y != EnumC14242y.HTTP_1_0) {
                arrayList.add(enumC14242y.toString());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static byte[] m2658e(List<EnumC14242y> list) {
        C14342c c14342c = new C14342c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC14242y enumC14242y = list.get(i);
            if (enumC14242y != EnumC14242y.HTTP_1_0) {
                c14342c.m2061Z0(enumC14242y.toString().length());
                c14342c.m2050h1(enumC14242y.toString());
            }
        }
        return c14342c.mo1988k();
    }

    /* renamed from: i */
    private static C14198f m2654i() {
        C14193b m2673s;
        C14198f m2678u = C14189a.m2678u();
        if (m2678u != null) {
            return m2678u;
        }
        if (!m2647p() || (m2673s = C14193b.m2673s()) == null) {
            C14194c m2671s = C14194c.m2671s();
            if (m2671s != null) {
                return m2671s;
            }
            C14198f m2670s = C14195d.m2670s();
            return m2670s != null ? m2670s : new C14198f();
        }
        return m2673s;
    }

    /* renamed from: j */
    public static C14198f m2653j() {
        return f31061a;
    }

    /* renamed from: p */
    public static boolean m2647p() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    /* renamed from: a */
    public void mo2662a(SSLSocket sSLSocket) {
    }

    /* renamed from: c */
    public AbstractC14202c mo2660c(X509TrustManager x509TrustManager) {
        return new C14200a(mo2659d(x509TrustManager));
    }

    /* renamed from: d */
    public InterfaceC14204e mo2659d(X509TrustManager x509TrustManager) {
        return new C14201b(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: f */
    public void mo2657f(SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: g */
    public void mo2656g(SSLSocket sSLSocket, String str, List<EnumC14242y> list) {
    }

    /* renamed from: h */
    public void mo2655h(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: k */
    public String m2652k() {
        return "OkHttp";
    }

    /* renamed from: l */
    public SSLContext mo2651l() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: m */
    public String mo2650m(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: n */
    public Object mo2649n(String str) {
        if (f31062b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: o */
    public boolean mo2648o(String str) {
        return true;
    }

    /* renamed from: q */
    public void mo2646q(int i, String str, Throwable th) {
        f31062b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: r */
    public void mo2645r(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        mo2646q(5, str, (Throwable) obj);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
