package p272h.p286c.p287a.p288a.p289i.p290a0.p291j;

import p272h.p286c.p287a.p288a.p289i.p294w.p295b.C8365d;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.InterfaceC8363b;
/* compiled from: EventStoreModule_StoreConfigFactory.java */
/* renamed from: h.c.a.a.i.a0.j.o0 */
/* loaded from: classes2.dex */
public final class C8287o0 implements InterfaceC8363b<AbstractC8274j0> {

    /* compiled from: EventStoreModule_StoreConfigFactory.java */
    /* renamed from: h.c.a.a.i.a0.j.o0$a */
    /* loaded from: classes2.dex */
    private static final class C8288a {

        /* renamed from: a */
        private static final C8287o0 f19887a = new C8287o0();
    }

    /* renamed from: a */
    public static C8287o0 m16395a() {
        return C8288a.f19887a;
    }

    /* renamed from: c */
    public static AbstractC8274j0 m16393c() {
        AbstractC8274j0 m16407d = AbstractC8277k0.m16407d();
        C8365d.m16208c(m16407d, "Cannot return null from a non-@Nullable @Provides method");
        return m16407d;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public AbstractC8274j0 get() {
        return m16393c();
    }
}
