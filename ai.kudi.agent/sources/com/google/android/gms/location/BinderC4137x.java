package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p272h.p286c.p287a.p300b.p307d.p314g.BinderC8474p;
/* renamed from: com.google.android.gms.location.x */
/* loaded from: classes2.dex */
public class BinderC4137x extends BinderC8474p implements InterfaceC4136w {
    /* renamed from: n */
    public static InterfaceC4136w m28488n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return queryLocalInterface instanceof InterfaceC4136w ? (InterfaceC4136w) queryLocalInterface : new C4138y(iBinder);
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p314g.BinderC8474p
    /* renamed from: m */
    protected final boolean mo16056m(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw new NoSuchMethodError();
    }
}
