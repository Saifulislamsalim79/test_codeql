package p272h.p286c.p287a.p300b.p307d.p309b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
/* renamed from: h.c.a.b.d.b.c */
/* loaded from: classes2.dex */
public class C8401c implements IInterface {

    /* renamed from: a */
    private final IBinder f20083a;

    /* renamed from: b */
    private final String f20084b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C8401c(IBinder iBinder, String str) {
        this.f20083a = iBinder;
        this.f20084b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f20083a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final Parcel m16134m() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f20084b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final void m16133n(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f20083a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
