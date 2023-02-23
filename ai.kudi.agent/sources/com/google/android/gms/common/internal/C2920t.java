package com.google.android.gms.common.internal;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.t */
/* loaded from: classes2.dex */
public final class C2920t {

    /* renamed from: b */
    private static C2920t f8068b;

    /* renamed from: c */
    private static final C2923u f8069c = new C2923u(0, false, false, 0, 0);

    /* renamed from: a */
    private C2923u f8070a;

    private C2920t() {
    }

    /* renamed from: b */
    public static synchronized C2920t m31637b() {
        C2920t c2920t;
        synchronized (C2920t.class) {
            if (f8068b == null) {
                f8068b = new C2920t();
            }
            c2920t = f8068b;
        }
        return c2920t;
    }

    /* renamed from: a */
    public C2923u m31638a() {
        return this.f8070a;
    }

    /* renamed from: c */
    public final synchronized void m31636c(C2923u c2923u) {
        if (c2923u == null) {
            this.f8070a = f8069c;
            return;
        }
        C2923u c2923u2 = this.f8070a;
        if (c2923u2 == null || c2923u2.m31621s() < c2923u.m31621s()) {
            this.f8070a = c2923u;
        }
    }
}
