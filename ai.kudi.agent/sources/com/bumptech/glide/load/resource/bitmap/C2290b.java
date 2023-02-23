package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.EnumC1995c;
import com.bumptech.glide.load.InterfaceC2125k;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.load.engine.p069z.InterfaceC2100e;
import java.io.File;
/* compiled from: BitmapDrawableEncoder.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.b */
/* loaded from: classes2.dex */
public class C2290b implements InterfaceC2125k<BitmapDrawable> {

    /* renamed from: a */
    private final InterfaceC2100e f6666a;

    /* renamed from: b */
    private final InterfaceC2125k<Bitmap> f6667b;

    public C2290b(InterfaceC2100e interfaceC2100e, InterfaceC2125k<Bitmap> interfaceC2125k) {
        this.f6666a = interfaceC2100e;
        this.f6667b = interfaceC2125k;
    }

    @Override // com.bumptech.glide.load.InterfaceC2125k
    /* renamed from: b */
    public EnumC1995c mo33387b(C2122h c2122h) {
        return this.f6667b.mo33387b(c2122h);
    }

    @Override // com.bumptech.glide.load.InterfaceC1996d
    /* renamed from: c */
    public boolean mo33388a(InterfaceC2087u<BitmapDrawable> interfaceC2087u, File file, C2122h c2122h) {
        return this.f6667b.mo33388a(new C2293e(interfaceC2087u.get().getBitmap(), this.f6666a), file, c2122h);
    }
}
