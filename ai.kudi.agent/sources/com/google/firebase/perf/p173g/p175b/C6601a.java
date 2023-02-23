package com.google.firebase.perf.p173g.p175b;

import com.google.firebase.C5988g;
import com.google.firebase.installations.InterfaceC6432h;
import com.google.firebase.p170o.InterfaceC6560b;
import com.google.firebase.perf.config.C6569d;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.remoteconfig.C6772o;
import p272h.p286c.p287a.p288a.InterfaceC8241g;
/* compiled from: FirebasePerformanceModule.java */
/* renamed from: com.google.firebase.perf.g.b.a */
/* loaded from: classes2.dex */
public class C6601a {

    /* renamed from: a */
    private final C5988g f15912a;

    /* renamed from: b */
    private final InterfaceC6432h f15913b;

    /* renamed from: c */
    private final InterfaceC6560b<C6772o> f15914c;

    /* renamed from: d */
    private final InterfaceC6560b<InterfaceC8241g> f15915d;

    public C6601a(C5988g c5988g, InterfaceC6432h interfaceC6432h, InterfaceC6560b<C6772o> interfaceC6560b, InterfaceC6560b<InterfaceC8241g> interfaceC6560b2) {
        this.f15912a = c5988g;
        this.f15913b = interfaceC6432h;
        this.f15914c = interfaceC6560b;
        this.f15915d = interfaceC6560b2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C6569d m21507a() {
        return C6569d.m21605f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C5988g m21506b() {
        return this.f15912a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public InterfaceC6432h m21505c() {
        return this.f15913b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public GaugeManager m21504d() {
        return GaugeManager.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public InterfaceC6560b<C6772o> m21503e() {
        return this.f15914c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public RemoteConfigManager m21502f() {
        return RemoteConfigManager.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public InterfaceC6560b<InterfaceC8241g> m21501g() {
        return this.f15915d;
    }
}
