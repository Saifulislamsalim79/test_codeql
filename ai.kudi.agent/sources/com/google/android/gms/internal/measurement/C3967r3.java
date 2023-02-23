package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.r3 */
/* loaded from: classes2.dex */
public final class C3967r3 extends AbstractC3894m8<C3967r3, C3936p3> implements InterfaceC3942p9 {
    private static final C3967r3 zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        C3967r3 c3967r3 = new C3967r3();
        zza = c3967r3;
        AbstractC3894m8.m29389o(C3967r3.class, c3967r3);
    }

    private C3967r3() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static /* synthetic */ void m29053z(C3967r3 c3967r3, String str) {
        str.getClass();
        c3967r3.zze |= 1;
        c3967r3.zzf = str;
    }

    /* renamed from: A */
    public final boolean m29061A() {
        return this.zzg;
    }

    /* renamed from: B */
    public final boolean m29060B() {
        return this.zzh;
    }

    /* renamed from: C */
    public final boolean m29059C() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: D */
    public final boolean m29058D() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: E */
    public final boolean m29057E() {
        return (this.zze & 8) != 0;
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
                    return new C3936p3(null);
                }
                return new C3967r3();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: w */
    public final int m29056w() {
        return this.zzi;
    }

    /* renamed from: y */
    public final String m29054y() {
        return this.zzf;
    }
}
