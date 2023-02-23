package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.internal.measurement.HandlerC3698a1;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.n */
/* loaded from: classes2.dex */
abstract class AbstractC4296n {

    /* renamed from: d */
    private static volatile Handler f10481d;

    /* renamed from: a */
    private final x5 f10482a;

    /* renamed from: b */
    private final Runnable f10483b;

    /* renamed from: c */
    private volatile long f10484c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4296n(x5 x5Var) {
        com.google.android.gms.common.internal.s.j(x5Var);
        this.f10482a = x5Var;
        this.f10483b = new RunnableC4284m(this, x5Var);
    }

    /* renamed from: f */
    private final Handler m28024f() {
        Handler handler;
        if (f10481d != null) {
            return f10481d;
        }
        synchronized (AbstractC4296n.class) {
            if (f10481d == null) {
                f10481d = new HandlerC3698a1(this.f10482a.f().getMainLooper());
            }
            handler = f10481d;
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m28027b() {
        this.f10484c = 0L;
        m28024f().removeCallbacks(this.f10483b);
    }

    /* renamed from: c */
    public abstract void mo28007c();

    /* renamed from: d */
    public final void m28026d(long j) {
        m28027b();
        if (j >= 0) {
            this.f10484c = this.f10482a.c().currentTimeMillis();
            if (m28024f().postDelayed(this.f10483b, j)) {
                return;
            }
            this.f10482a.b().r().m28013b("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    /* renamed from: e */
    public final boolean m28025e() {
        return this.f10484c != 0;
    }
}
