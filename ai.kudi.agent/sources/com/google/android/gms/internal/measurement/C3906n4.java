package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.n4 */
/* loaded from: classes2.dex */
public final class C3906n4 extends AbstractC3894m8<C3906n4, C3890m4> implements InterfaceC3942p9 {
    private static final C3906n4 zza;
    private InterfaceC3988s8<C3937p4> zze = AbstractC3894m8.m29393k();

    static {
        C3906n4 c3906n4 = new C3906n4();
        zza = c3906n4;
        AbstractC3894m8.m29389o(C3906n4.class, c3906n4);
    }

    private C3906n4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static /* synthetic */ void m29354A(C3906n4 c3906n4, C3937p4 c3937p4) {
        c3937p4.getClass();
        InterfaceC3988s8<C3937p4> interfaceC3988s8 = c3906n4.zze;
        if (!interfaceC3988s8.mo28973c()) {
            c3906n4.zze = AbstractC3894m8.m29392l(interfaceC3988s8);
        }
        c3906n4.zze.add(c3937p4);
    }

    /* renamed from: w */
    public static C3890m4 m29353w() {
        return zza.m29388p();
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
                    return new C3890m4(null);
                }
                return new C3906n4();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C3937p4.class});
        }
        return (byte) 1;
    }

    /* renamed from: y */
    public final C3937p4 m29351y(int i) {
        return this.zze.get(0);
    }

    /* renamed from: z */
    public final List<C3937p4> m29350z() {
        return this.zze;
    }
}
