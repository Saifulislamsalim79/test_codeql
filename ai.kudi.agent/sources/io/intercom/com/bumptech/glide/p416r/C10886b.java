package io.intercom.com.bumptech.glide.p416r;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ContentLengthInputStream.java */
/* renamed from: io.intercom.com.bumptech.glide.r.b */
/* loaded from: classes3.dex */
public final class C10886b extends FilterInputStream {

    /* renamed from: c */
    private final long f24849c;

    /* renamed from: d */
    private int f24850d;

    private C10886b(InputStream inputStream, long j) {
        super(inputStream);
        this.f24849c = j;
    }

    /* renamed from: c */
    private int m12038c(int i) throws IOException {
        if (i >= 0) {
            this.f24850d += i;
        } else if (this.f24849c - this.f24850d > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f24849c + ", but read: " + this.f24850d);
        }
        return i;
    }

    /* renamed from: g */
    public static InputStream m12037g(InputStream inputStream, long j) {
        return new C10886b(inputStream, j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f24849c - this.f24850d, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        m12038c(read >= 0 ? 1 : -1);
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
        m12038c(read);
        return read;
    }
}
