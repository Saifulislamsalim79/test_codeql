package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.vd */
/* loaded from: classes2.dex */
public final class C4041vd implements InterfaceC4025ud {

    /* renamed from: a */
    public static final AbstractC3892m6<Boolean> f9801a;

    /* renamed from: b */
    public static final AbstractC3892m6<Boolean> f9802b;

    static {
        C3845j6 c3845j6 = new C3845j6(C3736c6.m29716a("com.google.android.gms.measurement"));
        f9801a = c3845j6.m29458e("measurement.module.pixie.ees", true);
        f9802b = c3845j6.m29458e("measurement.module.pixie.fix_array", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4025ud
    /* renamed from: c */
    public final boolean mo28734c() {
        return f9802b.m29400b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4025ud
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4025ud
    public final boolean zzb() {
        return f9801a.m29400b().booleanValue();
    }
}
