package io.intercom.com.bumptech.glide.p416r;

import android.text.TextUtils;
import java.util.Collection;
/* compiled from: Preconditions.java */
/* renamed from: io.intercom.com.bumptech.glide.r.h */
/* loaded from: classes3.dex */
public final class C10892h {
    /* renamed from: a */
    public static void m12017a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static String m12016b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    /* renamed from: c */
    public static <T extends Collection<Y>, Y> T m12015c(T t) {
        if (t.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t;
    }

    /* renamed from: d */
    public static <T> T m12014d(T t) {
        m12013e(t, "Argument must not be null");
        return t;
    }

    /* renamed from: e */
    public static <T> T m12013e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
