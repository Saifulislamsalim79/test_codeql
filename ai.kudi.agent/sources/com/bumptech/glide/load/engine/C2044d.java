package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.InterfaceC2118f;
import java.security.MessageDigest;
/* compiled from: DataCacheKey.java */
/* renamed from: com.bumptech.glide.load.engine.d */
/* loaded from: classes2.dex */
final class C2044d implements InterfaceC2118f {

    /* renamed from: b */
    private final InterfaceC2118f f6171b;

    /* renamed from: c */
    private final InterfaceC2118f f6172c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2044d(InterfaceC2118f interfaceC2118f, InterfaceC2118f interfaceC2118f2) {
        this.f6171b = interfaceC2118f;
        this.f6172c = interfaceC2118f2;
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public boolean equals(Object obj) {
        if (obj instanceof C2044d) {
            C2044d c2044d = (C2044d) obj;
            return this.f6171b.equals(c2044d.f6171b) && this.f6172c.equals(c2044d.f6172c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public int hashCode() {
        return (this.f6171b.hashCode() * 31) + this.f6172c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f6171b + ", signature=" + this.f6172c + '}';
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f6171b.updateDiskCacheKey(messageDigest);
        this.f6172c.updateDiskCacheKey(messageDigest);
    }
}
