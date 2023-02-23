package kotlin;

import java.io.Serializable;
/* compiled from: Tuples.kt */
/* renamed from: kotlin.t */
/* loaded from: classes3.dex */
public final class C13663t<A, B, C> implements Serializable {

    /* renamed from: c */
    private final A f30108c;

    /* renamed from: d */
    private final B f30109d;

    /* renamed from: e */
    private final C f30110e;

    public C13663t(A a, B b, C c) {
        this.f30108c = a;
        this.f30109d = b;
        this.f30110e = c;
    }

    /* renamed from: a */
    public final A m4232a() {
        return this.f30108c;
    }

    /* renamed from: b */
    public final B m4231b() {
        return this.f30109d;
    }

    /* renamed from: c */
    public final C m4230c() {
        return this.f30110e;
    }

    /* renamed from: d */
    public final B m4229d() {
        return this.f30109d;
    }

    /* renamed from: e */
    public final C m4228e() {
        return this.f30110e;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C13663t) {
                C13663t c13663t = (C13663t) obj;
                return kotlin.e0.d.l.b(this.f30108c, c13663t.f30108c) && kotlin.e0.d.l.b(this.f30109d, c13663t.f30109d) && kotlin.e0.d.l.b(this.f30110e, c13663t.f30110e);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a = this.f30108c;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f30109d;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f30110e;
        return hashCode2 + (c != null ? c.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f30108c + ", " + this.f30109d + ", " + this.f30110e + ')';
    }
}
