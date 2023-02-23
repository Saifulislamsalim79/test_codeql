package kotlin.p557z;

import kotlin.e0.d.l;
/* compiled from: IndexedValue.kt */
/* renamed from: kotlin.z.i0 */
/* loaded from: classes3.dex */
public final class C13705i0<T> {

    /* renamed from: a */
    private final int f30164a;

    /* renamed from: b */
    private final T f30165b;

    public C13705i0(int i, T t) {
        this.f30164a = i;
        this.f30165b = t;
    }

    /* renamed from: a */
    public final int m4119a() {
        return this.f30164a;
    }

    /* renamed from: b */
    public final T m4118b() {
        return this.f30165b;
    }

    /* renamed from: c */
    public final int m4117c() {
        return this.f30164a;
    }

    /* renamed from: d */
    public final T m4116d() {
        return this.f30165b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C13705i0) {
                C13705i0 c13705i0 = (C13705i0) obj;
                return this.f30164a == c13705i0.f30164a && l.b(this.f30165b, c13705i0.f30165b);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f30164a * 31;
        T t = this.f30165b;
        return i + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        return "IndexedValue(index=" + this.f30164a + ", value=" + this.f30165b + ")";
    }
}
