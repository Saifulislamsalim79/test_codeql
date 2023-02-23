package p272h.p286c.p287a.p288a.p289i.p290a0;

import com.google.android.datatransport.runtime.backends.InterfaceC2634e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC2675x;
import com.google.android.datatransport.runtime.synchronization.InterfaceC2676a;
import java.util.concurrent.Executor;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8272i0;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.InterfaceC8363b;
import p472k.p473a.InterfaceC11700a;
/* compiled from: DefaultScheduler_Factory.java */
/* renamed from: h.c.a.a.i.a0.d */
/* loaded from: classes2.dex */
public final class C8247d implements InterfaceC8363b<C8246c> {

    /* renamed from: a */
    private final InterfaceC11700a<Executor> f19825a;

    /* renamed from: b */
    private final InterfaceC11700a<InterfaceC2634e> f19826b;

    /* renamed from: c */
    private final InterfaceC11700a<InterfaceC2675x> f19827c;

    /* renamed from: d */
    private final InterfaceC11700a<InterfaceC8272i0> f19828d;

    /* renamed from: e */
    private final InterfaceC11700a<InterfaceC2676a> f19829e;

    public C8247d(InterfaceC11700a<Executor> interfaceC11700a, InterfaceC11700a<InterfaceC2634e> interfaceC11700a2, InterfaceC11700a<InterfaceC2675x> interfaceC11700a3, InterfaceC11700a<InterfaceC8272i0> interfaceC11700a4, InterfaceC11700a<InterfaceC2676a> interfaceC11700a5) {
        this.f19825a = interfaceC11700a;
        this.f19826b = interfaceC11700a2;
        this.f19827c = interfaceC11700a3;
        this.f19828d = interfaceC11700a4;
        this.f19829e = interfaceC11700a5;
    }

    /* renamed from: a */
    public static C8247d m16434a(InterfaceC11700a<Executor> interfaceC11700a, InterfaceC11700a<InterfaceC2634e> interfaceC11700a2, InterfaceC11700a<InterfaceC2675x> interfaceC11700a3, InterfaceC11700a<InterfaceC8272i0> interfaceC11700a4, InterfaceC11700a<InterfaceC2676a> interfaceC11700a5) {
        return new C8247d(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
    }

    /* renamed from: c */
    public static C8246c m16432c(Executor executor, InterfaceC2634e interfaceC2634e, InterfaceC2675x interfaceC2675x, InterfaceC8272i0 interfaceC8272i0, InterfaceC2676a interfaceC2676a) {
        return new C8246c(executor, interfaceC2634e, interfaceC2675x, interfaceC8272i0, interfaceC2676a);
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C8246c get() {
        return m16432c(this.f19825a.get(), this.f19826b.get(), this.f19827c.get(), this.f19828d.get(), this.f19829e.get());
    }
}
