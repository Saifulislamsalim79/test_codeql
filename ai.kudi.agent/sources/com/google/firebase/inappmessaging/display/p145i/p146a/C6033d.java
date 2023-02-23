package com.google.firebase.inappmessaging.display.p145i.p146a;
/* compiled from: Preconditions.java */
/* renamed from: com.google.firebase.inappmessaging.display.i.a.d */
/* loaded from: classes2.dex */
public final class C6033d {
    /* renamed from: a */
    public static <T> void m22947a(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static <T> T m22946b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: c */
    public static <T> T m22945c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
