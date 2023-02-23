package com.google.protobuf;
/* compiled from: GeneratedMessageInfoFactory.java */
/* renamed from: com.google.protobuf.x */
/* loaded from: classes2.dex */
class C7139x implements InterfaceC7094q0 {

    /* renamed from: a */
    private static final C7139x f17080a = new C7139x();

    private C7139x() {
    }

    /* renamed from: c */
    public static C7139x m19396c() {
        return f17080a;
    }

    @Override // com.google.protobuf.InterfaceC7094q0
    /* renamed from: a */
    public InterfaceC7091p0 mo19398a(Class<?> cls) {
        if (AbstractC7141y.class.isAssignableFrom(cls)) {
            try {
                return (InterfaceC7091p0) AbstractC7141y.m19391E(cls.asSubclass(AbstractC7141y.class)).m19373w();
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    @Override // com.google.protobuf.InterfaceC7094q0
    /* renamed from: b */
    public boolean mo19397b(Class<?> cls) {
        return AbstractC7141y.class.isAssignableFrom(cls);
    }
}
