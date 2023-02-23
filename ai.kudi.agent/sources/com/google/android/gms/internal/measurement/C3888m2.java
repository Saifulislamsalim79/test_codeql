package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.InterfaceC4188d6;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.m2 */
/* loaded from: classes2.dex */
final class C3888m2 extends AbstractC3856k1 {

    /* renamed from: a */
    private final InterfaceC4188d6 f9469a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3888m2(InterfaceC4188d6 interfaceC4188d6) {
        this.f9469a = interfaceC4188d6;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3872l1
    /* renamed from: d */
    public final int mo29409d() {
        return System.identityHashCode(this.f9469a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3872l1
    /* renamed from: r */
    public final void mo29408r(String str, String str2, Bundle bundle, long j) {
        this.f9469a.mo25417a(str, str2, bundle, j);
    }
}
