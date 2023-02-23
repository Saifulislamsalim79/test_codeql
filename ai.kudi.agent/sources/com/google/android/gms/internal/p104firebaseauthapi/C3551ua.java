package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ua */
/* loaded from: classes2.dex */
public final class C3551ua extends AbstractC3251ip<C3551ua, C3525ta> implements InterfaceC3010a0 {
    private static final C3551ua zzb;
    private String zze = "";

    static {
        C3551ua c3551ua = new C3551ua();
        zzb = c3551ua;
        AbstractC3251ip.m30951g(C3551ua.class, c3551ua);
    }

    private C3551ua() {
    }

    /* renamed from: A */
    public static C3551ua m30173A() {
        return zzb;
    }

    /* renamed from: B */
    public static C3551ua m30172B(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3551ua) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
    }

    /* renamed from: C */
    public final String m30171C() {
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
                    return new C3525ta(null);
                }
                return new C3551ua();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
