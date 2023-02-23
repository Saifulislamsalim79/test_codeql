package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.c5 */
/* loaded from: classes2.dex */
public final class C3735c5 extends AbstractC3894m8<C3735c5, C3719b5> implements InterfaceC3942p9 {
    private static final C3735c5 zza;
    private InterfaceC3988s8<C3766e5> zze = AbstractC3894m8.m29393k();

    static {
        C3735c5 c3735c5 = new C3735c5();
        zza = c3735c5;
        AbstractC3894m8.m29389o(C3735c5.class, c3735c5);
    }

    private C3735c5() {
    }

    /* renamed from: y */
    public static C3735c5 m29718y() {
        return zza;
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
                    return new C3719b5(null);
                }
                return new C3735c5();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C3766e5.class});
        }
        return (byte) 1;
    }

    /* renamed from: w */
    public final int m29720w() {
        return this.zze.size();
    }

    /* renamed from: z */
    public final List<C3766e5> m29717z() {
        return this.zze;
    }
}
