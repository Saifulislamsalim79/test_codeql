package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p272h.p286c.p287a.p300b.p307d.p314g.C8454a;
import p272h.p286c.p287a.p300b.p307d.p314g.C8483y;
/* renamed from: com.google.android.gms.location.e0 */
/* loaded from: classes2.dex */
public final class C4118e0 extends C8454a implements InterfaceC4114c0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4118e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    @Override // com.google.android.gms.location.InterfaceC4114c0
    /* renamed from: h1 */
    public final void mo16059h1(Location location) throws RemoteException {
        Parcel m16074m = m16074m();
        C8483y.m16045c(m16074m, location);
        m16071p1(1, m16074m);
    }
}
