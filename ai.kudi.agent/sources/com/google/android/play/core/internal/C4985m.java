package com.google.android.play.core.internal;

import java.io.File;
/* renamed from: com.google.android.play.core.internal.m */
/* loaded from: classes2.dex */
public final class C4985m {
    /* renamed from: a */
    public static String m25921a(File file) {
        if (file.getName().endsWith(".apk")) {
            return file.getName().replaceFirst("(_\\d+)?\\.apk", "").replace("base-", "config.").replace("-", ".config.").replace(".config.master", "").replace("config.master", "");
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    /* renamed from: b */
    public static <T> void m25920b(T t, Object obj) {
        if (t == null) {
            throw new NullPointerException((String) obj);
        }
    }

    /* renamed from: c */
    public static void m25919c(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
