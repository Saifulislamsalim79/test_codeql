package p272h.p286c.p287a.p288a.p289i.p294w.p295b;

import p272h.p286c.p287a.p288a.p289i.p294w.InterfaceC8361a;
import p472k.p473a.InterfaceC11700a;
/* compiled from: DoubleCheck.java */
/* renamed from: h.c.a.a.i.w.b.a */
/* loaded from: classes2.dex */
public final class C8362a<T> implements InterfaceC11700a<T>, InterfaceC8361a<T> {

    /* renamed from: c */
    private static final Object f20019c = new Object();

    /* renamed from: a */
    private volatile InterfaceC11700a<T> f20020a;

    /* renamed from: b */
    private volatile Object f20021b = f20019c;

    private C8362a(InterfaceC11700a<T> interfaceC11700a) {
        this.f20020a = interfaceC11700a;
    }

    /* renamed from: a */
    public static <P extends InterfaceC11700a<T>, T> InterfaceC8361a<T> m16214a(P p) {
        if (p instanceof InterfaceC8361a) {
            return (InterfaceC8361a) p;
        }
        C8365d.m16209b(p);
        return new C8362a(p);
    }

    /* renamed from: b */
    public static <P extends InterfaceC11700a<T>, T> InterfaceC11700a<T> m16213b(P p) {
        C8365d.m16209b(p);
        return p instanceof C8362a ? p : new C8362a(p);
    }

    /* renamed from: c */
    public static Object m16212c(Object obj, Object obj2) {
        if (!(obj != f20019c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p472k.p473a.InterfaceC11700a
    public T get() {
        T t = (T) this.f20021b;
        if (t == f20019c) {
            synchronized (this) {
                t = this.f20021b;
                if (t == f20019c) {
                    t = this.f20020a.get();
                    m16212c(this.f20021b, t);
                    this.f20021b = t;
                    this.f20020a = null;
                }
            }
        }
        return t;
    }
}
