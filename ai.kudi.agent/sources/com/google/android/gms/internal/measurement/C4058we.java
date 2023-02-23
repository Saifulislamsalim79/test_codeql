package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.we */
/* loaded from: classes2.dex */
public final class C4058we extends AbstractC3838j {

    /* renamed from: e */
    private final C3712af f9830e;

    public C4058we(C3712af c3712af) {
        super("internal.registerCallback");
        this.f9830e = c3712af;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3838j
    /* renamed from: a */
    public final q mo28520a(C3968r4 c3968r4, List<q> list) {
        C3969r5.m29037h(this.f9415c, 3, list);
        String h = c3968r4.m29051b(list.get(0)).h();
        q m29051b = c3968r4.m29051b(list.get(1));
        if (m29051b instanceof C3933p) {
            q m29051b2 = c3968r4.m29051b(list.get(2));
            if (m29051b2 instanceof C3901n) {
                C3901n c3901n = (C3901n) m29051b2;
                if (c3901n.m29373e("type")) {
                    this.f9830e.m29841a(h, c3901n.m29373e("priority") ? C3969r5.m29043b(c3901n.m29368m("priority").b().doubleValue()) : 1000, (C3933p) m29051b, c3901n.m29368m("type").h());
                    return q.i;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
