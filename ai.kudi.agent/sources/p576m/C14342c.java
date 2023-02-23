package p576m;

import ai.kudi.agent.core.util.printer.PrinterCommands;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: Buffer.java */
/* renamed from: m.c */
/* loaded from: classes3.dex */
public final class C14342c implements InterfaceC14346e, InterfaceC14345d, Cloneable, ByteChannel {

    /* renamed from: e */
    private static final byte[] f31617e = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: c */
    C14361o f31618c;

    /* renamed from: d */
    long f31619d;

    /* compiled from: Buffer.java */
    /* renamed from: m.c$a */
    /* loaded from: classes3.dex */
    class C14343a extends OutputStream {
        C14343a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return C14342c.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            C14342c.this.m2061Z0((byte) i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            C14342c.this.m2062X0(bArr, i, i2);
        }
    }

    /* compiled from: Buffer.java */
    /* renamed from: m.c$b */
    /* loaded from: classes3.dex */
    class C14344b extends InputStream {
        C14344b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C14342c.this.f31619d, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            C14342c c14342c = C14342c.this;
            if (c14342c.f31619d > 0) {
                return c14342c.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C14342c.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return C14342c.this.m2049i0(bArr, i, i2);
        }
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: A */
    public /* bridge */ /* synthetic */ InterfaceC14345d mo2010A(long j) throws IOException {
        m2059b1(j);
        return this;
    }

    /* renamed from: A0 */
    public int m2075A0() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.f31619d != 0) {
            byte m2066P = m2066P(0L);
            if ((m2066P & 128) == 0) {
                i = m2066P & Byte.MAX_VALUE;
                i2 = 1;
                i3 = 0;
            } else if ((m2066P & 224) == 192) {
                i = m2066P & PrinterCommands.CEIL;
                i2 = 2;
                i3 = 128;
            } else if ((m2066P & 240) == 224) {
                i = m2066P & 15;
                i2 = 3;
                i3 = IjkMediaMeta.FF_PROFILE_H264_INTRA;
            } else if ((m2066P & 248) != 240) {
                mo1994a(1L);
                return 65533;
            } else {
                i = m2066P & 7;
                i2 = 4;
                i3 = 65536;
            }
            long j = i2;
            if (this.f31619d >= j) {
                for (int i4 = 1; i4 < i2; i4++) {
                    long j2 = i4;
                    byte m2066P2 = m2066P(j2);
                    if ((m2066P2 & 192) != 128) {
                        mo1994a(j2);
                        return 65533;
                    }
                    i = (i << 6) | (m2066P2 & 63);
                }
                mo1994a(j);
                if (i > 1114111) {
                    return 65533;
                }
                if ((i < 55296 || i > 57343) && i >= i3) {
                    return i;
                }
                return 65533;
            }
            throw new EOFException("size < " + i2 + ": " + this.f31619d + " (to read code point prefixed 0x" + Integer.toHexString(m2066P) + ")");
        }
        throw new EOFException();
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: B */
    public long mo1999B(byte b) {
        return m2063X(b, 0L, Long.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3 A[EDGE_INSN: B:43:0x00a3->B:38:0x00a3 ?: BREAK  , SYNTHETIC] */
    @Override // p576m.InterfaceC14346e
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo1998C() {
        /*
            r15 = this;
            long r0 = r15.f31619d
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Laa
            r0 = 0
            r4 = r2
            r1 = 0
        Lb:
            m.o r6 = r15.f31618c
            byte[] r7 = r6.f31652a
            int r8 = r6.f31653b
            int r9 = r6.f31654c
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
            m.c r0 = new m.c
            r0.<init>()
            r0.m2057c1(r4)
            r0.m2061Z0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.m2044x0()
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
            m.o r7 = r6.m1976b()
            r15.f31618c = r7
            p576m.C14362p.m1971a(r6)
            goto L9d
        L9b:
            r6.f31653b = r8
        L9d:
            if (r1 != 0) goto La3
            m.o r6 = r15.f31618c
            if (r6 != 0) goto Lb
        La3:
            long r1 = r15.f31619d
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f31619d = r1
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
        throw new UnsupportedOperationException("Method not decompiled: p576m.C14342c.mo1998C():long");
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: D */
    public InputStream mo1997D() {
        return new C14344b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D0 */
    public String m2074D0(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (m2066P(j2) == 13) {
                String m2043z0 = m2043z0(j2);
                mo1994a(2L);
                return m2043z0;
            }
        }
        String m2043z02 = m2043z0(j);
        mo1994a(1L);
        return m2043z02;
    }

    /* renamed from: F */
    public final long m2073F() {
        long j = this.f31619d;
        if (j == 0) {
            return 0L;
        }
        C14361o c14361o = this.f31618c.f31658g;
        int i = c14361o.f31654c;
        return (i >= 8192 || !c14361o.f31656e) ? j : j - (i - c14361o.f31653b);
    }

    /* renamed from: F0 */
    public final long m2072F0() {
        return this.f31619d;
    }

    /* renamed from: H0 */
    public final C14347f m2071H0() {
        long j = this.f31619d;
        if (j <= 2147483647L) {
            return m2069J0((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f31619d);
    }

    /* renamed from: I */
    public final C14342c m2070I(C14342c c14342c, long j, long j2) {
        if (c14342c != null) {
            C14368u.m1944b(this.f31619d, j, j2);
            if (j2 == 0) {
                return this;
            }
            c14342c.f31619d += j2;
            C14361o c14361o = this.f31618c;
            while (true) {
                int i = c14361o.f31654c;
                int i2 = c14361o.f31653b;
                if (j < i - i2) {
                    break;
                }
                j -= i - i2;
                c14361o = c14361o.f31657f;
            }
            while (j2 > 0) {
                C14361o m1974d = c14361o.m1974d();
                int i3 = (int) (m1974d.f31653b + j);
                m1974d.f31653b = i3;
                m1974d.f31654c = Math.min(i3 + ((int) j2), m1974d.f31654c);
                C14361o c14361o2 = c14342c.f31618c;
                if (c14361o2 == null) {
                    m1974d.f31658g = m1974d;
                    m1974d.f31657f = m1974d;
                    c14342c.f31618c = m1974d;
                } else {
                    c14361o2.f31658g.m1975c(m1974d);
                }
                j2 -= m1974d.f31654c - m1974d.f31653b;
                c14361o = c14361o.f31657f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: I0 */
    public /* bridge */ /* synthetic */ InterfaceC14345d mo2009I0(C14347f c14347f) throws IOException {
        m2065P0(c14347f);
        return this;
    }

    /* renamed from: J0 */
    public final C14347f m2069J0(int i) {
        if (i == 0) {
            return C14347f.f31623w;
        }
        return new C14363q(this, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K0 */
    public C14361o m2068K0(int i) {
        if (i >= 1 && i <= 8192) {
            C14361o c14361o = this.f31618c;
            if (c14361o == null) {
                C14361o m1970b = C14362p.m1970b();
                this.f31618c = m1970b;
                m1970b.f31658g = m1970b;
                m1970b.f31657f = m1970b;
                return m1970b;
            }
            C14361o c14361o2 = c14361o.f31658g;
            if (c14361o2.f31654c + i > 8192 || !c14361o2.f31656e) {
                C14361o m1970b2 = C14362p.m1970b();
                c14361o2.m1975c(m1970b2);
                return m1970b2;
            }
            return c14361o2;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: O */
    public C14342c m2067O() {
        return this;
    }

    @Override // p576m.InterfaceC14365s
    /* renamed from: O0 */
    public long mo312O0(C14342c c14342c, long j) {
        if (c14342c != null) {
            if (j >= 0) {
                long j2 = this.f31619d;
                if (j2 == 0) {
                    return -1L;
                }
                if (j > j2) {
                    j = j2;
                }
                c14342c.mo1444r0(this, j);
                return j;
            }
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        throw new IllegalArgumentException("sink == null");
    }

    /* renamed from: P */
    public final byte m2066P(long j) {
        int i;
        C14368u.m1944b(this.f31619d, j, 1L);
        long j2 = this.f31619d;
        if (j2 - j > j) {
            C14361o c14361o = this.f31618c;
            while (true) {
                int i2 = c14361o.f31654c;
                int i3 = c14361o.f31653b;
                long j3 = i2 - i3;
                if (j < j3) {
                    return c14361o.f31652a[i3 + ((int) j)];
                }
                j -= j3;
                c14361o = c14361o.f31657f;
            }
        } else {
            long j4 = j - j2;
            C14361o c14361o2 = this.f31618c;
            do {
                c14361o2 = c14361o2.f31658g;
                int i4 = c14361o2.f31654c;
                i = c14361o2.f31653b;
                j4 += i4 - i;
            } while (j4 < 0);
            return c14361o2.f31652a[i + ((int) j4)];
        }
    }

    /* renamed from: P0 */
    public C14342c m2065P0(C14347f c14347f) {
        if (c14347f != null) {
            c14347f.mo1964O(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: R */
    public C14342c mo1996R() {
        return this;
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: R0 */
    public long mo1995R0(InterfaceC14364r interfaceC14364r) throws IOException {
        long j = this.f31619d;
        if (j > 0) {
            interfaceC14364r.mo1444r0(this, j);
        }
        return j;
    }

    /* renamed from: U0 */
    public C14342c m2064U0(byte[] bArr) {
        if (bArr != null) {
            m2062X0(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: X */
    public long m2063X(byte b, long j, long j2) {
        C14361o c14361o;
        long j3 = 0;
        if (j >= 0 && j2 >= j) {
            long j4 = this.f31619d;
            if (j2 <= j4) {
                j4 = j2;
            }
            if (j == j4 || (c14361o = this.f31618c) == null) {
                return -1L;
            }
            long j5 = this.f31619d;
            if (j5 - j < j) {
                while (j5 > j) {
                    c14361o = c14361o.f31658g;
                    j5 -= c14361o.f31654c - c14361o.f31653b;
                }
            } else {
                while (true) {
                    long j6 = (c14361o.f31654c - c14361o.f31653b) + j3;
                    if (j6 >= j) {
                        break;
                    }
                    c14361o = c14361o.f31657f;
                    j3 = j6;
                }
                j5 = j3;
            }
            long j7 = j;
            while (j5 < j4) {
                byte[] bArr = c14361o.f31652a;
                int min = (int) Math.min(c14361o.f31654c, (c14361o.f31653b + j4) - j5);
                for (int i = (int) ((c14361o.f31653b + j7) - j5); i < min; i++) {
                    if (bArr[i] == b) {
                        return (i - c14361o.f31653b) + j5;
                    }
                }
                j5 += c14361o.f31654c - c14361o.f31653b;
                c14361o = c14361o.f31657f;
                j7 = j5;
            }
            return -1L;
        }
        throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f31619d), Long.valueOf(j), Long.valueOf(j2)));
    }

    /* renamed from: X0 */
    public C14342c m2062X0(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = i2;
            C14368u.m1944b(bArr.length, i, j);
            int i3 = i2 + i;
            while (i < i3) {
                C14361o m2068K0 = m2068K0(1);
                int min = Math.min(i3 - i, 8192 - m2068K0.f31654c);
                System.arraycopy(bArr, i, m2068K0.f31652a, m2068K0.f31654c, min);
                i += min;
                m2068K0.f31654c += min;
            }
            this.f31619d += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: Z0 */
    public C14342c m2061Z0(int i) {
        C14361o m2068K0 = m2068K0(1);
        byte[] bArr = m2068K0.f31652a;
        int i2 = m2068K0.f31654c;
        m2068K0.f31654c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f31619d++;
        return this;
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: a */
    public void mo1994a(long j) throws EOFException {
        C14361o c14361o;
        while (j > 0) {
            if (this.f31618c != null) {
                int min = (int) Math.min(j, c14361o.f31654c - c14361o.f31653b);
                long j2 = min;
                this.f31619d -= j2;
                j -= j2;
                C14361o c14361o2 = this.f31618c;
                int i = c14361o2.f31653b + min;
                c14361o2.f31653b = i;
                if (i == c14361o2.f31654c) {
                    this.f31618c = c14361o2.m1976b();
                    C14362p.m1971a(c14361o2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: b */
    public /* bridge */ /* synthetic */ InterfaceC14345d mo2008b(byte[] bArr, int i, int i2) throws IOException {
        m2062X0(bArr, i, i2);
        return this;
    }

    /* renamed from: b0 */
    public OutputStream m2060b0() {
        return new C14343a();
    }

    /* renamed from: b1 */
    public C14342c m2059b1(long j) {
        if (j == 0) {
            m2061Z0(48);
            return this;
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m2050h1("-9223372036854775808");
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
        C14361o m2068K0 = m2068K0(i);
        byte[] bArr = m2068K0.f31652a;
        int i2 = m2068K0.f31654c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f31617e[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        m2068K0.f31654c += i;
        this.f31619d += i;
        return this;
    }

    /* renamed from: c */
    public final void m2058c() {
        try {
            mo1994a(this.f31619d);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c1 */
    public C14342c m2057c1(long j) {
        if (j == 0) {
            m2061Z0(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C14361o m2068K0 = m2068K0(numberOfTrailingZeros);
        byte[] bArr = m2068K0.f31652a;
        int i = m2068K0.f31654c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f31617e[(int) (15 & j)];
            j >>>= 4;
        }
        m2068K0.f31654c += numberOfTrailingZeros;
        this.f31619d += numberOfTrailingZeros;
        return this;
    }

    @Override // p576m.InterfaceC14365s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p576m.InterfaceC14346e, p576m.InterfaceC14345d
    /* renamed from: d */
    public C14342c mo1992d() {
        return this;
    }

    /* renamed from: d1 */
    public C14342c m2056d1(int i) {
        C14361o m2068K0 = m2068K0(4);
        byte[] bArr = m2068K0.f31652a;
        int i2 = m2068K0.f31654c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        m2068K0.f31654c = i5 + 1;
        this.f31619d += 4;
        return this;
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: e */
    public boolean mo1991e(long j) {
        return this.f31619d >= j;
    }

    /* renamed from: e1 */
    public C14342c m2055e1(int i) {
        C14361o m2068K0 = m2068K0(2);
        byte[] bArr = m2068K0.f31652a;
        int i2 = m2068K0.f31654c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        m2068K0.f31654c = i3 + 1;
        this.f31619d += 2;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14342c) {
            C14342c c14342c = (C14342c) obj;
            long j = this.f31619d;
            if (j != c14342c.f31619d) {
                return false;
            }
            long j2 = 0;
            if (j == 0) {
                return true;
            }
            C14361o c14361o = this.f31618c;
            C14361o c14361o2 = c14342c.f31618c;
            int i = c14361o.f31653b;
            int i2 = c14361o2.f31653b;
            while (j2 < this.f31619d) {
                long min = Math.min(c14361o.f31654c - i, c14361o2.f31654c - i2);
                int i3 = 0;
                while (i3 < min) {
                    int i4 = i + 1;
                    int i5 = i2 + 1;
                    if (c14361o.f31652a[i] != c14361o2.f31652a[i2]) {
                        return false;
                    }
                    i3++;
                    i = i4;
                    i2 = i5;
                }
                if (i == c14361o.f31654c) {
                    c14361o = c14361o.f31657f;
                    i = c14361o.f31653b;
                }
                if (i2 == c14361o2.f31654c) {
                    c14361o2 = c14361o2.f31657f;
                    i2 = c14361o2.f31653b;
                }
                j2 += min;
            }
            return true;
        }
        return false;
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: f */
    public C14347f mo1990f(long j) throws EOFException {
        return new C14347f(mo1980w(j));
    }

    /* renamed from: f0 */
    public boolean m2054f0(long j, C14347f c14347f, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f31619d - j < i2 || c14347f.mo1969A() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (m2066P(i3 + j) != c14347f.mo1960n(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f1 */
    public C14342c m2053f1(String str, int i, int i2, Charset charset) {
        if (str != null) {
            if (i < 0) {
                throw new IllegalAccessError("beginIndex < 0: " + i);
            } else if (i2 >= i) {
                if (i2 > str.length()) {
                    throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
                } else if (charset != null) {
                    if (charset.equals(C14368u.f31667a)) {
                        m2048i1(str, i, i2);
                        return this;
                    }
                    byte[] bytes = str.substring(i, i2).getBytes(charset);
                    m2062X0(bytes, 0, bytes.length);
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

    @Override // p576m.InterfaceC14345d, p576m.InterfaceC14364r, java.io.Flushable
    public void flush() {
    }

    /* renamed from: g */
    public C14342c clone() {
        C14342c c14342c = new C14342c();
        if (this.f31619d == 0) {
            return c14342c;
        }
        C14361o m1974d = this.f31618c.m1974d();
        c14342c.f31618c = m1974d;
        m1974d.f31658g = m1974d;
        m1974d.f31657f = m1974d;
        C14361o c14361o = this.f31618c;
        while (true) {
            c14361o = c14361o.f31657f;
            if (c14361o != this.f31618c) {
                c14342c.f31618c.f31658g.m1975c(c14361o.m1974d());
            } else {
                c14342c.f31619d = this.f31619d;
                return c14342c;
            }
        }
    }

    /* renamed from: g1 */
    public final C14342c m2051g1(OutputStream outputStream, long j) throws IOException {
        if (outputStream != null) {
            C14368u.m1944b(this.f31619d, 0L, j);
            C14361o c14361o = this.f31618c;
            while (j > 0) {
                int min = (int) Math.min(j, c14361o.f31654c - c14361o.f31653b);
                outputStream.write(c14361o.f31652a, c14361o.f31653b, min);
                int i = c14361o.f31653b + min;
                c14361o.f31653b = i;
                long j2 = min;
                this.f31619d -= j2;
                j -= j2;
                if (i == c14361o.f31654c) {
                    C14361o m1976b = c14361o.m1976b();
                    this.f31618c = m1976b;
                    C14362p.m1971a(c14361o);
                    c14361o = m1976b;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: h1 */
    public C14342c m2050h1(String str) {
        m2048i1(str, 0, str.length());
        return this;
    }

    public int hashCode() {
        C14361o c14361o = this.f31618c;
        if (c14361o == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c14361o.f31654c;
            for (int i3 = c14361o.f31653b; i3 < i2; i3++) {
                i = (i * 31) + c14361o.f31652a[i3];
            }
            c14361o = c14361o.f31657f;
        } while (c14361o != this.f31618c);
        return i;
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: i */
    public /* bridge */ /* synthetic */ InterfaceC14345d mo2007i(int i) throws IOException {
        m2055e1(i);
        return this;
    }

    /* renamed from: i0 */
    public int m2049i0(byte[] bArr, int i, int i2) {
        C14368u.m1944b(bArr.length, i, i2);
        C14361o c14361o = this.f31618c;
        if (c14361o == null) {
            return -1;
        }
        int min = Math.min(i2, c14361o.f31654c - c14361o.f31653b);
        System.arraycopy(c14361o.f31652a, c14361o.f31653b, bArr, i, min);
        int i3 = c14361o.f31653b + min;
        c14361o.f31653b = i3;
        this.f31619d -= min;
        if (i3 == c14361o.f31654c) {
            this.f31618c = c14361o.m1976b();
            C14362p.m1971a(c14361o);
        }
        return min;
    }

    /* renamed from: i1 */
    public C14342c m2048i1(String str, int i, int i2) {
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
                        C14361o m2068K0 = m2068K0(1);
                        byte[] bArr = m2068K0.f31652a;
                        int i3 = m2068K0.f31654c - i;
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
                        int i5 = m2068K0.f31654c;
                        int i6 = (i3 + i4) - i5;
                        m2068K0.f31654c = i5 + i6;
                        this.f31619d += i6;
                        i = i4;
                    } else {
                        if (charAt < 2048) {
                            m2061Z0((charAt >> 6) | 192);
                            m2061Z0((charAt & '?') | 128);
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i7 = i + 1;
                            char charAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                            if (charAt <= 56319 && charAt3 >= 56320 && charAt3 <= 57343) {
                                int i8 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                                m2061Z0((i8 >> 18) | 240);
                                m2061Z0(((i8 >> 12) & 63) | 128);
                                m2061Z0(((i8 >> 6) & 63) | 128);
                                m2061Z0((i8 & 63) | 128);
                                i += 2;
                            } else {
                                m2061Z0(63);
                                i = i7;
                            }
                        } else {
                            m2061Z0((charAt >> '\f') | 224);
                            m2061Z0(((charAt >> 6) & 63) | 128);
                            m2061Z0((charAt & '?') | 128);
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

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: j */
    public /* bridge */ /* synthetic */ InterfaceC14345d mo2006j(int i) throws IOException {
        m2056d1(i);
        return this;
    }

    /* renamed from: j1 */
    public C14342c m2047j1(int i) {
        if (i < 128) {
            m2061Z0(i);
        } else if (i < 2048) {
            m2061Z0((i >> 6) | 192);
            m2061Z0((i & 63) | 128);
        } else if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                m2061Z0(63);
            } else {
                m2061Z0((i >> 12) | 224);
                m2061Z0(((i >> 6) & 63) | 128);
                m2061Z0((i & 63) | 128);
            }
        } else if (i <= 1114111) {
            m2061Z0((i >> 18) | 240);
            m2061Z0(((i >> 12) & 63) | 128);
            m2061Z0(((i >> 6) & 63) | 128);
            m2061Z0((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: k */
    public byte[] mo1988k() {
        try {
            return mo1980w(this.f31619d);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: l */
    public boolean mo1987l() {
        return this.f31619d == 0;
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: l0 */
    public boolean mo1986l0(long j, C14347f c14347f) {
        return m2054f0(j, c14347f, 0, c14347f.mo1969A());
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: n */
    public /* bridge */ /* synthetic */ InterfaceC14345d mo2005n(int i) throws IOException {
        m2061Z0(i);
        return this;
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: o */
    public /* bridge */ /* synthetic */ InterfaceC14345d mo2004o() throws IOException {
        m2067O();
        return this;
    }

    /* renamed from: o0 */
    public C14347f m2046o0() {
        return new C14347f(mo1988k());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        r1 = new p576m.C14342c();
        r1.m2059b1(r3);
        r1.m2061Z0(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r8 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
        throw new java.lang.NumberFormatException("Number too large: " + r1.m2044x0());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b9, code lost:
        r17.f31619d -= r7;
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
    @Override // p576m.InterfaceC14346e
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo1985p() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f31619d
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto Lc4
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            r5 = -7
            r7 = 0
            r8 = 0
            r9 = 0
        L14:
            m.o r10 = r0.f31618c
            byte[] r11 = r10.f31652a
            int r12 = r10.f31653b
            int r13 = r10.f31654c
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
            m.c r1 = new m.c
            r1.<init>()
            r1.m2059b1(r3)
            r1.m2061Z0(r15)
            if (r8 != 0) goto L4f
            r1.readByte()
        L4f:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.m2044x0()
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
            m.o r1 = r10.m1976b()
            r0.f31618c = r1
            p576m.C14362p.m1971a(r10)
            goto Lab
        La9:
            r10.f31653b = r12
        Lab:
            if (r9 != 0) goto Lb9
            m.o r1 = r0.f31618c
            if (r1 != 0) goto Lb2
            goto Lb9
        Lb2:
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L14
        Lb9:
            long r1 = r0.f31619d
            long r5 = (long) r7
            long r1 = r1 - r5
            r0.f31619d = r1
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
        throw new UnsupportedOperationException("Method not decompiled: p576m.C14342c.mo1985p():long");
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: q */
    public String mo1984q(long j) throws EOFException {
        if (j >= 0) {
            long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
            long m2063X = m2063X((byte) 10, 0L, j2);
            if (m2063X != -1) {
                return m2074D0(m2063X);
            }
            if (j2 < m2072F0() && m2066P(j2 - 1) == 13 && m2066P(j2) == 10) {
                return m2074D0(j2);
            }
            C14342c c14342c = new C14342c();
            m2070I(c14342c, 0L, Math.min(32L, m2072F0()));
            throw new EOFException("\\n not found: limit=" + Math.min(m2072F0(), j) + " content=" + c14342c.m2046o0().mo1959p() + (char) 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: r */
    public /* bridge */ /* synthetic */ InterfaceC14345d mo2003r(String str) throws IOException {
        m2050h1(str);
        return this;
    }

    @Override // p576m.InterfaceC14364r
    /* renamed from: r0 */
    public void mo1444r0(C14342c c14342c, long j) {
        if (c14342c == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (c14342c != this) {
            C14368u.m1944b(c14342c.f31619d, 0L, j);
            while (j > 0) {
                C14361o c14361o = c14342c.f31618c;
                if (j < c14361o.f31654c - c14361o.f31653b) {
                    C14361o c14361o2 = this.f31618c;
                    C14361o c14361o3 = c14361o2 != null ? c14361o2.f31658g : null;
                    if (c14361o3 != null && c14361o3.f31656e) {
                        if ((c14361o3.f31654c + j) - (c14361o3.f31655d ? 0 : c14361o3.f31653b) <= 8192) {
                            c14342c.f31618c.m1972f(c14361o3, (int) j);
                            c14342c.f31619d -= j;
                            this.f31619d += j;
                            return;
                        }
                    }
                    c14342c.f31618c = c14342c.f31618c.m1973e((int) j);
                }
                C14361o c14361o4 = c14342c.f31618c;
                long j2 = c14361o4.f31654c - c14361o4.f31653b;
                c14342c.f31618c = c14361o4.m1976b();
                C14361o c14361o5 = this.f31618c;
                if (c14361o5 == null) {
                    this.f31618c = c14361o4;
                    c14361o4.f31658g = c14361o4;
                    c14361o4.f31657f = c14361o4;
                } else {
                    c14361o5.f31658g.m1975c(c14361o4);
                    c14361o4.m1977a();
                }
                c14342c.f31619d -= j2;
                this.f31619d += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        C14361o c14361o = this.f31618c;
        if (c14361o == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c14361o.f31654c - c14361o.f31653b);
        byteBuffer.put(c14361o.f31652a, c14361o.f31653b, min);
        int i = c14361o.f31653b + min;
        c14361o.f31653b = i;
        this.f31619d -= min;
        if (i == c14361o.f31654c) {
            this.f31618c = c14361o.m1976b();
            C14362p.m1971a(c14361o);
        }
        return min;
    }

    @Override // p576m.InterfaceC14346e
    public byte readByte() {
        long j = this.f31619d;
        if (j != 0) {
            C14361o c14361o = this.f31618c;
            int i = c14361o.f31653b;
            int i2 = c14361o.f31654c;
            int i3 = i + 1;
            byte b = c14361o.f31652a[i];
            this.f31619d = j - 1;
            if (i3 == i2) {
                this.f31618c = c14361o.m1976b();
                C14362p.m1971a(c14361o);
            } else {
                c14361o.f31653b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // p576m.InterfaceC14346e
    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int m2049i0 = m2049i0(bArr, i, bArr.length - i);
            if (m2049i0 == -1) {
                throw new EOFException();
            }
            i += m2049i0;
        }
    }

    @Override // p576m.InterfaceC14346e
    public int readInt() {
        long j = this.f31619d;
        if (j >= 4) {
            C14361o c14361o = this.f31618c;
            int i = c14361o.f31653b;
            int i2 = c14361o.f31654c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = c14361o.f31652a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            this.f31619d = j - 4;
            if (i8 == i2) {
                this.f31618c = c14361o.m1976b();
                C14362p.m1971a(c14361o);
            } else {
                c14361o.f31653b = i8;
            }
            return i9;
        }
        throw new IllegalStateException("size < 4: " + this.f31619d);
    }

    @Override // p576m.InterfaceC14346e
    public short readShort() {
        long j = this.f31619d;
        if (j >= 2) {
            C14361o c14361o = this.f31618c;
            int i = c14361o.f31653b;
            int i2 = c14361o.f31654c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = c14361o.f31652a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f31619d = j - 2;
            if (i4 == i2) {
                this.f31618c = c14361o.m1976b();
                C14362p.m1971a(c14361o);
            } else {
                c14361o.f31653b = i4;
            }
            return (short) i5;
        }
        throw new IllegalStateException("size < 2: " + this.f31619d);
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: s */
    public String mo1983s(Charset charset) {
        try {
            return m2045u0(this.f31619d, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: s0 */
    public long mo2002s0(InterfaceC14365s interfaceC14365s) throws IOException {
        if (interfaceC14365s == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long mo312O0 = interfaceC14365s.mo312O0(this, 8192L);
            if (mo312O0 == -1) {
                return j;
            }
            j += mo312O0;
        }
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: t */
    public /* bridge */ /* synthetic */ InterfaceC14345d mo2001t(long j) throws IOException {
        m2057c1(j);
        return this;
    }

    @Override // p576m.InterfaceC14365s
    public C14366t timeout() {
        return C14366t.f31663d;
    }

    public String toString() {
        return m2071H0().toString();
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: u */
    public String mo1982u() throws EOFException {
        return mo1984q(Long.MAX_VALUE);
    }

    /* renamed from: u0 */
    public String m2045u0(long j, Charset charset) throws EOFException {
        C14368u.m1944b(this.f31619d, 0L, j);
        if (charset != null) {
            if (j > 2147483647L) {
                throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
            } else if (j == 0) {
                return "";
            } else {
                C14361o c14361o = this.f31618c;
                if (c14361o.f31653b + j > c14361o.f31654c) {
                    return new String(mo1980w(j), charset);
                }
                String str = new String(c14361o.f31652a, c14361o.f31653b, (int) j, charset);
                int i = (int) (c14361o.f31653b + j);
                c14361o.f31653b = i;
                this.f31619d -= j;
                if (i == c14361o.f31654c) {
                    this.f31618c = c14361o.m1976b();
                    C14362p.m1971a(c14361o);
                }
                return str;
            }
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: v */
    public int mo1981v() {
        return C14368u.m1943c(readInt());
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: w */
    public byte[] mo1980w(long j) throws EOFException {
        C14368u.m1944b(this.f31619d, 0L, j);
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
                C14361o m2068K0 = m2068K0(1);
                int min = Math.min(i, 8192 - m2068K0.f31654c);
                byteBuffer.get(m2068K0.f31652a, m2068K0.f31654c, min);
                i -= min;
                m2068K0.f31654c += min;
            }
            this.f31619d += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // p576m.InterfaceC14345d
    /* renamed from: x */
    public /* bridge */ /* synthetic */ InterfaceC14345d mo2000x(byte[] bArr) throws IOException {
        m2064U0(bArr);
        return this;
    }

    /* renamed from: x0 */
    public String m2044x0() {
        try {
            return m2045u0(this.f31619d, C14368u.f31667a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: y */
    public short mo1979y() {
        return C14368u.m1942d(readShort());
    }

    @Override // p576m.InterfaceC14346e
    /* renamed from: z */
    public void mo1978z(long j) throws EOFException {
        if (this.f31619d < j) {
            throw new EOFException();
        }
    }

    /* renamed from: z0 */
    public String m2043z0(long j) throws EOFException {
        return m2045u0(j, C14368u.f31667a);
    }
}
