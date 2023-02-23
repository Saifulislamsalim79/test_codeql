package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: com.google.android.play.core.internal.g0 */
/* loaded from: classes2.dex */
public final class C4974g0 extends C4968d0 implements InterfaceC4978i0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4974g0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    @Override // com.google.android.play.core.internal.InterfaceC4978i0
    /* renamed from: D0 */
    public final void mo25940D0(String str, Bundle bundle, InterfaceC4982k0 interfaceC4982k0) throws RemoteException {
        Parcel m25947m = m25947m();
        m25947m.writeString(str);
        C4972f0.m25943c(m25947m, bundle);
        C4972f0.m25944b(m25947m, interfaceC4982k0);
        m25946n(2, m25947m);
    }
}
