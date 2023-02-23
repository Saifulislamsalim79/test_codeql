package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.r6 */
/* loaded from: classes2.dex */
public final class C3469r6 extends AbstractC3251ip<C3469r6, C3443q6> implements InterfaceC3010a0 {
    private static final C3469r6 zzb;
    private C3651y6 zze;
    private C3394o9 zzf;

    static {
        C3469r6 c3469r6 = new C3469r6();
        zzb = c3469r6;
        AbstractC3251ip.m30951g(C3469r6.class, c3469r6);
    }

    private C3469r6() {
    }

    /* renamed from: B */
    public static C3469r6 m30394B(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3469r6) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
    }

    /* renamed from: E */
    public static /* synthetic */ void m30391E(C3469r6 c3469r6, C3651y6 c3651y6) {
        c3651y6.getClass();
        c3469r6.zze = c3651y6;
    }

    /* renamed from: F */
    public static /* synthetic */ void m30390F(C3469r6 c3469r6, C3394o9 c3394o9) {
        c3394o9.getClass();
        c3469r6.zzf = c3394o9;
    }

    /* renamed from: z */
    public static C3443q6 m30389z() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public final C3651y6 m30393C() {
        C3651y6 c3651y6 = this.zze;
        return c3651y6 == null ? C3651y6.m29969C() : c3651y6;
    }

    /* renamed from: D */
    public final C3394o9 m30392D() {
        C3394o9 c3394o9 = this.zzf;
        return c3394o9 == null ? C3394o9.m30504C() : c3394o9;
    }

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
                    return new C3443q6(null);
                }
                return new C3469r6();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
