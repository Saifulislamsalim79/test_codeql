package com.google.firebase.perf.p173g.p175b;

import com.google.firebase.installations.InterfaceC6432h;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
/* compiled from: FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory.java */
/* renamed from: com.google.firebase.perf.g.b.d */
/* loaded from: classes2.dex */
public final class C6604d implements InterfaceC9468d<InterfaceC6432h> {

    /* renamed from: a */
    private final C6601a f15918a;

    public C6604d(C6601a c6601a) {
        this.f15918a = c6601a;
    }

    /* renamed from: a */
    public static C6604d m21494a(C6601a c6601a) {
        return new C6604d(c6601a);
    }

    /* renamed from: c */
    public static InterfaceC6432h m21492c(C6601a c6601a) {
        InterfaceC6432h m21505c = c6601a.m21505c();
        C9473g.m14649c(m21505c, "Cannot return null from a non-@Nullable @Provides method");
        return m21505c;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public InterfaceC6432h get() {
        return m21492c(this.f15918a);
    }
}
