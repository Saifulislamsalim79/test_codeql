package com.google.firebase.perf;

import com.google.firebase.C5988g;
import com.google.firebase.installations.InterfaceC6432h;
import com.google.firebase.p170o.InterfaceC6560b;
import com.google.firebase.perf.config.C6569d;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.remoteconfig.C6772o;
import p272h.p286c.p287a.p288a.InterfaceC8241g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* compiled from: FirebasePerformance_Factory.java */
/* renamed from: com.google.firebase.perf.e */
/* loaded from: classes2.dex */
public final class C6592e implements InterfaceC9468d<C6565c> {

    /* renamed from: a */
    private final InterfaceC11700a<C5988g> f15878a;

    /* renamed from: b */
    private final InterfaceC11700a<InterfaceC6560b<C6772o>> f15879b;

    /* renamed from: c */
    private final InterfaceC11700a<InterfaceC6432h> f15880c;

    /* renamed from: d */
    private final InterfaceC11700a<InterfaceC6560b<InterfaceC8241g>> f15881d;

    /* renamed from: e */
    private final InterfaceC11700a<RemoteConfigManager> f15882e;

    /* renamed from: f */
    private final InterfaceC11700a<C6569d> f15883f;

    /* renamed from: g */
    private final InterfaceC11700a<GaugeManager> f15884g;

    public C6592e(InterfaceC11700a<C5988g> interfaceC11700a, InterfaceC11700a<InterfaceC6560b<C6772o>> interfaceC11700a2, InterfaceC11700a<InterfaceC6432h> interfaceC11700a3, InterfaceC11700a<InterfaceC6560b<InterfaceC8241g>> interfaceC11700a4, InterfaceC11700a<RemoteConfigManager> interfaceC11700a5, InterfaceC11700a<C6569d> interfaceC11700a6, InterfaceC11700a<GaugeManager> interfaceC11700a7) {
        this.f15878a = interfaceC11700a;
        this.f15879b = interfaceC11700a2;
        this.f15880c = interfaceC11700a3;
        this.f15881d = interfaceC11700a4;
        this.f15882e = interfaceC11700a5;
        this.f15883f = interfaceC11700a6;
        this.f15884g = interfaceC11700a7;
    }

    /* renamed from: a */
    public static C6592e m21532a(InterfaceC11700a<C5988g> interfaceC11700a, InterfaceC11700a<InterfaceC6560b<C6772o>> interfaceC11700a2, InterfaceC11700a<InterfaceC6432h> interfaceC11700a3, InterfaceC11700a<InterfaceC6560b<InterfaceC8241g>> interfaceC11700a4, InterfaceC11700a<RemoteConfigManager> interfaceC11700a5, InterfaceC11700a<C6569d> interfaceC11700a6, InterfaceC11700a<GaugeManager> interfaceC11700a7) {
        return new C6592e(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7);
    }

    /* renamed from: c */
    public static C6565c m21530c(C5988g c5988g, InterfaceC6560b<C6772o> interfaceC6560b, InterfaceC6432h interfaceC6432h, InterfaceC6560b<InterfaceC8241g> interfaceC6560b2, RemoteConfigManager remoteConfigManager, C6569d c6569d, GaugeManager gaugeManager) {
        return new C6565c(c5988g, interfaceC6560b, interfaceC6432h, interfaceC6560b2, remoteConfigManager, c6569d, gaugeManager);
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C6565c get() {
        return m21530c(this.f15878a.get(), this.f15879b.get(), this.f15880c.get(), this.f15881d.get(), this.f15882e.get(), this.f15883f.get(), this.f15884g.get());
    }
}
