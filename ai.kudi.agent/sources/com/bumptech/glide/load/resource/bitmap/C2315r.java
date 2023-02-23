package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.p069z.InterfaceC2095b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: RecyclableBufferedInputStream.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.r */
/* loaded from: classes2.dex */
public class C2315r extends FilterInputStream {

    /* renamed from: c */
    private volatile byte[] f6718c;

    /* renamed from: d */
    private int f6719d;

    /* renamed from: e */
    private int f6720e;

    /* renamed from: f */
    private int f6721f;

    /* renamed from: w */
    private int f6722w;

    /* renamed from: x */
    private final InterfaceC2095b f6723x;

    /* compiled from: RecyclableBufferedInputStream.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.r$a */
    /* loaded from: classes2.dex */
    static class C2316a extends IOException {
        C2316a(String str) {
            super(str);
        }
    }

    public C2315r(InputStream inputStream, InterfaceC2095b interfaceC2095b) {
        this(inputStream, interfaceC2095b, 65536);
    }

    /* renamed from: F */
    private static IOException m33324F() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: c */
    private int m33323c(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f6721f;
        if (i != -1) {
            int i2 = this.f6722w - i;
            int i3 = this.f6720e;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f6719d == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f6723x.mo33714e(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f6718c = bArr2;
                    this.f6723x.mo33715d(bArr);
                    bArr = bArr2;
                } else {
                    int i4 = this.f6721f;
                    if (i4 > 0) {
                        System.arraycopy(bArr, i4, bArr, 0, bArr.length - i4);
                    }
                }
                int i5 = this.f6722w - this.f6721f;
                this.f6722w = i5;
                this.f6721f = 0;
                this.f6719d = 0;
                int read = inputStream.read(bArr, i5, bArr.length - i5);
                int i6 = this.f6722w;
                if (read > 0) {
                    i6 += read;
                }
                this.f6719d = i6;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f6721f = -1;
            this.f6722w = 0;
            this.f6719d = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f6718c != null && inputStream != null) {
        } else {
            m33324F();
            throw null;
        }
        return (this.f6719d - this.f6722w) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f6718c != null) {
            this.f6723x.mo33715d(this.f6718c);
            this.f6718c = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: g */
    public synchronized void m33322g() {
        this.f6720e = this.f6718c.length;
    }

    /* renamed from: m */
    public synchronized void m33321m() {
        if (this.f6718c != null) {
            this.f6723x.mo33715d(this.f6718c);
            this.f6718c = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.f6720e = Math.max(this.f6720e, i);
        this.f6721f = this.f6722w;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f6718c;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f6722w < this.f6719d || m33323c(inputStream, bArr) != -1) {
                if (bArr != this.f6718c && (bArr = this.f6718c) == null) {
                    m33324F();
                    throw null;
                }
                if (this.f6719d - this.f6722w > 0) {
                    int i = this.f6722w;
                    this.f6722w = i + 1;
                    return bArr[i] & 255;
                }
                return -1;
            }
            return -1;
        }
        m33324F();
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f6718c != null) {
            if (-1 != this.f6721f) {
                this.f6722w = this.f6721f;
            } else {
                throw new C2316a("Mark has been invalidated, pos: " + this.f6722w + " markLimit: " + this.f6720e);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f6718c;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                if (this.f6719d - this.f6722w >= j) {
                    this.f6722w = (int) (this.f6722w + j);
                    return j;
                }
                long j2 = this.f6719d - this.f6722w;
                this.f6722w = this.f6719d;
                if (this.f6721f != -1 && j <= this.f6720e) {
                    if (m33323c(inputStream, bArr) == -1) {
                        return j2;
                    }
                    if (this.f6719d - this.f6722w >= j - j2) {
                        this.f6722w = (int) ((this.f6722w + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + this.f6719d) - this.f6722w;
                    this.f6722w = this.f6719d;
                    return j3;
                }
                return j2 + inputStream.skip(j - j2);
            }
            m33324F();
            throw null;
        }
        m33324F();
        throw null;
    }

    C2315r(InputStream inputStream, InterfaceC2095b interfaceC2095b, int i) {
        super(inputStream);
        this.f6721f = -1;
        this.f6723x = interfaceC2095b;
        this.f6718c = (byte[]) interfaceC2095b.mo33714e(i, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.f6718c;
        if (bArr2 == null) {
            m33324F();
            throw null;
        } else if (i2 == 0) {
            return 0;
        } else {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                if (this.f6722w < this.f6719d) {
                    int i5 = this.f6719d - this.f6722w >= i2 ? i2 : this.f6719d - this.f6722w;
                    System.arraycopy(bArr2, this.f6722w, bArr, i, i5);
                    this.f6722w += i5;
                    if (i5 == i2 || inputStream.available() == 0) {
                        return i5;
                    }
                    i += i5;
                    i3 = i2 - i5;
                } else {
                    i3 = i2;
                }
                while (true) {
                    if (this.f6721f == -1 && i3 >= bArr2.length) {
                        i4 = inputStream.read(bArr, i, i3);
                        if (i4 == -1) {
                            return i3 != i2 ? i2 - i3 : -1;
                        }
                    } else if (m33323c(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    } else {
                        if (bArr2 != this.f6718c && (bArr2 = this.f6718c) == null) {
                            m33324F();
                            throw null;
                        }
                        i4 = this.f6719d - this.f6722w >= i3 ? i3 : this.f6719d - this.f6722w;
                        System.arraycopy(bArr2, this.f6722w, bArr, i, i4);
                        this.f6722w += i4;
                    }
                    i3 -= i4;
                    if (i3 == 0) {
                        return i2;
                    }
                    if (inputStream.available() == 0) {
                        return i2 - i3;
                    }
                    i += i4;
                }
            } else {
                m33324F();
                throw null;
            }
        }
    }
}
