package com.bumptech.glide.p086q;

import android.text.TextUtils;
import java.util.Collection;
/* compiled from: Preconditions.java */
/* renamed from: com.bumptech.glide.q.j */
/* loaded from: classes2.dex */
public final class C2380j {
    /* renamed from: a */
    public static void m33132a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static String m33131b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    /* renamed from: c */
    public static <T extends Collection<Y>, Y> T m33130c(T t) {
        if (t.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t;
    }

    /* renamed from: d */
    public static <T> T m33129d(T t) {
        m33128e(t, "Argument must not be null");
        return t;
    }

    /* renamed from: e */
    public static <T> T m33128e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
