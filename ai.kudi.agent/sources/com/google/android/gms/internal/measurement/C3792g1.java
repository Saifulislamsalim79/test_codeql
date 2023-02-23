package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.g1 */
/* loaded from: classes2.dex */
public final class C3792g1 extends C3918o0 implements InterfaceC3824i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3792g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3824i1
    /* renamed from: l */
    public final void mo29532l(Bundle bundle) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29087d(m29321m, bundle);
        m29319o(1, m29321m);
    }
}
