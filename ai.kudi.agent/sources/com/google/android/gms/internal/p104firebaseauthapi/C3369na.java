package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.na */
/* loaded from: classes2.dex */
public final class C3369na extends AbstractC3251ip<C3369na, C3290ka> implements InterfaceC3010a0 {
    private static final C3369na zzb;
    private int zze;
    private InterfaceC3090d<C3343ma> zzf = AbstractC3251ip.m30941y();

    static {
        C3369na c3369na = new C3369na();
        zzb = c3369na;
        AbstractC3251ip.m30951g(C3369na.class, c3369na);
    }

    private C3369na() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static /* synthetic */ void m30568D(C3369na c3369na, C3343ma c3343ma) {
        c3343ma.getClass();
        InterfaceC3090d<C3343ma> interfaceC3090d = c3369na.zzf;
        if (!interfaceC3090d.mo30107c()) {
            c3369na.zzf = AbstractC3251ip.m30954d(interfaceC3090d);
        }
        c3369na.zzf.add(c3343ma);
    }

    /* renamed from: z */
    public static C3290ka m30567z() {
        return zzb.m30948l();
    }

    /* renamed from: A */
    public final C3343ma m30571A(int i) {
        return this.zzf.get(0);
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
                    return new C3290ka(null);
                }
                return new C3369na();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", C3343ma.class});
        }
        return (byte) 1;
    }
}
