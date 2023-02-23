package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.a9 */
/* loaded from: classes2.dex */
public final class C3019a9 extends AbstractC3251ip<C3019a9, C3679z8> implements InterfaceC3010a0 {
    private static final C3019a9 zzb;
    private int zze;
    private C3549u8 zzf;
    private AbstractC3223ho zzg;
    private AbstractC3223ho zzh;

    static {
        C3019a9 c3019a9 = new C3019a9();
        zzb = c3019a9;
        AbstractC3251ip.m30951g(C3019a9.class, c3019a9);
    }

    private C3019a9() {
        AbstractC3223ho abstractC3223ho = AbstractC3223ho.f8571d;
        this.zzg = abstractC3223ho;
        this.zzh = abstractC3223ho;
    }

    /* renamed from: B */
    public static C3679z8 m31445B() {
        return zzb.m30948l();
    }

    /* renamed from: D */
    public static C3019a9 m31443D() {
        return zzb;
    }

    /* renamed from: E */
    public static C3019a9 m31442E(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3019a9) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static /* synthetic */ void m31438I(C3019a9 c3019a9, C3549u8 c3549u8) {
        c3549u8.getClass();
        c3019a9.zzf = c3549u8;
    }

    /* renamed from: A */
    public final C3549u8 m31446A() {
        C3549u8 c3549u8 = this.zzf;
        return c3549u8 == null ? C3549u8.m30182D() : c3549u8;
    }

    /* renamed from: F */
    public final AbstractC3223ho m31441F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final AbstractC3223ho m31440G() {
        return this.zzh;
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
                    return new C3679z8(null);
                }
                return new C3019a9();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m31435z() {
        return this.zze;
    }
}
