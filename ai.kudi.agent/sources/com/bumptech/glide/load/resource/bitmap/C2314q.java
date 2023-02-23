package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.InterfaceC2124j;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import java.io.IOException;
/* compiled from: ParcelFileDescriptorBitmapDecoder.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.q */
/* loaded from: classes2.dex */
public final class C2314q implements InterfaceC2124j<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a */
    private final C2301i f6717a;

    public C2314q(C2301i c2301i) {
        this.f6717a = c2301i;
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: c */
    public InterfaceC2087u<Bitmap> mo33300b(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, C2122h c2122h) throws IOException {
        return this.f6717a.m33372d(parcelFileDescriptor, i, i2, c2122h);
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: d */
    public boolean mo33301a(ParcelFileDescriptor parcelFileDescriptor, C2122h c2122h) {
        return this.f6717a.m33361o(parcelFileDescriptor);
    }
}
