package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import p272h.p286c.p287a.p300b.p307d.p312e.BinderC8424b;
import p272h.p286c.p287a.p300b.p307d.p312e.C8425c;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.y0 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2936y0 extends BinderC8424b implements InterfaceC2893m {
    public AbstractBinderC2936y0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p312e.BinderC8424b
    /* renamed from: m */
    protected final boolean mo16112m(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo31599r0(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C8425c.m16111a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            mo31600P(parcel.readInt(), (Bundle) C8425c.m16111a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo31601A0(parcel.readInt(), parcel.readStrongBinder(), (C2902o1) C8425c.m16111a(parcel, C2902o1.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
