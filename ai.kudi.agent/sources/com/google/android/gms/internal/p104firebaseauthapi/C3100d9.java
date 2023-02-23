package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.d9 */
/* loaded from: classes2.dex */
public final class C3100d9 extends AbstractC3251ip<C3100d9, C3073c9> implements InterfaceC3010a0 {
    private static final C3100d9 zzb;
    private int zze;
    private int zzf;
    private AbstractC3223ho zzg = AbstractC3223ho.f8571d;

    static {
        C3100d9 c3100d9 = new C3100d9();
        zzb = c3100d9;
        AbstractC3251ip.m30951g(C3100d9.class, c3100d9);
    }

    private C3100d9() {
    }

    /* renamed from: B */
    public static C3100d9 m31259B() {
        return zzb;
    }

    /* renamed from: z */
    public static C3073c9 m31252z() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public final EnumC3127e9 m31258C() {
        EnumC3127e9 m31197a = EnumC3127e9.m31197a(this.zze);
        return m31197a == null ? EnumC3127e9.UNRECOGNIZED : m31197a;
    }

    /* renamed from: D */
    public final EnumC3235i9 m31257D() {
        EnumC3235i9 m30974a = EnumC3235i9.m30974a(this.zzf);
        return m30974a == null ? EnumC3235i9.UNRECOGNIZED : m30974a;
    }

    /* renamed from: E */
    public final AbstractC3223ho m31256E() {
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
                    return new C3073c9(null);
                }
                return new C3100d9();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
