package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.l4 */
/* loaded from: classes2.dex */
public final class C3875l4 extends AbstractC3894m8<C3875l4, C3859k4> implements InterfaceC3942p9 {
    private static final C3875l4 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private C4095z3 zzh;

    static {
        C3875l4 c3875l4 = new C3875l4();
        zza = c3875l4;
        AbstractC3894m8.m29389o(C3875l4.class, c3875l4);
    }

    private C3875l4() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3894m8
    /* renamed from: v */
    public final Object mo28554v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C3859k4(null);
                }
                return new C3875l4();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
