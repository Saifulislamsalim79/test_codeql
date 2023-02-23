package p272h.p286c.p287a.p300b.p307d.p310c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: h.c.a.b.d.c.a */
/* loaded from: classes2.dex */
public class C8411a implements IInterface {

    /* renamed from: a */
    private final IBinder f20087a;

    /* renamed from: b */
    private final String f20088b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C8411a(IBinder iBinder, String str) {
        this.f20087a = iBinder;
        this.f20088b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f20087a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final Parcel m16124m() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f20088b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final void m16123n(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f20087a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final void m16122o(int i, Parcel parcel) throws RemoteException {
        try {
            this.f20087a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
