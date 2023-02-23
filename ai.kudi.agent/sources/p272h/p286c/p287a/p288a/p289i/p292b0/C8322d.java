package p272h.p286c.p287a.p288a.p289i.p292b0;

import p272h.p286c.p287a.p288a.p289i.p294w.p295b.C8365d;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.InterfaceC8363b;
/* compiled from: TimeModule_UptimeClockFactory.java */
/* renamed from: h.c.a.a.i.b0.d */
/* loaded from: classes2.dex */
public final class C8322d implements InterfaceC8363b<InterfaceC8318a> {

    /* compiled from: TimeModule_UptimeClockFactory.java */
    /* renamed from: h.c.a.a.i.b0.d$a */
    /* loaded from: classes2.dex */
    private static final class C8323a {

        /* renamed from: a */
        private static final C8322d f19950a = new C8322d();
    }

    /* renamed from: a */
    public static C8322d m16299a() {
        return C8323a.f19950a;
    }

    /* renamed from: c */
    public static InterfaceC8318a m16297c() {
        InterfaceC8318a m16304b = AbstractC8319b.m16304b();
        C8365d.m16208c(m16304b, "Cannot return null from a non-@Nullable @Provides method");
        return m16304b;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public InterfaceC8318a get() {
        return m16297c();
    }
}
