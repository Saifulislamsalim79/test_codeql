package com.google.protobuf;
/* compiled from: MapFieldSchemas.java */
/* renamed from: com.google.protobuf.o0 */
/* loaded from: classes2.dex */
final class C7087o0 {

    /* renamed from: a */
    private static final InterfaceC7079m0 f16910a = m19788c();

    /* renamed from: b */
    private static final InterfaceC7079m0 f16911b = new C7084n0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC7079m0 m19790a() {
        return f16910a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC7079m0 m19789b() {
        return f16911b;
    }

    /* renamed from: c */
    private static InterfaceC7079m0 m19788c() {
        try {
            return (InterfaceC7079m0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
