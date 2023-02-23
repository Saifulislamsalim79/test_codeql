package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.kb */
/* loaded from: classes2.dex */
public final class C3866kb implements InterfaceC3850jb {

    /* renamed from: a */
    public static final AbstractC3892m6<Boolean> f9453a;

    static {
        C3845j6 c3845j6 = new C3845j6(C3736c6.m29716a("com.google.android.gms.measurement"));
        f9453a = c3845j6.m29458e("measurement.androidId.delete_feature", true);
        c3845j6.m29458e("measurement.log_androidId_enabled", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3850jb
    public final boolean zza() {
        return f9453a.m29400b().booleanValue();
    }
}
