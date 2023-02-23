package com.google.firebase.inappmessaging.display.p145i.p146a;

import p472k.p473a.InterfaceC11700a;
/* compiled from: DoubleCheck.java */
/* renamed from: com.google.firebase.inappmessaging.display.i.a.b */
/* loaded from: classes2.dex */
public final class C6031b<T> implements InterfaceC11700a<T> {

    /* renamed from: c */
    private static final Object f14733c = new Object();

    /* renamed from: a */
    private volatile InterfaceC11700a<T> f14734a;

    /* renamed from: b */
    private volatile Object f14735b = f14733c;

    private C6031b(InterfaceC11700a<T> interfaceC11700a) {
        this.f14734a = interfaceC11700a;
    }

    /* renamed from: a */
    public static <P extends InterfaceC11700a<T>, T> InterfaceC11700a<T> m22952a(P p) {
        C6033d.m22946b(p);
        return p instanceof C6031b ? p : new C6031b(p);
    }

    /* renamed from: b */
    public static Object m22951b(Object obj, Object obj2) {
        if (!(obj != f14733c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p472k.p473a.InterfaceC11700a
    public T get() {
        T t = (T) this.f14735b;
        if (t == f14733c) {
            synchronized (this) {
                t = this.f14735b;
                if (t == f14733c) {
                    t = this.f14734a.get();
                    m22951b(this.f14735b, t);
                    this.f14735b = t;
                    this.f14734a = null;
                }
            }
        }
        return t;
    }
}
