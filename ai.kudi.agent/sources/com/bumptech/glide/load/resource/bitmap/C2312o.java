package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.InterfaceC2124j;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.p086q.C2367a;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: InputStreamBitmapImageDecoderResourceDecoder.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.o */
/* loaded from: classes2.dex */
public final class C2312o implements InterfaceC2124j<InputStream, Bitmap> {

    /* renamed from: a */
    private final C2292d f6714a = new C2292d();

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: c */
    public InterfaceC2087u<Bitmap> mo33300b(InputStream inputStream, int i, int i2, C2122h c2122h) throws IOException {
        return this.f6714a.mo33300b(ImageDecoder.createSource(C2367a.m33159b(inputStream)), i, i2, c2122h);
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: d */
    public boolean mo33301a(InputStream inputStream, C2122h c2122h) throws IOException {
        return true;
    }
}
