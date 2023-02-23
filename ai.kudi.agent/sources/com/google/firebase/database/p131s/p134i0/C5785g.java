package com.google.firebase.database.p131s.p134i0;
/* compiled from: Pair.java */
/* renamed from: com.google.firebase.database.s.i0.g */
/* loaded from: classes2.dex */
public final class C5785g<T, U> {

    /* renamed from: a */
    private final T f14215a;

    /* renamed from: b */
    private final U f14216b;

    public C5785g(T t, U u) {
        this.f14215a = t;
        this.f14216b = u;
    }

    /* renamed from: a */
    public T m23770a() {
        return this.f14215a;
    }

    /* renamed from: b */
    public U m23769b() {
        return this.f14216b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5785g.class != obj.getClass()) {
            return false;
        }
        C5785g c5785g = (C5785g) obj;
        T t = this.f14215a;
        if (t == null ? c5785g.f14215a == null : t.equals(c5785g.f14215a)) {
            U u = this.f14216b;
            U u2 = c5785g.f14216b;
            return u == null ? u2 == null : u.equals(u2);
        }
        return false;
    }

    public int hashCode() {
        T t = this.f14215a;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        U u = this.f14216b;
        return hashCode + (u != null ? u.hashCode() : 0);
    }

    public String toString() {
        return "Pair(" + this.f14215a + "," + this.f14216b + ")";
    }
}
