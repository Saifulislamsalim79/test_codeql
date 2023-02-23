package com.bumptech.glide.p086q;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: MarkEnforcingInputStream.java */
/* renamed from: com.bumptech.glide.q.h */
/* loaded from: classes2.dex */
public class C2378h extends FilterInputStream {

    /* renamed from: c */
    private int f6871c;

    public C2378h(InputStream inputStream) {
        super(inputStream);
        this.f6871c = Integer.MIN_VALUE;
    }

    /* renamed from: c */
    private long m33135c(long j) {
        int i = this.f6871c;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    /* renamed from: g */
    private void m33134g(long j) {
        int i = this.f6871c;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f6871c = (int) (i - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i = this.f6871c;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        super.mark(i);
        this.f6871c = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m33135c(1L) == -1) {
            return -1;
        }
        int read = super.read();
        m33134g(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f6871c = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long m33135c = m33135c(j);
        if (m33135c == -1) {
            return 0L;
        }
        long skip = super.skip(m33135c);
        m33134g(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int m33135c = (int) m33135c(i2);
        if (m33135c == -1) {
            return -1;
        }
        int read = super.read(bArr, i, m33135c);
        m33134g(read);
        return read;
    }
}
