package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.InterfaceC2082q;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.p086q.C2380j;
/* compiled from: LazyBitmapDrawableResource.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.p */
/* loaded from: classes2.dex */
public final class C2313p implements InterfaceC2087u<BitmapDrawable>, InterfaceC2082q {

    /* renamed from: c */
    private final Resources f6715c;

    /* renamed from: d */
    private final InterfaceC2087u<Bitmap> f6716d;

    private C2313p(Resources resources, InterfaceC2087u<Bitmap> interfaceC2087u) {
        C2380j.m33129d(resources);
        this.f6715c = resources;
        C2380j.m33129d(interfaceC2087u);
        this.f6716d = interfaceC2087u;
    }

    /* renamed from: e */
    public static InterfaceC2087u<BitmapDrawable> m33327e(Resources resources, InterfaceC2087u<Bitmap> interfaceC2087u) {
        if (interfaceC2087u == null) {
            return null;
        }
        return new C2313p(resources, interfaceC2087u);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2082q
    /* renamed from: a */
    public void mo33329a() {
        InterfaceC2087u<Bitmap> interfaceC2087u = this.f6716d;
        if (interfaceC2087u instanceof InterfaceC2082q) {
            ((InterfaceC2082q) interfaceC2087u).mo33329a();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    /* renamed from: b */
    public void mo33303b() {
        this.f6716d.mo33303b();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    /* renamed from: c */
    public Class<BitmapDrawable> mo33302c() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    /* renamed from: d */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f6715c, this.f6716d.get());
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    public int getSize() {
        return this.f6716d.getSize();
    }
}
