package p425j.p429b.p433b;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
/* compiled from: Buffer.java */
/* renamed from: j.b.b.c */
/* loaded from: classes3.dex */
public final class C11146c implements InterfaceC11151e, InterfaceC11150d, Cloneable, ByteChannel {

    /* renamed from: e */
    private static final byte[] f25204e = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: c */
    C11166o f25205c;

    /* renamed from: d */
    long f25206d;

    /* compiled from: Buffer.java */
    /* renamed from: j.b.b.c$a */
    /* loaded from: classes3.dex */
    class C11147a extends OutputStream {
        C11147a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return C11146c.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            C11146c.this.m11567c1((byte) i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            C11146c.this.m11569b1(bArr, i, i2);
        }
    }

    /* compiled from: Buffer.java */
    /* renamed from: j.b.b.c$b */
    /* loaded from: classes3.dex */
    class C11148b extends InputStream {
        C11148b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C11146c.this.f25206d, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            C11146c c11146c = C11146c.this;
            if (c11146c.f25206d > 0) {
                return c11146c.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C11146c.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return C11146c.this.m11552u0(bArr, i, i2);
        }
    }

    /* compiled from: Buffer.java */
    /* renamed from: j.b.b.c$c */
    /* loaded from: classes3.dex */
    public static final class C11149c implements Closeable {

        /* renamed from: c */
        public C11146c f25209c;

        /* renamed from: d */
        public boolean f25210d;

        /* renamed from: e */
        private C11166o f25211e;

        /* renamed from: w */
        public byte[] f25213w;

        /* renamed from: f */
        public long f25212f = -1;

        /* renamed from: x */
        public int f25214x = -1;

        /* renamed from: y */
        public int f25215y = -1;

        /* renamed from: c */
        public final int m11549c() {
            long j = this.f25212f;
            if (j != this.f25209c.f25206d) {
                if (j == -1) {
                    return m11548g(0L);
                }
                return m11548g(j + (this.f25215y - this.f25214x));
            }
            throw new IllegalStateException();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f25209c != null) {
                this.f25209c = null;
                this.f25211e = null;
                this.f25212f = -1L;
                this.f25213w = null;
                this.f25214x = -1;
                this.f25215y = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        /* renamed from: g */
        public final int m11548g(long j) {
            if (j >= -1) {
                C11146c c11146c = this.f25209c;
                long j2 = c11146c.f25206d;
                if (j <= j2) {
                    if (j != -1 && j != j2) {
                        long j3 = 0;
                        C11166o c11166o = c11146c.f25205c;
                        C11166o c11166o2 = this.f25211e;
                        if (c11166o2 != null) {
                            long j4 = this.f25212f - (this.f25214x - c11166o2.f25245b);
                            if (j4 > j) {
                                j2 = j4;
                                c11166o2 = c11166o;
                                c11166o = c11166o2;
                            } else {
                                j3 = j4;
                            }
                        } else {
                            c11166o2 = c11166o;
                        }
                        if (j2 - j > j - j3) {
                            while (true) {
                                int i = c11166o2.f25246c;
                                int i2 = c11166o2.f25245b;
                                if (j < (i - i2) + j3) {
                                    break;
                                }
                                j3 += i - i2;
                                c11166o2 = c11166o2.f25249f;
                            }
                        } else {
                            while (j2 > j) {
                                c11166o = c11166o.f25250g;
                                j2 -= c11166o.f25246c - c11166o.f25245b;
                            }
                            c11166o2 = c11166o;
                            j3 = j2;
                        }
                        if (this.f25210d && c11166o2.f25247d) {
                            C11166o m11476f = c11166o2.m11476f();
                            C11146c c11146c2 = this.f25209c;
                            if (c11146c2.f25205c == c11166o2) {
                                c11146c2.f25205c = m11476f;
                            }
                            c11166o2.m11479c(m11476f);
                            m11476f.f25250g.m11480b();
                            c11166o2 = m11476f;
                        }
                        this.f25211e = c11166o2;
                        this.f25212f = j;
                        this.f25213w = c11166o2.f25244a;
                        int i3 = c11166o2.f25245b + ((int) (j - j3));
                        this.f25214x = i3;
                        int i4 = c11166o2.f25246c;
                        this.f25215y = i4;
                        return i4 - i3;
                    }
                    this.f25211e = null;
                    this.f25212f = j;
                    this.f25213w = null;
                    this.f25214x = -1;
                    this.f25215y = -1;
                    return -1;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", Long.valueOf(j), Long.valueOf(this.f25209c.f25206d)));
        }
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: A */
    public /* bridge */ /* synthetic */ InterfaceC11150d mo11515A(long j) throws IOException {
        m11566d1(j);
        return this;
    }

    /* renamed from: A0 */
    public String m11585A0(long j, Charset charset) throws EOFException {
        C11173u.m11454b(this.f25206d, 0L, j);
        if (charset != null) {
            if (j > 2147483647L) {
                throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
            } else if (j == 0) {
                return "";
            } else {
                C11166o c11166o = this.f25205c;
                if (c11166o.f25245b + j > c11166o.f25246c) {
                    return new String(mo11484w(j), charset);
                }
                String str = new String(c11166o.f25244a, c11166o.f25245b, (int) j, charset);
                int i = (int) (c11166o.f25245b + j);
                c11166o.f25245b = i;
                this.f25206d -= j;
                if (i == c11166o.f25246c) {
                    this.f25205c = c11166o.m11480b();
                    C11167p.m11474a(c11166o);
                }
                return str;
            }
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: B */
    public long mo11503B(byte b) {
        return m11573X(b, 0L, Long.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3 A[EDGE_INSN: B:43:0x00a3->B:38:0x00a3 ?: BREAK  , SYNTHETIC] */
    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo11502C() {
        /*
            r15 = this;
            long r0 = r15.f25206d
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Laa
            r0 = 0
            r4 = r2
            r1 = 0
        Lb:
            j.b.b.o r6 = r15.f25205c
            byte[] r7 = r6.f25244a
            int r8 = r6.f25245b
            int r9 = r6.f25246c
        L13:
            if (r8 >= r9) goto L8f
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L3a
        L22:
            r11 = 97
            if (r10 < r11) goto L2f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2f
            int r11 = r10 + (-97)
        L2c:
            int r11 = r11 + 10
            goto L3a
        L2f:
            r11 = 65
            if (r10 < r11) goto L70
            r11 = 70
            if (r10 > r11) goto L70
            int r11 = r10 + (-65)
            goto L2c
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L4a:
            j.b.b.c r0 = new j.b.b.c
            r0.<init>()
            r0.m11565e1(r4)
            r0.m11567c1(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.m11584D0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L70:
            if (r0 == 0) goto L74
            r1 = 1
            goto L8f
        L74:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8f:
            if (r8 != r9) goto L9b
            j.b.b.o r7 = r6.m11480b()
            r15.f25205c = r7
            p425j.p429b.p433b.C11167p.m11474a(r6)
            goto L9d
        L9b:
            r6.f25245b = r8
        L9d:
            if (r1 != 0) goto La3
            j.b.b.o r6 = r15.f25205c
            if (r6 != 0) goto Lb
        La3:
            long r1 = r15.f25206d
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f25206d = r1
            return r4
        Laa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            goto Lb3
        Lb2:
            throw r0
        Lb3:
            goto Lb2
        */
        throw new UnsupportedOperationException("Method not decompiled: p425j.p429b.p433b.C11146c.mo11502C():long");
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: D */
    public InputStream mo11501D() {
        return new C11148b();
    }

    /* renamed from: D0 */
    public String m11584D0() {
        try {
            return m11585A0(this.f25206d, C11173u.f25255a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: F */
    public final long m11583F() {
        long j = this.f25206d;
        if (j == 0) {
            return 0L;
        }
        C11166o c11166o = this.f25205c.f25250g;
        int i = c11166o.f25246c;
        return (i >= 8192 || !c11166o.f25248e) ? j : j - (i - c11166o.f25245b);
    }

    /* renamed from: F0 */
    public String m11582F0(long j) throws EOFException {
        return m11585A0(j, C11173u.f25255a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0 */
    public String m11581H0(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (m11576P(j2) == 13) {
                String m11582F0 = m11582F0(j2);
                mo11499a(2L);
                return m11582F0;
            }
        }
        String m11582F02 = m11582F0(j);
        mo11499a(1L);
        return m11582F02;
    }

    /* renamed from: I */
    public final C11146c m11580I(C11146c c11146c, long j, long j2) {
        if (c11146c != null) {
            C11173u.m11454b(this.f25206d, j, j2);
            if (j2 == 0) {
                return this;
            }
            c11146c.f25206d += j2;
            C11166o c11166o = this.f25205c;
            while (true) {
                int i = c11166o.f25246c;
                int i2 = c11166o.f25245b;
                if (j < i - i2) {
                    break;
                }
                j -= i - i2;
                c11166o = c11166o.f25249f;
            }
            while (j2 > 0) {
                C11166o m11478d = c11166o.m11478d();
                int i3 = (int) (m11478d.f25245b + j);
                m11478d.f25245b = i3;
                m11478d.f25246c = Math.min(i3 + ((int) j2), m11478d.f25246c);
                C11166o c11166o2 = c11146c.f25205c;
                if (c11166o2 == null) {
                    m11478d.f25250g = m11478d;
                    m11478d.f25249f = m11478d;
                    c11146c.f25205c = m11478d;
                } else {
                    c11166o2.f25250g.m11479c(m11478d);
                }
                j2 -= m11478d.f25246c - m11478d.f25245b;
                c11166o = c11166o.f25249f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: J0 */
    public final long m11579J0() {
        return this.f25206d;
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: K */
    public InterfaceC11150d mo11514K() {
        return this;
    }

    /* renamed from: K0 */
    public final C11152f m11578K0() {
        long j = this.f25206d;
        if (j <= 2147483647L) {
            return m11575P0((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f25206d);
    }

    /* renamed from: O */
    public C11146c m11577O() {
        return this;
    }

    /* renamed from: P */
    public final byte m11576P(long j) {
        int i;
        C11173u.m11454b(this.f25206d, j, 1L);
        long j2 = this.f25206d;
        if (j2 - j > j) {
            C11166o c11166o = this.f25205c;
            while (true) {
                int i2 = c11166o.f25246c;
                int i3 = c11166o.f25245b;
                long j3 = i2 - i3;
                if (j < j3) {
                    return c11166o.f25244a[i3 + ((int) j)];
                }
                j -= j3;
                c11166o = c11166o.f25249f;
            }
        } else {
            long j4 = j - j2;
            C11166o c11166o2 = this.f25205c;
            do {
                c11166o2 = c11166o2.f25250g;
                int i4 = c11166o2.f25246c;
                i = c11166o2.f25245b;
                j4 += i4 - i;
            } while (j4 < 0);
            return c11166o2.f25244a[i + ((int) j4)];
        }
    }

    /* renamed from: P0 */
    public final C11152f m11575P0(int i) {
        if (i == 0) {
            return C11152f.f25217w;
        }
        return new C11168q(this, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U0 */
    public C11166o m11574U0(int i) {
        if (i >= 1 && i <= 8192) {
            C11166o c11166o = this.f25205c;
            if (c11166o == null) {
                C11166o m11473b = C11167p.m11473b();
                this.f25205c = m11473b;
                m11473b.f25250g = m11473b;
                m11473b.f25249f = m11473b;
                return m11473b;
            }
            C11166o c11166o2 = c11166o.f25250g;
            if (c11166o2.f25246c + i > 8192 || !c11166o2.f25248e) {
                C11166o m11473b2 = C11167p.m11473b();
                c11166o2.m11479c(m11473b2);
                return m11473b2;
            }
            return c11166o2;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: X */
    public long m11573X(byte b, long j, long j2) {
        C11166o c11166o;
        long j3 = 0;
        if (j >= 0 && j2 >= j) {
            long j4 = this.f25206d;
            if (j2 <= j4) {
                j4 = j2;
            }
            if (j == j4 || (c11166o = this.f25205c) == null) {
                return -1L;
            }
            long j5 = this.f25206d;
            if (j5 - j < j) {
                while (j5 > j) {
                    c11166o = c11166o.f25250g;
                    j5 -= c11166o.f25246c - c11166o.f25245b;
                }
            } else {
                while (true) {
                    long j6 = (c11166o.f25246c - c11166o.f25245b) + j3;
                    if (j6 >= j) {
                        break;
                    }
                    c11166o = c11166o.f25249f;
                    j3 = j6;
                }
                j5 = j3;
            }
            long j7 = j;
            while (j5 < j4) {
                byte[] bArr = c11166o.f25244a;
                int min = (int) Math.min(c11166o.f25246c, (c11166o.f25245b + j4) - j5);
                for (int i = (int) ((c11166o.f25245b + j7) - j5); i < min; i++) {
                    if (bArr[i] == b) {
                        return (i - c11166o.f25245b) + j5;
                    }
                }
                j5 += c11166o.f25246c - c11166o.f25245b;
                c11166o = c11166o.f25249f;
                j7 = j5;
            }
            return -1L;
        }
        throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f25206d), Long.valueOf(j), Long.valueOf(j2)));
    }

    /* renamed from: X0 */
    public C11146c m11572X0(C11152f c11152f) {
        if (c11152f != null) {
            c11152f.mo11465Q(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: Y */
    public long mo11500Y(InterfaceC11169r interfaceC11169r) throws IOException {
        long j = this.f25206d;
        if (j > 0) {
            interfaceC11169r.write(this, j);
        }
        return j;
    }

    /* renamed from: Z0 */
    public C11146c m11571Z0(byte[] bArr) {
        if (bArr != null) {
            m11569b1(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: a */
    public void mo11499a(long j) throws EOFException {
        C11166o c11166o;
        while (j > 0) {
            if (this.f25205c != null) {
                int min = (int) Math.min(j, c11166o.f25246c - c11166o.f25245b);
                long j2 = min;
                this.f25206d -= j2;
                j -= j2;
                C11166o c11166o2 = this.f25205c;
                int i = c11166o2.f25245b + min;
                c11166o2.f25245b = i;
                if (i == c11166o2.f25246c) {
                    this.f25205c = c11166o2.m11480b();
                    C11167p.m11474a(c11166o2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: b */
    public /* bridge */ /* synthetic */ InterfaceC11150d mo11513b(byte[] bArr, int i, int i2) throws IOException {
        m11569b1(bArr, i, i2);
        return this;
    }

    /* renamed from: b0 */
    public long m11570b0(C11152f c11152f) {
        return m11564f0(c11152f, 0L);
    }

    /* renamed from: b1 */
    public C11146c m11569b1(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = i2;
            C11173u.m11454b(bArr.length, i, j);
            int i3 = i2 + i;
            while (i < i3) {
                C11166o m11574U0 = m11574U0(1);
                int min = Math.min(i3 - i, 8192 - m11574U0.f25246c);
                System.arraycopy(bArr, i, m11574U0.f25244a, m11574U0.f25246c, min);
                i += min;
                m11574U0.f25246c += min;
            }
            this.f25206d += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: c */
    public final void m11568c() {
        try {
            mo11499a(this.f25206d);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: c0 */
    public void mo11497c0(C11146c c11146c, long j) throws EOFException {
        long j2 = this.f25206d;
        if (j2 >= j) {
            c11146c.write(this, j);
        } else {
            c11146c.write(this, j2);
            throw new EOFException();
        }
    }

    /* renamed from: c1 */
    public C11146c m11567c1(int i) {
        C11166o m11574U0 = m11574U0(1);
        byte[] bArr = m11574U0.f25244a;
        int i2 = m11574U0.f25246c;
        m11574U0.f25246c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f25206d++;
        return this;
    }

    @Override // p425j.p429b.p433b.InterfaceC11170s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e, p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: d */
    public C11146c mo11496d() {
        return this;
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: d0 */
    public long mo11512d0(InterfaceC11170s interfaceC11170s) throws IOException {
        if (interfaceC11170s == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long read = interfaceC11170s.read(this, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    /* renamed from: d1 */
    public C11146c m11566d1(long j) {
        if (j == 0) {
            m11567c1(48);
            return this;
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m11556k1("-9223372036854775808");
                return this;
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        C11166o m11574U0 = m11574U0(i);
        byte[] bArr = m11574U0.f25244a;
        int i2 = m11574U0.f25246c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f25204e[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        m11574U0.f25246c += i;
        this.f25206d += i;
        return this;
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: e */
    public boolean mo11495e(long j) {
        return this.f25206d >= j;
    }

    /* renamed from: e1 */
    public C11146c m11565e1(long j) {
        if (j == 0) {
            m11567c1(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C11166o m11574U0 = m11574U0(numberOfTrailingZeros);
        byte[] bArr = m11574U0.f25244a;
        int i = m11574U0.f25246c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f25204e[(int) (15 & j)];
            j >>>= 4;
        }
        m11574U0.f25246c += numberOfTrailingZeros;
        this.f25206d += numberOfTrailingZeros;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11146c) {
            C11146c c11146c = (C11146c) obj;
            long j = this.f25206d;
            if (j != c11146c.f25206d) {
                return false;
            }
            long j2 = 0;
            if (j == 0) {
                return true;
            }
            C11166o c11166o = this.f25205c;
            C11166o c11166o2 = c11146c.f25205c;
            int i = c11166o.f25245b;
            int i2 = c11166o2.f25245b;
            while (j2 < this.f25206d) {
                long min = Math.min(c11166o.f25246c - i, c11166o2.f25246c - i2);
                int i3 = 0;
                while (i3 < min) {
                    int i4 = i + 1;
                    int i5 = i2 + 1;
                    if (c11166o.f25244a[i] != c11166o2.f25244a[i2]) {
                        return false;
                    }
                    i3++;
                    i = i4;
                    i2 = i5;
                }
                if (i == c11166o.f25246c) {
                    c11166o = c11166o.f25249f;
                    i = c11166o.f25245b;
                }
                if (i2 == c11166o2.f25246c) {
                    c11166o2 = c11166o2.f25249f;
                    i2 = c11166o2.f25245b;
                }
                j2 += min;
            }
            return true;
        }
        return false;
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: f */
    public C11152f mo11494f(long j) throws EOFException {
        return new C11152f(mo11484w(j));
    }

    /* renamed from: f0 */
    public long m11564f0(C11152f c11152f, long j) {
        int i;
        int i2;
        long j2 = 0;
        if (j >= 0) {
            C11166o c11166o = this.f25205c;
            if (c11166o == null) {
                return -1L;
            }
            long j3 = this.f25206d;
            if (j3 - j < j) {
                while (j3 > j) {
                    c11166o = c11166o.f25250g;
                    j3 -= c11166o.f25246c - c11166o.f25245b;
                }
            } else {
                while (true) {
                    long j4 = (c11166o.f25246c - c11166o.f25245b) + j2;
                    if (j4 >= j) {
                        break;
                    }
                    c11166o = c11166o.f25249f;
                    j2 = j4;
                }
                j3 = j2;
            }
            if (c11152f.mo11470F() == 2) {
                byte mo11461p = c11152f.mo11461p(0);
                byte mo11461p2 = c11152f.mo11461p(1);
                while (j3 < this.f25206d) {
                    byte[] bArr = c11166o.f25244a;
                    i = (int) ((c11166o.f25245b + j) - j3);
                    int i3 = c11166o.f25246c;
                    while (i < i3) {
                        byte b = bArr[i];
                        if (b == mo11461p || b == mo11461p2) {
                            i2 = c11166o.f25245b;
                            return (i - i2) + j3;
                        }
                        i++;
                    }
                    j3 += c11166o.f25246c - c11166o.f25245b;
                    c11166o = c11166o.f25249f;
                    j = j3;
                }
                return -1L;
            }
            byte[] mo11459r = c11152f.mo11459r();
            while (j3 < this.f25206d) {
                byte[] bArr2 = c11166o.f25244a;
                i = (int) ((c11166o.f25245b + j) - j3);
                int i4 = c11166o.f25246c;
                while (i < i4) {
                    byte b2 = bArr2[i];
                    for (byte b3 : mo11459r) {
                        if (b2 == b3) {
                            i2 = c11166o.f25245b;
                            return (i - i2) + j3;
                        }
                    }
                    i++;
                }
                j3 += c11166o.f25246c - c11166o.f25245b;
                c11166o = c11166o.f25249f;
                j = j3;
            }
            return -1L;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    /* renamed from: f1 */
    public C11146c m11563f1(int i) {
        C11166o m11574U0 = m11574U0(4);
        byte[] bArr = m11574U0.f25244a;
        int i2 = m11574U0.f25246c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        m11574U0.f25246c = i5 + 1;
        this.f25206d += 4;
        return this;
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d, p425j.p429b.p433b.InterfaceC11169r, java.io.Flushable
    public void flush() {
    }

    /* renamed from: g */
    public C11146c clone() {
        C11146c c11146c = new C11146c();
        if (this.f25206d == 0) {
            return c11146c;
        }
        C11166o m11478d = this.f25205c.m11478d();
        c11146c.f25205c = m11478d;
        m11478d.f25250g = m11478d;
        m11478d.f25249f = m11478d;
        C11166o c11166o = this.f25205c;
        while (true) {
            c11166o = c11166o.f25249f;
            if (c11166o != this.f25205c) {
                c11146c.f25205c.f25250g.m11479c(c11166o.m11478d());
            } else {
                c11146c.f25206d = this.f25206d;
                return c11146c;
            }
        }
    }

    /* renamed from: g1 */
    public C11146c m11561g1(long j) {
        C11166o m11574U0 = m11574U0(8);
        byte[] bArr = m11574U0.f25244a;
        int i = m11574U0.f25246c;
        int i2 = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        m11574U0.f25246c = i8 + 1;
        this.f25206d += 8;
        return this;
    }

    /* renamed from: h1 */
    public C11146c m11560h1(int i) {
        C11166o m11574U0 = m11574U0(2);
        byte[] bArr = m11574U0.f25244a;
        int i2 = m11574U0.f25246c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        m11574U0.f25246c = i3 + 1;
        this.f25206d += 2;
        return this;
    }

    public int hashCode() {
        C11166o c11166o = this.f25205c;
        if (c11166o == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c11166o.f25246c;
            for (int i3 = c11166o.f25245b; i3 < i2; i3++) {
                i = (i * 31) + c11166o.f25244a[i3];
            }
            c11166o = c11166o.f25249f;
        } while (c11166o != this.f25205c);
        return i;
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: i */
    public /* bridge */ /* synthetic */ InterfaceC11150d mo11511i(int i) throws IOException {
        m11560h1(i);
        return this;
    }

    /* renamed from: i0 */
    public OutputStream m11559i0() {
        return new C11147a();
    }

    /* renamed from: i1 */
    public C11146c m11558i1(String str, int i, int i2, Charset charset) {
        if (str != null) {
            if (i < 0) {
                throw new IllegalAccessError("beginIndex < 0: " + i);
            } else if (i2 >= i) {
                if (i2 > str.length()) {
                    throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
                } else if (charset != null) {
                    if (charset.equals(C11173u.f25255a)) {
                        m11555l1(str, i, i2);
                        return this;
                    }
                    byte[] bytes = str.substring(i, i2).getBytes(charset);
                    m11569b1(bytes, 0, bytes.length);
                    return this;
                } else {
                    throw new IllegalArgumentException("charset == null");
                }
            } else {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: j */
    public /* bridge */ /* synthetic */ InterfaceC11150d mo11510j(int i) throws IOException {
        m11563f1(i);
        return this;
    }

    /* renamed from: j1 */
    public C11146c m11557j1(String str, Charset charset) {
        m11558i1(str, 0, str.length(), charset);
        return this;
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: k */
    public byte[] mo11492k() {
        try {
            return mo11484w(this.f25206d);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: k1 */
    public C11146c m11556k1(String str) {
        m11555l1(str, 0, str.length());
        return this;
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: l */
    public boolean mo11491l() {
        return this.f25206d == 0;
    }

    /* renamed from: l1 */
    public C11146c m11555l1(String str, int i, int i2) {
        if (str != null) {
            if (i < 0) {
                throw new IllegalArgumentException("beginIndex < 0: " + i);
            } else if (i2 >= i) {
                if (i2 > str.length()) {
                    throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
                }
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt < 128) {
                        C11166o m11574U0 = m11574U0(1);
                        byte[] bArr = m11574U0.f25244a;
                        int i3 = m11574U0.f25246c - i;
                        int min = Math.min(i2, 8192 - i3);
                        int i4 = i + 1;
                        bArr[i + i3] = (byte) charAt;
                        while (i4 < min) {
                            char charAt2 = str.charAt(i4);
                            if (charAt2 >= 128) {
                                break;
                            }
                            bArr[i4 + i3] = (byte) charAt2;
                            i4++;
                        }
                        int i5 = m11574U0.f25246c;
                        int i6 = (i3 + i4) - i5;
                        m11574U0.f25246c = i5 + i6;
                        this.f25206d += i6;
                        i = i4;
                    } else {
                        if (charAt < 2048) {
                            m11567c1((charAt >> 6) | 192);
                            m11567c1((charAt & '?') | 128);
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i7 = i + 1;
                            char charAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                            if (charAt <= 56319 && charAt3 >= 56320 && charAt3 <= 57343) {
                                int i8 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                                m11567c1((i8 >> 18) | 240);
                                m11567c1(((i8 >> 12) & 63) | 128);
                                m11567c1(((i8 >> 6) & 63) | 128);
                                m11567c1((i8 & 63) | 128);
                                i += 2;
                            } else {
                                m11567c1(63);
                                i = i7;
                            }
                        } else {
                            m11567c1((charAt >> '\f') | 224);
                            m11567c1(((charAt >> 6) & 63) | 128);
                            m11567c1((charAt & '?') | 128);
                        }
                        i++;
                    }
                }
                return this;
            } else {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: m0 */
    public boolean mo11490m0(long j, C11152f c11152f) {
        return m11553o0(j, c11152f, 0, c11152f.mo11470F());
    }

    /* renamed from: m1 */
    public C11146c m11554m1(int i) {
        if (i < 128) {
            m11567c1(i);
        } else if (i < 2048) {
            m11567c1((i >> 6) | 192);
            m11567c1((i & 63) | 128);
        } else if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                m11567c1(63);
            } else {
                m11567c1((i >> 12) | 224);
                m11567c1(((i >> 6) & 63) | 128);
                m11567c1((i & 63) | 128);
            }
        } else if (i <= 1114111) {
            m11567c1((i >> 18) | 240);
            m11567c1(((i >> 12) & 63) | 128);
            m11567c1(((i >> 6) & 63) | 128);
            m11567c1((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: n */
    public /* bridge */ /* synthetic */ InterfaceC11150d mo11509n(int i) throws IOException {
        m11567c1(i);
        return this;
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: o */
    public /* bridge */ /* synthetic */ InterfaceC11150d mo11508o() throws IOException {
        m11577O();
        return this;
    }

    /* renamed from: o0 */
    public boolean m11553o0(long j, C11152f c11152f, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f25206d - j < i2 || c11152f.mo11470F() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (m11576P(i3 + j) != c11152f.mo11461p(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        r1 = new p425j.p429b.p433b.C11146c();
        r1.m11566d1(r3);
        r1.m11567c1(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r8 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
        throw new java.lang.NumberFormatException("Number too large: " + r1.m11584D0());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b9, code lost:
        r17.f25206d -= r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
        if (r8 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c3, code lost:
        return -r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo11489p() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f25206d
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto Lc4
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            r5 = -7
            r7 = 0
            r8 = 0
            r9 = 0
        L14:
            j.b.b.o r10 = r0.f25205c
            byte[] r11 = r10.f25244a
            int r12 = r10.f25245b
            int r13 = r10.f25246c
        L1c:
            if (r12 >= r13) goto L9d
            r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L6a
            r14 = 57
            if (r15 > r14) goto L6a
            int r14 = 48 - r15
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 < 0) goto L3f
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 != 0) goto L38
            long r1 = (long) r14
            int r16 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r16 >= 0) goto L38
            goto L3f
        L38:
            r1 = 10
            long r3 = r3 * r1
            long r1 = (long) r14
            long r3 = r3 + r1
            goto L74
        L3f:
            j.b.b.c r1 = new j.b.b.c
            r1.<init>()
            r1.m11566d1(r3)
            r1.m11567c1(r15)
            if (r8 != 0) goto L4f
            r1.readByte()
        L4f:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.m11584D0()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L6a:
            r1 = 45
            if (r15 != r1) goto L7e
            if (r7 != 0) goto L7e
            r1 = 1
            long r5 = r5 - r1
            r8 = 1
        L74:
            int r12 = r12 + 1
            int r7 = r7 + 1
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L1c
        L7e:
            if (r7 == 0) goto L82
            r9 = 1
            goto L9d
        L82:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r15)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L9d:
            if (r12 != r13) goto La9
            j.b.b.o r1 = r10.m11480b()
            r0.f25205c = r1
            p425j.p429b.p433b.C11167p.m11474a(r10)
            goto Lab
        La9:
            r10.f25245b = r12
        Lab:
            if (r9 != 0) goto Lb9
            j.b.b.o r1 = r0.f25205c
            if (r1 != 0) goto Lb2
            goto Lb9
        Lb2:
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L14
        Lb9:
            long r1 = r0.f25206d
            long r5 = (long) r7
            long r1 = r1 - r5
            r0.f25206d = r1
            if (r8 == 0) goto Lc2
            goto Lc3
        Lc2:
            long r3 = -r3
        Lc3:
            return r3
        Lc4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            goto Lcd
        Lcc:
            throw r1
        Lcd:
            goto Lcc
        */
        throw new UnsupportedOperationException("Method not decompiled: p425j.p429b.p433b.C11146c.mo11489p():long");
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: q */
    public String mo11488q(long j) throws EOFException {
        if (j >= 0) {
            long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
            long m11573X = m11573X((byte) 10, 0L, j2);
            if (m11573X != -1) {
                return m11581H0(m11573X);
            }
            if (j2 < m11579J0() && m11576P(j2 - 1) == 13 && m11576P(j2) == 10) {
                return m11581H0(j2);
            }
            C11146c c11146c = new C11146c();
            m11580I(c11146c, 0L, Math.min(32L, m11579J0()));
            throw new EOFException("\\n not found: limit=" + Math.min(m11579J0(), j) + " content=" + c11146c.m11550z0().mo11460q() + (char) 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: r */
    public /* bridge */ /* synthetic */ InterfaceC11150d mo11507r(String str) throws IOException {
        m11556k1(str);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        C11166o c11166o = this.f25205c;
        if (c11166o == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c11166o.f25246c - c11166o.f25245b);
        byteBuffer.put(c11166o.f25244a, c11166o.f25245b, min);
        int i = c11166o.f25245b + min;
        c11166o.f25245b = i;
        this.f25206d -= min;
        if (i == c11166o.f25246c) {
            this.f25205c = c11166o.m11480b();
            C11167p.m11474a(c11166o);
        }
        return min;
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    public byte readByte() {
        long j = this.f25206d;
        if (j != 0) {
            C11166o c11166o = this.f25205c;
            int i = c11166o.f25245b;
            int i2 = c11166o.f25246c;
            int i3 = i + 1;
            byte b = c11166o.f25244a[i];
            this.f25206d = j - 1;
            if (i3 == i2) {
                this.f25205c = c11166o.m11480b();
                C11167p.m11474a(c11166o);
            } else {
                c11166o.f25245b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int m11552u0 = m11552u0(bArr, i, bArr.length - i);
            if (m11552u0 == -1) {
                throw new EOFException();
            }
            i += m11552u0;
        }
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    public int readInt() {
        long j = this.f25206d;
        if (j >= 4) {
            C11166o c11166o = this.f25205c;
            int i = c11166o.f25245b;
            int i2 = c11166o.f25246c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = c11166o.f25244a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            this.f25206d = j - 4;
            if (i8 == i2) {
                this.f25205c = c11166o.m11480b();
                C11167p.m11474a(c11166o);
            } else {
                c11166o.f25245b = i8;
            }
            return i9;
        }
        throw new IllegalStateException("size < 4: " + this.f25206d);
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    public long readLong() {
        long j = this.f25206d;
        if (j >= 8) {
            C11166o c11166o = this.f25205c;
            int i = c11166o.f25245b;
            int i2 = c11166o.f25246c;
            if (i2 - i < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = c11166o.f25244a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            long j2 = (bArr[i3] & 255) << 48;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j3 = j2 | ((bArr[i] & 255) << 56) | ((bArr[i4] & 255) << 40) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 24) | ((bArr[i7] & 255) << 16) | ((bArr[i8] & 255) << 8) | (bArr[i9] & 255);
            this.f25206d = j - 8;
            if (i10 == i2) {
                this.f25205c = c11166o.m11480b();
                C11167p.m11474a(c11166o);
            } else {
                c11166o.f25245b = i10;
            }
            return j3;
        }
        throw new IllegalStateException("size < 8: " + this.f25206d);
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    public short readShort() {
        long j = this.f25206d;
        if (j >= 2) {
            C11166o c11166o = this.f25205c;
            int i = c11166o.f25245b;
            int i2 = c11166o.f25246c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = c11166o.f25244a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f25206d = j - 2;
            if (i4 == i2) {
                this.f25205c = c11166o.m11480b();
                C11167p.m11474a(c11166o);
            } else {
                c11166o.f25245b = i4;
            }
            return (short) i5;
        }
        throw new IllegalStateException("size < 2: " + this.f25206d);
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: s */
    public String mo11487s(Charset charset) {
        try {
            return m11585A0(this.f25206d, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: t */
    public /* bridge */ /* synthetic */ InterfaceC11150d mo11506t(long j) throws IOException {
        m11565e1(j);
        return this;
    }

    @Override // p425j.p429b.p433b.InterfaceC11170s
    public C11171t timeout() {
        return C11171t.NONE;
    }

    public String toString() {
        return m11578K0().toString();
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: u */
    public String mo11486u() throws EOFException {
        return mo11488q(Long.MAX_VALUE);
    }

    /* renamed from: u0 */
    public int m11552u0(byte[] bArr, int i, int i2) {
        C11173u.m11454b(bArr.length, i, i2);
        C11166o c11166o = this.f25205c;
        if (c11166o == null) {
            return -1;
        }
        int min = Math.min(i2, c11166o.f25246c - c11166o.f25245b);
        System.arraycopy(c11166o.f25244a, c11166o.f25245b, bArr, i, min);
        int i3 = c11166o.f25245b + min;
        c11166o.f25245b = i3;
        this.f25206d -= min;
        if (i3 == c11166o.f25246c) {
            this.f25205c = c11166o.m11480b();
            C11167p.m11474a(c11166o);
        }
        return min;
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: v */
    public int mo11485v() {
        return C11173u.m11453c(readInt());
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: w */
    public byte[] mo11484w(long j) throws EOFException {
        C11173u.m11454b(this.f25206d, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                C11166o m11574U0 = m11574U0(1);
                int min = Math.min(i, 8192 - m11574U0.f25246c);
                byteBuffer.get(m11574U0.f25244a, m11574U0.f25246c, min);
                i -= min;
                m11574U0.f25246c += min;
            }
            this.f25206d += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: x */
    public /* bridge */ /* synthetic */ InterfaceC11150d mo11505x(byte[] bArr) throws IOException {
        m11571Z0(bArr);
        return this;
    }

    /* renamed from: x0 */
    public final C11149c m11551x0(C11149c c11149c) {
        if (c11149c.f25209c == null) {
            c11149c.f25209c = this;
            c11149c.f25210d = true;
            return c11149c;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: y */
    public short mo11483y() {
        return C11173u.m11452d(readShort());
    }

    @Override // p425j.p429b.p433b.InterfaceC11150d
    /* renamed from: y0 */
    public /* bridge */ /* synthetic */ InterfaceC11150d mo11504y0(C11152f c11152f) throws IOException {
        m11572X0(c11152f);
        return this;
    }

    @Override // p425j.p429b.p433b.InterfaceC11151e
    /* renamed from: z */
    public void mo11482z(long j) throws EOFException {
        if (this.f25206d < j) {
            throw new EOFException();
        }
    }

    /* renamed from: z0 */
    public C11152f m11550z0() {
        return new C11152f(mo11492k());
    }

    @Override // p425j.p429b.p433b.InterfaceC11169r
    public void write(C11146c c11146c, long j) {
        if (c11146c == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (c11146c != this) {
            C11173u.m11454b(c11146c.f25206d, 0L, j);
            while (j > 0) {
                C11166o c11166o = c11146c.f25205c;
                if (j < c11166o.f25246c - c11166o.f25245b) {
                    C11166o c11166o2 = this.f25205c;
                    C11166o c11166o3 = c11166o2 != null ? c11166o2.f25250g : null;
                    if (c11166o3 != null && c11166o3.f25248e) {
                        if ((c11166o3.f25246c + j) - (c11166o3.f25247d ? 0 : c11166o3.f25245b) <= 8192) {
                            c11146c.f25205c.m11475g(c11166o3, (int) j);
                            c11146c.f25206d -= j;
                            this.f25206d += j;
                            return;
                        }
                    }
                    c11146c.f25205c = c11146c.f25205c.m11477e((int) j);
                }
                C11166o c11166o4 = c11146c.f25205c;
                long j2 = c11166o4.f25246c - c11166o4.f25245b;
                c11146c.f25205c = c11166o4.m11480b();
                C11166o c11166o5 = this.f25205c;
                if (c11166o5 == null) {
                    this.f25205c = c11166o4;
                    c11166o4.f25250g = c11166o4;
                    c11166o4.f25249f = c11166o4;
                } else {
                    c11166o5.f25250g.m11479c(c11166o4);
                    c11166o4.m11481a();
                }
                c11146c.f25206d -= j2;
                this.f25206d += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // p425j.p429b.p433b.InterfaceC11170s
    public long read(C11146c c11146c, long j) {
        if (c11146c != null) {
            if (j >= 0) {
                long j2 = this.f25206d;
                if (j2 == 0) {
                    return -1L;
                }
                if (j > j2) {
                    j = j2;
                }
                c11146c.write(this, j);
                return j;
            }
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        throw new IllegalArgumentException("sink == null");
    }
}
