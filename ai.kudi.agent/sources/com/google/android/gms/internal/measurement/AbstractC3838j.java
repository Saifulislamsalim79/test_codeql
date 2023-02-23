package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.j */
/* loaded from: classes2.dex */
public abstract class AbstractC3838j implements q, m {

    /* renamed from: c */
    protected final String f9415c;

    /* renamed from: d */
    protected final Map<String, q> f9416d = new HashMap();

    public AbstractC3838j(String str) {
        this.f9415c = str;
    }

    /* renamed from: a */
    public abstract q mo28520a(C3968r4 c3968r4, List<q> list);

    /* renamed from: b */
    public final Double m29511b() {
        return Double.valueOf(Double.NaN);
    }

    /* renamed from: c */
    public final String m29510c() {
        return this.f9415c;
    }

    /* renamed from: d */
    public q mo29229d() {
        return this;
    }

    /* renamed from: e */
    public final boolean m29509e(String str) {
        return this.f9416d.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC3838j) {
            AbstractC3838j abstractC3838j = (AbstractC3838j) obj;
            String str = this.f9415c;
            if (str != null) {
                return str.equals(abstractC3838j.f9415c);
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final Boolean m29508f() {
        return Boolean.TRUE;
    }

    /* renamed from: h */
    public final String m29507h() {
        return this.f9415c;
    }

    public final int hashCode() {
        String str = this.f9415c;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: k */
    public final void m29506k(String str, q qVar) {
        if (qVar == null) {
            this.f9416d.remove(str);
        } else {
            this.f9416d.put(str, qVar);
        }
    }

    /* renamed from: l */
    public final Iterator<q> m29505l() {
        return C3854k.m29431b(this.f9416d);
    }

    /* renamed from: m */
    public final q m29504m(String str) {
        return this.f9416d.containsKey(str) ? this.f9416d.get(str) : q.i;
    }

    /* renamed from: s */
    public final q m29503s(String str, C3968r4 c3968r4, List<q> list) {
        if ("toString".equals(str)) {
            return new C4011u(this.f9415c);
        }
        return C3854k.m29432a(this, new C4011u(str), c3968r4, list);
    }
}
