package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.p */
/* loaded from: classes2.dex */
public final class C3933p extends AbstractC3838j implements m {

    /* renamed from: e */
    protected final List<String> f9607e;

    /* renamed from: f */
    protected final List<q> f9608f;

    /* renamed from: w */
    protected C3968r4 f9609w;

    private C3933p(C3933p c3933p) {
        super(c3933p.f9415c);
        ArrayList arrayList = new ArrayList(c3933p.f9607e.size());
        this.f9607e = arrayList;
        arrayList.addAll(c3933p.f9607e);
        ArrayList arrayList2 = new ArrayList(c3933p.f9608f.size());
        this.f9608f = arrayList2;
        arrayList2.addAll(c3933p.f9608f);
        this.f9609w = c3933p.f9609w;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3838j
    /* renamed from: a */
    public final q mo28520a(C3968r4 c3968r4, List<q> list) {
        C3968r4 m29052a = this.f9609w.m29052a();
        for (int i = 0; i < this.f9607e.size(); i++) {
            if (i < list.size()) {
                m29052a.m29048e(this.f9607e.get(i), c3968r4.m29051b(list.get(i)));
            } else {
                m29052a.m29048e(this.f9607e.get(i), q.i);
            }
        }
        for (q qVar : this.f9608f) {
            q m29051b = m29052a.m29051b(qVar);
            if (m29051b instanceof C3963r) {
                m29051b = m29052a.m29051b(qVar);
            }
            if (m29051b instanceof C3806h) {
                return ((C3806h) m29051b).m29578a();
            }
        }
        return q.i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3838j
    /* renamed from: d */
    public final q mo29229d() {
        return new C3933p(this);
    }

    public C3933p(String str, List<q> list, List<q> list2, C3968r4 c3968r4) {
        super(str);
        this.f9607e = new ArrayList();
        this.f9609w = c3968r4;
        if (!list.isEmpty()) {
            for (q qVar : list) {
                this.f9607e.add(qVar.h());
            }
        }
        this.f9608f = new ArrayList(list2);
    }
}
