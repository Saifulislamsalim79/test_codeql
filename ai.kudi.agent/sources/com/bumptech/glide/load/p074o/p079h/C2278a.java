package com.bumptech.glide.load.p074o.p079h;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.load.p074o.p075d.C2253b;
import java.io.ByteArrayOutputStream;
/* compiled from: BitmapBytesTranscoder.java */
/* renamed from: com.bumptech.glide.load.o.h.a */
/* loaded from: classes2.dex */
public class C2278a implements InterfaceC2282e<Bitmap, byte[]> {

    /* renamed from: a */
    private final Bitmap.CompressFormat f6648a;

    /* renamed from: b */
    private final int f6649b;

    public C2278a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // com.bumptech.glide.load.p074o.p079h.InterfaceC2282e
    /* renamed from: a */
    public InterfaceC2087u<byte[]> mo33407a(InterfaceC2087u<Bitmap> interfaceC2087u, C2122h c2122h) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        interfaceC2087u.get().compress(this.f6648a, this.f6649b, byteArrayOutputStream);
        interfaceC2087u.mo33303b();
        return new C2253b(byteArrayOutputStream.toByteArray());
    }

    public C2278a(Bitmap.CompressFormat compressFormat, int i) {
        this.f6648a = compressFormat;
        this.f6649b = i;
    }
}
