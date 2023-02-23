package com.bumptech.glide.load.p074o.p079h;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.load.engine.p069z.InterfaceC2100e;
import com.bumptech.glide.load.p074o.p078g.C2265c;
import com.bumptech.glide.load.resource.bitmap.C2293e;
/* compiled from: DrawableBytesTranscoder.java */
/* renamed from: com.bumptech.glide.load.o.h.c */
/* loaded from: classes2.dex */
public final class C2280c implements InterfaceC2282e<Drawable, byte[]> {

    /* renamed from: a */
    private final InterfaceC2100e f6651a;

    /* renamed from: b */
    private final InterfaceC2282e<Bitmap, byte[]> f6652b;

    /* renamed from: c */
    private final InterfaceC2282e<C2265c, byte[]> f6653c;

    public C2280c(InterfaceC2100e interfaceC2100e, InterfaceC2282e<Bitmap, byte[]> interfaceC2282e, InterfaceC2282e<C2265c, byte[]> interfaceC2282e2) {
        this.f6651a = interfaceC2100e;
        this.f6652b = interfaceC2282e;
        this.f6653c = interfaceC2282e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static InterfaceC2087u<C2265c> m33412b(InterfaceC2087u<Drawable> interfaceC2087u) {
        return interfaceC2087u;
    }

    @Override // com.bumptech.glide.load.p074o.p079h.InterfaceC2282e
    /* renamed from: a */
    public InterfaceC2087u<byte[]> mo33407a(InterfaceC2087u<Drawable> interfaceC2087u, C2122h c2122h) {
        Drawable drawable = interfaceC2087u.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f6652b.mo33407a(C2293e.m33382e(((BitmapDrawable) drawable).getBitmap(), this.f6651a), c2122h);
        }
        if (drawable instanceof C2265c) {
            InterfaceC2282e<C2265c, byte[]> interfaceC2282e = this.f6653c;
            m33412b(interfaceC2087u);
            return interfaceC2282e.mo33407a(interfaceC2087u, c2122h);
        }
        return null;
    }
}
