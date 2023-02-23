package p272h.p286c.p287a.p300b.p307d.p314g;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.C4112c;
/* renamed from: h.c.a.b.d.g.e */
/* loaded from: classes2.dex */
public final class C8462e extends C8454a implements InterfaceC8460d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C8462e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p314g.InterfaceC8460d
    /* renamed from: Q0 */
    public final void mo16070Q0(boolean z) throws RemoteException {
        Parcel m16074m = m16074m();
        C8483y.m16044d(m16074m, z);
        m16072o(12, m16074m);
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p314g.InterfaceC8460d
    /* renamed from: W0 */
    public final void mo16069W0(C8478t c8478t) throws RemoteException {
        Parcel m16074m = m16074m();
        C8483y.m16045c(m16074m, c8478t);
        m16072o(59, m16074m);
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p314g.InterfaceC8460d
    /* renamed from: e */
    public final Location mo16068e(String str) throws RemoteException {
        Parcel m16074m = m16074m();
        m16074m.writeString(str);
        Parcel m16073n = m16073n(21, m16074m);
        Location location = (Location) C8483y.m16047a(m16073n, Location.CREATOR);
        m16073n.recycle();
        return location;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p314g.InterfaceC8460d
    /* renamed from: m1 */
    public final void mo16067m1(C4112c c4112c, InterfaceC8464f interfaceC8464f, String str) throws RemoteException {
        Parcel m16074m = m16074m();
        C8483y.m16045c(m16074m, c4112c);
        C8483y.m16046b(m16074m, interfaceC8464f);
        m16074m.writeString(str);
        m16072o(63, m16074m);
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p314g.InterfaceC8460d
    /* renamed from: p0 */
    public final void mo16066p0(C8461d0 c8461d0) throws RemoteException {
        Parcel m16074m = m16074m();
        C8483y.m16045c(m16074m, c8461d0);
        m16072o(75, m16074m);
    }
}
