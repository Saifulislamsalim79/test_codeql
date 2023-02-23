package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.p105a.C4140a;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-api@@20.0.0 */
/* renamed from: com.google.firebase.analytics.connector.internal.d */
/* loaded from: classes2.dex */
public final class C5186d implements C4140a.InterfaceC4141a {

    /* renamed from: a */
    final /* synthetic */ C5187e f12924a;

    public C5186d(C5187e c5187e) {
        this.f12924a = c5187e;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4188d6
    /* renamed from: a */
    public final void mo25417a(String str, String str2, Bundle bundle, long j) {
        InterfaceC5174a.InterfaceC5176b interfaceC5176b;
        if (this.f12924a.f12925a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", C5185c.m25429c(str2));
            interfaceC5176b = this.f12924a.f12926b;
            interfaceC5176b.mo22282a(2, bundle2);
        }
    }
}
