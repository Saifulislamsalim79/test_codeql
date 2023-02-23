package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.h9 */
/* loaded from: classes2.dex */
public final class C3208h9 extends AbstractC3251ip<C3208h9, C3181g9> implements InterfaceC3010a0 {
    private static final C3208h9 zzb;
    private AbstractC3223ho zze = AbstractC3223ho.f8571d;
    private C3369na zzf;

    static {
        C3208h9 c3208h9 = new C3208h9();
        zzb = c3208h9;
        AbstractC3251ip.m30951g(C3208h9.class, c3208h9);
    }

    private C3208h9() {
    }

    /* renamed from: B */
    public static C3208h9 m31073B(byte[] bArr, C3617wo c3617wo) throws zzaae {
        return (C3208h9) AbstractC3251ip.m30943w(zzb, bArr, c3617wo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static /* synthetic */ void m31070E(C3208h9 c3208h9, C3369na c3369na) {
        c3369na.getClass();
        c3208h9.zzf = c3369na;
    }

    /* renamed from: z */
    public static C3181g9 m31069z() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public final AbstractC3223ho m31072C() {
        return this.zze;
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
                    return new C3181g9(null);
                }
                return new C3208h9();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
