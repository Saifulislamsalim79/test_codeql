package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C2757c;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.z */
/* loaded from: classes2.dex */
final class C2820z implements ComponentCallbacks2C2757c.InterfaceC2758a {

    /* renamed from: a */
    final /* synthetic */ InterfaceC2769g f7890a;

    C2820z(InterfaceC2769g interfaceC2769g) {
        this.f7890a = interfaceC2769g;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C2757c.InterfaceC2758a
    /* renamed from: a */
    public final void mo23077a(boolean z) {
        InterfaceC2769g interfaceC2769g = this.f7890a;
        InterfaceC2769g.r(interfaceC2769g).sendMessage(InterfaceC2769g.r(interfaceC2769g).obtainMessage(1, Boolean.valueOf(z)));
    }
}
