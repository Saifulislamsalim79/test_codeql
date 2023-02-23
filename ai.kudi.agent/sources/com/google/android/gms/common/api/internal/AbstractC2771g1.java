package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.g1 */
/* loaded from: classes2.dex */
public abstract class AbstractC2771g1 {

    /* renamed from: a */
    public final int f7776a;

    public AbstractC2771g1(int i) {
        this.f7776a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* bridge */ /* synthetic */ Status m32009e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo31887a(Status status);

    /* renamed from: b */
    public abstract void mo31886b(Exception exc);

    /* renamed from: c */
    public abstract void mo31885c(e0<?> e0Var) throws DeadObjectException;

    /* renamed from: d */
    public abstract void mo32010d(C2811u c2811u, boolean z);
}
