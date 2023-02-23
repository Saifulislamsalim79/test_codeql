package p576m;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealBufferedSource.java */
/* renamed from: m.n */
/* loaded from: classes3.dex */
public final class C14359n implements InterfaceC14346e {

    /* renamed from: c */
    public final C14342c f31648c = new C14342c();

    /* renamed from: d */
    public final InterfaceC14365s f31649d;

    /* renamed from: e */
    boolean f31650e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14359n(InterfaceC14365s interfaceC14365s) {
        if (interfaceC14365s != null) {
            this.f31649d = interfaceC14365s;
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: B */
    public long mo1999B(byte b) throws IOException {
        return m1993c(b, 0L, Long.MAX_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r1 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // p576m.InterfaceC14346e
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo1998C() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            r6.mo1978z(r0)
            r0 = 0
            r1 = 0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.mo1991e(r3)
            if (r3 == 0) goto L4a
            m.c r3 = r6.f31648c
            long r4 = (long) r1
            byte r3 = r3.m2066P(r4)
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
            m.c r0 = r6.f31648c
            long r0 = r0.mo1998C()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p576m.C14359n.mo1998C():long");
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: D */
    public InputStream mo1997D() {
        return new C14360a();
    }

    @Override // p576m.InterfaceC14365s
    /* renamed from: O0 */
    public long mo312O0(C14342c c14342c, long j) throws IOException {
        if (c14342c != null) {
            if (j >= 0) {
                if (!this.f31650e) {
                    C14342c c14342c2 = this.f31648c;
                    if (c14342c2.f31619d == 0 && this.f31649d.mo312O0(c14342c2, 8192L) == -1) {
                        return -1L;
                    }
                    return this.f31648c.mo312O0(c14342c, Math.min(j, this.f31648c.f31619d));
                }
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: R */
    public C14342c mo1996R() {
        return this.f31648c;
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: R0 */
    public long mo1995R0(InterfaceC14364r interfaceC14364r) throws IOException {
        if (interfaceC14364r != null) {
            long j = 0;
            while (this.f31649d.mo312O0(this.f31648c, 8192L) != -1) {
                long m2073F = this.f31648c.m2073F();
                if (m2073F > 0) {
                    j += m2073F;
                    interfaceC14364r.mo1444r0(this.f31648c, m2073F);
                }
            }
            if (this.f31648c.m2072F0() > 0) {
                long m2072F0 = j + this.f31648c.m2072F0();
                C14342c c14342c = this.f31648c;
                interfaceC14364r.mo1444r0(c14342c, c14342c.m2072F0());
                return m2072F0;
            }
            return j;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: a */
    public void mo1994a(long j) throws IOException {
        if (this.f31650e) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        while (j > 0) {
            C14342c c14342c = this.f31648c;
            if (c14342c.f31619d == 0 && this.f31649d.mo312O0(c14342c, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.f31648c.m2072F0());
            this.f31648c.mo1994a(min);
            j -= min;
        }
    }

    /* renamed from: c */
    public long m1993c(byte b, long j, long j2) throws IOException {
        if (this.f31650e) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j), Long.valueOf(j2)));
        }
        while (j < j2) {
            long m2063X = this.f31648c.m2063X(b, j, j2);
            if (m2063X == -1) {
                C14342c c14342c = this.f31648c;
                long j3 = c14342c.f31619d;
                if (j3 >= j2 || this.f31649d.mo312O0(c14342c, 8192L) == -1) {
                    break;
                }
                j = Math.max(j, j3);
            } else {
                return m2063X;
            }
        }
        return -1L;
    }

    @Override // p576m.InterfaceC14365s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f31650e) {
            return;
        }
        this.f31650e = true;
        this.f31649d.close();
        this.f31648c.m2058c();
    }

    @Override // p576m.InterfaceC14346e, p576m.InterfaceC14345d
    /* renamed from: d */
    public C14342c mo1992d() {
        return this.f31648c;
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: e */
    public boolean mo1991e(long j) throws IOException {
        C14342c c14342c;
        if (j >= 0) {
            if (!this.f31650e) {
                do {
                    c14342c = this.f31648c;
                    if (c14342c.f31619d >= j) {
                        return true;
                    }
                } while (this.f31649d.mo312O0(c14342c, 8192L) != -1);
                return false;
            }
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        throw new IllegalArgumentException("byteCount < 0: " + j);
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: f */
    public C14347f mo1990f(long j) throws IOException {
        mo1978z(j);
        return this.f31648c.mo1990f(j);
    }

    /* renamed from: g */
    public boolean m1989g(long j, C14347f c14347f, int i, int i2) throws IOException {
        if (!this.f31650e) {
            if (j < 0 || i < 0 || i2 < 0 || c14347f.mo1969A() - i < i2) {
                return false;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = i3 + j;
                if (!mo1991e(1 + j2) || this.f31648c.m2066P(j2) != c14347f.mo1960n(i + i3)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f31650e;
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: k */
    public byte[] mo1988k() throws IOException {
        this.f31648c.mo2002s0(this.f31649d);
        return this.f31648c.mo1988k();
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: l */
    public boolean mo1987l() throws IOException {
        if (this.f31650e) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        return this.f31648c.mo1987l() && this.f31649d.mo312O0(this.f31648c, 8192L) == -1;
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: l0 */
    public boolean mo1986l0(long j, C14347f c14347f) throws IOException {
        return m1989g(j, c14347f, 0, c14347f.mo1969A());
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: p */
    public long mo1985p() throws IOException {
        byte m2066P;
        mo1978z(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo1991e(i2)) {
                break;
            }
            m2066P = this.f31648c.m2066P(i);
            if ((m2066P < 48 || m2066P > 57) && !(i == 0 && m2066P == 45)) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(m2066P)));
        }
        return this.f31648c.mo1985p();
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: q */
    public String mo1984q(long j) throws IOException {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long m1993c = m1993c((byte) 10, 0L, j2);
            if (m1993c != -1) {
                return this.f31648c.m2074D0(m1993c);
            }
            if (j2 < Long.MAX_VALUE && mo1991e(j2) && this.f31648c.m2066P(j2 - 1) == 13 && mo1991e(1 + j2) && this.f31648c.m2066P(j2) == 10) {
                return this.f31648c.m2074D0(j2);
            }
            C14342c c14342c = new C14342c();
            C14342c c14342c2 = this.f31648c;
            c14342c2.m2070I(c14342c, 0L, Math.min(32L, c14342c2.m2072F0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f31648c.m2072F0(), j) + " content=" + c14342c.m2046o0().mo1959p() + (char) 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        C14342c c14342c = this.f31648c;
        if (c14342c.f31619d == 0 && this.f31649d.mo312O0(c14342c, 8192L) == -1) {
            return -1;
        }
        return this.f31648c.read(byteBuffer);
    }

    @Override // p576m.InterfaceC14346e
    public byte readByte() throws IOException {
        mo1978z(1L);
        return this.f31648c.readByte();
    }

    @Override // p576m.InterfaceC14346e
    public void readFully(byte[] bArr) throws IOException {
        try {
            mo1978z(bArr.length);
            this.f31648c.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                C14342c c14342c = this.f31648c;
                long j = c14342c.f31619d;
                if (j <= 0) {
                    throw e;
                }
                int m2049i0 = c14342c.m2049i0(bArr, i, (int) j);
                if (m2049i0 == -1) {
                    throw new AssertionError();
                }
                i += m2049i0;
            }
        }
    }

    @Override // p576m.InterfaceC14346e
    public int readInt() throws IOException {
        mo1978z(4L);
        return this.f31648c.readInt();
    }

    @Override // p576m.InterfaceC14346e
    public short readShort() throws IOException {
        mo1978z(2L);
        return this.f31648c.readShort();
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: s */
    public String mo1983s(Charset charset) throws IOException {
        if (charset != null) {
            this.f31648c.mo2002s0(this.f31649d);
            return this.f31648c.mo1983s(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // p576m.InterfaceC14365s
    public C14366t timeout() {
        return this.f31649d.timeout();
    }

    public String toString() {
        return "buffer(" + this.f31649d + ")";
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: u */
    public String mo1982u() throws IOException {
        return mo1984q(Long.MAX_VALUE);
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: v */
    public int mo1981v() throws IOException {
        mo1978z(4L);
        return this.f31648c.mo1981v();
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: w */
    public byte[] mo1980w(long j) throws IOException {
        mo1978z(j);
        return this.f31648c.mo1980w(j);
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: y */
    public short mo1979y() throws IOException {
        mo1978z(2L);
        return this.f31648c.mo1979y();
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: z */
    public void mo1978z(long j) throws IOException {
        if (!mo1991e(j)) {
            throw new EOFException();
        }
    }

    /* compiled from: RealBufferedSource.java */
    /* renamed from: m.n$a */
    /* loaded from: classes3.dex */
    class C14360a extends InputStream {
        C14360a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            C14359n c14359n = C14359n.this;
            if (!c14359n.f31650e) {
                return (int) Math.min(c14359n.f31648c.f31619d, 2147483647L);
            }
            throw new IOException(MetricTracker.Action.CLOSED);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C14359n.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            C14359n c14359n = C14359n.this;
            if (!c14359n.f31650e) {
                C14342c c14342c = c14359n.f31648c;
                if (c14342c.f31619d == 0 && c14359n.f31649d.mo312O0(c14342c, 8192L) == -1) {
                    return -1;
                }
                return C14359n.this.f31648c.readByte() & 255;
            }
            throw new IOException(MetricTracker.Action.CLOSED);
        }

        public String toString() {
            return C14359n.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!C14359n.this.f31650e) {
                C14368u.m1944b(bArr.length, i, i2);
                C14359n c14359n = C14359n.this;
                C14342c c14342c = c14359n.f31648c;
                if (c14342c.f31619d == 0 && c14359n.f31649d.mo312O0(c14342c, 8192L) == -1) {
                    return -1;
                }
                return C14359n.this.f31648c.m2049i0(bArr, i, i2);
            }
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }
}
