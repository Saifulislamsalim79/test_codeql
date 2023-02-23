package p272h.p286c.p287a.p300b.p307d.p313f;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: h.c.a.b.d.f.k */
/* loaded from: classes2.dex */
final class C8442k extends FilterInputStream {

    /* renamed from: c */
    private long f20124c;

    /* renamed from: d */
    private long f20125d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8442k(InputStream inputStream, long j) {
        super(inputStream);
        this.f20125d = -1L;
        if (inputStream == null) {
            throw null;
        }
        this.f20124c = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f20124c);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f20125d = this.f20124c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f20124c == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f20124c--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.f20125d != -1) {
                ((FilterInputStream) this).in.reset();
                this.f20124c = this.f20125d;
            } else {
                throw new IOException("Mark not set");
            }
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.f20124c));
        this.f20124c -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f20124c;
        if (j == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
        if (read != -1) {
            this.f20124c -= read;
        }
        return read;
    }
}
