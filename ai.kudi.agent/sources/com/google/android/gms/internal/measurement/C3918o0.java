package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.o0 */
/* loaded from: classes2.dex */
public class C3918o0 implements IInterface {

    /* renamed from: a */
    private final IBinder f9581a;

    /* renamed from: b */
    private final String f9582b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C3918o0(IBinder iBinder, String str) {
        this.f9581a = iBinder;
        this.f9582b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9581a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final Parcel m29321m() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9582b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final Parcel m29320n(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f9581a.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final void m29319o(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f9581a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
