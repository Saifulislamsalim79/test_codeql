package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.k */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3854k {
    /* renamed from: a */
    public static q m29432a(m mVar, q qVar, C3968r4 c3968r4, List<q> list) {
        if (mVar.e(qVar.h())) {
            q m = mVar.m(qVar.h());
            if (m instanceof AbstractC3838j) {
                return ((AbstractC3838j) m).mo28520a(c3968r4, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", qVar.h()));
        } else if ("hasOwnProperty".equals(qVar.h())) {
            C3969r5.m29037h("hasOwnProperty", 1, list);
            return mVar.e(c3968r4.m29051b(list.get(0)).h()) ? q.n : q.o;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", qVar.h()));
        }
    }

    /* renamed from: b */
    public static Iterator<q> m29431b(Map<String, q> map) {
        return new C3870l(map.keySet().iterator());
    }
}
