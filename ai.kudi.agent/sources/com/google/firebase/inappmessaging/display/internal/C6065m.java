package com.google.firebase.inappmessaging.display.internal;

import android.util.Log;
/* compiled from: Logging.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.m */
/* loaded from: classes2.dex */
public class C6065m {
    /* renamed from: a */
    public static void m22821a(String str) {
        if (Log.isLoggable("FIAM.Display", 3)) {
            Log.d("FIAM.Display", str);
        }
    }

    /* renamed from: b */
    public static void m22820b(String str) {
        m22821a("============ " + str + " ============");
    }

    /* renamed from: c */
    public static void m22819c(String str, float f) {
        m22821a(str + ": " + f);
    }

    /* renamed from: d */
    public static void m22818d(String str, float f, float f2) {
        m22821a(str + ": (" + f + ", " + f2 + ")");
    }

    /* renamed from: e */
    public static void m22817e(String str) {
        Log.e("FIAM.Display", str);
    }

    /* renamed from: f */
    public static void m22816f(String str) {
        if (Log.isLoggable("FIAM.Display", 4)) {
            Log.i("FIAM.Display", str);
        }
    }
}
