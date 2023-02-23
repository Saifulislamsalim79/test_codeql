package com.google.protobuf;
/* compiled from: Android.java */
/* renamed from: com.google.protobuf.d */
/* loaded from: classes2.dex */
final class C7014d {

    /* renamed from: a */
    private static boolean f16775a;

    /* renamed from: b */
    private static final Class<?> f16776b = m20218a("libcore.io.Memory");

    /* renamed from: c */
    private static final boolean f16777c;

    static {
        f16777c = (f16775a || m20218a("org.robolectric.Robolectric") == null) ? false : true;
    }

    /* renamed from: a */
    private static <T> Class<T> m20218a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Class<?> m20217b() {
        return f16776b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m20216c() {
        return f16775a || !(f16776b == null || f16777c);
    }
}
