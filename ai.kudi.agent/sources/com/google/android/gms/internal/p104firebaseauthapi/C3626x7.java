package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.x7 */
/* loaded from: classes2.dex */
public final class C3626x7 extends AbstractC3251ip<C3626x7, C3600w7> implements InterfaceC3010a0 {
    private static final C3626x7 zzb;
    private int zze;
    private int zzf;

    static {
        C3626x7 c3626x7 = new C3626x7();
        zzb = c3626x7;
        AbstractC3251ip.m30951g(C3626x7.class, c3626x7);
    }

    private C3626x7() {
    }

    /* renamed from: A */
    public static C3600w7 m30054A() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public static C3626x7 m30052C(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3626x7) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
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
                    return new C3600w7(null);
                }
                return new C3626x7();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m30050z() {
        return this.zze;
    }
}
