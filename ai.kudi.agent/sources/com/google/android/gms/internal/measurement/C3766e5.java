package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.e5 */
/* loaded from: classes2.dex */
public final class C3766e5 extends AbstractC3894m8<C3766e5, C3751d5> implements InterfaceC3942p9 {
    private static final C3766e5 zza;
    private int zze;
    private String zzf = "";
    private InterfaceC3988s8<C3860k5> zzg = AbstractC3894m8.m29393k();

    static {
        C3766e5 c3766e5 = new C3766e5();
        zza = c3766e5;
        AbstractC3894m8.m29389o(C3766e5.class, c3766e5);
    }

    private C3766e5() {
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
                    return new C3751d5(null);
                }
                return new C3766e5();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", C3860k5.class});
        }
        return (byte) 1;
    }

    /* renamed from: x */
    public final String m29655x() {
        return this.zzf;
    }

    /* renamed from: y */
    public final List<C3860k5> m29654y() {
        return this.zzg;
    }
}
