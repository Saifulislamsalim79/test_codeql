package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.y */
/* loaded from: classes2.dex */
public final class C4075y {

    /* renamed from: a */
    final Map<String, AbstractC4059x> f9855a = new HashMap();

    /* renamed from: b */
    final C3871l0 f9856b = new C3871l0();

    public C4075y() {
        m28618b(new C4043w());
        m28618b(new C4091z());
        m28618b(new C3697a0());
        m28618b(new C3762e0());
        m28618b(new C3839j0());
        m28618b(new C3855k0());
        m28618b(new C3886m0());
    }

    /* renamed from: a */
    public final q m28619a(C3968r4 c3968r4, q qVar) {
        AbstractC4059x abstractC4059x;
        C3969r5.m29042c(c3968r4);
        if (qVar instanceof C3963r) {
            C3963r c3963r = (C3963r) qVar;
            ArrayList<q> m29067c = c3963r.m29067c();
            String m29069a = c3963r.m29069a();
            if (this.f9855a.containsKey(m29069a)) {
                abstractC4059x = this.f9855a.get(m29069a);
            } else {
                abstractC4059x = this.f9856b;
            }
            return abstractC4059x.mo28588a(m29069a, c3968r4, m29067c);
        }
        return qVar;
    }

    /* renamed from: b */
    final void m28618b(AbstractC4059x abstractC4059x) {
        for (EnumC3902n0 enumC3902n0 : abstractC4059x.f9831a) {
            this.f9855a.put(enumC3902n0.m29365b().toString(), abstractC4059x);
        }
    }
}
