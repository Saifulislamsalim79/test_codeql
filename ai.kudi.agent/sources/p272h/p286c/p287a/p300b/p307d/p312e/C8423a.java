package p272h.p286c.p287a.p300b.p307d.p312e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: h.c.a.b.d.e.a */
/* loaded from: classes2.dex */
public class C8423a implements IInterface {

    /* renamed from: a */
    private final IBinder f20095a;

    /* renamed from: b */
    private final String f20096b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C8423a(IBinder iBinder, String str) {
        this.f20095a = iBinder;
        this.f20096b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f20095a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final Parcel m16115m(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f20095a.transact(i, parcel, obtain, 0);
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
    /* renamed from: n */
    public final void m16114n(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f20095a.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final Parcel m16113o() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f20096b);
        return obtain;
    }
}
