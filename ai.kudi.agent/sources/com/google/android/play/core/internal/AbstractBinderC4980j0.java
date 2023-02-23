package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: com.google.android.play.core.internal.j0 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4980j0 extends BinderC4970e0 implements InterfaceC4982k0 {
    public AbstractBinderC4980j0() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // com.google.android.play.core.internal.BinderC4970e0
    /* renamed from: m */
    protected final boolean mo25885m(int i, Parcel parcel) throws RemoteException {
        if (i == 2) {
            mo15011a((Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            mo15012b((Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
