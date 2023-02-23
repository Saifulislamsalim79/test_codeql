package com.bumptech.glide.load.p070m;

import com.bumptech.glide.load.engine.p069z.InterfaceC2095b;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: BufferedOutputStream.java */
/* renamed from: com.bumptech.glide.load.m.c */
/* loaded from: classes2.dex */
public final class C2129c extends OutputStream {

    /* renamed from: c */
    private final OutputStream f6426c;

    /* renamed from: d */
    private byte[] f6427d;

    /* renamed from: e */
    private InterfaceC2095b f6428e;

    /* renamed from: f */
    private int f6429f;

    public C2129c(OutputStream outputStream, InterfaceC2095b interfaceC2095b) {
        this(outputStream, interfaceC2095b, 65536);
    }

    /* renamed from: c */
    private void m33655c() throws IOException {
        int i = this.f6429f;
        if (i > 0) {
            this.f6426c.write(this.f6427d, 0, i);
            this.f6429f = 0;
        }
    }

    /* renamed from: g */
    private void m33654g() throws IOException {
        if (this.f6429f == this.f6427d.length) {
            m33655c();
        }
    }

    /* renamed from: m */
    private void m33653m() {
        byte[] bArr = this.f6427d;
        if (bArr != null) {
            this.f6428e.mo33715d(bArr);
            this.f6427d = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f6426c.close();
            m33653m();
        } catch (Throwable th) {
            this.f6426c.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m33655c();
        this.f6426c.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f6427d;
        int i2 = this.f6429f;
        this.f6429f = i2 + 1;
        bArr[i2] = (byte) i;
        m33654g();
    }

    C2129c(OutputStream outputStream, InterfaceC2095b interfaceC2095b, int i) {
        this.f6426c = outputStream;
        this.f6428e = interfaceC2095b;
        this.f6427d = (byte[]) interfaceC2095b.mo33714e(i, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            if (this.f6429f == 0 && i4 >= this.f6427d.length) {
                this.f6426c.write(bArr, i5, i4);
                return;
            }
            int min = Math.min(i4, this.f6427d.length - this.f6429f);
            System.arraycopy(bArr, i5, this.f6427d, this.f6429f, min);
            this.f6429f += min;
            i3 += min;
            m33654g();
        } while (i3 < i2);
    }
}
