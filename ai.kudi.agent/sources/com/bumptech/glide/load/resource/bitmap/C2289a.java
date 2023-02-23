package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.InterfaceC2124j;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.p086q.C2380j;
import java.io.IOException;
/* compiled from: BitmapDrawableDecoder.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.a */
/* loaded from: classes2.dex */
public class C2289a<DataType> implements InterfaceC2124j<DataType, BitmapDrawable> {

    /* renamed from: a */
    private final InterfaceC2124j<DataType, Bitmap> f6664a;

    /* renamed from: b */
    private final Resources f6665b;

    public C2289a(Resources resources, InterfaceC2124j<DataType, Bitmap> interfaceC2124j) {
        C2380j.m33129d(resources);
        this.f6665b = resources;
        C2380j.m33129d(interfaceC2124j);
        this.f6664a = interfaceC2124j;
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: a */
    public boolean mo33301a(DataType datatype, C2122h c2122h) throws IOException {
        return this.f6664a.mo33301a(datatype, c2122h);
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: b */
    public InterfaceC2087u<BitmapDrawable> mo33300b(DataType datatype, int i, int i2, C2122h c2122h) throws IOException {
        return C2313p.m33327e(this.f6665b, this.f6664a.mo33300b(datatype, i, i2, c2122h));
    }
}
