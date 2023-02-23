package com.google.firebase.database.p131s;
/* compiled from: Tag.java */
/* renamed from: com.google.firebase.database.s.w */
/* loaded from: classes2.dex */
public final class C5889w {

    /* renamed from: a */
    private final long f14477a;

    public C5889w(long j) {
        this.f14477a = j;
    }

    /* renamed from: a */
    public long m23387a() {
        return this.f14477a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C5889w.class == obj.getClass() && this.f14477a == ((C5889w) obj).f14477a;
    }

    public int hashCode() {
        long j = this.f14477a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "Tag{tagNumber=" + this.f14477a + '}';
    }
}
