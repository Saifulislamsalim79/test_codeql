package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.w9 */
/* loaded from: classes2.dex */
public final class C3602w9 extends AbstractC3251ip<C3602w9, C3550u9> implements InterfaceC3010a0 {
    private static final C3602w9 zzb;
    private String zze = "";
    private AbstractC3223ho zzf = AbstractC3223ho.f8571d;
    private int zzg;

    static {
        C3602w9 c3602w9 = new C3602w9();
        zzb = c3602w9;
        AbstractC3251ip.m30951g(C3602w9.class, c3602w9);
    }

    private C3602w9() {
    }

    /* renamed from: C */
    public static C3602w9 m30093C() {
        return zzb;
    }

    /* renamed from: z */
    public static C3550u9 m30087z() {
        return zzb.m30948l();
    }

    /* renamed from: A */
    public final EnumC3576v9 m30095A() {
        EnumC3576v9 m30131a = EnumC3576v9.m30131a(this.zzg);
        return m30131a == null ? EnumC3576v9.UNRECOGNIZED : m30131a;
    }

    /* renamed from: D */
    public final AbstractC3223ho m30092D() {
        return this.zzf;
    }

    /* renamed from: E */
    public final String m30091E() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3251ip
    /* renamed from: j */
    protected final Object mo29964j(int i, Object obj, Object obj2) {
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
                    return new C3550u9(null);
                }
                return new C3602w9();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
