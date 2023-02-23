package com.google.android.gms.internal.measurement;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.ma */
/* loaded from: classes2.dex */
public final class C3896ma extends AbstractC3838j {

    /* renamed from: e */
    final /* synthetic */ InterfaceC3914nc f9494e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3896ma(C3897mb c3897mb, String str, InterfaceC3914nc interfaceC3914nc) {
        super("getValue");
        this.f9494e = interfaceC3914nc;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3838j
    /* renamed from: a */
    public final q mo28520a(C3968r4 c3968r4, List<q> list) {
        C3969r5.m29037h("getValue", 2, list);
        q m29051b = c3968r4.m29051b(list.get(0));
        q m29051b2 = c3968r4.m29051b(list.get(1));
        String mo27973e = this.f9494e.mo27973e(m29051b.h());
        return mo27973e != null ? new C4011u(mo27973e) : m29051b2;
    }
}
