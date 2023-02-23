package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.h3 */
/* loaded from: classes2.dex */
public final class C3810h3 extends AbstractC3894m8<C3810h3, C3764e3> implements InterfaceC3942p9 {
    private static final C3810h3 zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C3810h3 c3810h3 = new C3810h3();
        zza = c3810h3;
        AbstractC3894m8.m29389o(C3810h3.class, c3810h3);
    }

    private C3810h3() {
    }

    /* renamed from: x */
    public static C3810h3 m29560x() {
        return zza;
    }

    /* renamed from: A */
    public final String m29569A() {
        return this.zzi;
    }

    /* renamed from: B */
    public final boolean m29568B() {
        return this.zzg;
    }

    /* renamed from: C */
    public final boolean m29567C() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: D */
    public final boolean m29566D() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: E */
    public final boolean m29565E() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: F */
    public final boolean m29564F() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: G */
    public final boolean m29563G() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: H */
    public final int m29562H() {
        int m29590a = C3794g3.m29590a(this.zzf);
        if (m29590a == 0) {
            return 1;
        }
        return m29590a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
                    return new C3764e3(null);
                }
                return new C3810h3();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", C3778f3.f9295a, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    /* renamed from: y */
    public final String m29559y() {
        return this.zzh;
    }

    /* renamed from: z */
    public final String m29558z() {
        return this.zzj;
    }
}
