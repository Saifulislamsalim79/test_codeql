package com.google.firebase.perf.p173g.p175b;

import com.google.firebase.C5988g;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
/* compiled from: FirebasePerformanceModule_ProvidesFirebaseAppFactory.java */
/* renamed from: com.google.firebase.perf.g.b.c */
/* loaded from: classes2.dex */
public final class C6603c implements InterfaceC9468d<C5988g> {

    /* renamed from: a */
    private final C6601a f15917a;

    public C6603c(C6601a c6601a) {
        this.f15917a = c6601a;
    }

    /* renamed from: a */
    public static C6603c m21497a(C6601a c6601a) {
        return new C6603c(c6601a);
    }

    /* renamed from: c */
    public static C5988g m21495c(C6601a c6601a) {
        C5988g m21506b = c6601a.m21506b();
        C9473g.m14649c(m21506b, "Cannot return null from a non-@Nullable @Provides method");
        return m21506b;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C5988g get() {
        return m21495c(this.f15917a);
    }
}
