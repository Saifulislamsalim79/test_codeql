package com.google.firebase.inappmessaging.p152i0.p153b;

import com.google.firebase.inappmessaging.p152i0.InterfaceC6142a;
/* compiled from: InstanceFactory.java */
/* renamed from: com.google.firebase.inappmessaging.i0.b.c */
/* loaded from: classes2.dex */
public final class C6145c<T> implements InterfaceC6144b<T>, InterfaceC6142a<T> {

    /* renamed from: a */
    private final T f14985a;

    private C6145c(T t) {
        this.f14985a = t;
    }

    /* renamed from: a */
    public static <T> InterfaceC6144b<T> m22630a(T t) {
        C6146d.m22627c(t, "instance cannot be null");
        return new C6145c(t);
    }

    @Override // p472k.p473a.InterfaceC11700a
    public T get() {
        return this.f14985a;
    }
}
