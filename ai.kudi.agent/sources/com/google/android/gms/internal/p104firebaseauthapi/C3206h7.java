package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.h7 */
/* loaded from: classes2.dex */
public final class C3206h7 extends AbstractC3251ip<C3206h7, C3179g7> implements InterfaceC3010a0 {
    private static final C3206h7 zzb;
    private C3287k7 zze;
    private int zzf;

    static {
        C3206h7 c3206h7 = new C3206h7();
        zzb = c3206h7;
        AbstractC3251ip.m30951g(C3206h7.class, c3206h7);
    }

    private C3206h7() {
    }

    /* renamed from: A */
    public static C3179g7 m31081A() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public static C3206h7 m31079C(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3206h7) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
    }

    /* renamed from: E */
    public static /* synthetic */ void m31077E(C3206h7 c3206h7, C3287k7 c3287k7) {
        c3287k7.getClass();
        c3206h7.zze = c3287k7;
    }

    /* renamed from: D */
    public final C3287k7 m31078D() {
        C3287k7 c3287k7 = this.zze;
        return c3287k7 == null ? C3287k7.m30853C() : c3287k7;
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
                    return new C3179g7(null);
                }
                return new C3206h7();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m31075z() {
        return this.zzf;
    }
}
