package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.u7 */
/* loaded from: classes2.dex */
public final class C3548u7 extends AbstractC3251ip<C3548u7, C3496s7> implements InterfaceC3010a0 {
    private static final C3548u7 zzb;
    private int zze;
    private AbstractC3223ho zzf = AbstractC3223ho.f8571d;

    static {
        C3548u7 c3548u7 = new C3548u7();
        zzb = c3548u7;
        AbstractC3251ip.m30951g(C3548u7.class, c3548u7);
    }

    private C3548u7() {
    }

    /* renamed from: A */
    public static C3496s7 m30192A() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public static C3548u7 m30190C(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3548u7) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
    }

    /* renamed from: D */
    public final AbstractC3223ho m30189D() {
        return this.zzf;
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
                    return new C3496s7(null);
                }
                return new C3548u7();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m30186z() {
        return this.zze;
    }
}
