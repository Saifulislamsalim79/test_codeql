package p425j.p429b.p433b;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealBufferedSource.java */
/* renamed from: j.b.b.n */
/* loaded from: classes3.dex */
public final class C11164n implements InterfaceC11151e {

    /* renamed from: c */
    public final C11146c f25240c = new C11146c();

    /* renamed from: d */
    public final InterfaceC11170s f25241d;

    /* renamed from: e */
    boolean f25242e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11164n(InterfaceC11170s interfaceC11170s) {
        if (interfaceC11170s != null) {
            this.f25241d = interfaceC11170s;
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: B */
    public long mo11503B(byte b) throws IOException {
        return m11498c(b, 0L, Long.MAX_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r1 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo11502C() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            r6.mo11482z(r0)
            r0 = 0
            r1 = 0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.mo11495e(r3)
            if (r3 == 0) goto L4a
            j.b.b.c r3 = r6.f25240c
            long r4 = (long) r1
            byte r3 = r3.m11576P(r4)
            r4 = 48
            if (r3 < r4) goto L1f
            r4 = 57
            if (r3 <= r4) goto L30
        L1f:
            r4 = 97
            if (r3 < r4) goto L27
            r4 = 102(0x66, float:1.43E-43)
            if (r3 <= r4) goto L30
        L27:
            r4 = 65
            if (r3 < r4) goto L32
            r4 = 70
            if (r3 <= r4) goto L30
            goto L32
        L30:
            r1 = r2
            goto L7
        L32:
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L4a:
            j.b.b.c r0 = r6.f25240c
            long r0 = r0.mo11502C()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p425j.p429b.p433b.C11164n.mo11502C():long");
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: D */
    public InputStream mo11501D() {
        return new C11165a();
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: Y */
    public long mo11500Y(InterfaceC11169r interfaceC11169r) throws IOException {
        if (interfaceC11169r != null) {
            long j = 0;
            while (this.f25241d.read(this.f25240c, 8192L) != -1) {
                long m11583F = this.f25240c.m11583F();
                if (m11583F > 0) {
                    j += m11583F;
                    interfaceC11169r.write(this.f25240c, m11583F);
                }
            }
            if (this.f25240c.m11579J0() > 0) {
                long m11579J0 = j + this.f25240c.m11579J0();
                C11146c c11146c = this.f25240c;
                interfaceC11169r.write(c11146c, c11146c.m11579J0());
                return m11579J0;
            }
            return j;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: a */
    public void mo11499a(long j) throws IOException {
        if (this.f25242e) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        while (j > 0) {
            C11146c c11146c = this.f25240c;
            if (c11146c.f25206d == 0 && this.f25241d.read(c11146c, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.f25240c.m11579J0());
            this.f25240c.mo11499a(min);
            j -= min;
        }
    }

    /* renamed from: c */
    public long m11498c(byte b, long j, long j2) throws IOException {
        if (this.f25242e) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j), Long.valueOf(j2)));
        }
        while (j < j2) {
            long m11573X = this.f25240c.m11573X(b, j, j2);
            if (m11573X == -1) {
                C11146c c11146c = this.f25240c;
                long j3 = c11146c.f25206d;
                if (j3 >= j2 || this.f25241d.read(c11146c, 8192L) == -1) {
                    break;
                }
                j = Math.max(j, j3);
            } else {
                return m11573X;
            }
        }
        return -1L;
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: c0 */
    public void mo11497c0(C11146c c11146c, long j) throws IOException {
        try {
            mo11482z(j);
            this.f25240c.mo11497c0(c11146c, j);
        } catch (EOFException e) {
            c11146c.mo11512d0(this.f25240c);
            throw e;
        }
    }

    @Override // p425j.p429b.p433b.InterfaceC11170s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f25242e) {
            return;
        }
        this.f25242e = true;
        this.f25241d.close();
        this.f25240c.m11568c();
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e, p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: d */
    public C11146c mo11496d() {
        return this.f25240c;
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: e */
    public boolean mo11495e(long j) throws IOException {
        C11146c c11146c;
        if (j >= 0) {
            if (!this.f25242e) {
                do {
                    c11146c = this.f25240c;
                    if (c11146c.f25206d >= j) {
                        return true;
                    }
                } while (this.f25241d.read(c11146c, 8192L) != -1);
                return false;
            }
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        throw new IllegalArgumentException("byteCount < 0: " + j);
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: f */
    public C11152f mo11494f(long j) throws IOException {
        mo11482z(j);
        return this.f25240c.mo11494f(j);
    }

    /* renamed from: g */
    public boolean m11493g(long j, C11152f c11152f, int i, int i2) throws IOException {
        if (!this.f25242e) {
            if (j < 0 || i < 0 || i2 < 0 || c11152f.mo11470F() - i < i2) {
                return false;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = i3 + j;
                if (!mo11495e(1 + j2) || this.f25240c.m11576P(j2) != c11152f.mo11461p(i + i3)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f25242e;
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: k */
    public byte[] mo11492k() throws IOException {
        this.f25240c.mo11512d0(this.f25241d);
        return this.f25240c.mo11492k();
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: l */
    public boolean mo11491l() throws IOException {
        if (this.f25242e) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        return this.f25240c.mo11491l() && this.f25241d.read(this.f25240c, 8192L) == -1;
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: m0 */
    public boolean mo11490m0(long j, C11152f c11152f) throws IOException {
        return m11493g(j, c11152f, 0, c11152f.mo11470F());
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: p */
    public long mo11489p() throws IOException {
        byte m11576P;
        mo11482z(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo11495e(i2)) {
                break;
            }
            m11576P = this.f25240c.m11576P(i);
            if ((m11576P < 48 || m11576P > 57) && !(i == 0 && m11576P == 45)) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(m11576P)));
        }
        return this.f25240c.mo11489p();
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: q */
    public String mo11488q(long j) throws IOException {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long m11498c = m11498c((byte) 10, 0L, j2);
            if (m11498c != -1) {
                return this.f25240c.m11581H0(m11498c);
            }
            if (j2 < Long.MAX_VALUE && mo11495e(j2) && this.f25240c.m11576P(j2 - 1) == 13 && mo11495e(1 + j2) && this.f25240c.m11576P(j2) == 10) {
                return this.f25240c.m11581H0(j2);
            }
            C11146c c11146c = new C11146c();
            C11146c c11146c2 = this.f25240c;
            c11146c2.m11580I(c11146c, 0L, Math.min(32L, c11146c2.m11579J0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f25240c.m11579J0(), j) + " content=" + c11146c.m11550z0().mo11460q() + (char) 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    @Override // p425j.p429b.p433b.InterfaceC11170s
    public long read(C11146c c11146c, long j) throws IOException {
        if (c11146c != null) {
            if (j >= 0) {
                if (!this.f25242e) {
                    C11146c c11146c2 = this.f25240c;
                    if (c11146c2.f25206d == 0 && this.f25241d.read(c11146c2, 8192L) == -1) {
                        return -1L;
                    }
                    return this.f25240c.read(c11146c, Math.min(j, this.f25240c.f25206d));
                }
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    public byte readByte() throws IOException {
        mo11482z(1L);
        return this.f25240c.readByte();
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    public void readFully(byte[] bArr) throws IOException {
        try {
            mo11482z(bArr.length);
            this.f25240c.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                C11146c c11146c = this.f25240c;
                long j = c11146c.f25206d;
                if (j <= 0) {
                    throw e;
                }
                int m11552u0 = c11146c.m11552u0(bArr, i, (int) j);
                if (m11552u0 == -1) {
                    throw new AssertionError();
                }
                i += m11552u0;
            }
        }
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    public int readInt() throws IOException {
        mo11482z(4L);
        return this.f25240c.readInt();
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    public long readLong() throws IOException {
        mo11482z(8L);
        return this.f25240c.readLong();
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    public short readShort() throws IOException {
        mo11482z(2L);
        return this.f25240c.readShort();
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: s */
    public String mo11487s(Charset charset) throws IOException {
        if (charset != null) {
            this.f25240c.mo11512d0(this.f25241d);
            return this.f25240c.mo11487s(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // p425j.p429b.p433b.InterfaceC11170s
    public C11171t timeout() {
        return this.f25241d.timeout();
    }

    public String toString() {
        return "buffer(" + this.f25241d + ")";
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: u */
    public String mo11486u() throws IOException {
        return mo11488q(Long.MAX_VALUE);
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: v */
    public int mo11485v() throws IOException {
        mo11482z(4L);
        return this.f25240c.mo11485v();
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: w */
    public byte[] mo11484w(long j) throws IOException {
        mo11482z(j);
        return this.f25240c.mo11484w(j);
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: y */
    public short mo11483y() throws IOException {
        mo11482z(2L);
        return this.f25240c.mo11483y();
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: z */
    public void mo11482z(long j) throws IOException {
        if (!mo11495e(j)) {
            throw new EOFException();
        }
    }

    /* compiled from: RealBufferedSource.java */
    /* renamed from: j.b.b.n$a */
    /* loaded from: classes3.dex */
    class C11165a extends InputStream {
        C11165a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            C11164n c11164n = C11164n.this;
            if (!c11164n.f25242e) {
                return (int) Math.min(c11164n.f25240c.f25206d, 2147483647L);
            }
            throw new IOException(MetricTracker.Action.CLOSED);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C11164n.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            C11164n c11164n = C11164n.this;
            if (!c11164n.f25242e) {
                C11146c c11146c = c11164n.f25240c;
                if (c11146c.f25206d == 0 && c11164n.f25241d.read(c11146c, 8192L) == -1) {
                    return -1;
                }
                return C11164n.this.f25240c.readByte() & 255;
            }
            throw new IOException(MetricTracker.Action.CLOSED);
        }

        public String toString() {
            return C11164n.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!C11164n.this.f25242e) {
                C11173u.m11454b(bArr.length, i, i2);
                C11164n c11164n = C11164n.this;
                C11146c c11146c = c11164n.f25240c;
                if (c11146c.f25206d == 0 && c11164n.f25241d.read(c11146c, 8192L) == -1) {
                    return -1;
                }
                return C11164n.this.f25240c.m11552u0(bArr, i, i2);
            }
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        C11146c c11146c = this.f25240c;
        if (c11146c.f25206d == 0 && this.f25241d.read(c11146c, 8192L) == -1) {
            return -1;
        }
        return this.f25240c.read(byteBuffer);
    }
}
