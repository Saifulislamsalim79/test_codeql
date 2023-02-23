package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.s */
/* loaded from: classes2.dex */
final class C2720s {

    /* renamed from: a */
    private final Messenger f7665a;

    /* renamed from: b */
    private final C2710i f7666b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2720s(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f7665a = new Messenger(iBinder);
            this.f7666b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f7666b = new C2710i(iBinder);
            this.f7665a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m32121a(Message message) throws RemoteException {
        Messenger messenger = this.f7665a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C2710i c2710i = this.f7666b;
        if (c2710i != null) {
            c2710i.m32129b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
