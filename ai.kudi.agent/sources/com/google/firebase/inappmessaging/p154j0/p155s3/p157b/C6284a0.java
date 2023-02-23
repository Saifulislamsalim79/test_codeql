package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import io.grpc.C10049s0;
/* compiled from: GrpcClientModule_ProvidesApiKeyHeadersFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.a0 */
/* loaded from: classes2.dex */
public final class C6284a0 implements InterfaceC6144b<C10049s0> {

    /* renamed from: a */
    private final C6327z f15279a;

    public C6284a0(C6327z c6327z) {
        this.f15279a = c6327z;
    }

    /* renamed from: a */
    public static C6284a0 m22398a(C6327z c6327z) {
        return new C6284a0(c6327z);
    }

    /* renamed from: c */
    public static C10049s0 m22396c(C6327z c6327z) {
        C10049s0 m22285b = c6327z.m22285b();
        C6146d.m22627c(m22285b, "Cannot return null from a non-@Nullable @Provides method");
        return m22285b;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C10049s0 get() {
        return m22396c(this.f15279a);
    }
}
