package com.google.protobuf;

import com.google.protobuf.AbstractC7039i;
import com.google.protobuf.C6997a0;
import com.google.protobuf.C7020e;
import com.google.protobuf.C7064k0;
import com.google.protobuf.C7118t1;
import com.google.protobuf.InterfaceC7131u1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MessageSchema.java */
/* renamed from: com.google.protobuf.u0 */
/* loaded from: classes2.dex */
public final class C7129u0<T> implements InterfaceC7038h1<T> {

    /* renamed from: r */
    private static final int[] f16987r = new int[0];

    /* renamed from: s */
    private static final Unsafe f16988s = C7102r1.m19699H();

    /* renamed from: a */
    private final int[] f16989a;

    /* renamed from: b */
    private final Object[] f16990b;

    /* renamed from: c */
    private final int f16991c;

    /* renamed from: d */
    private final int f16992d;

    /* renamed from: e */
    private final InterfaceC7100r0 f16993e;

    /* renamed from: f */
    private final boolean f16994f;

    /* renamed from: g */
    private final boolean f16995g;

    /* renamed from: h */
    private final boolean f16996h;

    /* renamed from: i */
    private final boolean f16997i;

    /* renamed from: j */
    private final int[] f16998j;

    /* renamed from: k */
    private final int f16999k;

    /* renamed from: l */
    private final int f17000l;

    /* renamed from: m */
    private final InterfaceC7138w0 f17001m;

    /* renamed from: n */
    private final AbstractC7034h0 f17002n;

    /* renamed from: o */
    private final AbstractC7085n1<?, ?> f17003o;

    /* renamed from: p */
    private final AbstractC7093q<?> f17004p;

    /* renamed from: q */
    private final InterfaceC7079m0 f17005q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MessageSchema.java */
    /* renamed from: com.google.protobuf.u0$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C7130a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17006a;

        static {
            int[] iArr = new int[C7118t1.EnumC7120b.values().length];
            f17006a = iArr;
            try {
                iArr[C7118t1.EnumC7120b.f16950B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17006a[C7118t1.EnumC7120b.f16954F.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17006a[C7118t1.EnumC7120b.f16962e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17006a[C7118t1.EnumC7120b.f16949A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17006a[C7118t1.EnumC7120b.f16957I.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17006a[C7118t1.EnumC7120b.f16967z.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17006a[C7118t1.EnumC7120b.f16958J.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17006a[C7118t1.EnumC7120b.f16963f.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17006a[C7118t1.EnumC7120b.f16956H.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f17006a[C7118t1.EnumC7120b.f16966y.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f17006a[C7118t1.EnumC7120b.f16955G.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f17006a[C7118t1.EnumC7120b.f16964w.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f17006a[C7118t1.EnumC7120b.f16965x.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f17006a[C7118t1.EnumC7120b.f16953E.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f17006a[C7118t1.EnumC7120b.f16959K.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f17006a[C7118t1.EnumC7120b.f16960L.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f17006a[C7118t1.EnumC7120b.f16951C.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C7129u0(int[] iArr, Object[] objArr, int i, int i2, InterfaceC7100r0 interfaceC7100r0, boolean z, boolean z2, int[] iArr2, int i3, int i4, InterfaceC7138w0 interfaceC7138w0, AbstractC7034h0 abstractC7034h0, AbstractC7085n1<?, ?> abstractC7085n1, AbstractC7093q<?> abstractC7093q, InterfaceC7079m0 interfaceC7079m0) {
        this.f16989a = iArr;
        this.f16990b = objArr;
        this.f16991c = i;
        this.f16992d = i2;
        this.f16995g = interfaceC7100r0 instanceof AbstractC7141y;
        this.f16996h = z;
        this.f16994f = abstractC7093q != null && abstractC7093q.mo19716e(interfaceC7100r0);
        this.f16997i = z2;
        this.f16998j = iArr2;
        this.f16999k = i3;
        this.f17000l = i4;
        this.f17001m = interfaceC7138w0;
        this.f17002n = abstractC7034h0;
        this.f17003o = abstractC7085n1;
        this.f17004p = abstractC7093q;
        this.f16993e = interfaceC7100r0;
        this.f17005q = interfaceC7079m0;
    }

    /* renamed from: A */
    private static <T> int m19533A(T t, long j) {
        return C7102r1.m19704C(t, j);
    }

    /* renamed from: B */
    private static boolean m19532B(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: C */
    private boolean m19531C(T t, int i) {
        int m19499i0 = m19499i0(i);
        long j = 1048575 & m19499i0;
        if (j != 1048575) {
            return (C7102r1.m19704C(t, j) & (1 << (m19499i0 >>> 20))) != 0;
        }
        int m19480s0 = m19480s0(i);
        long m19512V = m19512V(m19480s0);
        switch (m19482r0(m19480s0)) {
            case 0:
                return C7102r1.m19706A(t, m19512V) != 0.0d;
            case 1:
                return C7102r1.m19705B(t, m19512V) != 0.0f;
            case 2:
                return C7102r1.m19702E(t, m19512V) != 0;
            case 3:
                return C7102r1.m19702E(t, m19512V) != 0;
            case 4:
                return C7102r1.m19704C(t, m19512V) != 0;
            case 5:
                return C7102r1.m19702E(t, m19512V) != 0;
            case 6:
                return C7102r1.m19704C(t, m19512V) != 0;
            case 7:
                return C7102r1.m19663t(t, m19512V);
            case 8:
                Object m19700G = C7102r1.m19700G(t, m19512V);
                if (m19700G instanceof String) {
                    return !((String) m19700G).isEmpty();
                }
                if (m19700G instanceof AbstractC7039i) {
                    return !AbstractC7039i.f16815d.equals(m19700G);
                }
                throw new IllegalArgumentException();
            case 9:
                return C7102r1.m19700G(t, m19512V) != null;
            case 10:
                return !AbstractC7039i.f16815d.equals(C7102r1.m19700G(t, m19512V));
            case 11:
                return C7102r1.m19704C(t, m19512V) != 0;
            case 12:
                return C7102r1.m19704C(t, m19512V) != 0;
            case 13:
                return C7102r1.m19704C(t, m19512V) != 0;
            case 14:
                return C7102r1.m19702E(t, m19512V) != 0;
            case 15:
                return C7102r1.m19704C(t, m19512V) != 0;
            case 16:
                return C7102r1.m19702E(t, m19512V) != 0;
            case 17:
                return C7102r1.m19700G(t, m19512V) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: D */
    private boolean m19530D(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m19531C(t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    private static boolean m19529E(Object obj, int i, InterfaceC7038h1 interfaceC7038h1) {
        return interfaceC7038h1.mo19422d(C7102r1.m19700G(obj, m19512V(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: F */
    private <N> boolean m19528F(Object obj, int i, int i2) {
        List list = (List) C7102r1.m19700G(obj, m19512V(i));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC7038h1 m19475v = m19475v(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!m19475v.mo19422d(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.h1] */
    /* renamed from: G */
    private boolean m19527G(T t, int i, int i2) {
        Map<?, ?> mo19798h = this.f17005q.mo19798h(C7102r1.m19700G(t, m19512V(i)));
        if (mo19798h.isEmpty()) {
            return true;
        }
        if (this.f17005q.mo19803c(m19477u(i2)).f16878c.m19561a() != C7118t1.EnumC7125c.MESSAGE) {
            return true;
        }
        InterfaceC7038h1<T> interfaceC7038h1 = 0;
        for (Object obj : mo19798h.values()) {
            if (interfaceC7038h1 == null) {
                interfaceC7038h1 = C7019d1.m20212a().m20209d(obj.getClass());
            }
            boolean mo19422d = interfaceC7038h1.mo19422d(obj);
            interfaceC7038h1 = interfaceC7038h1;
            if (!mo19422d) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    private boolean m19526H(T t, T t2, int i) {
        long m19499i0 = m19499i0(i) & 1048575;
        return C7102r1.m19704C(t, m19499i0) == C7102r1.m19704C(t2, m19499i0);
    }

    /* renamed from: I */
    private boolean m19525I(T t, int i, int i2) {
        return C7102r1.m19704C(t, (long) (m19499i0(i2) & 1048575)) == i;
    }

    /* renamed from: J */
    private static boolean m19524J(int i) {
        return (i & 268435456) != 0;
    }

    /* renamed from: K */
    private static List<?> m19523K(Object obj, long j) {
        return (List) C7102r1.m19700G(obj, j);
    }

    /* renamed from: L */
    private static <T> long m19522L(T t, long j) {
        return C7102r1.m19702E(t, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        r0 = r16.f16999k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r0 >= r16.f17000l) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
        r13 = m19485q(r19, r16.f16998j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r13 == null) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
        r17.mo19743o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <UT, UB, ET extends com.google.protobuf.C7126u.InterfaceC7128b<ET>> void m19521M(com.google.protobuf.AbstractC7085n1<UT, UB> r17, com.google.protobuf.AbstractC7093q<ET> r18, T r19, com.google.protobuf.InterfaceC7032g1 r20, com.google.protobuf.C7089p r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7129u0.m19521M(com.google.protobuf.n1, com.google.protobuf.q, java.lang.Object, com.google.protobuf.g1, com.google.protobuf.p):void");
    }

    /* renamed from: N */
    private final <K, V> void m19520N(Object obj, int i, Object obj2, C7089p c7089p, InterfaceC7032g1 interfaceC7032g1) throws IOException {
        long m19512V = m19512V(m19480s0(i));
        Object m19700G = C7102r1.m19700G(obj, m19512V);
        if (m19700G == null) {
            m19700G = this.f17005q.mo19801e(obj2);
            C7102r1.m19685V(obj, m19512V, m19700G);
        } else if (this.f17005q.mo19799g(m19700G)) {
            Object mo19801e = this.f17005q.mo19801e(obj2);
            this.f17005q.mo19805a(mo19801e, m19700G);
            C7102r1.m19685V(obj, m19512V, mo19801e);
            m19700G = mo19801e;
        }
        interfaceC7032g1.mo19918D(this.f17005q.mo19802d(m19700G), this.f17005q.mo19803c(obj2), c7089p);
    }

    /* renamed from: O */
    private void m19519O(T t, T t2, int i) {
        long m19512V = m19512V(m19480s0(i));
        if (m19531C(t2, i)) {
            Object m19700G = C7102r1.m19700G(t, m19512V);
            Object m19700G2 = C7102r1.m19700G(t2, m19512V);
            if (m19700G != null && m19700G2 != null) {
                C7102r1.m19685V(t, m19512V, C6997a0.m20228h(m19700G, m19700G2));
                m19488o0(t, i);
            } else if (m19700G2 != null) {
                C7102r1.m19685V(t, m19512V, m19700G2);
                m19488o0(t, i);
            }
        }
    }

    /* renamed from: P */
    private void m19518P(T t, T t2, int i) {
        int m19480s0 = m19480s0(i);
        int m19513U = m19513U(i);
        long m19512V = m19512V(m19480s0);
        if (m19525I(t2, m19513U, i)) {
            Object m19700G = m19525I(t, m19513U, i) ? C7102r1.m19700G(t, m19512V) : null;
            Object m19700G2 = C7102r1.m19700G(t2, m19512V);
            if (m19700G != null && m19700G2 != null) {
                C7102r1.m19685V(t, m19512V, C6997a0.m20228h(m19700G, m19700G2));
                m19486p0(t, m19513U, i);
            } else if (m19700G2 != null) {
                C7102r1.m19685V(t, m19512V, m19700G2);
                m19486p0(t, m19513U, i);
            }
        }
    }

    /* renamed from: Q */
    private void m19517Q(T t, T t2, int i) {
        int m19480s0 = m19480s0(i);
        long m19512V = m19512V(m19480s0);
        int m19513U = m19513U(i);
        switch (m19482r0(m19480s0)) {
            case 0:
                if (m19531C(t2, i)) {
                    C7102r1.m19689R(t, m19512V, C7102r1.m19706A(t2, m19512V));
                    m19488o0(t, i);
                    return;
                }
                return;
            case 1:
                if (m19531C(t2, i)) {
                    C7102r1.m19688S(t, m19512V, C7102r1.m19705B(t2, m19512V));
                    m19488o0(t, i);
                    return;
                }
                return;
            case 2:
                if (m19531C(t2, i)) {
                    C7102r1.m19686U(t, m19512V, C7102r1.m19702E(t2, m19512V));
                    m19488o0(t, i);
                    return;
                }
                return;
            case 3:
                if (m19531C(t2, i)) {
                    C7102r1.m19686U(t, m19512V, C7102r1.m19702E(t2, m19512V));
                    m19488o0(t, i);
                    return;
                }
                return;
            case 4:
                if (m19531C(t2, i)) {
                    C7102r1.m19687T(t, m19512V, C7102r1.m19704C(t2, m19512V));
                    m19488o0(t, i);
                    return;
                }
                return;
            case 5:
                if (m19531C(t2, i)) {
                    C7102r1.m19686U(t, m19512V, C7102r1.m19702E(t2, m19512V));
                    m19488o0(t, i);
                    return;
                }
                return;
            case 6:
                if (m19531C(t2, i)) {
                    C7102r1.m19687T(t, m19512V, C7102r1.m19704C(t2, m19512V));
                    m19488o0(t, i);
                    return;
                }
                return;
            case 7:
                if (m19531C(t2, i)) {
                    C7102r1.m19695L(t, m19512V, C7102r1.m19663t(t2, m19512V));
                    m19488o0(t, i);
                    return;
                }
                return;
            case 8:
                if (m19531C(t2, i)) {
                    C7102r1.m19685V(t, m19512V, C7102r1.m19700G(t2, m19512V));
                    m19488o0(t, i);
                    return;
                }
                return;
            case 9:
                m19519O(t, t2, i);
                return;
            case 10:
                if (m19531C(t2, i)) {
                    C7102r1.m19685V(t, m19512V, C7102r1.m19700G(t2, m19512V));
                    m19488o0(t, i);
                    return;
                }
                return;
            case 11:
                if (m19531C(t2, i)) {
                    C7102r1.m19687T(t, m19512V, C7102r1.m19704C(t2, m19512V));
                    m19488o0(t, i);
                    return;
                }
                return;
            case 12:
                if (m19531C(t2, i)) {
                    C7102r1.m19687T(t, m19512V, C7102r1.m19704C(t2, m19512V));
                    m19488o0(t, i);
                    return;
                }
                return;
            case 13:
                if (m19531C(t2, i)) {
                    C7102r1.m19687T(t, m19512V, C7102r1.m19704C(t2, m19512V));
                    m19488o0(t, i);
                    return;
                }
                return;
            case 14:
                if (m19531C(t2, i)) {
                    C7102r1.m19686U(t, m19512V, C7102r1.m19702E(t2, m19512V));
                    m19488o0(t, i);
                    return;
                }
                return;
            case 15:
                if (m19531C(t2, i)) {
                    C7102r1.m19687T(t, m19512V, C7102r1.m19704C(t2, m19512V));
                    m19488o0(t, i);
                    return;
                }
                return;
            case 16:
                if (m19531C(t2, i)) {
                    C7102r1.m19686U(t, m19512V, C7102r1.m19702E(t2, m19512V));
                    m19488o0(t, i);
                    return;
                }
                return;
            case 17:
                m19519O(t, t2, i);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f17002n.mo20106d(t, t2, m19512V);
                return;
            case 50:
                C7061j1.m19973F(this.f17005q, t, t2, m19512V);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (m19525I(t2, m19513U, i)) {
                    C7102r1.m19685V(t, m19512V, C7102r1.m19700G(t2, m19512V));
                    m19486p0(t, m19513U, i);
                    return;
                }
                return;
            case 60:
                m19518P(t, t2, i);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (m19525I(t2, m19513U, i)) {
                    C7102r1.m19685V(t, m19512V, C7102r1.m19700G(t2, m19512V));
                    m19486p0(t, m19513U, i);
                    return;
                }
                return;
            case 68:
                m19518P(t, t2, i);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public static <T> C7129u0<T> m19516R(Class<T> cls, InterfaceC7091p0 interfaceC7091p0, InterfaceC7138w0 interfaceC7138w0, AbstractC7034h0 abstractC7034h0, AbstractC7085n1<?, ?> abstractC7085n1, AbstractC7093q<?> abstractC7093q, InterfaceC7079m0 interfaceC7079m0) {
        if (interfaceC7091p0 instanceof C7029f1) {
            return m19514T((C7029f1) interfaceC7091p0, interfaceC7138w0, abstractC7034h0, abstractC7085n1, abstractC7093q, interfaceC7079m0);
        }
        return m19515S((C7077l1) interfaceC7091p0, interfaceC7138w0, abstractC7034h0, abstractC7085n1, abstractC7093q, interfaceC7079m0);
    }

    /* renamed from: S */
    static <T> C7129u0<T> m19515S(C7077l1 c7077l1, InterfaceC7138w0 interfaceC7138w0, AbstractC7034h0 abstractC7034h0, AbstractC7085n1<?, ?> abstractC7085n1, AbstractC7093q<?> abstractC7093q, InterfaceC7079m0 interfaceC7079m0) {
        boolean z = c7077l1.mo19766c() == EnumC7013c1.PROTO3;
        C7116t[] m19822e = c7077l1.m19822e();
        if (m19822e.length == 0) {
            int length = m19822e.length;
            int[] iArr = new int[length * 3];
            Object[] objArr = new Object[length * 2];
            if (m19822e.length <= 0) {
                int[] m19823d = c7077l1.m19823d();
                if (m19823d == null) {
                    m19823d = f16987r;
                }
                if (m19822e.length <= 0) {
                    int[] iArr2 = 0 == 0 ? f16987r : null;
                    int[] iArr3 = 0 == 0 ? f16987r : null;
                    int[] iArr4 = new int[m19823d.length + iArr2.length + iArr3.length];
                    System.arraycopy(m19823d, 0, iArr4, 0, m19823d.length);
                    System.arraycopy(iArr2, 0, iArr4, m19823d.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, m19823d.length + iArr2.length, iArr3.length);
                    return new C7129u0<>(iArr, objArr, 0, 0, c7077l1.mo19767b(), z, true, iArr4, m19823d.length, m19823d.length + iArr2.length, interfaceC7138w0, abstractC7034h0, abstractC7085n1, abstractC7093q, interfaceC7079m0);
                }
                m19822e[0].m19571a();
                throw null;
            }
            m19822e[0].m19570b();
            throw null;
        }
        m19822e[0].m19571a();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x037c  */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> com.google.protobuf.C7129u0<T> m19514T(com.google.protobuf.C7029f1 r34, com.google.protobuf.InterfaceC7138w0 r35, com.google.protobuf.AbstractC7034h0 r36, com.google.protobuf.AbstractC7085n1<?, ?> r37, com.google.protobuf.AbstractC7093q<?> r38, com.google.protobuf.InterfaceC7079m0 r39) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7129u0.m19514T(com.google.protobuf.f1, com.google.protobuf.w0, com.google.protobuf.h0, com.google.protobuf.n1, com.google.protobuf.q, com.google.protobuf.m0):com.google.protobuf.u0");
    }

    /* renamed from: U */
    private int m19513U(int i) {
        return this.f16989a[i];
    }

    /* renamed from: V */
    private static long m19512V(int i) {
        return i & 1048575;
    }

    /* renamed from: W */
    private static <T> boolean m19511W(T t, long j) {
        return ((Boolean) C7102r1.m19700G(t, j)).booleanValue();
    }

    /* renamed from: X */
    private static <T> double m19510X(T t, long j) {
        return ((Double) C7102r1.m19700G(t, j)).doubleValue();
    }

    /* renamed from: Y */
    private static <T> float m19509Y(T t, long j) {
        return ((Float) C7102r1.m19700G(t, j)).floatValue();
    }

    /* renamed from: Z */
    private static <T> int m19508Z(T t, long j) {
        return ((Integer) C7102r1.m19700G(t, j)).intValue();
    }

    /* renamed from: a0 */
    private static <T> long m19507a0(T t, long j) {
        return ((Long) C7102r1.m19700G(t, j)).longValue();
    }

    /* renamed from: b0 */
    private <K, V> int m19506b0(T t, byte[] bArr, int i, int i2, int i3, long j, C7020e.C7022b c7022b) throws IOException {
        Unsafe unsafe = f16988s;
        Object m19477u = m19477u(i3);
        Object object = unsafe.getObject(t, j);
        if (this.f17005q.mo19799g(object)) {
            Object mo19801e = this.f17005q.mo19801e(m19477u);
            this.f17005q.mo19805a(mo19801e, object);
            unsafe.putObject(t, j, mo19801e);
            object = mo19801e;
        }
        return m19493m(bArr, i, i2, this.f17005q.mo19803c(m19477u), this.f17005q.mo19802d(object), c7022b);
    }

    /* renamed from: c0 */
    private int m19505c0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C7020e.C7022b c7022b) throws IOException {
        Unsafe unsafe = f16988s;
        long j2 = this.f16989a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(C7020e.m20190d(bArr, i)));
                    int i9 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(C7020e.m20182l(bArr, i)));
                    int i10 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int m20196L = C7020e.m20196L(bArr, i, c7022b);
                    unsafe.putObject(t, j, Long.valueOf(c7022b.f16786b));
                    unsafe.putInt(t, j2, i4);
                    return m20196L;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int m20199I = C7020e.m20199I(bArr, i, c7022b);
                    unsafe.putObject(t, j, Integer.valueOf(c7022b.f16785a));
                    unsafe.putInt(t, j2, i4);
                    return m20199I;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(C7020e.m20184j(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(C7020e.m20186h(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int m20196L2 = C7020e.m20196L(bArr, i, c7022b);
                    unsafe.putObject(t, j, Boolean.valueOf(c7022b.f16786b != 0));
                    unsafe.putInt(t, j2, i4);
                    return m20196L2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int m20199I2 = C7020e.m20199I(bArr, i, c7022b);
                    int i13 = c7022b.f16785a;
                    if (i13 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) != 0 && !C7110s1.m19611t(bArr, m20199I2, m20199I2 + i13)) {
                        throw InvalidProtocolBufferException.m20254e();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, m20199I2, i13, C6997a0.f16756a));
                        m20199I2 += i13;
                    }
                    unsafe.putInt(t, j2, i4);
                    return m20199I2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int m20178p = C7020e.m20178p(m19475v(i8), bArr, i, i2, c7022b);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, c7022b.f16787c);
                    } else {
                        unsafe.putObject(t, j, C6997a0.m20228h(object, c7022b.f16787c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return m20178p;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int m20192b = C7020e.m20192b(bArr, i, c7022b);
                    unsafe.putObject(t, j, c7022b.f16787c);
                    unsafe.putInt(t, j2, i4);
                    return m20192b;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int m20199I3 = C7020e.m20199I(bArr, i, c7022b);
                    int i14 = c7022b.f16785a;
                    C6997a0.InterfaceC7002e m19479t = m19479t(i8);
                    if (m19479t != null && !m19479t.mo20223a(i14)) {
                        m19473w(t).m19775m(i3, Long.valueOf(i14));
                    } else {
                        unsafe.putObject(t, j, Integer.valueOf(i14));
                        unsafe.putInt(t, j2, i4);
                    }
                    return m20199I3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int m20199I4 = C7020e.m20199I(bArr, i, c7022b);
                    unsafe.putObject(t, j, Integer.valueOf(AbstractC7052j.m20069b(c7022b.f16785a)));
                    unsafe.putInt(t, j2, i4);
                    return m20199I4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int m20196L3 = C7020e.m20196L(bArr, i, c7022b);
                    unsafe.putObject(t, j, Long.valueOf(AbstractC7052j.m20068c(c7022b.f16786b)));
                    unsafe.putInt(t, j2, i4);
                    return m20196L3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int m20180n = C7020e.m20180n(m19475v(i8), bArr, i, i2, (i3 & (-8)) | 4, c7022b);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, c7022b.f16787c);
                    } else {
                        unsafe.putObject(t, j, C6997a0.m20228h(object2, c7022b.f16787c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return m20180n;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0296, code lost:
        if (r0 != r15) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0298, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r1 = r19;
        r2 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02dd, code lost:
        if (r0 != r15) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0300, code lost:
        if (r0 != r15) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0303, code lost:
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m19503e0(T r31, byte[] r32, int r33, int r34, com.google.protobuf.C7020e.C7022b r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7129u0.m19503e0(java.lang.Object, byte[], int, int, com.google.protobuf.e$b):int");
    }

    /* renamed from: f0 */
    private int m19502f0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C7020e.C7022b c7022b) throws IOException {
        int m20198J;
        C6997a0.InterfaceC7006i interfaceC7006i = (C6997a0.InterfaceC7006i) f16988s.getObject(t, j2);
        if (!interfaceC7006i.mo20222c0()) {
            int size = interfaceC7006i.size();
            interfaceC7006i = interfaceC7006i.mo19330j(size == 0 ? 10 : size * 2);
            f16988s.putObject(t, j2, interfaceC7006i);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return C7020e.m20175s(bArr, i, interfaceC7006i, c7022b);
                }
                if (i5 == 1) {
                    return C7020e.m20189e(i3, bArr, i, i2, interfaceC7006i, c7022b);
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    return C7020e.m20172v(bArr, i, interfaceC7006i, c7022b);
                }
                if (i5 == 5) {
                    return C7020e.m20181m(i3, bArr, i, i2, interfaceC7006i, c7022b);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return C7020e.m20168z(bArr, i, interfaceC7006i, c7022b);
                }
                if (i5 == 0) {
                    return C7020e.m20195M(i3, bArr, i, i2, interfaceC7006i, c7022b);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return C7020e.m20169y(bArr, i, interfaceC7006i, c7022b);
                }
                if (i5 == 0) {
                    return C7020e.m20198J(i3, bArr, i, i2, interfaceC7006i, c7022b);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return C7020e.m20173u(bArr, i, interfaceC7006i, c7022b);
                }
                if (i5 == 1) {
                    return C7020e.m20183k(i3, bArr, i, i2, interfaceC7006i, c7022b);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return C7020e.m20174t(bArr, i, interfaceC7006i, c7022b);
                }
                if (i5 == 5) {
                    return C7020e.m20185i(i3, bArr, i, i2, interfaceC7006i, c7022b);
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    return C7020e.m20176r(bArr, i, interfaceC7006i, c7022b);
                }
                if (i5 == 0) {
                    return C7020e.m20193a(i3, bArr, i, i2, interfaceC7006i, c7022b);
                }
                break;
            case 26:
                if (i5 == 2) {
                    if ((j & IjkMediaMeta.AV_CH_STEREO_LEFT) == 0) {
                        return C7020e.m20204D(i3, bArr, i, i2, interfaceC7006i, c7022b);
                    }
                    return C7020e.m20203E(i3, bArr, i, i2, interfaceC7006i, c7022b);
                }
                break;
            case 27:
                if (i5 == 2) {
                    return C7020e.m20177q(m19475v(i6), i3, bArr, i, i2, interfaceC7006i, c7022b);
                }
                break;
            case 28:
                if (i5 == 2) {
                    return C7020e.m20191c(i3, bArr, i, i2, interfaceC7006i, c7022b);
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    m20198J = C7020e.m20169y(bArr, i, interfaceC7006i, c7022b);
                } else if (i5 == 0) {
                    m20198J = C7020e.m20198J(i3, bArr, i, i2, interfaceC7006i, c7022b);
                }
                AbstractC7141y abstractC7141y = (AbstractC7141y) t;
                C7088o1 c7088o1 = abstractC7141y.unknownFields;
                if (c7088o1 == C7088o1.m19785c()) {
                    c7088o1 = null;
                }
                C7088o1 c7088o12 = (C7088o1) C7061j1.m19978A(i4, interfaceC7006i, m19479t(i6), c7088o1, this.f17003o);
                if (c7088o12 != null) {
                    abstractC7141y.unknownFields = c7088o12;
                }
                return m20198J;
            case 33:
            case 47:
                if (i5 == 2) {
                    return C7020e.m20171w(bArr, i, interfaceC7006i, c7022b);
                }
                if (i5 == 0) {
                    return C7020e.m20207A(i3, bArr, i, i2, interfaceC7006i, c7022b);
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    return C7020e.m20170x(bArr, i, interfaceC7006i, c7022b);
                }
                if (i5 == 0) {
                    return C7020e.m20206B(i3, bArr, i, i2, interfaceC7006i, c7022b);
                }
                break;
            case 49:
                if (i5 == 3) {
                    return C7020e.m20179o(m19475v(i6), i3, bArr, i, i2, interfaceC7006i, c7022b);
                }
                break;
        }
        return i;
    }

    /* renamed from: g0 */
    private int m19501g0(int i) {
        if (i < this.f16991c || i > this.f16992d) {
            return -1;
        }
        return m19484q0(i, 0);
    }

    /* renamed from: h0 */
    private int m19500h0(int i, int i2) {
        if (i < this.f16991c || i > this.f16992d) {
            return -1;
        }
        return m19484q0(i, i2);
    }

    /* renamed from: i0 */
    private int m19499i0(int i) {
        return this.f16989a[i + 2];
    }

    /* renamed from: j0 */
    private <E> void m19498j0(Object obj, long j, InterfaceC7032g1 interfaceC7032g1, InterfaceC7038h1<E> interfaceC7038h1, C7089p c7089p) throws IOException {
        interfaceC7032g1.mo19892f(this.f17002n.mo20105e(obj, j), interfaceC7038h1, c7089p);
    }

    /* renamed from: k */
    private boolean m19497k(T t, T t2, int i) {
        return m19531C(t, i) == m19531C(t2, i);
    }

    /* renamed from: k0 */
    private <E> void m19496k0(Object obj, int i, InterfaceC7032g1 interfaceC7032g1, InterfaceC7038h1<E> interfaceC7038h1, C7089p c7089p) throws IOException {
        interfaceC7032g1.mo19887k(this.f17002n.mo20105e(obj, m19512V(i)), interfaceC7038h1, c7089p);
    }

    /* renamed from: l */
    private static <T> boolean m19495l(T t, long j) {
        return C7102r1.m19663t(t, j);
    }

    /* renamed from: l0 */
    private void m19494l0(Object obj, int i, InterfaceC7032g1 interfaceC7032g1) throws IOException {
        if (m19532B(i)) {
            C7102r1.m19685V(obj, m19512V(i), interfaceC7032g1.mo19908N());
        } else if (this.f16995g) {
            C7102r1.m19685V(obj, m19512V(i), interfaceC7032g1.mo19873y());
        } else {
            C7102r1.m19685V(obj, m19512V(i), interfaceC7032g1.mo19916F());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.Map, java.util.Map<K, V>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* renamed from: m */
    private <K, V> int m19493m(byte[] bArr, int i, int i2, C7064k0.C7065a<K, V> c7065a, Map<K, V> map, C7020e.C7022b c7022b) throws IOException {
        int i3;
        int m20199I = C7020e.m20199I(bArr, i, c7022b);
        int i4 = c7022b.f16785a;
        if (i4 >= 0 && i4 <= i2 - m20199I) {
            int i5 = m20199I + i4;
            K k = c7065a.f16877b;
            V v = c7065a.f16879d;
            while (m20199I < i5) {
                int i6 = m20199I + 1;
                byte b = bArr[m20199I];
                if (b < 0) {
                    i3 = C7020e.m20200H(b, bArr, i6, c7022b);
                    b = c7022b.f16785a;
                } else {
                    i3 = i6;
                }
                int i7 = b >>> 3;
                int i8 = b & 7;
                if (i7 != 1) {
                    if (i7 == 2 && i8 == c7065a.f16878c.m19560b()) {
                        m20199I = m19491n(bArr, i3, i2, c7065a.f16878c, c7065a.f16879d.getClass(), c7022b);
                        v = c7022b.f16787c;
                    }
                    m20199I = C7020e.m20194N(b, bArr, i3, i2, c7022b);
                } else if (i8 == c7065a.f16876a.m19560b()) {
                    m20199I = m19491n(bArr, i3, i2, c7065a.f16876a, null, c7022b);
                    k = c7022b.f16787c;
                } else {
                    m20199I = C7020e.m20194N(b, bArr, i3, i2, c7022b);
                }
            }
            if (m20199I == i5) {
                map.put(k, v);
                return i5;
            }
            throw InvalidProtocolBufferException.m20250i();
        }
        throw InvalidProtocolBufferException.m20245n();
    }

    /* renamed from: m0 */
    private void m19492m0(Object obj, int i, InterfaceC7032g1 interfaceC7032g1) throws IOException {
        if (m19532B(i)) {
            interfaceC7032g1.mo19917E(this.f17002n.mo20105e(obj, m19512V(i)));
        } else {
            interfaceC7032g1.mo19920B(this.f17002n.mo20105e(obj, m19512V(i)));
        }
    }

    /* renamed from: n */
    private int m19491n(byte[] bArr, int i, int i2, C7118t1.EnumC7120b enumC7120b, Class<?> cls, C7020e.C7022b c7022b) throws IOException {
        switch (C7130a.f17006a[enumC7120b.ordinal()]) {
            case 1:
                int m20196L = C7020e.m20196L(bArr, i, c7022b);
                c7022b.f16787c = Boolean.valueOf(c7022b.f16786b != 0);
                return m20196L;
            case 2:
                return C7020e.m20192b(bArr, i, c7022b);
            case 3:
                c7022b.f16787c = Double.valueOf(C7020e.m20190d(bArr, i));
                return i + 8;
            case 4:
            case 5:
                c7022b.f16787c = Integer.valueOf(C7020e.m20186h(bArr, i));
                return i + 4;
            case 6:
            case 7:
                c7022b.f16787c = Long.valueOf(C7020e.m20184j(bArr, i));
                return i + 8;
            case 8:
                c7022b.f16787c = Float.valueOf(C7020e.m20182l(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int m20199I = C7020e.m20199I(bArr, i, c7022b);
                c7022b.f16787c = Integer.valueOf(c7022b.f16785a);
                return m20199I;
            case 12:
            case 13:
                int m20196L2 = C7020e.m20196L(bArr, i, c7022b);
                c7022b.f16787c = Long.valueOf(c7022b.f16786b);
                return m20196L2;
            case 14:
                return C7020e.m20178p(C7019d1.m20212a().m20209d(cls), bArr, i, i2, c7022b);
            case 15:
                int m20199I2 = C7020e.m20199I(bArr, i, c7022b);
                c7022b.f16787c = Integer.valueOf(AbstractC7052j.m20069b(c7022b.f16785a));
                return m20199I2;
            case 16:
                int m20196L3 = C7020e.m20196L(bArr, i, c7022b);
                c7022b.f16787c = Long.valueOf(AbstractC7052j.m20068c(c7022b.f16786b));
                return m20196L3;
            case 17:
                return C7020e.m20202F(bArr, i, c7022b);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: n0 */
    private static Field m19490n0(Class<?> cls, String str) {
        Field[] declaredFields;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: o */
    private static <T> double m19489o(T t, long j) {
        return C7102r1.m19706A(t, j);
    }

    /* renamed from: o0 */
    private void m19488o0(T t, int i) {
        int m19499i0 = m19499i0(i);
        long j = 1048575 & m19499i0;
        if (j == 1048575) {
            return;
        }
        C7102r1.m19687T(t, j, (1 << (m19499i0 >>> 20)) | C7102r1.m19704C(t, j));
    }

    /* renamed from: p */
    private boolean m19487p(T t, T t2, int i) {
        int m19480s0 = m19480s0(i);
        long m19512V = m19512V(m19480s0);
        switch (m19482r0(m19480s0)) {
            case 0:
                return m19497k(t, t2, i) && Double.doubleToLongBits(C7102r1.m19706A(t, m19512V)) == Double.doubleToLongBits(C7102r1.m19706A(t2, m19512V));
            case 1:
                return m19497k(t, t2, i) && Float.floatToIntBits(C7102r1.m19705B(t, m19512V)) == Float.floatToIntBits(C7102r1.m19705B(t2, m19512V));
            case 2:
                return m19497k(t, t2, i) && C7102r1.m19702E(t, m19512V) == C7102r1.m19702E(t2, m19512V);
            case 3:
                return m19497k(t, t2, i) && C7102r1.m19702E(t, m19512V) == C7102r1.m19702E(t2, m19512V);
            case 4:
                return m19497k(t, t2, i) && C7102r1.m19704C(t, m19512V) == C7102r1.m19704C(t2, m19512V);
            case 5:
                return m19497k(t, t2, i) && C7102r1.m19702E(t, m19512V) == C7102r1.m19702E(t2, m19512V);
            case 6:
                return m19497k(t, t2, i) && C7102r1.m19704C(t, m19512V) == C7102r1.m19704C(t2, m19512V);
            case 7:
                return m19497k(t, t2, i) && C7102r1.m19663t(t, m19512V) == C7102r1.m19663t(t2, m19512V);
            case 8:
                return m19497k(t, t2, i) && C7061j1.m19968K(C7102r1.m19700G(t, m19512V), C7102r1.m19700G(t2, m19512V));
            case 9:
                return m19497k(t, t2, i) && C7061j1.m19968K(C7102r1.m19700G(t, m19512V), C7102r1.m19700G(t2, m19512V));
            case 10:
                return m19497k(t, t2, i) && C7061j1.m19968K(C7102r1.m19700G(t, m19512V), C7102r1.m19700G(t2, m19512V));
            case 11:
                return m19497k(t, t2, i) && C7102r1.m19704C(t, m19512V) == C7102r1.m19704C(t2, m19512V);
            case 12:
                return m19497k(t, t2, i) && C7102r1.m19704C(t, m19512V) == C7102r1.m19704C(t2, m19512V);
            case 13:
                return m19497k(t, t2, i) && C7102r1.m19704C(t, m19512V) == C7102r1.m19704C(t2, m19512V);
            case 14:
                return m19497k(t, t2, i) && C7102r1.m19702E(t, m19512V) == C7102r1.m19702E(t2, m19512V);
            case 15:
                return m19497k(t, t2, i) && C7102r1.m19704C(t, m19512V) == C7102r1.m19704C(t2, m19512V);
            case 16:
                return m19497k(t, t2, i) && C7102r1.m19702E(t, m19512V) == C7102r1.m19702E(t2, m19512V);
            case 17:
                return m19497k(t, t2, i) && C7061j1.m19968K(C7102r1.m19700G(t, m19512V), C7102r1.m19700G(t2, m19512V));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return C7061j1.m19968K(C7102r1.m19700G(t, m19512V), C7102r1.m19700G(t2, m19512V));
            case 50:
                return C7061j1.m19968K(C7102r1.m19700G(t, m19512V), C7102r1.m19700G(t2, m19512V));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return m19526H(t, t2, i) && C7061j1.m19968K(C7102r1.m19700G(t, m19512V), C7102r1.m19700G(t2, m19512V));
            default:
                return true;
        }
    }

    /* renamed from: p0 */
    private void m19486p0(T t, int i, int i2) {
        C7102r1.m19687T(t, m19499i0(i2) & 1048575, i);
    }

    /* renamed from: q */
    private final <UT, UB> UB m19485q(Object obj, int i, UB ub, AbstractC7085n1<UT, UB> abstractC7085n1) {
        C6997a0.InterfaceC7002e m19479t;
        int m19513U = m19513U(i);
        Object m19700G = C7102r1.m19700G(obj, m19512V(m19480s0(i)));
        return (m19700G == null || (m19479t = m19479t(i)) == null) ? ub : (UB) m19483r(i, m19513U, this.f17005q.mo19802d(m19700G), m19479t, ub, abstractC7085n1);
    }

    /* renamed from: q0 */
    private int m19484q0(int i, int i2) {
        int length = (this.f16989a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int m19513U = m19513U(i4);
            if (i == m19513U) {
                return i4;
            }
            if (i < m19513U) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: r */
    private final <K, V, UT, UB> UB m19483r(int i, int i2, Map<K, V> map, C6997a0.InterfaceC7002e interfaceC7002e, UB ub, AbstractC7085n1<UT, UB> abstractC7085n1) {
        C7064k0.C7065a<?, ?> mo19803c = this.f17005q.mo19803c(m19477u(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!interfaceC7002e.mo20223a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = abstractC7085n1.mo19744n();
                }
                AbstractC7039i.C7046g m20102I = AbstractC7039i.m20102I(C7064k0.m19870b(mo19803c, next.getKey(), next.getValue()));
                try {
                    C7064k0.m19867e(m20102I.m20086b(), mo19803c, next.getKey(), next.getValue());
                    abstractC7085n1.mo19752d(ub, i2, m20102I.m20087a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: r0 */
    private static int m19482r0(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: s */
    private static <T> float m19481s(T t, long j) {
        return C7102r1.m19705B(t, j);
    }

    /* renamed from: s0 */
    private int m19480s0(int i) {
        return this.f16989a[i + 1];
    }

    /* renamed from: t */
    private C6997a0.InterfaceC7002e m19479t(int i) {
        return (C6997a0.InterfaceC7002e) this.f16990b[((i / 3) * 2) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0491  */
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m19478t0(T r18, com.google.protobuf.InterfaceC7131u1 r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7129u0.m19478t0(java.lang.Object, com.google.protobuf.u1):void");
    }

    /* renamed from: u */
    private Object m19477u(int i) {
        return this.f16990b[(i / 3) * 2];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0588  */
    /* renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m19476u0(T r13, com.google.protobuf.InterfaceC7131u1 r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7129u0.m19476u0(java.lang.Object, com.google.protobuf.u1):void");
    }

    /* renamed from: v */
    private InterfaceC7038h1 m19475v(int i) {
        int i2 = (i / 3) * 2;
        InterfaceC7038h1 interfaceC7038h1 = (InterfaceC7038h1) this.f16990b[i2];
        if (interfaceC7038h1 != null) {
            return interfaceC7038h1;
        }
        InterfaceC7038h1<T> m20209d = C7019d1.m20212a().m20209d((Class) this.f16990b[i2 + 1]);
        this.f16990b[i2] = m20209d;
        return m20209d;
    }

    /* renamed from: v0 */
    private <K, V> void m19474v0(InterfaceC7131u1 interfaceC7131u1, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            interfaceC7131u1.mo19465C(i, this.f17005q.mo19803c(m19477u(i2)), this.f17005q.mo19798h(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static C7088o1 m19473w(Object obj) {
        AbstractC7141y abstractC7141y = (AbstractC7141y) obj;
        C7088o1 c7088o1 = abstractC7141y.unknownFields;
        if (c7088o1 == C7088o1.m19785c()) {
            C7088o1 m19778j = C7088o1.m19778j();
            abstractC7141y.unknownFields = m19778j;
            return m19778j;
        }
        return c7088o1;
    }

    /* renamed from: w0 */
    private void m19472w0(int i, Object obj, InterfaceC7131u1 interfaceC7131u1) throws IOException {
        if (obj instanceof String) {
            interfaceC7131u1.mo19439n(i, (String) obj);
        } else {
            interfaceC7131u1.mo19431v(i, (AbstractC7039i) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: x */
    private int m19471x(T t) {
        int i;
        int i2;
        int m20322j;
        int m20332e;
        int m20359M;
        int m19939i;
        int m20341W;
        int m20339Y;
        Unsafe unsafe = f16988s;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        int i7 = 0;
        while (i4 < this.f16989a.length) {
            int m19480s0 = m19480s0(i4);
            int m19513U = m19513U(i4);
            int m19482r0 = m19482r0(m19480s0);
            if (m19482r0 <= 17) {
                i = this.f16989a[i4 + 2];
                int i8 = i & i3;
                i2 = 1 << (i >>> 20);
                if (i8 != i6) {
                    i7 = unsafe.getInt(t, i8);
                    i6 = i8;
                }
            } else {
                i = (!this.f16997i || m19482r0 < EnumC7133v.DOUBLE_LIST_PACKED.m19426a() || m19482r0 > EnumC7133v.SINT64_LIST_PACKED.m19426a()) ? 0 : this.f16989a[i4 + 2] & i3;
                i2 = 0;
            }
            long m19512V = m19512V(m19480s0);
            switch (m19482r0) {
                case 0:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        m20322j = CodedOutputStream.m20322j(m19513U, 0.0d);
                        i5 += m20322j;
                        break;
                    }
                case 1:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        m20322j = CodedOutputStream.m20312r(m19513U, 0.0f);
                        i5 += m20322j;
                        break;
                    }
                case 2:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        m20322j = CodedOutputStream.m20301y(m19513U, unsafe.getLong(t, m19512V));
                        i5 += m20322j;
                        break;
                    }
                case 3:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        m20322j = CodedOutputStream.m20338Z(m19513U, unsafe.getLong(t, m19512V));
                        i5 += m20322j;
                        break;
                    }
                case 4:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        m20322j = CodedOutputStream.m20303w(m19513U, unsafe.getInt(t, m19512V));
                        i5 += m20322j;
                        break;
                    }
                case 5:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        m20322j = CodedOutputStream.m20314p(m19513U, 0L);
                        i5 += m20322j;
                        break;
                    }
                case 6:
                    if ((i7 & i2) != 0) {
                        m20322j = CodedOutputStream.m20317n(m19513U, 0);
                        i5 += m20322j;
                        break;
                    }
                    break;
                case 7:
                    if ((i7 & i2) != 0) {
                        m20332e = CodedOutputStream.m20332e(m19513U, true);
                        i5 += m20332e;
                    }
                    break;
                case 8:
                    if ((i7 & i2) != 0) {
                        Object object = unsafe.getObject(t, m19512V);
                        if (object instanceof AbstractC7039i) {
                            m20332e = CodedOutputStream.m20326h(m19513U, (AbstractC7039i) object);
                        } else {
                            m20332e = CodedOutputStream.m20344U(m19513U, (String) object);
                        }
                        i5 += m20332e;
                    }
                    break;
                case 9:
                    if ((i7 & i2) != 0) {
                        m20332e = C7061j1.m19933o(m19513U, unsafe.getObject(t, m19512V), m19475v(i4));
                        i5 += m20332e;
                    }
                    break;
                case 10:
                    if ((i7 & i2) != 0) {
                        m20332e = CodedOutputStream.m20326h(m19513U, (AbstractC7039i) unsafe.getObject(t, m19512V));
                        i5 += m20332e;
                    }
                    break;
                case 11:
                    if ((i7 & i2) != 0) {
                        m20332e = CodedOutputStream.m20340X(m19513U, unsafe.getInt(t, m19512V));
                        i5 += m20332e;
                    }
                    break;
                case 12:
                    if ((i7 & i2) != 0) {
                        m20332e = CodedOutputStream.m20320l(m19513U, unsafe.getInt(t, m19512V));
                        i5 += m20332e;
                    }
                    break;
                case 13:
                    if ((i7 & i2) != 0) {
                        m20359M = CodedOutputStream.m20359M(m19513U, 0);
                        i5 += m20359M;
                    }
                    break;
                case 14:
                    if ((i7 & i2) != 0) {
                        m20332e = CodedOutputStream.m20356O(m19513U, 0L);
                        i5 += m20332e;
                    }
                    break;
                case 15:
                    if ((i7 & i2) != 0) {
                        m20332e = CodedOutputStream.m20352Q(m19513U, unsafe.getInt(t, m19512V));
                        i5 += m20332e;
                    }
                    break;
                case 16:
                    if ((i7 & i2) != 0) {
                        m20332e = CodedOutputStream.m20348S(m19513U, unsafe.getLong(t, m19512V));
                        i5 += m20332e;
                    }
                    break;
                case 17:
                    if ((i7 & i2) != 0) {
                        m20332e = CodedOutputStream.m20308t(m19513U, (InterfaceC7100r0) unsafe.getObject(t, m19512V), m19475v(i4));
                        i5 += m20332e;
                    }
                    break;
                case 18:
                    m20332e = C7061j1.m19940h(m19513U, (List) unsafe.getObject(t, m19512V), false);
                    i5 += m20332e;
                    break;
                case 19:
                    m20332e = C7061j1.m19942f(m19513U, (List) unsafe.getObject(t, m19512V), false);
                    i5 += m20332e;
                    break;
                case 20:
                    m20332e = C7061j1.m19935m(m19513U, (List) unsafe.getObject(t, m19512V), false);
                    i5 += m20332e;
                    break;
                case 21:
                    m20332e = C7061j1.m19924x(m19513U, (List) unsafe.getObject(t, m19512V), false);
                    i5 += m20332e;
                    break;
                case 22:
                    m20332e = C7061j1.m19937k(m19513U, (List) unsafe.getObject(t, m19512V), false);
                    i5 += m20332e;
                    break;
                case 23:
                    m20332e = C7061j1.m19940h(m19513U, (List) unsafe.getObject(t, m19512V), false);
                    i5 += m20332e;
                    break;
                case 24:
                    m20332e = C7061j1.m19942f(m19513U, (List) unsafe.getObject(t, m19512V), false);
                    i5 += m20332e;
                    break;
                case 25:
                    m20332e = C7061j1.m19952a(m19513U, (List) unsafe.getObject(t, m19512V), false);
                    i5 += m20332e;
                    break;
                case 26:
                    m20332e = C7061j1.m19927u(m19513U, (List) unsafe.getObject(t, m19512V));
                    i5 += m20332e;
                    break;
                case 27:
                    m20332e = C7061j1.m19932p(m19513U, (List) unsafe.getObject(t, m19512V), m19475v(i4));
                    i5 += m20332e;
                    break;
                case 28:
                    m20332e = C7061j1.m19948c(m19513U, (List) unsafe.getObject(t, m19512V));
                    i5 += m20332e;
                    break;
                case 29:
                    m20332e = C7061j1.m19926v(m19513U, (List) unsafe.getObject(t, m19512V), false);
                    i5 += m20332e;
                    break;
                case 30:
                    m20332e = C7061j1.m19946d(m19513U, (List) unsafe.getObject(t, m19512V), false);
                    i5 += m20332e;
                    break;
                case 31:
                    m20332e = C7061j1.m19942f(m19513U, (List) unsafe.getObject(t, m19512V), false);
                    i5 += m20332e;
                    break;
                case 32:
                    m20332e = C7061j1.m19940h(m19513U, (List) unsafe.getObject(t, m19512V), false);
                    i5 += m20332e;
                    break;
                case 33:
                    m20332e = C7061j1.m19931q(m19513U, (List) unsafe.getObject(t, m19512V), false);
                    i5 += m20332e;
                    break;
                case 34:
                    m20332e = C7061j1.m19929s(m19513U, (List) unsafe.getObject(t, m19512V), false);
                    i5 += m20332e;
                    break;
                case 35:
                    m19939i = C7061j1.m19939i((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20359M = m20341W + m20339Y + m19939i;
                        i5 += m20359M;
                    }
                    break;
                case 36:
                    m19939i = C7061j1.m19941g((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20359M = m20341W + m20339Y + m19939i;
                        i5 += m20359M;
                    }
                    break;
                case 37:
                    m19939i = C7061j1.m19934n((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20359M = m20341W + m20339Y + m19939i;
                        i5 += m20359M;
                    }
                    break;
                case 38:
                    m19939i = C7061j1.m19923y((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20359M = m20341W + m20339Y + m19939i;
                        i5 += m20359M;
                    }
                    break;
                case 39:
                    m19939i = C7061j1.m19936l((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20359M = m20341W + m20339Y + m19939i;
                        i5 += m20359M;
                    }
                    break;
                case 40:
                    m19939i = C7061j1.m19939i((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20359M = m20341W + m20339Y + m19939i;
                        i5 += m20359M;
                    }
                    break;
                case 41:
                    m19939i = C7061j1.m19941g((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20359M = m20341W + m20339Y + m19939i;
                        i5 += m20359M;
                    }
                    break;
                case 42:
                    m19939i = C7061j1.m19950b((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20359M = m20341W + m20339Y + m19939i;
                        i5 += m20359M;
                    }
                    break;
                case 43:
                    m19939i = C7061j1.m19925w((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20359M = m20341W + m20339Y + m19939i;
                        i5 += m20359M;
                    }
                    break;
                case 44:
                    m19939i = C7061j1.m19944e((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20359M = m20341W + m20339Y + m19939i;
                        i5 += m20359M;
                    }
                    break;
                case 45:
                    m19939i = C7061j1.m19941g((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20359M = m20341W + m20339Y + m19939i;
                        i5 += m20359M;
                    }
                    break;
                case 46:
                    m19939i = C7061j1.m19939i((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20359M = m20341W + m20339Y + m19939i;
                        i5 += m20359M;
                    }
                    break;
                case 47:
                    m19939i = C7061j1.m19930r((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20359M = m20341W + m20339Y + m19939i;
                        i5 += m20359M;
                    }
                    break;
                case 48:
                    m19939i = C7061j1.m19928t((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20359M = m20341W + m20339Y + m19939i;
                        i5 += m20359M;
                    }
                    break;
                case 49:
                    m20332e = C7061j1.m19938j(m19513U, (List) unsafe.getObject(t, m19512V), m19475v(i4));
                    i5 += m20332e;
                    break;
                case 50:
                    m20332e = this.f17005q.mo19800f(m19513U, unsafe.getObject(t, m19512V), m19477u(i4));
                    i5 += m20332e;
                    break;
                case 51:
                    if (m19525I(t, m19513U, i4)) {
                        m20332e = CodedOutputStream.m20322j(m19513U, 0.0d);
                        i5 += m20332e;
                    }
                    break;
                case 52:
                    if (m19525I(t, m19513U, i4)) {
                        m20332e = CodedOutputStream.m20312r(m19513U, 0.0f);
                        i5 += m20332e;
                    }
                    break;
                case 53:
                    if (m19525I(t, m19513U, i4)) {
                        m20332e = CodedOutputStream.m20301y(m19513U, m19507a0(t, m19512V));
                        i5 += m20332e;
                    }
                    break;
                case 54:
                    if (m19525I(t, m19513U, i4)) {
                        m20332e = CodedOutputStream.m20338Z(m19513U, m19507a0(t, m19512V));
                        i5 += m20332e;
                    }
                    break;
                case 55:
                    if (m19525I(t, m19513U, i4)) {
                        m20332e = CodedOutputStream.m20303w(m19513U, m19508Z(t, m19512V));
                        i5 += m20332e;
                    }
                    break;
                case 56:
                    if (m19525I(t, m19513U, i4)) {
                        m20332e = CodedOutputStream.m20314p(m19513U, 0L);
                        i5 += m20332e;
                    }
                    break;
                case 57:
                    if (m19525I(t, m19513U, i4)) {
                        m20359M = CodedOutputStream.m20317n(m19513U, 0);
                        i5 += m20359M;
                    }
                    break;
                case 58:
                    if (m19525I(t, m19513U, i4)) {
                        m20332e = CodedOutputStream.m20332e(m19513U, true);
                        i5 += m20332e;
                    }
                    break;
                case 59:
                    if (m19525I(t, m19513U, i4)) {
                        Object object2 = unsafe.getObject(t, m19512V);
                        if (object2 instanceof AbstractC7039i) {
                            m20332e = CodedOutputStream.m20326h(m19513U, (AbstractC7039i) object2);
                        } else {
                            m20332e = CodedOutputStream.m20344U(m19513U, (String) object2);
                        }
                        i5 += m20332e;
                    }
                    break;
                case 60:
                    if (m19525I(t, m19513U, i4)) {
                        m20332e = C7061j1.m19933o(m19513U, unsafe.getObject(t, m19512V), m19475v(i4));
                        i5 += m20332e;
                    }
                    break;
                case 61:
                    if (m19525I(t, m19513U, i4)) {
                        m20332e = CodedOutputStream.m20326h(m19513U, (AbstractC7039i) unsafe.getObject(t, m19512V));
                        i5 += m20332e;
                    }
                    break;
                case 62:
                    if (m19525I(t, m19513U, i4)) {
                        m20332e = CodedOutputStream.m20340X(m19513U, m19508Z(t, m19512V));
                        i5 += m20332e;
                    }
                    break;
                case 63:
                    if (m19525I(t, m19513U, i4)) {
                        m20332e = CodedOutputStream.m20320l(m19513U, m19508Z(t, m19512V));
                        i5 += m20332e;
                    }
                    break;
                case 64:
                    if (m19525I(t, m19513U, i4)) {
                        m20359M = CodedOutputStream.m20359M(m19513U, 0);
                        i5 += m20359M;
                    }
                    break;
                case 65:
                    if (m19525I(t, m19513U, i4)) {
                        m20332e = CodedOutputStream.m20356O(m19513U, 0L);
                        i5 += m20332e;
                    }
                    break;
                case 66:
                    if (m19525I(t, m19513U, i4)) {
                        m20332e = CodedOutputStream.m20352Q(m19513U, m19508Z(t, m19512V));
                        i5 += m20332e;
                    }
                    break;
                case 67:
                    if (m19525I(t, m19513U, i4)) {
                        m20332e = CodedOutputStream.m20348S(m19513U, m19507a0(t, m19512V));
                        i5 += m20332e;
                    }
                    break;
                case 68:
                    if (m19525I(t, m19513U, i4)) {
                        m20332e = CodedOutputStream.m20308t(m19513U, (InterfaceC7100r0) unsafe.getObject(t, m19512V), m19475v(i4));
                        i5 += m20332e;
                    }
                    break;
            }
            i4 += 3;
            i3 = 1048575;
        }
        int m19468z = i5 + m19468z(this.f17003o, t);
        return this.f16994f ? m19468z + this.f17004p.mo19718c(t).m19549k() : m19468z;
    }

    /* renamed from: x0 */
    private <UT, UB> void m19470x0(AbstractC7085n1<UT, UB> abstractC7085n1, T t, InterfaceC7131u1 interfaceC7131u1) throws IOException {
        abstractC7085n1.mo19738t(abstractC7085n1.mo19749g(t), interfaceC7131u1);
    }

    /* renamed from: y */
    private int m19469y(T t) {
        int m20322j;
        int m19939i;
        int m20341W;
        int m20339Y;
        Unsafe unsafe = f16988s;
        int i = 0;
        for (int i2 = 0; i2 < this.f16989a.length; i2 += 3) {
            int m19480s0 = m19480s0(i2);
            int m19482r0 = m19482r0(m19480s0);
            int m19513U = m19513U(i2);
            long m19512V = m19512V(m19480s0);
            int i3 = (m19482r0 < EnumC7133v.DOUBLE_LIST_PACKED.m19426a() || m19482r0 > EnumC7133v.SINT64_LIST_PACKED.m19426a()) ? 0 : this.f16989a[i2 + 2] & 1048575;
            switch (m19482r0) {
                case 0:
                    if (m19531C(t, i2)) {
                        m20322j = CodedOutputStream.m20322j(m19513U, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (m19531C(t, i2)) {
                        m20322j = CodedOutputStream.m20312r(m19513U, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (m19531C(t, i2)) {
                        m20322j = CodedOutputStream.m20301y(m19513U, C7102r1.m19702E(t, m19512V));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (m19531C(t, i2)) {
                        m20322j = CodedOutputStream.m20338Z(m19513U, C7102r1.m19702E(t, m19512V));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (m19531C(t, i2)) {
                        m20322j = CodedOutputStream.m20303w(m19513U, C7102r1.m19704C(t, m19512V));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (m19531C(t, i2)) {
                        m20322j = CodedOutputStream.m20314p(m19513U, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (m19531C(t, i2)) {
                        m20322j = CodedOutputStream.m20317n(m19513U, 0);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (m19531C(t, i2)) {
                        m20322j = CodedOutputStream.m20332e(m19513U, true);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (m19531C(t, i2)) {
                        Object m19700G = C7102r1.m19700G(t, m19512V);
                        if (m19700G instanceof AbstractC7039i) {
                            m20322j = CodedOutputStream.m20326h(m19513U, (AbstractC7039i) m19700G);
                            break;
                        } else {
                            m20322j = CodedOutputStream.m20344U(m19513U, (String) m19700G);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (m19531C(t, i2)) {
                        m20322j = C7061j1.m19933o(m19513U, C7102r1.m19700G(t, m19512V), m19475v(i2));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (m19531C(t, i2)) {
                        m20322j = CodedOutputStream.m20326h(m19513U, (AbstractC7039i) C7102r1.m19700G(t, m19512V));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (m19531C(t, i2)) {
                        m20322j = CodedOutputStream.m20340X(m19513U, C7102r1.m19704C(t, m19512V));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (m19531C(t, i2)) {
                        m20322j = CodedOutputStream.m20320l(m19513U, C7102r1.m19704C(t, m19512V));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (m19531C(t, i2)) {
                        m20322j = CodedOutputStream.m20359M(m19513U, 0);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (m19531C(t, i2)) {
                        m20322j = CodedOutputStream.m20356O(m19513U, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (m19531C(t, i2)) {
                        m20322j = CodedOutputStream.m20352Q(m19513U, C7102r1.m19704C(t, m19512V));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (m19531C(t, i2)) {
                        m20322j = CodedOutputStream.m20348S(m19513U, C7102r1.m19702E(t, m19512V));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (m19531C(t, i2)) {
                        m20322j = CodedOutputStream.m20308t(m19513U, (InterfaceC7100r0) C7102r1.m19700G(t, m19512V), m19475v(i2));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    m20322j = C7061j1.m19940h(m19513U, m19523K(t, m19512V), false);
                    break;
                case 19:
                    m20322j = C7061j1.m19942f(m19513U, m19523K(t, m19512V), false);
                    break;
                case 20:
                    m20322j = C7061j1.m19935m(m19513U, m19523K(t, m19512V), false);
                    break;
                case 21:
                    m20322j = C7061j1.m19924x(m19513U, m19523K(t, m19512V), false);
                    break;
                case 22:
                    m20322j = C7061j1.m19937k(m19513U, m19523K(t, m19512V), false);
                    break;
                case 23:
                    m20322j = C7061j1.m19940h(m19513U, m19523K(t, m19512V), false);
                    break;
                case 24:
                    m20322j = C7061j1.m19942f(m19513U, m19523K(t, m19512V), false);
                    break;
                case 25:
                    m20322j = C7061j1.m19952a(m19513U, m19523K(t, m19512V), false);
                    break;
                case 26:
                    m20322j = C7061j1.m19927u(m19513U, m19523K(t, m19512V));
                    break;
                case 27:
                    m20322j = C7061j1.m19932p(m19513U, m19523K(t, m19512V), m19475v(i2));
                    break;
                case 28:
                    m20322j = C7061j1.m19948c(m19513U, m19523K(t, m19512V));
                    break;
                case 29:
                    m20322j = C7061j1.m19926v(m19513U, m19523K(t, m19512V), false);
                    break;
                case 30:
                    m20322j = C7061j1.m19946d(m19513U, m19523K(t, m19512V), false);
                    break;
                case 31:
                    m20322j = C7061j1.m19942f(m19513U, m19523K(t, m19512V), false);
                    break;
                case 32:
                    m20322j = C7061j1.m19940h(m19513U, m19523K(t, m19512V), false);
                    break;
                case 33:
                    m20322j = C7061j1.m19931q(m19513U, m19523K(t, m19512V), false);
                    break;
                case 34:
                    m20322j = C7061j1.m19929s(m19513U, m19523K(t, m19512V), false);
                    break;
                case 35:
                    m19939i = C7061j1.m19939i((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i3, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20322j = m20341W + m20339Y + m19939i;
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    m19939i = C7061j1.m19941g((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i3, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20322j = m20341W + m20339Y + m19939i;
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    m19939i = C7061j1.m19934n((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i3, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20322j = m20341W + m20339Y + m19939i;
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    m19939i = C7061j1.m19923y((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i3, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20322j = m20341W + m20339Y + m19939i;
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    m19939i = C7061j1.m19936l((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i3, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20322j = m20341W + m20339Y + m19939i;
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    m19939i = C7061j1.m19939i((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i3, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20322j = m20341W + m20339Y + m19939i;
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    m19939i = C7061j1.m19941g((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i3, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20322j = m20341W + m20339Y + m19939i;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    m19939i = C7061j1.m19950b((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i3, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20322j = m20341W + m20339Y + m19939i;
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    m19939i = C7061j1.m19925w((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i3, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20322j = m20341W + m20339Y + m19939i;
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    m19939i = C7061j1.m19944e((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i3, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20322j = m20341W + m20339Y + m19939i;
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    m19939i = C7061j1.m19941g((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i3, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20322j = m20341W + m20339Y + m19939i;
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    m19939i = C7061j1.m19939i((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i3, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20322j = m20341W + m20339Y + m19939i;
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    m19939i = C7061j1.m19930r((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i3, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20322j = m20341W + m20339Y + m19939i;
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    m19939i = C7061j1.m19928t((List) unsafe.getObject(t, m19512V));
                    if (m19939i > 0) {
                        if (this.f16997i) {
                            unsafe.putInt(t, i3, m19939i);
                        }
                        m20341W = CodedOutputStream.m20341W(m19513U);
                        m20339Y = CodedOutputStream.m20339Y(m19939i);
                        m20322j = m20341W + m20339Y + m19939i;
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    m20322j = C7061j1.m19938j(m19513U, m19523K(t, m19512V), m19475v(i2));
                    break;
                case 50:
                    m20322j = this.f17005q.mo19800f(m19513U, C7102r1.m19700G(t, m19512V), m19477u(i2));
                    break;
                case 51:
                    if (m19525I(t, m19513U, i2)) {
                        m20322j = CodedOutputStream.m20322j(m19513U, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (m19525I(t, m19513U, i2)) {
                        m20322j = CodedOutputStream.m20312r(m19513U, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (m19525I(t, m19513U, i2)) {
                        m20322j = CodedOutputStream.m20301y(m19513U, m19507a0(t, m19512V));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (m19525I(t, m19513U, i2)) {
                        m20322j = CodedOutputStream.m20338Z(m19513U, m19507a0(t, m19512V));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (m19525I(t, m19513U, i2)) {
                        m20322j = CodedOutputStream.m20303w(m19513U, m19508Z(t, m19512V));
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (m19525I(t, m19513U, i2)) {
                        m20322j = CodedOutputStream.m20314p(m19513U, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (m19525I(t, m19513U, i2)) {
                        m20322j = CodedOutputStream.m20317n(m19513U, 0);
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (m19525I(t, m19513U, i2)) {
                        m20322j = CodedOutputStream.m20332e(m19513U, true);
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (m19525I(t, m19513U, i2)) {
                        Object m19700G2 = C7102r1.m19700G(t, m19512V);
                        if (m19700G2 instanceof AbstractC7039i) {
                            m20322j = CodedOutputStream.m20326h(m19513U, (AbstractC7039i) m19700G2);
                            break;
                        } else {
                            m20322j = CodedOutputStream.m20344U(m19513U, (String) m19700G2);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (m19525I(t, m19513U, i2)) {
                        m20322j = C7061j1.m19933o(m19513U, C7102r1.m19700G(t, m19512V), m19475v(i2));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (m19525I(t, m19513U, i2)) {
                        m20322j = CodedOutputStream.m20326h(m19513U, (AbstractC7039i) C7102r1.m19700G(t, m19512V));
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (m19525I(t, m19513U, i2)) {
                        m20322j = CodedOutputStream.m20340X(m19513U, m19508Z(t, m19512V));
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (m19525I(t, m19513U, i2)) {
                        m20322j = CodedOutputStream.m20320l(m19513U, m19508Z(t, m19512V));
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (m19525I(t, m19513U, i2)) {
                        m20322j = CodedOutputStream.m20359M(m19513U, 0);
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (m19525I(t, m19513U, i2)) {
                        m20322j = CodedOutputStream.m20356O(m19513U, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (m19525I(t, m19513U, i2)) {
                        m20322j = CodedOutputStream.m20352Q(m19513U, m19508Z(t, m19512V));
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (m19525I(t, m19513U, i2)) {
                        m20322j = CodedOutputStream.m20348S(m19513U, m19507a0(t, m19512V));
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (m19525I(t, m19513U, i2)) {
                        m20322j = CodedOutputStream.m20308t(m19513U, (InterfaceC7100r0) C7102r1.m19700G(t, m19512V), m19475v(i2));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i += m20322j;
        }
        return i + m19468z(this.f17003o, t);
    }

    /* renamed from: z */
    private <UT, UB> int m19468z(AbstractC7085n1<UT, UB> abstractC7085n1, T t) {
        return abstractC7085n1.mo19748h(abstractC7085n1.mo19749g(t));
    }

    @Override // com.google.protobuf.InterfaceC7038h1
    /* renamed from: a */
    public void mo19425a(T t, T t2) {
        if (t2 == null) {
            throw null;
        }
        for (int i = 0; i < this.f16989a.length; i += 3) {
            m19517Q(t, t2, i);
        }
        C7061j1.m19972G(this.f17003o, t, t2);
        if (this.f16994f) {
            C7061j1.m19974E(this.f17004p, t, t2);
        }
    }

    @Override // com.google.protobuf.InterfaceC7038h1
    /* renamed from: b */
    public void mo19424b(T t, InterfaceC7131u1 interfaceC7131u1) throws IOException {
        interfaceC7131u1.mo19441l();
        InterfaceC7131u1.EnumC7132a enumC7132a = InterfaceC7131u1.EnumC7132a.DESCENDING;
        if (this.f16996h) {
            m19476u0(t, interfaceC7131u1);
        } else {
            m19478t0(t, interfaceC7131u1);
        }
    }

    @Override // com.google.protobuf.InterfaceC7038h1
    /* renamed from: c */
    public void mo19423c(T t) {
        int i;
        int i2 = this.f16999k;
        while (true) {
            i = this.f17000l;
            if (i2 >= i) {
                break;
            }
            long m19512V = m19512V(m19480s0(this.f16998j[i2]));
            Object m19700G = C7102r1.m19700G(t, m19512V);
            if (m19700G != null) {
                C7102r1.m19685V(t, m19512V, this.f17005q.mo19804b(m19700G));
            }
            i2++;
        }
        int length = this.f16998j.length;
        while (i < length) {
            this.f17002n.mo20107c(t, this.f16998j[i]);
            i++;
        }
        this.f17003o.mo19746j(t);
        if (this.f16994f) {
            this.f17004p.mo19715f(t);
        }
    }

    @Override // com.google.protobuf.InterfaceC7038h1
    /* renamed from: d */
    public final boolean mo19422d(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f16999k) {
            int i6 = this.f16998j[i5];
            int m19513U = m19513U(i6);
            int m19480s0 = m19480s0(i6);
            int i7 = this.f16989a[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = f16988s.getInt(t, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if (m19524J(m19480s0) && !m19530D(t, i6, i, i2, i9)) {
                return false;
            }
            int m19482r0 = m19482r0(m19480s0);
            if (m19482r0 != 9 && m19482r0 != 17) {
                if (m19482r0 != 27) {
                    if (m19482r0 == 60 || m19482r0 == 68) {
                        if (m19525I(t, m19513U, i6) && !m19529E(t, m19480s0, m19475v(i6))) {
                            return false;
                        }
                    } else if (m19482r0 != 49) {
                        if (m19482r0 == 50 && !m19527G(t, m19480s0, i6)) {
                            return false;
                        }
                    }
                }
                if (!m19528F(t, m19480s0, i6)) {
                    return false;
                }
            } else if (m19530D(t, i6, i, i2, i9) && !m19529E(t, m19480s0, m19475v(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.f16994f || this.f17004p.mo19718c(t).m19545o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public int m19504d0(T t, byte[] bArr, int i, int i2, int i3, C7020e.C7022b c7022b) throws IOException {
        Unsafe unsafe;
        int i4;
        C7129u0<T> c7129u0;
        int i5;
        T t2;
        byte b;
        int m19501g0;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        T t3;
        T t4;
        int i14;
        T t5;
        int i15;
        int i16;
        C7129u0<T> c7129u02 = this;
        T t6 = t;
        byte[] bArr2 = bArr;
        int i17 = i2;
        int i18 = i3;
        C7020e.C7022b c7022b2 = c7022b;
        Unsafe unsafe2 = f16988s;
        int i19 = i;
        int i20 = -1;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 1048575;
        while (true) {
            if (i19 < i17) {
                int i25 = i19 + 1;
                byte b2 = bArr2[i19];
                if (b2 < 0) {
                    int m20200H = C7020e.m20200H(b2, bArr2, i25, c7022b2);
                    b = c7022b2.f16785a;
                    i25 = m20200H;
                } else {
                    b = b2;
                }
                int i26 = b >>> 3;
                int i27 = b & 7;
                if (i26 > i20) {
                    m19501g0 = c7129u02.m19500h0(i26, i21 / 3);
                } else {
                    m19501g0 = c7129u02.m19501g0(i26);
                }
                int i28 = m19501g0;
                if (i28 == -1) {
                    i6 = i26;
                    i7 = i25;
                    i8 = b;
                    i9 = i23;
                    i10 = i24;
                    unsafe = unsafe2;
                    i4 = i18;
                    i11 = 0;
                } else {
                    int i29 = c7129u02.f16989a[i28 + 1];
                    int m19482r0 = m19482r0(i29);
                    long m19512V = m19512V(i29);
                    int i30 = b;
                    if (m19482r0 <= 17) {
                        int i31 = c7129u02.f16989a[i28 + 2];
                        int i32 = 1 << (i31 >>> 20);
                        int i33 = i31 & 1048575;
                        if (i33 != i24) {
                            if (i24 != 1048575) {
                                unsafe2.putInt(t6, i24, i23);
                            }
                            i23 = unsafe2.getInt(t6, i33);
                            i10 = i33;
                        } else {
                            i10 = i24;
                        }
                        int i34 = i23;
                        switch (m19482r0) {
                            case 0:
                                t3 = t6;
                                i12 = i28;
                                i6 = i26;
                                i13 = i30;
                                bArr2 = bArr;
                                if (i27 == 1) {
                                    C7102r1.m19689R(t3, m19512V, C7020e.m20190d(bArr2, i25));
                                    i19 = i25 + 8;
                                    i23 = i34 | i32;
                                    i17 = i2;
                                    t6 = t3;
                                    i21 = i12;
                                    i22 = i13;
                                    i20 = i6;
                                    i24 = i10;
                                    i18 = i3;
                                    break;
                                } else {
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 1:
                                t3 = t6;
                                i12 = i28;
                                i6 = i26;
                                i13 = i30;
                                bArr2 = bArr;
                                if (i27 == 5) {
                                    C7102r1.m19688S(t3, m19512V, C7020e.m20182l(bArr2, i25));
                                    i19 = i25 + 4;
                                    i23 = i34 | i32;
                                    i17 = i2;
                                    t6 = t3;
                                    i21 = i12;
                                    i22 = i13;
                                    i20 = i6;
                                    i24 = i10;
                                    i18 = i3;
                                    break;
                                } else {
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 2:
                            case 3:
                                T t7 = t6;
                                i12 = i28;
                                i6 = i26;
                                i13 = i30;
                                bArr2 = bArr;
                                if (i27 == 0) {
                                    int m20196L = C7020e.m20196L(bArr2, i25, c7022b2);
                                    t4 = t7;
                                    unsafe2.putLong(t, m19512V, c7022b2.f16786b);
                                    i23 = i34 | i32;
                                    i19 = m20196L;
                                    i21 = i12;
                                    i22 = i13;
                                    t6 = t4;
                                    i20 = i6;
                                    i24 = i10;
                                    i17 = i2;
                                    i18 = i3;
                                    break;
                                } else {
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 4:
                            case 11:
                                t3 = t6;
                                i12 = i28;
                                i6 = i26;
                                i13 = i30;
                                bArr2 = bArr;
                                if (i27 == 0) {
                                    i19 = C7020e.m20199I(bArr2, i25, c7022b2);
                                    unsafe2.putInt(t3, m19512V, c7022b2.f16785a);
                                    i23 = i34 | i32;
                                    i17 = i2;
                                    t6 = t3;
                                    i21 = i12;
                                    i22 = i13;
                                    i20 = i6;
                                    i24 = i10;
                                    i18 = i3;
                                    break;
                                } else {
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 5:
                            case 14:
                                T t8 = t6;
                                i12 = i28;
                                i6 = i26;
                                i13 = i30;
                                bArr2 = bArr;
                                if (i27 == 1) {
                                    t4 = t8;
                                    unsafe2.putLong(t, m19512V, C7020e.m20184j(bArr2, i25));
                                    i19 = i25 + 8;
                                    i23 = i34 | i32;
                                    i21 = i12;
                                    i22 = i13;
                                    t6 = t4;
                                    i20 = i6;
                                    i24 = i10;
                                    i17 = i2;
                                    i18 = i3;
                                    break;
                                } else {
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 6:
                            case 13:
                                i14 = i2;
                                t5 = t6;
                                i12 = i28;
                                i6 = i26;
                                i13 = i30;
                                bArr2 = bArr;
                                if (i27 == 5) {
                                    unsafe2.putInt(t5, m19512V, C7020e.m20186h(bArr2, i25));
                                    i19 = i25 + 4;
                                    int i35 = i34 | i32;
                                    t6 = t5;
                                    i17 = i14;
                                    i21 = i12;
                                    i22 = i13;
                                    i24 = i10;
                                    i18 = i3;
                                    i23 = i35;
                                    i20 = i6;
                                    break;
                                } else {
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 7:
                                i14 = i2;
                                t5 = t6;
                                i12 = i28;
                                i6 = i26;
                                i13 = i30;
                                bArr2 = bArr;
                                if (i27 == 0) {
                                    i19 = C7020e.m20196L(bArr2, i25, c7022b2);
                                    C7102r1.m19695L(t5, m19512V, c7022b2.f16786b != 0);
                                    int i352 = i34 | i32;
                                    t6 = t5;
                                    i17 = i14;
                                    i21 = i12;
                                    i22 = i13;
                                    i24 = i10;
                                    i18 = i3;
                                    i23 = i352;
                                    i20 = i6;
                                    break;
                                } else {
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 8:
                                i14 = i2;
                                t5 = t6;
                                i12 = i28;
                                i6 = i26;
                                i13 = i30;
                                bArr2 = bArr;
                                if (i27 == 2) {
                                    if ((i29 & 536870912) == 0) {
                                        i19 = C7020e.m20205C(bArr2, i25, c7022b2);
                                    } else {
                                        i19 = C7020e.m20202F(bArr2, i25, c7022b2);
                                    }
                                    unsafe2.putObject(t5, m19512V, c7022b2.f16787c);
                                    int i3522 = i34 | i32;
                                    t6 = t5;
                                    i17 = i14;
                                    i21 = i12;
                                    i22 = i13;
                                    i24 = i10;
                                    i18 = i3;
                                    i23 = i3522;
                                    i20 = i6;
                                    break;
                                } else {
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 9:
                                t5 = t6;
                                i12 = i28;
                                i6 = i26;
                                i13 = i30;
                                bArr2 = bArr;
                                if (i27 == 2) {
                                    i14 = i2;
                                    i19 = C7020e.m20178p(c7129u02.m19475v(i12), bArr2, i25, i14, c7022b2);
                                    if ((i34 & i32) == 0) {
                                        unsafe2.putObject(t5, m19512V, c7022b2.f16787c);
                                    } else {
                                        unsafe2.putObject(t5, m19512V, C6997a0.m20228h(unsafe2.getObject(t5, m19512V), c7022b2.f16787c));
                                    }
                                    int i35222 = i34 | i32;
                                    t6 = t5;
                                    i17 = i14;
                                    i21 = i12;
                                    i22 = i13;
                                    i24 = i10;
                                    i18 = i3;
                                    i23 = i35222;
                                    i20 = i6;
                                    break;
                                } else {
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 10:
                                t3 = t6;
                                i12 = i28;
                                i6 = i26;
                                i13 = i30;
                                bArr2 = bArr;
                                if (i27 == 2) {
                                    i19 = C7020e.m20192b(bArr2, i25, c7022b2);
                                    unsafe2.putObject(t3, m19512V, c7022b2.f16787c);
                                    i23 = i34 | i32;
                                    i17 = i2;
                                    t6 = t3;
                                    i21 = i12;
                                    i22 = i13;
                                    i20 = i6;
                                    i24 = i10;
                                    i18 = i3;
                                    break;
                                } else {
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 12:
                                t3 = t6;
                                i12 = i28;
                                i6 = i26;
                                i13 = i30;
                                bArr2 = bArr;
                                if (i27 == 0) {
                                    i19 = C7020e.m20199I(bArr2, i25, c7022b2);
                                    int i36 = c7022b2.f16785a;
                                    C6997a0.InterfaceC7002e m19479t = c7129u02.m19479t(i12);
                                    if (m19479t != null && !m19479t.mo20223a(i36)) {
                                        m19473w(t).m19775m(i13, Long.valueOf(i36));
                                        i17 = i2;
                                        t6 = t3;
                                        i23 = i34;
                                        i21 = i12;
                                        i22 = i13;
                                        i20 = i6;
                                        i24 = i10;
                                        i18 = i3;
                                    } else {
                                        unsafe2.putInt(t3, m19512V, i36);
                                        i23 = i34 | i32;
                                        i17 = i2;
                                        t6 = t3;
                                        i21 = i12;
                                        i22 = i13;
                                        i20 = i6;
                                        i24 = i10;
                                        i18 = i3;
                                        break;
                                    }
                                } else {
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i4 = i3;
                                    break;
                                }
                                break;
                            case 15:
                                i12 = i28;
                                i13 = i30;
                                bArr2 = bArr;
                                i6 = i26;
                                if (i27 == 0) {
                                    i19 = C7020e.m20199I(bArr2, i25, c7022b2);
                                    t3 = t;
                                    unsafe2.putInt(t3, m19512V, AbstractC7052j.m20069b(c7022b2.f16785a));
                                    i23 = i34 | i32;
                                    i17 = i2;
                                    t6 = t3;
                                    i21 = i12;
                                    i22 = i13;
                                    i20 = i6;
                                    i24 = i10;
                                    i18 = i3;
                                    break;
                                } else {
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 16:
                                i12 = i28;
                                i6 = i26;
                                if (i27 == 0) {
                                    bArr2 = bArr;
                                    int m20196L2 = C7020e.m20196L(bArr2, i25, c7022b2);
                                    i13 = i30;
                                    unsafe2.putLong(t, m19512V, AbstractC7052j.m20068c(c7022b2.f16786b));
                                    i23 = i34 | i32;
                                    t6 = t;
                                    i17 = i2;
                                    i19 = m20196L2;
                                    i21 = i12;
                                    i22 = i13;
                                    i20 = i6;
                                    i24 = i10;
                                    i18 = i3;
                                    break;
                                } else {
                                    i13 = i30;
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 17:
                                if (i27 == 3) {
                                    i19 = C7020e.m20180n(c7129u02.m19475v(i28), bArr, i25, i2, (i26 << 3) | 4, c7022b);
                                    if ((i34 & i32) == 0) {
                                        unsafe2.putObject(t6, m19512V, c7022b2.f16787c);
                                    } else {
                                        unsafe2.putObject(t6, m19512V, C6997a0.m20228h(unsafe2.getObject(t6, m19512V), c7022b2.f16787c));
                                    }
                                    i23 = i34 | i32;
                                    bArr2 = bArr;
                                    i17 = i2;
                                    i18 = i3;
                                    i22 = i30;
                                    i21 = i28;
                                    i20 = i26;
                                    i24 = i10;
                                    break;
                                } else {
                                    i12 = i28;
                                    i6 = i26;
                                    i13 = i30;
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i4 = i3;
                                    break;
                                }
                            default:
                                i12 = i28;
                                i13 = i30;
                                i6 = i26;
                                i7 = i25;
                                i9 = i34;
                                i11 = i12;
                                unsafe = unsafe2;
                                i8 = i13;
                                i4 = i3;
                                break;
                        }
                    } else {
                        i6 = i26;
                        T t9 = t6;
                        bArr2 = bArr;
                        if (m19482r0 != 27) {
                            i11 = i28;
                            i9 = i23;
                            i10 = i24;
                            if (m19482r0 <= 49) {
                                int i37 = i25;
                                unsafe = unsafe2;
                                i16 = i30;
                                i19 = m19502f0(t, bArr, i25, i2, i30, i6, i27, i11, i29, m19482r0, m19512V, c7022b);
                                if (i19 != i37) {
                                    c7129u02 = this;
                                    t6 = t;
                                    bArr2 = bArr;
                                    i17 = i2;
                                    i18 = i3;
                                    c7022b2 = c7022b;
                                    i20 = i6;
                                    i22 = i16;
                                    i21 = i11;
                                    i23 = i9;
                                    i24 = i10;
                                    unsafe2 = unsafe;
                                } else {
                                    i4 = i3;
                                    i7 = i19;
                                    i8 = i16;
                                }
                            } else {
                                i15 = i25;
                                unsafe = unsafe2;
                                i16 = i30;
                                if (m19482r0 != 50) {
                                    i19 = m19505c0(t, bArr, i15, i2, i16, i6, i27, i29, m19482r0, m19512V, i11, c7022b);
                                    if (i19 != i15) {
                                        c7129u02 = this;
                                        t6 = t;
                                        bArr2 = bArr;
                                        i17 = i2;
                                        i18 = i3;
                                        c7022b2 = c7022b;
                                        i20 = i6;
                                        i22 = i16;
                                        i21 = i11;
                                        i23 = i9;
                                        i24 = i10;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i7 = i19;
                                        i8 = i16;
                                    }
                                } else if (i27 == 2) {
                                    i19 = m19506b0(t, bArr, i15, i2, i11, m19512V, c7022b);
                                    if (i19 != i15) {
                                        c7129u02 = this;
                                        t6 = t;
                                        bArr2 = bArr;
                                        i17 = i2;
                                        i18 = i3;
                                        c7022b2 = c7022b;
                                        i20 = i6;
                                        i22 = i16;
                                        i21 = i11;
                                        i23 = i9;
                                        i24 = i10;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i7 = i19;
                                        i8 = i16;
                                    }
                                }
                            }
                        } else if (i27 == 2) {
                            C6997a0.InterfaceC7006i interfaceC7006i = (C6997a0.InterfaceC7006i) unsafe2.getObject(t9, m19512V);
                            if (!interfaceC7006i.mo20222c0()) {
                                int size = interfaceC7006i.size();
                                interfaceC7006i = interfaceC7006i.mo19330j(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t9, m19512V, interfaceC7006i);
                            }
                            i10 = i24;
                            i19 = C7020e.m20177q(c7129u02.m19475v(i28), i30, bArr, i25, i2, interfaceC7006i, c7022b);
                            t6 = t;
                            i17 = i2;
                            i22 = i30;
                            i20 = i6;
                            i21 = i28;
                            i23 = i23;
                            i24 = i10;
                            i18 = i3;
                        } else {
                            i11 = i28;
                            i9 = i23;
                            i10 = i24;
                            i15 = i25;
                            unsafe = unsafe2;
                            i16 = i30;
                        }
                        i4 = i3;
                        i7 = i15;
                        i8 = i16;
                    }
                }
                if (i8 != i4 || i4 == 0) {
                    if (this.f16994f && c7022b.f16788d != C7089p.m19769b()) {
                        i19 = C7020e.m20187g(i8, bArr, i7, i2, t, this.f16993e, this.f17003o, c7022b);
                    } else {
                        i19 = C7020e.m20201G(i8, bArr, i7, i2, m19473w(t), c7022b);
                    }
                    t6 = t;
                    bArr2 = bArr;
                    i17 = i2;
                    i22 = i8;
                    c7129u02 = this;
                    c7022b2 = c7022b;
                    i20 = i6;
                    i21 = i11;
                    i23 = i9;
                    i24 = i10;
                    unsafe2 = unsafe;
                    i18 = i4;
                } else {
                    i5 = 1048575;
                    c7129u0 = this;
                    i19 = i7;
                    i22 = i8;
                    i23 = i9;
                    i24 = i10;
                }
            } else {
                unsafe = unsafe2;
                i4 = i18;
                c7129u0 = c7129u02;
                i5 = 1048575;
            }
        }
        if (i24 != i5) {
            t2 = t;
            unsafe.putInt(t2, i24, i23);
        } else {
            t2 = t;
        }
        C7088o1 c7088o1 = null;
        for (int i38 = c7129u0.f16999k; i38 < c7129u0.f17000l; i38++) {
            c7088o1 = (C7088o1) c7129u0.m19485q(t2, c7129u0.f16998j[i38], c7088o1, c7129u0.f17003o);
        }
        if (c7088o1 != null) {
            c7129u0.f17003o.mo19743o(t2, c7088o1);
        }
        if (i4 == 0) {
            if (i19 != i2) {
                throw InvalidProtocolBufferException.m20250i();
            }
        } else if (i19 > i2 || i22 != i4) {
            throw InvalidProtocolBufferException.m20250i();
        }
        return i19;
    }

    @Override // com.google.protobuf.InterfaceC7038h1
    /* renamed from: e */
    public void mo19421e(T t, InterfaceC7032g1 interfaceC7032g1, C7089p c7089p) throws IOException {
        if (c7089p != null) {
            m19521M(this.f17003o, this.f17004p, t, interfaceC7032g1, c7089p);
            return;
        }
        throw null;
    }

    @Override // com.google.protobuf.InterfaceC7038h1
    /* renamed from: f */
    public void mo19420f(T t, byte[] bArr, int i, int i2, C7020e.C7022b c7022b) throws IOException {
        if (this.f16996h) {
            m19503e0(t, bArr, i, i2, c7022b);
        } else {
            m19504d0(t, bArr, i, i2, 0, c7022b);
        }
    }

    @Override // com.google.protobuf.InterfaceC7038h1
    /* renamed from: g */
    public boolean mo19419g(T t, T t2) {
        int length = this.f16989a.length;
        for (int i = 0; i < length; i += 3) {
            if (!m19487p(t, t2, i)) {
                return false;
            }
        }
        if (this.f17003o.mo19749g(t).equals(this.f17003o.mo19749g(t2))) {
            if (this.f16994f) {
                return this.f17004p.mo19718c(t).equals(this.f17004p.mo19718c(t2));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC7038h1
    /* renamed from: h */
    public int mo19418h(T t) {
        return this.f16996h ? m19469y(t) : m19471x(t);
    }

    @Override // com.google.protobuf.InterfaceC7038h1
    /* renamed from: i */
    public T mo19417i() {
        return (T) this.f17001m.mo19395a(this.f16993e);
    }

    @Override // com.google.protobuf.InterfaceC7038h1
    /* renamed from: j */
    public int mo19416j(T t) {
        int i;
        int m20230f;
        int length = this.f16989a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m19480s0 = m19480s0(i3);
            int m19513U = m19513U(i3);
            long m19512V = m19512V(m19480s0);
            int i4 = 37;
            switch (m19482r0(m19480s0)) {
                case 0:
                    i = i2 * 53;
                    m20230f = C6997a0.m20230f(Double.doubleToLongBits(C7102r1.m19706A(t, m19512V)));
                    i2 = i + m20230f;
                    break;
                case 1:
                    i = i2 * 53;
                    m20230f = Float.floatToIntBits(C7102r1.m19705B(t, m19512V));
                    i2 = i + m20230f;
                    break;
                case 2:
                    i = i2 * 53;
                    m20230f = C6997a0.m20230f(C7102r1.m19702E(t, m19512V));
                    i2 = i + m20230f;
                    break;
                case 3:
                    i = i2 * 53;
                    m20230f = C6997a0.m20230f(C7102r1.m19702E(t, m19512V));
                    i2 = i + m20230f;
                    break;
                case 4:
                    i = i2 * 53;
                    m20230f = C7102r1.m19704C(t, m19512V);
                    i2 = i + m20230f;
                    break;
                case 5:
                    i = i2 * 53;
                    m20230f = C6997a0.m20230f(C7102r1.m19702E(t, m19512V));
                    i2 = i + m20230f;
                    break;
                case 6:
                    i = i2 * 53;
                    m20230f = C7102r1.m19704C(t, m19512V);
                    i2 = i + m20230f;
                    break;
                case 7:
                    i = i2 * 53;
                    m20230f = C6997a0.m20233c(C7102r1.m19663t(t, m19512V));
                    i2 = i + m20230f;
                    break;
                case 8:
                    i = i2 * 53;
                    m20230f = ((String) C7102r1.m19700G(t, m19512V)).hashCode();
                    i2 = i + m20230f;
                    break;
                case 9:
                    Object m19700G = C7102r1.m19700G(t, m19512V);
                    if (m19700G != null) {
                        i4 = m19700G.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 10:
                    i = i2 * 53;
                    m20230f = C7102r1.m19700G(t, m19512V).hashCode();
                    i2 = i + m20230f;
                    break;
                case 11:
                    i = i2 * 53;
                    m20230f = C7102r1.m19704C(t, m19512V);
                    i2 = i + m20230f;
                    break;
                case 12:
                    i = i2 * 53;
                    m20230f = C7102r1.m19704C(t, m19512V);
                    i2 = i + m20230f;
                    break;
                case 13:
                    i = i2 * 53;
                    m20230f = C7102r1.m19704C(t, m19512V);
                    i2 = i + m20230f;
                    break;
                case 14:
                    i = i2 * 53;
                    m20230f = C6997a0.m20230f(C7102r1.m19702E(t, m19512V));
                    i2 = i + m20230f;
                    break;
                case 15:
                    i = i2 * 53;
                    m20230f = C7102r1.m19704C(t, m19512V);
                    i2 = i + m20230f;
                    break;
                case 16:
                    i = i2 * 53;
                    m20230f = C6997a0.m20230f(C7102r1.m19702E(t, m19512V));
                    i2 = i + m20230f;
                    break;
                case 17:
                    Object m19700G2 = C7102r1.m19700G(t, m19512V);
                    if (m19700G2 != null) {
                        i4 = m19700G2.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    m20230f = C7102r1.m19700G(t, m19512V).hashCode();
                    i2 = i + m20230f;
                    break;
                case 50:
                    i = i2 * 53;
                    m20230f = C7102r1.m19700G(t, m19512V).hashCode();
                    i2 = i + m20230f;
                    break;
                case 51:
                    if (m19525I(t, m19513U, i3)) {
                        i = i2 * 53;
                        m20230f = C6997a0.m20230f(Double.doubleToLongBits(m19510X(t, m19512V)));
                        i2 = i + m20230f;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m19525I(t, m19513U, i3)) {
                        i = i2 * 53;
                        m20230f = Float.floatToIntBits(m19509Y(t, m19512V));
                        i2 = i + m20230f;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m19525I(t, m19513U, i3)) {
                        i = i2 * 53;
                        m20230f = C6997a0.m20230f(m19507a0(t, m19512V));
                        i2 = i + m20230f;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m19525I(t, m19513U, i3)) {
                        i = i2 * 53;
                        m20230f = C6997a0.m20230f(m19507a0(t, m19512V));
                        i2 = i + m20230f;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m19525I(t, m19513U, i3)) {
                        i = i2 * 53;
                        m20230f = m19508Z(t, m19512V);
                        i2 = i + m20230f;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m19525I(t, m19513U, i3)) {
                        i = i2 * 53;
                        m20230f = C6997a0.m20230f(m19507a0(t, m19512V));
                        i2 = i + m20230f;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m19525I(t, m19513U, i3)) {
                        i = i2 * 53;
                        m20230f = m19508Z(t, m19512V);
                        i2 = i + m20230f;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m19525I(t, m19513U, i3)) {
                        i = i2 * 53;
                        m20230f = C6997a0.m20233c(m19511W(t, m19512V));
                        i2 = i + m20230f;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m19525I(t, m19513U, i3)) {
                        i = i2 * 53;
                        m20230f = ((String) C7102r1.m19700G(t, m19512V)).hashCode();
                        i2 = i + m20230f;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m19525I(t, m19513U, i3)) {
                        i = i2 * 53;
                        m20230f = C7102r1.m19700G(t, m19512V).hashCode();
                        i2 = i + m20230f;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m19525I(t, m19513U, i3)) {
                        i = i2 * 53;
                        m20230f = C7102r1.m19700G(t, m19512V).hashCode();
                        i2 = i + m20230f;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m19525I(t, m19513U, i3)) {
                        i = i2 * 53;
                        m20230f = m19508Z(t, m19512V);
                        i2 = i + m20230f;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m19525I(t, m19513U, i3)) {
                        i = i2 * 53;
                        m20230f = m19508Z(t, m19512V);
                        i2 = i + m20230f;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m19525I(t, m19513U, i3)) {
                        i = i2 * 53;
                        m20230f = m19508Z(t, m19512V);
                        i2 = i + m20230f;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m19525I(t, m19513U, i3)) {
                        i = i2 * 53;
                        m20230f = C6997a0.m20230f(m19507a0(t, m19512V));
                        i2 = i + m20230f;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m19525I(t, m19513U, i3)) {
                        i = i2 * 53;
                        m20230f = m19508Z(t, m19512V);
                        i2 = i + m20230f;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m19525I(t, m19513U, i3)) {
                        i = i2 * 53;
                        m20230f = C6997a0.m20230f(m19507a0(t, m19512V));
                        i2 = i + m20230f;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m19525I(t, m19513U, i3)) {
                        i = i2 * 53;
                        m20230f = C7102r1.m19700G(t, m19512V).hashCode();
                        i2 = i + m20230f;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f17003o.mo19749g(t).hashCode();
        return this.f16994f ? (hashCode * 53) + this.f17004p.mo19718c(t).hashCode() : hashCode;
    }
}
