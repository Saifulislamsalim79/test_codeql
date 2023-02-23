package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC2987a;
import p272h.p286c.p287a.p300b.p307d.p312e.C8423a;
import p272h.p286c.p287a.p300b.p307d.p312e.C8425c;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.dynamite.o */
/* loaded from: classes2.dex */
public final class C3008o extends C8423a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3008o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: p1 */
    public final InterfaceC2987a m31469p1(InterfaceC2987a interfaceC2987a, String str, int i, InterfaceC2987a interfaceC2987a2) throws RemoteException {
        Parcel m16113o = m16113o();
        C8425c.m16108d(m16113o, interfaceC2987a);
        m16113o.writeString(str);
        m16113o.writeInt(i);
        C8425c.m16108d(m16113o, interfaceC2987a2);
        Parcel m16115m = m16115m(2, m16113o);
        InterfaceC2987a m31496n = InterfaceC2987a.AbstractBinderC2988a.m31496n(m16115m.readStrongBinder());
        m16115m.recycle();
        return m31496n;
    }

    /* renamed from: q1 */
    public final InterfaceC2987a m31468q1(InterfaceC2987a interfaceC2987a, String str, int i, InterfaceC2987a interfaceC2987a2) throws RemoteException {
        Parcel m16113o = m16113o();
        C8425c.m16108d(m16113o, interfaceC2987a);
        m16113o.writeString(str);
        m16113o.writeInt(i);
        C8425c.m16108d(m16113o, interfaceC2987a2);
        Parcel m16115m = m16115m(3, m16113o);
        InterfaceC2987a m31496n = InterfaceC2987a.AbstractBinderC2988a.m31496n(m16115m.readStrongBinder());
        m16115m.recycle();
        return m31496n;
    }
}
