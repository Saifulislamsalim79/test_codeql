package p565l.p566g0.p573k;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
/* compiled from: BasicTrustRootIndex.java */
/* renamed from: l.g0.k.b */
/* loaded from: classes3.dex */
public final class C14201b implements InterfaceC14204e {

    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f31064a = new LinkedHashMap();

    public C14201b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set<X509Certificate> set = this.f31064a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet<>(1);
                this.f31064a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C14201b) && ((C14201b) obj).f31064a.equals(this.f31064a);
    }

    @Override // p565l.p566g0.p573k.InterfaceC14204e
    public X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f31064a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public int hashCode() {
        return this.f31064a.hashCode();
    }
}
