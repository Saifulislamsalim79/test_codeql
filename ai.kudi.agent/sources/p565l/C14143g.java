package p565l;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p565l.p566g0.C14148c;
import p565l.p566g0.p573k.AbstractC14202c;
import p576m.C14347f;
/* compiled from: CertificatePinner.java */
/* renamed from: l.g */
/* loaded from: classes3.dex */
public final class C14143g {

    /* renamed from: c */
    public static final C14143g f30895c = new C14144a().m2819a();

    /* renamed from: a */
    private final Set<C14145b> f30896a;

    /* renamed from: b */
    private final AbstractC14202c f30897b;

    /* compiled from: CertificatePinner.java */
    /* renamed from: l.g$a */
    /* loaded from: classes3.dex */
    public static final class C14144a {

        /* renamed from: a */
        private final List<C14145b> f30898a = new ArrayList();

        /* renamed from: a */
        public C14143g m2819a() {
            return new C14143g(new LinkedHashSet(this.f30898a), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CertificatePinner.java */
    /* renamed from: l.g$b */
    /* loaded from: classes3.dex */
    public static final class C14145b {

        /* renamed from: a */
        final String f30899a;

        /* renamed from: b */
        final String f30900b;

        /* renamed from: c */
        final String f30901c;

        /* renamed from: d */
        final C14347f f30902d;

        /* renamed from: a */
        boolean m2818a(String str) {
            if (this.f30899a.startsWith("*.")) {
                int indexOf = str.indexOf(46);
                if ((str.length() - indexOf) - 1 == this.f30900b.length()) {
                    String str2 = this.f30900b;
                    if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                        return true;
                    }
                }
                return false;
            }
            return str.equals(this.f30900b);
        }

        public boolean equals(Object obj) {
            if (obj instanceof C14145b) {
                C14145b c14145b = (C14145b) obj;
                if (this.f30899a.equals(c14145b.f30899a) && this.f30901c.equals(c14145b.f30901c) && this.f30902d.equals(c14145b.f30902d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.f30899a.hashCode()) * 31) + this.f30901c.hashCode()) * 31) + this.f30902d.hashCode();
        }

        public String toString() {
            return this.f30901c + this.f30902d.mo1961a();
        }
    }

    C14143g(Set<C14145b> set, AbstractC14202c abstractC14202c) {
        this.f30896a = set;
        this.f30897b = abstractC14202c;
    }

    /* renamed from: c */
    public static String m2823c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + m2821e((X509Certificate) certificate).mo1961a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: d */
    static C14347f m2822d(X509Certificate x509Certificate) {
        return C14347f.m2034r(x509Certificate.getPublicKey().getEncoded()).mo1955y();
    }

    /* renamed from: e */
    static C14347f m2821e(X509Certificate x509Certificate) {
        return C14347f.m2034r(x509Certificate.getPublicKey().getEncoded()).mo1954z();
    }

    /* renamed from: a */
    public void m2825a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<C14145b> m2824b = m2824b(str);
        if (m2824b.isEmpty()) {
            return;
        }
        AbstractC14202c abstractC14202c = this.f30897b;
        if (abstractC14202c != null) {
            list = abstractC14202c.mo2643a(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i);
            int size2 = m2824b.size();
            C14347f c14347f = null;
            C14347f c14347f2 = null;
            for (int i2 = 0; i2 < size2; i2++) {
                C14145b c14145b = m2824b.get(i2);
                if (c14145b.f30901c.equals("sha256/")) {
                    if (c14347f == null) {
                        c14347f = m2821e(x509Certificate);
                    }
                    if (c14145b.f30902d.equals(c14347f)) {
                        return;
                    }
                } else if (c14145b.f30901c.equals("sha1/")) {
                    if (c14347f2 == null) {
                        c14347f2 = m2822d(x509Certificate);
                    }
                    if (c14145b.f30902d.equals(c14347f2)) {
                        return;
                    }
                } else {
                    throw new AssertionError("unsupported hashAlgorithm: " + c14145b.f30901c);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
            sb.append("\n    ");
            sb.append(m2823c(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size4 = m2824b.size();
        for (int i4 = 0; i4 < size4; i4++) {
            sb.append("\n    ");
            sb.append(m2824b.get(i4));
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    /* renamed from: b */
    List<C14145b> m2824b(String str) {
        List<C14145b> emptyList = Collections.emptyList();
        for (C14145b c14145b : this.f30896a) {
            if (c14145b.m2818a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(c14145b);
            }
        }
        return emptyList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14143g) {
            C14143g c14143g = (C14143g) obj;
            if (C14148c.m2791q(this.f30897b, c14143g.f30897b) && this.f30896a.equals(c14143g.f30896a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C14143g m2820f(AbstractC14202c abstractC14202c) {
        return C14148c.m2791q(this.f30897b, abstractC14202c) ? this : new C14143g(this.f30896a, abstractC14202c);
    }

    public int hashCode() {
        AbstractC14202c abstractC14202c = this.f30897b;
        return ((abstractC14202c != null ? abstractC14202c.hashCode() : 0) * 31) + this.f30896a.hashCode();
    }
}
