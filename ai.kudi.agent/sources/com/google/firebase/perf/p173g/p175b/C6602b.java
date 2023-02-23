package com.google.firebase.perf.p173g.p175b;

import com.google.firebase.perf.config.C6569d;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
/* compiled from: FirebasePerformanceModule_ProvidesConfigResolverFactory.java */
/* renamed from: com.google.firebase.perf.g.b.b */
/* loaded from: classes2.dex */
public final class C6602b implements InterfaceC9468d<C6569d> {

    /* renamed from: a */
    private final C6601a f15916a;

    public C6602b(C6601a c6601a) {
        this.f15916a = c6601a;
    }

    /* renamed from: a */
    public static C6602b m21500a(C6601a c6601a) {
        return new C6602b(c6601a);
    }

    /* renamed from: c */
    public static C6569d m21498c(C6601a c6601a) {
        C6569d m21507a = c6601a.m21507a();
        C9473g.m14649c(m21507a, "Cannot return null from a non-@Nullable @Provides method");
        return m21507a;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C6569d get() {
        return m21498c(this.f15916a);
    }
}
