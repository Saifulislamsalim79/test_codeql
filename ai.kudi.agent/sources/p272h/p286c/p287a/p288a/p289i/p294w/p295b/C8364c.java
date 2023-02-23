package p272h.p286c.p287a.p288a.p289i.p294w.p295b;

import p272h.p286c.p287a.p288a.p289i.p294w.InterfaceC8361a;
/* compiled from: InstanceFactory.java */
/* renamed from: h.c.a.a.i.w.b.c */
/* loaded from: classes2.dex */
public final class C8364c<T> implements InterfaceC8363b<T>, InterfaceC8361a<T> {

    /* renamed from: a */
    private final T f20022a;

    private C8364c(T t) {
        this.f20022a = t;
    }

    /* renamed from: a */
    public static <T> InterfaceC8363b<T> m16211a(T t) {
        C8365d.m16208c(t, "instance cannot be null");
        return new C8364c(t);
    }

    @Override // p472k.p473a.InterfaceC11700a
    public T get() {
        return this.f20022a;
    }
}
