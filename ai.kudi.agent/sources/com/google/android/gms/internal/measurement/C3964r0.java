package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.r0 */
/* loaded from: classes2.dex */
public final class C3964r0 extends C3918o0 implements InterfaceC3996t0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3964r0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3996t0
    /* renamed from: l */
    public final Bundle mo28931l(Bundle bundle) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29087d(m29321m, bundle);
        Parcel m29320n = m29320n(1, m29321m);
        Bundle bundle2 = (Bundle) C3948q0.m29090a(m29320n, Bundle.CREATOR);
        m29320n.recycle();
        return bundle2;
    }
}
