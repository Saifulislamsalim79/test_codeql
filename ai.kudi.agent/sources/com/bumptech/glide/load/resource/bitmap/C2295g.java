package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.InterfaceC2124j;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.g */
/* loaded from: classes2.dex */
public final class C2295g implements InterfaceC2124j<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C2292d f6675a = new C2292d();

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: c */
    public InterfaceC2087u<Bitmap> mo33300b(ByteBuffer byteBuffer, int i, int i2, C2122h c2122h) throws IOException {
        return this.f6675a.mo33300b(ImageDecoder.createSource(byteBuffer), i, i2, c2122h);
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: d */
    public boolean mo33301a(ByteBuffer byteBuffer, C2122h c2122h) throws IOException {
        return true;
    }
}
