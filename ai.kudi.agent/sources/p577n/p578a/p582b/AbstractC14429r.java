package p577n.p578a.p582b;
/* compiled from: Node.java */
/* renamed from: n.a.b.r */
/* loaded from: classes3.dex */
public abstract class AbstractC14429r {

    /* renamed from: a */
    private AbstractC14429r f31808a = null;

    /* renamed from: b */
    private AbstractC14429r f31809b = null;

    /* renamed from: c */
    private AbstractC14429r f31810c = null;

    /* renamed from: d */
    private AbstractC14429r f31811d = null;

    /* renamed from: e */
    private AbstractC14429r f31812e = null;

    /* renamed from: a */
    public abstract void mo1763a(InterfaceC14436y interfaceC14436y);

    /* renamed from: b */
    public void m1780b(AbstractC14429r abstractC14429r) {
        abstractC14429r.m1771l();
        abstractC14429r.mo1772j(this);
        AbstractC14429r abstractC14429r2 = this.f31810c;
        if (abstractC14429r2 != null) {
            abstractC14429r2.f31812e = abstractC14429r;
            abstractC14429r.f31811d = abstractC14429r2;
            this.f31810c = abstractC14429r;
            return;
        }
        this.f31809b = abstractC14429r;
        this.f31810c = abstractC14429r;
    }

    /* renamed from: c */
    public AbstractC14429r m1779c() {
        return this.f31809b;
    }

    /* renamed from: d */
    public AbstractC14429r m1778d() {
        return this.f31810c;
    }

    /* renamed from: e */
    public AbstractC14429r m1777e() {
        return this.f31812e;
    }

    /* renamed from: f */
    public AbstractC14429r mo1776f() {
        return this.f31808a;
    }

    /* renamed from: g */
    public AbstractC14429r m1775g() {
        return this.f31811d;
    }

    /* renamed from: h */
    public void m1774h(AbstractC14429r abstractC14429r) {
        abstractC14429r.m1771l();
        AbstractC14429r abstractC14429r2 = this.f31812e;
        abstractC14429r.f31812e = abstractC14429r2;
        if (abstractC14429r2 != null) {
            abstractC14429r2.f31811d = abstractC14429r;
        }
        abstractC14429r.f31811d = this;
        this.f31812e = abstractC14429r;
        AbstractC14429r abstractC14429r3 = this.f31808a;
        abstractC14429r.f31808a = abstractC14429r3;
        if (abstractC14429r.f31812e == null) {
            abstractC14429r3.f31810c = abstractC14429r;
        }
    }

    /* renamed from: i */
    public void m1773i(AbstractC14429r abstractC14429r) {
        abstractC14429r.m1771l();
        AbstractC14429r abstractC14429r2 = this.f31811d;
        abstractC14429r.f31811d = abstractC14429r2;
        if (abstractC14429r2 != null) {
            abstractC14429r2.f31812e = abstractC14429r;
        }
        abstractC14429r.f31812e = this;
        this.f31811d = abstractC14429r;
        AbstractC14429r abstractC14429r3 = this.f31808a;
        abstractC14429r.f31808a = abstractC14429r3;
        if (abstractC14429r.f31811d == null) {
            abstractC14429r3.f31809b = abstractC14429r;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public void mo1772j(AbstractC14429r abstractC14429r) {
        this.f31808a = abstractC14429r;
    }

    /* renamed from: k */
    protected String mo1766k() {
        return "";
    }

    /* renamed from: l */
    public void m1771l() {
        AbstractC14429r abstractC14429r = this.f31811d;
        if (abstractC14429r != null) {
            abstractC14429r.f31812e = this.f31812e;
        } else {
            AbstractC14429r abstractC14429r2 = this.f31808a;
            if (abstractC14429r2 != null) {
                abstractC14429r2.f31809b = this.f31812e;
            }
        }
        AbstractC14429r abstractC14429r3 = this.f31812e;
        if (abstractC14429r3 != null) {
            abstractC14429r3.f31811d = this.f31811d;
        } else {
            AbstractC14429r abstractC14429r4 = this.f31808a;
            if (abstractC14429r4 != null) {
                abstractC14429r4.f31810c = this.f31811d;
            }
        }
        this.f31808a = null;
        this.f31812e = null;
        this.f31811d = null;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" + mo1766k() + "}";
    }
}
