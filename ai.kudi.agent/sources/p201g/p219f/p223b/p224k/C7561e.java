package p201g.p219f.p223b.p224k;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p201g.p219f.p223b.C7542c;
import p201g.p219f.p223b.C7543d;
import p201g.p219f.p223b.p224k.C7558d;
import p201g.p219f.p223b.p224k.p225m.AbstractC7593p;
import p201g.p219f.p223b.p224k.p225m.C7576c;
import p201g.p219f.p223b.p224k.p225m.C7579f;
import p201g.p219f.p223b.p224k.p225m.C7586l;
import p201g.p219f.p223b.p224k.p225m.C7589n;
/* compiled from: ConstraintWidget.java */
/* renamed from: g.f.b.k.e */
/* loaded from: classes2.dex */
public class C7561e {

    /* renamed from: o0 */
    public static float f18085o0 = 0.5f;

    /* renamed from: B */
    private boolean f18087B;

    /* renamed from: M */
    public C7558d f18098M;

    /* renamed from: N */
    public C7558d[] f18099N;

    /* renamed from: O */
    protected ArrayList<C7558d> f18100O;

    /* renamed from: P */
    private boolean[] f18101P;

    /* renamed from: Q */
    public EnumC7563b[] f18102Q;

    /* renamed from: R */
    public C7561e f18103R;

    /* renamed from: S */
    int f18104S;

    /* renamed from: T */
    int f18105T;

    /* renamed from: U */
    public float f18106U;

    /* renamed from: V */
    protected int f18107V;

    /* renamed from: W */
    protected int f18108W;

    /* renamed from: X */
    protected int f18109X;

    /* renamed from: Y */
    int f18110Y;

    /* renamed from: Z */
    protected int f18111Z;

    /* renamed from: a0 */
    protected int f18113a0;

    /* renamed from: b */
    public C7576c f18114b;

    /* renamed from: b0 */
    float f18115b0;

    /* renamed from: c */
    public C7576c f18116c;

    /* renamed from: c0 */
    float f18117c0;

    /* renamed from: d0 */
    private Object f18119d0;

    /* renamed from: e0 */
    private int f18121e0;

    /* renamed from: f0 */
    private String f18123f0;

    /* renamed from: g0 */
    private String f18125g0;

    /* renamed from: h0 */
    int f18127h0;

    /* renamed from: i0 */
    int f18129i0;

    /* renamed from: j0 */
    public float[] f18131j0;

    /* renamed from: k0 */
    protected C7561e[] f18133k0;

    /* renamed from: l0 */
    protected C7561e[] f18135l0;

    /* renamed from: m0 */
    public int f18137m0;

    /* renamed from: n0 */
    public int f18139n0;

    /* renamed from: a */
    public boolean f18112a = false;

    /* renamed from: d */
    public C7586l f18118d = null;

    /* renamed from: e */
    public C7589n f18120e = null;

    /* renamed from: f */
    public boolean[] f18122f = {true, true};

    /* renamed from: g */
    private boolean f18124g = true;

    /* renamed from: h */
    private boolean f18126h = false;

    /* renamed from: i */
    private boolean f18128i = true;

    /* renamed from: j */
    private boolean f18130j = false;

    /* renamed from: k */
    private boolean f18132k = false;

    /* renamed from: l */
    public int f18134l = -1;

    /* renamed from: m */
    public int f18136m = -1;

    /* renamed from: n */
    public int f18138n = 0;

    /* renamed from: o */
    public int f18140o = 0;

    /* renamed from: p */
    public int[] f18141p = new int[2];

    /* renamed from: q */
    public int f18142q = 0;

    /* renamed from: r */
    public int f18143r = 0;

    /* renamed from: s */
    public float f18144s = 1.0f;

    /* renamed from: t */
    public int f18145t = 0;

    /* renamed from: u */
    public int f18146u = 0;

    /* renamed from: v */
    public float f18147v = 1.0f;

    /* renamed from: w */
    int f18148w = -1;

    /* renamed from: x */
    float f18149x = 1.0f;

    /* renamed from: y */
    private int[] f18150y = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: z */
    private float f18151z = 0.0f;

    /* renamed from: A */
    private boolean f18086A = false;

    /* renamed from: C */
    private boolean f18088C = false;

    /* renamed from: D */
    private int f18089D = 0;

    /* renamed from: E */
    private int f18090E = 0;

    /* renamed from: F */
    public C7558d f18091F = new C7558d(this, C7558d.EnumC7560b.LEFT);

    /* renamed from: G */
    public C7558d f18092G = new C7558d(this, C7558d.EnumC7560b.TOP);

    /* renamed from: H */
    public C7558d f18093H = new C7558d(this, C7558d.EnumC7560b.RIGHT);

    /* renamed from: I */
    public C7558d f18094I = new C7558d(this, C7558d.EnumC7560b.BOTTOM);

    /* renamed from: J */
    public C7558d f18095J = new C7558d(this, C7558d.EnumC7560b.BASELINE);

    /* renamed from: K */
    C7558d f18096K = new C7558d(this, C7558d.EnumC7560b.CENTER_X);

    /* renamed from: L */
    C7558d f18097L = new C7558d(this, C7558d.EnumC7560b.CENTER_Y);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintWidget.java */
    /* renamed from: g.f.b.k.e$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C7562a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18152a;

        /* renamed from: b */
        static final /* synthetic */ int[] f18153b;

        static {
            int[] iArr = new int[EnumC7563b.values().length];
            f18153b = iArr;
            try {
                iArr[EnumC7563b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18153b[EnumC7563b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18153b[EnumC7563b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18153b[EnumC7563b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C7558d.EnumC7560b.values().length];
            f18152a = iArr2;
            try {
                iArr2[C7558d.EnumC7560b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18152a[C7558d.EnumC7560b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18152a[C7558d.EnumC7560b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18152a[C7558d.EnumC7560b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18152a[C7558d.EnumC7560b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18152a[C7558d.EnumC7560b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f18152a[C7558d.EnumC7560b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f18152a[C7558d.EnumC7560b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f18152a[C7558d.EnumC7560b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: ConstraintWidget.java */
    /* renamed from: g.f.b.k.e$b */
    /* loaded from: classes2.dex */
    public enum EnumC7563b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C7561e() {
        C7558d c7558d = new C7558d(this, C7558d.EnumC7560b.CENTER);
        this.f18098M = c7558d;
        this.f18099N = new C7558d[]{this.f18091F, this.f18093H, this.f18092G, this.f18094I, this.f18095J, c7558d};
        this.f18100O = new ArrayList<>();
        this.f18101P = new boolean[2];
        EnumC7563b enumC7563b = EnumC7563b.FIXED;
        this.f18102Q = new EnumC7563b[]{enumC7563b, enumC7563b};
        this.f18103R = null;
        this.f18104S = 0;
        this.f18105T = 0;
        this.f18106U = 0.0f;
        this.f18107V = -1;
        this.f18108W = 0;
        this.f18109X = 0;
        this.f18110Y = 0;
        float f = f18085o0;
        this.f18115b0 = f;
        this.f18117c0 = f;
        this.f18121e0 = 0;
        this.f18123f0 = null;
        this.f18125g0 = null;
        this.f18127h0 = 0;
        this.f18129i0 = 0;
        this.f18131j0 = new float[]{-1.0f, -1.0f};
        this.f18133k0 = new C7561e[]{null, null};
        this.f18135l0 = new C7561e[]{null, null};
        this.f18137m0 = -1;
        this.f18139n0 = -1;
        m18251d();
    }

    /* renamed from: Y */
    private boolean m18256Y(int i) {
        int i2 = i * 2;
        C7558d[] c7558dArr = this.f18099N;
        if (c7558dArr[i2].f18070f != null && c7558dArr[i2].f18070f.f18070f != c7558dArr[i2]) {
            int i3 = i2 + 1;
            if (c7558dArr[i3].f18070f != null && c7558dArr[i3].f18070f.f18070f == c7558dArr[i3]) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m18251d() {
        this.f18100O.add(this.f18091F);
        this.f18100O.add(this.f18092G);
        this.f18100O.add(this.f18093H);
        this.f18100O.add(this.f18094I);
        this.f18100O.add(this.f18096K);
        this.f18100O.add(this.f18097L);
        this.f18100O.add(this.f18098M);
        this.f18100O.add(this.f18095J);
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x043e, code lost:
        if ((r2 instanceof p201g.p219f.p223b.p224k.C7555a) != false) goto L226;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0535 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:357:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m18246i(p201g.p219f.p223b.C7543d r36, boolean r37, boolean r38, boolean r39, boolean r40, p201g.p219f.p223b.C7552i r41, p201g.p219f.p223b.C7552i r42, p201g.p219f.p223b.p224k.C7561e.EnumC7563b r43, boolean r44, p201g.p219f.p223b.p224k.C7558d r45, p201g.p219f.p223b.p224k.C7558d r46, int r47, int r48, int r49, int r50, float r51, boolean r52, boolean r53, boolean r54, boolean r55, boolean r56, int r57, int r58, int r59, int r60, float r61, boolean r62) {
        /*
            Method dump skipped, instructions count: 1393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p219f.p223b.p224k.C7561e.m18246i(g.f.b.d, boolean, boolean, boolean, boolean, g.f.b.i, g.f.b.i, g.f.b.k.e$b, boolean, g.f.b.k.d, g.f.b.k.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* renamed from: A */
    public int m18304A() {
        return this.f18089D;
    }

    /* renamed from: A0 */
    public void m18303A0(int i, int i2, int i3, float f) {
        this.f18138n = i;
        this.f18142q = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f18143r = i3;
        this.f18144s = f;
        if (f <= 0.0f || f >= 1.0f || this.f18138n != 0) {
            return;
        }
        this.f18138n = 2;
    }

    /* renamed from: B */
    public int m18302B() {
        return this.f18090E;
    }

    /* renamed from: B0 */
    public void m18301B0(float f) {
        this.f18131j0[0] = f;
    }

    /* renamed from: C */
    public int m18300C(int i) {
        if (i == 0) {
            return m18270R();
        }
        if (i == 1) {
            return m18222v();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C0 */
    public void m18299C0(int i, boolean z) {
        this.f18101P[i] = z;
    }

    /* renamed from: D */
    public int m18298D() {
        return this.f18150y[1];
    }

    /* renamed from: D0 */
    public void m18297D0(boolean z) {
        this.f18087B = z;
    }

    /* renamed from: E */
    public int m18296E() {
        return this.f18150y[0];
    }

    /* renamed from: E0 */
    public void m18295E0(boolean z) {
        this.f18088C = z;
    }

    /* renamed from: F */
    public int m18294F() {
        return this.f18113a0;
    }

    /* renamed from: F0 */
    public void m18293F0(int i, int i2) {
        this.f18089D = i;
        this.f18090E = i2;
        m18287I0(false);
    }

    /* renamed from: G */
    public int m18292G() {
        return this.f18111Z;
    }

    /* renamed from: G0 */
    public void m18291G0(int i) {
        this.f18150y[1] = i;
    }

    /* renamed from: H */
    public C7561e m18290H(int i) {
        C7558d c7558d;
        C7558d c7558d2;
        if (i != 0) {
            if (i == 1 && (c7558d2 = (c7558d = this.f18094I).f18070f) != null && c7558d2.f18070f == c7558d) {
                return c7558d2.f18068d;
            }
            return null;
        }
        C7558d c7558d3 = this.f18093H;
        C7558d c7558d4 = c7558d3.f18070f;
        if (c7558d4 == null || c7558d4.f18070f != c7558d3) {
            return null;
        }
        return c7558d4.f18068d;
    }

    /* renamed from: H0 */
    public void m18289H0(int i) {
        this.f18150y[0] = i;
    }

    /* renamed from: I */
    public C7561e m18288I() {
        return this.f18103R;
    }

    /* renamed from: I0 */
    public void m18287I0(boolean z) {
        this.f18124g = z;
    }

    /* renamed from: J */
    public C7561e m18286J(int i) {
        C7558d c7558d;
        C7558d c7558d2;
        if (i != 0) {
            if (i == 1 && (c7558d2 = (c7558d = this.f18092G).f18070f) != null && c7558d2.f18070f == c7558d) {
                return c7558d2.f18068d;
            }
            return null;
        }
        C7558d c7558d3 = this.f18091F;
        C7558d c7558d4 = c7558d3.f18070f;
        if (c7558d4 == null || c7558d4.f18070f != c7558d3) {
            return null;
        }
        return c7558d4.f18068d;
    }

    /* renamed from: J0 */
    public void m18285J0(int i) {
        if (i < 0) {
            this.f18113a0 = 0;
        } else {
            this.f18113a0 = i;
        }
    }

    /* renamed from: K */
    public int m18284K() {
        return m18268S() + this.f18104S;
    }

    /* renamed from: K0 */
    public void m18283K0(int i) {
        if (i < 0) {
            this.f18111Z = 0;
        } else {
            this.f18111Z = i;
        }
    }

    /* renamed from: L */
    public AbstractC7593p m18282L(int i) {
        if (i == 0) {
            return this.f18118d;
        }
        if (i == 1) {
            return this.f18120e;
        }
        return null;
    }

    /* renamed from: L0 */
    public void m18281L0(int i, int i2) {
        this.f18108W = i;
        this.f18109X = i2;
    }

    /* renamed from: M */
    public float m18280M() {
        return this.f18117c0;
    }

    /* renamed from: M0 */
    public void m18279M0(C7561e c7561e) {
        this.f18103R = c7561e;
    }

    /* renamed from: N */
    public int m18278N() {
        return this.f18129i0;
    }

    /* renamed from: N0 */
    public void m18277N0(float f) {
        this.f18117c0 = f;
    }

    /* renamed from: O */
    public EnumC7563b m18276O() {
        return this.f18102Q[1];
    }

    /* renamed from: O0 */
    public void m18275O0(int i) {
        this.f18129i0 = i;
    }

    /* renamed from: P */
    public int m18274P() {
        int i = this.f18091F != null ? 0 + this.f18092G.f18071g : 0;
        return this.f18093H != null ? i + this.f18094I.f18071g : i;
    }

    /* renamed from: P0 */
    public void m18273P0(int i, int i2) {
        this.f18109X = i;
        int i3 = i2 - i;
        this.f18105T = i3;
        int i4 = this.f18113a0;
        if (i3 < i4) {
            this.f18105T = i4;
        }
    }

    /* renamed from: Q */
    public int m18272Q() {
        return this.f18121e0;
    }

    /* renamed from: Q0 */
    public void m18271Q0(EnumC7563b enumC7563b) {
        this.f18102Q[1] = enumC7563b;
    }

    /* renamed from: R */
    public int m18270R() {
        if (this.f18121e0 == 8) {
            return 0;
        }
        return this.f18104S;
    }

    /* renamed from: R0 */
    public void m18269R0(int i, int i2, int i3, float f) {
        this.f18140o = i;
        this.f18145t = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f18146u = i3;
        this.f18147v = f;
        if (f <= 0.0f || f >= 1.0f || this.f18140o != 0) {
            return;
        }
        this.f18140o = 2;
    }

    /* renamed from: S */
    public int m18268S() {
        C7561e c7561e = this.f18103R;
        if (c7561e != null && (c7561e instanceof C7564f)) {
            return ((C7564f) c7561e).f18175w0 + this.f18108W;
        }
        return this.f18108W;
    }

    /* renamed from: S0 */
    public void m18267S0(float f) {
        this.f18131j0[1] = f;
    }

    /* renamed from: T */
    public int m18266T() {
        C7561e c7561e = this.f18103R;
        if (c7561e != null && (c7561e instanceof C7564f)) {
            return ((C7564f) c7561e).f18176x0 + this.f18109X;
        }
        return this.f18109X;
    }

    /* renamed from: T0 */
    public void m18265T0(int i) {
        this.f18121e0 = i;
    }

    /* renamed from: U */
    public boolean m18264U() {
        return this.f18086A;
    }

    /* renamed from: U0 */
    public void m18263U0(int i) {
        this.f18104S = i;
        int i2 = this.f18111Z;
        if (i < i2) {
            this.f18104S = i2;
        }
    }

    /* renamed from: V */
    public boolean m18262V(int i) {
        if (i == 0) {
            return (this.f18091F.f18070f != null ? 1 : 0) + (this.f18093H.f18070f != null ? 1 : 0) < 2;
        }
        return ((this.f18092G.f18070f != null ? 1 : 0) + (this.f18094I.f18070f != null ? 1 : 0)) + (this.f18095J.f18070f != null ? 1 : 0) < 2;
    }

    /* renamed from: V0 */
    public void m18261V0(int i) {
        this.f18108W = i;
    }

    /* renamed from: W */
    public boolean m18260W() {
        int size = this.f18100O.size();
        for (int i = 0; i < size; i++) {
            if (this.f18100O.get(i).m18312l()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W0 */
    public void m18259W0(int i) {
        this.f18109X = i;
    }

    /* renamed from: X */
    public void m18258X(C7558d.EnumC7560b enumC7560b, C7561e c7561e, C7558d.EnumC7560b enumC7560b2, int i, int i2) {
        mo18165m(enumC7560b).m18323a(c7561e.mo18165m(enumC7560b2), i, i2, true);
    }

    /* renamed from: X0 */
    public void m18257X0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f18148w == -1) {
            if (z3 && !z4) {
                this.f18148w = 0;
            } else if (!z3 && z4) {
                this.f18148w = 1;
                if (this.f18107V == -1) {
                    this.f18149x = 1.0f / this.f18149x;
                }
            }
        }
        if (this.f18148w == 0 && (!this.f18092G.m18310n() || !this.f18094I.m18310n())) {
            this.f18148w = 1;
        } else if (this.f18148w == 1 && (!this.f18091F.m18310n() || !this.f18093H.m18310n())) {
            this.f18148w = 0;
        }
        if (this.f18148w == -1 && (!this.f18092G.m18310n() || !this.f18094I.m18310n() || !this.f18091F.m18310n() || !this.f18093H.m18310n())) {
            if (this.f18092G.m18310n() && this.f18094I.m18310n()) {
                this.f18148w = 0;
            } else if (this.f18091F.m18310n() && this.f18093H.m18310n()) {
                this.f18149x = 1.0f / this.f18149x;
                this.f18148w = 1;
            }
        }
        if (this.f18148w == -1) {
            if (this.f18142q > 0 && this.f18145t == 0) {
                this.f18148w = 0;
            } else if (this.f18142q != 0 || this.f18145t <= 0) {
            } else {
                this.f18149x = 1.0f / this.f18149x;
                this.f18148w = 1;
            }
        }
    }

    /* renamed from: Y0 */
    public void mo18203Y0(boolean z, boolean z2) {
        int i;
        int i2;
        boolean m18079k = z & this.f18118d.m18079k();
        boolean m18079k2 = z2 & this.f18120e.m18079k();
        C7586l c7586l = this.f18118d;
        int i3 = c7586l.f18262h.f18223g;
        C7589n c7589n = this.f18120e;
        int i4 = c7589n.f18262h.f18223g;
        int i5 = c7586l.f18263i.f18223g;
        int i6 = c7589n.f18263i.f18223g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (m18079k) {
            this.f18108W = i3;
        }
        if (m18079k2) {
            this.f18109X = i4;
        }
        if (this.f18121e0 == 8) {
            this.f18104S = 0;
            this.f18105T = 0;
            return;
        }
        if (m18079k) {
            if (this.f18102Q[0] == EnumC7563b.FIXED && i8 < (i2 = this.f18104S)) {
                i8 = i2;
            }
            this.f18104S = i8;
            int i10 = this.f18111Z;
            if (i8 < i10) {
                this.f18104S = i10;
            }
        }
        if (m18079k2) {
            if (this.f18102Q[1] == EnumC7563b.FIXED && i9 < (i = this.f18105T)) {
                i9 = i;
            }
            this.f18105T = i9;
            int i11 = this.f18113a0;
            if (i9 < i11) {
                this.f18105T = i11;
            }
        }
    }

    /* renamed from: Z */
    public boolean m18255Z() {
        C7558d c7558d = this.f18091F;
        C7558d c7558d2 = c7558d.f18070f;
        if (c7558d2 == null || c7558d2.f18070f != c7558d) {
            C7558d c7558d3 = this.f18093H;
            C7558d c7558d4 = c7558d3.f18070f;
            return c7558d4 != null && c7558d4.f18070f == c7558d3;
        }
        return true;
    }

    /* renamed from: Z0 */
    public void mo18180Z0(C7543d c7543d, boolean z) {
        C7589n c7589n;
        C7586l c7586l;
        int m18380y = c7543d.m18380y(this.f18091F);
        int m18380y2 = c7543d.m18380y(this.f18092G);
        int m18380y3 = c7543d.m18380y(this.f18093H);
        int m18380y4 = c7543d.m18380y(this.f18094I);
        if (z && (c7586l = this.f18118d) != null) {
            C7579f c7579f = c7586l.f18262h;
            if (c7579f.f18226j) {
                C7579f c7579f2 = c7586l.f18263i;
                if (c7579f2.f18226j) {
                    m18380y = c7579f.f18223g;
                    m18380y3 = c7579f2.f18223g;
                }
            }
        }
        if (z && (c7589n = this.f18120e) != null) {
            C7579f c7579f3 = c7589n.f18262h;
            if (c7579f3.f18226j) {
                C7579f c7579f4 = c7589n.f18263i;
                if (c7579f4.f18226j) {
                    m18380y2 = c7579f3.f18223g;
                    m18380y4 = c7579f4.f18223g;
                }
            }
        }
        int i = m18380y4 - m18380y2;
        if (m18380y3 - m18380y < 0 || i < 0 || m18380y == Integer.MIN_VALUE || m18380y == Integer.MAX_VALUE || m18380y2 == Integer.MIN_VALUE || m18380y2 == Integer.MAX_VALUE || m18380y3 == Integer.MIN_VALUE || m18380y3 == Integer.MAX_VALUE || m18380y4 == Integer.MIN_VALUE || m18380y4 == Integer.MAX_VALUE) {
            m18380y4 = 0;
            m18380y = 0;
            m18380y2 = 0;
            m18380y3 = 0;
        }
        m18225t0(m18380y, m18380y2, m18380y3, m18380y4);
    }

    /* renamed from: a0 */
    public boolean m18254a0() {
        return this.f18087B;
    }

    /* renamed from: b0 */
    public boolean m18253b0() {
        C7558d c7558d = this.f18092G;
        C7558d c7558d2 = c7558d.f18070f;
        if (c7558d2 == null || c7558d2.f18070f != c7558d) {
            C7558d c7558d3 = this.f18094I;
            C7558d c7558d4 = c7558d3.f18070f;
            return c7558d4 != null && c7558d4.f18070f == c7558d3;
        }
        return true;
    }

    /* renamed from: c0 */
    public boolean m18252c0() {
        return this.f18088C;
    }

    /* renamed from: d0 */
    public boolean m18250d0() {
        return this.f18124g && this.f18121e0 != 8;
    }

    /* renamed from: e */
    public void m18249e(C7564f c7564f, C7543d c7543d, HashSet<C7561e> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            C7569j.m18160a(c7564f, c7543d, this);
            hashSet.remove(this);
            mo18171g(c7543d, c7564f.m18210C1(64));
        }
        if (i == 0) {
            HashSet<C7558d> m18321c = this.f18091F.m18321c();
            if (m18321c != null) {
                Iterator<C7558d> it = m18321c.iterator();
                while (it.hasNext()) {
                    it.next().f18068d.m18249e(c7564f, c7543d, hashSet, i, true);
                }
            }
            HashSet<C7558d> m18321c2 = this.f18093H.m18321c();
            if (m18321c2 != null) {
                Iterator<C7558d> it2 = m18321c2.iterator();
                while (it2.hasNext()) {
                    it2.next().f18068d.m18249e(c7564f, c7543d, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<C7558d> m18321c3 = this.f18092G.m18321c();
        if (m18321c3 != null) {
            Iterator<C7558d> it3 = m18321c3.iterator();
            while (it3.hasNext()) {
                it3.next().f18068d.m18249e(c7564f, c7543d, hashSet, i, true);
            }
        }
        HashSet<C7558d> m18321c4 = this.f18094I.m18321c();
        if (m18321c4 != null) {
            Iterator<C7558d> it4 = m18321c4.iterator();
            while (it4.hasNext()) {
                it4.next().f18068d.m18249e(c7564f, c7543d, hashSet, i, true);
            }
        }
        HashSet<C7558d> m18321c5 = this.f18095J.m18321c();
        if (m18321c5 != null) {
            Iterator<C7558d> it5 = m18321c5.iterator();
            while (it5.hasNext()) {
                it5.next().f18068d.m18249e(c7564f, c7543d, hashSet, i, true);
            }
        }
    }

    /* renamed from: e0 */
    public boolean mo18175e0() {
        return this.f18130j || (this.f18091F.m18311m() && this.f18093H.m18311m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m18248f() {
        return (this instanceof C7570k) || (this instanceof C7565g);
    }

    /* renamed from: f0 */
    public boolean mo18173f0() {
        return this.f18132k || (this.f18092G.m18311m() && this.f18094I.m18311m());
    }

    /* JADX WARN: Removed duplicated region for block: B:206:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05ce  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo18171g(p201g.p219f.p223b.C7543d r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p219f.p223b.p224k.C7561e.mo18171g(g.f.b.d, boolean):void");
    }

    /* renamed from: g0 */
    public boolean m18247g0() {
        EnumC7563b[] enumC7563bArr = this.f18102Q;
        EnumC7563b enumC7563b = enumC7563bArr[0];
        EnumC7563b enumC7563b2 = EnumC7563b.MATCH_CONSTRAINT;
        return enumC7563b == enumC7563b2 && enumC7563bArr[1] == enumC7563b2;
    }

    /* renamed from: h */
    public boolean mo18169h() {
        return this.f18121e0 != 8;
    }

    /* renamed from: h0 */
    public void mo18150h0() {
        this.f18091F.m18308p();
        this.f18092G.m18308p();
        this.f18093H.m18308p();
        this.f18094I.m18308p();
        this.f18095J.m18308p();
        this.f18096K.m18308p();
        this.f18097L.m18308p();
        this.f18098M.m18308p();
        this.f18103R = null;
        this.f18151z = 0.0f;
        this.f18104S = 0;
        this.f18105T = 0;
        this.f18106U = 0.0f;
        this.f18107V = -1;
        this.f18108W = 0;
        this.f18109X = 0;
        this.f18110Y = 0;
        this.f18111Z = 0;
        this.f18113a0 = 0;
        float f = f18085o0;
        this.f18115b0 = f;
        this.f18117c0 = f;
        EnumC7563b[] enumC7563bArr = this.f18102Q;
        EnumC7563b enumC7563b = EnumC7563b.FIXED;
        enumC7563bArr[0] = enumC7563b;
        enumC7563bArr[1] = enumC7563b;
        this.f18119d0 = null;
        this.f18121e0 = 0;
        this.f18125g0 = null;
        this.f18127h0 = 0;
        this.f18129i0 = 0;
        float[] fArr = this.f18131j0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f18134l = -1;
        this.f18136m = -1;
        int[] iArr = this.f18150y;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f18138n = 0;
        this.f18140o = 0;
        this.f18144s = 1.0f;
        this.f18147v = 1.0f;
        this.f18143r = Integer.MAX_VALUE;
        this.f18146u = Integer.MAX_VALUE;
        this.f18142q = 0;
        this.f18145t = 0;
        this.f18148w = -1;
        this.f18149x = 1.0f;
        boolean[] zArr = this.f18122f;
        zArr[0] = true;
        zArr[1] = true;
        this.f18088C = false;
        boolean[] zArr2 = this.f18101P;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f18124g = true;
    }

    /* renamed from: i0 */
    public void m18245i0() {
        this.f18130j = false;
        this.f18132k = false;
        int size = this.f18100O.size();
        for (int i = 0; i < size; i++) {
            this.f18100O.get(i).m18307q();
        }
    }

    /* renamed from: j */
    public void m18244j(C7561e c7561e, float f, int i) {
        C7558d.EnumC7560b enumC7560b = C7558d.EnumC7560b.CENTER;
        m18258X(enumC7560b, c7561e, enumC7560b, i, 0);
        this.f18151z = f;
    }

    /* renamed from: j0 */
    public void mo18149j0(C7542c c7542c) {
        this.f18091F.m18306r(c7542c);
        this.f18092G.m18306r(c7542c);
        this.f18093H.m18306r(c7542c);
        this.f18094I.m18306r(c7542c);
        this.f18095J.m18306r(c7542c);
        this.f18098M.m18306r(c7542c);
        this.f18096K.m18306r(c7542c);
        this.f18097L.m18306r(c7542c);
    }

    /* renamed from: k */
    public void m18243k(C7543d c7543d) {
        c7543d.m18388q(this.f18091F);
        c7543d.m18388q(this.f18092G);
        c7543d.m18388q(this.f18093H);
        c7543d.m18388q(this.f18094I);
        if (this.f18110Y > 0) {
            c7543d.m18388q(this.f18095J);
        }
    }

    /* renamed from: k0 */
    public void m18242k0(int i) {
        this.f18110Y = i;
        this.f18086A = i > 0;
    }

    /* renamed from: l */
    public void m18241l() {
        if (this.f18118d == null) {
            this.f18118d = new C7586l(this);
        }
        if (this.f18120e == null) {
            this.f18120e = new C7589n(this);
        }
    }

    /* renamed from: l0 */
    public void m18240l0(Object obj) {
        this.f18119d0 = obj;
    }

    /* renamed from: m */
    public C7558d mo18165m(C7558d.EnumC7560b enumC7560b) {
        switch (C7562a.f18152a[enumC7560b.ordinal()]) {
            case 1:
                return this.f18091F;
            case 2:
                return this.f18092G;
            case 3:
                return this.f18093H;
            case 4:
                return this.f18094I;
            case 5:
                return this.f18095J;
            case 6:
                return this.f18098M;
            case 7:
                return this.f18096K;
            case 8:
                return this.f18097L;
            case 9:
                return null;
            default:
                throw new AssertionError(enumC7560b.name());
        }
    }

    /* renamed from: m0 */
    public void m18239m0(String str) {
        this.f18123f0 = str;
    }

    /* renamed from: n */
    public int m18238n() {
        return this.f18110Y;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please submit an issue!!! */
    /* renamed from: n0 */
    public void m18237n0(String str) {
        float f;
        int i = 0;
        if (str != null && str.length() != 0) {
            int i2 = -1;
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i3 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i2 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i2 = 1;
                }
                i3 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i3, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        if (i2 == 1) {
                            f = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f = 0.0f;
            } else {
                String substring4 = str.substring(i3);
                if (substring4.length() > 0) {
                    f = Float.parseFloat(substring4);
                }
                f = 0.0f;
            }
            i = (f > i ? 1 : (f == i ? 0 : -1));
            if (i > 0) {
                this.f18106U = f;
                this.f18107V = i2;
                return;
            }
            return;
        }
        this.f18106U = 0.0f;
    }

    /* renamed from: o */
    public float m18236o(int i) {
        if (i == 0) {
            return this.f18115b0;
        }
        if (i == 1) {
            return this.f18117c0;
        }
        return -1.0f;
    }

    /* renamed from: o0 */
    public void m18235o0(int i) {
        if (this.f18086A) {
            int i2 = i - this.f18110Y;
            int i3 = this.f18105T + i2;
            this.f18109X = i2;
            this.f18092G.m18305s(i2);
            this.f18094I.m18305s(i3);
            this.f18095J.m18305s(i);
            this.f18132k = true;
        }
    }

    /* renamed from: p */
    public int m18234p() {
        return m18266T() + this.f18105T;
    }

    /* renamed from: p0 */
    public void m18233p0(int i, int i2) {
        this.f18091F.m18305s(i);
        this.f18093H.m18305s(i2);
        this.f18108W = i;
        this.f18104S = i2 - i;
        this.f18130j = true;
    }

    /* renamed from: q */
    public Object m18232q() {
        return this.f18119d0;
    }

    /* renamed from: q0 */
    public void m18231q0(int i) {
        this.f18091F.m18305s(i);
        this.f18108W = i;
    }

    /* renamed from: r */
    public String m18230r() {
        return this.f18123f0;
    }

    /* renamed from: r0 */
    public void m18229r0(int i) {
        this.f18092G.m18305s(i);
        this.f18109X = i;
    }

    /* renamed from: s */
    public EnumC7563b m18228s(int i) {
        if (i == 0) {
            return m18216y();
        }
        if (i == 1) {
            return m18276O();
        }
        return null;
    }

    /* renamed from: s0 */
    public void m18227s0(int i, int i2) {
        this.f18092G.m18305s(i);
        this.f18094I.m18305s(i2);
        this.f18109X = i;
        this.f18105T = i2 - i;
        if (this.f18086A) {
            this.f18095J.m18305s(i + this.f18110Y);
        }
        this.f18132k = true;
    }

    /* renamed from: t */
    public float m18226t() {
        return this.f18106U;
    }

    /* renamed from: t0 */
    public void m18225t0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.f18108W = i;
        this.f18109X = i2;
        if (this.f18121e0 == 8) {
            this.f18104S = 0;
            this.f18105T = 0;
            return;
        }
        if (this.f18102Q[0] == EnumC7563b.FIXED && i7 < (i6 = this.f18104S)) {
            i7 = i6;
        }
        if (this.f18102Q[1] == EnumC7563b.FIXED && i8 < (i5 = this.f18105T)) {
            i8 = i5;
        }
        this.f18104S = i7;
        this.f18105T = i8;
        int i9 = this.f18113a0;
        if (i8 < i9) {
            this.f18105T = i9;
        }
        int i10 = this.f18104S;
        int i11 = this.f18111Z;
        if (i10 < i11) {
            this.f18104S = i11;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f18125g0 != null) {
            str = "type: " + this.f18125g0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f18123f0 != null) {
            str2 = "id: " + this.f18123f0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f18108W);
        sb.append(", ");
        sb.append(this.f18109X);
        sb.append(") - (");
        sb.append(this.f18104S);
        sb.append(" x ");
        sb.append(this.f18105T);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public int m18224u() {
        return this.f18107V;
    }

    /* renamed from: u0 */
    public void m18223u0(boolean z) {
        this.f18086A = z;
    }

    /* renamed from: v */
    public int m18222v() {
        if (this.f18121e0 == 8) {
            return 0;
        }
        return this.f18105T;
    }

    /* renamed from: v0 */
    public void m18221v0(int i) {
        this.f18105T = i;
        int i2 = this.f18113a0;
        if (i < i2) {
            this.f18105T = i2;
        }
    }

    /* renamed from: w */
    public float m18220w() {
        return this.f18115b0;
    }

    /* renamed from: w0 */
    public void m18219w0(float f) {
        this.f18115b0 = f;
    }

    /* renamed from: x */
    public int m18218x() {
        return this.f18127h0;
    }

    /* renamed from: x0 */
    public void m18217x0(int i) {
        this.f18127h0 = i;
    }

    /* renamed from: y */
    public EnumC7563b m18216y() {
        return this.f18102Q[0];
    }

    /* renamed from: y0 */
    public void m18215y0(int i, int i2) {
        this.f18108W = i;
        int i3 = i2 - i;
        this.f18104S = i3;
        int i4 = this.f18111Z;
        if (i3 < i4) {
            this.f18104S = i4;
        }
    }

    /* renamed from: z */
    public int m18214z() {
        C7558d c7558d = this.f18091F;
        int i = c7558d != null ? 0 + c7558d.f18071g : 0;
        C7558d c7558d2 = this.f18093H;
        return c7558d2 != null ? i + c7558d2.f18071g : i;
    }

    /* renamed from: z0 */
    public void m18213z0(EnumC7563b enumC7563b) {
        this.f18102Q[0] = enumC7563b;
    }
}
