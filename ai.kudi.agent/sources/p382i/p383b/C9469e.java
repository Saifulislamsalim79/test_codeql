package p382i.p383b;
/* compiled from: InstanceFactory.java */
/* renamed from: i.b.e */
/* loaded from: classes2.dex */
public final class C9469e<T> implements InterfaceC9468d<T> {

    /* renamed from: a */
    private final T f22145a;

    private C9469e(T t) {
        this.f22145a = t;
    }

    /* renamed from: a */
    public static <T> InterfaceC9468d<T> m14656a(T t) {
        C9473g.m14649c(t, "instance cannot be null");
        return new C9469e(t);
    }

    @Override // p472k.p473a.InterfaceC11700a
    public T get() {
        return this.f22145a;
    }
}
