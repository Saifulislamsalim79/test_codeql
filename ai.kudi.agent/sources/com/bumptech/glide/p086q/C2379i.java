package com.bumptech.glide.p086q;
/* compiled from: MultiClassKey.java */
/* renamed from: com.bumptech.glide.q.i */
/* loaded from: classes2.dex */
public class C2379i {

    /* renamed from: a */
    private Class<?> f6872a;

    /* renamed from: b */
    private Class<?> f6873b;

    /* renamed from: c */
    private Class<?> f6874c;

    public C2379i() {
    }

    /* renamed from: a */
    public void m33133a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f6872a = cls;
        this.f6873b = cls2;
        this.f6874c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2379i.class != obj.getClass()) {
            return false;
        }
        C2379i c2379i = (C2379i) obj;
        return this.f6872a.equals(c2379i.f6872a) && this.f6873b.equals(c2379i.f6873b) && C2381k.m33125c(this.f6874c, c2379i.f6874c);
    }

    public int hashCode() {
        int hashCode = ((this.f6872a.hashCode() * 31) + this.f6873b.hashCode()) * 31;
        Class<?> cls = this.f6874c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f6872a + ", second=" + this.f6873b + '}';
    }

    public C2379i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        m33133a(cls, cls2, cls3);
    }
}
