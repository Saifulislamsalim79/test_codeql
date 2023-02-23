package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p272h.p286c.p287a.p300b.p307d.p314g.BinderC8474p;
import p272h.p286c.p287a.p300b.p307d.p314g.C8483y;
/* renamed from: com.google.android.gms.location.d0 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4116d0 extends BinderC8474p implements InterfaceC4114c0 {
    /* renamed from: n */
    public static InterfaceC4114c0 m28498n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof InterfaceC4114c0 ? (InterfaceC4114c0) queryLocalInterface : new C4118e0(iBinder);
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p314g.BinderC8474p
    /* renamed from: m */
    protected final boolean mo16056m(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo16059h1((Location) C8483y.m16047a(parcel, Location.CREATOR));
            return true;
        }
        return false;
    }
}
