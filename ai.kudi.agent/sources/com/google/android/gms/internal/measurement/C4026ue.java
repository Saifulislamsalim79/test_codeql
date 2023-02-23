package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.ue */
/* loaded from: classes2.dex */
public final class C4026ue extends AbstractC3838j {

    /* renamed from: e */
    private final InterfaceC3994se f9784e;

    public C4026ue(InterfaceC3994se interfaceC3994se) {
        super("internal.logger");
        this.f9784e = interfaceC3994se;
        this.f9416d.put("log", new C4010te(this, false, true));
        this.f9416d.put("silent", new C3931od(this, "silent"));
        ((AbstractC3838j) this.f9416d.get("silent")).m29506k("log", new C4010te(this, true, true));
        this.f9416d.put("unmonitored", new C3947pe(this, "unmonitored"));
        ((AbstractC3838j) this.f9416d.get("unmonitored")).m29506k("log", new C4010te(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3838j
    /* renamed from: a */
    public final q mo28520a(C3968r4 c3968r4, List<q> list) {
        return q.i;
    }
}
