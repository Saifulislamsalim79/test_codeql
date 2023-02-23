package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.e9 */
/* loaded from: classes2.dex */
final class C3770e9 implements InterfaceC3895m9 {

    /* renamed from: a */
    private final InterfaceC3895m9[] f9277a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3770e9(InterfaceC3895m9... interfaceC3895m9Arr) {
        this.f9277a = interfaceC3895m9Arr;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3895m9
    /* renamed from: a */
    public final InterfaceC3864k9 mo29382a(Class<?> cls) {
        InterfaceC3895m9[] interfaceC3895m9Arr = this.f9277a;
        for (int i = 0; i < 2; i++) {
            InterfaceC3895m9 interfaceC3895m9 = interfaceC3895m9Arr[i];
            if (interfaceC3895m9.mo29381b(cls)) {
                return interfaceC3895m9.mo29382a(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3895m9
    /* renamed from: b */
    public final boolean mo29381b(Class<?> cls) {
        InterfaceC3895m9[] interfaceC3895m9Arr = this.f9277a;
        for (int i = 0; i < 2; i++) {
            if (interfaceC3895m9Arr[i].mo29381b(cls)) {
                return true;
            }
        }
        return false;
    }
}
