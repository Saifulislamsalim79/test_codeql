package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e7 */
/* loaded from: classes2.dex */
public final class C3125e7 extends AbstractC3251ip<C3125e7, C3098d7> implements InterfaceC3010a0 {
    private static final C3125e7 zzb;
    private int zze;
    private C3287k7 zzf;
    private AbstractC3223ho zzg = AbstractC3223ho.f8571d;

    static {
        C3125e7 c3125e7 = new C3125e7();
        zzb = c3125e7;
        AbstractC3251ip.m30951g(C3125e7.class, c3125e7);
    }

    private C3125e7() {
    }

    /* renamed from: A */
    public static C3098d7 m31206A() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public static C3125e7 m31204C(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3125e7) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static /* synthetic */ void m31200G(C3125e7 c3125e7, C3287k7 c3287k7) {
        c3287k7.getClass();
        c3125e7.zzf = c3287k7;
    }

    /* renamed from: D */
    public final C3287k7 m31203D() {
        C3287k7 c3287k7 = this.zzf;
        return c3287k7 == null ? C3287k7.m30853C() : c3287k7;
    }

    /* renamed from: E */
    public final AbstractC3223ho m31202E() {
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
                    return new C3098d7(null);
                }
                return new C3125e7();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m31198z() {
        return this.zze;
    }
}
