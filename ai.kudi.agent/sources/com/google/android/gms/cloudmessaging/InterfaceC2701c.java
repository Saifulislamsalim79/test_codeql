package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.c */
/* loaded from: classes2.dex */
interface InterfaceC2701c extends IInterface {

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    /* renamed from: com.google.android.gms.cloudmessaging.c$a */
    /* loaded from: classes2.dex */
    public static class C2702a implements InterfaceC2701c {

        /* renamed from: a */
        private final IBinder f7629a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C2702a(IBinder iBinder) {
            this.f7629a = iBinder;
        }

        @Override // com.google.android.gms.cloudmessaging.InterfaceC2701c
        /* renamed from: B */
        public void mo32141B(Message message) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.f7629a.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f7629a;
        }
    }

    /* renamed from: B */
    void mo32141B(Message message) throws RemoteException;
}
