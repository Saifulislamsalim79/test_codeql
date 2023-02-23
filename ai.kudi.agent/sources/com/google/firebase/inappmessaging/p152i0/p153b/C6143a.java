package com.google.firebase.inappmessaging.p152i0.p153b;

import com.google.firebase.inappmessaging.p152i0.InterfaceC6142a;
import p472k.p473a.InterfaceC11700a;
/* compiled from: DoubleCheck.java */
/* renamed from: com.google.firebase.inappmessaging.i0.b.a */
/* loaded from: classes2.dex */
public final class C6143a<T> implements InterfaceC11700a<T>, InterfaceC6142a<T> {

    /* renamed from: c */
    private static final Object f14982c = new Object();

    /* renamed from: a */
    private volatile InterfaceC11700a<T> f14983a;

    /* renamed from: b */
    private volatile Object f14984b = f14982c;

    private C6143a(InterfaceC11700a<T> interfaceC11700a) {
        this.f14983a = interfaceC11700a;
    }

    /* renamed from: a */
    public static <P extends InterfaceC11700a<T>, T> InterfaceC6142a<T> m22633a(P p) {
        if (p instanceof InterfaceC6142a) {
            return (InterfaceC6142a) p;
        }
        C6146d.m22628b(p);
        return new C6143a(p);
    }

    /* renamed from: b */
    public static <P extends InterfaceC11700a<T>, T> InterfaceC11700a<T> m22632b(P p) {
        C6146d.m22628b(p);
        return p instanceof C6143a ? p : new C6143a(p);
    }

    /* renamed from: c */
    public static Object m22631c(Object obj, Object obj2) {
        if (!(obj != f14982c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p472k.p473a.InterfaceC11700a
    public T get() {
        T t = (T) this.f14984b;
        if (t == f14982c) {
            synchronized (this) {
                t = this.f14984b;
                if (t == f14982c) {
                    t = this.f14983a.get();
                    m22631c(this.f14984b, t);
                    this.f14984b = t;
                    this.f14983a = null;
                }
            }
        }
        return t;
    }
}
