package p577n.p578a.p579a;

import p577n.p578a.p582b.AbstractC14412a;
import p577n.p578a.p582b.AbstractC14427p;
import p577n.p578a.p582b.C14428q;
import p577n.p578a.p582b.C14431t;
import p577n.p578a.p583c.p584f.AbstractC14445a;
import p577n.p578a.p583c.p584f.C14447c;
import p577n.p578a.p583c.p584f.InterfaceC14452h;
/* compiled from: ListItemParser.java */
/* renamed from: n.a.a.q */
/* loaded from: classes3.dex */
public class C14398q extends AbstractC14445a {

    /* renamed from: a */
    private final C14428q f31773a = new C14428q();

    /* renamed from: b */
    private int f31774b;

    /* renamed from: c */
    private boolean f31775c;

    public C14398q(int i) {
        this.f31774b = i;
    }

    @Override // p577n.p578a.p583c.p584f.AbstractC14445a, p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: b */
    public boolean mo1721b() {
        return true;
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: c */
    public C14447c mo1720c(InterfaceC14452h interfaceC14452h) {
        if (interfaceC14452h.mo1706a()) {
            if (this.f31773a.m1779c() == null) {
                return C14447c.m1723d();
            }
            AbstractC14412a mo1716g = interfaceC14452h.mo1702e().mo1716g();
            this.f31775c = (mo1716g instanceof C14431t) || (mo1716g instanceof C14428q);
            return C14447c.m1725b(interfaceC14452h.mo1703d());
        } else if (interfaceC14452h.mo1705b() >= this.f31774b) {
            return C14447c.m1726a(interfaceC14452h.mo1701f() + this.f31774b);
        } else {
            return C14447c.m1723d();
        }
    }

    @Override // p577n.p578a.p583c.p584f.AbstractC14445a, p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: d */
    public boolean mo1719d(AbstractC14412a abstractC14412a) {
        if (this.f31775c) {
            AbstractC14412a mo1776f = this.f31773a.mo1776f();
            if (mo1776f instanceof AbstractC14427p) {
                ((AbstractC14427p) mo1776f).m1781o(false);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: g */
    public AbstractC14412a mo1716g() {
        return this.f31773a;
    }
}
