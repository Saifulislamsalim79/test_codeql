package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.n3 */
/* loaded from: classes2.dex */
public final class C3905n3 extends AbstractC3894m8<C3905n3, C3858k3> implements InterfaceC3942p9 {
    private static final C3905n3 zza;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private InterfaceC3988s8<String> zzi = AbstractC3894m8.m29393k();

    static {
        C3905n3 c3905n3 = new C3905n3();
        zza = c3905n3;
        AbstractC3894m8.m29389o(C3905n3.class, c3905n3);
    }

    private C3905n3() {
    }

    /* renamed from: y */
    public static C3905n3 m29356y() {
        return zza;
    }

    /* renamed from: A */
    public final List<String> m29364A() {
        return this.zzi;
    }

    /* renamed from: B */
    public final boolean m29363B() {
        return this.zzh;
    }

    /* renamed from: C */
    public final boolean m29362C() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: D */
    public final boolean m29361D() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: E */
    public final boolean m29360E() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: F */
    public final int m29359F() {
        int m29407a = C3889m3.m29407a(this.zzf);
        if (m29407a == 0) {
            return 1;
        }
        return m29407a;
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
                    return new C3858k3(null);
                }
                return new C3905n3();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", C3874l3.f9462a, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: w */
    public final int m29358w() {
        return this.zzi.size();
    }

    /* renamed from: z */
    public final String m29355z() {
        return this.zzg;
    }
}
