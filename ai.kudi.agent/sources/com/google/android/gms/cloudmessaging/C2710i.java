package com.google.android.gms.cloudmessaging;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.cloudmessaging.InterfaceC2701c;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.i */
/* loaded from: classes2.dex */
public final class C2710i implements Parcelable {
    public static final Parcelable.Creator<C2710i> CREATOR = new C2708g();

    /* renamed from: c */
    Messenger f7644c;

    /* renamed from: d */
    InterfaceC2701c f7645d;

    public C2710i(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f7644c = new Messenger(iBinder);
        } else {
            this.f7645d = new InterfaceC2701c.C2702a(iBinder);
        }
    }

    /* renamed from: a */
    public final IBinder m32130a() {
        Messenger messenger = this.f7644c;
        return messenger != null ? messenger.getBinder() : this.f7645d.asBinder();
    }

    /* renamed from: b */
    public final void m32129b(Message message) throws RemoteException {
        Messenger messenger = this.f7644c;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f7645d.mo32141B(message);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m32130a().equals(((C2710i) obj).m32130a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return m32130a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f7644c;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f7645d.asBinder());
        }
    }
}
