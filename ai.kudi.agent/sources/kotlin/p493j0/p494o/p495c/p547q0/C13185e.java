package kotlin.p493j0.p494o.p495c.p547q0;

import java.io.Serializable;
/* compiled from: MapEntry.java */
/* renamed from: kotlin.j0.o.c.q0.e */
/* loaded from: classes3.dex */
final class C13185e<K, V> implements Serializable {

    /* renamed from: c */
    public final K f29318c;

    /* renamed from: d */
    public final V f29319d;

    public C13185e(K k, V v) {
        this.f29318c = k;
        this.f29319d = v;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C13185e) {
            C13185e c13185e = (C13185e) obj;
            K k = this.f29318c;
            if (k == null) {
                if (c13185e.f29318c != null) {
                    return false;
                }
            } else if (!k.equals(c13185e.f29318c)) {
                return false;
            }
            V v = this.f29319d;
            V v2 = c13185e.f29319d;
            if (v == null) {
                if (v2 != null) {
                    return false;
                }
            } else if (!v.equals(v2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        K k = this.f29318c;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f29319d;
        return hashCode ^ (v != null ? v.hashCode() : 0);
    }

    public String toString() {
        return this.f29318c + "=" + this.f29319d;
    }
}
