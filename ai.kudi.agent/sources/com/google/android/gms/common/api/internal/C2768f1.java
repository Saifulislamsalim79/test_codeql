package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.C2830d;
import com.google.android.gms.common.api.internal.C2778j;
import com.google.android.gms.tasks.C4465k;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.f1 */
/* loaded from: classes2.dex */
public final class C2768f1 extends AbstractC2821z0<Boolean> {

    /* renamed from: c */
    public final C2778j.C2779a<?> f7773c;

    public C2768f1(C2778j.C2779a<?> c2779a, C4465k<Boolean> c4465k) {
        super(4, c4465k);
        this.f7773c = c2779a;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2771g1
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo32010d(C2811u c2811u, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2788m0
    /* renamed from: f */
    public final boolean mo31939f(e0<?> e0Var) {
        C2807s0 c2807s0 = (C2807s0) e0Var.x().get(this.f7773c);
        if (c2807s0 == null) {
            return false;
        }
        c2807s0.f7862a.m31940d();
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2788m0
    /* renamed from: g */
    public final C2830d[] mo31938g(e0<?> e0Var) {
        C2807s0 c2807s0 = (C2807s0) e0Var.x().get(this.f7773c);
        if (c2807s0 == null) {
            return null;
        }
        return c2807s0.f7862a.m31942b();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2821z0
    /* renamed from: h */
    public final void mo31884h(e0<?> e0Var) throws RemoteException {
        C2807s0 c2807s0 = (C2807s0) e0Var.x().remove(this.f7773c);
        if (c2807s0 != null) {
            c2807s0.f7863b.m31921a(e0Var.v(), this.f7891b);
            c2807s0.f7862a.m31943a();
            return;
        }
        this.f7891b.m27773e(Boolean.FALSE);
    }
}
