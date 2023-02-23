package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.j4 */
/* loaded from: classes2.dex */
public final class C3843j4 extends AbstractC3894m8<C3843j4, C3827i4> implements InterfaceC3942p9 {
    private static final C3843j4 zza;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private InterfaceC3988s8<C3843j4> zzk = AbstractC3894m8.m29393k();

    static {
        C3843j4 c3843j4 = new C3843j4();
        zza = c3843j4;
        AbstractC3894m8.m29389o(C3843j4.class, c3843j4);
    }

    private C3843j4() {
    }

    /* renamed from: A */
    public static C3827i4 m29488A() {
        return zza.m29388p();
    }

    /* renamed from: F */
    public static /* synthetic */ void m29483F(C3843j4 c3843j4, String str) {
        str.getClass();
        c3843j4.zze |= 1;
        c3843j4.zzf = str;
    }

    /* renamed from: G */
    public static /* synthetic */ void m29482G(C3843j4 c3843j4, String str) {
        str.getClass();
        c3843j4.zze |= 2;
        c3843j4.zzg = str;
    }

    /* renamed from: H */
    public static /* synthetic */ void m29481H(C3843j4 c3843j4) {
        c3843j4.zze &= -3;
        c3843j4.zzg = zza.zzg;
    }

    /* renamed from: I */
    public static /* synthetic */ void m29480I(C3843j4 c3843j4, long j) {
        c3843j4.zze |= 4;
        c3843j4.zzh = j;
    }

    /* renamed from: J */
    public static /* synthetic */ void m29479J(C3843j4 c3843j4) {
        c3843j4.zze &= -5;
        c3843j4.zzh = 0L;
    }

    /* renamed from: K */
    public static /* synthetic */ void m29478K(C3843j4 c3843j4, double d) {
        c3843j4.zze |= 16;
        c3843j4.zzj = d;
    }

    /* renamed from: L */
    public static /* synthetic */ void m29477L(C3843j4 c3843j4) {
        c3843j4.zze &= -17;
        c3843j4.zzj = 0.0d;
    }

    /* renamed from: M */
    public static /* synthetic */ void m29476M(C3843j4 c3843j4, C3843j4 c3843j42) {
        c3843j42.getClass();
        c3843j4.m29468U();
        c3843j4.zzk.add(c3843j42);
    }

    /* renamed from: N */
    public static /* synthetic */ void m29475N(C3843j4 c3843j4, Iterable iterable) {
        c3843j4.m29468U();
        AbstractC3704a7.m29846h(iterable, c3843j4.zzk);
    }

    /* renamed from: U */
    private final void m29468U() {
        InterfaceC3988s8<C3843j4> interfaceC3988s8 = this.zzk;
        if (interfaceC3988s8.mo28973c()) {
            return;
        }
        this.zzk = AbstractC3894m8.m29392l(interfaceC3988s8);
    }

    /* renamed from: C */
    public final String m29486C() {
        return this.zzf;
    }

    /* renamed from: D */
    public final String m29485D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final List<C3843j4> m29484E() {
        return this.zzk;
    }

    /* renamed from: P */
    public final boolean m29473P() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: Q */
    public final boolean m29472Q() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: R */
    public final boolean m29471R() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: S */
    public final boolean m29470S() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: T */
    public final boolean m29469T() {
        return (this.zze & 2) != 0;
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
                    return new C3827i4(null);
                }
                return new C3843j4();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C3843j4.class});
        }
        return (byte) 1;
    }

    /* renamed from: w */
    public final double m29467w() {
        return this.zzj;
    }

    /* renamed from: x */
    public final float m29466x() {
        return this.zzi;
    }

    /* renamed from: y */
    public final int m29465y() {
        return this.zzk.size();
    }

    /* renamed from: z */
    public final long m29464z() {
        return this.zzh;
    }
}
