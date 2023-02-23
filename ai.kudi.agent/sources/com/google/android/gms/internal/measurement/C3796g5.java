package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.g5 */
/* loaded from: classes2.dex */
public final class C3796g5 extends AbstractC3894m8<C3796g5, C3780f5> implements InterfaceC3942p9 {
    private static final C3796g5 zza;
    private int zze;
    private InterfaceC3988s8<C3860k5> zzf = AbstractC3894m8.m29393k();
    private C3735c5 zzg;

    static {
        C3796g5 c3796g5 = new C3796g5();
        zza = c3796g5;
        AbstractC3894m8.m29389o(C3796g5.class, c3796g5);
    }

    private C3796g5() {
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
                    return new C3780f5(null);
                }
                return new C3796g5();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", C3860k5.class, "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: w */
    public final C3735c5 m29589w() {
        C3735c5 c3735c5 = this.zzg;
        return c3735c5 == null ? C3735c5.m29718y() : c3735c5;
    }

    /* renamed from: y */
    public final List<C3860k5> m29587y() {
        return this.zzf;
    }
}
