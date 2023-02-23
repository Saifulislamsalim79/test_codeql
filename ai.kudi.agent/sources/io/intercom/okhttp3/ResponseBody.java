package io.intercom.okhttp3;

import io.intercom.okhttp3.internal.Util;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import p425j.p429b.p433b.C11146c;
import p425j.p429b.p433b.C11152f;
import p425j.p429b.p433b.InterfaceC11151e;
/* loaded from: classes3.dex */
public abstract class ResponseBody implements Closeable {
    private Reader reader;

    /* loaded from: classes3.dex */
    static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final InterfaceC11151e source;

        BomAwareReader(InterfaceC11151e interfaceC11151e, Charset charset) {
            this.source = interfaceC11151e;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    InputStreamReader inputStreamReader = new InputStreamReader(this.source.mo11501D(), Util.bomAwareCharset(this.source, this.charset));
                    this.delegate = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    private Charset charset() {
        MediaType contentType = contentType();
        return contentType != null ? contentType.charset(Util.UTF_8) : Util.UTF_8;
    }

    public static ResponseBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            mediaType = MediaType.parse(mediaType + "; charset=utf-8");
        }
        C11146c c11146c = new C11146c();
        c11146c.m11557j1(str, charset);
        return create(mediaType, c11146c.m11579J0(), c11146c);
    }

    public final InputStream byteStream() {
        return source().mo11501D();
    }

    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            InterfaceC11151e source = source();
            try {
                byte[] mo11492k = source.mo11492k();
                Util.closeQuietly(source);
                if (contentLength == -1 || contentLength == mo11492k.length) {
                    return mo11492k;
                }
                throw new IOException("Content-Length (" + contentLength + ") and stream length (" + mo11492k.length + ") disagree");
            } catch (Throwable th) {
                Util.closeQuietly(source);
                throw th;
            }
        }
        throw new IOException("Cannot buffer entire body for content length: " + contentLength);
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract InterfaceC11151e source();

    public final String string() throws IOException {
        InterfaceC11151e source = source();
        try {
            return source.mo11487s(Util.bomAwareCharset(source, charset()));
        } finally {
            Util.closeQuietly(source);
        }
    }

    public static ResponseBody create(MediaType mediaType, byte[] bArr) {
        C11146c c11146c = new C11146c();
        c11146c.m11571Z0(bArr);
        return create(mediaType, bArr.length, c11146c);
    }

    public static ResponseBody create(MediaType mediaType, C11152f c11152f) {
        C11146c c11146c = new C11146c();
        c11146c.m11572X0(c11152f);
        return create(mediaType, c11152f.mo11470F(), c11146c);
    }

    public static ResponseBody create(final MediaType mediaType, final long j, final InterfaceC11151e interfaceC11151e) {
        if (interfaceC11151e != null) {
            return new ResponseBody() { // from class: io.intercom.okhttp3.ResponseBody.1
                @Override // io.intercom.okhttp3.ResponseBody
                public long contentLength() {
                    return j;
                }

                @Override // io.intercom.okhttp3.ResponseBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // io.intercom.okhttp3.ResponseBody
                public InterfaceC11151e source() {
                    return interfaceC11151e;
                }
            };
        }
        throw new NullPointerException("source == null");
    }
}
