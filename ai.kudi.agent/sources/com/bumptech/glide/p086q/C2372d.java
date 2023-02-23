package com.bumptech.glide.p086q;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
/* compiled from: ExceptionCatchingInputStream.java */
/* renamed from: com.bumptech.glide.q.d */
/* loaded from: classes2.dex */
public class C2372d extends InputStream {

    /* renamed from: e */
    private static final Queue<C2372d> f6861e = C2381k.m33123e(0);

    /* renamed from: c */
    private InputStream f6862c;

    /* renamed from: d */
    private IOException f6863d;

    C2372d() {
    }

    /* renamed from: g */
    public static C2372d m33150g(InputStream inputStream) {
        C2372d poll;
        synchronized (f6861e) {
            poll = f6861e.poll();
        }
        if (poll == null) {
            poll = new C2372d();
        }
        poll.m33152F(inputStream);
        return poll;
    }

    /* renamed from: F */
    void m33152F(InputStream inputStream) {
        this.f6862c = inputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f6862c.available();
    }

    /* renamed from: c */
    public IOException m33151c() {
        return this.f6863d;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6862c.close();
    }

    /* renamed from: m */
    public void m33149m() {
        this.f6863d = null;
        this.f6862c = null;
        synchronized (f6861e) {
            f6861e.offer(this);
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f6862c.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f6862c.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f6862c.read(bArr);
        } catch (IOException e) {
            this.f6863d = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f6862c.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return this.f6862c.skip(j);
        } catch (IOException e) {
            this.f6863d = e;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f6862c.read(bArr, i, i2);
        } catch (IOException e) {
            this.f6863d = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f6862c.read();
        } catch (IOException e) {
            this.f6863d = e;
            return -1;
        }
    }
}
