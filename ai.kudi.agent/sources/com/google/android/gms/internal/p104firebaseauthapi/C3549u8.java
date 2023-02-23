package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.u8 */
/* loaded from: classes2.dex */
public final class C3549u8 extends AbstractC3251ip<C3549u8, C3497s8> implements InterfaceC3010a0 {
    private static final C3549u8 zzb;
    private C3100d9 zze;
    private C3367n8 zzf;
    private int zzg;

    static {
        C3549u8 c3549u8 = new C3549u8();
        zzb = c3549u8;
        AbstractC3251ip.m30951g(C3549u8.class, c3549u8);
    }

    private C3549u8() {
    }

    /* renamed from: B */
    public static C3497s8 m30184B() {
        return zzb.m30948l();
    }

    /* renamed from: D */
    public static C3549u8 m30182D() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static /* synthetic */ void m30180F(C3549u8 c3549u8, C3100d9 c3100d9) {
        c3100d9.getClass();
        c3549u8.zze = c3100d9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static /* synthetic */ void m30179G(C3549u8 c3549u8, C3367n8 c3367n8) {
        c3367n8.getClass();
        c3549u8.zzf = c3367n8;
    }

    /* renamed from: A */
    public final C3367n8 m30185A() {
        C3367n8 c3367n8 = this.zzf;
        return c3367n8 == null ? C3367n8.m30577B() : c3367n8;
    }

    /* renamed from: E */
    public final C3100d9 m30181E() {
        C3100d9 c3100d9 = this.zze;
        return c3100d9 == null ? C3100d9.m31259B() : c3100d9;
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
                    return new C3497s8(null);
                }
                return new C3549u8();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final EnumC3288k8 m30177z() {
        EnumC3288k8 m30850a = EnumC3288k8.m30850a(this.zzg);
        return m30850a == null ? EnumC3288k8.UNRECOGNIZED : m30850a;
    }
}
