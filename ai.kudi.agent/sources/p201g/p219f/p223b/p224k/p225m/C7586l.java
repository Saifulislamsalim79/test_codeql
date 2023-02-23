package p201g.p219f.p223b.p224k.p225m;

import p201g.p219f.p223b.p224k.C7558d;
import p201g.p219f.p223b.p224k.C7561e;
import p201g.p219f.p223b.p224k.InterfaceC7567h;
import p201g.p219f.p223b.p224k.p225m.AbstractC7593p;
import p201g.p219f.p223b.p224k.p225m.C7579f;
/* compiled from: HorizontalWidgetRun.java */
/* renamed from: g.f.b.k.m.l */
/* loaded from: classes2.dex */
public class C7586l extends AbstractC7593p {

    /* renamed from: k */
    private static int[] f18240k = new int[2];

    /* compiled from: HorizontalWidgetRun.java */
    /* renamed from: g.f.b.k.m.l$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C7587a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18241a;

        static {
            int[] iArr = new int[AbstractC7593p.EnumC7595b.values().length];
            f18241a = iArr;
            try {
                iArr[AbstractC7593p.EnumC7595b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18241a[AbstractC7593p.EnumC7595b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18241a[AbstractC7593p.EnumC7595b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C7586l(C7561e c7561e) {
        super(c7561e);
        this.f18262h.f18221e = C7579f.EnumC7580a.LEFT;
        this.f18263i.f18221e = C7579f.EnumC7580a.RIGHT;
        this.f18260f = 0;
    }

    /* renamed from: q */
    private void m18106q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else if (i5 != 1) {
                return;
            } else {
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6 && i7 <= i7) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i6 > i6 || i9 > i7) {
        } else {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02c6, code lost:
        if (r14 != 1) goto L131;
     */
    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p, p201g.p219f.p223b.p224k.p225m.InterfaceC7577d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo18089a(p201g.p219f.p223b.p224k.p225m.InterfaceC7577d r17) {
        /*
            Method dump skipped, instructions count: 1105
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p219f.p223b.p224k.p225m.C7586l.mo18089a(g.f.b.k.m.d):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p
    /* renamed from: d */
    public void mo18086d() {
        C7561e m18288I;
        C7561e m18288I2;
        C7561e c7561e = this.f18256b;
        if (c7561e.f18112a) {
            this.f18259e.mo18122d(c7561e.m18270R());
        }
        if (!this.f18259e.f18226j) {
            C7561e.EnumC7563b m18216y = this.f18256b.m18216y();
            this.f18258d = m18216y;
            if (m18216y != C7561e.EnumC7563b.MATCH_CONSTRAINT) {
                if (m18216y == C7561e.EnumC7563b.MATCH_PARENT && (((m18288I2 = this.f18256b.m18288I()) != null && m18288I2.m18216y() == C7561e.EnumC7563b.FIXED) || m18288I2.m18216y() == C7561e.EnumC7563b.MATCH_PARENT)) {
                    int m18270R = (m18288I2.m18270R() - this.f18256b.f18091F.m18319e()) - this.f18256b.f18093H.m18319e();
                    m18088b(this.f18262h, m18288I2.f18118d.f18262h, this.f18256b.f18091F.m18319e());
                    m18088b(this.f18263i, m18288I2.f18118d.f18263i, -this.f18256b.f18093H.m18319e());
                    this.f18259e.mo18122d(m18270R);
                    return;
                } else if (this.f18258d == C7561e.EnumC7563b.FIXED) {
                    this.f18259e.mo18122d(this.f18256b.m18270R());
                }
            }
        } else if (this.f18258d == C7561e.EnumC7563b.MATCH_PARENT && (((m18288I = this.f18256b.m18288I()) != null && m18288I.m18216y() == C7561e.EnumC7563b.FIXED) || m18288I.m18216y() == C7561e.EnumC7563b.MATCH_PARENT)) {
            m18088b(this.f18262h, m18288I.f18118d.f18262h, this.f18256b.f18091F.m18319e());
            m18088b(this.f18263i, m18288I.f18118d.f18263i, -this.f18256b.f18093H.m18319e());
            return;
        }
        if (this.f18259e.f18226j) {
            C7561e c7561e2 = this.f18256b;
            if (c7561e2.f18112a) {
                C7558d[] c7558dArr = c7561e2.f18099N;
                if (c7558dArr[0].f18070f != null && c7558dArr[1].f18070f != null) {
                    if (c7561e2.m18255Z()) {
                        this.f18262h.f18222f = this.f18256b.f18099N[0].m18319e();
                        this.f18263i.f18222f = -this.f18256b.f18099N[1].m18319e();
                        return;
                    }
                    C7579f m18082h = m18082h(this.f18256b.f18099N[0]);
                    if (m18082h != null) {
                        m18088b(this.f18262h, m18082h, this.f18256b.f18099N[0].m18319e());
                    }
                    C7579f m18082h2 = m18082h(this.f18256b.f18099N[1]);
                    if (m18082h2 != null) {
                        m18088b(this.f18263i, m18082h2, -this.f18256b.f18099N[1].m18319e());
                    }
                    this.f18262h.f18218b = true;
                    this.f18263i.f18218b = true;
                    return;
                }
                C7561e c7561e3 = this.f18256b;
                C7558d[] c7558dArr2 = c7561e3.f18099N;
                if (c7558dArr2[0].f18070f != null) {
                    C7579f m18082h3 = m18082h(c7558dArr2[0]);
                    if (m18082h3 != null) {
                        m18088b(this.f18262h, m18082h3, this.f18256b.f18099N[0].m18319e());
                        m18088b(this.f18263i, this.f18262h, this.f18259e.f18223g);
                        return;
                    }
                    return;
                } else if (c7558dArr2[1].f18070f != null) {
                    C7579f m18082h4 = m18082h(c7558dArr2[1]);
                    if (m18082h4 != null) {
                        m18088b(this.f18263i, m18082h4, -this.f18256b.f18099N[1].m18319e());
                        m18088b(this.f18262h, this.f18263i, -this.f18259e.f18223g);
                        return;
                    }
                    return;
                } else if ((c7561e3 instanceof InterfaceC7567h) || c7561e3.m18288I() == null || this.f18256b.mo18165m(C7558d.EnumC7560b.CENTER).f18070f != null) {
                    return;
                } else {
                    m18088b(this.f18262h, this.f18256b.m18288I().f18118d.f18262h, this.f18256b.m18268S());
                    m18088b(this.f18263i, this.f18262h, this.f18259e.f18223g);
                    return;
                }
            }
        }
        if (this.f18258d == C7561e.EnumC7563b.MATCH_CONSTRAINT) {
            C7561e c7561e4 = this.f18256b;
            int i = c7561e4.f18138n;
            if (i == 2) {
                C7561e m18288I3 = c7561e4.m18288I();
                if (m18288I3 != null) {
                    C7581g c7581g = m18288I3.f18120e.f18259e;
                    this.f18259e.f18228l.add(c7581g);
                    c7581g.f18227k.add(this.f18259e);
                    C7581g c7581g2 = this.f18259e;
                    c7581g2.f18218b = true;
                    c7581g2.f18227k.add(this.f18262h);
                    this.f18259e.f18227k.add(this.f18263i);
                }
            } else if (i == 3) {
                if (c7561e4.f18140o == 3) {
                    this.f18262h.f18217a = this;
                    this.f18263i.f18217a = this;
                    C7589n c7589n = c7561e4.f18120e;
                    c7589n.f18262h.f18217a = this;
                    c7589n.f18263i.f18217a = this;
                    this.f18259e.f18217a = this;
                    if (c7561e4.m18253b0()) {
                        this.f18259e.f18228l.add(this.f18256b.f18120e.f18259e);
                        this.f18256b.f18120e.f18259e.f18227k.add(this.f18259e);
                        C7589n c7589n2 = this.f18256b.f18120e;
                        c7589n2.f18259e.f18217a = this;
                        this.f18259e.f18228l.add(c7589n2.f18262h);
                        this.f18259e.f18228l.add(this.f18256b.f18120e.f18263i);
                        this.f18256b.f18120e.f18262h.f18227k.add(this.f18259e);
                        this.f18256b.f18120e.f18263i.f18227k.add(this.f18259e);
                    } else if (this.f18256b.m18255Z()) {
                        this.f18256b.f18120e.f18259e.f18228l.add(this.f18259e);
                        this.f18259e.f18227k.add(this.f18256b.f18120e.f18259e);
                    } else {
                        this.f18256b.f18120e.f18259e.f18228l.add(this.f18259e);
                    }
                } else {
                    C7581g c7581g3 = c7561e4.f18120e.f18259e;
                    this.f18259e.f18228l.add(c7581g3);
                    c7581g3.f18227k.add(this.f18259e);
                    this.f18256b.f18120e.f18262h.f18227k.add(this.f18259e);
                    this.f18256b.f18120e.f18263i.f18227k.add(this.f18259e);
                    C7581g c7581g4 = this.f18259e;
                    c7581g4.f18218b = true;
                    c7581g4.f18227k.add(this.f18262h);
                    this.f18259e.f18227k.add(this.f18263i);
                    this.f18262h.f18228l.add(this.f18259e);
                    this.f18263i.f18228l.add(this.f18259e);
                }
            }
        }
        C7561e c7561e5 = this.f18256b;
        C7558d[] c7558dArr3 = c7561e5.f18099N;
        if (c7558dArr3[0].f18070f != null && c7558dArr3[1].f18070f != null) {
            if (c7561e5.m18255Z()) {
                this.f18262h.f18222f = this.f18256b.f18099N[0].m18319e();
                this.f18263i.f18222f = -this.f18256b.f18099N[1].m18319e();
                return;
            }
            C7579f m18082h5 = m18082h(this.f18256b.f18099N[0]);
            C7579f m18082h6 = m18082h(this.f18256b.f18099N[1]);
            m18082h5.m18124b(this);
            m18082h6.m18124b(this);
            this.f18264j = AbstractC7593p.EnumC7595b.CENTER;
            return;
        }
        C7561e c7561e6 = this.f18256b;
        C7558d[] c7558dArr4 = c7561e6.f18099N;
        if (c7558dArr4[0].f18070f != null) {
            C7579f m18082h7 = m18082h(c7558dArr4[0]);
            if (m18082h7 != null) {
                m18088b(this.f18262h, m18082h7, this.f18256b.f18099N[0].m18319e());
                m18087c(this.f18263i, this.f18262h, 1, this.f18259e);
            }
        } else if (c7558dArr4[1].f18070f != null) {
            C7579f m18082h8 = m18082h(c7558dArr4[1]);
            if (m18082h8 != null) {
                m18088b(this.f18263i, m18082h8, -this.f18256b.f18099N[1].m18319e());
                m18087c(this.f18262h, this.f18263i, -1, this.f18259e);
            }
        } else if ((c7561e6 instanceof InterfaceC7567h) || c7561e6.m18288I() == null) {
        } else {
            m18088b(this.f18262h, this.f18256b.m18288I().f18118d.f18262h, this.f18256b.m18268S());
            m18087c(this.f18263i, this.f18262h, 1, this.f18259e);
        }
    }

    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p
    /* renamed from: e */
    public void mo18085e() {
        C7579f c7579f = this.f18262h;
        if (c7579f.f18226j) {
            this.f18256b.m18261V0(c7579f.f18223g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p
    /* renamed from: f */
    public void mo18084f() {
        this.f18257c = null;
        this.f18262h.m18123c();
        this.f18263i.m18123c();
        this.f18259e.m18123c();
        this.f18261g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p
    /* renamed from: m */
    public boolean mo18077m() {
        return this.f18258d != C7561e.EnumC7563b.MATCH_CONSTRAINT || this.f18256b.f18138n == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m18105r() {
        this.f18261g = false;
        this.f18262h.m18123c();
        this.f18262h.f18226j = false;
        this.f18263i.m18123c();
        this.f18263i.f18226j = false;
        this.f18259e.f18226j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f18256b.m18230r();
    }
}
