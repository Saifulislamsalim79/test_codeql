package p272h.p286c.p287a.p300b.p307d.p317j;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.a */
/* loaded from: classes2.dex */
public class C8821a implements IInterface {

    /* renamed from: a */
    private final IBinder f20775a;

    /* renamed from: b */
    private final String f20776b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C8821a(IBinder iBinder, String str) {
        this.f20775a = iBinder;
        this.f20776b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f20775a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final Parcel m15839m() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f20776b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final Parcel m15838n(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f20775a.transact(i, parcel, obtain, 0);
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
    public final void m15837o(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f20775a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
