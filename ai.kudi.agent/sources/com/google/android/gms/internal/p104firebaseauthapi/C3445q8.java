package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.q8 */
/* loaded from: classes2.dex */
public final class C3445q8 extends AbstractC3251ip<C3445q8, C3419p8> implements InterfaceC3010a0 {
    private static final C3445q8 zzb;
    private C3549u8 zze;

    static {
        C3445q8 c3445q8 = new C3445q8();
        zzb = c3445q8;
        AbstractC3251ip.m30951g(C3445q8.class, c3445q8);
    }

    private C3445q8() {
    }

    /* renamed from: B */
    public static C3445q8 m30446B(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3445q8) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
    }

    /* renamed from: D */
    public static /* synthetic */ void m30444D(C3445q8 c3445q8, C3549u8 c3549u8) {
        c3549u8.getClass();
        c3445q8.zze = c3549u8;
    }

    /* renamed from: z */
    public static C3419p8 m30443z() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public final C3549u8 m30445C() {
        C3549u8 c3549u8 = this.zze;
        return c3549u8 == null ? C3549u8.m30182D() : c3549u8;
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
                    return new C3419p8(null);
                }
                return new C3445q8();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
