package com.bumptech.glide.load.p074o.p078g;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C1943b;
import com.bumptech.glide.load.InterfaceC2126l;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.load.resource.bitmap.C2293e;
import com.bumptech.glide.p086q.C2380j;
import java.security.MessageDigest;
/* compiled from: GifDrawableTransformation.java */
/* renamed from: com.bumptech.glide.load.o.g.f */
/* loaded from: classes2.dex */
public class C2269f implements InterfaceC2126l<C2265c> {

    /* renamed from: b */
    private final InterfaceC2126l<Bitmap> f6618b;

    public C2269f(InterfaceC2126l<Bitmap> interfaceC2126l) {
        C2380j.m33129d(interfaceC2126l);
        this.f6618b = interfaceC2126l;
    }

    @Override // com.bumptech.glide.load.InterfaceC2126l
    /* renamed from: a */
    public InterfaceC2087u<C2265c> mo33346a(Context context, InterfaceC2087u<C2265c> interfaceC2087u, int i, int i2) {
        C2265c c2265c = interfaceC2087u.get();
        InterfaceC2087u<Bitmap> c2293e = new C2293e(c2265c.m33452e(), ComponentCallbacks2C1943b.m34169c(context).m34166f());
        InterfaceC2087u<Bitmap> mo33346a = this.f6618b.mo33346a(context, c2293e, i, i2);
        if (!c2293e.equals(mo33346a)) {
            c2293e.mo33303b();
        }
        c2265c.m33444m(this.f6618b, mo33346a.get());
        return interfaceC2087u;
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public boolean equals(Object obj) {
        if (obj instanceof C2269f) {
            return this.f6618b.equals(((C2269f) obj).f6618b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public int hashCode() {
        return this.f6618b.hashCode();
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f6618b.updateDiskCacheKey(messageDigest);
    }
}
