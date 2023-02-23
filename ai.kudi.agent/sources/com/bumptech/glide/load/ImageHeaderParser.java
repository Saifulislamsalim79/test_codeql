package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.p069z.InterfaceC2095b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
public interface ImageHeaderParser {

    /* loaded from: classes2.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        

        /* renamed from: c */
        private final boolean f6070c;

        ImageType(boolean z) {
            this.f6070c = z;
        }

        public boolean hasAlpha() {
            return this.f6070c;
        }
    }

    /* renamed from: a */
    ImageType mo33343a(ByteBuffer byteBuffer) throws IOException;

    /* renamed from: b */
    ImageType mo33342b(InputStream inputStream) throws IOException;

    /* renamed from: c */
    int mo33341c(InputStream inputStream, InterfaceC2095b interfaceC2095b) throws IOException;
}
