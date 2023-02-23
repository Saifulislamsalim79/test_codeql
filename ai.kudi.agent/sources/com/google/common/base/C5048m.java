package com.google.common.base;

import java.util.Locale;
import java.util.logging.Logger;
/* compiled from: Platform.java */
/* renamed from: com.google.common.base.m */
/* loaded from: classes2.dex */
final class C5048m {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Platform.java */
    /* renamed from: com.google.common.base.m$b */
    /* loaded from: classes2.dex */
    public static final class C5050b implements InterfaceC5047l {
        private C5050b() {
        }
    }

    static {
        Logger.getLogger(C5048m.class.getName());
        m25796c();
    }

    private C5048m() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m25798a(String str) {
        if (m25795d(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m25797b(double d) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d));
    }

    /* renamed from: c */
    private static InterfaceC5047l m25796c() {
        return new C5050b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m25795d(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static long m25794e() {
        return System.nanoTime();
    }
}
