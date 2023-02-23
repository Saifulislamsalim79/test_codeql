package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.s6 */
/* loaded from: classes2.dex */
public final class C3986s6 {
    /* renamed from: a */
    public static q m28975a(C3860k5 c3860k5) {
        if (c3860k5 == null) {
            return q.i;
        }
        int m29424F = c3860k5.m29424F() - 1;
        if (m29424F == 1) {
            if (c3860k5.m29425E()) {
                return new C4011u(c3860k5.m29420z());
            }
            return q.p;
        } else if (m29424F == 2) {
            if (c3860k5.m29426D()) {
                return new C3822i(Double.valueOf(c3860k5.m29423w()));
            }
            return new C3822i(null);
        } else if (m29424F == 3) {
            if (c3860k5.m29427C()) {
                return new C3790g(Boolean.valueOf(c3860k5.m29428B()));
            }
            return new C3790g(null);
        } else if (m29424F == 4) {
            List<C3860k5> m29429A = c3860k5.m29429A();
            ArrayList arrayList = new ArrayList();
            for (C3860k5 c3860k52 : m29429A) {
                arrayList.add(m28975a(c3860k52));
            }
            return new C3963r(c3860k5.m29421y(), arrayList);
        } else {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
    }

    /* renamed from: b */
    public static q m28974b(Object obj) {
        if (obj == null) {
            return q.j;
        }
        if (obj instanceof String) {
            return new C4011u((String) obj);
        }
        if (obj instanceof Double) {
            return new C3822i((Double) obj);
        }
        if (obj instanceof Long) {
            return new C3822i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C3822i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C3790g((Boolean) obj);
        }
        if (obj instanceof Map) {
            C3901n c3901n = new C3901n();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                q m28974b = m28974b(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    c3901n.m29370k((String) obj2, m28974b);
                }
            }
            return c3901n;
        } else if (obj instanceof List) {
            f fVar = new f();
            for (Object obj3 : (List) obj) {
                fVar.Z(fVar.E(), m28974b(obj3));
            }
            return fVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
