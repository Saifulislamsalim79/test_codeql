package p577n.p578a.p579a.p580u;

import p577n.p578a.p582b.AbstractC14429r;
import p577n.p578a.p582b.C14417f;
import p577n.p578a.p582b.C14433v;
import p577n.p578a.p582b.C14434w;
import p577n.p578a.p583c.p585g.InterfaceC14453a;
import p577n.p578a.p583c.p585g.InterfaceC14454b;
/* compiled from: EmphasisDelimiterProcessor.java */
/* renamed from: n.a.a.u.b */
/* loaded from: classes3.dex */
public abstract class AbstractC14404b implements InterfaceC14453a {

    /* renamed from: a */
    private final char f31782a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC14404b(char c) {
        this.f31782a = c;
    }

    @Override // p577n.p578a.p583c.p585g.InterfaceC14453a
    /* renamed from: a */
    public void mo1699a(C14434w c14434w, C14434w c14434w2, int i) {
        AbstractC14429r c14433v;
        String valueOf = String.valueOf(mo1695e());
        if (i == 1) {
            c14433v = new C14417f(valueOf);
        } else {
            c14433v = new C14433v(valueOf + valueOf);
        }
        AbstractC14429r m1777e = c14434w.m1777e();
        while (m1777e != null && m1777e != c14434w2) {
            AbstractC14429r m1777e2 = m1777e.m1777e();
            c14433v.m1780b(m1777e);
            m1777e = m1777e2;
        }
        c14434w.m1774h(c14433v);
    }

    @Override // p577n.p578a.p583c.p585g.InterfaceC14453a
    /* renamed from: b */
    public char mo1698b() {
        return this.f31782a;
    }

    @Override // p577n.p578a.p583c.p585g.InterfaceC14453a
    /* renamed from: c */
    public int mo1697c(InterfaceC14454b interfaceC14454b, InterfaceC14454b interfaceC14454b2) {
        if ((interfaceC14454b.mo1692c() || interfaceC14454b2.mo1693b()) && interfaceC14454b2.mo1694a() % 3 != 0 && (interfaceC14454b.mo1694a() + interfaceC14454b2.mo1694a()) % 3 == 0) {
            return 0;
        }
        return (interfaceC14454b.length() < 2 || interfaceC14454b2.length() < 2) ? 1 : 2;
    }

    @Override // p577n.p578a.p583c.p585g.InterfaceC14453a
    /* renamed from: d */
    public int mo1696d() {
        return 1;
    }

    @Override // p577n.p578a.p583c.p585g.InterfaceC14453a
    /* renamed from: e */
    public char mo1695e() {
        return this.f31782a;
    }
}
