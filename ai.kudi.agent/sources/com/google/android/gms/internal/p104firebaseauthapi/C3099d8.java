package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.d8 */
/* loaded from: classes2.dex */
public final class C3099d8 extends AbstractC3251ip<C3099d8, C3072c8> implements InterfaceC3010a0 {
    private static final C3099d8 zzb;
    private int zze;
    private int zzf;

    static {
        C3099d8 c3099d8 = new C3099d8();
        zzb = c3099d8;
        AbstractC3251ip.m30951g(C3099d8.class, c3099d8);
    }

    private C3099d8() {
    }

    /* renamed from: A */
    public static C3072c8 m31265A() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public static C3099d8 m31263C(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3099d8) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
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
                    return new C3072c8(null);
                }
                return new C3099d8();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m31261z() {
        return this.zze;
    }
}
