package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.v3 */
/* loaded from: classes2.dex */
public final class C4031v3 extends AbstractC3894m8<C4031v3, C4015u3> implements InterfaceC3942p9 {
    private static final C4031v3 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        C4031v3 c4031v3 = new C4031v3();
        zza = c4031v3;
        AbstractC3894m8.m29389o(C4031v3.class, c4031v3);
    }

    private C4031v3() {
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
                    return new C4015u3(null);
                }
                return new C4031v3();
            }
            return AbstractC3894m8.m29390n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: x */
    public final String m28801x() {
        return this.zzf;
    }

    /* renamed from: y */
    public final String m28800y() {
        return this.zzg;
    }
}
