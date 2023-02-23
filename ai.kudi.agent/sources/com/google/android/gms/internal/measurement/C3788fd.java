package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.fd */
/* loaded from: classes2.dex */
public final class C3788fd implements InterfaceC3774ed {

    /* renamed from: a */
    public static final AbstractC3892m6<Boolean> f9359a;

    /* renamed from: b */
    public static final AbstractC3892m6<Boolean> f9360b;

    static {
        C3845j6 c3845j6 = new C3845j6(C3736c6.m29716a("com.google.android.gms.measurement"));
        f9359a = c3845j6.m29458e("measurement.sdk.collection.enable_extend_user_property_size", true);
        c3845j6.m29458e("measurement.sdk.collection.last_deep_link_referrer2", true);
        f9360b = c3845j6.m29458e("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        c3845j6.m29460c("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3774ed
    public final boolean zza() {
        return f9359a.m29400b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3774ed
    public final boolean zzb() {
        return f9360b.m29400b().booleanValue();
    }
}
