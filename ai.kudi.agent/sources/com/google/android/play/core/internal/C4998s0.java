package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: com.google.android.play.core.internal.s0 */
/* loaded from: classes2.dex */
public final class C4998s0 extends C4968d0 implements InterfaceC5000t0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4998s0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    @Override // com.google.android.play.core.internal.InterfaceC5000t0
    /* renamed from: a */
    public final void mo25881a(Bundle bundle) throws RemoteException {
        Parcel m25947m = m25947m();
        C4972f0.m25943c(m25947m, bundle);
        m25946n(3, m25947m);
    }

    @Override // com.google.android.play.core.internal.InterfaceC5000t0
    /* renamed from: b */
    public final void mo25880b(Bundle bundle) throws RemoteException {
        Parcel m25947m = m25947m();
        C4972f0.m25943c(m25947m, bundle);
        m25946n(4, m25947m);
    }

    @Override // com.google.android.play.core.internal.InterfaceC5000t0
    /* renamed from: k */
    public final void mo25879k(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel m25947m = m25947m();
        C4972f0.m25943c(m25947m, bundle);
        C4972f0.m25943c(m25947m, bundle2);
        m25946n(2, m25947m);
    }
}
