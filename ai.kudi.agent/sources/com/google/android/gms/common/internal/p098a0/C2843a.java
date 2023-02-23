package com.google.android.gms.common.internal.p098a0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C2929w;
import p272h.p286c.p287a.p300b.p307d.p310c.C8411a;
import p272h.p286c.p287a.p300b.p307d.p310c.C8413c;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.a0.a */
/* loaded from: classes2.dex */
public final class C2843a extends C8411a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2843a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    /* renamed from: p1 */
    public final void m31818p1(C2929w c2929w) throws RemoteException {
        Parcel m16124m = m16124m();
        C8413c.m16120b(m16124m, c2929w);
        m16122o(1, m16124m);
    }
}
