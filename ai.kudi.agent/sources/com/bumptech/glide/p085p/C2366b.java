package com.bumptech.glide.p085p;

import com.bumptech.glide.load.InterfaceC2118f;
import com.bumptech.glide.p086q.C2380j;
import java.security.MessageDigest;
/* compiled from: ObjectKey.java */
/* renamed from: com.bumptech.glide.p.b */
/* loaded from: classes2.dex */
public final class C2366b implements InterfaceC2118f {

    /* renamed from: b */
    private final Object f6851b;

    public C2366b(Object obj) {
        C2380j.m33129d(obj);
        this.f6851b = obj;
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public boolean equals(Object obj) {
        if (obj instanceof C2366b) {
            return this.f6851b.equals(((C2366b) obj).f6851b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public int hashCode() {
        return this.f6851b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f6851b + '}';
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(this.f6851b.toString().getBytes(InterfaceC2118f.f6413a));
    }
}
