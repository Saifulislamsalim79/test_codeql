package p382i.p383b;

import p472k.p473a.InterfaceC11700a;
/* compiled from: DoubleCheck.java */
/* renamed from: i.b.c */
/* loaded from: classes2.dex */
public final class C9467c<T> implements InterfaceC11700a<T> {

    /* renamed from: c */
    private static final Object f22142c = new Object();

    /* renamed from: a */
    private volatile InterfaceC11700a<T> f22143a;

    /* renamed from: b */
    private volatile Object f22144b = f22142c;

    private C9467c(InterfaceC11700a<T> interfaceC11700a) {
        this.f22143a = interfaceC11700a;
    }

    /* renamed from: a */
    public static <P extends InterfaceC11700a<T>, T> InterfaceC11700a<T> m14658a(P p) {
        C9473g.m14650b(p);
        return p instanceof C9467c ? p : new C9467c(p);
    }

    /* renamed from: b */
    public static Object m14657b(Object obj, Object obj2) {
        if (!(obj != f22142c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p472k.p473a.InterfaceC11700a
    public T get() {
        T t = (T) this.f22144b;
        if (t == f22142c) {
            synchronized (this) {
                t = this.f22144b;
                if (t == f22142c) {
                    t = this.f22143a.get();
                    m14657b(this.f22144b, t);
                    this.f22144b = t;
                    this.f22143a = null;
                }
            }
        }
        return t;
    }
}
