package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.common.api.InterfaceC2748h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC2761d;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.d1 */
/* loaded from: classes2.dex */
public final class C2763d1<A extends AbstractC2761d<? extends InterfaceC2748h, C2730a.InterfaceC2732b>> extends AbstractC2771g1 {

    /* renamed from: b */
    protected final A f7752b;

    public C2763d1(int i, A a) {
        super(i);
        com.google.android.gms.common.internal.s.k(a, "Null methods are not runnable.");
        this.f7752b = a;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2771g1
    /* renamed from: a */
    public final void mo31887a(Status status) {
        try {
            this.f7752b.m32040q(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2771g1
    /* renamed from: b */
    public final void mo31886b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.f7752b.m32040q(new Status(10, sb.toString()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2771g1
    /* renamed from: c */
    public final void mo31885c(e0<?> e0Var) throws DeadObjectException {
        try {
            this.f7752b.m32042o(e0Var.v());
        } catch (RuntimeException e) {
            mo31886b(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2771g1
    /* renamed from: d */
    public final void mo32010d(C2811u c2811u, boolean z) {
        c2811u.m31912c(this.f7752b, z);
    }
}
