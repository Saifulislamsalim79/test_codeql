package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.s0 */
/* loaded from: classes2.dex */
public abstract class AbstractC3980s0 extends p0 implements InterfaceC3996t0 {
    /* renamed from: n */
    public static InterfaceC3996t0 m28986n(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof InterfaceC3996t0 ? (InterfaceC3996t0) queryLocalInterface : new C3964r0(iBinder);
    }
}
