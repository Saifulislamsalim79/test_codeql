package p382i.p383b;

import p472k.p473a.InterfaceC11700a;
/* compiled from: SingleCheck.java */
/* renamed from: i.b.h */
/* loaded from: classes2.dex */
public final class C9474h<T> implements InterfaceC11700a<T> {

    /* renamed from: c */
    private static final Object f22146c = new Object();

    /* renamed from: a */
    private volatile InterfaceC11700a<T> f22147a;

    /* renamed from: b */
    private volatile Object f22148b = f22146c;

    private C9474h(InterfaceC11700a<T> interfaceC11700a) {
        this.f22147a = interfaceC11700a;
    }

    /* renamed from: a */
    public static <P extends InterfaceC11700a<T>, T> InterfaceC11700a<T> m14646a(P p) {
        if ((p instanceof C9474h) || (p instanceof C9467c)) {
            return p;
        }
        C9473g.m14650b(p);
        return new C9474h(p);
    }

    @Override // p472k.p473a.InterfaceC11700a
    public T get() {
        T t = (T) this.f22148b;
        if (t == f22146c) {
            InterfaceC11700a<T> interfaceC11700a = this.f22147a;
            if (interfaceC11700a == null) {
                return (T) this.f22148b;
            }
            T t2 = interfaceC11700a.get();
            this.f22148b = t2;
            this.f22147a = null;
            return t2;
        }
        return t;
    }
}
