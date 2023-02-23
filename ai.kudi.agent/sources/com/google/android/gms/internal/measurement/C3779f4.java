package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.f4 */
/* loaded from: classes2.dex */
public final class C3779f4 extends AbstractC3894m8<C3779f4, C3765e4> implements InterfaceC3942p9 {
    private static final C3779f4 zza;
    private int zze;
    private InterfaceC3988s8<C3843j4> zzf = AbstractC3894m8.m29393k();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        C3779f4 c3779f4 = new C3779f4();
        zza = c3779f4;
        AbstractC3894m8.m29389o(C3779f4.class, c3779f4);
    }

    private C3779f4() {
    }

    /* renamed from: A */
    public static C3765e4 m29633A() {
        return zza.m29388p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static /* synthetic */ void m29628F(C3779f4 c3779f4, int i, C3843j4 c3843j4) {
        c3843j4.getClass();
        c3779f4.m29617Q();
        c3779f4.zzf.set(i, c3843j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static /* synthetic */ void m29627G(C3779f4 c3779f4, C3843j4 c3843j4) {
        c3843j4.getClass();
        c3779f4.m29617Q();
        c3779f4.zzf.add(c3843j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static /* synthetic */ void m29626H(C3779f4 c3779f4, Iterable iterable) {
        c3779f4.m29617Q();
        AbstractC3704a7.m29846h(iterable, c3779f4.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static /* synthetic */ void m29624J(C3779f4 c3779f4, int i) {
        c3779f4.m29617Q();
        c3779f4.zzf.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static /* synthetic */ void m29623K(C3779f4 c3779f4, String str) {
        str.getClass();
        c3779f4.zze |= 1;
        c3779f4.zzg = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static /* synthetic */ void m29622L(C3779f4 c3779f4, long j) {
        c3779f4.zze |= 2;
        c3779f4.zzh = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public static /* synthetic */ void m29621M(C3779f4 c3779f4, long j) {
        c3779f4.zze |= 4;
        c3779f4.zzi = j;
    }

    /* renamed from: Q */
    private final void m29617Q() {
        InterfaceC3988s8<C3843j4> interfaceC3988s8 = this.zzf;
        if (interfaceC3988s8.mo28973c()) {
            return;
        }
        this.zzf = AbstractC3894m8.m29392l(interfaceC3988s8);
    }

    /* renamed from: C */
    public final C3843j4 m29631C(int i) {
        return this.zzf.get(i);
    }

    /* renamed from: D */
    public final String m29630D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final List<C3843j4> m29629E() {
        return this.zzf;
    }

    /* renamed from: N */
    public final boolean m29620N() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: O */
    public final boolean m29619O() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: P */
    public final boolean m29618P() {
        return (this.zze & 2) != 0;
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
                    return new C3765e4(null);
                }
                return new C3779f4();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C3843j4.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    /* renamed from: w */
    public final int m29616w() {
        return this.zzj;
    }

    /* renamed from: x */
    public final int m29615x() {
        return this.zzf.size();
    }

    /* renamed from: y */
    public final long m29614y() {
        return this.zzi;
    }

    /* renamed from: z */
    public final long m29613z() {
        return this.zzh;
    }
}
