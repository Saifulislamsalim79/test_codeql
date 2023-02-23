package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ma */
/* loaded from: classes2.dex */
public final class C3343ma extends AbstractC3251ip<C3343ma, C3317la> implements InterfaceC3010a0 {
    private static final C3343ma zzb;
    private String zze = "";
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        C3343ma c3343ma = new C3343ma();
        zzb = c3343ma;
        AbstractC3251ip.m30951g(C3343ma.class, c3343ma);
    }

    private C3343ma() {
    }

    /* renamed from: A */
    public static C3317la m30708A() {
        return zzb.m30948l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static /* synthetic */ void m30706C(C3343ma c3343ma, String str) {
        str.getClass();
        c3343ma.zze = str;
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
                    return new C3317la(null);
                }
                return new C3343ma();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m30702z() {
        return this.zzg;
    }
}
