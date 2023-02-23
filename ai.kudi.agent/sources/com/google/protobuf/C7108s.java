package com.google.protobuf;
/* compiled from: ExtensionSchemas.java */
/* renamed from: com.google.protobuf.s */
/* loaded from: classes2.dex */
final class C7108s {

    /* renamed from: a */
    private static final AbstractC7093q<?> f16942a = new C7098r();

    /* renamed from: b */
    private static final AbstractC7093q<?> f16943b = m19631c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC7093q<?> m19633a() {
        AbstractC7093q<?> abstractC7093q = f16943b;
        if (abstractC7093q != null) {
            return abstractC7093q;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC7093q<?> m19632b() {
        return f16942a;
    }

    /* renamed from: c */
    private static AbstractC7093q<?> m19631c() {
        try {
            return (AbstractC7093q) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
