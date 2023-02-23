package p272h.p286c.p287a.p288a.p289i.p292b0;

import p272h.p286c.p287a.p288a.p289i.p294w.p295b.C8365d;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.InterfaceC8363b;
/* compiled from: TimeModule_EventClockFactory.java */
/* renamed from: h.c.a.a.i.b0.c */
/* loaded from: classes2.dex */
public final class C8320c implements InterfaceC8363b<InterfaceC8318a> {

    /* compiled from: TimeModule_EventClockFactory.java */
    /* renamed from: h.c.a.a.i.b0.c$a */
    /* loaded from: classes2.dex */
    private static final class C8321a {

        /* renamed from: a */
        private static final C8320c f19949a = new C8320c();
    }

    /* renamed from: a */
    public static C8320c m16303a() {
        return C8321a.f19949a;
    }

    /* renamed from: b */
    public static InterfaceC8318a m16302b() {
        InterfaceC8318a m16305a = AbstractC8319b.m16305a();
        C8365d.m16208c(m16305a, "Cannot return null from a non-@Nullable @Provides method");
        return m16305a;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: c */
    public InterfaceC8318a get() {
        return m16302b();
    }
}
