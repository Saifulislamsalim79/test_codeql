package com.google.firebase.perf.p173g.p175b;

import com.google.firebase.p170o.InterfaceC6560b;
import p272h.p286c.p287a.p288a.InterfaceC8241g;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
/* compiled from: FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory.java */
/* renamed from: com.google.firebase.perf.g.b.h */
/* loaded from: classes2.dex */
public final class C6608h implements InterfaceC9468d<InterfaceC6560b<InterfaceC8241g>> {

    /* renamed from: a */
    private final C6601a f15922a;

    public C6608h(C6601a c6601a) {
        this.f15922a = c6601a;
    }

    /* renamed from: a */
    public static C6608h m21482a(C6601a c6601a) {
        return new C6608h(c6601a);
    }

    /* renamed from: c */
    public static InterfaceC6560b<InterfaceC8241g> m21480c(C6601a c6601a) {
        InterfaceC6560b<InterfaceC8241g> m21501g = c6601a.m21501g();
        C9473g.m14649c(m21501g, "Cannot return null from a non-@Nullable @Provides method");
        return m21501g;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public InterfaceC6560b<InterfaceC8241g> get() {
        return m21480c(this.f15922a);
    }
}
