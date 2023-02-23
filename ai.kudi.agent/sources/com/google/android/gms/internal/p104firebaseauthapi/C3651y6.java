package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.y6 */
/* loaded from: classes2.dex */
public final class C3651y6 extends AbstractC3251ip<C3651y6, C3625x6> implements InterfaceC3010a0 {
    private static final C3651y6 zzb;
    private C3044b7 zze;
    private int zzf;

    static {
        C3651y6 c3651y6 = new C3651y6();
        zzb = c3651y6;
        AbstractC3251ip.m30951g(C3651y6.class, c3651y6);
    }

    private C3651y6() {
    }

    /* renamed from: A */
    public static C3625x6 m29971A() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public static C3651y6 m29969C() {
        return zzb;
    }

    /* renamed from: D */
    public static C3651y6 m29968D(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3651y6) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
    }

    /* renamed from: F */
    public static /* synthetic */ void m29966F(C3651y6 c3651y6, C3044b7 c3044b7) {
        c3044b7.getClass();
        c3651y6.zze = c3044b7;
    }

    /* renamed from: E */
    public final C3044b7 m29967E() {
        C3044b7 c3044b7 = this.zze;
        return c3044b7 == null ? C3044b7.m31406C() : c3044b7;
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
                    return new C3625x6(null);
                }
                return new C3651y6();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m29963z() {
        return this.zzf;
    }
}
