package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C4465k;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.z0 */
/* loaded from: classes2.dex */
abstract class AbstractC2821z0<T> extends AbstractC2788m0 {

    /* renamed from: b */
    protected final C4465k<T> f7891b;

    public AbstractC2821z0(int i, C4465k<T> c4465k) {
        super(i);
        this.f7891b = c4465k;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2771g1
    /* renamed from: a */
    public final void mo31887a(Status status) {
        this.f7891b.m27774d(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2771g1
    /* renamed from: b */
    public final void mo31886b(Exception exc) {
        this.f7891b.m27774d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2771g1
    /* renamed from: c */
    public final void mo31885c(e0<?> e0Var) throws DeadObjectException {
        try {
            mo31884h(e0Var);
        } catch (DeadObjectException e) {
            mo31887a(AbstractC2771g1.m32009e(e));
            throw e;
        } catch (RemoteException e2) {
            mo31887a(AbstractC2771g1.m32009e(e2));
        } catch (RuntimeException e3) {
            this.f7891b.m27774d(e3);
        }
    }

    /* renamed from: h */
    protected abstract void mo31884h(e0<?> e0Var) throws RemoteException;
}
