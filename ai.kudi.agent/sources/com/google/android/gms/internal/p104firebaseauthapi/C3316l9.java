package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.l9 */
/* loaded from: classes2.dex */
public final class C3316l9 extends AbstractC3251ip<C3316l9, C3289k9> implements InterfaceC3010a0 {
    private static final C3316l9 zzb;
    private int zze;
    private C3472r9 zzf;
    private AbstractC3223ho zzg = AbstractC3223ho.f8571d;

    static {
        C3316l9 c3316l9 = new C3316l9();
        zzb = c3316l9;
        AbstractC3251ip.m30951g(C3316l9.class, c3316l9);
    }

    private C3316l9() {
    }

    /* renamed from: A */
    public static C3289k9 m30786A() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public static C3316l9 m30784C() {
        return zzb;
    }

    /* renamed from: D */
    public static C3316l9 m30783D(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3316l9) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static /* synthetic */ void m30779H(C3316l9 c3316l9, C3472r9 c3472r9) {
        c3472r9.getClass();
        c3316l9.zzf = c3472r9;
    }

    /* renamed from: E */
    public final C3472r9 m30782E() {
        C3472r9 c3472r9 = this.zzf;
        return c3472r9 == null ? C3472r9.m30385D() : c3472r9;
    }

    /* renamed from: F */
    public final AbstractC3223ho m30781F() {
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
                    return new C3289k9(null);
                }
                return new C3316l9();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m30777z() {
        return this.zze;
    }
}
