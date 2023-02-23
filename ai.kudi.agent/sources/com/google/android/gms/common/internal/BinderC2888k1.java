package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.k1 */
/* loaded from: classes2.dex */
public final class BinderC2888k1 extends AbstractBinderC2936y0 {

    /* renamed from: a */
    private AbstractC2854c f8025a;

    /* renamed from: b */
    private final int f8026b;

    public BinderC2888k1(AbstractC2854c abstractC2854c, int i) {
        this.f8025a = abstractC2854c;
        this.f8026b = i;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2893m
    /* renamed from: A0 */
    public final void mo31601A0(int i, IBinder iBinder, C2902o1 c2902o1) {
        AbstractC2854c abstractC2854c = this.f8025a;
        s.k(abstractC2854c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        s.j(c2902o1);
        AbstractC2854c.m31791b0(abstractC2854c, c2902o1);
        mo31599r0(i, iBinder, c2902o1.f8038c);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2893m
    /* renamed from: P */
    public final void mo31600P(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2893m
    /* renamed from: r0 */
    public final void mo31599r0(int i, IBinder iBinder, Bundle bundle) {
        s.k(this.f8025a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f8025a.m31807M(i, iBinder, bundle, this.f8026b);
        this.f8025a = null;
    }
}
