package kotlin.p493j0.p494o.p495c.p497p0.p538l.p543n1;

import kotlin.e0.d.l;
/* compiled from: CapturedTypeApproximation.kt */
/* renamed from: kotlin.j0.o.c.p0.l.n1.a */
/* loaded from: classes3.dex */
public final class C13096a<T> {

    /* renamed from: a */
    private final T f29170a;

    /* renamed from: b */
    private final T f29171b;

    public C13096a(T t, T t2) {
        this.f29170a = t;
        this.f29171b = t2;
    }

    /* renamed from: a */
    public final T m5879a() {
        return this.f29170a;
    }

    /* renamed from: b */
    public final T m5878b() {
        return this.f29171b;
    }

    /* renamed from: c */
    public final T m5877c() {
        return this.f29170a;
    }

    /* renamed from: d */
    public final T m5876d() {
        return this.f29171b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13096a) {
            C13096a c13096a = (C13096a) obj;
            return l.b(this.f29170a, c13096a.f29170a) && l.b(this.f29171b, c13096a.f29171b);
        }
        return false;
    }

    public int hashCode() {
        T t = this.f29170a;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f29171b;
        return hashCode + (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f29170a + ", upper=" + this.f29171b + ')';
    }
}
