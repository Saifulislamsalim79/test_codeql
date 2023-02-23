package p577n.p578a.p579a;

import java.util.List;
import p577n.p578a.p582b.AbstractC14412a;
import p577n.p578a.p582b.C14426o;
import p577n.p578a.p582b.C14431t;
import p577n.p578a.p583c.InterfaceC14437a;
import p577n.p578a.p583c.p584f.AbstractC14445a;
import p577n.p578a.p583c.p584f.C14447c;
import p577n.p578a.p583c.p584f.InterfaceC14452h;
/* compiled from: ParagraphParser.java */
/* renamed from: n.a.a.r */
/* loaded from: classes3.dex */
public class C14399r extends AbstractC14445a {

    /* renamed from: a */
    private final C14431t f31776a = new C14431t();

    /* renamed from: b */
    private C14391o f31777b = new C14391o();

    @Override // p577n.p578a.p583c.p584f.AbstractC14445a, p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: a */
    public void mo1722a(InterfaceC14437a interfaceC14437a) {
        CharSequence m1854d = this.f31777b.m1854d();
        if (m1854d.length() > 0) {
            interfaceC14437a.mo1741a(m1854d.toString(), this.f31776a);
        }
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: c */
    public C14447c mo1720c(InterfaceC14452h interfaceC14452h) {
        if (!interfaceC14452h.mo1706a()) {
            return C14447c.m1725b(interfaceC14452h.mo1700h());
        }
        return C14447c.m1723d();
    }

    @Override // p577n.p578a.p583c.p584f.AbstractC14445a, p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: e */
    public void mo1718e() {
        if (this.f31777b.m1854d().length() == 0) {
            this.f31776a.m1771l();
        }
    }

    @Override // p577n.p578a.p583c.p584f.AbstractC14445a, p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: f */
    public boolean mo1717f() {
        return true;
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: g */
    public AbstractC14412a mo1716g() {
        return this.f31776a;
    }

    @Override // p577n.p578a.p583c.p584f.AbstractC14445a, p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: h */
    public void mo1715h(CharSequence charSequence) {
        this.f31777b.m1852f(charSequence);
    }

    /* renamed from: i */
    public CharSequence m1840i() {
        return this.f31777b.m1854d();
    }

    /* renamed from: j */
    public List<C14426o> m1839j() {
        return this.f31777b.m1855c();
    }
}
