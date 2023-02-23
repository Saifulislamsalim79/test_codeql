package p201g.p219f.p223b.p224k.p225m;

import p201g.p219f.p223b.p224k.C7558d;
import p201g.p219f.p223b.p224k.C7561e;
import p201g.p219f.p223b.p224k.InterfaceC7567h;
import p201g.p219f.p223b.p224k.p225m.AbstractC7593p;
import p201g.p219f.p223b.p224k.p225m.C7579f;
/* compiled from: VerticalWidgetRun.java */
/* renamed from: g.f.b.k.m.n */
/* loaded from: classes2.dex */
public class C7589n extends AbstractC7593p {

    /* renamed from: k */
    public C7579f f18246k;

    /* renamed from: l */
    C7581g f18247l;

    /* compiled from: VerticalWidgetRun.java */
    /* renamed from: g.f.b.k.m.n$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C7590a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18248a;

        static {
            int[] iArr = new int[AbstractC7593p.EnumC7595b.values().length];
            f18248a = iArr;
            try {
                iArr[AbstractC7593p.EnumC7595b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18248a[AbstractC7593p.EnumC7595b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18248a[AbstractC7593p.EnumC7595b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C7589n(C7561e c7561e) {
        super(c7561e);
        C7579f c7579f = new C7579f(this);
        this.f18246k = c7579f;
        this.f18247l = null;
        this.f18262h.f18221e = C7579f.EnumC7580a.TOP;
        this.f18263i.f18221e = C7579f.EnumC7580a.BOTTOM;
        c7579f.f18221e = C7579f.EnumC7580a.BASELINE;
        this.f18260f = 1;
    }

    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p, p201g.p219f.p223b.p224k.p225m.InterfaceC7577d
    /* renamed from: a */
    public void mo18089a(InterfaceC7577d interfaceC7577d) {
        C7581g c7581g;
        float f;
        float m18226t;
        float f2;
        int i;
        C7561e c7561e;
        int i2 = C7590a.f18248a[this.f18264j.ordinal()];
        if (i2 == 1) {
            m18074p(interfaceC7577d);
        } else if (i2 == 2) {
            m18075o(interfaceC7577d);
        } else if (i2 == 3) {
            C7561e c7561e2 = this.f18256b;
            m18076n(interfaceC7577d, c7561e2.f18092G, c7561e2.f18094I, 1);
            return;
        }
        C7581g c7581g2 = this.f18259e;
        if (c7581g2.f18219c && !c7581g2.f18226j && this.f18258d == C7561e.EnumC7563b.MATCH_CONSTRAINT) {
            C7561e c7561e3 = this.f18256b;
            int i3 = c7561e3.f18140o;
            if (i3 != 2) {
                if (i3 == 3 && c7561e3.f18118d.f18259e.f18226j) {
                    int m18224u = c7561e3.m18224u();
                    if (m18224u == -1) {
                        C7561e c7561e4 = this.f18256b;
                        f = c7561e4.f18118d.f18259e.f18223g;
                        m18226t = c7561e4.m18226t();
                    } else if (m18224u == 0) {
                        f2 = c7561e.f18118d.f18259e.f18223g * this.f18256b.m18226t();
                        i = (int) (f2 + 0.5f);
                        this.f18259e.mo18122d(i);
                    } else if (m18224u == 1) {
                        C7561e c7561e5 = this.f18256b;
                        f = c7561e5.f18118d.f18259e.f18223g;
                        m18226t = c7561e5.m18226t();
                    } else {
                        i = 0;
                        this.f18259e.mo18122d(i);
                    }
                    f2 = f / m18226t;
                    i = (int) (f2 + 0.5f);
                    this.f18259e.mo18122d(i);
                }
            } else {
                C7561e m18288I = c7561e3.m18288I();
                if (m18288I != null) {
                    if (m18288I.f18120e.f18259e.f18226j) {
                        this.f18259e.mo18122d((int) ((c7581g.f18223g * this.f18256b.f18147v) + 0.5f));
                    }
                }
            }
        }
        C7579f c7579f = this.f18262h;
        if (c7579f.f18219c) {
            C7579f c7579f2 = this.f18263i;
            if (c7579f2.f18219c) {
                if (c7579f.f18226j && c7579f2.f18226j && this.f18259e.f18226j) {
                    return;
                }
                if (!this.f18259e.f18226j && this.f18258d == C7561e.EnumC7563b.MATCH_CONSTRAINT) {
                    C7561e c7561e6 = this.f18256b;
                    if (c7561e6.f18138n == 0 && !c7561e6.m18253b0()) {
                        int i4 = this.f18262h.f18228l.get(0).f18223g;
                        C7579f c7579f3 = this.f18262h;
                        int i5 = i4 + c7579f3.f18222f;
                        int i6 = this.f18263i.f18228l.get(0).f18223g + this.f18263i.f18222f;
                        c7579f3.mo18122d(i5);
                        this.f18263i.mo18122d(i6);
                        this.f18259e.mo18122d(i6 - i5);
                        return;
                    }
                }
                if (!this.f18259e.f18226j && this.f18258d == C7561e.EnumC7563b.MATCH_CONSTRAINT && this.f18255a == 1 && this.f18262h.f18228l.size() > 0 && this.f18263i.f18228l.size() > 0) {
                    int i7 = (this.f18263i.f18228l.get(0).f18223g + this.f18263i.f18222f) - (this.f18262h.f18228l.get(0).f18223g + this.f18262h.f18222f);
                    C7581g c7581g3 = this.f18259e;
                    int i8 = c7581g3.f18238m;
                    if (i7 < i8) {
                        c7581g3.mo18122d(i7);
                    } else {
                        c7581g3.mo18122d(i8);
                    }
                }
                if (this.f18259e.f18226j && this.f18262h.f18228l.size() > 0 && this.f18263i.f18228l.size() > 0) {
                    C7579f c7579f4 = this.f18262h.f18228l.get(0);
                    C7579f c7579f5 = this.f18263i.f18228l.get(0);
                    int i9 = c7579f4.f18223g + this.f18262h.f18222f;
                    int i10 = c7579f5.f18223g + this.f18263i.f18222f;
                    float m18280M = this.f18256b.m18280M();
                    if (c7579f4 == c7579f5) {
                        i9 = c7579f4.f18223g;
                        i10 = c7579f5.f18223g;
                        m18280M = 0.5f;
                    }
                    this.f18262h.mo18122d((int) (i9 + 0.5f + (((i10 - i9) - this.f18259e.f18223g) * m18280M)));
                    this.f18263i.mo18122d(this.f18262h.f18223g + this.f18259e.f18223g);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p
    /* renamed from: d */
    public void mo18086d() {
        C7561e m18288I;
        C7561e m18288I2;
        C7561e c7561e = this.f18256b;
        if (c7561e.f18112a) {
            this.f18259e.mo18122d(c7561e.m18222v());
        }
        if (!this.f18259e.f18226j) {
            this.f18258d = this.f18256b.m18276O();
            if (this.f18256b.m18264U()) {
                this.f18247l = new C7572a(this);
            }
            C7561e.EnumC7563b enumC7563b = this.f18258d;
            if (enumC7563b != C7561e.EnumC7563b.MATCH_CONSTRAINT) {
                if (enumC7563b == C7561e.EnumC7563b.MATCH_PARENT && (m18288I2 = this.f18256b.m18288I()) != null && m18288I2.m18276O() == C7561e.EnumC7563b.FIXED) {
                    int m18222v = (m18288I2.m18222v() - this.f18256b.f18092G.m18319e()) - this.f18256b.f18094I.m18319e();
                    m18088b(this.f18262h, m18288I2.f18120e.f18262h, this.f18256b.f18092G.m18319e());
                    m18088b(this.f18263i, m18288I2.f18120e.f18263i, -this.f18256b.f18094I.m18319e());
                    this.f18259e.mo18122d(m18222v);
                    return;
                } else if (this.f18258d == C7561e.EnumC7563b.FIXED) {
                    this.f18259e.mo18122d(this.f18256b.m18222v());
                }
            }
        } else if (this.f18258d == C7561e.EnumC7563b.MATCH_PARENT && (m18288I = this.f18256b.m18288I()) != null && m18288I.m18276O() == C7561e.EnumC7563b.FIXED) {
            m18088b(this.f18262h, m18288I.f18120e.f18262h, this.f18256b.f18092G.m18319e());
            m18088b(this.f18263i, m18288I.f18120e.f18263i, -this.f18256b.f18094I.m18319e());
            return;
        }
        if (this.f18259e.f18226j) {
            C7561e c7561e2 = this.f18256b;
            if (c7561e2.f18112a) {
                C7558d[] c7558dArr = c7561e2.f18099N;
                if (c7558dArr[2].f18070f != null && c7558dArr[3].f18070f != null) {
                    if (c7561e2.m18253b0()) {
                        this.f18262h.f18222f = this.f18256b.f18099N[2].m18319e();
                        this.f18263i.f18222f = -this.f18256b.f18099N[3].m18319e();
                    } else {
                        C7579f m18082h = m18082h(this.f18256b.f18099N[2]);
                        if (m18082h != null) {
                            m18088b(this.f18262h, m18082h, this.f18256b.f18099N[2].m18319e());
                        }
                        C7579f m18082h2 = m18082h(this.f18256b.f18099N[3]);
                        if (m18082h2 != null) {
                            m18088b(this.f18263i, m18082h2, -this.f18256b.f18099N[3].m18319e());
                        }
                        this.f18262h.f18218b = true;
                        this.f18263i.f18218b = true;
                    }
                    if (this.f18256b.m18264U()) {
                        m18088b(this.f18246k, this.f18262h, this.f18256b.m18238n());
                        return;
                    }
                    return;
                }
                C7561e c7561e3 = this.f18256b;
                C7558d[] c7558dArr2 = c7561e3.f18099N;
                if (c7558dArr2[2].f18070f != null) {
                    C7579f m18082h3 = m18082h(c7558dArr2[2]);
                    if (m18082h3 != null) {
                        m18088b(this.f18262h, m18082h3, this.f18256b.f18099N[2].m18319e());
                        m18088b(this.f18263i, this.f18262h, this.f18259e.f18223g);
                        if (this.f18256b.m18264U()) {
                            m18088b(this.f18246k, this.f18262h, this.f18256b.m18238n());
                            return;
                        }
                        return;
                    }
                    return;
                } else if (c7558dArr2[3].f18070f != null) {
                    C7579f m18082h4 = m18082h(c7558dArr2[3]);
                    if (m18082h4 != null) {
                        m18088b(this.f18263i, m18082h4, -this.f18256b.f18099N[3].m18319e());
                        m18088b(this.f18262h, this.f18263i, -this.f18259e.f18223g);
                    }
                    if (this.f18256b.m18264U()) {
                        m18088b(this.f18246k, this.f18262h, this.f18256b.m18238n());
                        return;
                    }
                    return;
                } else if (c7558dArr2[4].f18070f != null) {
                    C7579f m18082h5 = m18082h(c7558dArr2[4]);
                    if (m18082h5 != null) {
                        m18088b(this.f18246k, m18082h5, 0);
                        m18088b(this.f18262h, this.f18246k, -this.f18256b.m18238n());
                        m18088b(this.f18263i, this.f18262h, this.f18259e.f18223g);
                        return;
                    }
                    return;
                } else if ((c7561e3 instanceof InterfaceC7567h) || c7561e3.m18288I() == null || this.f18256b.mo18165m(C7558d.EnumC7560b.CENTER).f18070f != null) {
                    return;
                } else {
                    m18088b(this.f18262h, this.f18256b.m18288I().f18120e.f18262h, this.f18256b.m18266T());
                    m18088b(this.f18263i, this.f18262h, this.f18259e.f18223g);
                    if (this.f18256b.m18264U()) {
                        m18088b(this.f18246k, this.f18262h, this.f18256b.m18238n());
                        return;
                    }
                    return;
                }
            }
        }
        if (!this.f18259e.f18226j && this.f18258d == C7561e.EnumC7563b.MATCH_CONSTRAINT) {
            C7561e c7561e4 = this.f18256b;
            int i = c7561e4.f18140o;
            if (i != 2) {
                if (i == 3 && !c7561e4.m18253b0()) {
                    C7561e c7561e5 = this.f18256b;
                    if (c7561e5.f18138n != 3) {
                        C7581g c7581g = c7561e5.f18118d.f18259e;
                        this.f18259e.f18228l.add(c7581g);
                        c7581g.f18227k.add(this.f18259e);
                        C7581g c7581g2 = this.f18259e;
                        c7581g2.f18218b = true;
                        c7581g2.f18227k.add(this.f18262h);
                        this.f18259e.f18227k.add(this.f18263i);
                    }
                }
            } else {
                C7561e m18288I3 = c7561e4.m18288I();
                if (m18288I3 != null) {
                    C7581g c7581g3 = m18288I3.f18120e.f18259e;
                    this.f18259e.f18228l.add(c7581g3);
                    c7581g3.f18227k.add(this.f18259e);
                    C7581g c7581g4 = this.f18259e;
                    c7581g4.f18218b = true;
                    c7581g4.f18227k.add(this.f18262h);
                    this.f18259e.f18227k.add(this.f18263i);
                }
            }
        } else {
            this.f18259e.m18124b(this);
        }
        C7561e c7561e6 = this.f18256b;
        C7558d[] c7558dArr3 = c7561e6.f18099N;
        if (c7558dArr3[2].f18070f != null && c7558dArr3[3].f18070f != null) {
            if (c7561e6.m18253b0()) {
                this.f18262h.f18222f = this.f18256b.f18099N[2].m18319e();
                this.f18263i.f18222f = -this.f18256b.f18099N[3].m18319e();
            } else {
                C7579f m18082h6 = m18082h(this.f18256b.f18099N[2]);
                C7579f m18082h7 = m18082h(this.f18256b.f18099N[3]);
                m18082h6.m18124b(this);
                m18082h7.m18124b(this);
                this.f18264j = AbstractC7593p.EnumC7595b.CENTER;
            }
            if (this.f18256b.m18264U()) {
                m18087c(this.f18246k, this.f18262h, 1, this.f18247l);
            }
        } else {
            C7561e c7561e7 = this.f18256b;
            C7558d[] c7558dArr4 = c7561e7.f18099N;
            if (c7558dArr4[2].f18070f != null) {
                C7579f m18082h8 = m18082h(c7558dArr4[2]);
                if (m18082h8 != null) {
                    m18088b(this.f18262h, m18082h8, this.f18256b.f18099N[2].m18319e());
                    m18087c(this.f18263i, this.f18262h, 1, this.f18259e);
                    if (this.f18256b.m18264U()) {
                        m18087c(this.f18246k, this.f18262h, 1, this.f18247l);
                    }
                    if (this.f18258d == C7561e.EnumC7563b.MATCH_CONSTRAINT && this.f18256b.m18226t() > 0.0f) {
                        C7586l c7586l = this.f18256b.f18118d;
                        if (c7586l.f18258d == C7561e.EnumC7563b.MATCH_CONSTRAINT) {
                            c7586l.f18259e.f18227k.add(this.f18259e);
                            this.f18259e.f18228l.add(this.f18256b.f18118d.f18259e);
                            this.f18259e.f18217a = this;
                        }
                    }
                }
            } else if (c7558dArr4[3].f18070f != null) {
                C7579f m18082h9 = m18082h(c7558dArr4[3]);
                if (m18082h9 != null) {
                    m18088b(this.f18263i, m18082h9, -this.f18256b.f18099N[3].m18319e());
                    m18087c(this.f18262h, this.f18263i, -1, this.f18259e);
                    if (this.f18256b.m18264U()) {
                        m18087c(this.f18246k, this.f18262h, 1, this.f18247l);
                    }
                }
            } else if (c7558dArr4[4].f18070f != null) {
                C7579f m18082h10 = m18082h(c7558dArr4[4]);
                if (m18082h10 != null) {
                    m18088b(this.f18246k, m18082h10, 0);
                    m18087c(this.f18262h, this.f18246k, -1, this.f18247l);
                    m18087c(this.f18263i, this.f18262h, 1, this.f18259e);
                }
            } else if (!(c7561e7 instanceof InterfaceC7567h) && c7561e7.m18288I() != null) {
                m18088b(this.f18262h, this.f18256b.m18288I().f18120e.f18262h, this.f18256b.m18266T());
                m18087c(this.f18263i, this.f18262h, 1, this.f18259e);
                if (this.f18256b.m18264U()) {
                    m18087c(this.f18246k, this.f18262h, 1, this.f18247l);
                }
                if (this.f18258d == C7561e.EnumC7563b.MATCH_CONSTRAINT && this.f18256b.m18226t() > 0.0f) {
                    C7586l c7586l2 = this.f18256b.f18118d;
                    if (c7586l2.f18258d == C7561e.EnumC7563b.MATCH_CONSTRAINT) {
                        c7586l2.f18259e.f18227k.add(this.f18259e);
                        this.f18259e.f18228l.add(this.f18256b.f18118d.f18259e);
                        this.f18259e.f18217a = this;
                    }
                }
            }
        }
        if (this.f18259e.f18228l.size() == 0) {
            this.f18259e.f18219c = true;
        }
    }

    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p
    /* renamed from: e */
    public void mo18085e() {
        C7579f c7579f = this.f18262h;
        if (c7579f.f18226j) {
            this.f18256b.m18259W0(c7579f.f18223g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p
    /* renamed from: f */
    public void mo18084f() {
        this.f18257c = null;
        this.f18262h.m18123c();
        this.f18263i.m18123c();
        this.f18246k.m18123c();
        this.f18259e.m18123c();
        this.f18261g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p
    /* renamed from: m */
    public boolean mo18077m() {
        return this.f18258d != C7561e.EnumC7563b.MATCH_CONSTRAINT || this.f18256b.f18140o == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m18100q() {
        this.f18261g = false;
        this.f18262h.m18123c();
        this.f18262h.f18226j = false;
        this.f18263i.m18123c();
        this.f18263i.f18226j = false;
        this.f18246k.m18123c();
        this.f18246k.f18226j = false;
        this.f18259e.f18226j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f18256b.m18230r();
    }
}
