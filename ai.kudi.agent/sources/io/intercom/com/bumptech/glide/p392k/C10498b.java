package io.intercom.com.bumptech.glide.p392k;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StrictLineReader.java */
/* renamed from: io.intercom.com.bumptech.glide.k.b */
/* loaded from: classes3.dex */
public class C10498b implements Closeable {

    /* renamed from: c */
    private final InputStream f24036c;

    /* renamed from: d */
    private final Charset f24037d;

    /* renamed from: e */
    private byte[] f24038e;

    /* renamed from: f */
    private int f24039f;

    /* renamed from: w */
    private int f24040w;

    /* compiled from: StrictLineReader.java */
    /* renamed from: io.intercom.com.bumptech.glide.k.b$a */
    /* loaded from: classes3.dex */
    class C10499a extends ByteArrayOutputStream {
        C10499a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, (i <= 0 || ((ByteArrayOutputStream) this).buf[i + (-1)] != 13) ? ((ByteArrayOutputStream) this).count : i - 1, C10498b.this.f24037d.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C10498b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: g */
    private void m12918g() throws IOException {
        InputStream inputStream = this.f24036c;
        byte[] bArr = this.f24038e;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f24039f = 0;
            this.f24040w = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: F */
    public String m12920F() throws IOException {
        int i;
        int i2;
        synchronized (this.f24036c) {
            if (this.f24038e != null) {
                if (this.f24039f >= this.f24040w) {
                    m12918g();
                }
                for (int i3 = this.f24039f; i3 != this.f24040w; i3++) {
                    if (this.f24038e[i3] == 10) {
                        if (i3 != this.f24039f) {
                            i2 = i3 - 1;
                            if (this.f24038e[i2] == 13) {
                                String str = new String(this.f24038e, this.f24039f, i2 - this.f24039f, this.f24037d.name());
                                this.f24039f = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f24038e, this.f24039f, i2 - this.f24039f, this.f24037d.name());
                        this.f24039f = i3 + 1;
                        return str2;
                    }
                }
                C10499a c10499a = new C10499a((this.f24040w - this.f24039f) + 80);
                loop1: while (true) {
                    c10499a.write(this.f24038e, this.f24039f, this.f24040w - this.f24039f);
                    this.f24040w = -1;
                    m12918g();
                    i = this.f24039f;
                    while (i != this.f24040w) {
                        if (this.f24038e[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                if (i != this.f24039f) {
                    c10499a.write(this.f24038e, this.f24039f, i - this.f24039f);
                }
                this.f24039f = i + 1;
                return c10499a.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f24036c) {
            if (this.f24038e != null) {
                this.f24038e = null;
                this.f24036c.close();
            }
        }
    }

    /* renamed from: m */
    public boolean m12917m() {
        return this.f24040w == -1;
    }

    public C10498b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i >= 0) {
            if (charset.equals(C10500c.f24042a)) {
                this.f24036c = inputStream;
                this.f24037d = charset;
                this.f24038e = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }
}
