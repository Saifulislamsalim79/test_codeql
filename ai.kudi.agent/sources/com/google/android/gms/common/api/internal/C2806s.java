package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC2744e;
import com.google.android.gms.common.api.Status;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.s */
/* loaded from: classes2.dex */
public final class C2806s implements AbstractC2744e.InterfaceC2745a {

    /* renamed from: a */
    final /* synthetic */ BasePendingResult f7860a;

    /* renamed from: b */
    final /* synthetic */ C2811u f7861b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2806s(C2811u c2811u, BasePendingResult basePendingResult) {
        this.f7861b = c2811u;
        this.f7860a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.AbstractC2744e.InterfaceC2745a
    /* renamed from: a */
    public final void mo31702a(Status status) {
        Map map;
        map = this.f7861b.f7872a;
        map.remove(this.f7860a);
    }
}
