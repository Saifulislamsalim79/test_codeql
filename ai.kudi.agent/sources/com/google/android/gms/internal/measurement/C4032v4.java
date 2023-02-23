package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.v4 */
/* loaded from: classes2.dex */
public final class C4032v4 extends AbstractC3894m8<C4032v4, C4016u4> implements InterfaceC3942p9 {
    private static final C4032v4 zza;
    private InterfaceC3972r8 zze = AbstractC3894m8.m29384t();
    private InterfaceC3972r8 zzf = AbstractC3894m8.m29384t();
    private InterfaceC3988s8<C3750d4> zzg = AbstractC3894m8.m29393k();
    private InterfaceC3988s8<C4064x4> zzh = AbstractC3894m8.m29393k();

    static {
        C4032v4 c4032v4 = new C4032v4();
        zza = c4032v4;
        AbstractC3894m8.m29389o(C4032v4.class, c4032v4);
    }

    private C4032v4() {
    }

    /* renamed from: B */
    public static C4016u4 m28798B() {
        return zza.m29388p();
    }

    /* renamed from: D */
    public static C4032v4 m28796D() {
        return zza;
    }

    /* renamed from: J */
    public static /* synthetic */ void m28790J(C4032v4 c4032v4, Iterable iterable) {
        InterfaceC3972r8 interfaceC3972r8 = c4032v4.zze;
        if (!interfaceC3972r8.mo28973c()) {
            c4032v4.zze = AbstractC3894m8.m29383u(interfaceC3972r8);
        }
        AbstractC3704a7.m29846h(iterable, c4032v4.zze);
    }

    /* renamed from: L */
    public static /* synthetic */ void m28788L(C4032v4 c4032v4, Iterable iterable) {
        InterfaceC3972r8 interfaceC3972r8 = c4032v4.zzf;
        if (!interfaceC3972r8.mo28973c()) {
            c4032v4.zzf = AbstractC3894m8.m29383u(interfaceC3972r8);
        }
        AbstractC3704a7.m29846h(iterable, c4032v4.zzf);
    }

    /* renamed from: N */
    public static /* synthetic */ void m28786N(C4032v4 c4032v4, Iterable iterable) {
        c4032v4.m28782R();
        AbstractC3704a7.m29846h(iterable, c4032v4.zzg);
    }

    /* renamed from: O */
    public static /* synthetic */ void m28785O(C4032v4 c4032v4, int i) {
        c4032v4.m28782R();
        c4032v4.zzg.remove(i);
    }

    /* renamed from: P */
    public static /* synthetic */ void m28784P(C4032v4 c4032v4, Iterable iterable) {
        c4032v4.m28781S();
        AbstractC3704a7.m29846h(iterable, c4032v4.zzh);
    }

    /* renamed from: Q */
    public static /* synthetic */ void m28783Q(C4032v4 c4032v4, int i) {
        c4032v4.m28781S();
        c4032v4.zzh.remove(i);
    }

    /* renamed from: R */
    private final void m28782R() {
        InterfaceC3988s8<C3750d4> interfaceC3988s8 = this.zzg;
        if (interfaceC3988s8.mo28973c()) {
            return;
        }
        this.zzg = AbstractC3894m8.m29392l(interfaceC3988s8);
    }

    /* renamed from: S */
    private final void m28781S() {
        InterfaceC3988s8<C4064x4> interfaceC3988s8 = this.zzh;
        if (interfaceC3988s8.mo28973c()) {
            return;
        }
        this.zzh = AbstractC3894m8.m29392l(interfaceC3988s8);
    }

    /* renamed from: A */
    public final C3750d4 m28799A(int i) {
        return this.zzg.get(i);
    }

    /* renamed from: E */
    public final C4064x4 m28795E(int i) {
        return this.zzh.get(i);
    }

    /* renamed from: F */
    public final List<C3750d4> m28794F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final List<Long> m28793G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final List<C4064x4> m28792H() {
        return this.zzh;
    }

    /* renamed from: I */
    public final List<Long> m28791I() {
        return this.zze;
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
                    return new C4016u4(null);
                }
                return new C4032v4();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C3750d4.class, "zzh", C4064x4.class});
        }
        return (byte) 1;
    }

    /* renamed from: w */
    public final int m28780w() {
        return this.zzg.size();
    }

    /* renamed from: x */
    public final int m28779x() {
        return this.zzf.size();
    }

    /* renamed from: y */
    public final int m28778y() {
        return this.zzh.size();
    }

    /* renamed from: z */
    public final int m28777z() {
        return this.zze.size();
    }
}
