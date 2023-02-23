package p272h.p286c.p287a.p288a.p289i.p290a0.p291j;

import p272h.p286c.p287a.p288a.p289i.p292b0.InterfaceC8318a;
import p272h.p286c.p287a.p288a.p289i.p294w.InterfaceC8361a;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.C8362a;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.InterfaceC8363b;
import p472k.p473a.InterfaceC11700a;
/* compiled from: SQLiteEventStore_Factory.java */
/* renamed from: h.c.a.a.i.a0.j.r0 */
/* loaded from: classes2.dex */
public final class C8298r0 implements InterfaceC8363b<C8292q0> {

    /* renamed from: a */
    private final InterfaceC11700a<InterfaceC8318a> f19899a;

    /* renamed from: b */
    private final InterfaceC11700a<InterfaceC8318a> f19900b;

    /* renamed from: c */
    private final InterfaceC11700a<AbstractC8274j0> f19901c;

    /* renamed from: d */
    private final InterfaceC11700a<C8300s0> f19902d;

    /* renamed from: e */
    private final InterfaceC11700a<String> f19903e;

    public C8298r0(InterfaceC11700a<InterfaceC8318a> interfaceC11700a, InterfaceC11700a<InterfaceC8318a> interfaceC11700a2, InterfaceC11700a<AbstractC8274j0> interfaceC11700a3, InterfaceC11700a<C8300s0> interfaceC11700a4, InterfaceC11700a<String> interfaceC11700a5) {
        this.f19899a = interfaceC11700a;
        this.f19900b = interfaceC11700a2;
        this.f19901c = interfaceC11700a3;
        this.f19902d = interfaceC11700a4;
        this.f19903e = interfaceC11700a5;
    }

    /* renamed from: a */
    public static C8298r0 m16328a(InterfaceC11700a<InterfaceC8318a> interfaceC11700a, InterfaceC11700a<InterfaceC8318a> interfaceC11700a2, InterfaceC11700a<AbstractC8274j0> interfaceC11700a3, InterfaceC11700a<C8300s0> interfaceC11700a4, InterfaceC11700a<String> interfaceC11700a5) {
        return new C8298r0(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
    }

    /* renamed from: c */
    public static C8292q0 m16326c(InterfaceC8318a interfaceC8318a, InterfaceC8318a interfaceC8318a2, Object obj, Object obj2, InterfaceC8361a<String> interfaceC8361a) {
        return new C8292q0(interfaceC8318a, interfaceC8318a2, (AbstractC8274j0) obj, (C8300s0) obj2, interfaceC8361a);
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C8292q0 get() {
        return m16326c(this.f19899a.get(), this.f19900b.get(), this.f19901c.get(), this.f19902d.get(), C8362a.m16214a(this.f19903e));
    }
}
