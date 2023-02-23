package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: com.google.android.play.core.internal.d0 */
/* loaded from: classes2.dex */
public class C4968d0 implements IInterface {

    /* renamed from: a */
    private final IBinder f12627a;

    /* renamed from: b */
    private final String f12628b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C4968d0(IBinder iBinder, String str) {
        this.f12627a = iBinder;
        this.f12628b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f12627a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final Parcel m25947m() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f12628b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final void m25946n(int i, Parcel parcel) throws RemoteException {
        try {
            this.f12627a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
