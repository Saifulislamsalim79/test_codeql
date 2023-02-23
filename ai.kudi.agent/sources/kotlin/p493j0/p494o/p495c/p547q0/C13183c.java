package kotlin.p493j0.p494o.p495c.p547q0;
/* compiled from: IntTree.java */
/* renamed from: kotlin.j0.o.c.q0.c */
/* loaded from: classes3.dex */
final class C13183c<V> {

    /* renamed from: f */
    static final C13183c<Object> f29310f = new C13183c<>();

    /* renamed from: a */
    private final long f29311a;

    /* renamed from: b */
    private final V f29312b;

    /* renamed from: c */
    private final C13183c<V> f29313c;

    /* renamed from: d */
    private final C13183c<V> f29314d;

    /* renamed from: e */
    private final int f29315e;

    private C13183c() {
        this.f29315e = 0;
        this.f29311a = 0L;
        this.f29312b = null;
        this.f29313c = null;
        this.f29314d = null;
    }

    /* renamed from: c */
    private static <V> C13183c<V> m5685c(long j, V v, C13183c<V> c13183c, C13183c<V> c13183c2) {
        int i = ((C13183c) c13183c).f29315e;
        int i2 = ((C13183c) c13183c2).f29315e;
        if (i + i2 > 1) {
            if (i >= i2 * 5) {
                C13183c<V> c13183c3 = ((C13183c) c13183c).f29313c;
                C13183c<V> c13183c4 = ((C13183c) c13183c).f29314d;
                if (((C13183c) c13183c4).f29315e < ((C13183c) c13183c3).f29315e * 2) {
                    long j2 = ((C13183c) c13183c).f29311a;
                    return new C13183c<>(j2 + j, ((C13183c) c13183c).f29312b, c13183c3, new C13183c(-j2, v, c13183c4.m5683e(((C13183c) c13183c4).f29311a + j2), c13183c2));
                }
                C13183c<V> c13183c5 = ((C13183c) c13183c4).f29313c;
                C13183c<V> c13183c6 = ((C13183c) c13183c4).f29314d;
                long j3 = ((C13183c) c13183c4).f29311a;
                long j4 = ((C13183c) c13183c).f29311a + j3 + j;
                V v2 = ((C13183c) c13183c4).f29312b;
                C13183c c13183c7 = new C13183c(-j3, ((C13183c) c13183c).f29312b, c13183c3, c13183c5.m5683e(((C13183c) c13183c5).f29311a + j3));
                long j5 = ((C13183c) c13183c).f29311a;
                long j6 = ((C13183c) c13183c4).f29311a;
                return new C13183c<>(j4, v2, c13183c7, new C13183c((-j5) - j6, v, c13183c6.m5683e(((C13183c) c13183c6).f29311a + j6 + j5), c13183c2));
            } else if (i2 >= i * 5) {
                C13183c<V> c13183c8 = ((C13183c) c13183c2).f29313c;
                C13183c<V> c13183c9 = ((C13183c) c13183c2).f29314d;
                if (((C13183c) c13183c8).f29315e < ((C13183c) c13183c9).f29315e * 2) {
                    long j7 = ((C13183c) c13183c2).f29311a;
                    return new C13183c<>(j7 + j, ((C13183c) c13183c2).f29312b, new C13183c(-j7, v, c13183c, c13183c8.m5683e(((C13183c) c13183c8).f29311a + j7)), c13183c9);
                }
                C13183c<V> c13183c10 = ((C13183c) c13183c8).f29313c;
                C13183c<V> c13183c11 = ((C13183c) c13183c8).f29314d;
                long j8 = ((C13183c) c13183c8).f29311a;
                long j9 = ((C13183c) c13183c2).f29311a;
                long j10 = j8 + j9 + j;
                V v3 = ((C13183c) c13183c8).f29312b;
                C13183c c13183c12 = new C13183c((-j9) - j8, v, c13183c, c13183c10.m5683e(((C13183c) c13183c10).f29311a + j8 + j9));
                long j11 = ((C13183c) c13183c8).f29311a;
                return new C13183c<>(j10, v3, c13183c12, new C13183c(-j11, ((C13183c) c13183c2).f29312b, c13183c11.m5683e(((C13183c) c13183c11).f29311a + j11), c13183c9));
            }
        }
        return new C13183c<>(j, v, c13183c, c13183c2);
    }

    /* renamed from: d */
    private C13183c<V> m5684d(C13183c<V> c13183c, C13183c<V> c13183c2) {
        return (c13183c == this.f29313c && c13183c2 == this.f29314d) ? this : m5685c(this.f29311a, this.f29312b, c13183c, c13183c2);
    }

    /* renamed from: e */
    private C13183c<V> m5683e(long j) {
        return (this.f29315e == 0 || j == this.f29311a) ? this : new C13183c<>(j, this.f29312b, this.f29313c, this.f29314d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public V m5687a(long j) {
        if (this.f29315e == 0) {
            return null;
        }
        long j2 = this.f29311a;
        if (j < j2) {
            return this.f29313c.m5687a(j - j2);
        }
        if (j > j2) {
            return this.f29314d.m5687a(j - j2);
        }
        return this.f29312b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C13183c<V> m5686b(long j, V v) {
        if (this.f29315e == 0) {
            return new C13183c<>(j, v, this, this);
        }
        long j2 = this.f29311a;
        if (j < j2) {
            return m5684d(this.f29313c.m5686b(j - j2, v), this.f29314d);
        }
        if (j > j2) {
            return m5684d(this.f29313c, this.f29314d.m5686b(j - j2, v));
        }
        return v == this.f29312b ? this : new C13183c<>(j, v, this.f29313c, this.f29314d);
    }

    private C13183c(long j, V v, C13183c<V> c13183c, C13183c<V> c13183c2) {
        this.f29311a = j;
        this.f29312b = v;
        this.f29313c = c13183c;
        this.f29314d = c13183c2;
        this.f29315e = c13183c.f29315e + 1 + c13183c2.f29315e;
    }
}
