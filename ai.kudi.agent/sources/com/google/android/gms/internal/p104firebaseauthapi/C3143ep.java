package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ep */
/* loaded from: classes2.dex */
final class C3143ep implements InterfaceC3592w {

    /* renamed from: a */
    private static final C3143ep f8438a = new C3143ep();

    private C3143ep() {
    }

    /* renamed from: c */
    public static C3143ep m31170c() {
        return f8438a;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3592w
    /* renamed from: a */
    public final InterfaceC3566v mo30105a(Class<?> cls) {
        if (!AbstractC3251ip.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (InterfaceC3566v) AbstractC3251ip.m30946o(cls.asSubclass(AbstractC3251ip.class)).mo29964j(3, null, null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3592w
    /* renamed from: b */
    public final boolean mo30104b(Class<?> cls) {
        return AbstractC3251ip.class.isAssignableFrom(cls);
    }
}
