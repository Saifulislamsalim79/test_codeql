package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import com.google.firebase.inappmessaging.p154j0.C6231o2;
import com.google.firebase.inappmessaging.p154j0.C6248q3;
import com.google.firebase.p167m.InterfaceC6473d;
import p472k.p473a.InterfaceC11700a;
/* compiled from: ApiClientModule_ProvidesDataCollectionHelperFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.j */
/* loaded from: classes2.dex */
public final class C6301j implements InterfaceC6144b<C6231o2> {

    /* renamed from: a */
    private final C6297h f15306a;

    /* renamed from: b */
    private final InterfaceC11700a<C6248q3> f15307b;

    /* renamed from: c */
    private final InterfaceC11700a<InterfaceC6473d> f15308c;

    public C6301j(C6297h c6297h, InterfaceC11700a<C6248q3> interfaceC11700a, InterfaceC11700a<InterfaceC6473d> interfaceC11700a2) {
        this.f15306a = c6297h;
        this.f15307b = interfaceC11700a;
        this.f15308c = interfaceC11700a2;
    }

    /* renamed from: a */
    public static C6301j m22353a(C6297h c6297h, InterfaceC11700a<C6248q3> interfaceC11700a, InterfaceC11700a<InterfaceC6473d> interfaceC11700a2) {
        return new C6301j(c6297h, interfaceC11700a, interfaceC11700a2);
    }

    /* renamed from: c */
    public static C6231o2 m22351c(C6297h c6297h, C6248q3 c6248q3, InterfaceC6473d interfaceC6473d) {
        C6231o2 m22367b = c6297h.m22367b(c6248q3, interfaceC6473d);
        C6146d.m22627c(m22367b, "Cannot return null from a non-@Nullable @Provides method");
        return m22367b;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C6231o2 get() {
        return m22351c(this.f15306a, this.f15307b.get(), this.f15308c.get());
    }
}
