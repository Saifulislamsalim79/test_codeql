package p565l.p566g0.p573k;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import p565l.p566g0.p571i.C14198f;
/* compiled from: CertificateChainCleaner.java */
/* renamed from: l.g0.k.c */
/* loaded from: classes3.dex */
public abstract class AbstractC14202c {
    /* renamed from: b */
    public static AbstractC14202c m2642b(X509TrustManager x509TrustManager) {
        return C14198f.m2653j().mo2660c(x509TrustManager);
    }

    /* renamed from: a */
    public abstract List<Certificate> mo2643a(List<Certificate> list, String str) throws SSLPeerUnverifiedException;
}
