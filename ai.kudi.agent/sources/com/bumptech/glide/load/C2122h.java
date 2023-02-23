package com.bumptech.glide.load;

import com.bumptech.glide.p086q.C2370b;
import java.security.MessageDigest;
import p201g.p218e.C7521a;
/* compiled from: Options.java */
/* renamed from: com.bumptech.glide.load.h */
/* loaded from: classes2.dex */
public final class C2122h implements InterfaceC2118f {

    /* renamed from: b */
    private final C7521a<C2119g<?>, Object> f6419b = new C2370b();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    private static <T> void m33658e(C2119g<T> c2119g, Object obj, MessageDigest messageDigest) {
        c2119g.m33662g(obj, messageDigest);
    }

    /* renamed from: b */
    public <T> T m33661b(C2119g<T> c2119g) {
        return this.f6419b.containsKey(c2119g) ? (T) this.f6419b.get(c2119g) : c2119g.m33666c();
    }

    /* renamed from: c */
    public void m33660c(C2122h c2122h) {
        this.f6419b.mo18451l(c2122h.f6419b);
    }

    /* renamed from: d */
    public <T> C2122h m33659d(C2119g<T> c2119g, T t) {
        this.f6419b.put(c2119g, t);
        return this;
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public boolean equals(Object obj) {
        if (obj instanceof C2122h) {
            return this.f6419b.equals(((C2122h) obj).f6419b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public int hashCode() {
        return this.f6419b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f6419b + '}';
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        for (int i = 0; i < this.f6419b.size(); i++) {
            m33658e(this.f6419b.m18452k(i), this.f6419b.m18448o(i), messageDigest);
        }
    }
}
