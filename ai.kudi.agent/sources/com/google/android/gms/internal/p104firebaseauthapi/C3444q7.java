package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.q7 */
/* loaded from: classes2.dex */
public final class C3444q7 extends AbstractC3251ip<C3444q7, C3418p7> implements InterfaceC3010a0 {
    private static final C3444q7 zzb;
    private int zze;
    private int zzf;

    static {
        C3444q7 c3444q7 = new C3444q7();
        zzb = c3444q7;
        AbstractC3251ip.m30951g(C3444q7.class, c3444q7);
    }

    private C3444q7() {
    }

    /* renamed from: A */
    public static C3418p7 m30452A() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public static C3444q7 m30450C(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3444q7) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
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
                    return new C3418p7(null);
                }
                return new C3444q7();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m30448z() {
        return this.zze;
    }
}
