package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.b7 */
/* loaded from: classes2.dex */
public final class C3044b7 extends AbstractC3251ip<C3044b7, C3017a7> implements InterfaceC3010a0 {
    private static final C3044b7 zzb;
    private int zze;

    static {
        C3044b7 c3044b7 = new C3044b7();
        zzb = c3044b7;
        AbstractC3251ip.m30951g(C3044b7.class, c3044b7);
    }

    private C3044b7() {
    }

    /* renamed from: A */
    public static C3017a7 m31408A() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public static C3044b7 m31406C() {
        return zzb;
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
                    return new C3017a7(null);
                }
                return new C3044b7();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m31404z() {
        return this.zze;
    }
}
