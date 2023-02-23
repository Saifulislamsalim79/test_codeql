package com.google.firebase.components;
/* compiled from: Preconditions.java */
/* renamed from: com.google.firebase.components.z */
/* loaded from: classes2.dex */
public final class C5318z {
    /* renamed from: a */
    public static void m25140a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static <T> T m25139b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: c */
    public static <T> T m25138c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static void m25137d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
