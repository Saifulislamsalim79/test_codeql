package p201g.p219f.p223b.p224k;

import p201g.p219f.p223b.C7543d;
import p201g.p219f.p223b.C7552i;
import p201g.p219f.p223b.p224k.C7558d;
import p201g.p219f.p223b.p224k.C7561e;
/* compiled from: Guideline.java */
/* renamed from: g.f.b.k.g */
/* loaded from: classes2.dex */
public class C7565g extends C7561e {

    /* renamed from: p0 */
    protected float f18179p0 = -1.0f;

    /* renamed from: q0 */
    protected int f18180q0 = -1;

    /* renamed from: r0 */
    protected int f18181r0 = -1;

    /* renamed from: s0 */
    private C7558d f18182s0 = this.f18092G;

    /* renamed from: t0 */
    private int f18183t0 = 0;

    /* renamed from: u0 */
    private boolean f18184u0;

    /* compiled from: Guideline.java */
    /* renamed from: g.f.b.k.g$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C7566a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18185a;

        static {
            int[] iArr = new int[C7558d.EnumC7560b.values().length];
            f18185a = iArr;
            try {
                iArr[C7558d.EnumC7560b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18185a[C7558d.EnumC7560b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18185a[C7558d.EnumC7560b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18185a[C7558d.EnumC7560b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18185a[C7558d.EnumC7560b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18185a[C7558d.EnumC7560b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18185a[C7558d.EnumC7560b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18185a[C7558d.EnumC7560b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18185a[C7558d.EnumC7560b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C7565g() {
        this.f18100O.clear();
        this.f18100O.add(this.f18182s0);
        int length = this.f18099N.length;
        for (int i = 0; i < length; i++) {
            this.f18099N[i] = this.f18182s0;
        }
    }

    @Override // p201g.p219f.p223b.p224k.C7561e
    /* renamed from: Z0 */
    public void mo18180Z0(C7543d c7543d, boolean z) {
        if (m18288I() == null) {
            return;
        }
        int m18380y = c7543d.m18380y(this.f18182s0);
        if (this.f18183t0 == 1) {
            m18261V0(m18380y);
            m18259W0(0);
            m18221v0(m18288I().m18222v());
            m18263U0(0);
            return;
        }
        m18261V0(0);
        m18259W0(m18380y);
        m18263U0(m18288I().m18270R());
        m18221v0(0);
    }

    /* renamed from: a1 */
    public C7558d m18179a1() {
        return this.f18182s0;
    }

    /* renamed from: b1 */
    public int m18178b1() {
        return this.f18183t0;
    }

    /* renamed from: c1 */
    public int m18177c1() {
        return this.f18180q0;
    }

    /* renamed from: d1 */
    public int m18176d1() {
        return this.f18181r0;
    }

    @Override // p201g.p219f.p223b.p224k.C7561e
    /* renamed from: e0 */
    public boolean mo18175e0() {
        return this.f18184u0;
    }

    /* renamed from: e1 */
    public float m18174e1() {
        return this.f18179p0;
    }

    @Override // p201g.p219f.p223b.p224k.C7561e
    /* renamed from: f0 */
    public boolean mo18173f0() {
        return this.f18184u0;
    }

    /* renamed from: f1 */
    public void m18172f1(int i) {
        this.f18182s0.m18305s(i);
        this.f18184u0 = true;
    }

    @Override // p201g.p219f.p223b.p224k.C7561e
    /* renamed from: g */
    public void mo18171g(C7543d c7543d, boolean z) {
        C7564f c7564f = (C7564f) m18288I();
        if (c7564f == null) {
            return;
        }
        C7558d mo18165m = c7564f.mo18165m(C7558d.EnumC7560b.LEFT);
        C7558d mo18165m2 = c7564f.mo18165m(C7558d.EnumC7560b.RIGHT);
        C7561e c7561e = this.f18103R;
        boolean z2 = true;
        boolean z3 = c7561e != null && c7561e.f18102Q[0] == C7561e.EnumC7563b.WRAP_CONTENT;
        if (this.f18183t0 == 0) {
            mo18165m = c7564f.mo18165m(C7558d.EnumC7560b.TOP);
            mo18165m2 = c7564f.mo18165m(C7558d.EnumC7560b.BOTTOM);
            C7561e c7561e2 = this.f18103R;
            z3 = (c7561e2 == null || c7561e2.f18102Q[1] != C7561e.EnumC7563b.WRAP_CONTENT) ? false : false;
        }
        if (this.f18184u0 && this.f18182s0.m18311m()) {
            C7552i m18388q = c7543d.m18388q(this.f18182s0);
            c7543d.m18399f(m18388q, this.f18182s0.m18320d());
            if (this.f18180q0 != -1) {
                if (z3) {
                    c7543d.m18397h(c7543d.m18388q(mo18165m2), m18388q, 0, 5);
                }
            } else if (this.f18181r0 != -1 && z3) {
                C7552i m18388q2 = c7543d.m18388q(mo18165m2);
                c7543d.m18397h(m18388q, c7543d.m18388q(mo18165m), 0, 5);
                c7543d.m18397h(m18388q2, m18388q, 0, 5);
            }
            this.f18184u0 = false;
        } else if (this.f18180q0 != -1) {
            C7552i m18388q3 = c7543d.m18388q(this.f18182s0);
            c7543d.m18400e(m18388q3, c7543d.m18388q(mo18165m), this.f18180q0, 8);
            if (z3) {
                c7543d.m18397h(c7543d.m18388q(mo18165m2), m18388q3, 0, 5);
            }
        } else if (this.f18181r0 != -1) {
            C7552i m18388q4 = c7543d.m18388q(this.f18182s0);
            C7552i m18388q5 = c7543d.m18388q(mo18165m2);
            c7543d.m18400e(m18388q4, m18388q5, -this.f18181r0, 8);
            if (z3) {
                c7543d.m18397h(m18388q4, c7543d.m18388q(mo18165m), 0, 5);
                c7543d.m18397h(m18388q5, m18388q4, 0, 5);
            }
        } else if (this.f18179p0 != -1.0f) {
            c7543d.m18401d(C7543d.m18386s(c7543d, c7543d.m18388q(this.f18182s0), c7543d.m18388q(mo18165m2), this.f18179p0));
        }
    }

    /* renamed from: g1 */
    public void m18170g1(int i) {
        if (i > -1) {
            this.f18179p0 = -1.0f;
            this.f18180q0 = i;
            this.f18181r0 = -1;
        }
    }

    @Override // p201g.p219f.p223b.p224k.C7561e
    /* renamed from: h */
    public boolean mo18169h() {
        return true;
    }

    /* renamed from: h1 */
    public void m18168h1(int i) {
        if (i > -1) {
            this.f18179p0 = -1.0f;
            this.f18180q0 = -1;
            this.f18181r0 = i;
        }
    }

    /* renamed from: i1 */
    public void m18167i1(float f) {
        if (f > -1.0f) {
            this.f18179p0 = f;
            this.f18180q0 = -1;
            this.f18181r0 = -1;
        }
    }

    /* renamed from: j1 */
    public void m18166j1(int i) {
        if (this.f18183t0 == i) {
            return;
        }
        this.f18183t0 = i;
        this.f18100O.clear();
        if (this.f18183t0 == 1) {
            this.f18182s0 = this.f18091F;
        } else {
            this.f18182s0 = this.f18092G;
        }
        this.f18100O.add(this.f18182s0);
        int length = this.f18099N.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f18099N[i2] = this.f18182s0;
        }
    }

    @Override // p201g.p219f.p223b.p224k.C7561e
    /* renamed from: m */
    public C7558d mo18165m(C7558d.EnumC7560b enumC7560b) {
        switch (C7566a.f18185a[enumC7560b.ordinal()]) {
            case 1:
            case 2:
                if (this.f18183t0 == 1) {
                    return this.f18182s0;
                }
                break;
            case 3:
            case 4:
                if (this.f18183t0 == 0) {
                    return this.f18182s0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(enumC7560b.name());
    }
}
