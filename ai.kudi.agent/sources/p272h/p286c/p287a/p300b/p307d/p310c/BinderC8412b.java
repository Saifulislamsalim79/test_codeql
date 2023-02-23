package p272h.p286c.p287a.p300b.p307d.p310c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: h.c.a.b.d.c.b */
/* loaded from: classes2.dex */
public class BinderC8412b extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public BinderC8412b(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return mo15464p1(i, parcel, parcel2, i2);
    }

    /* renamed from: p1 */
    protected boolean mo15464p1(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }
}
