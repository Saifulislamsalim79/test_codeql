package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.C2830d;
import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C4465k;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.e1 */
/* loaded from: classes2.dex */
public final class C2765e1<ResultT> extends AbstractC2788m0 {

    /* renamed from: b */
    private final AbstractC2796p<C2730a.InterfaceC2732b, ResultT> f7753b;

    /* renamed from: c */
    private final C4465k<ResultT> f7754c;

    /* renamed from: d */
    private final InterfaceC2793o f7755d;

    public C2765e1(int i, AbstractC2796p<C2730a.InterfaceC2732b, ResultT> abstractC2796p, C4465k<ResultT> c4465k, InterfaceC2793o interfaceC2793o) {
        super(i);
        this.f7754c = c4465k;
        this.f7753b = abstractC2796p;
        this.f7755d = interfaceC2793o;
        if (i == 2 && abstractC2796p.m31934c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2771g1
    /* renamed from: a */
    public final void mo31887a(Status status) {
        this.f7754c.m27774d(this.f7755d.mo23071a(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2771g1
    /* renamed from: b */
    public final void mo31886b(Exception exc) {
        this.f7754c.m27774d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2771g1
    /* renamed from: c */
    public final void mo31885c(e0<?> e0Var) throws DeadObjectException {
        try {
            this.f7753b.mo28489b(e0Var.v(), this.f7754c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo31887a(AbstractC2771g1.m32009e(e2));
        } catch (RuntimeException e3) {
            this.f7754c.m27774d(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2771g1
    /* renamed from: d */
    public final void mo32010d(C2811u c2811u, boolean z) {
        c2811u.m31911d(this.f7754c, z);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2788m0
    /* renamed from: f */
    public final boolean mo31939f(e0<?> e0Var) {
        return this.f7753b.m31934c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2788m0
    /* renamed from: g */
    public final C2830d[] mo31938g(e0<?> e0Var) {
        return this.f7753b.m31932e();
    }
}
