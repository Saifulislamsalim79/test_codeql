package io.grpc.p384h1;

import io.grpc.p384h1.C9610f2;
/* compiled from: SharedResourcePool.java */
/* renamed from: io.grpc.h1.g2 */
/* loaded from: classes2.dex */
public final class C9661g2<T> implements InterfaceC9747p1<T> {

    /* renamed from: a */
    private final C9610f2.InterfaceC9614d<T> f22669a;

    private C9661g2(C9610f2.InterfaceC9614d<T> interfaceC9614d) {
        this.f22669a = interfaceC9614d;
    }

    /* renamed from: c */
    public static <T> C9661g2<T> m14232c(C9610f2.InterfaceC9614d<T> interfaceC9614d) {
        return new C9661g2<>(interfaceC9614d);
    }

    @Override // io.grpc.p384h1.InterfaceC9747p1
    /* renamed from: a */
    public T mo14070a() {
        return (T) C9610f2.m14336d(this.f22669a);
    }

    @Override // io.grpc.p384h1.InterfaceC9747p1
    /* renamed from: b */
    public T mo14069b(Object obj) {
        C9610f2.m14334f(this.f22669a, obj);
        return null;
    }
}
