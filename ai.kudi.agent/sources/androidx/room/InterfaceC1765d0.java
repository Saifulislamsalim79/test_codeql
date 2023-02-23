package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: IMultiInstanceInvalidationCallback.java */
/* renamed from: androidx.room.d0 */
/* loaded from: classes2.dex */
public interface InterfaceC1765d0 extends IInterface {

    /* compiled from: IMultiInstanceInvalidationCallback.java */
    /* renamed from: androidx.room.d0$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC1766a extends Binder implements InterfaceC1765d0 {

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IMultiInstanceInvalidationCallback.java */
        /* renamed from: androidx.room.d0$a$a */
        /* loaded from: classes2.dex */
        public static class C1767a implements InterfaceC1765d0 {

            /* renamed from: b */
            public static InterfaceC1765d0 f5399b;

            /* renamed from: a */
            private IBinder f5400a;

            C1767a(IBinder iBinder) {
                this.f5400a = iBinder;
            }

            @Override // androidx.room.InterfaceC1765d0
            /* renamed from: D */
            public void mo34508D(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    if (this.f5400a.transact(1, obtain, null, 1) || AbstractBinderC1766a.m34546n() == null) {
                        return;
                    }
                    AbstractBinderC1766a.m34546n().mo34508D(strArr);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5400a;
            }
        }

        public AbstractBinderC1766a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: m */
        public static InterfaceC1765d0 m34547m(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC1765d0)) {
                return (InterfaceC1765d0) queryLocalInterface;
            }
            return new C1767a(iBinder);
        }

        /* renamed from: n */
        public static InterfaceC1765d0 m34546n() {
            return C1767a.f5399b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                mo34508D(parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
        }
    }

    /* renamed from: D */
    void mo34508D(String[] strArr) throws RemoteException;
}
