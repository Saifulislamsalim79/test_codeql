package p272h.p286c.p287a.p300b.p307d.p314g;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: h.c.a.b.d.g.p */
/* loaded from: classes2.dex */
public class BinderC8474p extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public BinderC8474p(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    /* renamed from: m */
    protected boolean mo16056m(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return mo16056m(i, parcel, parcel2, i2);
    }
}
