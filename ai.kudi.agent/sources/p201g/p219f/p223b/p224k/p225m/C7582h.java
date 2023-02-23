package p201g.p219f.p223b.p224k.p225m;

import java.util.ArrayList;
import java.util.Iterator;
import p201g.p219f.p223b.p224k.C7555a;
import p201g.p219f.p223b.p224k.C7558d;
import p201g.p219f.p223b.p224k.C7561e;
import p201g.p219f.p223b.p224k.C7564f;
import p201g.p219f.p223b.p224k.C7565g;
import p201g.p219f.p223b.p224k.p225m.C7573b;
/* compiled from: Direct.java */
/* renamed from: g.f.b.k.m.h */
/* loaded from: classes2.dex */
public class C7582h {

    /* renamed from: a */
    private static C7573b.C7574a f18239a = new C7573b.C7574a();

    /* renamed from: a */
    private static boolean m18121a(C7561e c7561e) {
        C7561e.EnumC7563b m18216y = c7561e.m18216y();
        C7561e.EnumC7563b m18276O = c7561e.m18276O();
        C7564f c7564f = c7561e.m18288I() != null ? (C7564f) c7561e.m18288I() : null;
        if (c7564f != null) {
            c7564f.m18216y();
            C7561e.EnumC7563b enumC7563b = C7561e.EnumC7563b.FIXED;
        }
        if (c7564f != null) {
            c7564f.m18276O();
            C7561e.EnumC7563b enumC7563b2 = C7561e.EnumC7563b.FIXED;
        }
        boolean z = m18216y == C7561e.EnumC7563b.FIXED || m18216y == C7561e.EnumC7563b.WRAP_CONTENT || (m18216y == C7561e.EnumC7563b.MATCH_CONSTRAINT && c7561e.f18138n == 0 && c7561e.f18106U == 0.0f && c7561e.m18262V(0)) || c7561e.mo18175e0();
        boolean z2 = m18276O == C7561e.EnumC7563b.FIXED || m18276O == C7561e.EnumC7563b.WRAP_CONTENT || (m18276O == C7561e.EnumC7563b.MATCH_CONSTRAINT && c7561e.f18140o == 0 && c7561e.f18106U == 0.0f && c7561e.m18262V(1)) || c7561e.mo18173f0();
        if (c7561e.f18106U <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    /* renamed from: b */
    private static void m18120b(C7561e c7561e, C7573b.InterfaceC7575b interfaceC7575b, boolean z) {
        C7558d c7558d;
        C7558d c7558d2;
        C7558d c7558d3;
        C7558d c7558d4;
        C7558d c7558d5;
        if (!(c7561e instanceof C7564f) && c7561e.m18250d0() && m18121a(c7561e)) {
            C7564f.m18211B1(c7561e, interfaceC7575b, new C7573b.C7574a(), C7573b.C7574a.f18194k);
        }
        C7558d mo18165m = c7561e.mo18165m(C7558d.EnumC7560b.LEFT);
        C7558d mo18165m2 = c7561e.mo18165m(C7558d.EnumC7560b.RIGHT);
        int m18320d = mo18165m.m18320d();
        int m18320d2 = mo18165m2.m18320d();
        if (mo18165m.m18321c() != null && mo18165m.m18311m()) {
            Iterator<C7558d> it = mo18165m.m18321c().iterator();
            while (it.hasNext()) {
                C7558d next = it.next();
                C7561e c7561e2 = next.f18068d;
                boolean m18121a = m18121a(c7561e2);
                if (c7561e2.m18250d0() && m18121a) {
                    C7564f.m18211B1(c7561e2, interfaceC7575b, new C7573b.C7574a(), C7573b.C7574a.f18194k);
                }
                if (c7561e2.m18216y() == C7561e.EnumC7563b.MATCH_CONSTRAINT && !m18121a) {
                    if (c7561e2.m18216y() == C7561e.EnumC7563b.MATCH_CONSTRAINT && c7561e2.f18143r >= 0 && c7561e2.f18142q >= 0 && (c7561e2.m18272Q() == 8 || (c7561e2.f18138n == 0 && c7561e2.m18226t() == 0.0f))) {
                        if (!c7561e2.m18255Z() && !c7561e2.m18252c0()) {
                            if (((next == c7561e2.f18091F && (c7558d5 = c7561e2.f18093H.f18070f) != null && c7558d5.m18311m()) || (next == c7561e2.f18093H && (c7558d4 = c7561e2.f18091F.f18070f) != null && c7558d4.m18311m())) && !c7561e2.m18255Z()) {
                                m18117e(c7561e, interfaceC7575b, c7561e2, z);
                            }
                        }
                    }
                } else if (!c7561e2.m18250d0()) {
                    C7558d c7558d6 = c7561e2.f18091F;
                    if (next == c7558d6 && c7561e2.f18093H.f18070f == null) {
                        int m18319e = c7558d6.m18319e() + m18320d;
                        c7561e2.m18233p0(m18319e, c7561e2.m18270R() + m18319e);
                        m18120b(c7561e2, interfaceC7575b, z);
                    } else {
                        C7558d c7558d7 = c7561e2.f18093H;
                        if (next == c7558d7 && c7561e2.f18091F.f18070f == null) {
                            int m18319e2 = m18320d - c7558d7.m18319e();
                            c7561e2.m18233p0(m18319e2 - c7561e2.m18270R(), m18319e2);
                            m18120b(c7561e2, interfaceC7575b, z);
                        } else if (next == c7561e2.f18091F && (c7558d3 = c7561e2.f18093H.f18070f) != null && c7558d3.m18311m() && !c7561e2.m18255Z()) {
                            m18118d(interfaceC7575b, c7561e2, z);
                        }
                    }
                }
            }
        }
        if ((c7561e instanceof C7565g) || mo18165m2.m18321c() == null || !mo18165m2.m18311m()) {
            return;
        }
        Iterator<C7558d> it2 = mo18165m2.m18321c().iterator();
        while (it2.hasNext()) {
            C7558d next2 = it2.next();
            C7561e c7561e3 = next2.f18068d;
            boolean m18121a2 = m18121a(c7561e3);
            if (c7561e3.m18250d0() && m18121a2) {
                C7564f.m18211B1(c7561e3, interfaceC7575b, new C7573b.C7574a(), C7573b.C7574a.f18194k);
            }
            boolean z2 = (next2 == c7561e3.f18091F && (c7558d2 = c7561e3.f18093H.f18070f) != null && c7558d2.m18311m()) || (next2 == c7561e3.f18093H && (c7558d = c7561e3.f18091F.f18070f) != null && c7558d.m18311m());
            if (c7561e3.m18216y() == C7561e.EnumC7563b.MATCH_CONSTRAINT && !m18121a2) {
                if (c7561e3.m18216y() == C7561e.EnumC7563b.MATCH_CONSTRAINT && c7561e3.f18143r >= 0 && c7561e3.f18142q >= 0 && (c7561e3.m18272Q() == 8 || (c7561e3.f18138n == 0 && c7561e3.m18226t() == 0.0f))) {
                    if (!c7561e3.m18255Z() && !c7561e3.m18252c0() && z2 && !c7561e3.m18255Z()) {
                        m18117e(c7561e, interfaceC7575b, c7561e3, z);
                    }
                }
            } else if (!c7561e3.m18250d0()) {
                C7558d c7558d8 = c7561e3.f18091F;
                if (next2 == c7558d8 && c7561e3.f18093H.f18070f == null) {
                    int m18319e3 = c7558d8.m18319e() + m18320d2;
                    c7561e3.m18233p0(m18319e3, c7561e3.m18270R() + m18319e3);
                    m18120b(c7561e3, interfaceC7575b, z);
                } else {
                    C7558d c7558d9 = c7561e3.f18093H;
                    if (next2 == c7558d9 && c7561e3.f18091F.f18070f == null) {
                        int m18319e4 = m18320d2 - c7558d9.m18319e();
                        c7561e3.m18233p0(m18319e4 - c7561e3.m18270R(), m18319e4);
                        m18120b(c7561e3, interfaceC7575b, z);
                    } else if (z2 && !c7561e3.m18255Z()) {
                        m18118d(interfaceC7575b, c7561e3, z);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private static void m18119c(C7555a c7555a, C7573b.InterfaceC7575b interfaceC7575b, int i, boolean z) {
        if (c7555a.m18337c1()) {
            if (i == 0) {
                m18120b(c7555a, interfaceC7575b, z);
            } else {
                m18113i(c7555a, interfaceC7575b);
            }
        }
    }

    /* renamed from: d */
    private static void m18118d(C7573b.InterfaceC7575b interfaceC7575b, C7561e c7561e, boolean z) {
        float m18220w = c7561e.m18220w();
        int m18320d = c7561e.f18091F.f18070f.m18320d();
        int m18320d2 = c7561e.f18093H.f18070f.m18320d();
        int m18319e = c7561e.f18091F.m18319e() + m18320d;
        int m18319e2 = m18320d2 - c7561e.f18093H.m18319e();
        if (m18320d == m18320d2) {
            m18220w = 0.5f;
        } else {
            m18320d = m18319e;
            m18320d2 = m18319e2;
        }
        int m18270R = c7561e.m18270R();
        int i = (m18320d2 - m18320d) - m18270R;
        if (m18320d > m18320d2) {
            i = (m18320d - m18320d2) - m18270R;
        }
        int i2 = ((int) ((m18220w * i) + 0.5f)) + m18320d;
        int i3 = i2 + m18270R;
        if (m18320d > m18320d2) {
            i3 = i2 - m18270R;
        }
        c7561e.m18233p0(i2, i3);
        m18120b(c7561e, interfaceC7575b, z);
    }

    /* renamed from: e */
    private static void m18117e(C7561e c7561e, C7573b.InterfaceC7575b interfaceC7575b, C7561e c7561e2, boolean z) {
        int m18270R;
        float m18220w = c7561e2.m18220w();
        int m18320d = c7561e2.f18091F.f18070f.m18320d() + c7561e2.f18091F.m18319e();
        int m18320d2 = c7561e2.f18093H.f18070f.m18320d() - c7561e2.f18093H.m18319e();
        if (m18320d2 >= m18320d) {
            int m18270R2 = c7561e2.m18270R();
            if (c7561e2.m18272Q() != 8) {
                int i = c7561e2.f18138n;
                if (i == 2) {
                    if (c7561e instanceof C7564f) {
                        m18270R = c7561e.m18270R();
                    } else {
                        m18270R = c7561e.m18288I().m18270R();
                    }
                    m18270R2 = (int) (c7561e2.m18220w() * 0.5f * m18270R);
                } else if (i == 0) {
                    m18270R2 = m18320d2 - m18320d;
                }
                m18270R2 = Math.max(c7561e2.f18142q, m18270R2);
                int i2 = c7561e2.f18143r;
                if (i2 > 0) {
                    m18270R2 = Math.min(i2, m18270R2);
                }
            }
            int i3 = m18320d + ((int) ((m18220w * ((m18320d2 - m18320d) - m18270R2)) + 0.5f));
            c7561e2.m18233p0(i3, m18270R2 + i3);
            m18120b(c7561e2, interfaceC7575b, z);
        }
    }

    /* renamed from: f */
    private static void m18116f(C7573b.InterfaceC7575b interfaceC7575b, C7561e c7561e) {
        float m18280M = c7561e.m18280M();
        int m18320d = c7561e.f18092G.f18070f.m18320d();
        int m18320d2 = c7561e.f18094I.f18070f.m18320d();
        int m18319e = c7561e.f18092G.m18319e() + m18320d;
        int m18319e2 = m18320d2 - c7561e.f18094I.m18319e();
        if (m18320d == m18320d2) {
            m18280M = 0.5f;
        } else {
            m18320d = m18319e;
            m18320d2 = m18319e2;
        }
        int m18222v = c7561e.m18222v();
        int i = (m18320d2 - m18320d) - m18222v;
        if (m18320d > m18320d2) {
            i = (m18320d - m18320d2) - m18222v;
        }
        int i2 = (int) ((m18280M * i) + 0.5f);
        int i3 = m18320d + i2;
        int i4 = i3 + m18222v;
        if (m18320d > m18320d2) {
            i3 = m18320d - i2;
            i4 = i3 - m18222v;
        }
        c7561e.m18227s0(i3, i4);
        m18113i(c7561e, interfaceC7575b);
    }

    /* renamed from: g */
    private static void m18115g(C7561e c7561e, C7573b.InterfaceC7575b interfaceC7575b, C7561e c7561e2) {
        int m18222v;
        float m18280M = c7561e2.m18280M();
        int m18320d = c7561e2.f18092G.f18070f.m18320d() + c7561e2.f18092G.m18319e();
        int m18320d2 = c7561e2.f18094I.f18070f.m18320d() - c7561e2.f18094I.m18319e();
        if (m18320d2 >= m18320d) {
            int m18222v2 = c7561e2.m18222v();
            if (c7561e2.m18272Q() != 8) {
                int i = c7561e2.f18140o;
                if (i == 2) {
                    if (c7561e instanceof C7564f) {
                        m18222v = c7561e.m18222v();
                    } else {
                        m18222v = c7561e.m18288I().m18222v();
                    }
                    m18222v2 = (int) (m18280M * 0.5f * m18222v);
                } else if (i == 0) {
                    m18222v2 = m18320d2 - m18320d;
                }
                m18222v2 = Math.max(c7561e2.f18145t, m18222v2);
                int i2 = c7561e2.f18146u;
                if (i2 > 0) {
                    m18222v2 = Math.min(i2, m18222v2);
                }
            }
            int i3 = m18320d + ((int) ((m18280M * ((m18320d2 - m18320d) - m18222v2)) + 0.5f));
            c7561e2.m18227s0(i3, m18222v2 + i3);
            m18113i(c7561e2, interfaceC7575b);
        }
    }

    /* renamed from: h */
    public static void m18114h(C7564f c7564f, C7573b.InterfaceC7575b interfaceC7575b) {
        C7561e.EnumC7563b m18216y = c7564f.m18216y();
        C7561e.EnumC7563b m18276O = c7564f.m18276O();
        c7564f.m18245i0();
        ArrayList<C7561e> m18154a1 = c7564f.m18154a1();
        int size = m18154a1.size();
        for (int i = 0; i < size; i++) {
            m18154a1.get(i).m18245i0();
        }
        boolean m18182y1 = c7564f.m18182y1();
        if (m18216y == C7561e.EnumC7563b.FIXED) {
            c7564f.m18233p0(0, c7564f.m18270R());
        } else {
            c7564f.m18231q0(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C7561e c7561e = m18154a1.get(i2);
            if (c7561e instanceof C7565g) {
                C7565g c7565g = (C7565g) c7561e;
                if (c7565g.m18178b1() == 1) {
                    if (c7565g.m18177c1() != -1) {
                        c7565g.m18172f1(c7565g.m18177c1());
                    } else if (c7565g.m18176d1() != -1 && c7564f.mo18175e0()) {
                        c7565g.m18172f1(c7564f.m18270R() - c7565g.m18176d1());
                    } else if (c7564f.mo18175e0()) {
                        c7565g.m18172f1((int) ((c7565g.m18174e1() * c7564f.m18270R()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((c7561e instanceof C7555a) && ((C7555a) c7561e).m18333g1() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                C7561e c7561e2 = m18154a1.get(i3);
                if (c7561e2 instanceof C7565g) {
                    C7565g c7565g2 = (C7565g) c7561e2;
                    if (c7565g2.m18178b1() == 1) {
                        m18120b(c7565g2, interfaceC7575b, m18182y1);
                    }
                }
            }
        }
        m18120b(c7564f, interfaceC7575b, m18182y1);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                C7561e c7561e3 = m18154a1.get(i4);
                if (c7561e3 instanceof C7555a) {
                    C7555a c7555a = (C7555a) c7561e3;
                    if (c7555a.m18333g1() == 0) {
                        m18119c(c7555a, interfaceC7575b, 0, m18182y1);
                    }
                }
            }
        }
        if (m18276O == C7561e.EnumC7563b.FIXED) {
            c7564f.m18227s0(0, c7564f.m18222v());
        } else {
            c7564f.m18229r0(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            C7561e c7561e4 = m18154a1.get(i5);
            if (c7561e4 instanceof C7565g) {
                C7565g c7565g3 = (C7565g) c7561e4;
                if (c7565g3.m18178b1() == 0) {
                    if (c7565g3.m18177c1() != -1) {
                        c7565g3.m18172f1(c7565g3.m18177c1());
                    } else if (c7565g3.m18176d1() != -1 && c7564f.mo18173f0()) {
                        c7565g3.m18172f1(c7564f.m18222v() - c7565g3.m18176d1());
                    } else if (c7564f.mo18173f0()) {
                        c7565g3.m18172f1((int) ((c7565g3.m18174e1() * c7564f.m18222v()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((c7561e4 instanceof C7555a) && ((C7555a) c7561e4).m18333g1() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                C7561e c7561e5 = m18154a1.get(i6);
                if (c7561e5 instanceof C7565g) {
                    C7565g c7565g4 = (C7565g) c7561e5;
                    if (c7565g4.m18178b1() == 0) {
                        m18113i(c7565g4, interfaceC7575b);
                    }
                }
            }
        }
        m18113i(c7564f, interfaceC7575b);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                C7561e c7561e6 = m18154a1.get(i7);
                if (c7561e6 instanceof C7555a) {
                    C7555a c7555a2 = (C7555a) c7561e6;
                    if (c7555a2.m18333g1() == 1) {
                        m18119c(c7555a2, interfaceC7575b, 1, m18182y1);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            C7561e c7561e7 = m18154a1.get(i8);
            if (c7561e7.m18250d0() && m18121a(c7561e7)) {
                C7564f.m18211B1(c7561e7, interfaceC7575b, f18239a, C7573b.C7574a.f18194k);
                m18120b(c7561e7, interfaceC7575b, m18182y1);
                m18113i(c7561e7, interfaceC7575b);
            }
        }
    }

    /* renamed from: i */
    private static void m18113i(C7561e c7561e, C7573b.InterfaceC7575b interfaceC7575b) {
        C7558d c7558d;
        C7558d c7558d2;
        C7558d c7558d3;
        C7558d c7558d4;
        C7558d c7558d5;
        if (!(c7561e instanceof C7564f) && c7561e.m18250d0() && m18121a(c7561e)) {
            C7564f.m18211B1(c7561e, interfaceC7575b, new C7573b.C7574a(), C7573b.C7574a.f18194k);
        }
        C7558d mo18165m = c7561e.mo18165m(C7558d.EnumC7560b.TOP);
        C7558d mo18165m2 = c7561e.mo18165m(C7558d.EnumC7560b.BOTTOM);
        int m18320d = mo18165m.m18320d();
        int m18320d2 = mo18165m2.m18320d();
        if (mo18165m.m18321c() != null && mo18165m.m18311m()) {
            Iterator<C7558d> it = mo18165m.m18321c().iterator();
            while (it.hasNext()) {
                C7558d next = it.next();
                C7561e c7561e2 = next.f18068d;
                boolean m18121a = m18121a(c7561e2);
                if (c7561e2.m18250d0() && m18121a) {
                    C7564f.m18211B1(c7561e2, interfaceC7575b, new C7573b.C7574a(), C7573b.C7574a.f18194k);
                }
                if (c7561e2.m18276O() == C7561e.EnumC7563b.MATCH_CONSTRAINT && !m18121a) {
                    if (c7561e2.m18276O() == C7561e.EnumC7563b.MATCH_CONSTRAINT && c7561e2.f18146u >= 0 && c7561e2.f18145t >= 0 && (c7561e2.m18272Q() == 8 || (c7561e2.f18140o == 0 && c7561e2.m18226t() == 0.0f))) {
                        if (!c7561e2.m18253b0() && !c7561e2.m18252c0()) {
                            if (((next == c7561e2.f18092G && (c7558d5 = c7561e2.f18094I.f18070f) != null && c7558d5.m18311m()) || (next == c7561e2.f18094I && (c7558d4 = c7561e2.f18092G.f18070f) != null && c7558d4.m18311m())) && !c7561e2.m18253b0()) {
                                m18115g(c7561e, interfaceC7575b, c7561e2);
                            }
                        }
                    }
                } else if (!c7561e2.m18250d0()) {
                    C7558d c7558d6 = c7561e2.f18092G;
                    if (next == c7558d6 && c7561e2.f18094I.f18070f == null) {
                        int m18319e = c7558d6.m18319e() + m18320d;
                        c7561e2.m18227s0(m18319e, c7561e2.m18222v() + m18319e);
                        m18113i(c7561e2, interfaceC7575b);
                    } else {
                        C7558d c7558d7 = c7561e2.f18094I;
                        if (next == c7558d7 && c7558d7.f18070f == null) {
                            int m18319e2 = m18320d - c7558d7.m18319e();
                            c7561e2.m18227s0(m18319e2 - c7561e2.m18222v(), m18319e2);
                            m18113i(c7561e2, interfaceC7575b);
                        } else if (next == c7561e2.f18092G && (c7558d3 = c7561e2.f18094I.f18070f) != null && c7558d3.m18311m()) {
                            m18116f(interfaceC7575b, c7561e2);
                        }
                    }
                }
            }
        }
        if (c7561e instanceof C7565g) {
            return;
        }
        if (mo18165m2.m18321c() != null && mo18165m2.m18311m()) {
            Iterator<C7558d> it2 = mo18165m2.m18321c().iterator();
            while (it2.hasNext()) {
                C7558d next2 = it2.next();
                C7561e c7561e3 = next2.f18068d;
                boolean m18121a2 = m18121a(c7561e3);
                if (c7561e3.m18250d0() && m18121a2) {
                    C7564f.m18211B1(c7561e3, interfaceC7575b, new C7573b.C7574a(), C7573b.C7574a.f18194k);
                }
                boolean z = (next2 == c7561e3.f18092G && (c7558d2 = c7561e3.f18094I.f18070f) != null && c7558d2.m18311m()) || (next2 == c7561e3.f18094I && (c7558d = c7561e3.f18092G.f18070f) != null && c7558d.m18311m());
                if (c7561e3.m18276O() == C7561e.EnumC7563b.MATCH_CONSTRAINT && !m18121a2) {
                    if (c7561e3.m18276O() == C7561e.EnumC7563b.MATCH_CONSTRAINT && c7561e3.f18146u >= 0 && c7561e3.f18145t >= 0 && (c7561e3.m18272Q() == 8 || (c7561e3.f18140o == 0 && c7561e3.m18226t() == 0.0f))) {
                        if (!c7561e3.m18253b0() && !c7561e3.m18252c0() && z && !c7561e3.m18253b0()) {
                            m18115g(c7561e, interfaceC7575b, c7561e3);
                        }
                    }
                } else if (!c7561e3.m18250d0()) {
                    C7558d c7558d8 = c7561e3.f18092G;
                    if (next2 == c7558d8 && c7561e3.f18094I.f18070f == null) {
                        int m18319e3 = c7558d8.m18319e() + m18320d2;
                        c7561e3.m18227s0(m18319e3, c7561e3.m18222v() + m18319e3);
                        m18113i(c7561e3, interfaceC7575b);
                    } else {
                        C7558d c7558d9 = c7561e3.f18094I;
                        if (next2 == c7558d9 && c7561e3.f18092G.f18070f == null) {
                            int m18319e4 = m18320d2 - c7558d9.m18319e();
                            c7561e3.m18227s0(m18319e4 - c7561e3.m18222v(), m18319e4);
                            m18113i(c7561e3, interfaceC7575b);
                        } else if (z && !c7561e3.m18253b0()) {
                            m18116f(interfaceC7575b, c7561e3);
                        }
                    }
                }
            }
        }
        C7558d mo18165m3 = c7561e.mo18165m(C7558d.EnumC7560b.BASELINE);
        if (mo18165m3.m18321c() == null || !mo18165m3.m18311m()) {
            return;
        }
        int m18320d3 = mo18165m3.m18320d();
        Iterator<C7558d> it3 = mo18165m3.m18321c().iterator();
        while (it3.hasNext()) {
            C7558d next3 = it3.next();
            C7561e c7561e4 = next3.f18068d;
            boolean m18121a3 = m18121a(c7561e4);
            if (c7561e4.m18250d0() && m18121a3) {
                C7564f.m18211B1(c7561e4, interfaceC7575b, new C7573b.C7574a(), C7573b.C7574a.f18194k);
            }
            if (c7561e4.m18276O() != C7561e.EnumC7563b.MATCH_CONSTRAINT || m18121a3) {
                if (!c7561e4.m18250d0() && next3 == c7561e4.f18095J) {
                    c7561e4.m18235o0(m18320d3);
                    m18113i(c7561e4, interfaceC7575b);
                }
            }
        }
    }
}
