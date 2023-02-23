package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.C6695b;
import com.google.firebase.perf.p178j.C6637h;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: InstrHttpOutputStream.java */
/* renamed from: com.google.firebase.perf.network.b */
/* loaded from: classes2.dex */
public final class C6703b extends OutputStream {

    /* renamed from: c */
    private final OutputStream f16119c;

    /* renamed from: d */
    private final C6637h f16120d;

    /* renamed from: e */
    C6695b f16121e;

    /* renamed from: f */
    long f16122f = -1;

    public C6703b(OutputStream outputStream, C6695b c6695b, C6637h c6637h) {
        this.f16119c = outputStream;
        this.f16121e = c6695b;
        this.f16120d = c6637h;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long j = this.f16122f;
        if (j != -1) {
            this.f16121e.m21099m(j);
        }
        this.f16121e.m21095q(this.f16120d.m21401b());
        try {
            this.f16119c.close();
        } catch (IOException e) {
            this.f16121e.m21094r(this.f16120d.m21401b());
            C6709h.m20990d(this.f16121e);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.f16119c.flush();
        } catch (IOException e) {
            this.f16121e.m21094r(this.f16120d.m21401b());
            C6709h.m20990d(this.f16121e);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        try {
            this.f16119c.write(i);
            long j = this.f16122f + 1;
            this.f16122f = j;
            this.f16121e.m21099m(j);
        } catch (IOException e) {
            this.f16121e.m21094r(this.f16120d.m21401b());
            C6709h.m20990d(this.f16121e);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.f16119c.write(bArr);
            long length = this.f16122f + bArr.length;
            this.f16122f = length;
            this.f16121e.m21099m(length);
        } catch (IOException e) {
            this.f16121e.m21094r(this.f16120d.m21401b());
            C6709h.m20990d(this.f16121e);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.f16119c.write(bArr, i, i2);
            long j = this.f16122f + i2;
            this.f16122f = j;
            this.f16121e.m21099m(j);
        } catch (IOException e) {
            this.f16121e.m21094r(this.f16120d.m21401b());
            C6709h.m20990d(this.f16121e);
            throw e;
        }
    }
}
