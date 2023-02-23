package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC2989b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.u1 */
/* loaded from: classes2.dex */
public final class C4013u1 extends AbstractRunnableC3873l2 {

    /* renamed from: w */
    final /* synthetic */ Activity f9723w;

    /* renamed from: x */
    final /* synthetic */ String f9724x;

    /* renamed from: y */
    final /* synthetic */ String f9725y;

    /* renamed from: z */
    final /* synthetic */ C4046w2 f9726z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4013u1(C4046w2 c4046w2, Activity activity, String str, String str2) {
        super(c4046w2, true);
        this.f9726z = c4046w2;
        this.f9723w = activity;
        this.f9724x = str;
        this.f9725y = str2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: a */
    final void mo28583a() throws RemoteException {
        f1 f1Var;
        f1Var = this.f9726z.f9814h;
        com.google.android.gms.common.internal.s.j(f1Var);
        f1Var.setCurrentScreen(BinderC2989b.m31494p1(this.f9723w), this.f9724x, this.f9725y, this.f9458c);
    }
}
