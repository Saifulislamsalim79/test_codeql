package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p272h.p286c.p287a.p300b.p307d.p312e.C8423a;
import p272h.p286c.p287a.p300b.p307d.p312e.C8425c;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.x0 */
/* loaded from: classes2.dex */
public final class C2933x0 extends C8423a implements InterfaceC2893m {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2933x0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2893m
    /* renamed from: A0 */
    public final void mo31601A0(int i, IBinder iBinder, C2902o1 c2902o1) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2893m
    /* renamed from: P */
    public final void mo31600P(int i, Bundle bundle) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2893m
    /* renamed from: r0 */
    public final void mo31599r0(int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel m16113o = m16113o();
        m16113o.writeInt(i);
        m16113o.writeStrongBinder(iBinder);
        C8425c.m16109c(m16113o, bundle);
        m16114n(1, m16113o);
    }
}
