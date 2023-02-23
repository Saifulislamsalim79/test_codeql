package p272h.p286c.p287a.p300b.p307d.p309b;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
/* renamed from: h.c.a.b.d.b.g */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC8405g extends BinderC8399a implements InterfaceC8406h {
    public AbstractBinderC8405g() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p309b.BinderC8399a
    /* renamed from: m */
    protected final boolean mo16129m(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo16125M0((Status) C8402d.m16132a(parcel, Status.CREATOR));
            return true;
        }
        return false;
    }
}
