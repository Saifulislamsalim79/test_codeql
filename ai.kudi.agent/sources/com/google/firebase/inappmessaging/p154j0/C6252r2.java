package com.google.firebase.inappmessaging.p154j0;

import com.google.firebase.inappmessaging.model.AbstractC6395m;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import com.google.firebase.inappmessaging.p154j0.p158t3.InterfaceC6332a;
import p472k.p473a.InterfaceC11700a;
/* compiled from: DisplayCallbacksFactory_Factory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.r2 */
/* loaded from: classes2.dex */
public final class C6252r2 implements InterfaceC6144b<C6247q2> {

    /* renamed from: a */
    private final InterfaceC11700a<C6349x2> f15166a;

    /* renamed from: b */
    private final InterfaceC11700a<InterfaceC6332a> f15167b;

    /* renamed from: c */
    private final InterfaceC11700a<C6232o3> f15168c;

    /* renamed from: d */
    private final InterfaceC11700a<C6222m3> f15169d;

    /* renamed from: e */
    private final InterfaceC11700a<C6221m2> f15170e;

    /* renamed from: f */
    private final InterfaceC11700a<AbstractC6395m> f15171f;

    /* renamed from: g */
    private final InterfaceC11700a<C6168d3> f15172g;

    /* renamed from: h */
    private final InterfaceC11700a<C6231o2> f15173h;

    public C6252r2(InterfaceC11700a<C6349x2> interfaceC11700a, InterfaceC11700a<InterfaceC6332a> interfaceC11700a2, InterfaceC11700a<C6232o3> interfaceC11700a3, InterfaceC11700a<C6222m3> interfaceC11700a4, InterfaceC11700a<C6221m2> interfaceC11700a5, InterfaceC11700a<AbstractC6395m> interfaceC11700a6, InterfaceC11700a<C6168d3> interfaceC11700a7, InterfaceC11700a<C6231o2> interfaceC11700a8) {
        this.f15166a = interfaceC11700a;
        this.f15167b = interfaceC11700a2;
        this.f15168c = interfaceC11700a3;
        this.f15169d = interfaceC11700a4;
        this.f15170e = interfaceC11700a5;
        this.f15171f = interfaceC11700a6;
        this.f15172g = interfaceC11700a7;
        this.f15173h = interfaceC11700a8;
    }

    /* renamed from: a */
    public static C6252r2 m22480a(InterfaceC11700a<C6349x2> interfaceC11700a, InterfaceC11700a<InterfaceC6332a> interfaceC11700a2, InterfaceC11700a<C6232o3> interfaceC11700a3, InterfaceC11700a<C6222m3> interfaceC11700a4, InterfaceC11700a<C6221m2> interfaceC11700a5, InterfaceC11700a<AbstractC6395m> interfaceC11700a6, InterfaceC11700a<C6168d3> interfaceC11700a7, InterfaceC11700a<C6231o2> interfaceC11700a8) {
        return new C6252r2(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7, interfaceC11700a8);
    }

    /* renamed from: c */
    public static C6247q2 m22478c(C6349x2 c6349x2, InterfaceC6332a interfaceC6332a, C6232o3 c6232o3, C6222m3 c6222m3, C6221m2 c6221m2, AbstractC6395m abstractC6395m, C6168d3 c6168d3, C6231o2 c6231o2) {
        return new C6247q2(c6349x2, interfaceC6332a, c6232o3, c6222m3, c6221m2, abstractC6395m, c6168d3, c6231o2);
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C6247q2 get() {
        return m22478c(this.f15166a.get(), this.f15167b.get(), this.f15168c.get(), this.f15169d.get(), this.f15170e.get(), this.f15171f.get(), this.f15172g.get(), this.f15173h.get());
    }
}
