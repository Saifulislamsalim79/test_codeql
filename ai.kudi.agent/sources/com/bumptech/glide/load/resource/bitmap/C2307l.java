package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p069z.InterfaceC2095b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p201g.p246k.p247a.C7796a;
/* compiled from: ExifInterfaceImageHeaderParser.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.l */
/* loaded from: classes2.dex */
public final class C2307l implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo33343a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo33342b(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public int mo33341c(InputStream inputStream, InterfaceC2095b interfaceC2095b) throws IOException {
        int m17295e = new C7796a(inputStream).m17295e("Orientation", 1);
        if (m17295e == 0) {
            return -1;
        }
        return m17295e;
    }
}
