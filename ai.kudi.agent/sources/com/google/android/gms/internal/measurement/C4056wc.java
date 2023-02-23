package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.wc */
/* loaded from: classes2.dex */
public final class C4056wc implements InterfaceC4040vc {

    /* renamed from: a */
    public static final AbstractC3892m6<Boolean> f9827a;

    static {
        C3845j6 c3845j6 = new C3845j6(C3736c6.m29716a("com.google.android.gms.measurement"));
        c3845j6.m29458e("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f9827a = c3845j6.m29458e("measurement.collection.redundant_engagement_removal_enabled", false);
        c3845j6.m29460c("measurement.id.collection.redundant_engagement_removal_enabled", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4040vc
    public final boolean zza() {
        return f9827a.m29400b().booleanValue();
    }
}
