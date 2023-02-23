package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import io.grpc.AbstractC9508e;
import p472k.p473a.InterfaceC11700a;
/* compiled from: GrpcChannelModule_ProvidesGrpcChannelFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.x */
/* loaded from: classes2.dex */
public final class C6325x implements InterfaceC6144b<AbstractC9508e> {

    /* renamed from: a */
    private final C6324w f15333a;

    /* renamed from: b */
    private final InterfaceC11700a<String> f15334b;

    public C6325x(C6324w c6324w, InterfaceC11700a<String> interfaceC11700a) {
        this.f15333a = c6324w;
        this.f15334b = interfaceC11700a;
    }

    /* renamed from: a */
    public static C6325x m22292a(C6324w c6324w, InterfaceC11700a<String> interfaceC11700a) {
        return new C6325x(c6324w, interfaceC11700a);
    }

    /* renamed from: c */
    public static AbstractC9508e m22290c(C6324w c6324w, String str) {
        AbstractC9508e m22294a = c6324w.m22294a(str);
        C6146d.m22627c(m22294a, "Cannot return null from a non-@Nullable @Provides method");
        return m22294a;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public AbstractC9508e get() {
        return m22290c(this.f15333a, this.f15334b.get());
    }
}
