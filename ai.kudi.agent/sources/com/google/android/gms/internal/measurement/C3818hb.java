package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.hb */
/* loaded from: classes2.dex */
public final class C3818hb implements InterfaceC3802gb {

    /* renamed from: a */
    public static final AbstractC3892m6<Boolean> f9393a;

    /* renamed from: b */
    public static final AbstractC3892m6<Boolean> f9394b;

    /* renamed from: c */
    public static final AbstractC3892m6<Boolean> f9395c;

    /* renamed from: d */
    public static final AbstractC3892m6<Boolean> f9396d;

    /* renamed from: e */
    public static final AbstractC3892m6<Boolean> f9397e;

    static {
        C3845j6 m29462a = new C3845j6(C3736c6.m29716a("com.google.android.gms.measurement")).m29462a();
        f9393a = m29462a.m29458e("measurement.adid_zero.app_instance_id_fix", true);
        f9394b = m29462a.m29458e("measurement.adid_zero.service", false);
        f9395c = m29462a.m29458e("measurement.adid_zero.adid_uid", false);
        m29462a.m29460c("measurement.id.adid_zero.service", 0L);
        f9396d = m29462a.m29458e("measurement.adid_zero.remove_lair_if_adidzero_false", true);
        f9397e = m29462a.m29458e("measurement.adid_zero.remove_lair_if_userid_cleared", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3802gb
    /* renamed from: a */
    public final boolean mo29546a() {
        return f9396d.m29400b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3802gb
    /* renamed from: c */
    public final boolean mo29545c() {
        return f9394b.m29400b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3802gb
    /* renamed from: d */
    public final boolean mo29544d() {
        return f9395c.m29400b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3802gb
    /* renamed from: j */
    public final boolean mo29543j() {
        return f9397e.m29400b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3802gb
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3802gb
    public final boolean zzb() {
        return f9393a.m29400b().booleanValue();
    }
}
