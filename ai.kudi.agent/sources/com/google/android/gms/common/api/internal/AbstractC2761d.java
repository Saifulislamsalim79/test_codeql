package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC2743d;
import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.common.api.C2730a.InterfaceC2732b;
import com.google.android.gms.common.api.InterfaceC2748h;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.d */
/* loaded from: classes2.dex */
public abstract class AbstractC2761d<R extends InterfaceC2748h, A extends C2730a.InterfaceC2732b> extends BasePendingResult<R> implements InterfaceC2764e<R> {
    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2761d(C2730a<?> c2730a, AbstractC2743d abstractC2743d) {
        super(abstractC2743d);
        com.google.android.gms.common.internal.s.k(abstractC2743d, "GoogleApiClient must not be null");
        com.google.android.gms.common.internal.s.k(c2730a, "Api must not be null");
        c2730a.m32091b();
    }

    /* renamed from: p */
    private void m32041p(RemoteException remoteException) {
        m32040q(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.InterfaceC2764e
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo32039a(Object obj) {
        super.m32065g((InterfaceC2748h) obj);
    }

    /* renamed from: m */
    protected abstract void mo16048m(A a) throws RemoteException;

    /* renamed from: n */
    protected void m32043n(R r) {
    }

    /* renamed from: o */
    public final void m32042o(A a) throws DeadObjectException {
        try {
            mo16048m(a);
        } catch (DeadObjectException e) {
            m32041p(e);
            throw e;
        } catch (RemoteException e2) {
            m32041p(e2);
        }
    }

    /* renamed from: q */
    public final void m32040q(Status status) {
        com.google.android.gms.common.internal.s.b(!status.m32094s(), "Failed result must not be success");
        R mo16049d = mo16049d(status);
        m32065g(mo16049d);
        m32043n(mo16049d);
    }
}
