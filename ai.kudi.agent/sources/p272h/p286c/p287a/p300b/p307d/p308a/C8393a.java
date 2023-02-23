package p272h.p286c.p287a.p300b.p307d.p308a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: h.c.a.b.d.a.a */
/* loaded from: classes2.dex */
public class C8393a implements IInterface {

    /* renamed from: a */
    private final IBinder f20077a;

    /* renamed from: b */
    private final String f20078b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C8393a(IBinder iBinder, String str) {
        this.f20077a = iBinder;
        this.f20078b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f20077a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final Parcel m16141m() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f20078b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final Parcel m16140n(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f20077a.transact(i, parcel, obtain, 0);
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
}
