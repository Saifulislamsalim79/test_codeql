package com.google.firebase.inappmessaging.p154j0;

import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import com.google.firebase.inappmessaging.p154j0.p158t3.InterfaceC6332a;
import p472k.p473a.InterfaceC11700a;
/* compiled from: RateLimiterClient_Factory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.n3 */
/* loaded from: classes2.dex */
public final class C6227n3 implements InterfaceC6144b<C6222m3> {

    /* renamed from: a */
    private final InterfaceC11700a<C6181f3> f15121a;

    /* renamed from: b */
    private final InterfaceC11700a<InterfaceC6332a> f15122b;

    public C6227n3(InterfaceC11700a<C6181f3> interfaceC11700a, InterfaceC11700a<InterfaceC6332a> interfaceC11700a2) {
        this.f15121a = interfaceC11700a;
        this.f15122b = interfaceC11700a2;
    }

    /* renamed from: a */
    public static C6227n3 m22513a(InterfaceC11700a<C6181f3> interfaceC11700a, InterfaceC11700a<InterfaceC6332a> interfaceC11700a2) {
        return new C6227n3(interfaceC11700a, interfaceC11700a2);
    }

    /* renamed from: c */
    public static C6222m3 m22511c(C6181f3 c6181f3, InterfaceC6332a interfaceC6332a) {
        return new C6222m3(c6181f3, interfaceC6332a);
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C6222m3 get() {
        return m22511c(this.f15121a.get(), this.f15122b.get());
    }
}
