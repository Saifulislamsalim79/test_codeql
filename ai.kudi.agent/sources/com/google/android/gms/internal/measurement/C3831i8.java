package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.i8 */
/* loaded from: classes2.dex */
final class C3831i8 implements InterfaceC3895m9 {

    /* renamed from: a */
    private static final C3831i8 f9407a = new C3831i8();

    private C3831i8() {
    }

    /* renamed from: c */
    public static C3831i8 m29519c() {
        return f9407a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3895m9
    /* renamed from: a */
    public final InterfaceC3864k9 mo29382a(Class<?> cls) {
        if (!AbstractC3894m8.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (InterfaceC3864k9) AbstractC3894m8.m29386r(cls.asSubclass(AbstractC3894m8.class)).mo28554v(3, null, null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3895m9
    /* renamed from: b */
    public final boolean mo29381b(Class<?> cls) {
        return AbstractC3894m8.class.isAssignableFrom(cls);
    }
}
