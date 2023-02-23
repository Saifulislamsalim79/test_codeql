package com.bumptech.glide.p086q;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ContentLengthInputStream.java */
/* renamed from: com.bumptech.glide.q.c */
/* loaded from: classes2.dex */
public final class C2371c extends FilterInputStream {

    /* renamed from: c */
    private final long f6859c;

    /* renamed from: d */
    private int f6860d;

    private C2371c(InputStream inputStream, long j) {
        super(inputStream);
        this.f6859c = j;
    }

    /* renamed from: c */
    private int m33154c(int i) throws IOException {
        if (i >= 0) {
            this.f6860d += i;
        } else if (this.f6859c - this.f6860d > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f6859c + ", but read: " + this.f6860d);
        }
        return i;
    }

    /* renamed from: g */
    public static InputStream m33153g(InputStream inputStream, long j) {
        return new C2371c(inputStream, j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f6859c - this.f6860d, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        m33154c(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        read = super.read(bArr, i, i2);
        m33154c(read);
        return read;
    }
}
