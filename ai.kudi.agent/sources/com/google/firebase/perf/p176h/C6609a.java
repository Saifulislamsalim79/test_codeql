package com.google.firebase.perf.p176h;

import java.util.Locale;
/* compiled from: AndroidLogger.java */
/* renamed from: com.google.firebase.perf.h.a */
/* loaded from: classes2.dex */
public class C6609a {

    /* renamed from: c */
    private static volatile C6609a f15923c;

    /* renamed from: a */
    private final C6611c f15924a;

    /* renamed from: b */
    private boolean f15925b;

    public C6609a(C6611c c6611c) {
        this.f15925b = false;
        this.f15924a = c6611c == null ? C6611c.m21463c() : c6611c;
    }

    /* renamed from: e */
    public static C6609a m21475e() {
        if (f15923c == null) {
            synchronized (C6609a.class) {
                if (f15923c == null) {
                    f15923c = new C6609a();
                }
            }
        }
        return f15923c;
    }

    /* renamed from: a */
    public void m21479a(String str) {
        if (this.f15925b) {
            this.f15924a.m21465a(str);
        }
    }

    /* renamed from: b */
    public void m21478b(String str, Object... objArr) {
        if (this.f15925b) {
            this.f15924a.m21465a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: c */
    public void m21477c(String str) {
        if (this.f15925b) {
            this.f15924a.m21464b(str);
        }
    }

    /* renamed from: d */
    public void m21476d(String str, Object... objArr) {
        if (this.f15925b) {
            this.f15924a.m21464b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: f */
    public void m21474f(String str) {
        if (this.f15925b) {
            this.f15924a.m21462d(str);
        }
    }

    /* renamed from: g */
    public void m21473g(String str, Object... objArr) {
        if (this.f15925b) {
            this.f15924a.m21462d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: h */
    public void m21472h(boolean z) {
        this.f15925b = z;
    }

    /* renamed from: i */
    public void m21471i(String str) {
        if (this.f15925b) {
            this.f15924a.m21461e(str);
        }
    }

    /* renamed from: j */
    public void m21470j(String str, Object... objArr) {
        if (this.f15925b) {
            this.f15924a.m21461e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    private C6609a() {
        this(null);
    }
}
