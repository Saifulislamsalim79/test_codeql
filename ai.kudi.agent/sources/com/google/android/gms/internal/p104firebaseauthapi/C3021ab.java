package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ab */
/* loaded from: classes2.dex */
public final class C3021ab extends AbstractC3251ip<C3021ab, C3681za> implements InterfaceC3010a0 {
    private static final C3021ab zzb;
    private String zze = "";
    private C3020aa zzf;

    static {
        C3021ab c3021ab = new C3021ab();
        zzb = c3021ab;
        AbstractC3251ip.m30951g(C3021ab.class, c3021ab);
    }

    private C3021ab() {
    }

    /* renamed from: B */
    public static C3021ab m31424B() {
        return zzb;
    }

    /* renamed from: C */
    public static C3021ab m31423C(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3021ab) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
    }

    /* renamed from: D */
    public final String m31422D() {
        return this.zze;
    }

    /* renamed from: E */
    public final boolean m31421E() {
        return this.zzf != null;
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
                    return new C3681za(null);
                }
                return new C3021ab();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final C3020aa m31420z() {
        C3020aa c3020aa = this.zzf;
        return c3020aa == null ? C3020aa.m31433B() : c3020aa;
    }
}
