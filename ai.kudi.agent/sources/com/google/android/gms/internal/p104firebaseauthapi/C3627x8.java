package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.x8 */
/* loaded from: classes2.dex */
public final class C3627x8 extends AbstractC3251ip<C3627x8, C3601w8> implements InterfaceC3010a0 {
    private static final C3627x8 zzb;
    private int zze;
    private C3019a9 zzf;
    private AbstractC3223ho zzg = AbstractC3223ho.f8571d;

    static {
        C3627x8 c3627x8 = new C3627x8();
        zzb = c3627x8;
        AbstractC3251ip.m30951g(C3627x8.class, c3627x8);
    }

    private C3627x8() {
    }

    /* renamed from: A */
    public static C3601w8 m30049A() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public static C3627x8 m30047C(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3627x8) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static /* synthetic */ void m30043G(C3627x8 c3627x8, C3019a9 c3019a9) {
        c3019a9.getClass();
        c3627x8.zzf = c3019a9;
    }

    /* renamed from: D */
    public final C3019a9 m30046D() {
        C3019a9 c3019a9 = this.zzf;
        return c3019a9 == null ? C3019a9.m31443D() : c3019a9;
    }

    /* renamed from: E */
    public final AbstractC3223ho m30045E() {
        return this.zzg;
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
                    return new C3601w8(null);
                }
                return new C3627x8();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m30041z() {
        return this.zze;
    }
}
