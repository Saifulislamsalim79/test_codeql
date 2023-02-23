package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.p105a.C4140a;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-api@@20.0.0 */
/* renamed from: com.google.firebase.analytics.connector.internal.f */
/* loaded from: classes2.dex */
public final class C5188f implements C4140a.InterfaceC4141a {

    /* renamed from: a */
    final /* synthetic */ C5189g f12929a;

    public C5188f(C5189g c5189g) {
        this.f12929a = c5189g;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4188d6
    /* renamed from: a */
    public final void mo25417a(String str, String str2, Bundle bundle, long j) {
        InterfaceC5174a.InterfaceC5176b interfaceC5176b;
        if (str == null || str.equals("crash") || !C5185c.m25421k(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        interfaceC5176b = this.f12929a.f12930a;
        interfaceC5176b.mo22282a(3, bundle2);
    }
}
