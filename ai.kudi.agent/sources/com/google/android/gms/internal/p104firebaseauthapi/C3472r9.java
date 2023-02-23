package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.r9 */
/* loaded from: classes2.dex */
public final class C3472r9 extends AbstractC3251ip<C3472r9, C3446q9> implements InterfaceC3010a0 {
    private static final C3472r9 zzb;
    private int zze;
    private int zzf;

    static {
        C3472r9 c3472r9 = new C3472r9();
        zzb = c3472r9;
        AbstractC3251ip.m30951g(C3472r9.class, c3472r9);
    }

    private C3472r9() {
    }

    /* renamed from: B */
    public static C3446q9 m30387B() {
        return zzb.m30948l();
    }

    /* renamed from: D */
    public static C3472r9 m30385D() {
        return zzb;
    }

    /* renamed from: A */
    public final EnumC3235i9 m30388A() {
        EnumC3235i9 m30974a = EnumC3235i9.m30974a(this.zze);
        return m30974a == null ? EnumC3235i9.UNRECOGNIZED : m30974a;
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
                    return new C3446q9(null);
                }
                return new C3472r9();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m30382z() {
        return this.zzf;
    }
}
