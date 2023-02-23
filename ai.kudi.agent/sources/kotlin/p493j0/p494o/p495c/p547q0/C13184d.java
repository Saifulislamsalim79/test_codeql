package kotlin.p493j0.p494o.p495c.p547q0;
/* compiled from: IntTreePMap.java */
/* renamed from: kotlin.j0.o.c.q0.d */
/* loaded from: classes3.dex */
final class C13184d<V> {

    /* renamed from: b */
    private static final C13184d<Object> f29316b = new C13184d<>(C13183c.f29310f);

    /* renamed from: a */
    private final C13183c<V> f29317a;

    private C13184d(C13183c<V> c13183c) {
        this.f29317a = c13183c;
    }

    /* renamed from: a */
    public static <V> C13184d<V> m5682a() {
        return (C13184d<V>) f29316b;
    }

    /* renamed from: d */
    private C13184d<V> m5679d(C13183c<V> c13183c) {
        return c13183c == this.f29317a ? this : new C13184d<>(c13183c);
    }

    /* renamed from: b */
    public V m5681b(int i) {
        return this.f29317a.m5687a(i);
    }

    /* renamed from: c */
    public C13184d<V> m5680c(int i, V v) {
        return m5679d(this.f29317a.m5686b(i, v));
    }
}
