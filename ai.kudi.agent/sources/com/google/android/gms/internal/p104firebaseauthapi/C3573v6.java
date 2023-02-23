package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.v6 */
/* loaded from: classes2.dex */
public final class C3573v6 extends AbstractC3251ip<C3573v6, C3547u6> implements InterfaceC3010a0 {
    private static final C3573v6 zzb;
    private int zze;
    private C3044b7 zzf;
    private AbstractC3223ho zzg = AbstractC3223ho.f8571d;

    static {
        C3573v6 c3573v6 = new C3573v6();
        zzb = c3573v6;
        AbstractC3251ip.m30951g(C3573v6.class, c3573v6);
    }

    private C3573v6() {
    }

    /* renamed from: A */
    public static C3547u6 m30141A() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public static C3573v6 m30139C() {
        return zzb;
    }

    /* renamed from: D */
    public static C3573v6 m30138D(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3573v6) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static /* synthetic */ void m30134H(C3573v6 c3573v6, C3044b7 c3044b7) {
        c3044b7.getClass();
        c3573v6.zzf = c3044b7;
    }

    /* renamed from: E */
    public final C3044b7 m30137E() {
        C3044b7 c3044b7 = this.zzf;
        return c3044b7 == null ? C3044b7.m31406C() : c3044b7;
    }

    /* renamed from: F */
    public final AbstractC3223ho m30136F() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3251ip
    /* renamed from: j */
    public final Object mo29964j(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new C3547u6(null);
                }
                return new C3573v6();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m30132z() {
        return this.zze;
    }
}
