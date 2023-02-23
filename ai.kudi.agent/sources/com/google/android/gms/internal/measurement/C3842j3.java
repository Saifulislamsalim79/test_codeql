package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.j3 */
/* loaded from: classes2.dex */
public final class C3842j3 extends AbstractC3894m8<C3842j3, C3826i3> implements InterfaceC3942p9 {
    private static final C3842j3 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private C3749d3 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C3842j3 c3842j3 = new C3842j3();
        zza = c3842j3;
        AbstractC3894m8.m29389o(C3842j3.class, c3842j3);
    }

    private C3842j3() {
    }

    /* renamed from: B */
    public static /* synthetic */ void m29498B(C3842j3 c3842j3, String str) {
        c3842j3.zze |= 2;
        c3842j3.zzg = str;
    }

    /* renamed from: y */
    public static C3826i3 m29490y() {
        return zza.m29388p();
    }

    /* renamed from: A */
    public final String m29499A() {
        return this.zzg;
    }

    /* renamed from: C */
    public final boolean m29497C() {
        return this.zzi;
    }

    /* renamed from: D */
    public final boolean m29496D() {
        return this.zzj;
    }

    /* renamed from: E */
    public final boolean m29495E() {
        return this.zzk;
    }

    /* renamed from: F */
    public final boolean m29494F() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: G */
    public final boolean m29493G() {
        return (this.zze & 32) != 0;
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
                    return new C3826i3(null);
                }
                return new C3842j3();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    /* renamed from: w */
    public final int m29492w() {
        return this.zzf;
    }

    /* renamed from: x */
    public final C3749d3 m29491x() {
        C3749d3 c3749d3 = this.zzh;
        return c3749d3 == null ? C3749d3.m29688x() : c3749d3;
    }
}
