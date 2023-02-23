package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.id */
/* loaded from: classes2.dex */
public final class C3836id implements InterfaceC3820hd {

    /* renamed from: a */
    public static final AbstractC3892m6<Boolean> f9411a;

    /* renamed from: b */
    public static final AbstractC3892m6<Boolean> f9412b;

    static {
        C3845j6 c3845j6 = new C3845j6(C3736c6.m29716a("com.google.android.gms.measurement"));
        c3845j6.m29460c("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f9411a = c3845j6.m29458e("measurement.lifecycle.app_backgrounded_engagement", false);
        c3845j6.m29458e("measurement.lifecycle.app_backgrounded_tracking", true);
        f9412b = c3845j6.m29458e("measurement.lifecycle.app_in_background_parameter", false);
        c3845j6.m29460c("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3820hd
    public final boolean zza() {
        return f9411a.m29400b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3820hd
    public final boolean zzb() {
        return f9412b.m29400b().booleanValue();
    }
}
