package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.i6 */
/* loaded from: classes2.dex */
public final class C3232i6 extends AbstractC3251ip<C3232i6, C3205h6> implements InterfaceC3010a0 {
    private static final C3232i6 zzb;
    private int zze;
    private C3313l6 zzf;

    static {
        C3232i6 c3232i6 = new C3232i6();
        zzb = c3232i6;
        AbstractC3251ip.m30951g(C3232i6.class, c3232i6);
    }

    private C3232i6() {
    }

    /* renamed from: A */
    public static C3205h6 m30981A() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public static C3232i6 m30979C(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3232i6) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
    }

    /* renamed from: F */
    public static /* synthetic */ void m30976F(C3232i6 c3232i6, C3313l6 c3313l6) {
        c3313l6.getClass();
        c3232i6.zzf = c3313l6;
    }

    /* renamed from: D */
    public final C3313l6 m30978D() {
        C3313l6 c3313l6 = this.zzf;
        return c3313l6 == null ? C3313l6.m30789C() : c3313l6;
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
                    return new C3205h6(null);
                }
                return new C3232i6();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m30975z() {
        return this.zze;
    }
}
