package com.google.firebase.inappmessaging.p154j0;

import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import p272h.p286c.p355d.p356a.p357a.p358a.p359e.C9392g;
import p472k.p473a.InterfaceC11700a;
/* compiled from: GrpcClient_Factory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.w2 */
/* loaded from: classes2.dex */
public final class C6345w2 implements InterfaceC6144b<C6341v2> {

    /* renamed from: a */
    private final InterfaceC11700a<C9392g.C9394b> f15360a;

    public C6345w2(InterfaceC11700a<C9392g.C9394b> interfaceC11700a) {
        this.f15360a = interfaceC11700a;
    }

    /* renamed from: a */
    public static C6345w2 m22277a(InterfaceC11700a<C9392g.C9394b> interfaceC11700a) {
        return new C6345w2(interfaceC11700a);
    }

    /* renamed from: c */
    public static C6341v2 m22275c(C9392g.C9394b c9394b) {
        return new C6341v2(c9394b);
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C6341v2 get() {
        return m22275c(this.f15360a.get());
    }
}
