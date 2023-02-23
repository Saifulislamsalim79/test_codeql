package com.google.android.gms.measurement.internal;

import android.util.Log;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.e6 */
/* loaded from: classes2.dex */
final class C4199e6 implements InterfaceC4264k3 {

    /* renamed from: a */
    final /* synthetic */ b5 f10233a;

    C4199e6(C4210f6 c4210f6, b5 b5Var) {
        this.f10233a = b5Var;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4264k3
    public final boolean zza() {
        return this.f10233a.q() && Log.isLoggable(this.f10233a.b().C(), 3);
    }
}
