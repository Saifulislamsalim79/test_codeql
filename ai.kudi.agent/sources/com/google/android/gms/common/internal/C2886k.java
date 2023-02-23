package com.google.android.gms.common.internal;

import android.util.Log;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.k */
/* loaded from: classes2.dex */
public final class C2886k {

    /* renamed from: a */
    private final String f8022a;

    /* renamed from: b */
    private final String f8023b;

    public C2886k(String str) {
        this(str, null);
    }

    /* renamed from: g */
    private final String m31709g(String str) {
        String str2 = this.f8023b;
        return str2 == null ? str : str2.concat(str);
    }

    /* renamed from: a */
    public boolean m31715a(int i) {
        return Log.isLoggable(this.f8022a, i);
    }

    /* renamed from: b */
    public void m31714b(String str, String str2) {
        if (m31715a(3)) {
            Log.d(str, m31709g(str2));
        }
    }

    /* renamed from: c */
    public void m31713c(String str, String str2) {
        if (m31715a(6)) {
            Log.e(str, m31709g(str2));
        }
    }

    /* renamed from: d */
    public void m31712d(String str, String str2, Throwable th) {
        if (m31715a(6)) {
            Log.e(str, m31709g(str2), th);
        }
    }

    /* renamed from: e */
    public void m31711e(String str, String str2) {
        if (m31715a(2)) {
            Log.v(str, m31709g(str2));
        }
    }

    /* renamed from: f */
    public void m31710f(String str, String str2) {
        if (m31715a(5)) {
            Log.w(str, m31709g(str2));
        }
    }

    public C2886k(String str, String str2) {
        s.k(str, "log tag cannot be null");
        s.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", new Object[]{str, 23});
        this.f8022a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f8023b = null;
        } else {
            this.f8023b = str2;
        }
    }
}
