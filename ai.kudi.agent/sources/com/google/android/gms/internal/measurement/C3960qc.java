package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.qc */
/* loaded from: classes2.dex */
public final class C3960qc implements InterfaceC3945pc {

    /* renamed from: a */
    public static final AbstractC3892m6<Boolean> f9634a;

    /* renamed from: b */
    public static final AbstractC3892m6<Boolean> f9635b;

    /* renamed from: c */
    public static final AbstractC3892m6<Boolean> f9636c;

    static {
        C3845j6 c3845j6 = new C3845j6(C3736c6.m29716a("com.google.android.gms.measurement"));
        c3845j6.m29458e("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f9634a = c3845j6.m29458e("measurement.audience.refresh_event_count_filters_timestamp", false);
        f9635b = c3845j6.m29458e("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f9636c = c3845j6.m29458e("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3945pc
    /* renamed from: c */
    public final boolean mo29077c() {
        return f9635b.m29400b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3945pc
    /* renamed from: d */
    public final boolean mo29076d() {
        return f9636c.m29400b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3945pc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3945pc
    public final boolean zzb() {
        return f9634a.m29400b().booleanValue();
    }
}
