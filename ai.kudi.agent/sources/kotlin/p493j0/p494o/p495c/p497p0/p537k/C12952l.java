package kotlin.p493j0.p494o.p495c.p497p0.p537k;
/* compiled from: SingleThreadValue.java */
/* renamed from: kotlin.j0.o.c.p0.k.l */
/* loaded from: classes3.dex */
class C12952l<T> {

    /* renamed from: a */
    private final T f29009a;

    /* renamed from: b */
    private final Thread f29010b = Thread.currentThread();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12952l(T t) {
        this.f29009a = t;
    }

    /* renamed from: a */
    public T m6374a() {
        if (m6373b()) {
            return this.f29009a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    /* renamed from: b */
    public boolean m6373b() {
        return this.f29010b == Thread.currentThread();
    }
}
