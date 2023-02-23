package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.o6 */
/* loaded from: classes2.dex */
public final class C3391o6 extends AbstractC3251ip<C3391o6, C3365n6> implements InterfaceC3010a0 {
    private static final C3391o6 zzb;
    private int zze;
    private C3573v6 zzf;
    private C3316l9 zzg;

    static {
        C3391o6 c3391o6 = new C3391o6();
        zzb = c3391o6;
        AbstractC3251ip.m30951g(C3391o6.class, c3391o6);
    }

    private C3391o6() {
    }

    /* renamed from: A */
    public static C3365n6 m30515A() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public static C3391o6 m30513C(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3391o6) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
    }

    /* renamed from: G */
    public static /* synthetic */ void m30509G(C3391o6 c3391o6, C3573v6 c3573v6) {
        c3573v6.getClass();
        c3391o6.zzf = c3573v6;
    }

    /* renamed from: H */
    public static /* synthetic */ void m30508H(C3391o6 c3391o6, C3316l9 c3316l9) {
        c3316l9.getClass();
        c3391o6.zzg = c3316l9;
    }

    /* renamed from: D */
    public final C3573v6 m30512D() {
        C3573v6 c3573v6 = this.zzf;
        return c3573v6 == null ? C3573v6.m30139C() : c3573v6;
    }

    /* renamed from: E */
    public final C3316l9 m30511E() {
        C3316l9 c3316l9 = this.zzg;
        return c3316l9 == null ? C3316l9.m30784C() : c3316l9;
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
                    return new C3365n6(null);
                }
                return new C3391o6();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m30507z() {
        return this.zze;
    }
}
