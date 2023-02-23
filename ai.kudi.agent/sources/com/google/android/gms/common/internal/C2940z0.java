package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.z0 */
/* loaded from: classes2.dex */
final class C2940z0 implements InterfaceC2896n {

    /* renamed from: a */
    private final IBinder f8108a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2940z0(IBinder iBinder) {
        this.f8108a = iBinder;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2896n
    /* renamed from: I */
    public final void mo25378I(InterfaceC2893m interfaceC2893m, C2877h c2877h) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(interfaceC2893m != null ? interfaceC2893m.asBinder() : null);
            if (c2877h != null) {
                obtain.writeInt(1);
                C2913r1.m31694a(c2877h, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f8108a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8108a;
    }
}
