package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: MarkableInputStream.java */
/* renamed from: com.squareup.picasso.n */
/* loaded from: classes2.dex */
final class C7351n extends InputStream {

    /* renamed from: c */
    private final InputStream f17400c;

    /* renamed from: d */
    private long f17401d;

    /* renamed from: e */
    private long f17402e;

    /* renamed from: f */
    private long f17403f;

    /* renamed from: w */
    private long f17404w;

    /* renamed from: x */
    private boolean f17405x;

    /* renamed from: y */
    private int f17406y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7351n(InputStream inputStream) {
        this(inputStream, 4096);
    }

    /* renamed from: F */
    private void m18901F(long j) {
        try {
            if (this.f17402e < this.f17401d && this.f17401d <= this.f17403f) {
                this.f17400c.reset();
                this.f17400c.mark((int) (j - this.f17402e));
                m18900I(this.f17402e, this.f17401d);
            } else {
                this.f17402e = this.f17401d;
                this.f17400c.mark((int) (j - this.f17401d));
            }
            this.f17403f = j;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: " + e);
        }
    }

    /* renamed from: I */
    private void m18900I(long j, long j2) throws IOException {
        while (j < j2) {
            long skip = this.f17400c.skip(j2 - j);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                }
                skip = 1;
            }
            j += skip;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f17400c.available();
    }

    /* renamed from: c */
    public void m18899c(boolean z) {
        this.f17405x = z;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f17400c.close();
    }

    /* renamed from: g */
    public void m18898g(long j) throws IOException {
        if (this.f17401d <= this.f17403f && j >= this.f17402e) {
            this.f17400c.reset();
            m18900I(this.f17402e, j);
            this.f17401d = j;
            return;
        }
        throw new IOException("Cannot reset");
    }

    /* renamed from: m */
    public long m18897m(int i) {
        long j = this.f17401d + i;
        if (this.f17403f < j) {
            m18901F(j);
        }
        return this.f17401d;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f17404w = m18897m(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f17400c.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.f17405x) {
            long j = this.f17403f;
            if (this.f17401d + 1 > j) {
                m18901F(j + this.f17406y);
            }
        }
        int read = this.f17400c.read();
        if (read != -1) {
            this.f17401d++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        m18898g(this.f17404w);
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (!this.f17405x) {
            long j2 = this.f17401d;
            if (j2 + j > this.f17403f) {
                m18901F(j2 + j + this.f17406y);
            }
        }
        long skip = this.f17400c.skip(j);
        this.f17401d += skip;
        return skip;
    }

    C7351n(InputStream inputStream, int i) {
        this(inputStream, i, 1024);
    }

    private C7351n(InputStream inputStream, int i, int i2) {
        this.f17404w = -1L;
        this.f17405x = true;
        this.f17406y = -1;
        this.f17400c = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i);
        this.f17406y = i2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (!this.f17405x) {
            long j = this.f17401d;
            if (bArr.length + j > this.f17403f) {
                m18901F(j + bArr.length + this.f17406y);
            }
        }
        int read = this.f17400c.read(bArr);
        if (read != -1) {
            this.f17401d += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f17405x) {
            long j = this.f17401d;
            long j2 = i2;
            if (j + j2 > this.f17403f) {
                m18901F(j + j2 + this.f17406y);
            }
        }
        int read = this.f17400c.read(bArr, i, i2);
        if (read != -1) {
            this.f17401d += read;
        }
        return read;
    }
}
