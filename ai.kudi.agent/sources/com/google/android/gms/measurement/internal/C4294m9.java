package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC3698a1;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.m9 */
/* loaded from: classes2.dex */
public final class C4294m9 extends f4 {

    /* renamed from: c */
    private Handler f10475c;

    /* renamed from: d */
    protected final C4282l9 f10476d;

    /* renamed from: e */
    protected final C4270k9 f10477e;

    /* renamed from: f */
    protected final C4235h9 f10478f;

    C4294m9(b5 b5Var) {
        super(b5Var);
        this.f10476d = new C4282l9(this);
        this.f10477e = new C4270k9(this);
        this.f10478f = new C4235h9(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static /* bridge */ /* synthetic */ void m28031q(C4294m9 c4294m9, long j) {
        c4294m9.h();
        c4294m9.m28029s();
        ((v5) c4294m9).a.b().v().m28013b("Activity paused, time", Long.valueOf(j));
        c4294m9.f10478f.m28175a(j);
        if (((v5) c4294m9).a.z().D()) {
            c4294m9.f10477e.m28054b(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static /* bridge */ /* synthetic */ void m28030r(C4294m9 c4294m9, long j) {
        c4294m9.h();
        c4294m9.m28029s();
        ((v5) c4294m9).a.b().v().m28013b("Activity resumed, time", Long.valueOf(j));
        if (((v5) c4294m9).a.z().D() || ((v5) c4294m9).a.F().q.m27805b()) {
            c4294m9.f10477e.m28053c(j);
        }
        c4294m9.f10478f.m28174b();
        C4282l9 c4282l9 = c4294m9.f10476d;
        c4282l9.f10458a.h();
        if (((v5) c4282l9.f10458a).a.o()) {
            c4282l9.m28038b(((v5) c4282l9.f10458a).a.c().currentTimeMillis(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final void m28029s() {
        h();
        if (this.f10475c == null) {
            this.f10475c = new HandlerC3698a1(Looper.getMainLooper());
        }
    }

    /* renamed from: n */
    protected final boolean m28034n() {
        return false;
    }
}
