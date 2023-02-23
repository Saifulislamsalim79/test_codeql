package io.intercom.okhttp3;

import io.intercom.okhttp3.internal.Util;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import p425j.p429b.p433b.C11152f;
import p425j.p429b.p433b.C11158l;
import p425j.p429b.p433b.InterfaceC11150d;
import p425j.p429b.p433b.InterfaceC11170s;
/* loaded from: classes3.dex */
public abstract class RequestBody {
    public static RequestBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            mediaType = MediaType.parse(mediaType + "; charset=utf-8");
        }
        return create(mediaType, str.getBytes(charset));
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract MediaType contentType();

    public abstract void writeTo(InterfaceC11150d interfaceC11150d) throws IOException;

    public static RequestBody create(final MediaType mediaType, final C11152f c11152f) {
        return new RequestBody() { // from class: io.intercom.okhttp3.RequestBody.1
            @Override // io.intercom.okhttp3.RequestBody
            public long contentLength() throws IOException {
                return c11152f.mo11470F();
            }

            @Override // io.intercom.okhttp3.RequestBody
            public MediaType contentType() {
                return MediaType.this;
            }

            @Override // io.intercom.okhttp3.RequestBody
            public void writeTo(InterfaceC11150d interfaceC11150d) throws IOException {
                interfaceC11150d.mo11504y0(c11152f);
            }
        };
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(final MediaType mediaType, final byte[] bArr, final int i, final int i2) {
        if (bArr != null) {
            Util.checkOffsetAndCount(bArr.length, i, i2);
            return new RequestBody() { // from class: io.intercom.okhttp3.RequestBody.2
                @Override // io.intercom.okhttp3.RequestBody
                public long contentLength() {
                    return i2;
                }

                @Override // io.intercom.okhttp3.RequestBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // io.intercom.okhttp3.RequestBody
                public void writeTo(InterfaceC11150d interfaceC11150d) throws IOException {
                    interfaceC11150d.mo11513b(bArr, i, i2);
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public static RequestBody create(final MediaType mediaType, final File file) {
        if (file != null) {
            return new RequestBody() { // from class: io.intercom.okhttp3.RequestBody.3
                @Override // io.intercom.okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // io.intercom.okhttp3.RequestBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // io.intercom.okhttp3.RequestBody
                public void writeTo(InterfaceC11150d interfaceC11150d) throws IOException {
                    InterfaceC11170s interfaceC11170s = null;
                    try {
                        interfaceC11170s = C11158l.m11520j(file);
                        interfaceC11150d.mo11512d0(interfaceC11170s);
                    } finally {
                        Util.closeQuietly(interfaceC11170s);
                    }
                }
            };
        }
        throw new NullPointerException("file == null");
    }
}
