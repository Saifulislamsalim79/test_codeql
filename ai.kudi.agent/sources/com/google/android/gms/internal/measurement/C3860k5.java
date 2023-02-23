package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.k5 */
/* loaded from: classes2.dex */
public final class C3860k5 extends AbstractC3894m8<C3860k5, C3812h5> implements InterfaceC3942p9 {
    private static final C3860k5 zza;
    private int zze;
    private int zzf;
    private InterfaceC3988s8<C3860k5> zzg = AbstractC3894m8.m29393k();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        C3860k5 c3860k5 = new C3860k5();
        zza = c3860k5;
        AbstractC3894m8.m29389o(C3860k5.class, c3860k5);
    }

    private C3860k5() {
    }

    /* renamed from: A */
    public final List<C3860k5> m29429A() {
        return this.zzg;
    }

    /* renamed from: B */
    public final boolean m29428B() {
        return this.zzj;
    }

    /* renamed from: C */
    public final boolean m29427C() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: D */
    public final boolean m29426D() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: E */
    public final boolean m29425E() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: F */
    public final int m29424F() {
        int m29463a = C3844j5.m29463a(this.zzf);
        if (m29463a == 0) {
            return 1;
        }
        return m29463a;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3894m8
    /* renamed from: v */
    protected final Object mo28554v(int i, Object obj, Object obj2) {
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
                    return new C3812h5(null);
                }
                return new C3860k5();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", C3828i5.f9406a, "zzg", C3860k5.class, "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    /* renamed from: w */
    public final double m29423w() {
        return this.zzk;
    }

    /* renamed from: y */
    public final String m29421y() {
        return this.zzh;
    }

    /* renamed from: z */
    public final String m29420z() {
        return this.zzi;
    }
}
