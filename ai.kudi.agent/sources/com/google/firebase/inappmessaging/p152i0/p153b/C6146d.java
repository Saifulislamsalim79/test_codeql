package com.google.firebase.inappmessaging.p152i0.p153b;
/* compiled from: Preconditions.java */
/* renamed from: com.google.firebase.inappmessaging.i0.b.d */
/* loaded from: classes2.dex */
public final class C6146d {
    /* renamed from: a */
    public static <T> void m22629a(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static <T> T m22628b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: c */
    public static <T> T m22627c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
