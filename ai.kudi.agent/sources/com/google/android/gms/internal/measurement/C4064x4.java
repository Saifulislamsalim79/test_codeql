package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.x4 */
/* loaded from: classes2.dex */
public final class C4064x4 extends AbstractC3894m8<C4064x4, C4048w4> implements InterfaceC3942p9 {
    private static final C4064x4 zza;
    private int zze;
    private int zzf;
    private InterfaceC3972r8 zzg = AbstractC3894m8.m29384t();

    static {
        C4064x4 c4064x4 = new C4064x4();
        zza = c4064x4;
        AbstractC3894m8.m29389o(C4064x4.class, c4064x4);
    }

    private C4064x4() {
    }

    /* renamed from: C */
    public static /* synthetic */ void m28667C(C4064x4 c4064x4, int i) {
        c4064x4.zze |= 1;
        c4064x4.zzf = i;
    }

    /* renamed from: D */
    public static /* synthetic */ void m28666D(C4064x4 c4064x4, Iterable iterable) {
        InterfaceC3972r8 interfaceC3972r8 = c4064x4.zzg;
        if (!interfaceC3972r8.mo28973c()) {
            c4064x4.zzg = AbstractC3894m8.m29383u(interfaceC3972r8);
        }
        AbstractC3704a7.m29846h(iterable, c4064x4.zzg);
    }

    /* renamed from: z */
    public static C4048w4 m28661z() {
        return zza.m29388p();
    }

    /* renamed from: B */
    public final List<Long> m28668B() {
        return this.zzg;
    }

    /* renamed from: E */
    public final boolean m28665E() {
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
                    return new C4048w4(null);
                }
                return new C4064x4();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: w */
    public final int m28664w() {
        return this.zzg.size();
    }

    /* renamed from: x */
    public final int m28663x() {
        return this.zzf;
    }

    /* renamed from: y */
    public final long m28662y(int i) {
        return this.zzg.mo29028g(i);
    }
}
