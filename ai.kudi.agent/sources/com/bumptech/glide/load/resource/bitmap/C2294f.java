package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.InterfaceC2124j;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.p086q.C2367a;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferBitmapDecoder.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.f */
/* loaded from: classes2.dex */
public class C2294f implements InterfaceC2124j<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C2301i f6674a;

    public C2294f(C2301i c2301i) {
        this.f6674a = c2301i;
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: c */
    public InterfaceC2087u<Bitmap> mo33300b(ByteBuffer byteBuffer, int i, int i2, C2122h c2122h) throws IOException {
        return this.f6674a.m33370f(C2367a.m33155f(byteBuffer), i, i2, c2122h);
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: d */
    public boolean mo33301a(ByteBuffer byteBuffer, C2122h c2122h) {
        return this.f6674a.m33359q(byteBuffer);
    }
}
