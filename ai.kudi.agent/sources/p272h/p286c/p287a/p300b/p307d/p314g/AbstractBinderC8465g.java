package p272h.p286c.p287a.p300b.p307d.p314g;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.C4117e;
/* renamed from: h.c.a.b.d.g.g */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC8465g extends BinderC8474p implements InterfaceC8464f {
    public AbstractBinderC8465g() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p314g.BinderC8474p
    /* renamed from: m */
    protected final boolean mo16056m(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo16055Y((C4117e) C8483y.m16047a(parcel, C4117e.CREATOR));
            return true;
        }
        return false;
    }
}
