package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.ld */
/* loaded from: classes2.dex */
public final class C3884ld implements InterfaceC3868kd {

    /* renamed from: a */
    public static final AbstractC3892m6<Boolean> f9466a;

    static {
        C3845j6 c3845j6 = new C3845j6(C3736c6.m29716a("com.google.android.gms.measurement"));
        f9466a = c3845j6.m29458e("measurement.validation.internal_limits_internal_event_params", false);
        c3845j6.m29460c("measurement.id.validation.internal_limits_internal_event_params", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3868kd
    public final boolean zza() {
        return f9466a.m29400b().booleanValue();
    }
}
