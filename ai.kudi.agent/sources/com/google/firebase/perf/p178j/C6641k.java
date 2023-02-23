package com.google.firebase.perf.p178j;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.perf.p176h.C6609a;
import p565l.C14231t;
/* compiled from: Utils.java */
/* renamed from: com.google.firebase.perf.j.k */
/* loaded from: classes2.dex */
public class C6641k {

    /* renamed from: a */
    private static Boolean f16017a;

    /* renamed from: a */
    public static void m21393a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static boolean m21392b(Context context) {
        Boolean bool = f16017a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f16017a = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            C6609a m21475e = C6609a.m21475e();
            m21475e.m21479a("No perf logcat meta data found " + e.getMessage());
            return false;
        }
    }

    /* renamed from: c */
    public static int m21391c(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: d */
    public static String m21390d(String str) {
        C14231t m2511r = C14231t.m2511r(str);
        if (m2511r != null) {
            C14231t.C14232a m2513p = m2511r.m2513p();
            m2513p.m2479x("");
            m2513p.m2490m("");
            m2513p.m2485r(null);
            m2513p.m2496g(null);
            return m2513p.toString();
        }
        return str;
    }

    /* renamed from: e */
    public static String m21389e(String str, int i) {
        int lastIndexOf;
        if (str.length() <= i) {
            return str;
        }
        if (str.charAt(i) == '/') {
            return str.substring(0, i);
        }
        C14231t m2511r = C14231t.m2511r(str);
        if (m2511r == null) {
            return str.substring(0, i);
        }
        if (m2511r.m2521h().lastIndexOf(47) >= 0 && (lastIndexOf = str.lastIndexOf(47, i - 1)) >= 0) {
            return str.substring(0, lastIndexOf);
        }
        return str.substring(0, i);
    }
}
