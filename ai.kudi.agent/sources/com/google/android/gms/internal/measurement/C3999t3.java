package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.t3 */
/* loaded from: classes2.dex */
public final class C3999t3 extends AbstractC3894m8<C3999t3, C3983s3> implements InterfaceC3942p9 {
    private static final C3999t3 zza;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private String zzg = "";
    private InterfaceC3988s8<C4031v3> zzi = AbstractC3894m8.m29393k();
    private InterfaceC3988s8<C3967r3> zzj = AbstractC3894m8.m29393k();
    private InterfaceC3988s8<C4094z2> zzk = AbstractC3894m8.m29393k();
    private String zzl = "";
    private InterfaceC3988s8<C3796g5> zzn = AbstractC3894m8.m29393k();

    static {
        C3999t3 c3999t3 = new C3999t3();
        zza = c3999t3;
        AbstractC3894m8.m29389o(C3999t3.class, c3999t3);
    }

    private C3999t3() {
    }

    /* renamed from: A */
    public static C3983s3 m28930A() {
        return zza.m29388p();
    }

    /* renamed from: C */
    public static C3999t3 m28928C() {
        return zza;
    }

    /* renamed from: H */
    public static /* synthetic */ void m28923H(C3999t3 c3999t3, int i, C3967r3 c3967r3) {
        c3967r3.getClass();
        InterfaceC3988s8<C3967r3> interfaceC3988s8 = c3999t3.zzj;
        if (!interfaceC3988s8.mo28973c()) {
            c3999t3.zzj = AbstractC3894m8.m29392l(interfaceC3988s8);
        }
        c3999t3.zzj.set(i, c3967r3);
    }

    /* renamed from: D */
    public final String m28927D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final List<C4094z2> m28926E() {
        return this.zzk;
    }

    /* renamed from: F */
    public final List<C3796g5> m28925F() {
        return this.zzn;
    }

    /* renamed from: G */
    public final List<C4031v3> m28924G() {
        return this.zzi;
    }

    /* renamed from: J */
    public final boolean m28921J() {
        return this.zzm;
    }

    /* renamed from: K */
    public final boolean m28920K() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: L */
    public final boolean m28919L() {
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
                    return new C3983s3(null);
                }
                return new C3999t3();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C4031v3.class, "zzj", C3967r3.class, "zzk", C4094z2.class, "zzl", "zzm", "zzn", C3796g5.class});
        }
        return (byte) 1;
    }

    /* renamed from: w */
    public final int m28918w() {
        return this.zzn.size();
    }

    /* renamed from: x */
    public final int m28917x() {
        return this.zzj.size();
    }

    /* renamed from: y */
    public final long m28916y() {
        return this.zzf;
    }

    /* renamed from: z */
    public final C3967r3 m28915z(int i) {
        return this.zzj.get(i);
    }
}
