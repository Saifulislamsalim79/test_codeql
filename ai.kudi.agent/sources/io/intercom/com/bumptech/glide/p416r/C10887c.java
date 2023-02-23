package io.intercom.com.bumptech.glide.p416r;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
/* compiled from: ExceptionCatchingInputStream.java */
/* renamed from: io.intercom.com.bumptech.glide.r.c */
/* loaded from: classes3.dex */
public class C10887c extends InputStream {

    /* renamed from: e */
    private static final Queue<C10887c> f24851e = C10893i.m12007f(0);

    /* renamed from: c */
    private InputStream f24852c;

    /* renamed from: d */
    private IOException f24853d;

    C10887c() {
    }

    /* renamed from: g */
    public static C10887c m12034g(InputStream inputStream) {
        C10887c poll;
        synchronized (f24851e) {
            poll = f24851e.poll();
        }
        if (poll == null) {
            poll = new C10887c();
        }
        poll.m12036F(inputStream);
        return poll;
    }

    /* renamed from: F */
    void m12036F(InputStream inputStream) {
        this.f24852c = inputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f24852c.available();
    }

    /* renamed from: c */
    public IOException m12035c() {
        return this.f24853d;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f24852c.close();
    }

    /* renamed from: m */
    public void m12033m() {
        this.f24853d = null;
        this.f24852c = null;
        synchronized (f24851e) {
            f24851e.offer(this);
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f24852c.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f24852c.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f24852c.read(bArr);
        } catch (IOException e) {
            this.f24853d = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f24852c.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return this.f24852c.skip(j);
        } catch (IOException e) {
            this.f24853d = e;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f24852c.read(bArr, i, i2);
        } catch (IOException e) {
            this.f24853d = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f24852c.read();
        } catch (IOException e) {
            this.f24853d = e;
            return -1;
        }
    }
}
