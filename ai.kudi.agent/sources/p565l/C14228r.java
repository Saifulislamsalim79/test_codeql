package p565l;

import ai.kudi.agent.settings.dataSource.KycLevelRemoteDataSource;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p565l.p566g0.C14148c;
/* compiled from: Handshake.java */
/* renamed from: l.r */
/* loaded from: classes3.dex */
public final class C14228r {

    /* renamed from: a */
    private final EnumC14142f0 f31146a;

    /* renamed from: b */
    private final C14205h f31147b;

    /* renamed from: c */
    private final List<Certificate> f31148c;

    /* renamed from: d */
    private final List<Certificate> f31149d;

    private C14228r(EnumC14142f0 enumC14142f0, C14205h c14205h, List<Certificate> list, List<Certificate> list2) {
        this.f31146a = enumC14142f0;
        this.f31147b = c14205h;
        this.f31148c = list;
        this.f31149d = list2;
    }

    /* renamed from: b */
    public static C14228r m2557b(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        List emptyList;
        List emptyList2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
                C14205h m2635a = C14205h.m2635a(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol != null) {
                    if (!KycLevelRemoteDataSource.NONE.equals(protocol)) {
                        EnumC14142f0 m2828a = EnumC14142f0.m2828a(protocol);
                        try {
                            certificateArr = sSLSession.getPeerCertificates();
                        } catch (SSLPeerUnverifiedException unused) {
                            certificateArr = null;
                        }
                        if (certificateArr != null) {
                            emptyList = C14148c.m2787u(certificateArr);
                        } else {
                            emptyList = Collections.emptyList();
                        }
                        Certificate[] localCertificates = sSLSession.getLocalCertificates();
                        if (localCertificates != null) {
                            emptyList2 = C14148c.m2787u(localCertificates);
                        } else {
                            emptyList2 = Collections.emptyList();
                        }
                        return new C14228r(m2828a, m2635a, emptyList, emptyList2);
                    }
                    throw new IOException("tlsVersion == NONE");
                }
                throw new IllegalStateException("tlsVersion == null");
            }
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    /* renamed from: c */
    public static C14228r m2556c(EnumC14142f0 enumC14142f0, C14205h c14205h, List<Certificate> list, List<Certificate> list2) {
        if (enumC14142f0 != null) {
            if (c14205h != null) {
                return new C14228r(enumC14142f0, c14205h, C14148c.m2788t(list), C14148c.m2788t(list2));
            }
            throw new NullPointerException("cipherSuite == null");
        }
        throw new NullPointerException("tlsVersion == null");
    }

    /* renamed from: a */
    public C14205h m2558a() {
        return this.f31147b;
    }

    /* renamed from: d */
    public List<Certificate> m2555d() {
        return this.f31149d;
    }

    /* renamed from: e */
    public List<Certificate> m2554e() {
        return this.f31148c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C14228r) {
            C14228r c14228r = (C14228r) obj;
            return this.f31146a.equals(c14228r.f31146a) && this.f31147b.equals(c14228r.f31147b) && this.f31148c.equals(c14228r.f31148c) && this.f31149d.equals(c14228r.f31149d);
        }
        return false;
    }

    /* renamed from: f */
    public EnumC14142f0 m2553f() {
        return this.f31146a;
    }

    public int hashCode() {
        return ((((((527 + this.f31146a.hashCode()) * 31) + this.f31147b.hashCode()) * 31) + this.f31148c.hashCode()) * 31) + this.f31149d.hashCode();
    }
}
