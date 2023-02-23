package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.d4 */
/* loaded from: classes2.dex */
public final class C3750d4 extends AbstractC3894m8<C3750d4, C3734c4> implements InterfaceC3942p9 {
    private static final C3750d4 zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        C3750d4 c3750d4 = new C3750d4();
        zza = c3750d4;
        AbstractC3894m8.m29389o(C3750d4.class, c3750d4);
    }

    private C3750d4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static /* synthetic */ void m29685A(C3750d4 c3750d4, int i) {
        c3750d4.zze |= 1;
        c3750d4.zzf = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static /* synthetic */ void m29684B(C3750d4 c3750d4, long j) {
        c3750d4.zze |= 2;
        c3750d4.zzg = j;
    }

    /* renamed from: y */
    public static C3734c4 m29679y() {
        return zza.m29388p();
    }

    /* renamed from: C */
    public final boolean m29683C() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: D */
    public final boolean m29682D() {
        return (this.zze & 1) != 0;
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
                    return new C3734c4(null);
                }
                return new C3750d4();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: w */
    public final int m29681w() {
        return this.zzf;
    }

    /* renamed from: x */
    public final long m29680x() {
        return this.zzg;
    }
}
