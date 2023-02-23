package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.kb */
/* loaded from: classes2.dex */
public final class C3291kb extends AbstractC3251ip<C3291kb, C3264jb> implements InterfaceC3010a0 {
    private static final C3291kb zzb;
    private int zze;

    static {
        C3291kb c3291kb = new C3291kb();
        zzb = c3291kb;
        AbstractC3251ip.m30951g(C3291kb.class, c3291kb);
    }

    private C3291kb() {
    }

    /* renamed from: A */
    public static C3291kb m30844A() {
        return zzb;
    }

    /* renamed from: B */
    public static C3291kb m30843B(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3291kb) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
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
                    return new C3264jb(null);
                }
                return new C3291kb();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
