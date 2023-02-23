package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.xe */
/* loaded from: classes2.dex */
public final class C4074xe extends AbstractC3838j {

    /* renamed from: e */
    private final C3955q7 f9853e;

    /* renamed from: f */
    final Map<String, AbstractC3838j> f9854f;

    public C4074xe(C3955q7 c3955q7) {
        super("require");
        this.f9854f = new HashMap();
        this.f9853e = c3955q7;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3838j
    /* renamed from: a */
    public final q mo28520a(C3968r4 c3968r4, List<q> list) {
        AbstractC3838j abstractC3838j;
        C3969r5.m29037h("require", 1, list);
        String h = c3968r4.m29051b(list.get(0)).h();
        if (this.f9854f.containsKey(h)) {
            return this.f9854f.get(h);
        }
        C3955q7 c3955q7 = this.f9853e;
        if (c3955q7.f9630a.containsKey(h)) {
            try {
                abstractC3838j = c3955q7.f9630a.get(h).call();
            } catch (Exception unused) {
                String valueOf = String.valueOf(h);
                throw new IllegalStateException(valueOf.length() != 0 ? "Failed to create API implementation: ".concat(valueOf) : new String("Failed to create API implementation: "));
            }
        } else {
            abstractC3838j = q.i;
        }
        if (abstractC3838j instanceof AbstractC3838j) {
            this.f9854f.put(h, (AbstractC3838j) abstractC3838j);
        }
        return abstractC3838j;
    }
}
