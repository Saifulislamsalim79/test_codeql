package p201g.p227h.p237k;
/* compiled from: Pair.java */
/* renamed from: g.h.k.d */
/* loaded from: classes2.dex */
public class C7671d<F, S> {

    /* renamed from: a */
    public final F f18393a;

    /* renamed from: b */
    public final S f18394b;

    public boolean equals(Object obj) {
        if (obj instanceof C7671d) {
            C7671d c7671d = (C7671d) obj;
            return C7670c.m17875a(c7671d.f18393a, this.f18393a) && C7670c.m17875a(c7671d.f18394b, this.f18394b);
        }
        return false;
    }

    public int hashCode() {
        F f = this.f18393a;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f18394b;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f18393a + " " + this.f18394b + "}";
    }
}
