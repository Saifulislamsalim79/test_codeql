package p565l;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p565l.C14231t;
import p565l.p566g0.C14148c;
/* compiled from: Address.java */
/* renamed from: l.a */
/* loaded from: classes3.dex */
public final class C14115a {

    /* renamed from: a */
    final C14231t f30767a;

    /* renamed from: b */
    final InterfaceC14220o f30768b;

    /* renamed from: c */
    final SocketFactory f30769c;

    /* renamed from: d */
    final InterfaceC14118b f30770d;

    /* renamed from: e */
    final List<EnumC14242y> f30771e;

    /* renamed from: f */
    final List<C14214k> f30772f;

    /* renamed from: g */
    final ProxySelector f30773g;

    /* renamed from: h */
    final Proxy f30774h;

    /* renamed from: i */
    final SSLSocketFactory f30775i;

    /* renamed from: j */
    final HostnameVerifier f30776j;

    /* renamed from: k */
    final C14143g f30777k;

    public C14115a(String str, int i, InterfaceC14220o interfaceC14220o, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C14143g c14143g, InterfaceC14118b interfaceC14118b, Proxy proxy, List<EnumC14242y> list, List<C14214k> list2, ProxySelector proxySelector) {
        C14231t.C14232a c14232a = new C14231t.C14232a();
        c14232a.m2482u(sSLSocketFactory != null ? "https" : "http");
        c14232a.m2495h(str);
        c14232a.m2488o(i);
        this.f30767a = c14232a.m2500c();
        if (interfaceC14220o != null) {
            this.f30768b = interfaceC14220o;
            if (socketFactory != null) {
                this.f30769c = socketFactory;
                if (interfaceC14118b != null) {
                    this.f30770d = interfaceC14118b;
                    if (list != null) {
                        this.f30771e = C14148c.m2788t(list);
                        if (list2 != null) {
                            this.f30772f = C14148c.m2788t(list2);
                            if (proxySelector != null) {
                                this.f30773g = proxySelector;
                                this.f30774h = proxy;
                                this.f30775i = sSLSocketFactory;
                                this.f30776j = hostnameVerifier;
                                this.f30777k = c14143g;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    /* renamed from: a */
    public C14143g m2933a() {
        return this.f30777k;
    }

    /* renamed from: b */
    public List<C14214k> m2932b() {
        return this.f30772f;
    }

    /* renamed from: c */
    public InterfaceC14220o m2931c() {
        return this.f30768b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m2930d(C14115a c14115a) {
        return this.f30768b.equals(c14115a.f30768b) && this.f30770d.equals(c14115a.f30770d) && this.f30771e.equals(c14115a.f30771e) && this.f30772f.equals(c14115a.f30772f) && this.f30773g.equals(c14115a.f30773g) && C14148c.m2791q(this.f30774h, c14115a.f30774h) && C14148c.m2791q(this.f30775i, c14115a.f30775i) && C14148c.m2791q(this.f30776j, c14115a.f30776j) && C14148c.m2791q(this.f30777k, c14115a.f30777k) && m2922l().m2503z() == c14115a.m2922l().m2503z();
    }

    /* renamed from: e */
    public HostnameVerifier m2929e() {
        return this.f30776j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C14115a) {
            C14115a c14115a = (C14115a) obj;
            if (this.f30767a.equals(c14115a.f30767a) && m2930d(c14115a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public List<EnumC14242y> m2928f() {
        return this.f30771e;
    }

    /* renamed from: g */
    public Proxy m2927g() {
        return this.f30774h;
    }

    /* renamed from: h */
    public InterfaceC14118b m2926h() {
        return this.f30770d;
    }

    public int hashCode() {
        int hashCode = (((((((((((527 + this.f30767a.hashCode()) * 31) + this.f30768b.hashCode()) * 31) + this.f30770d.hashCode()) * 31) + this.f30771e.hashCode()) * 31) + this.f30772f.hashCode()) * 31) + this.f30773g.hashCode()) * 31;
        Proxy proxy = this.f30774h;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f30775i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f30776j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        C14143g c14143g = this.f30777k;
        return hashCode4 + (c14143g != null ? c14143g.hashCode() : 0);
    }

    /* renamed from: i */
    public ProxySelector m2925i() {
        return this.f30773g;
    }

    /* renamed from: j */
    public SocketFactory m2924j() {
        return this.f30769c;
    }

    /* renamed from: k */
    public SSLSocketFactory m2923k() {
        return this.f30775i;
    }

    /* renamed from: l */
    public C14231t m2922l() {
        return this.f30767a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f30767a.m2516m());
        sb.append(":");
        sb.append(this.f30767a.m2503z());
        if (this.f30774h != null) {
            sb.append(", proxy=");
            sb.append(this.f30774h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f30773g);
        }
        sb.append("}");
        return sb.toString();
    }
}
