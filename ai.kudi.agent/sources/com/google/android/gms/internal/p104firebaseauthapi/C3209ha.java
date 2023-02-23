package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ha */
/* loaded from: classes2.dex */
public final class C3209ha extends AbstractC3251ip<C3209ha, C3182ga> implements InterfaceC3010a0 {
    private static final C3209ha zzb;
    private C3602w9 zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        C3209ha c3209ha = new C3209ha();
        zzb = c3209ha;
        AbstractC3251ip.m30951g(C3209ha.class, c3209ha);
    }

    private C3209ha() {
    }

    /* renamed from: C */
    public static C3182ga m31066C() {
        return zzb.m30948l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static /* synthetic */ void m31063F(C3209ha c3209ha, C3602w9 c3602w9) {
        c3602w9.getClass();
        c3209ha.zze = c3602w9;
    }

    /* renamed from: A */
    public final C3602w9 m31068A() {
        C3602w9 c3602w9 = this.zze;
        return c3602w9 == null ? C3602w9.m30093C() : c3602w9;
    }

    /* renamed from: B */
    public final EnumC3628x9 m31067B() {
        EnumC3628x9 m30040a = EnumC3628x9.m30040a(this.zzf);
        return m30040a == null ? EnumC3628x9.UNRECOGNIZED : m30040a;
    }

    /* renamed from: E */
    public final EnumC3048bb m31064E() {
        EnumC3048bb m31403a = EnumC3048bb.m31403a(this.zzh);
        return m31403a == null ? EnumC3048bb.UNRECOGNIZED : m31403a;
    }

    /* renamed from: J */
    public final boolean m31059J() {
        return this.zze != null;
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
                    return new C3182ga(null);
                }
                return new C3209ha();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m31058z() {
        return this.zzg;
    }
}
