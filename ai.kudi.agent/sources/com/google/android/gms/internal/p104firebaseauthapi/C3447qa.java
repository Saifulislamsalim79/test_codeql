package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.qa */
/* loaded from: classes2.dex */
public final class C3447qa extends AbstractC3251ip<C3447qa, C3421pa> implements InterfaceC3010a0 {
    private static final C3447qa zzb;
    private int zze;
    private C3551ua zzf;

    static {
        C3447qa c3447qa = new C3447qa();
        zzb = c3447qa;
        AbstractC3251ip.m30951g(C3447qa.class, c3447qa);
    }

    private C3447qa() {
    }

    /* renamed from: A */
    public static C3421pa m30440A() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public static C3447qa m30438C(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3447qa) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static /* synthetic */ void m30435F(C3447qa c3447qa, C3551ua c3551ua) {
        c3551ua.getClass();
        c3447qa.zzf = c3551ua;
    }

    /* renamed from: D */
    public final C3551ua m30437D() {
        C3551ua c3551ua = this.zzf;
        return c3551ua == null ? C3551ua.m30173A() : c3551ua;
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
                    return new C3421pa(null);
                }
                return new C3447qa();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m30434z() {
        return this.zze;
    }
}
