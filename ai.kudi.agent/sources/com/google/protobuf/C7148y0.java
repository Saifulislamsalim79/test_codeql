package com.google.protobuf;
/* compiled from: NewInstanceSchemas.java */
/* renamed from: com.google.protobuf.y0 */
/* loaded from: classes2.dex */
final class C7148y0 {

    /* renamed from: a */
    private static final InterfaceC7138w0 f17100a = m19337c();

    /* renamed from: b */
    private static final InterfaceC7138w0 f17101b = new C7140x0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC7138w0 m19339a() {
        return f17100a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC7138w0 m19338b() {
        return f17101b;
    }

    /* renamed from: c */
    private static InterfaceC7138w0 m19337c() {
        try {
            return (InterfaceC7138w0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
