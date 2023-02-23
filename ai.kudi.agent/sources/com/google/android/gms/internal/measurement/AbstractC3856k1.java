package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.k1 */
/* loaded from: classes2.dex */
public abstract class AbstractC3856k1 extends p0 implements InterfaceC3872l1 {
    public AbstractC3856k1() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: m */
    protected final boolean m29430m(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo29408r(parcel.readString(), parcel.readString(), (Bundle) C3948q0.m29090a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int mo29409d = mo29409d();
            parcel2.writeNoException();
            parcel2.writeInt(mo29409d);
        }
        return true;
    }
}
