package p272h.p286c.p287a.p288a.p289i.p290a0;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2666s;
import p272h.p286c.p287a.p288a.p289i.p292b0.InterfaceC8318a;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.C8365d;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.InterfaceC8363b;
import p472k.p473a.InterfaceC11700a;
/* compiled from: SchedulingConfigModule_ConfigFactory.java */
/* renamed from: h.c.a.a.i.a0.g */
/* loaded from: classes2.dex */
public final class C8250g implements InterfaceC8363b<AbstractC2666s> {

    /* renamed from: a */
    private final InterfaceC11700a<InterfaceC8318a> f19830a;

    public C8250g(InterfaceC11700a<InterfaceC8318a> interfaceC11700a) {
        this.f19830a = interfaceC11700a;
    }

    /* renamed from: a */
    public static AbstractC2666s m16429a(InterfaceC8318a interfaceC8318a) {
        AbstractC2666s m16430a = AbstractC8249f.m16430a(interfaceC8318a);
        C8365d.m16208c(m16430a, "Cannot return null from a non-@Nullable @Provides method");
        return m16430a;
    }

    /* renamed from: b */
    public static C8250g m16428b(InterfaceC11700a<InterfaceC8318a> interfaceC11700a) {
        return new C8250g(interfaceC11700a);
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: c */
    public AbstractC2666s get() {
        return m16429a(this.f19830a.get());
    }
}
