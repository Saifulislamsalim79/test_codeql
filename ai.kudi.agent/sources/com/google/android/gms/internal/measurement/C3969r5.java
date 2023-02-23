package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.r5 */
/* loaded from: classes2.dex */
public final class C3969r5 {
    /* renamed from: a */
    public static double m29044a(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        double d2 = d > 0.0d ? 1 : -1;
        double floor = Math.floor(Math.abs(d));
        Double.isNaN(d2);
        return d2 * floor;
    }

    /* renamed from: b */
    public static int m29043b(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        double d2 = d > 0.0d ? 1 : -1;
        double floor = Math.floor(Math.abs(d));
        Double.isNaN(d2);
        return (int) ((d2 * floor) % 4.294967296E9d);
    }

    /* renamed from: c */
    public static int m29042c(C3968r4 c3968r4) {
        int m29043b = m29043b(c3968r4.m29049d("runtime.counter").b().doubleValue() + 1.0d);
        if (m29043b <= 1000000) {
            c3968r4.m29046g("runtime.counter", new C3822i(Double.valueOf(m29043b)));
            return m29043b;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    /* renamed from: d */
    public static long m29041d(double d) {
        return m29043b(d) & 4294967295L;
    }

    /* renamed from: e */
    public static EnumC3902n0 m29040e(String str) {
        EnumC3902n0 enumC3902n0 = null;
        if (str != null && !str.isEmpty()) {
            enumC3902n0 = EnumC3902n0.m29366a(Integer.parseInt(str));
        }
        if (enumC3902n0 != null) {
            return enumC3902n0;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    /* renamed from: f */
    public static Object m29039f(q qVar) {
        if (q.j.equals(qVar)) {
            return null;
        }
        if (q.i.equals(qVar)) {
            return "";
        }
        if (qVar instanceof C3901n) {
            return m29038g((C3901n) qVar);
        }
        if (qVar instanceof f) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((f) qVar).iterator();
            while (it.hasNext()) {
                Object m29039f = m29039f((q) it.next());
                if (m29039f != null) {
                    arrayList.add(m29039f);
                }
            }
            return arrayList;
        } else if (!qVar.b().isNaN()) {
            return qVar.b();
        } else {
            return qVar.h();
        }
    }

    /* renamed from: g */
    public static Map<String, Object> m29038g(C3901n c3901n) {
        HashMap hashMap = new HashMap();
        for (String str : c3901n.m29376a()) {
            Object m29039f = m29039f(c3901n.m29368m(str));
            if (m29039f != null) {
                hashMap.put(str, m29039f);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    public static void m29037h(String str, int i, List<q> list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    /* renamed from: i */
    public static void m29036i(String str, int i, List<q> list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    /* renamed from: j */
    public static void m29035j(String str, int i, List<q> list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    /* renamed from: k */
    public static boolean m29034k(q qVar) {
        if (qVar == null) {
            return false;
        }
        Double b = qVar.b();
        return !b.isNaN() && b.doubleValue() >= 0.0d && b.equals(Double.valueOf(Math.floor(b.doubleValue())));
    }

    /* renamed from: l */
    public static boolean m29033l(q qVar, q qVar2) {
        if (qVar.getClass().equals(qVar2.getClass())) {
            if ((qVar instanceof C4027v) || (qVar instanceof C3917o)) {
                return true;
            }
            if (qVar instanceof C3822i) {
                if (Double.isNaN(qVar.b().doubleValue()) || Double.isNaN(qVar2.b().doubleValue())) {
                    return false;
                }
                return qVar.b().equals(qVar2.b());
            } else if (qVar instanceof C4011u) {
                return qVar.h().equals(qVar2.h());
            } else {
                if (qVar instanceof C3790g) {
                    return qVar.f().equals(qVar2.f());
                }
                return qVar == qVar2;
            }
        }
        return false;
    }
}
