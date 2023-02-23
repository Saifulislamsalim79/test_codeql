package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.te */
/* loaded from: classes2.dex */
public final class C4010te extends AbstractC3838j {

    /* renamed from: e */
    final boolean f9718e;

    /* renamed from: f */
    final boolean f9719f;

    /* renamed from: w */
    final /* synthetic */ C4026ue f9720w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4010te(C4026ue c4026ue, boolean z, boolean z2) {
        super("log");
        this.f9720w = c4026ue;
        this.f9718e = z;
        this.f9719f = z2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3838j
    /* renamed from: a */
    public final q mo28520a(C3968r4 c3968r4, List<q> list) {
        InterfaceC3994se interfaceC3994se;
        InterfaceC3994se interfaceC3994se2;
        InterfaceC3994se interfaceC3994se3;
        C3969r5.m29036i("log", 1, list);
        if (list.size() == 1) {
            interfaceC3994se3 = this.f9720w.f9784e;
            interfaceC3994se3.mo27987a(3, c3968r4.m29051b(list.get(0)).h(), Collections.emptyList(), this.f9718e, this.f9719f);
            return q.i;
        }
        int m29043b = C3969r5.m29043b(c3968r4.m29051b(list.get(0)).b().doubleValue());
        int i = m29043b != 2 ? m29043b != 3 ? m29043b != 5 ? m29043b != 6 ? 3 : 2 : 5 : 1 : 4;
        String h = c3968r4.m29051b(list.get(1)).h();
        if (list.size() == 2) {
            interfaceC3994se2 = this.f9720w.f9784e;
            interfaceC3994se2.mo27987a(i, h, Collections.emptyList(), this.f9718e, this.f9719f);
            return q.i;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
            arrayList.add(c3968r4.m29051b(list.get(i2)).h());
        }
        interfaceC3994se = this.f9720w.f9784e;
        interfaceC3994se.mo27987a(i, h, arrayList, this.f9718e, this.f9719f);
        return q.i;
    }
}
