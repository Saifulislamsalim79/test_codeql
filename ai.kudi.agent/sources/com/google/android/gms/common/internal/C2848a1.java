package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.C2829c0;
import com.google.android.gms.common.C2835f0;
import com.google.android.gms.common.C2839h0;
import com.google.android.gms.dynamic.InterfaceC2987a;
import p272h.p286c.p287a.p300b.p307d.p312e.C8423a;
import p272h.p286c.p287a.p300b.p307d.p312e.C8425c;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.a1 */
/* loaded from: classes2.dex */
public final class C2848a1 extends C8423a implements InterfaceC2861c1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2848a1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2861c1
    /* renamed from: f */
    public final boolean mo31769f() throws RemoteException {
        Parcel m16115m = m16115m(7, m16113o());
        boolean m16107e = C8425c.m16107e(m16115m);
        m16115m.recycle();
        return m16107e;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2861c1
    /* renamed from: g0 */
    public final boolean mo31768g0(C2839h0 c2839h0, InterfaceC2987a interfaceC2987a) throws RemoteException {
        Parcel m16113o = m16113o();
        C8425c.m16109c(m16113o, c2839h0);
        C8425c.m16108d(m16113o, interfaceC2987a);
        Parcel m16115m = m16115m(5, m16113o);
        boolean m16107e = C8425c.m16107e(m16115m);
        m16115m.recycle();
        return m16107e;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2861c1
    /* renamed from: n0 */
    public final C2835f0 mo31767n0(C2829c0 c2829c0) throws RemoteException {
        Parcel m16113o = m16113o();
        C8425c.m16109c(m16113o, c2829c0);
        Parcel m16115m = m16115m(6, m16113o);
        C2835f0 c2835f0 = (C2835f0) C8425c.m16111a(m16115m, C2835f0.CREATOR);
        m16115m.recycle();
        return c2835f0;
    }
}
