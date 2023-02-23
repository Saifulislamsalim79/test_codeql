package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.b4 */
/* loaded from: classes2.dex */
public final class C3718b4 extends AbstractC3894m8<C3718b4, C3701a4> implements InterfaceC3942p9 {
    private static final C3718b4 zza;
    private int zze;
    private int zzf;
    private C4032v4 zzg;
    private C4032v4 zzh;
    private boolean zzi;

    static {
        C3718b4 c3718b4 = new C3718b4();
        zza = c3718b4;
        AbstractC3894m8.m29389o(C3718b4.class, c3718b4);
    }

    private C3718b4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static /* synthetic */ void m29811B(C3718b4 c3718b4, int i) {
        c3718b4.zze |= 1;
        c3718b4.zzf = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static /* synthetic */ void m29810C(C3718b4 c3718b4, C4032v4 c4032v4) {
        c4032v4.getClass();
        c3718b4.zzg = c4032v4;
        c3718b4.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static /* synthetic */ void m29809D(C3718b4 c3718b4, C4032v4 c4032v4) {
        c3718b4.zzh = c4032v4;
        c3718b4.zze |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static /* synthetic */ void m29808E(C3718b4 c3718b4, boolean z) {
        c3718b4.zze |= 8;
        c3718b4.zzi = z;
    }

    /* renamed from: x */
    public static C3701a4 m29802x() {
        return zza.m29388p();
    }

    /* renamed from: A */
    public final C4032v4 m29812A() {
        C4032v4 c4032v4 = this.zzh;
        return c4032v4 == null ? C4032v4.m28796D() : c4032v4;
    }

    /* renamed from: F */
    public final boolean m29807F() {
        return this.zzi;
    }

    /* renamed from: G */
    public final boolean m29806G() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: H */
    public final boolean m29805H() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: I */
    public final boolean m29804I() {
        return (this.zze & 4) != 0;
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
                    return new C3701a4(null);
                }
                return new C3718b4();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: w */
    public final int m29803w() {
        return this.zzf;
    }

    /* renamed from: z */
    public final C4032v4 m29800z() {
        C4032v4 c4032v4 = this.zzg;
        return c4032v4 == null ? C4032v4.m28796D() : c4032v4;
    }
}
