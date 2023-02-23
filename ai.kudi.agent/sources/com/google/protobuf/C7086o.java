package com.google.protobuf;
/* compiled from: ExtensionRegistryFactory.java */
/* renamed from: com.google.protobuf.o */
/* loaded from: classes2.dex */
final class C7086o {

    /* renamed from: a */
    static final Class<?> f16909a = m19791c();

    /* renamed from: a */
    public static C7089p m19793a() {
        C7089p m19792b = m19792b("getEmptyRegistry");
        return m19792b != null ? m19792b : C7089p.f16920d;
    }

    /* renamed from: b */
    private static final C7089p m19792b(String str) {
        Class<?> cls = f16909a;
        if (cls == null) {
            return null;
        }
        try {
            return (C7089p) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    static Class<?> m19791c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
