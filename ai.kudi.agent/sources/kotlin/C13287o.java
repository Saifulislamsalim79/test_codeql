package kotlin;

import java.io.Serializable;
/* compiled from: Tuples.kt */
/* renamed from: kotlin.o */
/* loaded from: classes3.dex */
public final class C13287o<A, B> implements Serializable {

    /* renamed from: c */
    private final A f29442c;

    /* renamed from: d */
    private final B f29443d;

    public C13287o(A a, B b) {
        this.f29442c = a;
        this.f29443d = b;
    }

    /* renamed from: a */
    public final A m5366a() {
        return this.f29442c;
    }

    /* renamed from: b */
    public final B m5365b() {
        return this.f29443d;
    }

    /* renamed from: c */
    public final A m5364c() {
        return this.f29442c;
    }

    /* renamed from: d */
    public final B m5363d() {
        return this.f29443d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C13287o) {
                C13287o c13287o = (C13287o) obj;
                return kotlin.e0.d.l.b(this.f29442c, c13287o.f29442c) && kotlin.e0.d.l.b(this.f29443d, c13287o.f29443d);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a = this.f29442c;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f29443d;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f29442c + ", " + this.f29443d + ')';
    }
}
