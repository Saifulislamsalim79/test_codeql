package p201g.p219f.p223b;

import java.util.Arrays;
import java.util.HashMap;
import p201g.p219f.p223b.C7552i;
import p201g.p219f.p223b.p224k.C7558d;
import p201g.p219f.p223b.p224k.C7561e;
/* compiled from: LinearSystem.java */
/* renamed from: g.f.b.d */
/* loaded from: classes2.dex */
public class C7543d {

    /* renamed from: r */
    public static boolean f17943r = false;

    /* renamed from: s */
    public static boolean f17944s = true;

    /* renamed from: t */
    public static boolean f17945t = true;

    /* renamed from: u */
    public static boolean f17946u = true;

    /* renamed from: v */
    public static boolean f17947v = false;

    /* renamed from: w */
    private static int f17948w = 1000;

    /* renamed from: x */
    public static C7546e f17949x;

    /* renamed from: y */
    public static long f17950y;

    /* renamed from: z */
    public static long f17951z;

    /* renamed from: d */
    private InterfaceC7544a f17955d;

    /* renamed from: g */
    C7540b[] f17958g;

    /* renamed from: n */
    final C7542c f17965n;

    /* renamed from: q */
    private InterfaceC7544a f17968q;

    /* renamed from: a */
    public boolean f17952a = false;

    /* renamed from: b */
    int f17953b = 0;

    /* renamed from: c */
    private HashMap<String, C7552i> f17954c = null;

    /* renamed from: e */
    private int f17956e = 32;

    /* renamed from: f */
    private int f17957f = 32;

    /* renamed from: h */
    public boolean f17959h = false;

    /* renamed from: i */
    public boolean f17960i = false;

    /* renamed from: j */
    private boolean[] f17961j = new boolean[32];

    /* renamed from: k */
    int f17962k = 1;

    /* renamed from: l */
    int f17963l = 0;

    /* renamed from: m */
    private int f17964m = 32;

    /* renamed from: o */
    private C7552i[] f17966o = new C7552i[f17948w];

    /* renamed from: p */
    private int f17967p = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearSystem.java */
    /* renamed from: g.f.b.d$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC7544a {
        /* renamed from: a */
        void mo18370a(C7552i c7552i);

        /* renamed from: b */
        C7552i mo18369b(C7543d c7543d, boolean[] zArr);

        /* renamed from: c */
        void mo18378c(InterfaceC7544a interfaceC7544a);

        void clear();

        C7552i getKey();

        boolean isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearSystem.java */
    /* renamed from: g.f.b.d$b */
    /* loaded from: classes2.dex */
    public class C7545b extends C7540b {
        public C7545b(C7543d c7543d, C7542c c7542c) {
            this.f17937e = new C7554j(this, c7542c);
        }
    }

    public C7543d() {
        this.f17958g = null;
        this.f17958g = new C7540b[32];
        m18406D();
        C7542c c7542c = new C7542c();
        this.f17965n = c7542c;
        this.f17955d = new C7549h(c7542c);
        if (f17947v) {
            this.f17968q = new C7545b(this, this.f17965n);
        } else {
            this.f17968q = new C7540b(this.f17965n);
        }
    }

    /* renamed from: C */
    private final int m18407C(InterfaceC7544a interfaceC7544a, boolean z) {
        C7546e c7546e = f17949x;
        if (c7546e != null) {
            c7546e.f17977h++;
        }
        for (int i = 0; i < this.f17962k; i++) {
            this.f17961j[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C7546e c7546e2 = f17949x;
            if (c7546e2 != null) {
                c7546e2.f17978i++;
            }
            i2++;
            if (i2 >= this.f17962k * 2) {
                return i2;
            }
            if (interfaceC7544a.getKey() != null) {
                this.f17961j[interfaceC7544a.getKey().f18008c] = true;
            }
            C7552i mo18369b = interfaceC7544a.mo18369b(this, this.f17961j);
            if (mo18369b != null) {
                boolean[] zArr = this.f17961j;
                int i3 = mo18369b.f18008c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (mo18369b != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f17963l; i5++) {
                    C7540b c7540b = this.f17958g[i5];
                    if (c7540b.f17933a.f18015j != C7552i.EnumC7553a.UNRESTRICTED && !c7540b.f17938f && c7540b.m18416t(mo18369b)) {
                        float mo18350f = c7540b.f17937e.mo18350f(mo18369b);
                        if (mo18350f < 0.0f) {
                            float f2 = (-c7540b.f17934b) / mo18350f;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C7540b c7540b2 = this.f17958g[i4];
                    c7540b2.f17933a.f18009d = -1;
                    C7546e c7546e3 = f17949x;
                    if (c7546e3 != null) {
                        c7546e3.f17979j++;
                    }
                    c7540b2.m18412x(mo18369b);
                    C7552i c7552i = c7540b2.f17933a;
                    c7552i.f18009d = i4;
                    c7552i.m18356g(this, c7540b2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: D */
    private void m18406D() {
        int i = 0;
        if (f17947v) {
            while (i < this.f17963l) {
                C7540b c7540b = this.f17958g[i];
                if (c7540b != null) {
                    this.f17965n.f17939a.mo18377a(c7540b);
                }
                this.f17958g[i] = null;
                i++;
            }
            return;
        }
        while (i < this.f17963l) {
            C7540b c7540b2 = this.f17958g[i];
            if (c7540b2 != null) {
                this.f17965n.f17940b.mo18377a(c7540b2);
            }
            this.f17958g[i] = null;
            i++;
        }
    }

    /* renamed from: a */
    private C7552i m18404a(C7552i.EnumC7553a enumC7553a, String str) {
        C7552i mo18376b = this.f17965n.f17941c.mo18376b();
        if (mo18376b == null) {
            mo18376b = new C7552i(enumC7553a, str);
            mo18376b.m18357f(enumC7553a, str);
        } else {
            mo18376b.m18359d();
            mo18376b.m18357f(enumC7553a, str);
        }
        int i = this.f17967p;
        int i2 = f17948w;
        if (i >= i2) {
            int i3 = i2 * 2;
            f17948w = i3;
            this.f17966o = (C7552i[]) Arrays.copyOf(this.f17966o, i3);
        }
        C7552i[] c7552iArr = this.f17966o;
        int i4 = this.f17967p;
        this.f17967p = i4 + 1;
        c7552iArr[i4] = mo18376b;
        return mo18376b;
    }

    /* renamed from: l */
    private final void m18393l(C7540b c7540b) {
        int i;
        if (f17945t && c7540b.f17938f) {
            c7540b.f17933a.m18358e(this, c7540b.f17934b);
        } else {
            C7540b[] c7540bArr = this.f17958g;
            int i2 = this.f17963l;
            c7540bArr[i2] = c7540b;
            C7552i c7552i = c7540b.f17933a;
            c7552i.f18009d = i2;
            this.f17963l = i2 + 1;
            c7552i.m18356g(this, c7540b);
        }
        if (f17945t && this.f17952a) {
            int i3 = 0;
            while (i3 < this.f17963l) {
                if (this.f17958g[i3] == null) {
                    System.out.println("WTF");
                }
                C7540b[] c7540bArr2 = this.f17958g;
                if (c7540bArr2[i3] != null && c7540bArr2[i3].f17938f) {
                    C7540b c7540b2 = c7540bArr2[i3];
                    c7540b2.f17933a.m18358e(this, c7540b2.f17934b);
                    if (f17947v) {
                        this.f17965n.f17939a.mo18377a(c7540b2);
                    } else {
                        this.f17965n.f17940b.mo18377a(c7540b2);
                    }
                    this.f17958g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f17963l;
                        if (i4 >= i) {
                            break;
                        }
                        C7540b[] c7540bArr3 = this.f17958g;
                        int i6 = i4 - 1;
                        c7540bArr3[i6] = c7540bArr3[i4];
                        if (c7540bArr3[i6].f17933a.f18009d == i4) {
                            c7540bArr3[i6].f17933a.f18009d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f17958g[i5] = null;
                    }
                    this.f17963l--;
                    i3--;
                }
                i3++;
            }
            this.f17952a = false;
        }
    }

    /* renamed from: n */
    private void m18391n() {
        for (int i = 0; i < this.f17963l; i++) {
            C7540b c7540b = this.f17958g[i];
            c7540b.f17933a.f18011f = c7540b.f17934b;
        }
    }

    /* renamed from: s */
    public static C7540b m18386s(C7543d c7543d, C7552i c7552i, C7552i c7552i2, float f) {
        C7540b m18387r = c7543d.m18387r();
        m18387r.m18426j(c7552i, c7552i2, f);
        return m18387r;
    }

    /* renamed from: u */
    private int m18384u(InterfaceC7544a interfaceC7544a) throws Exception {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.f17963l) {
                z = false;
                break;
            }
            C7540b[] c7540bArr = this.f17958g;
            if (c7540bArr[i].f17933a.f18015j != C7552i.EnumC7553a.UNRESTRICTED && c7540bArr[i].f17934b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                C7546e c7546e = f17949x;
                if (c7546e != null) {
                    c7546e.f17980k++;
                }
                i2++;
                float f = Float.MAX_VALUE;
                int i3 = -1;
                int i4 = -1;
                int i5 = 0;
                for (int i6 = 0; i6 < this.f17963l; i6++) {
                    C7540b c7540b = this.f17958g[i6];
                    if (c7540b.f17933a.f18015j != C7552i.EnumC7553a.UNRESTRICTED && !c7540b.f17938f && c7540b.f17934b < 0.0f) {
                        int i7 = 9;
                        if (f17946u) {
                            int mo18355a = c7540b.f17937e.mo18355a();
                            int i8 = 0;
                            while (i8 < mo18355a) {
                                C7552i mo18354b = c7540b.f17937e.mo18354b(i8);
                                float mo18350f = c7540b.f17937e.mo18350f(mo18354b);
                                if (mo18350f > 0.0f) {
                                    int i9 = 0;
                                    while (i9 < i7) {
                                        float f2 = mo18354b.f18013h[i9] / mo18350f;
                                        if ((f2 < f && i9 == i5) || i9 > i5) {
                                            i4 = mo18354b.f18008c;
                                            i5 = i9;
                                            i3 = i6;
                                            f = f2;
                                        }
                                        i9++;
                                        i7 = 9;
                                    }
                                }
                                i8++;
                                i7 = 9;
                            }
                        } else {
                            for (int i10 = 1; i10 < this.f17962k; i10++) {
                                C7552i c7552i = this.f17965n.f17942d[i10];
                                float mo18350f2 = c7540b.f17937e.mo18350f(c7552i);
                                if (mo18350f2 > 0.0f) {
                                    for (int i11 = 0; i11 < 9; i11++) {
                                        float f3 = c7552i.f18013h[i11] / mo18350f2;
                                        if ((f3 < f && i11 == i5) || i11 > i5) {
                                            i4 = i10;
                                            i5 = i11;
                                            i3 = i6;
                                            f = f3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i3 != -1) {
                    C7540b c7540b2 = this.f17958g[i3];
                    c7540b2.f17933a.f18009d = -1;
                    C7546e c7546e2 = f17949x;
                    if (c7546e2 != null) {
                        c7546e2.f17979j++;
                    }
                    c7540b2.m18412x(this.f17965n.f17942d[i4]);
                    C7552i c7552i2 = c7540b2.f17933a;
                    c7552i2.f18009d = i3;
                    c7552i2.m18356g(this, c7540b2);
                } else {
                    z2 = true;
                }
                if (i2 > this.f17962k / 2) {
                    z2 = true;
                }
            }
            return i2;
        }
        return 0;
    }

    /* renamed from: x */
    public static C7546e m18381x() {
        return f17949x;
    }

    /* renamed from: z */
    private void m18379z() {
        int i = this.f17956e * 2;
        this.f17956e = i;
        this.f17958g = (C7540b[]) Arrays.copyOf(this.f17958g, i);
        C7542c c7542c = this.f17965n;
        c7542c.f17942d = (C7552i[]) Arrays.copyOf(c7542c.f17942d, this.f17956e);
        int i2 = this.f17956e;
        this.f17961j = new boolean[i2];
        this.f17957f = i2;
        this.f17964m = i2;
        C7546e c7546e = f17949x;
        if (c7546e != null) {
            c7546e.f17973d++;
            c7546e.f17984o = Math.max(c7546e.f17984o, i2);
            C7546e c7546e2 = f17949x;
            c7546e2.f17993x = c7546e2.f17984o;
        }
    }

    /* renamed from: A */
    public void m18409A() throws Exception {
        C7546e c7546e = f17949x;
        if (c7546e != null) {
            c7546e.f17974e++;
        }
        if (this.f17955d.isEmpty()) {
            m18391n();
        } else if (!this.f17959h && !this.f17960i) {
            m18408B(this.f17955d);
        } else {
            C7546e c7546e2 = f17949x;
            if (c7546e2 != null) {
                c7546e2.f17986q++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f17963l) {
                    z = true;
                    break;
                } else if (!this.f17958g[i].f17938f) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                m18408B(this.f17955d);
                return;
            }
            C7546e c7546e3 = f17949x;
            if (c7546e3 != null) {
                c7546e3.f17985p++;
            }
            m18391n();
        }
    }

    /* renamed from: B */
    void m18408B(InterfaceC7544a interfaceC7544a) throws Exception {
        C7546e c7546e = f17949x;
        if (c7546e != null) {
            c7546e.f17989t++;
            c7546e.f17990u = Math.max(c7546e.f17990u, this.f17962k);
            C7546e c7546e2 = f17949x;
            c7546e2.f17991v = Math.max(c7546e2.f17991v, this.f17963l);
        }
        m18384u(interfaceC7544a);
        m18407C(interfaceC7544a, false);
        m18391n();
    }

    /* renamed from: E */
    public void m18405E() {
        C7542c c7542c;
        int i = 0;
        while (true) {
            c7542c = this.f17965n;
            C7552i[] c7552iArr = c7542c.f17942d;
            if (i >= c7552iArr.length) {
                break;
            }
            C7552i c7552i = c7552iArr[i];
            if (c7552i != null) {
                c7552i.m18359d();
            }
            i++;
        }
        c7542c.f17941c.mo18375c(this.f17966o, this.f17967p);
        this.f17967p = 0;
        Arrays.fill(this.f17965n.f17942d, (Object) null);
        HashMap<String, C7552i> hashMap = this.f17954c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f17953b = 0;
        this.f17955d.clear();
        this.f17962k = 1;
        for (int i2 = 0; i2 < this.f17963l; i2++) {
            C7540b[] c7540bArr = this.f17958g;
            if (c7540bArr[i2] != null) {
                c7540bArr[i2].f17935c = false;
            }
        }
        m18406D();
        this.f17963l = 0;
        if (f17947v) {
            this.f17968q = new C7545b(this, this.f17965n);
        } else {
            this.f17968q = new C7540b(this.f17965n);
        }
    }

    /* renamed from: b */
    public void m18403b(C7561e c7561e, C7561e c7561e2, float f, int i) {
        C7552i m18388q = m18388q(c7561e.mo18165m(C7558d.EnumC7560b.LEFT));
        C7552i m18388q2 = m18388q(c7561e.mo18165m(C7558d.EnumC7560b.TOP));
        C7552i m18388q3 = m18388q(c7561e.mo18165m(C7558d.EnumC7560b.RIGHT));
        C7552i m18388q4 = m18388q(c7561e.mo18165m(C7558d.EnumC7560b.BOTTOM));
        C7552i m18388q5 = m18388q(c7561e2.mo18165m(C7558d.EnumC7560b.LEFT));
        C7552i m18388q6 = m18388q(c7561e2.mo18165m(C7558d.EnumC7560b.TOP));
        C7552i m18388q7 = m18388q(c7561e2.mo18165m(C7558d.EnumC7560b.RIGHT));
        C7552i m18388q8 = m18388q(c7561e2.mo18165m(C7558d.EnumC7560b.BOTTOM));
        C7540b m18387r = m18387r();
        double d = f;
        double sin = Math.sin(d);
        double d2 = i;
        Double.isNaN(d2);
        m18387r.m18419q(m18388q2, m18388q4, m18388q6, m18388q8, (float) (sin * d2));
        m18401d(m18387r);
        C7540b m18387r2 = m18387r();
        double cos = Math.cos(d);
        Double.isNaN(d2);
        m18387r2.m18419q(m18388q, m18388q3, m18388q5, m18388q7, (float) (cos * d2));
        m18401d(m18387r2);
    }

    /* renamed from: c */
    public void m18402c(C7552i c7552i, C7552i c7552i2, int i, float f, C7552i c7552i3, C7552i c7552i4, int i2, int i3) {
        C7540b m18387r = m18387r();
        m18387r.m18428h(c7552i, c7552i2, i, f, c7552i3, c7552i4, i2);
        if (i3 != 8) {
            m18387r.m18432d(this, i3);
        }
        m18401d(m18387r);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m18401d(p201g.p219f.p223b.C7540b r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            g.f.b.e r0 = p201g.p219f.p223b.C7543d.f17949x
            r1 = 1
            if (r0 == 0) goto L17
            long r3 = r0.f17975f
            long r3 = r3 + r1
            r0.f17975f = r3
            boolean r3 = r8.f17938f
            if (r3 == 0) goto L17
            long r3 = r0.f17976g
            long r3 = r3 + r1
            r0.f17976g = r3
        L17:
            int r0 = r7.f17963l
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.f17964m
            if (r0 >= r4) goto L26
            int r0 = r7.f17962k
            int r0 = r0 + r3
            int r4 = r7.f17957f
            if (r0 < r4) goto L29
        L26:
            r7.m18379z()
        L29:
            r0 = 0
            boolean r4 = r8.f17938f
            if (r4 != 0) goto La1
            r8.m18433D(r7)
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L38
            return
        L38:
            r8.m18418r()
            boolean r4 = r8.m18430f(r7)
            if (r4 == 0) goto L98
            g.f.b.i r4 = r7.m18389p()
            r8.f17933a = r4
            int r5 = r7.f17963l
            r7.m18393l(r8)
            int r6 = r7.f17963l
            int r5 = r5 + r3
            if (r6 != r5) goto L98
            g.f.b.d$a r0 = r7.f17968q
            r0.mo18378c(r8)
            g.f.b.d$a r0 = r7.f17968q
            r7.m18407C(r0, r3)
            int r0 = r4.f18009d
            r5 = -1
            if (r0 != r5) goto L99
            g.f.b.i r0 = r8.f17933a
            if (r0 != r4) goto L76
            g.f.b.i r0 = r8.m18414v(r4)
            if (r0 == 0) goto L76
            g.f.b.e r4 = p201g.p219f.p223b.C7543d.f17949x
            if (r4 == 0) goto L73
            long r5 = r4.f17979j
            long r5 = r5 + r1
            r4.f17979j = r5
        L73:
            r8.m18412x(r0)
        L76:
            boolean r0 = r8.f17938f
            if (r0 != 0) goto L7f
            g.f.b.i r0 = r8.f17933a
            r0.m18356g(r7, r8)
        L7f:
            boolean r0 = p201g.p219f.p223b.C7543d.f17947v
            if (r0 == 0) goto L8b
            g.f.b.c r0 = r7.f17965n
            g.f.b.f<g.f.b.b> r0 = r0.f17939a
            r0.mo18377a(r8)
            goto L92
        L8b:
            g.f.b.c r0 = r7.f17965n
            g.f.b.f<g.f.b.b> r0 = r0.f17940b
            r0.mo18377a(r8)
        L92:
            int r0 = r7.f17963l
            int r0 = r0 - r3
            r7.f17963l = r0
            goto L99
        L98:
            r3 = 0
        L99:
            boolean r0 = r8.m18417s()
            if (r0 != 0) goto La0
            return
        La0:
            r0 = r3
        La1:
            if (r0 != 0) goto La6
            r7.m18393l(r8)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p219f.p223b.C7543d.m18401d(g.f.b.b):void");
    }

    /* renamed from: e */
    public C7540b m18400e(C7552i c7552i, C7552i c7552i2, int i, int i2) {
        if (f17944s && i2 == 8 && c7552i2.f18012g && c7552i.f18009d == -1) {
            c7552i.m18358e(this, c7552i2.f18011f + i);
            return null;
        }
        C7540b m18387r = m18387r();
        m18387r.m18422n(c7552i, c7552i2, i);
        if (i2 != 8) {
            m18387r.m18432d(this, i2);
        }
        m18401d(m18387r);
        return m18387r;
    }

    /* renamed from: f */
    public void m18399f(C7552i c7552i, int i) {
        if (f17944s && c7552i.f18009d == -1) {
            float f = i;
            c7552i.m18358e(this, f);
            for (int i2 = 0; i2 < this.f17953b + 1; i2++) {
                C7552i c7552i2 = this.f17965n.f17942d[i2];
                if (c7552i2 != null && c7552i2.f18019n && c7552i2.f18020o == c7552i.f18008c) {
                    c7552i2.m18358e(this, c7552i2.f18021p + f);
                }
            }
            return;
        }
        int i3 = c7552i.f18009d;
        if (i3 != -1) {
            C7540b c7540b = this.f17958g[i3];
            if (c7540b.f17938f) {
                c7540b.f17934b = i;
                return;
            } else if (c7540b.f17937e.mo18355a() == 0) {
                c7540b.f17938f = true;
                c7540b.f17934b = i;
                return;
            } else {
                C7540b m18387r = m18387r();
                m18387r.m18423m(c7552i, i);
                m18401d(m18387r);
                return;
            }
        }
        C7540b m18387r2 = m18387r();
        m18387r2.m18427i(c7552i, i);
        m18401d(m18387r2);
    }

    /* renamed from: g */
    public void m18398g(C7552i c7552i, C7552i c7552i2, int i, boolean z) {
        C7540b m18387r = m18387r();
        C7552i m18385t = m18385t();
        m18385t.f18010e = 0;
        m18387r.m18421o(c7552i, c7552i2, m18385t, i);
        m18401d(m18387r);
    }

    /* renamed from: h */
    public void m18397h(C7552i c7552i, C7552i c7552i2, int i, int i2) {
        C7540b m18387r = m18387r();
        C7552i m18385t = m18385t();
        m18385t.f18010e = 0;
        m18387r.m18421o(c7552i, c7552i2, m18385t, i);
        if (i2 != 8) {
            m18392m(m18387r, (int) (m18387r.f17937e.mo18350f(m18385t) * (-1.0f)), i2);
        }
        m18401d(m18387r);
    }

    /* renamed from: i */
    public void m18396i(C7552i c7552i, C7552i c7552i2, int i, boolean z) {
        C7540b m18387r = m18387r();
        C7552i m18385t = m18385t();
        m18385t.f18010e = 0;
        m18387r.m18420p(c7552i, c7552i2, m18385t, i);
        m18401d(m18387r);
    }

    /* renamed from: j */
    public void m18395j(C7552i c7552i, C7552i c7552i2, int i, int i2) {
        C7540b m18387r = m18387r();
        C7552i m18385t = m18385t();
        m18385t.f18010e = 0;
        m18387r.m18420p(c7552i, c7552i2, m18385t, i);
        if (i2 != 8) {
            m18392m(m18387r, (int) (m18387r.f17937e.mo18350f(m18385t) * (-1.0f)), i2);
        }
        m18401d(m18387r);
    }

    /* renamed from: k */
    public void m18394k(C7552i c7552i, C7552i c7552i2, C7552i c7552i3, C7552i c7552i4, float f, int i) {
        C7540b m18387r = m18387r();
        m18387r.m18425k(c7552i, c7552i2, c7552i3, c7552i4, f);
        if (i != 8) {
            m18387r.m18432d(this, i);
        }
        m18401d(m18387r);
    }

    /* renamed from: m */
    void m18392m(C7540b c7540b, int i, int i2) {
        c7540b.m18431e(m18390o(i2, null), i);
    }

    /* renamed from: o */
    public C7552i m18390o(int i, String str) {
        C7546e c7546e = f17949x;
        if (c7546e != null) {
            c7546e.f17981l++;
        }
        if (this.f17962k + 1 >= this.f17957f) {
            m18379z();
        }
        C7552i m18404a = m18404a(C7552i.EnumC7553a.ERROR, str);
        int i2 = this.f17953b + 1;
        this.f17953b = i2;
        this.f17962k++;
        m18404a.f18008c = i2;
        m18404a.f18010e = i;
        this.f17965n.f17942d[i2] = m18404a;
        this.f17955d.mo18370a(m18404a);
        return m18404a;
    }

    /* renamed from: p */
    public C7552i m18389p() {
        C7546e c7546e = f17949x;
        if (c7546e != null) {
            c7546e.f17983n++;
        }
        if (this.f17962k + 1 >= this.f17957f) {
            m18379z();
        }
        C7552i m18404a = m18404a(C7552i.EnumC7553a.SLACK, null);
        int i = this.f17953b + 1;
        this.f17953b = i;
        this.f17962k++;
        m18404a.f18008c = i;
        this.f17965n.f17942d[i] = m18404a;
        return m18404a;
    }

    /* renamed from: q */
    public C7552i m18388q(Object obj) {
        C7552i c7552i = null;
        if (obj == null) {
            return null;
        }
        if (this.f17962k + 1 >= this.f17957f) {
            m18379z();
        }
        if (obj instanceof C7558d) {
            C7558d c7558d = (C7558d) obj;
            c7552i = c7558d.m18316h();
            if (c7552i == null) {
                c7558d.m18306r(this.f17965n);
                c7552i = c7558d.m18316h();
            }
            int i = c7552i.f18008c;
            if (i == -1 || i > this.f17953b || this.f17965n.f17942d[i] == null) {
                if (c7552i.f18008c != -1) {
                    c7552i.m18359d();
                }
                int i2 = this.f17953b + 1;
                this.f17953b = i2;
                this.f17962k++;
                c7552i.f18008c = i2;
                c7552i.f18015j = C7552i.EnumC7553a.UNRESTRICTED;
                this.f17965n.f17942d[i2] = c7552i;
            }
        }
        return c7552i;
    }

    /* renamed from: r */
    public C7540b m18387r() {
        C7540b mo18376b;
        if (f17947v) {
            mo18376b = this.f17965n.f17939a.mo18376b();
            if (mo18376b == null) {
                mo18376b = new C7545b(this, this.f17965n);
                f17951z++;
            } else {
                mo18376b.m18411y();
            }
        } else {
            mo18376b = this.f17965n.f17940b.mo18376b();
            if (mo18376b == null) {
                mo18376b = new C7540b(this.f17965n);
                f17950y++;
            } else {
                mo18376b.m18411y();
            }
        }
        C7552i.m18361b();
        return mo18376b;
    }

    /* renamed from: t */
    public C7552i m18385t() {
        C7546e c7546e = f17949x;
        if (c7546e != null) {
            c7546e.f17982m++;
        }
        if (this.f17962k + 1 >= this.f17957f) {
            m18379z();
        }
        C7552i m18404a = m18404a(C7552i.EnumC7553a.SLACK, null);
        int i = this.f17953b + 1;
        this.f17953b = i;
        this.f17962k++;
        m18404a.f18008c = i;
        this.f17965n.f17942d[i] = m18404a;
        return m18404a;
    }

    /* renamed from: v */
    public void m18383v(C7546e c7546e) {
        f17949x = c7546e;
    }

    /* renamed from: w */
    public C7542c m18382w() {
        return this.f17965n;
    }

    /* renamed from: y */
    public int m18380y(Object obj) {
        C7552i m18316h = ((C7558d) obj).m18316h();
        if (m18316h != null) {
            return (int) (m18316h.f18011f + 0.5f);
        }
        return 0;
    }
}
