package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.c8 */
/* loaded from: classes2.dex */
final class C3738c8 {

    /* renamed from: a */
    private static final AbstractC3705a8<?> f9223a = new C3722b8();

    /* renamed from: b */
    private static final AbstractC3705a8<?> f9224b;

    static {
        AbstractC3705a8<?> abstractC3705a8;
        try {
            abstractC3705a8 = (AbstractC3705a8) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC3705a8 = null;
        }
        f9224b = abstractC3705a8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC3705a8<?> m29714a() {
        AbstractC3705a8<?> abstractC3705a8 = f9224b;
        if (abstractC3705a8 != null) {
            return abstractC3705a8;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC3705a8<?> m29713b() {
        return f9223a;
    }
}
