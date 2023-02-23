package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ia */
/* loaded from: classes2.dex */
public final class C3236ia extends AbstractC3251ip<C3236ia, C3155fa> implements InterfaceC3010a0 {
    private static final C3236ia zzb;
    private int zze;
    private InterfaceC3090d<C3209ha> zzf = AbstractC3251ip.m30941y();

    static {
        C3236ia c3236ia = new C3236ia();
        zzb = c3236ia;
        AbstractC3251ip.m30951g(C3236ia.class, c3236ia);
    }

    private C3236ia() {
    }

    /* renamed from: B */
    public static C3155fa m30972B() {
        return zzb.m30948l();
    }

    /* renamed from: E */
    public static C3236ia m30969E(byte[] bArr, C3617wo c3617wo) throws zzaae {
        return (C3236ia) AbstractC3251ip.m30943w(zzb, bArr, c3617wo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static /* synthetic */ void m30966H(C3236ia c3236ia, C3209ha c3209ha) {
        c3209ha.getClass();
        InterfaceC3090d<C3209ha> interfaceC3090d = c3236ia.zzf;
        if (!interfaceC3090d.mo30107c()) {
            c3236ia.zzf = AbstractC3251ip.m30954d(interfaceC3090d);
        }
        c3236ia.zzf.add(c3209ha);
    }

    /* renamed from: A */
    public final int m30973A() {
        return this.zze;
    }

    /* renamed from: C */
    public final C3209ha m30971C(int i) {
        return this.zzf.get(i);
    }

    /* renamed from: F */
    public final List<C3209ha> m30968F() {
        return this.zzf;
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
                    return new C3155fa(null);
                }
                return new C3236ia();
            }
            return AbstractC3251ip.m30952f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", C3209ha.class});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final int m30965z() {
        return this.zzf.size();
    }
}
