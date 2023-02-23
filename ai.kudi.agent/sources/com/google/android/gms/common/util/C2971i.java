package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.C2838h;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.util.i */
/* loaded from: classes2.dex */
public final class C2971i {

    /* renamed from: a */
    private static Boolean f8140a;

    /* renamed from: b */
    private static Boolean f8141b;

    /* renamed from: c */
    private static Boolean f8142c;

    /* renamed from: d */
    private static Boolean f8143d;

    /* renamed from: a */
    public static boolean m31532a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f8143d == null) {
            boolean z = false;
            if (C2974l.m31515h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f8143d = Boolean.valueOf(z);
        }
        return f8143d.booleanValue();
    }

    /* renamed from: b */
    public static boolean m31531b() {
        int i = C2838h.f7921a;
        return "user".equals(Build.TYPE);
    }

    /* renamed from: c */
    public static boolean m31530c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f8140a == null) {
            boolean z = false;
            if (C2974l.m31518e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f8140a = Boolean.valueOf(z);
        }
        return f8140a.booleanValue();
    }

    /* renamed from: d */
    public static boolean m31529d(Context context) {
        if (m31530c(context)) {
            if (!C2974l.m31516g()) {
                return true;
            }
            if (m31528e(context) && !C2974l.m31515h()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m31528e(Context context) {
        if (f8141b == null) {
            boolean z = false;
            if (C2974l.m31517f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f8141b = Boolean.valueOf(z);
        }
        return f8141b.booleanValue();
    }

    /* renamed from: f */
    public static boolean m31527f(Context context) {
        if (f8142c == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f8142c = Boolean.valueOf(z);
        }
        return f8142c.booleanValue();
    }
}
