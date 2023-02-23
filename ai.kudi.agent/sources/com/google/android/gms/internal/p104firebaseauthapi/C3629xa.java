package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xa */
/* loaded from: classes2.dex */
public final class C3629xa extends AbstractC3251ip<C3629xa, C3603wa> implements InterfaceC3010a0 {
    private static final C3629xa zzb;
    private int zze;
    private C3021ab zzf;

    static {
        C3629xa c3629xa = new C3629xa();
        zzb = c3629xa;
        AbstractC3251ip.m30951g(C3629xa.class, c3629xa);
    }

    private C3629xa() {
    }

    /* renamed from: A */
    public static C3603wa m30039A() {
        return zzb.m30948l();
    }

    /* renamed from: C */
    public static C3629xa m30037C(AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        return (C3629xa) AbstractC3251ip.m30945r(zzb, abstractC3223ho, c3617wo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static /* synthetic */ void m30034F(C3629xa c3629xa, C3021ab c3021ab) {
        c3021ab.getClass();
        c3629xa.zzf = c3021ab;
    }

    /* renamed from: D */
    public final C3021ab m30036D() {
        C3021ab c3021ab = this.zzf;
        return c3021ab == null ? C3021ab.m31424B() : c3021ab;
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
                    return new C3603wa(null);
                }
                return new C3629xa();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m30033z() {
        return this.zze;
    }
}
