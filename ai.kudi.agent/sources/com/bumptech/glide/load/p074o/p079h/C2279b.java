package com.bumptech.glide.load.p074o.p079h;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.load.resource.bitmap.C2313p;
import com.bumptech.glide.p086q.C2380j;
/* compiled from: BitmapDrawableTranscoder.java */
/* renamed from: com.bumptech.glide.load.o.h.b */
/* loaded from: classes2.dex */
public class C2279b implements InterfaceC2282e<Bitmap, BitmapDrawable> {

    /* renamed from: a */
    private final Resources f6650a;

    public C2279b(Resources resources) {
        C2380j.m33129d(resources);
        this.f6650a = resources;
    }

    @Override // com.bumptech.glide.load.p074o.p079h.InterfaceC2282e
    /* renamed from: a */
    public InterfaceC2087u<BitmapDrawable> mo33407a(InterfaceC2087u<Bitmap> interfaceC2087u, C2122h c2122h) {
        return C2313p.m33327e(this.f6650a, interfaceC2087u);
    }
}
