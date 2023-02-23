package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.p099l.C2946a;
import com.google.android.gms.common.util.C2970h;
import com.google.android.gms.internal.p104firebaseauthapi.HandlerC3498s9;
import com.google.firebase.C5988g;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.l */
/* loaded from: classes2.dex */
public final class C5233l {

    /* renamed from: h */
    private static final C2946a f13015h = new C2946a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a */
    private final C5988g f13016a;

    /* renamed from: b */
    volatile long f13017b;

    /* renamed from: c */
    volatile long f13018c;

    /* renamed from: d */
    final long f13019d;

    /* renamed from: e */
    final HandlerThread f13020e;

    /* renamed from: f */
    final Handler f13021f;

    /* renamed from: g */
    final Runnable f13022g;

    public C5233l(C5988g c5988g) {
        f13015h.m31579g("Initializing TokenRefresher", new Object[0]);
        com.google.android.gms.common.internal.s.j(c5988g);
        this.f13016a = c5988g;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f13020e = handlerThread;
        handlerThread.start();
        this.f13021f = new HandlerC3498s9(this.f13020e.getLooper());
        this.f13022g = new RunnableC5231k(this, this.f13016a.m23090l());
        this.f13019d = 300000L;
    }

    /* renamed from: b */
    public final void m25320b() {
        this.f13021f.removeCallbacks(this.f13022g);
    }

    /* renamed from: c */
    public final void m25319c() {
        C2946a c2946a = f13015h;
        long j = this.f13017b;
        long j2 = this.f13019d;
        StringBuilder sb = new StringBuilder(43);
        sb.append("Scheduling refresh for ");
        sb.append(j - j2);
        c2946a.m31579g(sb.toString(), new Object[0]);
        m25320b();
        this.f13018c = Math.max((this.f13017b - C2970h.m31533c().currentTimeMillis()) - this.f13019d, 0L) / 1000;
        this.f13021f.postDelayed(this.f13022g, this.f13018c * 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m25318d() {
        long j;
        int i = (int) this.f13018c;
        if (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) {
            long j2 = this.f13018c;
            j = j2 + j2;
        } else {
            j = i != 960 ? 30L : 960L;
        }
        this.f13018c = j;
        this.f13017b = C2970h.m31533c().currentTimeMillis() + (this.f13018c * 1000);
        C2946a c2946a = f13015h;
        long j3 = this.f13017b;
        StringBuilder sb = new StringBuilder(43);
        sb.append("Scheduling refresh for ");
        sb.append(j3);
        c2946a.m31579g(sb.toString(), new Object[0]);
        this.f13021f.postDelayed(this.f13022g, this.f13018c * 1000);
    }
}
