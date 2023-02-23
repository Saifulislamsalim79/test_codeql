package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C1943b;
import com.bumptech.glide.load.InterfaceC2126l;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.load.engine.p069z.InterfaceC2100e;
import java.security.MessageDigest;
/* compiled from: DrawableTransformation.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.k */
/* loaded from: classes2.dex */
public class C2306k implements InterfaceC2126l<Drawable> {

    /* renamed from: b */
    private final InterfaceC2126l<Bitmap> f6699b;

    /* renamed from: c */
    private final boolean f6700c;

    public C2306k(InterfaceC2126l<Bitmap> interfaceC2126l, boolean z) {
        this.f6699b = interfaceC2126l;
        this.f6700c = z;
    }

    /* renamed from: c */
    private InterfaceC2087u<Drawable> m33344c(Context context, InterfaceC2087u<Bitmap> interfaceC2087u) {
        return C2313p.m33327e(context.getResources(), interfaceC2087u);
    }

    @Override // com.bumptech.glide.load.InterfaceC2126l
    /* renamed from: a */
    public InterfaceC2087u<Drawable> mo33346a(Context context, InterfaceC2087u<Drawable> interfaceC2087u, int i, int i2) {
        InterfaceC2100e m34166f = ComponentCallbacks2C1943b.m34169c(context).m34166f();
        Drawable drawable = interfaceC2087u.get();
        InterfaceC2087u<Bitmap> m33349a = C2304j.m33349a(m34166f, drawable, i, i2);
        if (m33349a == null) {
            if (this.f6700c) {
                throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
            }
            return interfaceC2087u;
        }
        InterfaceC2087u<Bitmap> mo33346a = this.f6699b.mo33346a(context, m33349a, i, i2);
        if (mo33346a.equals(m33349a)) {
            mo33346a.mo33303b();
            return interfaceC2087u;
        }
        return m33344c(context, mo33346a);
    }

    /* renamed from: b */
    public InterfaceC2126l<BitmapDrawable> m33345b() {
        return this;
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public boolean equals(Object obj) {
        if (obj instanceof C2306k) {
            return this.f6699b.equals(((C2306k) obj).f6699b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public int hashCode() {
        return this.f6699b.hashCode();
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f6699b.updateDiskCacheKey(messageDigest);
    }
}
