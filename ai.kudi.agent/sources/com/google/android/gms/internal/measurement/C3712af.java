package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.TreeMap;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.af */
/* loaded from: classes2.dex */
public final class C3712af {

    /* renamed from: a */
    final TreeMap<Integer, C3933p> f9188a = new TreeMap<>();

    /* renamed from: b */
    final TreeMap<Integer, C3933p> f9189b = new TreeMap<>();

    /* renamed from: c */
    private static final int m29839c(C3968r4 c3968r4, C3933p c3933p, q qVar) {
        q mo28520a = c3933p.mo28520a(c3968r4, Collections.singletonList(qVar));
        if (mo28520a instanceof C3822i) {
            return C3969r5.m29043b(mo28520a.b().doubleValue());
        }
        return -1;
    }

    /* renamed from: a */
    public final void m29841a(String str, int i, C3933p c3933p, String str2) {
        TreeMap<Integer, C3933p> treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f9189b;
        } else if (!"edit".equals(str2)) {
            String valueOf = String.valueOf(str2);
            throw new IllegalStateException(valueOf.length() != 0 ? "Unknown callback type: ".concat(valueOf) : new String("Unknown callback type: "));
        } else {
            treeMap = this.f9188a;
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), c3933p);
    }

    /* renamed from: b */
    public final void m29840b(C3968r4 c3968r4, C3729c c3729c) {
        C3880l9 c3880l9 = new C3880l9(c3729c);
        for (Integer num : this.f9188a.keySet()) {
            C3713b clone = c3729c.m29735b().clone();
            int m29839c = m29839c(c3968r4, this.f9188a.get(num), c3880l9);
            if (m29839c == 2 || m29839c == -1) {
                c3729c.m29731f(clone);
            }
        }
        for (Integer num2 : this.f9189b.keySet()) {
            m29839c(c3968r4, this.f9189b.get(num2), c3880l9);
        }
    }
}
