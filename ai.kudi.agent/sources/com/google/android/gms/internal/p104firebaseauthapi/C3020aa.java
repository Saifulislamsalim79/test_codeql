package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.aa */
/* loaded from: classes2.dex */
public final class C3020aa extends AbstractC3251ip<C3020aa, C3680z9> implements InterfaceC3010a0 {
    private static final C3020aa zzb;
    private String zze = "";
    private AbstractC3223ho zzf = AbstractC3223ho.f8571d;
    private int zzg;

    static {
        C3020aa c3020aa = new C3020aa();
        zzb = c3020aa;
        AbstractC3251ip.m30951g(C3020aa.class, c3020aa);
    }

    private C3020aa() {
    }

    /* renamed from: B */
    public static C3020aa m31433B() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static /* synthetic */ void m31429F(C3020aa c3020aa, String str) {
        str.getClass();
        c3020aa.zze = str;
    }

    /* renamed from: z */
    public static C3680z9 m31426z() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public final EnumC3048bb m31432C() {
        EnumC3048bb m31403a = EnumC3048bb.m31403a(this.zzg);
        return m31403a == null ? EnumC3048bb.UNRECOGNIZED : m31403a;
    }

    /* renamed from: D */
    public final AbstractC3223ho m31431D() {
        return this.zzf;
    }

    /* renamed from: E */
    public final String m31430E() {
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
                    return new C3680z9(null);
                }
                return new C3020aa();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
