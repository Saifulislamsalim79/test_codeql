package io.intercom.com.bumptech.glide.load.p402o.p403c;

import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: RecyclableBufferedInputStream.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.q */
/* loaded from: classes3.dex */
public class C10765q extends FilterInputStream {

    /* renamed from: c */
    private volatile byte[] f24603c;

    /* renamed from: d */
    private int f24604d;

    /* renamed from: e */
    private int f24605e;

    /* renamed from: f */
    private int f24606f;

    /* renamed from: w */
    private int f24607w;

    /* renamed from: x */
    private final InterfaceC10576b f24608x;

    /* compiled from: RecyclableBufferedInputStream.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.c.q$a */
    /* loaded from: classes3.dex */
    static class C10766a extends IOException {
        C10766a(String str) {
            super(str);
        }
    }

    public C10765q(InputStream inputStream, InterfaceC10576b interfaceC10576b) {
        this(inputStream, interfaceC10576b, 65536);
    }

    /* renamed from: F */
    private static IOException m12390F() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: c */
    private int m12389c(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f24606f;
        if (i != -1) {
            int i2 = this.f24607w - i;
            int i3 = this.f24605e;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f24604d == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f24608x.mo12686e(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f24603c = bArr2;
                    this.f24608x.mo12687d(bArr);
                    bArr = bArr2;
                } else {
                    int i4 = this.f24606f;
                    if (i4 > 0) {
                        System.arraycopy(bArr, i4, bArr, 0, bArr.length - i4);
                    }
                }
                int i5 = this.f24607w - this.f24606f;
                this.f24607w = i5;
                this.f24606f = 0;
                this.f24604d = 0;
                int read = inputStream.read(bArr, i5, bArr.length - i5);
                int i6 = this.f24607w;
                if (read > 0) {
                    i6 += read;
                }
                this.f24604d = i6;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f24606f = -1;
            this.f24607w = 0;
            this.f24604d = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f24603c != null && inputStream != null) {
        } else {
            m12390F();
            throw null;
        }
        return (this.f24604d - this.f24607w) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f24603c != null) {
            this.f24608x.mo12687d(this.f24603c);
            this.f24603c = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: g */
    public synchronized void m12388g() {
        this.f24605e = this.f24603c.length;
    }

    /* renamed from: m */
    public synchronized void m12387m() {
        if (this.f24603c != null) {
            this.f24608x.mo12687d(this.f24603c);
            this.f24603c = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.f24605e = Math.max(this.f24605e, i);
        this.f24606f = this.f24607w;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f24603c;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f24607w < this.f24604d || m12389c(inputStream, bArr) != -1) {
                if (bArr != this.f24603c && (bArr = this.f24603c) == null) {
                    m12390F();
                    throw null;
                }
                if (this.f24604d - this.f24607w > 0) {
                    int i = this.f24607w;
                    this.f24607w = i + 1;
                    return bArr[i] & 255;
                }
                return -1;
            }
            return -1;
        }
        m12390F();
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f24603c != null) {
            if (-1 != this.f24606f) {
                this.f24607w = this.f24606f;
            } else {
                throw new C10766a("Mark has been invalidated, pos: " + this.f24607w + " markLimit: " + this.f24605e);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        byte[] bArr = this.f24603c;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null) {
            m12390F();
            throw null;
        } else if (j < 1) {
            return 0L;
        } else {
            if (inputStream != null) {
                if (this.f24604d - this.f24607w >= j) {
                    this.f24607w = (int) (this.f24607w + j);
                    return j;
                }
                long j2 = this.f24604d - this.f24607w;
                this.f24607w = this.f24604d;
                if (this.f24606f != -1 && j <= this.f24605e) {
                    if (m12389c(inputStream, bArr) == -1) {
                        return j2;
                    }
                    long j3 = j - j2;
                    if (this.f24604d - this.f24607w >= j3) {
                        this.f24607w = (int) (this.f24607w + j3);
                        return j;
                    }
                    long j4 = (j2 + this.f24604d) - this.f24607w;
                    this.f24607w = this.f24604d;
                    return j4;
                }
                return j2 + inputStream.skip(j - j2);
            }
            m12390F();
            throw null;
        }
    }

    C10765q(InputStream inputStream, InterfaceC10576b interfaceC10576b, int i) {
        super(inputStream);
        this.f24606f = -1;
        this.f24608x = interfaceC10576b;
        this.f24603c = (byte[]) interfaceC10576b.mo12686e(i, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.f24603c;
        if (bArr2 == null) {
            m12390F();
            throw null;
        } else if (i2 == 0) {
            return 0;
        } else {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                if (this.f24607w < this.f24604d) {
                    int i5 = this.f24604d - this.f24607w >= i2 ? i2 : this.f24604d - this.f24607w;
                    System.arraycopy(bArr2, this.f24607w, bArr, i, i5);
                    this.f24607w += i5;
                    if (i5 == i2 || inputStream.available() == 0) {
                        return i5;
                    }
                    i += i5;
                    i3 = i2 - i5;
                } else {
                    i3 = i2;
                }
                while (true) {
                    if (this.f24606f == -1 && i3 >= bArr2.length) {
                        i4 = inputStream.read(bArr, i, i3);
                        if (i4 == -1) {
                            return i3 != i2 ? i2 - i3 : -1;
                        }
                    } else if (m12389c(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    } else {
                        if (bArr2 != this.f24603c && (bArr2 = this.f24603c) == null) {
                            m12390F();
                            throw null;
                        }
                        i4 = this.f24604d - this.f24607w >= i3 ? i3 : this.f24604d - this.f24607w;
                        System.arraycopy(bArr2, this.f24607w, bArr, i, i4);
                        this.f24607w += i4;
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
                m12390F();
                throw null;
            }
        }
    }
}
