package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p272h.p286c.p287a.p300b.p307d.p314g.BinderC8474p;
import p272h.p286c.p287a.p300b.p307d.p314g.C8483y;
/* renamed from: com.google.android.gms.location.a0 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4108a0 extends BinderC8474p implements InterfaceC4139z {
    /* renamed from: n */
    public static InterfaceC4139z m28504n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof InterfaceC4139z ? (InterfaceC4139z) queryLocalInterface : new C4111b0(iBinder);
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p314g.BinderC8474p
    /* renamed from: m */
    protected final boolean mo16056m(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo16061O0((LocationResult) C8483y.m16047a(parcel, LocationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo16060s0((LocationAvailability) C8483y.m16047a(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
