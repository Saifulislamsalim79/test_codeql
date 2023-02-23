package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import com.google.firebase.inappmessaging.p154j0.C6248q3;
import com.google.firebase.inappmessaging.p154j0.C6253r3;
import p472k.p473a.InterfaceC11700a;
/* compiled from: ApiClientModule_ProvidesTestDeviceHelperFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.n */
/* loaded from: classes2.dex */
public final class C6309n implements InterfaceC6144b<C6253r3> {

    /* renamed from: a */
    private final C6297h f15313a;

    /* renamed from: b */
    private final InterfaceC11700a<C6248q3> f15314b;

    public C6309n(C6297h c6297h, InterfaceC11700a<C6248q3> interfaceC11700a) {
        this.f15313a = c6297h;
        this.f15314b = interfaceC11700a;
    }

    /* renamed from: a */
    public static C6309n m22333a(C6297h c6297h, InterfaceC11700a<C6248q3> interfaceC11700a) {
        return new C6309n(c6297h, interfaceC11700a);
    }

    /* renamed from: c */
    public static C6253r3 m22331c(C6297h c6297h, C6248q3 c6248q3) {
        C6253r3 m22363f = c6297h.m22363f(c6248q3);
        C6146d.m22627c(m22363f, "Cannot return null from a non-@Nullable @Provides method");
        return m22363f;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C6253r3 get() {
        return m22331c(this.f15313a, this.f15314b.get());
    }
}
