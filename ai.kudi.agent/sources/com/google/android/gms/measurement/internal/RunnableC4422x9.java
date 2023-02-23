package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.x9 */
/* loaded from: classes2.dex */
final class RunnableC4422x9 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ String f10808c;

    /* renamed from: d */
    final /* synthetic */ String f10809d = "_err";

    /* renamed from: e */
    final /* synthetic */ Bundle f10810e;

    /* renamed from: f */
    final /* synthetic */ C4434y9 f10811f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4422x9(C4434y9 c4434y9, String str, String str2, Bundle bundle) {
        this.f10811f = c4434y9;
        this.f10808c = str;
        this.f10810e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4379u w0 = this.f10811f.f10843a.m28362f0().w0(this.f10808c, this.f10809d, this.f10810e, "auto", this.f10811f.f10843a.m28369c().currentTimeMillis(), false, true);
        C4168ba c4168ba = this.f10811f.f10843a;
        com.google.android.gms.common.internal.s.j(w0);
        c4168ba.m28355j(w0, this.f10808c);
    }
}
