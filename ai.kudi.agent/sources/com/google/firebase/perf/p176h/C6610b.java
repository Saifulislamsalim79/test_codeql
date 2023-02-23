package com.google.firebase.perf.p176h;
/* compiled from: ConsoleUrlGenerator.java */
/* renamed from: com.google.firebase.perf.h.b */
/* loaded from: classes2.dex */
public final class C6610b {
    /* renamed from: a */
    public static String m21469a(String str, String str2, String str3) {
        return String.format("%s/metrics/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", m21466d(str, str2), str3, "perf-android-sdk", "android-ide");
    }

    /* renamed from: b */
    public static String m21468b(String str, String str2) {
        return String.format("%s/trends?utm_source=%s&utm_medium=%s", m21466d(str, str2), "perf-android-sdk", "android-ide");
    }

    /* renamed from: c */
    public static String m21467c(String str, String str2, String str3) {
        return String.format("%s/metrics/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", m21466d(str, str2), str3, "perf-android-sdk", "android-ide");
    }

    /* renamed from: d */
    private static String m21466d(String str, String str2) {
        return String.format("%s/project/%s/performance/app/android:%s", "https://console.firebase.google.com", str, str2);
    }
}
