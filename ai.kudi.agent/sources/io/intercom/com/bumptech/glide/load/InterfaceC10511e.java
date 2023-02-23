package io.intercom.com.bumptech.glide.load;

import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: ImageHeaderParser.java */
/* renamed from: io.intercom.com.bumptech.glide.load.e */
/* loaded from: classes3.dex */
public interface InterfaceC10511e {

    /* compiled from: ImageHeaderParser.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.e$a */
    /* loaded from: classes3.dex */
    public enum EnumC10512a {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        

        /* renamed from: c */
        private final boolean f24116c;

        EnumC10512a(boolean z) {
            this.f24116c = z;
        }

        /* renamed from: a */
        public boolean m12873a() {
            return this.f24116c;
        }
    }

    /* renamed from: a */
    EnumC10512a mo12444a(ByteBuffer byteBuffer) throws IOException;

    /* renamed from: b */
    EnumC10512a mo12443b(InputStream inputStream) throws IOException;

    /* renamed from: c */
    int mo12442c(InputStream inputStream, InterfaceC10576b interfaceC10576b) throws IOException;
}
