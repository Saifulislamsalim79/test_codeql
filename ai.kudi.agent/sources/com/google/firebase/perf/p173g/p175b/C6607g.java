package com.google.firebase.perf.p173g.p175b;

import com.google.firebase.perf.config.RemoteConfigManager;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
/* compiled from: FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory.java */
/* renamed from: com.google.firebase.perf.g.b.g */
/* loaded from: classes2.dex */
public final class C6607g implements InterfaceC9468d<RemoteConfigManager> {

    /* renamed from: a */
    private final C6601a f15921a;

    public C6607g(C6601a c6601a) {
        this.f15921a = c6601a;
    }

    /* renamed from: a */
    public static C6607g m21485a(C6601a c6601a) {
        return new C6607g(c6601a);
    }

    /* renamed from: c */
    public static RemoteConfigManager m21483c(C6601a c6601a) {
        RemoteConfigManager m21502f = c6601a.m21502f();
        C9473g.m14649c(m21502f, "Cannot return null from a non-@Nullable @Provides method");
        return m21502f;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public RemoteConfigManager get() {
        return m21483c(this.f15921a);
    }
}
