package p201g.p219f.p223b.p224k;

import p201g.p219f.p223b.C7543d;
import p201g.p219f.p223b.C7552i;
import p201g.p219f.p223b.p224k.C7558d;
import p201g.p219f.p223b.p224k.C7561e;
/* compiled from: Barrier.java */
/* renamed from: g.f.b.k.a */
/* loaded from: classes2.dex */
public class C7555a extends C7568i {

    /* renamed from: r0 */
    private int f18041r0 = 0;

    /* renamed from: s0 */
    private boolean f18042s0 = true;

    /* renamed from: t0 */
    private int f18043t0 = 0;

    /* renamed from: u0 */
    boolean f18044u0 = false;

    /* renamed from: c1 */
    public boolean m18337c1() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.f18187q0;
            if (i4 >= i) {
                break;
            }
            C7561e c7561e = this.f18186p0[i4];
            if ((this.f18042s0 || c7561e.mo18169h()) && ((((i2 = this.f18041r0) == 0 || i2 == 1) && !c7561e.mo18175e0()) || (((i3 = this.f18041r0) == 2 || i3 == 3) && !c7561e.mo18173f0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f18187q0; i6++) {
            C7561e c7561e2 = this.f18186p0[i6];
            if (this.f18042s0 || c7561e2.mo18169h()) {
                if (!z2) {
                    int i7 = this.f18041r0;
                    if (i7 == 0) {
                        i5 = c7561e2.mo18165m(C7558d.EnumC7560b.LEFT).m18320d();
                    } else if (i7 == 1) {
                        i5 = c7561e2.mo18165m(C7558d.EnumC7560b.RIGHT).m18320d();
                    } else if (i7 == 2) {
                        i5 = c7561e2.mo18165m(C7558d.EnumC7560b.TOP).m18320d();
                    } else if (i7 == 3) {
                        i5 = c7561e2.mo18165m(C7558d.EnumC7560b.BOTTOM).m18320d();
                    }
                    z2 = true;
                }
                int i8 = this.f18041r0;
                if (i8 == 0) {
                    i5 = Math.min(i5, c7561e2.mo18165m(C7558d.EnumC7560b.LEFT).m18320d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, c7561e2.mo18165m(C7558d.EnumC7560b.RIGHT).m18320d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, c7561e2.mo18165m(C7558d.EnumC7560b.TOP).m18320d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, c7561e2.mo18165m(C7558d.EnumC7560b.BOTTOM).m18320d());
                }
            }
        }
        int i9 = i5 + this.f18043t0;
        int i10 = this.f18041r0;
        if (i10 != 0 && i10 != 1) {
            m18227s0(i9, i9);
        } else {
            m18233p0(i9, i9);
        }
        this.f18044u0 = true;
        return true;
    }

    /* renamed from: d1 */
    public boolean m18336d1() {
        return this.f18042s0;
    }

    @Override // p201g.p219f.p223b.p224k.C7561e
    /* renamed from: e0 */
    public boolean mo18175e0() {
        return this.f18044u0;
    }

    /* renamed from: e1 */
    public int m18335e1() {
        return this.f18041r0;
    }

    @Override // p201g.p219f.p223b.p224k.C7561e
    /* renamed from: f0 */
    public boolean mo18173f0() {
        return this.f18044u0;
    }

    /* renamed from: f1 */
    public int m18334f1() {
        return this.f18043t0;
    }

    @Override // p201g.p219f.p223b.p224k.C7561e
    /* renamed from: g */
    public void mo18171g(C7543d c7543d, boolean z) {
        Object[] objArr;
        boolean z2;
        int i;
        int i2;
        C7558d[] c7558dArr = this.f18099N;
        c7558dArr[0] = this.f18091F;
        c7558dArr[2] = this.f18092G;
        c7558dArr[1] = this.f18093H;
        c7558dArr[3] = this.f18094I;
        int i3 = 0;
        while (true) {
            objArr = this.f18099N;
            if (i3 >= objArr.length) {
                break;
            }
            objArr[i3].f18073i = c7543d.m18388q(objArr[i3]);
            i3++;
        }
        int i4 = this.f18041r0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C7558d c7558d = objArr[i4];
        if (!this.f18044u0) {
            m18337c1();
        }
        if (this.f18044u0) {
            this.f18044u0 = false;
            int i5 = this.f18041r0;
            if (i5 == 0 || i5 == 1) {
                c7543d.m18399f(this.f18091F.f18073i, this.f18108W);
                c7543d.m18399f(this.f18093H.f18073i, this.f18108W);
                return;
            } else if (i5 == 2 || i5 == 3) {
                c7543d.m18399f(this.f18092G.f18073i, this.f18109X);
                c7543d.m18399f(this.f18094I.f18073i, this.f18109X);
                return;
            } else {
                return;
            }
        }
        for (int i6 = 0; i6 < this.f18187q0; i6++) {
            C7561e c7561e = this.f18186p0[i6];
            if ((this.f18042s0 || c7561e.mo18169h()) && ((((i = this.f18041r0) == 0 || i == 1) && c7561e.m18216y() == C7561e.EnumC7563b.MATCH_CONSTRAINT && c7561e.f18091F.f18070f != null && c7561e.f18093H.f18070f != null) || (((i2 = this.f18041r0) == 2 || i2 == 3) && c7561e.m18276O() == C7561e.EnumC7563b.MATCH_CONSTRAINT && c7561e.f18092G.f18070f != null && c7561e.f18094I.f18070f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.f18091F.m18313k() || this.f18093H.m18313k();
        boolean z4 = this.f18092G.m18313k() || this.f18094I.m18313k();
        int i7 = !z2 && ((this.f18041r0 == 0 && z3) || ((this.f18041r0 == 2 && z4) || ((this.f18041r0 == 1 && z3) || (this.f18041r0 == 3 && z4)))) ? 5 : 4;
        for (int i8 = 0; i8 < this.f18187q0; i8++) {
            C7561e c7561e2 = this.f18186p0[i8];
            if (this.f18042s0 || c7561e2.mo18169h()) {
                C7552i m18388q = c7543d.m18388q(c7561e2.f18099N[this.f18041r0]);
                C7558d[] c7558dArr2 = c7561e2.f18099N;
                int i9 = this.f18041r0;
                c7558dArr2[i9].f18073i = m18388q;
                int i10 = (c7558dArr2[i9].f18070f == null || c7558dArr2[i9].f18070f.f18068d != this) ? 0 : c7558dArr2[i9].f18071g + 0;
                int i11 = this.f18041r0;
                if (i11 != 0 && i11 != 2) {
                    c7543d.m18398g(c7558d.f18073i, m18388q, this.f18043t0 + i10, z2);
                } else {
                    c7543d.m18396i(c7558d.f18073i, m18388q, this.f18043t0 - i10, z2);
                }
                c7543d.m18400e(c7558d.f18073i, m18388q, this.f18043t0 + i10, i7);
            }
        }
        int i12 = this.f18041r0;
        if (i12 == 0) {
            c7543d.m18400e(this.f18093H.f18073i, this.f18091F.f18073i, 0, 8);
            c7543d.m18400e(this.f18091F.f18073i, this.f18103R.f18093H.f18073i, 0, 4);
            c7543d.m18400e(this.f18091F.f18073i, this.f18103R.f18091F.f18073i, 0, 0);
        } else if (i12 == 1) {
            c7543d.m18400e(this.f18091F.f18073i, this.f18093H.f18073i, 0, 8);
            c7543d.m18400e(this.f18091F.f18073i, this.f18103R.f18091F.f18073i, 0, 4);
            c7543d.m18400e(this.f18091F.f18073i, this.f18103R.f18093H.f18073i, 0, 0);
        } else if (i12 == 2) {
            c7543d.m18400e(this.f18094I.f18073i, this.f18092G.f18073i, 0, 8);
            c7543d.m18400e(this.f18092G.f18073i, this.f18103R.f18094I.f18073i, 0, 4);
            c7543d.m18400e(this.f18092G.f18073i, this.f18103R.f18092G.f18073i, 0, 0);
        } else if (i12 == 3) {
            c7543d.m18400e(this.f18092G.f18073i, this.f18094I.f18073i, 0, 8);
            c7543d.m18400e(this.f18092G.f18073i, this.f18103R.f18092G.f18073i, 0, 4);
            c7543d.m18400e(this.f18092G.f18073i, this.f18103R.f18094I.f18073i, 0, 0);
        }
    }

    /* renamed from: g1 */
    public int m18333g1() {
        int i = this.f18041r0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // p201g.p219f.p223b.p224k.C7561e
    /* renamed from: h */
    public boolean mo18169h() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h1 */
    public void m18332h1() {
        for (int i = 0; i < this.f18187q0; i++) {
            C7561e c7561e = this.f18186p0[i];
            int i2 = this.f18041r0;
            if (i2 == 0 || i2 == 1) {
                c7561e.m18299C0(0, true);
            } else if (i2 == 2 || i2 == 3) {
                c7561e.m18299C0(1, true);
            }
        }
    }

    /* renamed from: i1 */
    public void m18331i1(boolean z) {
        this.f18042s0 = z;
    }

    /* renamed from: j1 */
    public void m18330j1(int i) {
        this.f18041r0 = i;
    }

    /* renamed from: k1 */
    public void m18329k1(int i) {
        this.f18043t0 = i;
    }

    @Override // p201g.p219f.p223b.p224k.C7561e
    public String toString() {
        String str = "[Barrier] " + m18230r() + " {";
        for (int i = 0; i < this.f18187q0; i++) {
            C7561e c7561e = this.f18186p0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + c7561e.m18230r();
        }
        return str + "}";
    }
}
