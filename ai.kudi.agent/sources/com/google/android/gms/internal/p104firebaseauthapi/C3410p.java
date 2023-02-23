package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.p */
/* loaded from: classes2.dex */
final class C3410p implements InterfaceC3592w {

    /* renamed from: a */
    private final InterfaceC3592w[] f8819a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3410p(InterfaceC3592w... interfaceC3592wArr) {
        this.f8819a = interfaceC3592wArr;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3592w
    /* renamed from: a */
    public final InterfaceC3566v mo30105a(Class<?> cls) {
        InterfaceC3592w[] interfaceC3592wArr = this.f8819a;
        for (int i = 0; i < 2; i++) {
            InterfaceC3592w interfaceC3592w = interfaceC3592wArr[i];
            if (interfaceC3592w.mo30104b(cls)) {
                return interfaceC3592w.mo30105a(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3592w
    /* renamed from: b */
    public final boolean mo30104b(Class<?> cls) {
        InterfaceC3592w[] interfaceC3592wArr = this.f8819a;
        for (int i = 0; i < 2; i++) {
            if (interfaceC3592wArr[i].mo30104b(cls)) {
                return true;
            }
        }
        return false;
    }
}
