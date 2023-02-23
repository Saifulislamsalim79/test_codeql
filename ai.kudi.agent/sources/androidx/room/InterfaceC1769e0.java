package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.InterfaceC1765d0;
/* compiled from: IMultiInstanceInvalidationService.java */
/* renamed from: androidx.room.e0 */
/* loaded from: classes2.dex */
public interface InterfaceC1769e0 extends IInterface {

    /* compiled from: IMultiInstanceInvalidationService.java */
    /* renamed from: androidx.room.e0$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC1770a extends Binder implements InterfaceC1769e0 {

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IMultiInstanceInvalidationService.java */
        /* renamed from: androidx.room.e0$a$a */
        /* loaded from: classes2.dex */
        public static class C1771a implements InterfaceC1769e0 {

            /* renamed from: b */
            public static InterfaceC1769e0 f5402b;

            /* renamed from: a */
            private IBinder f5403a;

            C1771a(IBinder iBinder) {
                this.f5403a = iBinder;
            }

            @Override // androidx.room.InterfaceC1769e0
            /* renamed from: N */
            public int mo34543N(InterfaceC1765d0 interfaceC1765d0, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(interfaceC1765d0 != null ? interfaceC1765d0.asBinder() : null);
                    obtain.writeString(str);
                    if (!this.f5403a.transact(1, obtain, obtain2, 0) && AbstractBinderC1770a.m34544n() != null) {
                        return AbstractBinderC1770a.m34544n().mo34543N(interfaceC1765d0, str);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5403a;
            }

            @Override // androidx.room.InterfaceC1769e0
            /* renamed from: j1 */
            public void mo34542j1(int i, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    if (this.f5403a.transact(3, obtain, null, 1) || AbstractBinderC1770a.m34544n() == null) {
                        return;
                    }
                    AbstractBinderC1770a.m34544n().mo34542j1(i, strArr);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.room.InterfaceC1769e0
            /* renamed from: l1 */
            public void mo34541l1(InterfaceC1765d0 interfaceC1765d0, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(interfaceC1765d0 != null ? interfaceC1765d0.asBinder() : null);
                    obtain.writeInt(i);
                    if (!this.f5403a.transact(2, obtain, obtain2, 0) && AbstractBinderC1770a.m34544n() != null) {
                        AbstractBinderC1770a.m34544n().mo34541l1(interfaceC1765d0, i);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC1770a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        /* renamed from: m */
        public static InterfaceC1769e0 m34545m(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC1769e0)) {
                return (InterfaceC1769e0) queryLocalInterface;
            }
            return new C1771a(iBinder);
        }

        /* renamed from: n */
        public static InterfaceC1769e0 m34544n() {
            return C1771a.f5402b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int mo34543N = mo34543N(InterfaceC1765d0.AbstractBinderC1766a.m34547m(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(mo34543N);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                mo34541l1(InterfaceC1765d0.AbstractBinderC1766a.m34547m(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                mo34542j1(parcel.readInt(), parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
        }
    }

    /* renamed from: N */
    int mo34543N(InterfaceC1765d0 interfaceC1765d0, String str) throws RemoteException;

    /* renamed from: j1 */
    void mo34542j1(int i, String[] strArr) throws RemoteException;

    /* renamed from: l1 */
    void mo34541l1(InterfaceC1765d0 interfaceC1765d0, int i) throws RemoteException;
}
