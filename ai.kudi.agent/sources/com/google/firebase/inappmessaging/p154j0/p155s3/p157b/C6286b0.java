package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import io.grpc.AbstractC9508e;
import io.grpc.C10049s0;
import p272h.p286c.p355d.p356a.p357a.p358a.p359e.C9392g;
import p472k.p473a.InterfaceC11700a;
/* compiled from: GrpcClientModule_ProvidesInAppMessagingSdkServingStubFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.b0 */
/* loaded from: classes2.dex */
public final class C6286b0 implements InterfaceC6144b<C9392g.C9394b> {

    /* renamed from: a */
    private final C6327z f15281a;

    /* renamed from: b */
    private final InterfaceC11700a<AbstractC9508e> f15282b;

    /* renamed from: c */
    private final InterfaceC11700a<C10049s0> f15283c;

    public C6286b0(C6327z c6327z, InterfaceC11700a<AbstractC9508e> interfaceC11700a, InterfaceC11700a<C10049s0> interfaceC11700a2) {
        this.f15281a = c6327z;
        this.f15282b = interfaceC11700a;
        this.f15283c = interfaceC11700a2;
    }

    /* renamed from: a */
    public static C6286b0 m22395a(C6327z c6327z, InterfaceC11700a<AbstractC9508e> interfaceC11700a, InterfaceC11700a<C10049s0> interfaceC11700a2) {
        return new C6286b0(c6327z, interfaceC11700a, interfaceC11700a2);
    }

    /* renamed from: c */
    public static C9392g.C9394b m22393c(C6327z c6327z, AbstractC9508e abstractC9508e, C10049s0 c10049s0) {
        C9392g.C9394b m22284c = c6327z.m22284c(abstractC9508e, c10049s0);
        C6146d.m22627c(m22284c, "Cannot return null from a non-@Nullable @Provides method");
        return m22284c;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C9392g.C9394b get() {
        return m22393c(this.f15281a, this.f15282b.get(), this.f15283c.get());
    }
}
