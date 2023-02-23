package com.google.android.gms.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p272h.p286c.p287a.p300b.p307d.p314g.C8454a;
import p272h.p286c.p287a.p300b.p307d.p314g.C8483y;
/* renamed from: com.google.android.gms.location.b0 */
/* loaded from: classes2.dex */
public final class C4111b0 extends C8454a implements InterfaceC4139z {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4111b0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    @Override // com.google.android.gms.location.InterfaceC4139z
    /* renamed from: O0 */
    public final void mo16061O0(LocationResult locationResult) throws RemoteException {
        Parcel m16074m = m16074m();
        C8483y.m16045c(m16074m, locationResult);
        m16071p1(1, m16074m);
    }

    @Override // com.google.android.gms.location.InterfaceC4139z
    /* renamed from: s0 */
    public final void mo16060s0(LocationAvailability locationAvailability) throws RemoteException {
        Parcel m16074m = m16074m();
        C8483y.m16045c(m16074m, locationAvailability);
        m16071p1(2, m16074m);
    }
}
