package p201g.p219f.p223b.p224k.p225m;

import java.util.ArrayList;
import p201g.p219f.p223b.C7543d;
import p201g.p219f.p223b.C7546e;
import p201g.p219f.p223b.p224k.C7558d;
import p201g.p219f.p223b.p224k.C7561e;
import p201g.p219f.p223b.p224k.C7564f;
import p201g.p219f.p223b.p224k.C7565g;
import p201g.p219f.p223b.p224k.C7569j;
import p201g.p219f.p223b.p224k.C7570k;
import p201g.p219f.p223b.p224k.InterfaceC7567h;
/* compiled from: BasicMeasure.java */
/* renamed from: g.f.b.k.m.b */
/* loaded from: classes2.dex */
public class C7573b {

    /* renamed from: a */
    private final ArrayList<C7561e> f18191a = new ArrayList<>();

    /* renamed from: b */
    private C7574a f18192b = new C7574a();

    /* renamed from: c */
    private C7564f f18193c;

    /* compiled from: BasicMeasure.java */
    /* renamed from: g.f.b.k.m.b$a */
    /* loaded from: classes2.dex */
    public static class C7574a {

        /* renamed from: k */
        public static int f18194k = 0;

        /* renamed from: l */
        public static int f18195l = 1;

        /* renamed from: m */
        public static int f18196m = 2;

        /* renamed from: a */
        public C7561e.EnumC7563b f18197a;

        /* renamed from: b */
        public C7561e.EnumC7563b f18198b;

        /* renamed from: c */
        public int f18199c;

        /* renamed from: d */
        public int f18200d;

        /* renamed from: e */
        public int f18201e;

        /* renamed from: f */
        public int f18202f;

        /* renamed from: g */
        public int f18203g;

        /* renamed from: h */
        public boolean f18204h;

        /* renamed from: i */
        public boolean f18205i;

        /* renamed from: j */
        public int f18206j;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: g.f.b.k.m.b$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC7575b {
        /* renamed from: a */
        void mo18143a();

        /* renamed from: b */
        void mo18142b(C7561e c7561e, C7574a c7574a);
    }

    public C7573b(C7564f c7564f) {
        this.f18193c = c7564f;
    }

    /* renamed from: a */
    private boolean m18148a(InterfaceC7575b interfaceC7575b, C7561e c7561e, int i) {
        this.f18192b.f18197a = c7561e.m18216y();
        this.f18192b.f18198b = c7561e.m18276O();
        this.f18192b.f18199c = c7561e.m18270R();
        this.f18192b.f18200d = c7561e.m18222v();
        C7574a c7574a = this.f18192b;
        c7574a.f18205i = false;
        c7574a.f18206j = i;
        boolean z = c7574a.f18197a == C7561e.EnumC7563b.MATCH_CONSTRAINT;
        boolean z2 = this.f18192b.f18198b == C7561e.EnumC7563b.MATCH_CONSTRAINT;
        boolean z3 = z && c7561e.f18106U > 0.0f;
        boolean z4 = z2 && c7561e.f18106U > 0.0f;
        if (z3 && c7561e.f18141p[0] == 4) {
            this.f18192b.f18197a = C7561e.EnumC7563b.FIXED;
        }
        if (z4 && c7561e.f18141p[1] == 4) {
            this.f18192b.f18198b = C7561e.EnumC7563b.FIXED;
        }
        interfaceC7575b.mo18142b(c7561e, this.f18192b);
        c7561e.m18263U0(this.f18192b.f18201e);
        c7561e.m18221v0(this.f18192b.f18202f);
        c7561e.m18223u0(this.f18192b.f18204h);
        c7561e.m18242k0(this.f18192b.f18203g);
        C7574a c7574a2 = this.f18192b;
        c7574a2.f18206j = C7574a.f18194k;
        return c7574a2.f18205i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
        if (r8 != r10) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r5.f18106U <= 0.0f) goto L61;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m18147b(p201g.p219f.p223b.p224k.C7564f r13) {
        /*
            r12 = this;
            java.util.ArrayList<g.f.b.k.e> r0 = r13.f18190p0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.m18210C1(r1)
            g.f.b.k.m.b$b r2 = r13.m18188s1()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r0) goto Lb6
            java.util.ArrayList<g.f.b.k.e> r5 = r13.f18190p0
            java.lang.Object r5 = r5.get(r4)
            g.f.b.k.e r5 = (p201g.p219f.p223b.p224k.C7561e) r5
            boolean r6 = r5 instanceof p201g.p219f.p223b.p224k.C7565g
            if (r6 == 0) goto L22
            goto Lb2
        L22:
            boolean r6 = r5 instanceof p201g.p219f.p223b.p224k.C7555a
            if (r6 == 0) goto L28
            goto Lb2
        L28:
            boolean r6 = r5.m18252c0()
            if (r6 == 0) goto L30
            goto Lb2
        L30:
            if (r1 == 0) goto L48
            g.f.b.k.m.l r6 = r5.f18118d
            if (r6 == 0) goto L48
            g.f.b.k.m.n r7 = r5.f18120e
            if (r7 == 0) goto L48
            g.f.b.k.m.g r6 = r6.f18259e
            boolean r6 = r6.f18226j
            if (r6 == 0) goto L48
            g.f.b.k.m.g r6 = r7.f18259e
            boolean r6 = r6.f18226j
            if (r6 == 0) goto L48
            goto Lb2
        L48:
            g.f.b.k.e$b r6 = r5.m18228s(r3)
            r7 = 1
            g.f.b.k.e$b r8 = r5.m18228s(r7)
            g.f.b.k.e$b r9 = p201g.p219f.p223b.p224k.C7561e.EnumC7563b.MATCH_CONSTRAINT
            if (r6 != r9) goto L61
            int r10 = r5.f18138n
            if (r10 == r7) goto L61
            if (r8 != r9) goto L61
            int r9 = r5.f18140o
            if (r9 == r7) goto L61
            r9 = 1
            goto L62
        L61:
            r9 = 0
        L62:
            if (r9 != 0) goto L9e
            boolean r10 = r13.m18210C1(r7)
            if (r10 == 0) goto L9e
            boolean r10 = r5 instanceof p201g.p219f.p223b.p224k.C7570k
            if (r10 != 0) goto L9e
            g.f.b.k.e$b r10 = p201g.p219f.p223b.p224k.C7561e.EnumC7563b.MATCH_CONSTRAINT
            if (r6 != r10) goto L7f
            int r11 = r5.f18138n
            if (r11 != 0) goto L7f
            if (r8 == r10) goto L7f
            boolean r10 = r5.m18255Z()
            if (r10 != 0) goto L7f
            r9 = 1
        L7f:
            g.f.b.k.e$b r10 = p201g.p219f.p223b.p224k.C7561e.EnumC7563b.MATCH_CONSTRAINT
            if (r8 != r10) goto L90
            int r11 = r5.f18140o
            if (r11 != 0) goto L90
            if (r6 == r10) goto L90
            boolean r10 = r5.m18255Z()
            if (r10 != 0) goto L90
            r9 = 1
        L90:
            g.f.b.k.e$b r10 = p201g.p219f.p223b.p224k.C7561e.EnumC7563b.MATCH_CONSTRAINT
            if (r6 == r10) goto L96
            if (r8 != r10) goto L9e
        L96:
            float r6 = r5.f18106U
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L9e
            goto L9f
        L9e:
            r7 = r9
        L9f:
            if (r7 == 0) goto La2
            goto Lb2
        La2:
            int r6 = p201g.p219f.p223b.p224k.p225m.C7573b.C7574a.f18194k
            r12.m18148a(r2, r5, r6)
            g.f.b.e r5 = r13.f18173u0
            if (r5 == 0) goto Lb2
            long r6 = r5.f17970a
            r8 = 1
            long r6 = r6 + r8
            r5.f17970a = r6
        Lb2:
            int r4 = r4 + 1
            goto L12
        Lb6:
            r2.mo18143a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p219f.p223b.p224k.p225m.C7573b.m18147b(g.f.b.k.f):void");
    }

    /* renamed from: c */
    private void m18146c(C7564f c7564f, String str, int i, int i2) {
        int m18292G = c7564f.m18292G();
        int m18294F = c7564f.m18294F();
        c7564f.m18283K0(0);
        c7564f.m18285J0(0);
        c7564f.m18263U0(i);
        c7564f.m18221v0(i2);
        c7564f.m18283K0(m18292G);
        c7564f.m18285J0(m18294F);
        this.f18193c.mo18153b1();
    }

    /* renamed from: d */
    public long m18145d(C7564f c7564f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        int i10;
        int i11;
        boolean z2;
        boolean z3;
        boolean z4;
        int i12;
        InterfaceC7575b interfaceC7575b;
        int i13;
        int i14;
        int i15;
        boolean z5;
        C7546e c7546e;
        InterfaceC7575b m18188s1 = c7564f.m18188s1();
        int size = c7564f.f18190p0.size();
        int m18270R = c7564f.m18270R();
        int m18222v = c7564f.m18222v();
        boolean m18159b = C7569j.m18159b(i, 128);
        boolean z6 = m18159b || C7569j.m18159b(i, 64);
        if (z6) {
            for (int i16 = 0; i16 < size; i16++) {
                C7561e c7561e = c7564f.f18190p0.get(i16);
                boolean z7 = (c7561e.m18216y() == C7561e.EnumC7563b.MATCH_CONSTRAINT) && (c7561e.m18276O() == C7561e.EnumC7563b.MATCH_CONSTRAINT) && c7561e.m18226t() > 0.0f;
                if ((c7561e.m18255Z() && z7) || ((c7561e.m18253b0() && z7) || (c7561e instanceof C7570k) || c7561e.m18255Z() || c7561e.m18253b0())) {
                    z6 = false;
                    break;
                }
            }
        }
        if (z6 && (c7546e = C7543d.f17949x) != null) {
            c7546e.f17972c++;
        }
        boolean z8 = z6 & ((i4 == 1073741824 && i6 == 1073741824) || m18159b);
        if (z8) {
            int min = Math.min(c7564f.m18296E(), i5);
            int min2 = Math.min(c7564f.m18298D(), i7);
            if (i4 == 1073741824 && c7564f.m18270R() != min) {
                c7564f.m18263U0(min);
                c7564f.m18185v1();
            }
            if (i6 == 1073741824 && c7564f.m18222v() != min2) {
                c7564f.m18221v0(min2);
                c7564f.m18185v1();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                z = c7564f.m18192o1(m18159b);
                i10 = 2;
            } else {
                boolean m18191p1 = c7564f.m18191p1(m18159b);
                if (i4 == 1073741824) {
                    m18191p1 &= c7564f.m18190q1(m18159b, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    z = c7564f.m18190q1(m18159b, 1) & m18191p1;
                    i10++;
                } else {
                    z = m18191p1;
                }
            }
            if (z) {
                c7564f.mo18203Y0(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            z = false;
            i10 = 0;
        }
        if (z && i10 == 2) {
            return 0L;
        }
        int m18187t1 = c7564f.m18187t1();
        if (size > 0) {
            m18147b(c7564f);
        }
        m18144e(c7564f);
        int size2 = this.f18191a.size();
        if (size > 0) {
            m18146c(c7564f, "First pass", m18270R, m18222v);
        }
        if (size2 > 0) {
            boolean z9 = c7564f.m18216y() == C7561e.EnumC7563b.WRAP_CONTENT;
            boolean z10 = c7564f.m18276O() == C7561e.EnumC7563b.WRAP_CONTENT;
            int max = Math.max(c7564f.m18270R(), this.f18193c.m18292G());
            int max2 = Math.max(c7564f.m18222v(), this.f18193c.m18294F());
            int i17 = 0;
            boolean z11 = false;
            while (i17 < size2) {
                C7561e c7561e2 = this.f18191a.get(i17);
                if (c7561e2 instanceof C7570k) {
                    int m18270R2 = c7561e2.m18270R();
                    i13 = m18187t1;
                    int m18222v2 = c7561e2.m18222v();
                    i14 = m18270R;
                    boolean m18148a = m18148a(m18188s1, c7561e2, C7574a.f18195l) | z11;
                    C7546e c7546e2 = c7564f.f18173u0;
                    i15 = m18222v;
                    if (c7546e2 != null) {
                        c7546e2.f17971b++;
                    }
                    int m18270R3 = c7561e2.m18270R();
                    int m18222v3 = c7561e2.m18222v();
                    if (m18270R3 != m18270R2) {
                        c7561e2.m18263U0(m18270R3);
                        if (z9 && c7561e2.m18284K() > max) {
                            max = Math.max(max, c7561e2.m18284K() + c7561e2.mo18165m(C7558d.EnumC7560b.RIGHT).m18319e());
                        }
                        z5 = true;
                    } else {
                        z5 = m18148a;
                    }
                    if (m18222v3 != m18222v2) {
                        c7561e2.m18221v0(m18222v3);
                        if (z10 && c7561e2.m18234p() > max2) {
                            max2 = Math.max(max2, c7561e2.m18234p() + c7561e2.mo18165m(C7558d.EnumC7560b.BOTTOM).m18319e());
                        }
                        z5 = true;
                    }
                    z11 = z5 | ((C7570k) c7561e2).m18156d1();
                } else {
                    i13 = m18187t1;
                    i14 = m18270R;
                    i15 = m18222v;
                }
                i17++;
                m18187t1 = i13;
                m18270R = i14;
                m18222v = i15;
            }
            int i18 = m18187t1;
            int i19 = m18270R;
            int i20 = m18222v;
            int i21 = 0;
            int i22 = 2;
            while (i21 < i22) {
                int i23 = 0;
                while (i23 < size2) {
                    C7561e c7561e3 = this.f18191a.get(i23);
                    if (((c7561e3 instanceof InterfaceC7567h) && !(c7561e3 instanceof C7570k)) || (c7561e3 instanceof C7565g) || c7561e3.m18272Q() == 8 || ((z8 && c7561e3.f18118d.f18259e.f18226j && c7561e3.f18120e.f18259e.f18226j) || (c7561e3 instanceof C7570k))) {
                        z4 = z8;
                        i12 = size2;
                        interfaceC7575b = m18188s1;
                    } else {
                        int m18270R4 = c7561e3.m18270R();
                        int m18222v4 = c7561e3.m18222v();
                        int m18238n = c7561e3.m18238n();
                        int i24 = C7574a.f18195l;
                        z4 = z8;
                        if (i21 == 1) {
                            i24 = C7574a.f18196m;
                        }
                        boolean m18148a2 = m18148a(m18188s1, c7561e3, i24) | z11;
                        C7546e c7546e3 = c7564f.f18173u0;
                        i12 = size2;
                        interfaceC7575b = m18188s1;
                        if (c7546e3 != null) {
                            c7546e3.f17971b++;
                        }
                        int m18270R5 = c7561e3.m18270R();
                        int m18222v5 = c7561e3.m18222v();
                        if (m18270R5 != m18270R4) {
                            c7561e3.m18263U0(m18270R5);
                            if (z9 && c7561e3.m18284K() > max) {
                                max = Math.max(max, c7561e3.m18284K() + c7561e3.mo18165m(C7558d.EnumC7560b.RIGHT).m18319e());
                            }
                            m18148a2 = true;
                        }
                        if (m18222v5 != m18222v4) {
                            c7561e3.m18221v0(m18222v5);
                            if (z10 && c7561e3.m18234p() > max2) {
                                max2 = Math.max(max2, c7561e3.m18234p() + c7561e3.mo18165m(C7558d.EnumC7560b.BOTTOM).m18319e());
                            }
                            m18148a2 = true;
                        }
                        z11 = (!c7561e3.m18264U() || m18238n == c7561e3.m18238n()) ? m18148a2 : true;
                    }
                    i23++;
                    size2 = i12;
                    m18188s1 = interfaceC7575b;
                    z8 = z4;
                }
                boolean z12 = z8;
                int i25 = size2;
                InterfaceC7575b interfaceC7575b2 = m18188s1;
                if (!z11) {
                    break;
                }
                m18146c(c7564f, "intermediate pass", i19, i20);
                i21++;
                m18188s1 = interfaceC7575b2;
                z8 = z12;
                i22 = 2;
                z11 = false;
                size2 = i25;
            }
            if (z11) {
                m18146c(c7564f, "2nd pass", i19, i20);
                if (c7564f.m18270R() < max) {
                    c7564f.m18263U0(max);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c7564f.m18222v() < max2) {
                    c7564f.m18221v0(max2);
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (z3) {
                    m18146c(c7564f, "3rd pass", i19, i20);
                }
            }
            i11 = i18;
        } else {
            i11 = m18187t1;
        }
        c7564f.m18207F1(i11);
        return 0L;
    }

    /* renamed from: e */
    public void m18144e(C7564f c7564f) {
        this.f18191a.clear();
        int size = c7564f.f18190p0.size();
        for (int i = 0; i < size; i++) {
            C7561e c7561e = c7564f.f18190p0.get(i);
            if (c7561e.m18216y() == C7561e.EnumC7563b.MATCH_CONSTRAINT || c7561e.m18276O() == C7561e.EnumC7563b.MATCH_CONSTRAINT) {
                this.f18191a.add(c7561e);
            }
        }
        c7564f.m18185v1();
    }
}
