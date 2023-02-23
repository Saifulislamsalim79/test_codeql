package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.InterfaceC2676a;
import java.util.concurrent.Executor;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8272i0;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.InterfaceC8363b;
import p472k.p473a.InterfaceC11700a;
/* compiled from: WorkInitializer_Factory.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.w */
/* loaded from: classes2.dex */
public final class C2674w implements InterfaceC8363b<C2673v> {

    /* renamed from: a */
    private final InterfaceC11700a<Executor> f7494a;

    /* renamed from: b */
    private final InterfaceC11700a<InterfaceC8272i0> f7495b;

    /* renamed from: c */
    private final InterfaceC11700a<InterfaceC2675x> f7496c;

    /* renamed from: d */
    private final InterfaceC11700a<InterfaceC2676a> f7497d;

    public C2674w(InterfaceC11700a<Executor> interfaceC11700a, InterfaceC11700a<InterfaceC8272i0> interfaceC11700a2, InterfaceC11700a<InterfaceC2675x> interfaceC11700a3, InterfaceC11700a<InterfaceC2676a> interfaceC11700a4) {
        this.f7494a = interfaceC11700a;
        this.f7495b = interfaceC11700a2;
        this.f7496c = interfaceC11700a3;
        this.f7497d = interfaceC11700a4;
    }

    /* renamed from: a */
    public static C2674w m32402a(InterfaceC11700a<Executor> interfaceC11700a, InterfaceC11700a<InterfaceC8272i0> interfaceC11700a2, InterfaceC11700a<InterfaceC2675x> interfaceC11700a3, InterfaceC11700a<InterfaceC2676a> interfaceC11700a4) {
        return new C2674w(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
    }

    /* renamed from: c */
    public static C2673v m32400c(Executor executor, InterfaceC8272i0 interfaceC8272i0, InterfaceC2675x interfaceC2675x, InterfaceC2676a interfaceC2676a) {
        return new C2673v(executor, interfaceC8272i0, interfaceC2675x, interfaceC2676a);
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C2673v get() {
        return m32400c(this.f7494a.get(), this.f7495b.get(), this.f7496c.get(), this.f7497d.get());
    }
}
