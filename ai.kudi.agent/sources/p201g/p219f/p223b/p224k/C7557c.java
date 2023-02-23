package p201g.p219f.p223b.p224k;

import java.util.ArrayList;
import p201g.p219f.p223b.p224k.C7561e;
/* compiled from: ChainHead.java */
/* renamed from: g.f.b.k.c */
/* loaded from: classes2.dex */
public class C7557c {

    /* renamed from: a */
    protected C7561e f18045a;

    /* renamed from: b */
    protected C7561e f18046b;

    /* renamed from: c */
    protected C7561e f18047c;

    /* renamed from: d */
    protected C7561e f18048d;

    /* renamed from: e */
    protected C7561e f18049e;

    /* renamed from: f */
    protected C7561e f18050f;

    /* renamed from: g */
    protected C7561e f18051g;

    /* renamed from: h */
    protected ArrayList<C7561e> f18052h;

    /* renamed from: i */
    protected int f18053i;

    /* renamed from: j */
    protected int f18054j;

    /* renamed from: k */
    protected float f18055k = 0.0f;

    /* renamed from: l */
    int f18056l;

    /* renamed from: m */
    int f18057m;

    /* renamed from: n */
    int f18058n;

    /* renamed from: o */
    private int f18059o;

    /* renamed from: p */
    private boolean f18060p;

    /* renamed from: q */
    protected boolean f18061q;

    /* renamed from: r */
    protected boolean f18062r;

    /* renamed from: s */
    protected boolean f18063s;

    /* renamed from: t */
    private boolean f18064t;

    public C7557c(C7561e c7561e, int i, boolean z) {
        this.f18060p = false;
        this.f18045a = c7561e;
        this.f18059o = i;
        this.f18060p = z;
    }

    /* renamed from: b */
    private void m18325b() {
        int i = this.f18059o * 2;
        C7561e c7561e = this.f18045a;
        boolean z = false;
        C7561e c7561e2 = c7561e;
        boolean z2 = false;
        while (!z2) {
            this.f18053i++;
            C7561e[] c7561eArr = c7561e.f18135l0;
            int i2 = this.f18059o;
            C7561e c7561e3 = null;
            c7561eArr[i2] = null;
            c7561e.f18133k0[i2] = null;
            if (c7561e.m18272Q() != 8) {
                this.f18056l++;
                if (c7561e.m18228s(this.f18059o) != C7561e.EnumC7563b.MATCH_CONSTRAINT) {
                    this.f18057m += c7561e.m18300C(this.f18059o);
                }
                int m18319e = this.f18057m + c7561e.f18099N[i].m18319e();
                this.f18057m = m18319e;
                int i3 = i + 1;
                this.f18057m = m18319e + c7561e.f18099N[i3].m18319e();
                int m18319e2 = this.f18058n + c7561e.f18099N[i].m18319e();
                this.f18058n = m18319e2;
                this.f18058n = m18319e2 + c7561e.f18099N[i3].m18319e();
                if (this.f18046b == null) {
                    this.f18046b = c7561e;
                }
                this.f18048d = c7561e;
                C7561e.EnumC7563b[] enumC7563bArr = c7561e.f18102Q;
                int i4 = this.f18059o;
                if (enumC7563bArr[i4] == C7561e.EnumC7563b.MATCH_CONSTRAINT) {
                    int[] iArr = c7561e.f18141p;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.f18054j++;
                        float[] fArr = c7561e.f18131j0;
                        int i5 = this.f18059o;
                        float f = fArr[i5];
                        if (f > 0.0f) {
                            this.f18055k += fArr[i5];
                        }
                        if (m18324c(c7561e, this.f18059o)) {
                            if (f < 0.0f) {
                                this.f18061q = true;
                            } else {
                                this.f18062r = true;
                            }
                            if (this.f18052h == null) {
                                this.f18052h = new ArrayList<>();
                            }
                            this.f18052h.add(c7561e);
                        }
                        if (this.f18050f == null) {
                            this.f18050f = c7561e;
                        }
                        C7561e c7561e4 = this.f18051g;
                        if (c7561e4 != null) {
                            c7561e4.f18133k0[this.f18059o] = c7561e;
                        }
                        this.f18051g = c7561e;
                    }
                    if (this.f18059o == 0) {
                        if (c7561e.f18138n == 0 && c7561e.f18142q == 0) {
                            int i6 = c7561e.f18143r;
                        }
                    } else if (c7561e.f18140o == 0 && c7561e.f18145t == 0) {
                        int i7 = c7561e.f18146u;
                    }
                    int i8 = (c7561e.f18106U > 0.0f ? 1 : (c7561e.f18106U == 0.0f ? 0 : -1));
                }
            }
            if (c7561e2 != c7561e) {
                c7561e2.f18135l0[this.f18059o] = c7561e;
            }
            C7558d c7558d = c7561e.f18099N[i + 1].f18070f;
            if (c7558d != null) {
                C7561e c7561e5 = c7558d.f18068d;
                C7558d[] c7558dArr = c7561e5.f18099N;
                if (c7558dArr[i].f18070f != null && c7558dArr[i].f18070f.f18068d == c7561e) {
                    c7561e3 = c7561e5;
                }
            }
            if (c7561e3 == null) {
                c7561e3 = c7561e;
                z2 = true;
            }
            c7561e2 = c7561e;
            c7561e = c7561e3;
        }
        C7561e c7561e6 = this.f18046b;
        if (c7561e6 != null) {
            this.f18057m -= c7561e6.f18099N[i].m18319e();
        }
        C7561e c7561e7 = this.f18048d;
        if (c7561e7 != null) {
            this.f18057m -= c7561e7.f18099N[i + 1].m18319e();
        }
        this.f18047c = c7561e;
        if (this.f18059o == 0 && this.f18060p) {
            this.f18049e = c7561e;
        } else {
            this.f18049e = this.f18045a;
        }
        if (this.f18062r && this.f18061q) {
            z = true;
        }
        this.f18063s = z;
    }

    /* renamed from: c */
    private static boolean m18324c(C7561e c7561e, int i) {
        if (c7561e.m18272Q() != 8 && c7561e.f18102Q[i] == C7561e.EnumC7563b.MATCH_CONSTRAINT) {
            int[] iArr = c7561e.f18141p;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m18326a() {
        if (!this.f18064t) {
            m18325b();
        }
        this.f18064t = true;
    }
}
