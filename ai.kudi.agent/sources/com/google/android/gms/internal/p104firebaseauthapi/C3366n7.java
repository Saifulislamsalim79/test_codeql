package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.n7 */
/* loaded from: classes2.dex */
public final class C3366n7 extends AbstractC3251ip<C3366n7, C3340m7> implements InterfaceC3010a0 {
    private static final C3366n7 zzb;
    private int zze;
    private AbstractC3223ho zzf = AbstractC3223ho.f8571d;

    static {
        C3366n7 c3366n7 = new C3366n7();
        zzb = c3366n7;
        AbstractC3251ip.m30951g(C3366n7.class, c3366n7);
    }

    private C3366n7() {
    }

    /* renamed from: A */
    public static C3340m7 m30585A() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public static C3366n7 m30583C(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3366n7) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
    }

    /* renamed from: D */
    public final AbstractC3223ho m30582D() {
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
                    return new C3340m7(null);
                }
                return new C3366n7();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m30579z() {
        return this.zze;
    }
}
