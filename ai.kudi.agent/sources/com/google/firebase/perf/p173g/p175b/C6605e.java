package com.google.firebase.perf.p173g.p175b;

import com.google.firebase.perf.session.gauges.GaugeManager;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
/* compiled from: FirebasePerformanceModule_ProvidesGaugeManagerFactory.java */
/* renamed from: com.google.firebase.perf.g.b.e */
/* loaded from: classes2.dex */
public final class C6605e implements InterfaceC9468d<GaugeManager> {

    /* renamed from: a */
    private final C6601a f15919a;

    public C6605e(C6601a c6601a) {
        this.f15919a = c6601a;
    }

    /* renamed from: a */
    public static C6605e m21491a(C6601a c6601a) {
        return new C6605e(c6601a);
    }

    /* renamed from: c */
    public static GaugeManager m21489c(C6601a c6601a) {
        GaugeManager m21504d = c6601a.m21504d();
        C9473g.m14649c(m21504d, "Cannot return null from a non-@Nullable @Provides method");
        return m21504d;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public GaugeManager get() {
        return m21489c(this.f15919a);
    }
}
