package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zo */
/* loaded from: classes2.dex */
final class C3695zo {

    /* renamed from: a */
    private static final AbstractC3643xo<?> f9169a = new C3669yo();

    /* renamed from: b */
    private static final AbstractC3643xo<?> f9170b;

    static {
        AbstractC3643xo<?> abstractC3643xo;
        try {
            abstractC3643xo = (AbstractC3643xo) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC3643xo = null;
        }
        f9170b = abstractC3643xo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC3643xo<?> m29875a() {
        AbstractC3643xo<?> abstractC3643xo = f9170b;
        if (abstractC3643xo != null) {
            return abstractC3643xo;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC3643xo<?> m29874b() {
        return f9169a;
    }
}
