package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.load.engine.p069z.C2101f;
import com.bumptech.glide.load.engine.p069z.InterfaceC2100e;
import com.bumptech.glide.load.p074o.AbstractC2246a;
import java.io.IOException;
/* compiled from: BitmapImageDecoderResourceDecoder.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.d */
/* loaded from: classes2.dex */
public final class C2292d extends AbstractC2246a<Bitmap> {

    /* renamed from: b */
    private final InterfaceC2100e f6671b = new C2101f();

    @Override // com.bumptech.glide.load.p074o.AbstractC2246a
    /* renamed from: c */
    protected InterfaceC2087u<Bitmap> mo33384c(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C2293e(decodeBitmap, this.f6671b);
    }
}
