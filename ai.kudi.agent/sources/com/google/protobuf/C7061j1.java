package com.google.protobuf;

import com.google.protobuf.C6997a0;
import com.google.protobuf.C7126u;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SchemaUtil.java */
/* renamed from: com.google.protobuf.j1 */
/* loaded from: classes2.dex */
public final class C7061j1 {

    /* renamed from: a */
    private static final Class<?> f16864a = m19977B();

    /* renamed from: b */
    private static final AbstractC7085n1<?, ?> f16865b = m19976C(false);

    /* renamed from: c */
    private static final AbstractC7085n1<?, ?> f16866c = m19976C(true);

    /* renamed from: d */
    private static final AbstractC7085n1<?, ?> f16867d = new C7092p1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static <UT, UB> UB m19978A(int i, List<Integer> list, C6997a0.InterfaceC7002e interfaceC7002e, UB ub, AbstractC7085n1<UT, UB> abstractC7085n1) {
        if (interfaceC7002e == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (interfaceC7002e.mo20223a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) m19967L(i, intValue, ub, abstractC7085n1);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!interfaceC7002e.mo20223a(intValue2)) {
                    ub = (UB) m19967L(i, intValue2, ub, abstractC7085n1);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: B */
    private static Class<?> m19977B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    private static AbstractC7085n1<?, ?> m19976C(boolean z) {
        try {
            Class<?> m19975D = m19975D();
            if (m19975D == null) {
                return null;
            }
            return (AbstractC7085n1) m19975D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    private static Class<?> m19975D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static <T, FT extends C7126u.InterfaceC7128b<FT>> void m19974E(AbstractC7093q<FT> abstractC7093q, T t, T t2) {
        C7126u<FT> mo19718c = abstractC7093q.mo19718c(t2);
        if (mo19718c.m19547m()) {
            return;
        }
        abstractC7093q.mo19717d(t).m19540t(mo19718c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static <T> void m19973F(InterfaceC7079m0 interfaceC7079m0, T t, T t2, long j) {
        C7102r1.m19685V(t, j, interfaceC7079m0.mo19805a(C7102r1.m19700G(t, j), C7102r1.m19700G(t2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static <T, UT, UB> void m19972G(AbstractC7085n1<UT, UB> abstractC7085n1, T t, T t2) {
        abstractC7085n1.mo19742p(t, abstractC7085n1.mo19745k(abstractC7085n1.mo19749g(t), abstractC7085n1.mo19749g(t2)));
    }

    /* renamed from: H */
    public static AbstractC7085n1<?, ?> m19971H() {
        return f16865b;
    }

    /* renamed from: I */
    public static AbstractC7085n1<?, ?> m19970I() {
        return f16866c;
    }

    /* renamed from: J */
    public static void m19969J(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC7141y.class.isAssignableFrom(cls) && (cls2 = f16864a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static boolean m19968K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static <UT, UB> UB m19967L(int i, int i2, UB ub, AbstractC7085n1<UT, UB> abstractC7085n1) {
        if (ub == null) {
            ub = abstractC7085n1.mo19744n();
        }
        abstractC7085n1.mo19751e(ub, i, i2);
        return ub;
    }

    /* renamed from: M */
    public static AbstractC7085n1<?, ?> m19966M() {
        return f16867d;
    }

    /* renamed from: N */
    public static void m19965N(int i, List<Boolean> list, InterfaceC7131u1 interfaceC7131u1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7131u1.mo19466B(i, list, z);
    }

    /* renamed from: O */
    public static void m19964O(int i, List<AbstractC7039i> list, InterfaceC7131u1 interfaceC7131u1) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7131u1.mo19453O(i, list);
    }

    /* renamed from: P */
    public static void m19963P(int i, List<Double> list, InterfaceC7131u1 interfaceC7131u1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7131u1.mo19455M(i, list, z);
    }

    /* renamed from: Q */
    public static void m19962Q(int i, List<Integer> list, InterfaceC7131u1 interfaceC7131u1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7131u1.mo19456L(i, list, z);
    }

    /* renamed from: R */
    public static void m19961R(int i, List<Integer> list, InterfaceC7131u1 interfaceC7131u1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7131u1.mo19467A(i, list, z);
    }

    /* renamed from: S */
    public static void m19960S(int i, List<Long> list, InterfaceC7131u1 interfaceC7131u1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7131u1.mo19429x(i, list, z);
    }

    /* renamed from: T */
    public static void m19959T(int i, List<Float> list, InterfaceC7131u1 interfaceC7131u1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7131u1.mo19450c(i, list, z);
    }

    /* renamed from: U */
    public static void m19958U(int i, List<?> list, InterfaceC7131u1 interfaceC7131u1, InterfaceC7038h1 interfaceC7038h1) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7131u1.mo19451b(i, list, interfaceC7038h1);
    }

    /* renamed from: V */
    public static void m19957V(int i, List<Integer> list, InterfaceC7131u1 interfaceC7131u1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7131u1.mo19437p(i, list, z);
    }

    /* renamed from: W */
    public static void m19956W(int i, List<Long> list, InterfaceC7131u1 interfaceC7131u1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7131u1.mo19457K(i, list, z);
    }

    /* renamed from: X */
    public static void m19955X(int i, List<?> list, InterfaceC7131u1 interfaceC7131u1, InterfaceC7038h1 interfaceC7038h1) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7131u1.mo19452a(i, list, interfaceC7038h1);
    }

    /* renamed from: Y */
    public static void m19954Y(int i, List<Integer> list, InterfaceC7131u1 interfaceC7131u1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7131u1.mo19428y(i, list, z);
    }

    /* renamed from: Z */
    public static void m19953Z(int i, List<Long> list, InterfaceC7131u1 interfaceC7131u1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7131u1.mo19445h(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m19952a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m20341W(i) + CodedOutputStream.m20372D(size);
        }
        return size * CodedOutputStream.m20332e(i, true);
    }

    /* renamed from: a0 */
    public static void m19951a0(int i, List<Integer> list, InterfaceC7131u1 interfaceC7131u1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7131u1.mo19459I(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m19950b(List<?> list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m19949b0(int i, List<Long> list, InterfaceC7131u1 interfaceC7131u1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7131u1.mo19463E(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m19948c(int i, List<AbstractC7039i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m20341W = size * CodedOutputStream.m20341W(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            m20341W += CodedOutputStream.m20324i(list.get(i2));
        }
        return m20341W;
    }

    /* renamed from: c0 */
    public static void m19947c0(int i, List<String> list, InterfaceC7131u1 interfaceC7131u1) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7131u1.mo19440m(i, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m19946d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m19944e = m19944e(list);
        if (z) {
            return CodedOutputStream.m20341W(i) + CodedOutputStream.m20372D(m19944e);
        }
        return m19944e + (size * CodedOutputStream.m20341W(i));
    }

    /* renamed from: d0 */
    public static void m19945d0(int i, List<Integer> list, InterfaceC7131u1 interfaceC7131u1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7131u1.mo19464D(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m19944e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7149z) {
            C7149z c7149z = (C7149z) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m20319m(c7149z.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m20319m(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e0 */
    public static void m19943e0(int i, List<Long> list, InterfaceC7131u1 interfaceC7131u1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7131u1.mo19444i(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m19942f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m20341W(i) + CodedOutputStream.m20372D(size * 4);
        }
        return size * CodedOutputStream.m20317n(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m19941g(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m19940h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m20341W(i) + CodedOutputStream.m20372D(size * 8);
        }
        return size * CodedOutputStream.m20314p(i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m19939i(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m19938j(int i, List<InterfaceC7100r0> list, InterfaceC7038h1 interfaceC7038h1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.m20308t(i, list.get(i3), interfaceC7038h1);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static int m19937k(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m19936l = m19936l(list);
        if (z) {
            return CodedOutputStream.m20341W(i) + CodedOutputStream.m20372D(m19936l);
        }
        return m19936l + (size * CodedOutputStream.m20341W(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static int m19936l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7149z) {
            C7149z c7149z = (C7149z) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m20302x(c7149z.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m20302x(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m19935m(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int m19934n = m19934n(list);
        if (z) {
            return CodedOutputStream.m20341W(i) + CodedOutputStream.m20372D(m19934n);
        }
        return m19934n + (list.size() * CodedOutputStream.m20341W(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static int m19934n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7050i0) {
            C7050i0 c7050i0 = (C7050i0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m20300z(c7050i0.m20072s(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m20300z(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static int m19933o(int i, Object obj, InterfaceC7038h1 interfaceC7038h1) {
        if (obj instanceof C7023e0) {
            return CodedOutputStream.m20376B(i, (C7023e0) obj);
        }
        return CodedOutputStream.m20367G(i, (InterfaceC7100r0) obj, interfaceC7038h1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static int m19932p(int i, List<?> list, InterfaceC7038h1 interfaceC7038h1) {
        int m20364I;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m20341W = CodedOutputStream.m20341W(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C7023e0) {
                m20364I = CodedOutputStream.m20374C((C7023e0) obj);
            } else {
                m20364I = CodedOutputStream.m20364I((InterfaceC7100r0) obj, interfaceC7038h1);
            }
            m20341W += m20364I;
        }
        return m20341W;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static int m19931q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m19930r = m19930r(list);
        if (z) {
            return CodedOutputStream.m20341W(i) + CodedOutputStream.m20372D(m19930r);
        }
        return m19930r + (size * CodedOutputStream.m20341W(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static int m19930r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7149z) {
            C7149z c7149z = (C7149z) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m20350R(c7149z.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m20350R(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static int m19929s(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m19928t = m19928t(list);
        if (z) {
            return CodedOutputStream.m20341W(i) + CodedOutputStream.m20372D(m19928t);
        }
        return m19928t + (size * CodedOutputStream.m20341W(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static int m19928t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7050i0) {
            C7050i0 c7050i0 = (C7050i0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m20346T(c7050i0.m20072s(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m20346T(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static int m19927u(int i, List<?> list) {
        int m20342V;
        int m20342V2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int m20341W = CodedOutputStream.m20341W(i) * size;
        if (list instanceof InterfaceC7031g0) {
            InterfaceC7031g0 interfaceC7031g0 = (InterfaceC7031g0) list;
            while (i2 < size) {
                Object mo19730U = interfaceC7031g0.mo19730U(i2);
                if (mo19730U instanceof AbstractC7039i) {
                    m20342V2 = CodedOutputStream.m20324i((AbstractC7039i) mo19730U);
                } else {
                    m20342V2 = CodedOutputStream.m20342V((String) mo19730U);
                }
                m20341W += m20342V2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AbstractC7039i) {
                    m20342V = CodedOutputStream.m20324i((AbstractC7039i) obj);
                } else {
                    m20342V = CodedOutputStream.m20342V((String) obj);
                }
                m20341W += m20342V;
                i2++;
            }
        }
        return m20341W;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static int m19926v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m19925w = m19925w(list);
        if (z) {
            return CodedOutputStream.m20341W(i) + CodedOutputStream.m20372D(m19925w);
        }
        return m19925w + (size * CodedOutputStream.m20341W(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static int m19925w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7149z) {
            C7149z c7149z = (C7149z) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m20339Y(c7149z.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m20339Y(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static int m19924x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m19923y = m19923y(list);
        if (z) {
            return CodedOutputStream.m20341W(i) + CodedOutputStream.m20372D(m19923y);
        }
        return m19923y + (size * CodedOutputStream.m20341W(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static int m19923y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7050i0) {
            C7050i0 c7050i0 = (C7050i0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m20337a0(c7050i0.m20072s(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m20337a0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static <UT, UB> UB m19922z(int i, List<Integer> list, C6997a0.InterfaceC7001d<?> interfaceC7001d, UB ub, AbstractC7085n1<UT, UB> abstractC7085n1) {
        if (interfaceC7001d == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (interfaceC7001d.m20224a(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) m19967L(i, intValue, ub, abstractC7085n1);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (interfaceC7001d.m20224a(intValue2) == null) {
                    ub = (UB) m19967L(i, intValue2, ub, abstractC7085n1);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
