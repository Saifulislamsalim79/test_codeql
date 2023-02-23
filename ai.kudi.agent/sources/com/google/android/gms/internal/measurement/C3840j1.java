package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.j1 */
/* loaded from: classes2.dex */
public final class C3840j1 extends C3918o0 implements InterfaceC3872l1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3840j1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3872l1
    /* renamed from: d */
    public final int mo29409d() throws RemoteException {
        Parcel m29320n = m29320n(2, m29321m());
        int readInt = m29320n.readInt();
        m29320n.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3872l1
    /* renamed from: r */
    public final void mo29408r(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel m29321m = m29321m();
        m29321m.writeString(str);
        m29321m.writeString(str2);
        C3948q0.m29087d(m29321m, bundle);
        m29321m.writeLong(j);
        m29319o(1, m29321m);
    }
}
