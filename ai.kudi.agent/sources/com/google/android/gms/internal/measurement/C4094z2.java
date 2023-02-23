package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.z2 */
/* loaded from: classes2.dex */
public final class C4094z2 extends AbstractC3894m8<C4094z2, C4078y2> implements InterfaceC3942p9 {
    private static final C4094z2 zza;
    private int zze;
    private int zzf;
    private InterfaceC3988s8<C3842j3> zzg = AbstractC3894m8.m29393k();
    private InterfaceC3988s8<C3717b3> zzh = AbstractC3894m8.m29393k();
    private boolean zzi;
    private boolean zzj;

    static {
        C4094z2 c4094z2 = new C4094z2();
        zza = c4094z2;
        AbstractC3894m8.m29389o(C4094z2.class, c4094z2);
    }

    private C4094z2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static /* synthetic */ void m28577E(C4094z2 c4094z2, int i, C3842j3 c3842j3) {
        c3842j3.getClass();
        InterfaceC3988s8<C3842j3> interfaceC3988s8 = c4094z2.zzg;
        if (!interfaceC3988s8.mo28973c()) {
            c4094z2.zzg = AbstractC3894m8.m29392l(interfaceC3988s8);
        }
        c4094z2.zzg.set(i, c3842j3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static /* synthetic */ void m28576F(C4094z2 c4094z2, int i, C3717b3 c3717b3) {
        c3717b3.getClass();
        InterfaceC3988s8<C3717b3> interfaceC3988s8 = c4094z2.zzh;
        if (!interfaceC3988s8.mo28973c()) {
            c4094z2.zzh = AbstractC3894m8.m29392l(interfaceC3988s8);
        }
        c4094z2.zzh.set(i, c3717b3);
    }

    /* renamed from: A */
    public final C3717b3 m28581A(int i) {
        return this.zzh.get(i);
    }

    /* renamed from: B */
    public final C3842j3 m28580B(int i) {
        return this.zzg.get(i);
    }

    /* renamed from: C */
    public final List<C3717b3> m28579C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final List<C3842j3> m28578D() {
        return this.zzg;
    }

    /* renamed from: G */
    public final boolean m28575G() {
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
                    return new C4078y2(null);
                }
                return new C4094z2();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", C3842j3.class, "zzh", C3717b3.class, "zzi", "zzj"});
        }
        return (byte) 1;
    }

    /* renamed from: w */
    public final int m28574w() {
        return this.zzf;
    }

    /* renamed from: x */
    public final int m28573x() {
        return this.zzh.size();
    }

    /* renamed from: y */
    public final int m28572y() {
        return this.zzg.size();
    }
}
