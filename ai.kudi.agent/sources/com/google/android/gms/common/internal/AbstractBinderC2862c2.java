package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC2987a;
import p272h.p286c.p287a.p300b.p307d.p312e.BinderC8424b;
import p272h.p286c.p287a.p300b.p307d.p312e.C8425c;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.c2 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2862c2 extends BinderC8424b implements InterfaceC2866d2 {
    public AbstractBinderC2862c2() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: n */
    public static InterfaceC2866d2 m31766n(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof InterfaceC2866d2 ? (InterfaceC2866d2) queryLocalInterface : new C2853b2(iBinder);
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p312e.BinderC8424b
    /* renamed from: m */
    protected final boolean mo16112m(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            InterfaceC2987a mo31500d = mo31500d();
            parcel2.writeNoException();
            C8425c.m16108d(parcel2, mo31500d);
        } else if (i != 2) {
            return false;
        } else {
            int mo31501c = mo31501c();
            parcel2.writeNoException();
            parcel2.writeInt(mo31501c);
        }
        return true;
    }
}
