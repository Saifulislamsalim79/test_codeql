package p272h.p286c.p287a.p300b.p307d.p314g;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: h.c.a.b.d.g.a */
/* loaded from: classes2.dex */
public class C8454a implements IInterface {

    /* renamed from: a */
    private final IBinder f20153a;

    /* renamed from: b */
    private final String f20154b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C8454a(IBinder iBinder, String str) {
        this.f20153a = iBinder;
        this.f20154b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f20153a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final Parcel m16074m() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f20154b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final Parcel m16073n(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f20153a.transact(i, parcel, obtain, 0);
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
    public final void m16072o(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f20153a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p1 */
    public final void m16071p1(int i, Parcel parcel) throws RemoteException {
        try {
            this.f20153a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
