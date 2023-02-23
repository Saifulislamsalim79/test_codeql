package io.intercom.com.bumptech.glide.load;

import java.security.MessageDigest;
import p201g.p218e.C7521a;
/* compiled from: Options.java */
/* renamed from: io.intercom.com.bumptech.glide.load.i */
/* loaded from: classes3.dex */
public final class C10626i implements InterfaceC10622g {

    /* renamed from: b */
    private final C7521a<C10623h<?>, Object> f24424b = new C7521a<>();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private static <T> void m12590d(C10623h<T> c10623h, Object obj, MessageDigest messageDigest) {
        c10623h.m12594g(obj, messageDigest);
    }

    /* renamed from: a */
    public <T> T m12593a(C10623h<T> c10623h) {
        return this.f24424b.containsKey(c10623h) ? (T) this.f24424b.get(c10623h) : c10623h.m12598c();
    }

    /* renamed from: b */
    public void m12592b(C10626i c10626i) {
        this.f24424b.mo18451l(c10626i.f24424b);
    }

    /* renamed from: c */
    public <T> C10626i m12591c(C10623h<T> c10623h, T t) {
        this.f24424b.put(c10623h, t);
        return this;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public boolean equals(Object obj) {
        if (obj instanceof C10626i) {
            return this.f24424b.equals(((C10626i) obj).f24424b);
        }
        return false;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public int hashCode() {
        return this.f24424b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f24424b + '}';
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        for (int i = 0; i < this.f24424b.size(); i++) {
            m12590d(this.f24424b.m18452k(i), this.f24424b.m18448o(i), messageDigest);
        }
    }
}
