package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.sd */
/* loaded from: classes2.dex */
public final class C3993sd implements InterfaceC3977rd {

    /* renamed from: a */
    public static final AbstractC3892m6<Boolean> f9697a;

    /* renamed from: b */
    public static final AbstractC3892m6<Double> f9698b;

    /* renamed from: c */
    public static final AbstractC3892m6<Long> f9699c;

    /* renamed from: d */
    public static final AbstractC3892m6<Long> f9700d;

    /* renamed from: e */
    public static final AbstractC3892m6<String> f9701e;

    static {
        C3845j6 c3845j6 = new C3845j6(C3736c6.m29716a("com.google.android.gms.measurement"));
        f9697a = c3845j6.m29458e("measurement.test.boolean_flag", false);
        f9698b = c3845j6.m29461b("measurement.test.double_flag", -3.0d);
        f9699c = c3845j6.m29460c("measurement.test.int_flag", -2L);
        f9700d = c3845j6.m29460c("measurement.test.long_flag", -1L);
        f9701e = c3845j6.m29459d("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3977rd
    /* renamed from: a */
    public final boolean mo28934a() {
        return f9697a.m29400b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3977rd
    /* renamed from: c */
    public final long mo28933c() {
        return f9700d.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3977rd
    /* renamed from: d */
    public final String mo28932d() {
        return f9701e.m29400b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3977rd
    public final double zza() {
        return f9698b.m29400b().doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3977rd
    public final long zzb() {
        return f9699c.m29400b().longValue();
    }
}
