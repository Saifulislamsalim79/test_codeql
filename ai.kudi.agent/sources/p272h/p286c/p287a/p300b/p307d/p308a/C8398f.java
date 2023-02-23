package p272h.p286c.p287a.p300b.p307d.p308a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: h.c.a.b.d.a.f */
/* loaded from: classes2.dex */
public final class C8398f extends C8393a implements InterfaceC8396d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C8398f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p308a.InterfaceC8396d
    /* renamed from: U */
    public final boolean mo16136U(boolean z) throws RemoteException {
        Parcel m16141m = m16141m();
        C8395c.m16139a(m16141m, true);
        Parcel m16140n = m16140n(2, m16141m);
        boolean m16138b = C8395c.m16138b(m16140n);
        m16140n.recycle();
        return m16138b;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p308a.InterfaceC8396d
    /* renamed from: h */
    public final String mo16135h() throws RemoteException {
        Parcel m16140n = m16140n(1, m16141m());
        String readString = m16140n.readString();
        m16140n.recycle();
        return readString;
    }
}
