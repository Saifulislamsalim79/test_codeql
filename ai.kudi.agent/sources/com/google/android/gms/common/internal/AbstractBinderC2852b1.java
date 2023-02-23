package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import p272h.p286c.p287a.p300b.p307d.p312e.BinderC8424b;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.b1 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2852b1 extends BinderC8424b implements InterfaceC2861c1 {
    /* renamed from: n */
    public static InterfaceC2861c1 m31816n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof InterfaceC2861c1 ? (InterfaceC2861c1) queryLocalInterface : new C2848a1(iBinder);
    }
}
