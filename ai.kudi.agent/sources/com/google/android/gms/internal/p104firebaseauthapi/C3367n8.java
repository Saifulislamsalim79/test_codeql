package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.n8 */
/* loaded from: classes2.dex */
public final class C3367n8 extends AbstractC3251ip<C3367n8, C3341m8> implements InterfaceC3010a0 {
    private static final C3367n8 zzb;
    private C3020aa zze;

    static {
        C3367n8 c3367n8 = new C3367n8();
        zzb = c3367n8;
        AbstractC3251ip.m30951g(C3367n8.class, c3367n8);
    }

    private C3367n8() {
    }

    /* renamed from: B */
    public static C3367n8 m30577B() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static /* synthetic */ void m30575D(C3367n8 c3367n8, C3020aa c3020aa) {
        c3020aa.getClass();
        c3367n8.zze = c3020aa;
    }

    /* renamed from: z */
    public static C3341m8 m30574z() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public final C3020aa m30576C() {
        C3020aa c3020aa = this.zze;
        return c3020aa == null ? C3020aa.m31433B() : c3020aa;
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
                    return new C3341m8(null);
                }
                return new C3367n8();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
