package com.google.android.gms.internal.p104firebaseauthapi;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.n0 */
/* loaded from: classes2.dex */
public final class C3359n0 {

    /* renamed from: a */
    private static final Class<?> f8744a;

    /* renamed from: b */
    private static final AbstractC3645y0<?, ?> f8745b;

    /* renamed from: c */
    private static final AbstractC3645y0<?, ?> f8746c;

    /* renamed from: d */
    private static final AbstractC3645y0<?, ?> f8747d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f8744a = cls;
        f8745b = m30642C(false);
        f8746c = m30642C(true);
        f8747d = new C3038b1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static int m30644A(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC3487ro.m30324f(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m30643B(int i, List<Long> list, C3513so c3513so, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3513so.m30242k(i, list, z);
    }

    /* renamed from: C */
    private static AbstractC3645y0<?, ?> m30642C(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (AbstractC3645y0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static int m30641D(List<?> list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static int m30640E(int i, List<AbstractC3223ho> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m30325e = size * AbstractC3487ro.m30325e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            m30325e += AbstractC3487ro.m30332E(list.get(i2));
        }
        return m30325e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static int m30639F(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m30638G(list) + (size * AbstractC3487ro.m30325e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static int m30638G(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3278jp) {
            C3278jp c3278jp = (C3278jp) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC3487ro.m30330G(c3278jp.m30884e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC3487ro.m30330G(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static int m30637H(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC3487ro.m30324f(i << 3) + 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static int m30636I(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static int m30635J(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC3487ro.m30324f(i << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static int m30634K(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static int m30633L(int i, List<InterfaceC3644y> list, InterfaceC3307l0 interfaceC3307l0) {
        int size = list.size();
        if (size != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += AbstractC3487ro.m30331F(i, list.get(i3), interfaceC3307l0);
            }
            return i2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public static int m30632M(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m30631N(list) + (size * AbstractC3487ro.m30325e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static int m30631N(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3278jp) {
            C3278jp c3278jp = (C3278jp) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC3487ro.m30330G(c3278jp.m30884e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC3487ro.m30330G(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public static int m30630O(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m30629P(list) + (list.size() * AbstractC3487ro.m30325e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public static int m30629P(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3358n) {
            C3358n c3358n = (C3358n) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC3487ro.m30323g(c3358n.m30648e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC3487ro.m30323g(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public static int m30628Q(int i, Object obj, InterfaceC3307l0 interfaceC3307l0) {
        if (obj instanceof C3171g) {
            int m30324f = AbstractC3487ro.m30324f(i << 3);
            int m31123a = ((C3171g) obj).m31123a();
            return m30324f + AbstractC3487ro.m30324f(m31123a) + m31123a;
        }
        return AbstractC3487ro.m30324f(i << 3) + AbstractC3487ro.m30328b((InterfaceC3644y) obj, interfaceC3307l0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public static int m30627R(int i, List<?> list, InterfaceC3307l0 interfaceC3307l0) {
        int m30328b;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m30325e = AbstractC3487ro.m30325e(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C3171g) {
                m30328b = AbstractC3487ro.m30329H((C3171g) obj);
            } else {
                m30328b = AbstractC3487ro.m30328b((InterfaceC3644y) obj, interfaceC3307l0);
            }
            m30325e += m30328b;
        }
        return m30325e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public static int m30626S(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m30625T(list) + (size * AbstractC3487ro.m30325e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public static int m30625T(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3278jp) {
            C3278jp c3278jp = (C3278jp) list;
            i = 0;
            while (i2 < size) {
                int m30884e = c3278jp.m30884e(i2);
                i += AbstractC3487ro.m30324f((m30884e >> 31) ^ (m30884e + m30884e));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i += AbstractC3487ro.m30324f((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public static int m30624U(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m30623V(list) + (size * AbstractC3487ro.m30325e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public static int m30623V(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3358n) {
            C3358n c3358n = (C3358n) list;
            i = 0;
            while (i2 < size) {
                long m30648e = c3358n.m30648e(i2);
                i += AbstractC3487ro.m30323g((m30648e >> 63) ^ (m30648e + m30648e));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i += AbstractC3487ro.m30323g((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public static int m30622W(int i, List<?> list) {
        int m30326d;
        int m30326d2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int m30325e = AbstractC3487ro.m30325e(i) * size;
        if (list instanceof InterfaceC3225i) {
            InterfaceC3225i interfaceC3225i = (InterfaceC3225i) list;
            while (i2 < size) {
                Object mo31005n = interfaceC3225i.mo31005n(i2);
                if (mo31005n instanceof AbstractC3223ho) {
                    m30326d2 = AbstractC3487ro.m30332E((AbstractC3223ho) mo31005n);
                } else {
                    m30326d2 = AbstractC3487ro.m30326d((String) mo31005n);
                }
                m30325e += m30326d2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AbstractC3223ho) {
                    m30326d = AbstractC3487ro.m30332E((AbstractC3223ho) obj);
                } else {
                    m30326d = AbstractC3487ro.m30326d((String) obj);
                }
                m30325e += m30326d;
                i2++;
            }
        }
        return m30325e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public static int m30621X(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m30620Y(list) + (size * AbstractC3487ro.m30325e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public static int m30620Y(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3278jp) {
            C3278jp c3278jp = (C3278jp) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC3487ro.m30324f(c3278jp.m30884e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC3487ro.m30324f(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public static int m30619Z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m30617a0(list) + (size * AbstractC3487ro.m30325e(i));
    }

    /* renamed from: a */
    public static AbstractC3645y0<?, ?> m30618a() {
        return f8746c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public static int m30617a0(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3358n) {
            C3358n c3358n = (C3358n) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC3487ro.m30323g(c3358n.m30648e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC3487ro.m30323g(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static AbstractC3645y0<?, ?> m30616b() {
        return f8747d;
    }

    /* renamed from: b0 */
    public static AbstractC3645y0<?, ?> m30615b0() {
        return f8745b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <UT, UB> UB m30614c(int i, List<Integer> list, InterfaceC3063c interfaceC3063c, UB ub, AbstractC3645y0<UT, UB> abstractC3645y0) {
        if (interfaceC3063c == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (interfaceC3063c.zza()) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) m30613d(i, intValue, ub, abstractC3645y0);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!interfaceC3063c.zza()) {
                    ub = (UB) m30613d(i, intValue2, ub, abstractC3645y0);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static <UT, UB> UB m30613d(int i, int i2, UB ub, AbstractC3645y0<UT, UB> abstractC3645y0) {
        if (ub == null) {
            ub = abstractC3645y0.mo29990f();
        }
        abstractC3645y0.mo29984l(ub, i, i2);
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static <T, FT extends InterfaceC3035ap<FT>> void m30612e(AbstractC3643xo<FT> abstractC3643xo, T t, T t2) {
        abstractC3643xo.mo29921a(t2);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static <T, UT, UB> void m30611f(AbstractC3645y0<UT, UB> abstractC3645y0, T t, T t2) {
        abstractC3645y0.mo29981o(t, abstractC3645y0.mo29991e(abstractC3645y0.mo29992d(t), abstractC3645y0.mo29992d(t2)));
    }

    /* renamed from: g */
    public static void m30610g(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC3251ip.class.isAssignableFrom(cls) && (cls2 = f8744a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static boolean m30609h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static <T> void m30608i(C3514t c3514t, T t, T t2, long j) {
        C3254j1.m30910x(t, j, C3514t.m30224c(C3254j1.m30923k(t, j), C3254j1.m30923k(t2, j)));
    }

    /* renamed from: j */
    public static void m30607j(int i, List<Boolean> list, C3513so c3513so, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3513so.m30239n(i, list, z);
    }

    /* renamed from: k */
    public static void m30606k(int i, List<AbstractC3223ho> list, C3513so c3513so) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3513so.m30237p(i, list);
    }

    /* renamed from: l */
    public static void m30605l(int i, List<Double> list, C3513so c3513so, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3513so.m30235r(i, list, z);
    }

    /* renamed from: m */
    public static void m30604m(int i, List<Integer> list, C3513so c3513so, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3513so.m30232u(i, list, z);
    }

    /* renamed from: n */
    public static void m30603n(int i, List<Integer> list, C3513so c3513so, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3513so.m30230w(i, list, z);
    }

    /* renamed from: o */
    public static void m30602o(int i, List<Long> list, C3513so c3513so, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3513so.m30228y(i, list, z);
    }

    /* renamed from: p */
    public static void m30601p(int i, List<Float> list, C3513so c3513so, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3513so.m30263A(i, list, z);
    }

    /* renamed from: q */
    public static void m30600q(int i, List<?> list, C3513so c3513so, InterfaceC3307l0 interfaceC3307l0) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            c3513so.m30262B(i, list.get(i2), interfaceC3307l0);
        }
    }

    /* renamed from: r */
    public static void m30599r(int i, List<Integer> list, C3513so c3513so, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3513so.m30260D(i, list, z);
    }

    /* renamed from: s */
    public static void m30598s(int i, List<Long> list, C3513so c3513so, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3513so.m30258F(i, list, z);
    }

    /* renamed from: t */
    public static void m30597t(int i, List<?> list, C3513so c3513so, InterfaceC3307l0 interfaceC3307l0) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            c3513so.m30257G(i, list.get(i2), interfaceC3307l0);
        }
    }

    /* renamed from: u */
    public static void m30596u(int i, List<Integer> list, C3513so c3513so, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3513so.m30255I(i, list, z);
    }

    /* renamed from: v */
    public static void m30595v(int i, List<Long> list, C3513so c3513so, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3513so.m30253K(i, list, z);
    }

    /* renamed from: w */
    public static void m30594w(int i, List<Integer> list, C3513so c3513so, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3513so.m30251b(i, list, z);
    }

    /* renamed from: x */
    public static void m30593x(int i, List<Long> list, C3513so c3513so, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3513so.m30249d(i, list, z);
    }

    /* renamed from: y */
    public static void m30592y(int i, List<String> list, C3513so c3513so) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3513so.m30246g(i, list);
    }

    /* renamed from: z */
    public static void m30591z(int i, List<Integer> list, C3513so c3513so, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3513so.m30244i(i, list, z);
    }
}
