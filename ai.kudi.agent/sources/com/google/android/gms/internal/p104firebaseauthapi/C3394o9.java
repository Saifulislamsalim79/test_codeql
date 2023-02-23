package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.o9 */
/* loaded from: classes2.dex */
public final class C3394o9 extends AbstractC3251ip<C3394o9, C3368n9> implements InterfaceC3010a0 {
    private static final C3394o9 zzb;
    private C3472r9 zze;
    private int zzf;
    private int zzg;

    static {
        C3394o9 c3394o9 = new C3394o9();
        zzb = c3394o9;
        AbstractC3251ip.m30951g(C3394o9.class, c3394o9);
    }

    private C3394o9() {
    }

    /* renamed from: A */
    public static C3368n9 m30506A() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public static C3394o9 m30504C() {
        return zzb;
    }

    /* renamed from: D */
    public static C3394o9 m30503D(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3394o9) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
    }

    /* renamed from: F */
    public static /* synthetic */ void m30501F(C3394o9 c3394o9, C3472r9 c3472r9) {
        c3472r9.getClass();
        c3394o9.zze = c3472r9;
    }

    /* renamed from: E */
    public final C3472r9 m30502E() {
        C3472r9 c3472r9 = this.zze;
        return c3472r9 == null ? C3472r9.m30385D() : c3472r9;
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
                    return new C3368n9(null);
                }
                return new C3394o9();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m30499z() {
        return this.zzf;
    }
}
