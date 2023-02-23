package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.a */
/* loaded from: classes2.dex */
public class C3009a implements IInterface {

    /* renamed from: a */
    private final IBinder f8181a;

    /* renamed from: b */
    private final String f8182b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C3009a(IBinder iBinder, String str) {
        this.f8181a = iBinder;
        this.f8182b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8181a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final void m31467m(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f8181a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final void m31466n(int i, Parcel parcel) throws RemoteException {
        try {
            this.f8181a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final Parcel m31465o() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f8182b);
        return obtain;
    }
}
