package p272h.p286c.p287a.p288a.p289i.p290a0.p291j;

import p272h.p286c.p287a.p288a.p289i.p294w.p295b.C8365d;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.InterfaceC8363b;
/* compiled from: EventStoreModule_DbNameFactory.java */
/* renamed from: h.c.a.a.i.a0.j.l0 */
/* loaded from: classes2.dex */
public final class C8279l0 implements InterfaceC8363b<String> {

    /* compiled from: EventStoreModule_DbNameFactory.java */
    /* renamed from: h.c.a.a.i.a0.j.l0$a */
    /* loaded from: classes2.dex */
    private static final class C8280a {

        /* renamed from: a */
        private static final C8279l0 f19880a = new C8279l0();
    }

    /* renamed from: a */
    public static C8279l0 m16406a() {
        return C8280a.f19880a;
    }

    /* renamed from: b */
    public static String m16405b() {
        String m16410a = AbstractC8277k0.m16410a();
        C8365d.m16208c(m16410a, "Cannot return null from a non-@Nullable @Provides method");
        return m16410a;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: c */
    public String get() {
        return m16405b();
    }
}
