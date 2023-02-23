package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC2987a;
import p272h.p286c.p287a.p300b.p307d.p312e.C8423a;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.b2 */
/* loaded from: classes2.dex */
public final class C2853b2 extends C8423a implements InterfaceC2866d2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2853b2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2866d2
    /* renamed from: c */
    public final int mo31501c() throws RemoteException {
        Parcel m16115m = m16115m(2, m16113o());
        int readInt = m16115m.readInt();
        m16115m.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2866d2
    /* renamed from: d */
    public final InterfaceC2987a mo31500d() throws RemoteException {
        Parcel m16115m = m16115m(1, m16113o());
        InterfaceC2987a m31496n = InterfaceC2987a.AbstractBinderC2988a.m31496n(m16115m.readStrongBinder());
        m16115m.recycle();
        return m31496n;
    }
}
