package com.google.firebase.crashlytics.p112h;

import android.util.Log;
/* compiled from: Logger.java */
/* renamed from: com.google.firebase.crashlytics.h.f */
/* loaded from: classes2.dex */
public class C5335f {

    /* renamed from: c */
    static final C5335f f13186c = new C5335f("FirebaseCrashlytics");

    /* renamed from: a */
    private final String f13187a;

    /* renamed from: b */
    private int f13188b = 4;

    public C5335f(String str) {
        this.f13187a = str;
    }

    /* renamed from: a */
    private boolean m25107a(int i) {
        return this.f13188b <= i || Log.isLoggable(this.f13187a, i);
    }

    /* renamed from: f */
    public static C5335f m25102f() {
        return f13186c;
    }

    /* renamed from: b */
    public void m25106b(String str) {
        m25105c(str, null);
    }

    /* renamed from: c */
    public void m25105c(String str, Throwable th) {
        if (m25107a(3)) {
            Log.d(this.f13187a, str, th);
        }
    }

    /* renamed from: d */
    public void m25104d(String str) {
        m25103e(str, null);
    }

    /* renamed from: e */
    public void m25103e(String str, Throwable th) {
        if (m25107a(6)) {
            Log.e(this.f13187a, str, th);
        }
    }

    /* renamed from: g */
    public void m25101g(String str) {
        m25100h(str, null);
    }

    /* renamed from: h */
    public void m25100h(String str, Throwable th) {
        if (m25107a(4)) {
            Log.i(this.f13187a, str, th);
        }
    }

    /* renamed from: i */
    public void m25099i(String str) {
        m25098j(str, null);
    }

    /* renamed from: j */
    public void m25098j(String str, Throwable th) {
        if (m25107a(2)) {
            Log.v(this.f13187a, str, th);
        }
    }

    /* renamed from: k */
    public void m25097k(String str) {
        m25096l(str, null);
    }

    /* renamed from: l */
    public void m25096l(String str, Throwable th) {
        if (m25107a(5)) {
            Log.w(this.f13187a, str, th);
        }
    }
}
