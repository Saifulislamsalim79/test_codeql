package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.z4 */
/* loaded from: classes2.dex */
public final class C4096z4 extends AbstractC3894m8<C4096z4, C4080y4> implements InterfaceC3942p9 {
    private static final C4096z4 zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        C4096z4 c4096z4 = new C4096z4();
        zza = c4096z4;
        AbstractC3894m8.m29389o(C4096z4.class, c4096z4);
    }

    private C4096z4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static /* synthetic */ void m28566D(C4096z4 c4096z4, long j) {
        c4096z4.zze |= 1;
        c4096z4.zzf = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static /* synthetic */ void m28565E(C4096z4 c4096z4, String str) {
        str.getClass();
        c4096z4.zze |= 2;
        c4096z4.zzg = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static /* synthetic */ void m28564F(C4096z4 c4096z4, String str) {
        str.getClass();
        c4096z4.zze |= 4;
        c4096z4.zzh = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static /* synthetic */ void m28563G(C4096z4 c4096z4) {
        c4096z4.zze &= -5;
        c4096z4.zzh = zza.zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static /* synthetic */ void m28562H(C4096z4 c4096z4, long j) {
        c4096z4.zze |= 8;
        c4096z4.zzi = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static /* synthetic */ void m28561I(C4096z4 c4096z4) {
        c4096z4.zze &= -9;
        c4096z4.zzi = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static /* synthetic */ void m28560J(C4096z4 c4096z4, double d) {
        c4096z4.zze |= 32;
        c4096z4.zzk = d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static /* synthetic */ void m28559K(C4096z4 c4096z4) {
        c4096z4.zze &= -33;
        c4096z4.zzk = 0.0d;
    }

    /* renamed from: z */
    public static C4080y4 m28550z() {
        return zza.m29388p();
    }

    /* renamed from: B */
    public final String m28568B() {
        return this.zzg;
    }

    /* renamed from: C */
    public final String m28567C() {
        return this.zzh;
    }

    /* renamed from: L */
    public final boolean m28558L() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: M */
    public final boolean m28557M() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: N */
    public final boolean m28556N() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: O */
    public final boolean m28555O() {
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
                    return new C4080y4(null);
                }
                return new C4096z4();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    /* renamed from: w */
    public final double m28553w() {
        return this.zzk;
    }

    /* renamed from: x */
    public final long m28552x() {
        return this.zzi;
    }

    /* renamed from: y */
    public final long m28551y() {
        return this.zzf;
    }
}
