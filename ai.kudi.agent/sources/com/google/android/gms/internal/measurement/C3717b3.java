package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.b3 */
/* loaded from: classes2.dex */
public final class C3717b3 extends AbstractC3894m8<C3717b3, C3700a3> implements InterfaceC3942p9 {
    private static final C3717b3 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private InterfaceC3988s8<C3749d3> zzh = AbstractC3894m8.m29393k();
    private boolean zzi;
    private C3810h3 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        C3717b3 c3717b3 = new C3717b3();
        zza = c3717b3;
        AbstractC3894m8.m29389o(C3717b3.class, c3717b3);
    }

    private C3717b3() {
    }

    /* renamed from: E */
    public static /* synthetic */ void m29824E(C3717b3 c3717b3, String str) {
        c3717b3.zze |= 2;
        c3717b3.zzg = str;
    }

    /* renamed from: F */
    public static /* synthetic */ void m29823F(C3717b3 c3717b3, int i, C3749d3 c3749d3) {
        c3749d3.getClass();
        InterfaceC3988s8<C3749d3> interfaceC3988s8 = c3717b3.zzh;
        if (!interfaceC3988s8.mo28973c()) {
            c3717b3.zzh = AbstractC3894m8.m29392l(interfaceC3988s8);
        }
        c3717b3.zzh.set(i, c3749d3);
    }

    /* renamed from: y */
    public static C3700a3 m29814y() {
        return zza.m29388p();
    }

    /* renamed from: A */
    public final C3749d3 m29828A(int i) {
        return this.zzh.get(i);
    }

    /* renamed from: B */
    public final C3810h3 m29827B() {
        C3810h3 c3810h3 = this.zzj;
        return c3810h3 == null ? C3810h3.m29560x() : c3810h3;
    }

    /* renamed from: C */
    public final String m29826C() {
        return this.zzg;
    }

    /* renamed from: D */
    public final List<C3749d3> m29825D() {
        return this.zzh;
    }

    /* renamed from: G */
    public final boolean m29822G() {
        return this.zzk;
    }

    /* renamed from: H */
    public final boolean m29821H() {
        return this.zzl;
    }

    /* renamed from: I */
    public final boolean m29820I() {
        return this.zzm;
    }

    /* renamed from: J */
    public final boolean m29819J() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: K */
    public final boolean m29818K() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: L */
    public final boolean m29817L() {
        return (this.zze & 64) != 0;
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
                    return new C3700a3(null);
                }
                return new C3717b3();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C3749d3.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }

    /* renamed from: w */
    public final int m29816w() {
        return this.zzh.size();
    }

    /* renamed from: x */
    public final int m29815x() {
        return this.zzf;
    }
}
