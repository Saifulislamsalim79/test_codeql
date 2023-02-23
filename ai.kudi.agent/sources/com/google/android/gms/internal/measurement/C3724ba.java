package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.ba */
/* loaded from: classes2.dex */
final class C3724ba {

    /* renamed from: a */
    private static final Class<?> f9203a;

    /* renamed from: b */
    private static final AbstractC3912na<?, ?> f9204b;

    /* renamed from: c */
    private static final AbstractC3912na<?, ?> f9205c;

    /* renamed from: d */
    private static final AbstractC3912na<?, ?> f9206d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f9203a = cls;
        f9204b = m29790C(false);
        f9205c = m29790C(true);
        f9206d = new C3943pa();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static int m29792A(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC4019u7.m28874a(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m29791B(int i, List<Long> list, C4035v7 c4035v7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4035v7.m28755k(i, list, z);
    }

    /* renamed from: C */
    private static AbstractC3912na<?, ?> m29790C(boolean z) {
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
            return (AbstractC3912na) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static int m29789D(List<?> list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static int m29788E(int i, List<AbstractC3909n7> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m28875D = size * AbstractC4019u7.m28875D(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            m28875D += AbstractC4019u7.m28851x(list.get(i2));
        }
        return m28875D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static int m29787F(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29786G(list) + (size * AbstractC4019u7.m28875D(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static int m29786G(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3910n8) {
            C3910n8 c3910n8 = (C3910n8) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC4019u7.m28849z(c3910n8.m29333e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC4019u7.m28849z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static int m29785H(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC4019u7.m28874a(i << 3) + 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static int m29784I(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static int m29783J(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC4019u7.m28874a(i << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static int m29782K(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static int m29781L(int i, List<InterfaceC3927o9> list, InterfaceC4101z9 interfaceC4101z9) {
        int size = list.size();
        if (size != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += AbstractC4019u7.m28850y(i, list.get(i3), interfaceC4101z9);
            }
            return i2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public static int m29780M(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29779N(list) + (size * AbstractC4019u7.m28875D(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static int m29779N(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3910n8) {
            C3910n8 c3910n8 = (C3910n8) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC4019u7.m28849z(c3910n8.m29333e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC4019u7.m28849z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public static int m29778O(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m29777P(list) + (list.size() * AbstractC4019u7.m28875D(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public static int m29777P(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3739c9) {
            C3739c9 c3739c9 = (C3739c9) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC4019u7.m28873b(c3739c9.mo29028g(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC4019u7.m28873b(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public static int m29776Q(int i, Object obj, InterfaceC4101z9 interfaceC4101z9) {
        if (obj instanceof C4036v8) {
            int m28874a = AbstractC4019u7.m28874a(i << 3);
            int m28739a = ((C4036v8) obj).m28739a();
            return m28874a + AbstractC4019u7.m28874a(m28739a) + m28739a;
        }
        return AbstractC4019u7.m28874a(i << 3) + AbstractC4019u7.m28877B((InterfaceC3927o9) obj, interfaceC4101z9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public static int m29775R(int i, List<?> list, InterfaceC4101z9 interfaceC4101z9) {
        int m28877B;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m28875D = AbstractC4019u7.m28875D(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C4036v8) {
                m28877B = AbstractC4019u7.m28878A((C4036v8) obj);
            } else {
                m28877B = AbstractC4019u7.m28877B((InterfaceC3927o9) obj, interfaceC4101z9);
            }
            m28875D += m28877B;
        }
        return m28875D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public static int m29774S(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29773T(list) + (size * AbstractC4019u7.m28875D(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public static int m29773T(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3910n8) {
            C3910n8 c3910n8 = (C3910n8) list;
            i = 0;
            while (i2 < size) {
                int m29333e = c3910n8.m29333e(i2);
                i += AbstractC4019u7.m28874a((m29333e >> 31) ^ (m29333e + m29333e));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i += AbstractC4019u7.m28874a((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public static int m29772U(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29771V(list) + (size * AbstractC4019u7.m28875D(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public static int m29771V(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3739c9) {
            C3739c9 c3739c9 = (C3739c9) list;
            i = 0;
            while (i2 < size) {
                long mo29028g = c3739c9.mo29028g(i2);
                i += AbstractC4019u7.m28873b((mo29028g >> 63) ^ (mo29028g + mo29028g));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i += AbstractC4019u7.m28873b((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public static int m29770W(int i, List<?> list) {
        int m28876C;
        int m28876C2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int m28875D = AbstractC4019u7.m28875D(i) * size;
        if (list instanceof InterfaceC4068x8) {
            InterfaceC4068x8 interfaceC4068x8 = (InterfaceC4068x8) list;
            while (i2 < size) {
                Object mo28658n = interfaceC4068x8.mo28658n(i2);
                if (mo28658n instanceof AbstractC3909n7) {
                    m28876C2 = AbstractC4019u7.m28851x((AbstractC3909n7) mo28658n);
                } else {
                    m28876C2 = AbstractC4019u7.m28876C((String) mo28658n);
                }
                m28875D += m28876C2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AbstractC3909n7) {
                    m28876C = AbstractC4019u7.m28851x((AbstractC3909n7) obj);
                } else {
                    m28876C = AbstractC4019u7.m28876C((String) obj);
                }
                m28875D += m28876C;
                i2++;
            }
        }
        return m28875D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public static int m29769X(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29768Y(list) + (size * AbstractC4019u7.m28875D(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public static int m29768Y(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3910n8) {
            C3910n8 c3910n8 = (C3910n8) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC4019u7.m28874a(c3910n8.m29333e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC4019u7.m28874a(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public static int m29767Z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29765a0(list) + (size * AbstractC4019u7.m28875D(i));
    }

    /* renamed from: a */
    public static AbstractC3912na<?, ?> m29766a() {
        return f9205c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public static int m29765a0(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3739c9) {
            C3739c9 c3739c9 = (C3739c9) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC4019u7.m28873b(c3739c9.mo29028g(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC4019u7.m28873b(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static AbstractC3912na<?, ?> m29764b() {
        return f9206d;
    }

    /* renamed from: b0 */
    public static AbstractC3912na<?, ?> m29763b0() {
        return f9204b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <UT, UB> UB m29762c(int i, List<Integer> list, InterfaceC3941p8 interfaceC3941p8, UB ub, AbstractC3912na<UT, UB> abstractC3912na) {
        if (interfaceC3941p8 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (interfaceC3941p8.mo28670g(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) m29761d(i, intValue, ub, abstractC3912na);
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
                if (!interfaceC3941p8.mo28670g(intValue2)) {
                    ub = (UB) m29761d(i, intValue2, ub, abstractC3912na);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: d */
    static <UT, UB> UB m29761d(int i, int i2, UB ub, AbstractC3912na<UT, UB> abstractC3912na) {
        if (ub == null) {
            ub = abstractC3912na.mo29097e();
        }
        abstractC3912na.mo29096f(ub, i, i2);
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static <T, FT extends InterfaceC3754d8<FT>> void m29760e(AbstractC3705a8<FT> abstractC3705a8, T t, T t2) {
        abstractC3705a8.mo29797a(t2);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static <T, UT, UB> void m29759f(AbstractC3912na<UT, UB> abstractC3912na, T t, T t2) {
        abstractC3912na.mo29094h(t, abstractC3912na.mo29098d(abstractC3912na.mo29099c(t), abstractC3912na.mo29099c(t2)));
    }

    /* renamed from: g */
    public static void m29758g(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC3894m8.class.isAssignableFrom(cls) && (cls2 = f9203a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static boolean m29757h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static <T> void m29756i(C3832i9 c3832i9, T t, T t2, long j) {
        C4070xa.m28624x(t, j, C3832i9.m29517b(C4070xa.m28637k(t, j), C4070xa.m28637k(t2, j)));
    }

    /* renamed from: j */
    public static void m29755j(int i, List<Boolean> list, C4035v7 c4035v7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4035v7.m28752n(i, list, z);
    }

    /* renamed from: k */
    public static void m29754k(int i, List<AbstractC3909n7> list, C4035v7 c4035v7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4035v7.m28750p(i, list);
    }

    /* renamed from: l */
    public static void m29753l(int i, List<Double> list, C4035v7 c4035v7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4035v7.m28748r(i, list, z);
    }

    /* renamed from: m */
    public static void m29752m(int i, List<Integer> list, C4035v7 c4035v7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4035v7.m28745u(i, list, z);
    }

    /* renamed from: n */
    public static void m29751n(int i, List<Integer> list, C4035v7 c4035v7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4035v7.m28743w(i, list, z);
    }

    /* renamed from: o */
    public static void m29750o(int i, List<Long> list, C4035v7 c4035v7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4035v7.m28741y(i, list, z);
    }

    /* renamed from: p */
    public static void m29749p(int i, List<Float> list, C4035v7 c4035v7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4035v7.m28776A(i, list, z);
    }

    /* renamed from: q */
    public static void m29748q(int i, List<?> list, C4035v7 c4035v7, InterfaceC4101z9 interfaceC4101z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            c4035v7.m28775B(i, list.get(i2), interfaceC4101z9);
        }
    }

    /* renamed from: r */
    public static void m29747r(int i, List<Integer> list, C4035v7 c4035v7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4035v7.m28773D(i, list, z);
    }

    /* renamed from: s */
    public static void m29746s(int i, List<Long> list, C4035v7 c4035v7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4035v7.m28771F(i, list, z);
    }

    /* renamed from: t */
    public static void m29745t(int i, List<?> list, C4035v7 c4035v7, InterfaceC4101z9 interfaceC4101z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            c4035v7.m28770G(i, list.get(i2), interfaceC4101z9);
        }
    }

    /* renamed from: u */
    public static void m29744u(int i, List<Integer> list, C4035v7 c4035v7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4035v7.m28768I(i, list, z);
    }

    /* renamed from: v */
    public static void m29743v(int i, List<Long> list, C4035v7 c4035v7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4035v7.m28766K(i, list, z);
    }

    /* renamed from: w */
    public static void m29742w(int i, List<Integer> list, C4035v7 c4035v7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4035v7.m28764b(i, list, z);
    }

    /* renamed from: x */
    public static void m29741x(int i, List<Long> list, C4035v7 c4035v7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4035v7.m28762d(i, list, z);
    }

    /* renamed from: y */
    public static void m29740y(int i, List<String> list, C4035v7 c4035v7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4035v7.m28759g(i, list);
    }

    /* renamed from: z */
    public static void m29739z(int i, List<Integer> list, C4035v7 c4035v7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4035v7.m28757i(i, list, z);
    }
}
