package p425j.p434c.p435a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p425j.p434c.p435a.InterfaceC11193l;
import p577n.p578a.p582b.AbstractC14429r;
import p577n.p578a.p582b.C14413b;
import p577n.p578a.p582b.C14414c;
import p577n.p578a.p582b.C14415d;
import p577n.p578a.p582b.C14416e;
import p577n.p578a.p582b.C14417f;
import p577n.p578a.p582b.C14418g;
import p577n.p578a.p582b.C14419h;
import p577n.p578a.p582b.C14420i;
import p577n.p578a.p582b.C14421j;
import p577n.p578a.p582b.C14422k;
import p577n.p578a.p582b.C14423l;
import p577n.p578a.p582b.C14424m;
import p577n.p578a.p582b.C14425n;
import p577n.p578a.p582b.C14426o;
import p577n.p578a.p582b.C14428q;
import p577n.p578a.p582b.C14430s;
import p577n.p578a.p582b.C14431t;
import p577n.p578a.p582b.C14432u;
import p577n.p578a.p582b.C14433v;
import p577n.p578a.p582b.C14434w;
import p577n.p578a.p582b.C14435x;
/* compiled from: MarkwonVisitorImpl.java */
/* renamed from: j.c.a.n */
/* loaded from: classes3.dex */
class C11199n implements InterfaceC11193l {

    /* renamed from: a */
    private final C11182g f25285a;

    /* renamed from: b */
    private final InterfaceC11203q f25286b;

    /* renamed from: c */
    private final C11206t f25287c;

    /* renamed from: d */
    private final Map<Class<? extends AbstractC14429r>, InterfaceC11193l.InterfaceC11196c<? extends AbstractC14429r>> f25288d;

    /* renamed from: e */
    private final InterfaceC11193l.InterfaceC11194a f25289e;

    /* compiled from: MarkwonVisitorImpl.java */
    /* renamed from: j.c.a.n$a */
    /* loaded from: classes3.dex */
    static class C11200a implements InterfaceC11193l.InterfaceC11195b {

        /* renamed from: a */
        private final Map<Class<? extends AbstractC14429r>, InterfaceC11193l.InterfaceC11196c<? extends AbstractC14429r>> f25290a = new HashMap();

        /* renamed from: b */
        private InterfaceC11193l.InterfaceC11194a f25291b;

        @Override // p425j.p434c.p435a.InterfaceC11193l.InterfaceC11195b
        /* renamed from: a */
        public InterfaceC11193l mo11397a(C11182g c11182g, InterfaceC11203q interfaceC11203q) {
            InterfaceC11193l.InterfaceC11194a interfaceC11194a = this.f25291b;
            if (interfaceC11194a == null) {
                interfaceC11194a = new C11175b();
            }
            return new C11199n(c11182g, interfaceC11203q, new C11206t(), Collections.unmodifiableMap(this.f25290a), interfaceC11194a);
        }

        @Override // p425j.p434c.p435a.InterfaceC11193l.InterfaceC11195b
        /* renamed from: b */
        public <N extends AbstractC14429r> InterfaceC11193l.InterfaceC11195b mo11396b(Class<N> cls, InterfaceC11193l.InterfaceC11196c<? super N> interfaceC11196c) {
            if (interfaceC11196c == null) {
                this.f25290a.remove(cls);
            } else {
                this.f25290a.put(cls, interfaceC11196c);
            }
            return this;
        }
    }

    C11199n(C11182g c11182g, InterfaceC11203q interfaceC11203q, C11206t c11206t, Map<Class<? extends AbstractC14429r>, InterfaceC11193l.InterfaceC11196c<? extends AbstractC14429r>> map, InterfaceC11193l.InterfaceC11194a interfaceC11194a) {
        this.f25285a = c11182g;
        this.f25286b = interfaceC11203q;
        this.f25287c = c11206t;
        this.f25288d = map;
        this.f25289e = interfaceC11194a;
    }

    /* renamed from: H */
    private void m11408H(AbstractC14429r abstractC14429r) {
        InterfaceC11193l.InterfaceC11196c<? extends AbstractC14429r> interfaceC11196c = this.f25288d.get(abstractC14429r.getClass());
        if (interfaceC11196c != null) {
            interfaceC11196c.mo11286a(this, abstractC14429r);
        } else {
            mo11405f(abstractC14429r);
        }
    }

    @Override // p425j.p434c.p435a.InterfaceC11193l
    /* renamed from: A */
    public <N extends AbstractC14429r> void mo11410A(N n, int i) {
        m11409G(n.getClass(), i);
    }

    @Override // p577n.p578a.p582b.InterfaceC14436y
    /* renamed from: B */
    public void mo1762B(C14431t c14431t) {
        m11408H(c14431t);
    }

    @Override // p577n.p578a.p582b.InterfaceC14436y
    /* renamed from: C */
    public void mo1761C(C14419h c14419h) {
        m11408H(c14419h);
    }

    @Override // p577n.p578a.p582b.InterfaceC14436y
    /* renamed from: D */
    public void mo1760D(C14433v c14433v) {
        m11408H(c14433v);
    }

    @Override // p577n.p578a.p582b.InterfaceC14436y
    /* renamed from: E */
    public void mo1759E(C14432u c14432u) {
        m11408H(c14432u);
    }

    @Override // p577n.p578a.p582b.InterfaceC14436y
    /* renamed from: F */
    public void mo1758F(C14428q c14428q) {
        m11408H(c14428q);
    }

    /* renamed from: G */
    public <N extends AbstractC14429r> void m11409G(Class<N> cls, int i) {
        InterfaceC11205s mo11416a = this.f25285a.m11440c().mo11416a(cls);
        if (mo11416a != null) {
            mo11406d(i, mo11416a.mo11285a(this.f25285a, this.f25286b));
        }
    }

    @Override // p425j.p434c.p435a.InterfaceC11193l
    /* renamed from: a */
    public void mo11407a(AbstractC14429r abstractC14429r) {
        this.f25289e.mo11414a(this, abstractC14429r);
    }

    @Override // p577n.p578a.p582b.InterfaceC14436y
    /* renamed from: b */
    public void mo1757b(C14416e c14416e) {
        m11408H(c14416e);
    }

    @Override // p577n.p578a.p582b.InterfaceC14436y
    /* renamed from: c */
    public void mo1756c(C14413b c14413b) {
        m11408H(c14413b);
    }

    @Override // p425j.p434c.p435a.InterfaceC11193l
    /* renamed from: d */
    public void mo11406d(int i, Object obj) {
        C11206t c11206t = this.f25287c;
        C11206t.m11378j(c11206t, obj, i, c11206t.length());
    }

    @Override // p577n.p578a.p582b.InterfaceC14436y
    /* renamed from: e */
    public void mo1755e(C14415d c14415d) {
        m11408H(c14415d);
    }

    @Override // p425j.p434c.p435a.InterfaceC11193l
    /* renamed from: f */
    public void mo11405f(AbstractC14429r abstractC14429r) {
        AbstractC14429r m1779c = abstractC14429r.m1779c();
        while (m1779c != null) {
            AbstractC14429r m1777e = m1779c.m1777e();
            m1779c.mo1763a(this);
            m1779c = m1777e;
        }
    }

    @Override // p577n.p578a.p582b.InterfaceC14436y
    /* renamed from: g */
    public void mo1754g(C14420i c14420i) {
        m11408H(c14420i);
    }

    @Override // p425j.p434c.p435a.InterfaceC11193l
    /* renamed from: h */
    public C11206t mo11404h() {
        return this.f25287c;
    }

    @Override // p425j.p434c.p435a.InterfaceC11193l
    /* renamed from: i */
    public C11182g mo11403i() {
        return this.f25285a;
    }

    @Override // p577n.p578a.p582b.InterfaceC14436y
    /* renamed from: j */
    public void mo1753j(C14418g c14418g) {
        m11408H(c14418g);
    }

    @Override // p425j.p434c.p435a.InterfaceC11193l
    /* renamed from: k */
    public boolean mo11402k(AbstractC14429r abstractC14429r) {
        return abstractC14429r.m1777e() != null;
    }

    @Override // p577n.p578a.p582b.InterfaceC14436y
    /* renamed from: l */
    public void mo1752l(C14417f c14417f) {
        m11408H(c14417f);
    }

    @Override // p425j.p434c.p435a.InterfaceC11193l
    public int length() {
        return this.f25287c.length();
    }

    @Override // p425j.p434c.p435a.InterfaceC11193l
    /* renamed from: m */
    public void mo11401m() {
        this.f25287c.m11387a('\n');
    }

    @Override // p577n.p578a.p582b.InterfaceC14436y
    /* renamed from: n */
    public void mo1751n(C14414c c14414c) {
        m11408H(c14414c);
    }

    @Override // p577n.p578a.p582b.InterfaceC14436y
    /* renamed from: o */
    public void mo1750o(C14421j c14421j) {
        m11408H(c14421j);
    }

    @Override // p577n.p578a.p582b.InterfaceC14436y
    /* renamed from: p */
    public void mo1749p(C14434w c14434w) {
        m11408H(c14434w);
    }

    @Override // p577n.p578a.p582b.InterfaceC14436y
    /* renamed from: q */
    public void mo1748q(C14422k c14422k) {
        m11408H(c14422k);
    }

    @Override // p577n.p578a.p582b.InterfaceC14436y
    /* renamed from: r */
    public void mo1747r(C14423l c14423l) {
        m11408H(c14423l);
    }

    @Override // p425j.p434c.p435a.InterfaceC11193l
    /* renamed from: s */
    public void mo11400s() {
        if (this.f25287c.length() <= 0 || '\n' == this.f25287c.m11380h()) {
            return;
        }
        this.f25287c.m11387a('\n');
    }

    @Override // p577n.p578a.p582b.InterfaceC14436y
    /* renamed from: t */
    public void mo1746t(C14426o c14426o) {
        m11408H(c14426o);
    }

    @Override // p577n.p578a.p582b.InterfaceC14436y
    /* renamed from: u */
    public void mo1745u(C14435x c14435x) {
        m11408H(c14435x);
    }

    @Override // p577n.p578a.p582b.InterfaceC14436y
    /* renamed from: v */
    public void mo1744v(C14430s c14430s) {
        m11408H(c14430s);
    }

    @Override // p577n.p578a.p582b.InterfaceC14436y
    /* renamed from: w */
    public void mo1743w(C14425n c14425n) {
        m11408H(c14425n);
    }

    @Override // p425j.p434c.p435a.InterfaceC11193l
    /* renamed from: x */
    public void mo11399x(AbstractC14429r abstractC14429r) {
        this.f25289e.mo11413b(this, abstractC14429r);
    }

    @Override // p425j.p434c.p435a.InterfaceC11193l
    /* renamed from: y */
    public InterfaceC11203q mo11398y() {
        return this.f25286b;
    }

    @Override // p577n.p578a.p582b.InterfaceC14436y
    /* renamed from: z */
    public void mo1742z(C14424m c14424m) {
        m11408H(c14424m);
    }
}
