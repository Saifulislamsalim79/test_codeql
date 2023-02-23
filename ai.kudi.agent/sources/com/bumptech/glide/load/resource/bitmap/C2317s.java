package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.InterfaceC2124j;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.load.engine.p069z.InterfaceC2100e;
import com.bumptech.glide.load.p074o.p076e.C2257d;
/* compiled from: ResourceBitmapDecoder.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.s */
/* loaded from: classes2.dex */
public class C2317s implements InterfaceC2124j<Uri, Bitmap> {

    /* renamed from: a */
    private final C2257d f6724a;

    /* renamed from: b */
    private final InterfaceC2100e f6725b;

    public C2317s(C2257d c2257d, InterfaceC2100e interfaceC2100e) {
        this.f6724a = c2257d;
        this.f6725b = interfaceC2100e;
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: c */
    public InterfaceC2087u<Bitmap> mo33300b(Uri uri, int i, int i2, C2122h c2122h) {
        InterfaceC2087u<Drawable> mo33300b = this.f6724a.mo33300b(uri, i, i2, c2122h);
        if (mo33300b == null) {
            return null;
        }
        return C2304j.m33349a(this.f6725b, mo33300b.get(), i, i2);
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: d */
    public boolean mo33301a(Uri uri, C2122h c2122h) {
        return "android.resource".equals(uri.getScheme());
    }
}
