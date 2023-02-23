package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.xb */
/* loaded from: classes2.dex */
public final class C4071xb implements InterfaceC4055wb {

    /* renamed from: a */
    public static final AbstractC3892m6<Long> f9850a;

    static {
        C3845j6 c3845j6 = new C3845j6(C3736c6.m29716a("com.google.android.gms.measurement"));
        c3845j6.m29458e("measurement.client.consent_state_v1", true);
        c3845j6.m29458e("measurement.client.3p_consent_state_v1", true);
        c3845j6.m29458e("measurement.service.consent_state_v1_W36", true);
        f9850a = c3845j6.m29460c("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4055wb
    public final long zza() {
        return f9850a.m29400b().longValue();
    }
}
