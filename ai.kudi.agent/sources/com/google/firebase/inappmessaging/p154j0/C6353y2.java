package com.google.firebase.inappmessaging.p154j0;

import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import p472k.p473a.InterfaceC11700a;
/* compiled from: ImpressionStorageClient_Factory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.y2 */
/* loaded from: classes2.dex */
public final class C6353y2 implements InterfaceC6144b<C6349x2> {

    /* renamed from: a */
    private final InterfaceC11700a<C6181f3> f15372a;

    public C6353y2(InterfaceC11700a<C6181f3> interfaceC11700a) {
        this.f15372a = interfaceC11700a;
    }

    /* renamed from: a */
    public static C6353y2 m22261a(InterfaceC11700a<C6181f3> interfaceC11700a) {
        return new C6353y2(interfaceC11700a);
    }

    /* renamed from: c */
    public static C6349x2 m22259c(C6181f3 c6181f3) {
        return new C6349x2(c6181f3);
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C6349x2 get() {
        return m22259c(this.f15372a.get());
    }
}
