package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.mc */
/* loaded from: classes2.dex */
public final class C3898mc implements InterfaceC3883lc {

    /* renamed from: a */
    public static final AbstractC3892m6<Boolean> f9495a;

    /* renamed from: b */
    public static final AbstractC3892m6<Boolean> f9496b;

    static {
        C3845j6 c3845j6 = new C3845j6(C3736c6.m29716a("com.google.android.gms.measurement"));
        f9495a = c3845j6.m29458e("measurement.client.consent.suppress_1p_in_ga4f_install", true);
        f9496b = c3845j6.m29458e("measurement.client.consent.gmpappid_worker_thread_fix", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3883lc
    /* renamed from: c */
    public final boolean mo29380c() {
        return f9496b.m29400b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3883lc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3883lc
    public final boolean zzb() {
        return f9495a.m29400b().booleanValue();
    }
}
