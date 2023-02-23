package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.n */
/* loaded from: classes2.dex */
public class C3901n implements q, m {

    /* renamed from: c */
    final Map<String, q> f9499c = new HashMap();

    /* renamed from: a */
    public final List<String> m29376a() {
        return new ArrayList(this.f9499c.keySet());
    }

    /* renamed from: b */
    public final Double m29375b() {
        return Double.valueOf(Double.NaN);
    }

    /* renamed from: d */
    public final q m29374d() {
        C3901n c3901n = new C3901n();
        for (Map.Entry<String, q> entry : this.f9499c.entrySet()) {
            if (entry.getValue() instanceof m) {
                c3901n.f9499c.put(entry.getKey(), entry.getValue());
            } else {
                c3901n.f9499c.put(entry.getKey(), entry.getValue().d());
            }
        }
        return c3901n;
    }

    /* renamed from: e */
    public final boolean m29373e(String str) {
        return this.f9499c.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3901n) {
            return this.f9499c.equals(((C3901n) obj).f9499c);
        }
        return false;
    }

    /* renamed from: f */
    public final Boolean m29372f() {
        return Boolean.TRUE;
    }

    /* renamed from: h */
    public final String m29371h() {
        return "[object Object]";
    }

    public final int hashCode() {
        return this.f9499c.hashCode();
    }

    /* renamed from: k */
    public final void m29370k(String str, q qVar) {
        if (qVar == null) {
            this.f9499c.remove(str);
        } else {
            this.f9499c.put(str, qVar);
        }
    }

    /* renamed from: l */
    public final Iterator<q> m29369l() {
        return C3854k.m29431b(this.f9499c);
    }

    /* renamed from: m */
    public final q m29368m(String str) {
        return this.f9499c.containsKey(str) ? this.f9499c.get(str) : q.i;
    }

    /* renamed from: s */
    public q mo29367s(String str, C3968r4 c3968r4, List<q> list) {
        if ("toString".equals(str)) {
            return new C4011u(toString());
        }
        return C3854k.m29432a(this, new C4011u(str), c3968r4, list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f9499c.isEmpty()) {
            for (String str : this.f9499c.keySet()) {
                sb.append(String.format("%s: %s,", str, this.f9499c.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
