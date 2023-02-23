package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.jc */
/* loaded from: classes2.dex */
public final class C3851jc implements InterfaceC3835ic {

    /* renamed from: a */
    public static final AbstractC3892m6<Boolean> f9445a = new C3845j6(C3736c6.m29716a("com.google.android.gms.measurement")).m29458e("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.google.android.gms.internal.measurement.InterfaceC3835ic
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3835ic
    public final boolean zzb() {
        return f9445a.m29400b().booleanValue();
    }
}
