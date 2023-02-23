package p272h.p286c.p287a.p288a.p289i;

import java.util.concurrent.Executor;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.C8365d;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.InterfaceC8363b;
/* compiled from: ExecutionModule_ExecutorFactory.java */
/* renamed from: h.c.a.a.i.l */
/* loaded from: classes2.dex */
public final class C8345l implements InterfaceC8363b<Executor> {

    /* compiled from: ExecutionModule_ExecutorFactory.java */
    /* renamed from: h.c.a.a.i.l$a */
    /* loaded from: classes2.dex */
    private static final class C8346a {

        /* renamed from: a */
        private static final C8345l f19997a = new C8345l();
    }

    /* renamed from: a */
    public static C8345l m16261a() {
        return C8346a.f19997a;
    }

    /* renamed from: b */
    public static Executor m16260b() {
        Executor m16262a = AbstractC8344k.m16262a();
        C8365d.m16208c(m16262a, "Cannot return null from a non-@Nullable @Provides method");
        return m16262a;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: c */
    public Executor get() {
        return m16260b();
    }
}
