package p565l.p566g0.p571i;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;
import p565l.EnumC14242y;
/* compiled from: ConscryptPlatform.java */
/* renamed from: l.g0.i.b */
/* loaded from: classes3.dex */
public class C14193b extends C14198f {
    private C14193b() {
    }

    /* renamed from: s */
    public static C14193b m2673s() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new C14193b();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: t */
    private Provider m2672t() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // p565l.p566g0.p571i.C14198f
    /* renamed from: f */
    public void mo2657f(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    @Override // p565l.p566g0.p571i.C14198f
    /* renamed from: g */
    public void mo2656g(SSLSocket sSLSocket, String str, List<EnumC14242y> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C14198f.m2661b(list).toArray(new String[0]));
            return;
        }
        super.mo2656g(sSLSocket, str, list);
    }

    @Override // p565l.p566g0.p571i.C14198f
    /* renamed from: l */
    public SSLContext mo2651l() {
        try {
            return SSLContext.getInstance("TLSv1.3", m2672t());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", m2672t());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    @Override // p565l.p566g0.p571i.C14198f
    /* renamed from: m */
    public String mo2650m(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.mo2650m(sSLSocket);
    }
}
