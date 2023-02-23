package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.d3 */
/* loaded from: classes2.dex */
public final class C3749d3 extends AbstractC3894m8<C3749d3, C3733c3> implements InterfaceC3942p9 {
    private static final C3749d3 zza;
    private int zze;
    private C3905n3 zzf;
    private C3810h3 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        C3749d3 c3749d3 = new C3749d3();
        zza = c3749d3;
        AbstractC3894m8.m29389o(C3749d3.class, c3749d3);
    }

    private C3749d3() {
    }

    /* renamed from: B */
    public static /* synthetic */ void m29695B(C3749d3 c3749d3, String str) {
        c3749d3.zze |= 8;
        c3749d3.zzi = str;
    }

    /* renamed from: x */
    public static C3749d3 m29688x() {
        return zza;
    }

    /* renamed from: A */
    public final String m29696A() {
        return this.zzi;
    }

    /* renamed from: C */
    public final boolean m29694C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final boolean m29693D() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: E */
    public final boolean m29692E() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: F */
    public final boolean m29691F() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: G */
    public final boolean m29690G() {
        return (this.zze & 1) != 0;
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
                    return new C3733c3(null);
                }
                return new C3749d3();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: y */
    public final C3810h3 m29687y() {
        C3810h3 c3810h3 = this.zzg;
        return c3810h3 == null ? C3810h3.m29560x() : c3810h3;
    }

    /* renamed from: z */
    public final C3905n3 m29686z() {
        C3905n3 c3905n3 = this.zzf;
        return c3905n3 == null ? C3905n3.m29356y() : c3905n3;
    }
}
