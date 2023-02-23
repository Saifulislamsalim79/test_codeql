package com.bumptech.glide.p064j;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StrictLineReader.java */
/* renamed from: com.bumptech.glide.j.b */
/* loaded from: classes2.dex */
public class C1962b implements Closeable {

    /* renamed from: c */
    private final InputStream f5981c;

    /* renamed from: d */
    private final Charset f5982d;

    /* renamed from: e */
    private byte[] f5983e;

    /* renamed from: f */
    private int f5984f;

    /* renamed from: w */
    private int f5985w;

    /* compiled from: StrictLineReader.java */
    /* renamed from: com.bumptech.glide.j.b$a */
    /* loaded from: classes2.dex */
    class C1963a extends ByteArrayOutputStream {
        C1963a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, (i <= 0 || ((ByteArrayOutputStream) this).buf[i + (-1)] != 13) ? ((ByteArrayOutputStream) this).count : i - 1, C1962b.this.f5982d.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C1962b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: g */
    private void m34057g() throws IOException {
        InputStream inputStream = this.f5981c;
        byte[] bArr = this.f5983e;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f5984f = 0;
            this.f5985w = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: F */
    public String m34059F() throws IOException {
        int i;
        int i2;
        synchronized (this.f5981c) {
            if (this.f5983e != null) {
                if (this.f5984f >= this.f5985w) {
                    m34057g();
                }
                for (int i3 = this.f5984f; i3 != this.f5985w; i3++) {
                    if (this.f5983e[i3] == 10) {
                        if (i3 != this.f5984f) {
                            i2 = i3 - 1;
                            if (this.f5983e[i2] == 13) {
                                String str = new String(this.f5983e, this.f5984f, i2 - this.f5984f, this.f5982d.name());
                                this.f5984f = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f5983e, this.f5984f, i2 - this.f5984f, this.f5982d.name());
                        this.f5984f = i3 + 1;
                        return str2;
                    }
                }
                C1963a c1963a = new C1963a((this.f5985w - this.f5984f) + 80);
                loop1: while (true) {
                    c1963a.write(this.f5983e, this.f5984f, this.f5985w - this.f5984f);
                    this.f5985w = -1;
                    m34057g();
                    i = this.f5984f;
                    while (i != this.f5985w) {
                        if (this.f5983e[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                if (i != this.f5984f) {
                    c1963a.write(this.f5983e, this.f5984f, i - this.f5984f);
                }
                this.f5984f = i + 1;
                return c1963a.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f5981c) {
            if (this.f5983e != null) {
                this.f5983e = null;
                this.f5981c.close();
            }
        }
    }

    /* renamed from: m */
    public boolean m34056m() {
        return this.f5985w == -1;
    }

    public C1962b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i >= 0) {
            if (charset.equals(C1964c.f5987a)) {
                this.f5981c = inputStream;
                this.f5982d = charset;
                this.f5983e = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }
}
