package com.google.firebase.perf.p173g.p175b;

import com.google.firebase.p170o.InterfaceC6560b;
import com.google.firebase.remoteconfig.C6772o;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
/* compiled from: FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory.java */
/* renamed from: com.google.firebase.perf.g.b.f */
/* loaded from: classes2.dex */
public final class C6606f implements InterfaceC9468d<InterfaceC6560b<C6772o>> {

    /* renamed from: a */
    private final C6601a f15920a;

    public C6606f(C6601a c6601a) {
        this.f15920a = c6601a;
    }

    /* renamed from: a */
    public static C6606f m21488a(C6601a c6601a) {
        return new C6606f(c6601a);
    }

    /* renamed from: c */
    public static InterfaceC6560b<C6772o> m21486c(C6601a c6601a) {
        InterfaceC6560b<C6772o> m21503e = c6601a.m21503e();
        C9473g.m14649c(m21503e, "Cannot return null from a non-@Nullable @Provides method");
        return m21503e;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public InterfaceC6560b<C6772o> get() {
        return m21486c(this.f15920a);
    }
}
