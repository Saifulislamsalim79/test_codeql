package io.intercom.com.bumptech.glide.p416r;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: MarkEnforcingInputStream.java */
/* renamed from: io.intercom.com.bumptech.glide.r.f */
/* loaded from: classes3.dex */
public class C10890f extends FilterInputStream {

    /* renamed from: c */
    private int f24858c;

    public C10890f(InputStream inputStream) {
        super(inputStream);
        this.f24858c = Integer.MIN_VALUE;
    }

    /* renamed from: c */
    private long m12021c(long j) {
        int i = this.f24858c;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    /* renamed from: g */
    private void m12020g(long j) {
        int i = this.f24858c;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f24858c = (int) (i - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i = this.f24858c;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        super.mark(i);
        this.f24858c = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m12021c(1L) == -1) {
            return -1;
        }
        int read = super.read();
        m12020g(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        super.reset();
        this.f24858c = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long m12021c = m12021c(j);
        if (m12021c == -1) {
            return 0L;
        }
        long skip = super.skip(m12021c);
        m12020g(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int m12021c = (int) m12021c(i2);
        if (m12021c == -1) {
            return -1;
        }
        int read = super.read(bArr, i, m12021c);
        m12020g(read);
        return read;
    }
}
