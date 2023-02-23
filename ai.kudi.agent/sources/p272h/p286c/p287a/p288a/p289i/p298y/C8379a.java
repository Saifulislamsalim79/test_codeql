package p272h.p286c.p287a.p288a.p289i.p298y;

import android.util.Log;
/* compiled from: Logging.java */
/* renamed from: h.c.a.a.i.y.a */
/* loaded from: classes2.dex */
public final class C8379a {
    /* renamed from: a */
    public static void m16167a(String str, String str2, Object obj) {
        Log.d(m16164d(str), String.format(str2, obj));
    }

    /* renamed from: b */
    public static void m16166b(String str, String str2, Object... objArr) {
        Log.d(m16164d(str), String.format(str2, objArr));
    }

    /* renamed from: c */
    public static void m16165c(String str, String str2, Throwable th) {
        Log.e(m16164d(str), str2, th);
    }

    /* renamed from: d */
    private static String m16164d(String str) {
        return "TransportRuntime." + str;
    }

    /* renamed from: e */
    public static void m16163e(String str, String str2) {
        Log.i(m16164d(str), str2);
    }

    /* renamed from: f */
    public static void m16162f(String str, String str2, Object obj) {
        Log.w(m16164d(str), String.format(str2, obj));
    }
}
