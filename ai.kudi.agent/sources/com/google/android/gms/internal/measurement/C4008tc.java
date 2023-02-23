package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.tc */
/* loaded from: classes2.dex */
public final class C4008tc implements InterfaceC3992sc {

    /* renamed from: a */
    public static final AbstractC3892m6<Boolean> f9715a;

    static {
        C3845j6 c3845j6 = new C3845j6(C3736c6.m29716a("com.google.android.gms.measurement"));
        f9715a = c3845j6.m29458e("measurement.client.sessions.check_on_reset_and_enable2", true);
        c3845j6.m29458e("measurement.client.sessions.check_on_startup", true);
        c3845j6.m29458e("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3992sc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3992sc
    public final boolean zzb() {
        return f9715a.m29400b().booleanValue();
    }
}
