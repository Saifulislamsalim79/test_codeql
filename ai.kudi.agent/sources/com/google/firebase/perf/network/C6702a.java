package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.C6695b;
import com.google.firebase.perf.p178j.C6637h;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: InstrHttpInputStream.java */
/* renamed from: com.google.firebase.perf.network.a */
/* loaded from: classes2.dex */
public final class C6702a extends InputStream {

    /* renamed from: c */
    private final InputStream f16113c;

    /* renamed from: d */
    private final C6695b f16114d;

    /* renamed from: e */
    private final C6637h f16115e;

    /* renamed from: w */
    private long f16117w;

    /* renamed from: f */
    private long f16116f = -1;

    /* renamed from: x */
    private long f16118x = -1;

    public C6702a(InputStream inputStream, C6695b c6695b, C6637h c6637h) {
        this.f16115e = c6637h;
        this.f16113c = inputStream;
        this.f16114d = c6695b;
        this.f16117w = c6695b.m21107e();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.f16113c.available();
        } catch (IOException e) {
            this.f16114d.m21094r(this.f16115e.m21401b());
            C6709h.m20990d(this.f16114d);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long m21401b = this.f16115e.m21401b();
        if (this.f16118x == -1) {
            this.f16118x = m21401b;
        }
        try {
            this.f16113c.close();
            if (this.f16116f != -1) {
                this.f16114d.m21096p(this.f16116f);
            }
            if (this.f16117w != -1) {
                this.f16114d.m21093s(this.f16117w);
            }
            this.f16114d.m21094r(this.f16118x);
            this.f16114d.m21110b();
        } catch (IOException e) {
            this.f16114d.m21094r(this.f16115e.m21401b());
            C6709h.m20990d(this.f16114d);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f16113c.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f16113c.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int read = this.f16113c.read();
            long m21401b = this.f16115e.m21401b();
            if (this.f16117w == -1) {
                this.f16117w = m21401b;
            }
            if (read == -1 && this.f16118x == -1) {
                this.f16118x = m21401b;
                this.f16114d.m21094r(m21401b);
                this.f16114d.m21110b();
            } else {
                long j = this.f16116f + 1;
                this.f16116f = j;
                this.f16114d.m21096p(j);
            }
            return read;
        } catch (IOException e) {
            this.f16114d.m21094r(this.f16115e.m21401b());
            C6709h.m20990d(this.f16114d);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
            this.f16113c.reset();
        } catch (IOException e) {
            this.f16114d.m21094r(this.f16115e.m21401b());
            C6709h.m20990d(this.f16114d);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            long skip = this.f16113c.skip(j);
            long m21401b = this.f16115e.m21401b();
            if (this.f16117w == -1) {
                this.f16117w = m21401b;
            }
            if (skip == -1 && this.f16118x == -1) {
                this.f16118x = m21401b;
                this.f16114d.m21094r(m21401b);
            } else {
                long j2 = this.f16116f + skip;
                this.f16116f = j2;
                this.f16114d.m21096p(j2);
            }
            return skip;
        } catch (IOException e) {
            this.f16114d.m21094r(this.f16115e.m21401b());
            C6709h.m20990d(this.f16114d);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int read = this.f16113c.read(bArr, i, i2);
            long m21401b = this.f16115e.m21401b();
            if (this.f16117w == -1) {
                this.f16117w = m21401b;
            }
            if (read == -1 && this.f16118x == -1) {
                this.f16118x = m21401b;
                this.f16114d.m21094r(m21401b);
                this.f16114d.m21110b();
            } else {
                long j = this.f16116f + read;
                this.f16116f = j;
                this.f16114d.m21096p(j);
            }
            return read;
        } catch (IOException e) {
            this.f16114d.m21094r(this.f16115e.m21401b());
            C6709h.m20990d(this.f16114d);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int read = this.f16113c.read(bArr);
            long m21401b = this.f16115e.m21401b();
            if (this.f16117w == -1) {
                this.f16117w = m21401b;
            }
            if (read == -1 && this.f16118x == -1) {
                this.f16118x = m21401b;
                this.f16114d.m21094r(m21401b);
                this.f16114d.m21110b();
            } else {
                long j = this.f16116f + read;
                this.f16116f = j;
                this.f16114d.m21096p(j);
            }
            return read;
        } catch (IOException e) {
            this.f16114d.m21094r(this.f16115e.m21401b());
            C6709h.m20990d(this.f16114d);
            throw e;
        }
    }
}
