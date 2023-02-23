package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.o8 */
/* loaded from: classes2.dex */
public final class C3926o8 extends AbstractC3838j {

    /* renamed from: e */
    private final C3729c f9595e;

    public C3926o8(C3729c c3729c) {
        super("internal.eventLogger");
        this.f9595e = c3729c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3838j
    /* renamed from: a */
    public final q mo28520a(C3968r4 c3968r4, List<q> list) {
        Map<String, Object> hashMap;
        C3969r5.m29037h(this.f9415c, 3, list);
        String h = c3968r4.m29051b(list.get(0)).h();
        long m29044a = (long) C3969r5.m29044a(c3968r4.m29051b(list.get(1)).b().doubleValue());
        q m29051b = c3968r4.m29051b(list.get(2));
        if (m29051b instanceof C3901n) {
            hashMap = C3969r5.m29038g((C3901n) m29051b);
        } else {
            hashMap = new HashMap<>();
        }
        this.f9595e.m29732e(h, m29044a, hashMap);
        return q.i;
    }
}
