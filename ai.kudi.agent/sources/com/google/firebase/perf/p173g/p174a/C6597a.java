package com.google.firebase.perf.p173g.p174a;

import com.google.firebase.C5988g;
import com.google.firebase.installations.InterfaceC6432h;
import com.google.firebase.p170o.InterfaceC6560b;
import com.google.firebase.perf.C6565c;
import com.google.firebase.perf.C6592e;
import com.google.firebase.perf.config.C6569d;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.p173g.p175b.C6601a;
import com.google.firebase.perf.p173g.p175b.C6602b;
import com.google.firebase.perf.p173g.p175b.C6603c;
import com.google.firebase.perf.p173g.p175b.C6604d;
import com.google.firebase.perf.p173g.p175b.C6605e;
import com.google.firebase.perf.p173g.p175b.C6606f;
import com.google.firebase.perf.p173g.p175b.C6607g;
import com.google.firebase.perf.p173g.p175b.C6608h;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.remoteconfig.C6772o;
import p272h.p286c.p287a.p288a.InterfaceC8241g;
import p382i.p383b.C9467c;
import p382i.p383b.C9473g;
import p472k.p473a.InterfaceC11700a;
/* compiled from: DaggerFirebasePerformanceComponent.java */
/* renamed from: com.google.firebase.perf.g.a.a */
/* loaded from: classes2.dex */
public final class C6597a implements InterfaceC6600b {

    /* renamed from: a */
    private InterfaceC11700a<C5988g> f15903a;

    /* renamed from: b */
    private InterfaceC11700a<InterfaceC6560b<C6772o>> f15904b;

    /* renamed from: c */
    private InterfaceC11700a<InterfaceC6432h> f15905c;

    /* renamed from: d */
    private InterfaceC11700a<InterfaceC6560b<InterfaceC8241g>> f15906d;

    /* renamed from: e */
    private InterfaceC11700a<RemoteConfigManager> f15907e;

    /* renamed from: f */
    private InterfaceC11700a<C6569d> f15908f;

    /* renamed from: g */
    private InterfaceC11700a<GaugeManager> f15909g;

    /* renamed from: h */
    private InterfaceC11700a<C6565c> f15910h;

    /* compiled from: DaggerFirebasePerformanceComponent.java */
    /* renamed from: com.google.firebase.perf.g.a.a$b */
    /* loaded from: classes2.dex */
    public static final class C6599b {

        /* renamed from: a */
        private C6601a f15911a;

        /* renamed from: a */
        public InterfaceC6600b m21510a() {
            C9473g.m14651a(this.f15911a, C6601a.class);
            return new C6597a(this.f15911a);
        }

        /* renamed from: b */
        public C6599b m21509b(C6601a c6601a) {
            C9473g.m14650b(c6601a);
            this.f15911a = c6601a;
            return this;
        }

        private C6599b() {
        }
    }

    /* renamed from: b */
    public static C6599b m21512b() {
        return new C6599b();
    }

    /* renamed from: c */
    private void m21511c(C6601a c6601a) {
        this.f15903a = C6603c.m21497a(c6601a);
        this.f15904b = C6606f.m21488a(c6601a);
        this.f15905c = C6604d.m21494a(c6601a);
        this.f15906d = C6608h.m21482a(c6601a);
        this.f15907e = C6607g.m21485a(c6601a);
        this.f15908f = C6602b.m21500a(c6601a);
        C6605e m21491a = C6605e.m21491a(c6601a);
        this.f15909g = m21491a;
        this.f15910h = C9467c.m14658a(C6592e.m21532a(this.f15903a, this.f15904b, this.f15905c, this.f15906d, this.f15907e, this.f15908f, m21491a));
    }

    @Override // com.google.firebase.perf.p173g.p174a.InterfaceC6600b
    /* renamed from: a */
    public C6565c mo21508a() {
        return this.f15910h.get();
    }

    private C6597a(C6601a c6601a) {
        m21511c(c6601a);
    }
}
