package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.ke */
/* loaded from: classes2.dex */
public final class C3869ke implements InterfaceC3853je {

    /* renamed from: a */
    public static final AbstractC3892m6<Boolean> f9456a = new C3845j6(C3736c6.m29716a("com.google.android.gms.measurement")).m29458e("measurement.integration.disable_firebase_instance_id", false);

    @Override // com.google.android.gms.internal.measurement.InterfaceC3853je
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3853je
    public final boolean zzb() {
        return f9456a.m29400b().booleanValue();
    }
}
