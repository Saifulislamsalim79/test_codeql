package io.intercom.com.bumptech.glide.p416r;
/* compiled from: MultiClassKey.java */
/* renamed from: io.intercom.com.bumptech.glide.r.g */
/* loaded from: classes3.dex */
public class C10891g {

    /* renamed from: a */
    private Class<?> f24859a;

    /* renamed from: b */
    private Class<?> f24860b;

    /* renamed from: c */
    private Class<?> f24861c;

    public C10891g() {
    }

    /* renamed from: a */
    public void m12019a(Class<?> cls, Class<?> cls2) {
        m12018b(cls, cls2, null);
    }

    /* renamed from: b */
    public void m12018b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f24859a = cls;
        this.f24860b = cls2;
        this.f24861c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10891g.class != obj.getClass()) {
            return false;
        }
        C10891g c10891g = (C10891g) obj;
        return this.f24859a.equals(c10891g.f24859a) && this.f24860b.equals(c10891g.f24860b) && C10893i.m12009d(this.f24861c, c10891g.f24861c);
    }

    public int hashCode() {
        int hashCode = ((this.f24859a.hashCode() * 31) + this.f24860b.hashCode()) * 31;
        Class<?> cls = this.f24861c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f24859a + ", second=" + this.f24860b + '}';
    }

    public C10891g(Class<?> cls, Class<?> cls2) {
        m12019a(cls, cls2);
    }

    public C10891g(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        m12018b(cls, cls2, cls3);
    }
}
