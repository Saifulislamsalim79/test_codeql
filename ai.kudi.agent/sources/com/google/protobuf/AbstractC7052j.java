package com.google.protobuf;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: CodedInputStream.java */
/* renamed from: com.google.protobuf.j */
/* loaded from: classes2.dex */
public abstract class AbstractC7052j {

    /* renamed from: a */
    int f16829a;

    /* renamed from: b */
    int f16830b;

    /* renamed from: c */
    int f16831c;

    /* renamed from: d */
    C7062k f16832d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CodedInputStream.java */
    /* renamed from: com.google.protobuf.j$b */
    /* loaded from: classes2.dex */
    public static final class C7054b extends AbstractC7052j {

        /* renamed from: e */
        private final byte[] f16833e;

        /* renamed from: f */
        private final boolean f16834f;

        /* renamed from: g */
        private int f16835g;

        /* renamed from: h */
        private int f16836h;

        /* renamed from: i */
        private int f16837i;

        /* renamed from: j */
        private int f16838j;

        /* renamed from: k */
        private int f16839k;

        /* renamed from: l */
        private boolean f16840l;

        /* renamed from: m */
        private int f16841m;

        /* renamed from: Q */
        private void m20052Q() {
            int i = this.f16835g + this.f16836h;
            this.f16835g = i;
            int i2 = i - this.f16838j;
            int i3 = this.f16841m;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f16836h = i4;
                this.f16835g = i - i4;
                return;
            }
            this.f16836h = 0;
        }

        /* renamed from: T */
        private void m20049T() throws IOException {
            if (this.f16835g - this.f16837i >= 10) {
                m20048U();
            } else {
                m20047V();
            }
        }

        /* renamed from: U */
        private void m20048U() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f16833e;
                int i2 = this.f16837i;
                this.f16837i = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m20252g();
        }

        /* renamed from: V */
        private void m20047V() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (m20059J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m20252g();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: A */
        public int mo20023A() throws IOException {
            return AbstractC7052j.m20069b(m20055N());
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: B */
        public long mo20022B() throws IOException {
            return AbstractC7052j.m20068c(m20054O());
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: C */
        public String mo20021C() throws IOException {
            int m20055N = m20055N();
            if (m20055N > 0 && m20055N <= this.f16835g - this.f16837i) {
                String str = new String(this.f16833e, this.f16837i, m20055N, C6997a0.f16756a);
                this.f16837i += m20055N;
                return str;
            } else if (m20055N == 0) {
                return "";
            } else {
                if (m20055N < 0) {
                    throw InvalidProtocolBufferException.m20251h();
                }
                throw InvalidProtocolBufferException.m20245n();
            }
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: D */
        public String mo20020D() throws IOException {
            int m20055N = m20055N();
            if (m20055N > 0) {
                int i = this.f16835g;
                int i2 = this.f16837i;
                if (m20055N <= i - i2) {
                    String m19623h = C7110s1.m19623h(this.f16833e, i2, m20055N);
                    this.f16837i += m20055N;
                    return m19623h;
                }
            }
            if (m20055N == 0) {
                return "";
            }
            if (m20055N <= 0) {
                throw InvalidProtocolBufferException.m20251h();
            }
            throw InvalidProtocolBufferException.m20245n();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: E */
        public int mo20019E() throws IOException {
            if (mo19997e()) {
                this.f16839k = 0;
                return 0;
            }
            int m20055N = m20055N();
            this.f16839k = m20055N;
            if (C7118t1.m19564a(m20055N) != 0) {
                return this.f16839k;
            }
            throw InvalidProtocolBufferException.m20255d();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: F */
        public int mo20018F() throws IOException {
            return m20055N();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: G */
        public long mo20017G() throws IOException {
            return m20054O();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: I */
        public boolean mo20016I(int i) throws IOException {
            int m19563b = C7118t1.m19563b(i);
            if (m19563b == 0) {
                m20049T();
                return true;
            } else if (m19563b == 1) {
                m20050S(8);
                return true;
            } else if (m19563b == 2) {
                m20050S(m20055N());
                return true;
            } else if (m19563b == 3) {
                m20051R();
                mo19999a(C7118t1.m19562c(C7118t1.m19564a(i), 4));
                return true;
            } else if (m19563b != 4) {
                if (m19563b == 5) {
                    m20050S(4);
                    return true;
                }
                throw InvalidProtocolBufferException.m20253f();
            } else {
                return false;
            }
        }

        /* renamed from: J */
        public byte m20059J() throws IOException {
            int i = this.f16837i;
            if (i != this.f16835g) {
                byte[] bArr = this.f16833e;
                this.f16837i = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.m20245n();
        }

        /* renamed from: K */
        public byte[] m20058K(int i) throws IOException {
            if (i > 0) {
                int i2 = this.f16835g;
                int i3 = this.f16837i;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f16837i = i4;
                    return Arrays.copyOfRange(this.f16833e, i3, i4);
                }
            }
            if (i <= 0) {
                if (i == 0) {
                    return C6997a0.f16757b;
                }
                throw InvalidProtocolBufferException.m20251h();
            }
            throw InvalidProtocolBufferException.m20245n();
        }

        /* renamed from: L */
        public int m20057L() throws IOException {
            int i = this.f16837i;
            if (this.f16835g - i >= 4) {
                byte[] bArr = this.f16833e;
                this.f16837i = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.m20245n();
        }

        /* renamed from: M */
        public long m20056M() throws IOException {
            int i = this.f16837i;
            if (this.f16835g - i >= 8) {
                byte[] bArr = this.f16833e;
                this.f16837i = i + 8;
                return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
            }
            throw InvalidProtocolBufferException.m20245n();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r2[r3] < 0) goto L34;
         */
        /* renamed from: N */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int m20055N() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f16837i
                int r1 = r5.f16835g
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f16833e
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f16837i = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.m20053P()
                int r1 = (int) r0
                return r1
            L70:
                r5.f16837i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC7052j.C7054b.m20055N():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
            if (r2[r0] < 0) goto L42;
         */
        /* renamed from: O */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long m20054O() throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 192
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC7052j.C7054b.m20054O():long");
        }

        /* renamed from: P */
        long m20053P() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte m20059J = m20059J();
                j |= (m20059J & Byte.MAX_VALUE) << i;
                if ((m20059J & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m20252g();
        }

        /* renamed from: R */
        public void m20051R() throws IOException {
            int mo20019E;
            do {
                mo20019E = mo20019E();
                if (mo20019E == 0) {
                    return;
                }
            } while (mo20016I(mo20019E));
        }

        /* renamed from: S */
        public void m20050S(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f16835g;
                int i3 = this.f16837i;
                if (i <= i2 - i3) {
                    this.f16837i = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.m20251h();
            }
            throw InvalidProtocolBufferException.m20245n();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: a */
        public void mo19999a(int i) throws InvalidProtocolBufferException {
            if (this.f16839k != i) {
                throw InvalidProtocolBufferException.m20256c();
            }
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: d */
        public int mo19998d() {
            return this.f16837i - this.f16838j;
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: e */
        public boolean mo19997e() throws IOException {
            return this.f16837i == this.f16835g;
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: m */
        public void mo19996m(int i) {
            this.f16841m = i;
            m20052Q();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: n */
        public int mo19995n(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int mo19998d = i + mo19998d();
                if (mo19998d >= 0) {
                    int i2 = this.f16841m;
                    if (mo19998d <= i2) {
                        this.f16841m = mo19998d;
                        m20052Q();
                        return i2;
                    }
                    throw InvalidProtocolBufferException.m20245n();
                }
                throw InvalidProtocolBufferException.m20250i();
            }
            throw InvalidProtocolBufferException.m20251h();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: o */
        public boolean mo19994o() throws IOException {
            return m20054O() != 0;
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: p */
        public AbstractC7039i mo19993p() throws IOException {
            AbstractC7039i m20090l;
            int m20055N = m20055N();
            if (m20055N > 0) {
                int i = this.f16835g;
                int i2 = this.f16837i;
                if (m20055N <= i - i2) {
                    if (this.f16834f && this.f16840l) {
                        m20090l = AbstractC7039i.m20092h0(this.f16833e, i2, m20055N);
                    } else {
                        m20090l = AbstractC7039i.m20090l(this.f16833e, this.f16837i, m20055N);
                    }
                    this.f16837i += m20055N;
                    return m20090l;
                }
            }
            if (m20055N == 0) {
                return AbstractC7039i.f16815d;
            }
            return AbstractC7039i.m20094g0(m20058K(m20055N));
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: q */
        public double mo19992q() throws IOException {
            return Double.longBitsToDouble(m20056M());
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: r */
        public int mo19991r() throws IOException {
            return m20055N();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: s */
        public int mo19990s() throws IOException {
            return m20057L();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: t */
        public long mo19989t() throws IOException {
            return m20056M();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: u */
        public float mo19988u() throws IOException {
            return Float.intBitsToFloat(m20057L());
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: v */
        public int mo19987v() throws IOException {
            return m20055N();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: w */
        public long mo19986w() throws IOException {
            return m20054O();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: y */
        public int mo19985y() throws IOException {
            return m20057L();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: z */
        public long mo19984z() throws IOException {
            return m20056M();
        }

        private C7054b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f16841m = Integer.MAX_VALUE;
            this.f16833e = bArr;
            this.f16835g = i2 + i;
            this.f16837i = i;
            this.f16838j = i;
            this.f16834f = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CodedInputStream.java */
    /* renamed from: com.google.protobuf.j$c */
    /* loaded from: classes2.dex */
    public static final class C7055c extends AbstractC7052j {

        /* renamed from: e */
        private final InputStream f16842e;

        /* renamed from: f */
        private final byte[] f16843f;

        /* renamed from: g */
        private int f16844g;

        /* renamed from: h */
        private int f16845h;

        /* renamed from: i */
        private int f16846i;

        /* renamed from: j */
        private int f16847j;

        /* renamed from: k */
        private int f16848k;

        /* renamed from: l */
        private int f16849l;

        /* renamed from: m */
        private InterfaceC7056a f16850m;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: CodedInputStream.java */
        /* renamed from: com.google.protobuf.j$c$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC7056a {
            /* renamed from: a */
            void m20024a();
        }

        /* renamed from: J */
        private static int m20046J(InputStream inputStream) throws IOException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e) {
                e.m20248k();
                throw e;
            }
        }

        /* renamed from: K */
        private static int m20045K(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
            try {
                return inputStream.read(bArr, i, i2);
            } catch (InvalidProtocolBufferException e) {
                e.m20248k();
                throw e;
            }
        }

        /* renamed from: L */
        private AbstractC7039i m20044L(int i) throws IOException {
            byte[] m20041O = m20041O(i);
            if (m20041O != null) {
                return AbstractC7039i.m20091k(m20041O);
            }
            int i2 = this.f16846i;
            int i3 = this.f16844g;
            int i4 = i3 - i2;
            this.f16848k += i3;
            this.f16846i = 0;
            this.f16844g = 0;
            List<byte[]> m20040P = m20040P(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f16843f, i2, bArr, 0, i4);
            for (byte[] bArr2 : m20040P) {
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return AbstractC7039i.m20094g0(bArr);
        }

        /* renamed from: N */
        private byte[] m20042N(int i, boolean z) throws IOException {
            byte[] m20041O = m20041O(i);
            if (m20041O != null) {
                return z ? (byte[]) m20041O.clone() : m20041O;
            }
            int i2 = this.f16846i;
            int i3 = this.f16844g;
            int i4 = i3 - i2;
            this.f16848k += i3;
            this.f16846i = 0;
            this.f16844g = 0;
            List<byte[]> m20040P = m20040P(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f16843f, i2, bArr, 0, i4);
            for (byte[] bArr2 : m20040P) {
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        /* renamed from: O */
        private byte[] m20041O(int i) throws IOException {
            if (i == 0) {
                return C6997a0.f16757b;
            }
            if (i >= 0) {
                int i2 = this.f16848k;
                int i3 = this.f16846i;
                int i4 = i2 + i3 + i;
                if (i4 - this.f16831c <= 0) {
                    int i5 = this.f16849l;
                    if (i4 <= i5) {
                        int i6 = this.f16844g - i3;
                        int i7 = i - i6;
                        if (i7 < 4096 || i7 <= m20046J(this.f16842e)) {
                            byte[] bArr = new byte[i];
                            System.arraycopy(this.f16843f, this.f16846i, bArr, 0, i6);
                            this.f16848k += this.f16844g;
                            this.f16846i = 0;
                            this.f16844g = 0;
                            while (i6 < i) {
                                int m20045K = m20045K(this.f16842e, bArr, i6, i - i6);
                                if (m20045K != -1) {
                                    this.f16848k += m20045K;
                                    i6 += m20045K;
                                } else {
                                    throw InvalidProtocolBufferException.m20245n();
                                }
                            }
                            return bArr;
                        }
                        return null;
                    }
                    m20030Z((i5 - i2) - i3);
                    throw InvalidProtocolBufferException.m20245n();
                }
                throw InvalidProtocolBufferException.m20246m();
            }
            throw InvalidProtocolBufferException.m20251h();
        }

        /* renamed from: P */
        private List<byte[]> m20040P(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f16842e.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f16848k += read;
                        i2 += read;
                    } else {
                        throw InvalidProtocolBufferException.m20245n();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: V */
        private void m20034V() {
            int i = this.f16844g + this.f16845h;
            this.f16844g = i;
            int i2 = this.f16848k + i;
            int i3 = this.f16849l;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f16845h = i4;
                this.f16844g = i - i4;
                return;
            }
            this.f16845h = 0;
        }

        /* renamed from: W */
        private void m20033W(int i) throws IOException {
            if (m20025e0(i)) {
                return;
            }
            if (i > (this.f16831c - this.f16848k) - this.f16846i) {
                throw InvalidProtocolBufferException.m20246m();
            }
            throw InvalidProtocolBufferException.m20245n();
        }

        /* renamed from: X */
        private static long m20032X(InputStream inputStream, long j) throws IOException {
            try {
                return inputStream.skip(j);
            } catch (InvalidProtocolBufferException e) {
                e.m20248k();
                throw e;
            }
        }

        /* renamed from: a0 */
        private void m20029a0(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f16848k;
                int i3 = this.f16846i;
                int i4 = i2 + i3 + i;
                int i5 = this.f16849l;
                if (i4 <= i5) {
                    int i6 = 0;
                    if (this.f16850m == null) {
                        this.f16848k = i2 + i3;
                        this.f16844g = 0;
                        this.f16846i = 0;
                        i6 = this.f16844g - i3;
                        while (i6 < i) {
                            try {
                                long j = i - i6;
                                long m20032X = m20032X(this.f16842e, j);
                                if (m20032X < 0 || m20032X > j) {
                                    throw new IllegalStateException(this.f16842e.getClass() + "#skip returned invalid result: " + m20032X + "\nThe InputStream implementation is buggy.");
                                } else if (m20032X == 0) {
                                    break;
                                } else {
                                    i6 += (int) m20032X;
                                }
                            } finally {
                                this.f16848k += i6;
                                m20034V();
                            }
                        }
                    }
                    if (i6 >= i) {
                        return;
                    }
                    int i7 = this.f16844g;
                    int i8 = i7 - this.f16846i;
                    this.f16846i = i7;
                    m20033W(1);
                    while (true) {
                        int i9 = i - i8;
                        int i10 = this.f16844g;
                        if (i9 > i10) {
                            i8 += i10;
                            this.f16846i = i10;
                            m20033W(1);
                        } else {
                            this.f16846i = i9;
                            return;
                        }
                    }
                } else {
                    m20030Z((i5 - i2) - i3);
                    throw InvalidProtocolBufferException.m20245n();
                }
            } else {
                throw InvalidProtocolBufferException.m20251h();
            }
        }

        /* renamed from: b0 */
        private void m20028b0() throws IOException {
            if (this.f16844g - this.f16846i >= 10) {
                m20027c0();
            } else {
                m20026d0();
            }
        }

        /* renamed from: c0 */
        private void m20027c0() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f16843f;
                int i2 = this.f16846i;
                this.f16846i = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m20252g();
        }

        /* renamed from: d0 */
        private void m20026d0() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (m20043M() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m20252g();
        }

        /* renamed from: e0 */
        private boolean m20025e0(int i) throws IOException {
            int i2 = this.f16846i;
            if (i2 + i > this.f16844g) {
                int i3 = this.f16831c;
                int i4 = this.f16848k;
                if (i <= (i3 - i4) - i2 && i4 + i2 + i <= this.f16849l) {
                    InterfaceC7056a interfaceC7056a = this.f16850m;
                    if (interfaceC7056a != null) {
                        interfaceC7056a.m20024a();
                    }
                    int i5 = this.f16846i;
                    if (i5 > 0) {
                        int i6 = this.f16844g;
                        if (i6 > i5) {
                            byte[] bArr = this.f16843f;
                            System.arraycopy(bArr, i5, bArr, 0, i6 - i5);
                        }
                        this.f16848k += i5;
                        this.f16844g -= i5;
                        this.f16846i = 0;
                    }
                    InputStream inputStream = this.f16842e;
                    byte[] bArr2 = this.f16843f;
                    int i7 = this.f16844g;
                    int m20045K = m20045K(inputStream, bArr2, i7, Math.min(bArr2.length - i7, (this.f16831c - this.f16848k) - i7));
                    if (m20045K == 0 || m20045K < -1 || m20045K > this.f16843f.length) {
                        throw new IllegalStateException(this.f16842e.getClass() + "#read(byte[]) returned invalid result: " + m20045K + "\nThe InputStream implementation is buggy.");
                    } else if (m20045K > 0) {
                        this.f16844g += m20045K;
                        m20034V();
                        if (this.f16844g >= i) {
                            return true;
                        }
                        return m20025e0(i);
                    } else {
                        return false;
                    }
                }
                return false;
            }
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: A */
        public int mo20023A() throws IOException {
            return AbstractC7052j.m20069b(m20037S());
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: B */
        public long mo20022B() throws IOException {
            return AbstractC7052j.m20068c(m20036T());
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: C */
        public String mo20021C() throws IOException {
            int m20037S = m20037S();
            if (m20037S > 0 && m20037S <= this.f16844g - this.f16846i) {
                String str = new String(this.f16843f, this.f16846i, m20037S, C6997a0.f16756a);
                this.f16846i += m20037S;
                return str;
            } else if (m20037S == 0) {
                return "";
            } else {
                if (m20037S <= this.f16844g) {
                    m20033W(m20037S);
                    String str2 = new String(this.f16843f, this.f16846i, m20037S, C6997a0.f16756a);
                    this.f16846i += m20037S;
                    return str2;
                }
                return new String(m20042N(m20037S, false), C6997a0.f16756a);
            }
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: D */
        public String mo20020D() throws IOException {
            byte[] m20042N;
            int m20037S = m20037S();
            int i = this.f16846i;
            if (m20037S <= this.f16844g - i && m20037S > 0) {
                m20042N = this.f16843f;
                this.f16846i = i + m20037S;
            } else if (m20037S == 0) {
                return "";
            } else {
                if (m20037S <= this.f16844g) {
                    m20033W(m20037S);
                    m20042N = this.f16843f;
                    this.f16846i = m20037S + 0;
                } else {
                    m20042N = m20042N(m20037S, false);
                }
                i = 0;
            }
            return C7110s1.m19623h(m20042N, i, m20037S);
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: E */
        public int mo20019E() throws IOException {
            if (mo19997e()) {
                this.f16847j = 0;
                return 0;
            }
            int m20037S = m20037S();
            this.f16847j = m20037S;
            if (C7118t1.m19564a(m20037S) != 0) {
                return this.f16847j;
            }
            throw InvalidProtocolBufferException.m20255d();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: F */
        public int mo20018F() throws IOException {
            return m20037S();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: G */
        public long mo20017G() throws IOException {
            return m20036T();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: I */
        public boolean mo20016I(int i) throws IOException {
            int m19563b = C7118t1.m19563b(i);
            if (m19563b == 0) {
                m20028b0();
                return true;
            } else if (m19563b == 1) {
                m20030Z(8);
                return true;
            } else if (m19563b == 2) {
                m20030Z(m20037S());
                return true;
            } else if (m19563b == 3) {
                m20031Y();
                mo19999a(C7118t1.m19562c(C7118t1.m19564a(i), 4));
                return true;
            } else if (m19563b != 4) {
                if (m19563b == 5) {
                    m20030Z(4);
                    return true;
                }
                throw InvalidProtocolBufferException.m20253f();
            } else {
                return false;
            }
        }

        /* renamed from: M */
        public byte m20043M() throws IOException {
            if (this.f16846i == this.f16844g) {
                m20033W(1);
            }
            byte[] bArr = this.f16843f;
            int i = this.f16846i;
            this.f16846i = i + 1;
            return bArr[i];
        }

        /* renamed from: Q */
        public int m20039Q() throws IOException {
            int i = this.f16846i;
            if (this.f16844g - i < 4) {
                m20033W(4);
                i = this.f16846i;
            }
            byte[] bArr = this.f16843f;
            this.f16846i = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: R */
        public long m20038R() throws IOException {
            int i = this.f16846i;
            if (this.f16844g - i < 8) {
                m20033W(8);
                i = this.f16846i;
            }
            byte[] bArr = this.f16843f;
            this.f16846i = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r2[r3] < 0) goto L34;
         */
        /* renamed from: S */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int m20037S() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f16846i
                int r1 = r5.f16844g
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f16843f
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f16846i = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.m20035U()
                int r1 = (int) r0
                return r1
            L70:
                r5.f16846i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC7052j.C7055c.m20037S():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
            if (r2[r0] < 0) goto L42;
         */
        /* renamed from: T */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long m20036T() throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 192
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC7052j.C7055c.m20036T():long");
        }

        /* renamed from: U */
        long m20035U() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte m20043M = m20043M();
                j |= (m20043M & Byte.MAX_VALUE) << i;
                if ((m20043M & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m20252g();
        }

        /* renamed from: Y */
        public void m20031Y() throws IOException {
            int mo20019E;
            do {
                mo20019E = mo20019E();
                if (mo20019E == 0) {
                    return;
                }
            } while (mo20016I(mo20019E));
        }

        /* renamed from: Z */
        public void m20030Z(int i) throws IOException {
            int i2 = this.f16844g;
            int i3 = this.f16846i;
            if (i <= i2 - i3 && i >= 0) {
                this.f16846i = i3 + i;
            } else {
                m20029a0(i);
            }
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: a */
        public void mo19999a(int i) throws InvalidProtocolBufferException {
            if (this.f16847j != i) {
                throw InvalidProtocolBufferException.m20256c();
            }
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: d */
        public int mo19998d() {
            return this.f16848k + this.f16846i;
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: e */
        public boolean mo19997e() throws IOException {
            return this.f16846i == this.f16844g && !m20025e0(1);
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: m */
        public void mo19996m(int i) {
            this.f16849l = i;
            m20034V();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: n */
        public int mo19995n(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int i2 = i + this.f16848k + this.f16846i;
                int i3 = this.f16849l;
                if (i2 <= i3) {
                    this.f16849l = i2;
                    m20034V();
                    return i3;
                }
                throw InvalidProtocolBufferException.m20245n();
            }
            throw InvalidProtocolBufferException.m20251h();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: o */
        public boolean mo19994o() throws IOException {
            return m20036T() != 0;
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: p */
        public AbstractC7039i mo19993p() throws IOException {
            int m20037S = m20037S();
            int i = this.f16844g;
            int i2 = this.f16846i;
            if (m20037S > i - i2 || m20037S <= 0) {
                if (m20037S == 0) {
                    return AbstractC7039i.f16815d;
                }
                return m20044L(m20037S);
            }
            AbstractC7039i m20090l = AbstractC7039i.m20090l(this.f16843f, i2, m20037S);
            this.f16846i += m20037S;
            return m20090l;
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: q */
        public double mo19992q() throws IOException {
            return Double.longBitsToDouble(m20038R());
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: r */
        public int mo19991r() throws IOException {
            return m20037S();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: s */
        public int mo19990s() throws IOException {
            return m20039Q();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: t */
        public long mo19989t() throws IOException {
            return m20038R();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: u */
        public float mo19988u() throws IOException {
            return Float.intBitsToFloat(m20039Q());
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: v */
        public int mo19987v() throws IOException {
            return m20037S();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: w */
        public long mo19986w() throws IOException {
            return m20036T();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: y */
        public int mo19985y() throws IOException {
            return m20039Q();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: z */
        public long mo19984z() throws IOException {
            return m20038R();
        }

        private C7055c(InputStream inputStream, int i) {
            super();
            this.f16849l = Integer.MAX_VALUE;
            this.f16850m = null;
            C6997a0.m20234b(inputStream, MetricTracker.Object.INPUT);
            this.f16842e = inputStream;
            this.f16843f = new byte[i];
            this.f16844g = 0;
            this.f16846i = 0;
            this.f16848k = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CodedInputStream.java */
    /* renamed from: com.google.protobuf.j$d */
    /* loaded from: classes2.dex */
    public static final class C7057d extends AbstractC7052j {

        /* renamed from: e */
        private final ByteBuffer f16851e;

        /* renamed from: f */
        private final boolean f16852f;

        /* renamed from: g */
        private final long f16853g;

        /* renamed from: h */
        private long f16854h;

        /* renamed from: i */
        private long f16855i;

        /* renamed from: j */
        private long f16856j;

        /* renamed from: k */
        private int f16857k;

        /* renamed from: l */
        private int f16858l;

        /* renamed from: m */
        private boolean f16859m;

        /* renamed from: n */
        private int f16860n;

        /* renamed from: J */
        private int m20015J(long j) {
            return (int) (j - this.f16853g);
        }

        /* renamed from: K */
        static boolean m20014K() {
            return C7102r1.m19697J();
        }

        /* renamed from: R */
        private void m20007R() {
            long j = this.f16854h + this.f16857k;
            this.f16854h = j;
            int i = (int) (j - this.f16856j);
            int i2 = this.f16860n;
            if (i > i2) {
                int i3 = i - i2;
                this.f16857k = i3;
                this.f16854h = j - i3;
                return;
            }
            this.f16857k = 0;
        }

        /* renamed from: S */
        private int m20006S() {
            return (int) (this.f16854h - this.f16855i);
        }

        /* renamed from: V */
        private void m20003V() throws IOException {
            if (m20006S() >= 10) {
                m20002W();
            } else {
                m20001X();
            }
        }

        /* renamed from: W */
        private void m20002W() throws IOException {
            for (int i = 0; i < 10; i++) {
                long j = this.f16855i;
                this.f16855i = 1 + j;
                if (C7102r1.m19660w(j) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m20252g();
        }

        /* renamed from: X */
        private void m20001X() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (m20013L() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m20252g();
        }

        /* renamed from: Y */
        private ByteBuffer m20000Y(long j, long j2) throws IOException {
            int position = this.f16851e.position();
            int limit = this.f16851e.limit();
            try {
                try {
                    this.f16851e.position(m20015J(j));
                    this.f16851e.limit(m20015J(j2));
                    return this.f16851e.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.m20245n();
                }
            } finally {
                this.f16851e.position(position);
                this.f16851e.limit(limit);
            }
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: A */
        public int mo20023A() throws IOException {
            return AbstractC7052j.m20069b(m20010O());
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: B */
        public long mo20022B() throws IOException {
            return AbstractC7052j.m20068c(m20009P());
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: C */
        public String mo20021C() throws IOException {
            int m20010O = m20010O();
            if (m20010O <= 0 || m20010O > m20006S()) {
                if (m20010O == 0) {
                    return "";
                }
                if (m20010O < 0) {
                    throw InvalidProtocolBufferException.m20251h();
                }
                throw InvalidProtocolBufferException.m20245n();
            }
            byte[] bArr = new byte[m20010O];
            long j = m20010O;
            C7102r1.m19667p(this.f16855i, bArr, 0L, j);
            String str = new String(bArr, C6997a0.f16756a);
            this.f16855i += j;
            return str;
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: D */
        public String mo20020D() throws IOException {
            int m20010O = m20010O();
            if (m20010O > 0 && m20010O <= m20006S()) {
                String m19624g = C7110s1.m19624g(this.f16851e, m20015J(this.f16855i), m20010O);
                this.f16855i += m20010O;
                return m19624g;
            } else if (m20010O == 0) {
                return "";
            } else {
                if (m20010O <= 0) {
                    throw InvalidProtocolBufferException.m20251h();
                }
                throw InvalidProtocolBufferException.m20245n();
            }
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: E */
        public int mo20019E() throws IOException {
            if (mo19997e()) {
                this.f16858l = 0;
                return 0;
            }
            int m20010O = m20010O();
            this.f16858l = m20010O;
            if (C7118t1.m19564a(m20010O) != 0) {
                return this.f16858l;
            }
            throw InvalidProtocolBufferException.m20255d();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: F */
        public int mo20018F() throws IOException {
            return m20010O();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: G */
        public long mo20017G() throws IOException {
            return m20009P();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: I */
        public boolean mo20016I(int i) throws IOException {
            int m19563b = C7118t1.m19563b(i);
            if (m19563b == 0) {
                m20003V();
                return true;
            } else if (m19563b == 1) {
                m20004U(8);
                return true;
            } else if (m19563b == 2) {
                m20004U(m20010O());
                return true;
            } else if (m19563b == 3) {
                m20005T();
                mo19999a(C7118t1.m19562c(C7118t1.m19564a(i), 4));
                return true;
            } else if (m19563b != 4) {
                if (m19563b == 5) {
                    m20004U(4);
                    return true;
                }
                throw InvalidProtocolBufferException.m20253f();
            } else {
                return false;
            }
        }

        /* renamed from: L */
        public byte m20013L() throws IOException {
            long j = this.f16855i;
            if (j != this.f16854h) {
                this.f16855i = 1 + j;
                return C7102r1.m19660w(j);
            }
            throw InvalidProtocolBufferException.m20245n();
        }

        /* renamed from: M */
        public int m20012M() throws IOException {
            long j = this.f16855i;
            if (this.f16854h - j >= 4) {
                this.f16855i = 4 + j;
                return ((C7102r1.m19660w(j + 3) & 255) << 24) | (C7102r1.m19660w(j) & 255) | ((C7102r1.m19660w(1 + j) & 255) << 8) | ((C7102r1.m19660w(2 + j) & 255) << 16);
            }
            throw InvalidProtocolBufferException.m20245n();
        }

        /* renamed from: N */
        public long m20011N() throws IOException {
            long j = this.f16855i;
            if (this.f16854h - j >= 8) {
                this.f16855i = 8 + j;
                return ((C7102r1.m19660w(j + 7) & 255) << 56) | (C7102r1.m19660w(j) & 255) | ((C7102r1.m19660w(1 + j) & 255) << 8) | ((C7102r1.m19660w(2 + j) & 255) << 16) | ((C7102r1.m19660w(3 + j) & 255) << 24) | ((C7102r1.m19660w(4 + j) & 255) << 32) | ((C7102r1.m19660w(5 + j) & 255) << 40) | ((C7102r1.m19660w(6 + j) & 255) << 48);
            }
            throw InvalidProtocolBufferException.m20245n();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
            if (com.google.protobuf.C7102r1.m19660w(r4) < 0) goto L34;
         */
        /* renamed from: O */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int m20010O() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f16855i
                long r2 = r10.f16854h
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto La
                goto L85
            La:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.C7102r1.m19660w(r0)
                if (r0 < 0) goto L17
                r10.f16855i = r4
                return r0
            L17:
                long r6 = r10.f16854h
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L21
                goto L85
            L21:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C7102r1.m19660w(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L2f
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L8b
            L2f:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C7102r1.m19660w(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L3e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L3c:
                r6 = r4
                goto L8b
            L3e:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C7102r1.m19660w(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L4e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L8b
            L4e:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C7102r1.m19660w(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C7102r1.m19660w(r4)
                if (r1 >= 0) goto L8b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C7102r1.m19660w(r6)
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C7102r1.m19660w(r4)
                if (r1 >= 0) goto L8b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C7102r1.m19660w(r6)
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C7102r1.m19660w(r4)
                if (r1 >= 0) goto L8b
            L85:
                long r0 = r10.m20008Q()
                int r1 = (int) r0
                return r1
            L8b:
                r10.f16855i = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC7052j.C7057d.m20010O():int");
        }

        /* renamed from: P */
        public long m20009P() throws IOException {
            long m19660w;
            long j;
            long j2;
            int i;
            long j3 = this.f16855i;
            if (this.f16854h != j3) {
                long j4 = j3 + 1;
                byte m19660w2 = C7102r1.m19660w(j3);
                if (m19660w2 >= 0) {
                    this.f16855i = j4;
                    return m19660w2;
                } else if (this.f16854h - j4 >= 9) {
                    long j5 = j4 + 1;
                    int m19660w3 = m19660w2 ^ (C7102r1.m19660w(j4) << 7);
                    if (m19660w3 >= 0) {
                        long j6 = j5 + 1;
                        int m19660w4 = m19660w3 ^ (C7102r1.m19660w(j5) << 14);
                        if (m19660w4 >= 0) {
                            m19660w = m19660w4 ^ 16256;
                        } else {
                            j5 = j6 + 1;
                            int m19660w5 = m19660w4 ^ (C7102r1.m19660w(j6) << 21);
                            if (m19660w5 < 0) {
                                i = m19660w5 ^ (-2080896);
                            } else {
                                j6 = j5 + 1;
                                long m19660w6 = m19660w5 ^ (C7102r1.m19660w(j5) << 28);
                                if (m19660w6 < 0) {
                                    long j7 = j6 + 1;
                                    long m19660w7 = m19660w6 ^ (C7102r1.m19660w(j6) << 35);
                                    if (m19660w7 < 0) {
                                        j = -34093383808L;
                                    } else {
                                        j6 = j7 + 1;
                                        m19660w6 = m19660w7 ^ (C7102r1.m19660w(j7) << 42);
                                        if (m19660w6 >= 0) {
                                            j2 = 4363953127296L;
                                        } else {
                                            j7 = j6 + 1;
                                            m19660w7 = m19660w6 ^ (C7102r1.m19660w(j6) << 49);
                                            if (m19660w7 < 0) {
                                                j = -558586000294016L;
                                            } else {
                                                j6 = j7 + 1;
                                                m19660w = (m19660w7 ^ (C7102r1.m19660w(j7) << 56)) ^ 71499008037633920L;
                                                if (m19660w < 0) {
                                                    long j8 = 1 + j6;
                                                    if (C7102r1.m19660w(j6) >= 0) {
                                                        j5 = j8;
                                                        this.f16855i = j5;
                                                        return m19660w;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    m19660w = m19660w7 ^ j;
                                    j5 = j7;
                                    this.f16855i = j5;
                                    return m19660w;
                                }
                                j2 = 266354560;
                                m19660w = m19660w6 ^ j2;
                            }
                        }
                        j5 = j6;
                        this.f16855i = j5;
                        return m19660w;
                    }
                    i = m19660w3 ^ (-128);
                    m19660w = i;
                    this.f16855i = j5;
                    return m19660w;
                }
            }
            return m20008Q();
        }

        /* renamed from: Q */
        long m20008Q() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte m20013L = m20013L();
                j |= (m20013L & Byte.MAX_VALUE) << i;
                if ((m20013L & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m20252g();
        }

        /* renamed from: T */
        public void m20005T() throws IOException {
            int mo20019E;
            do {
                mo20019E = mo20019E();
                if (mo20019E == 0) {
                    return;
                }
            } while (mo20016I(mo20019E));
        }

        /* renamed from: U */
        public void m20004U(int i) throws IOException {
            if (i >= 0 && i <= m20006S()) {
                this.f16855i += i;
            } else if (i < 0) {
                throw InvalidProtocolBufferException.m20251h();
            } else {
                throw InvalidProtocolBufferException.m20245n();
            }
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: a */
        public void mo19999a(int i) throws InvalidProtocolBufferException {
            if (this.f16858l != i) {
                throw InvalidProtocolBufferException.m20256c();
            }
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: d */
        public int mo19998d() {
            return (int) (this.f16855i - this.f16856j);
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: e */
        public boolean mo19997e() throws IOException {
            return this.f16855i == this.f16854h;
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: m */
        public void mo19996m(int i) {
            this.f16860n = i;
            m20007R();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: n */
        public int mo19995n(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int mo19998d = i + mo19998d();
                int i2 = this.f16860n;
                if (mo19998d <= i2) {
                    this.f16860n = mo19998d;
                    m20007R();
                    return i2;
                }
                throw InvalidProtocolBufferException.m20245n();
            }
            throw InvalidProtocolBufferException.m20251h();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: o */
        public boolean mo19994o() throws IOException {
            return m20009P() != 0;
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: p */
        public AbstractC7039i mo19993p() throws IOException {
            int m20010O = m20010O();
            if (m20010O <= 0 || m20010O > m20006S()) {
                if (m20010O == 0) {
                    return AbstractC7039i.f16815d;
                }
                if (m20010O < 0) {
                    throw InvalidProtocolBufferException.m20251h();
                }
                throw InvalidProtocolBufferException.m20245n();
            } else if (this.f16852f && this.f16859m) {
                long j = this.f16855i;
                long j2 = m20010O;
                ByteBuffer m20000Y = m20000Y(j, j + j2);
                this.f16855i += j2;
                return AbstractC7039i.m20095f0(m20000Y);
            } else {
                byte[] bArr = new byte[m20010O];
                long j3 = m20010O;
                C7102r1.m19667p(this.f16855i, bArr, 0L, j3);
                this.f16855i += j3;
                return AbstractC7039i.m20094g0(bArr);
            }
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: q */
        public double mo19992q() throws IOException {
            return Double.longBitsToDouble(m20011N());
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: r */
        public int mo19991r() throws IOException {
            return m20010O();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: s */
        public int mo19990s() throws IOException {
            return m20012M();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: t */
        public long mo19989t() throws IOException {
            return m20011N();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: u */
        public float mo19988u() throws IOException {
            return Float.intBitsToFloat(m20012M());
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: v */
        public int mo19987v() throws IOException {
            return m20010O();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: w */
        public long mo19986w() throws IOException {
            return m20009P();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: y */
        public int mo19985y() throws IOException {
            return m20012M();
        }

        @Override // com.google.protobuf.AbstractC7052j
        /* renamed from: z */
        public long mo19984z() throws IOException {
            return m20011N();
        }

        private C7057d(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f16860n = Integer.MAX_VALUE;
            this.f16851e = byteBuffer;
            long m19672k = C7102r1.m19672k(byteBuffer);
            this.f16853g = m19672k;
            this.f16854h = m19672k + byteBuffer.limit();
            long position = this.f16853g + byteBuffer.position();
            this.f16855i = position;
            this.f16856j = position;
            this.f16852f = z;
        }
    }

    /* renamed from: b */
    public static int m20069b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m20068c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: f */
    public static AbstractC7052j m20067f(InputStream inputStream) {
        return m20066g(inputStream, 4096);
    }

    /* renamed from: g */
    public static AbstractC7052j m20066g(InputStream inputStream, int i) {
        if (i > 0) {
            if (inputStream == null) {
                return m20063j(C6997a0.f16757b);
            }
            return new C7055c(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    /* renamed from: h */
    public static AbstractC7052j m20065h(ByteBuffer byteBuffer) {
        return m20064i(byteBuffer, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static AbstractC7052j m20064i(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return m20061l(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && C7057d.m20014K()) {
            return new C7057d(byteBuffer, z);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return m20061l(bArr, 0, remaining, true);
    }

    /* renamed from: j */
    public static AbstractC7052j m20063j(byte[] bArr) {
        return m20062k(bArr, 0, bArr.length);
    }

    /* renamed from: k */
    public static AbstractC7052j m20062k(byte[] bArr, int i, int i2) {
        return m20061l(bArr, i, i2, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static AbstractC7052j m20061l(byte[] bArr, int i, int i2, boolean z) {
        C7054b c7054b = new C7054b(bArr, i, i2, z);
        try {
            c7054b.mo19995n(i2);
            return c7054b;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: x */
    public static int m20060x(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.m20245n();
            }
            i2 |= (read & 127) << i3;
            if ((read & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.m20245n();
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw InvalidProtocolBufferException.m20252g();
    }

    /* renamed from: A */
    public abstract int mo20023A() throws IOException;

    /* renamed from: B */
    public abstract long mo20022B() throws IOException;

    /* renamed from: C */
    public abstract String mo20021C() throws IOException;

    /* renamed from: D */
    public abstract String mo20020D() throws IOException;

    /* renamed from: E */
    public abstract int mo20019E() throws IOException;

    /* renamed from: F */
    public abstract int mo20018F() throws IOException;

    /* renamed from: G */
    public abstract long mo20017G() throws IOException;

    /* renamed from: H */
    public final int m20070H(int i) {
        if (i >= 0) {
            int i2 = this.f16831c;
            this.f16831c = i;
            return i2;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i);
    }

    /* renamed from: I */
    public abstract boolean mo20016I(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo19999a(int i) throws InvalidProtocolBufferException;

    /* renamed from: d */
    public abstract int mo19998d();

    /* renamed from: e */
    public abstract boolean mo19997e() throws IOException;

    /* renamed from: m */
    public abstract void mo19996m(int i);

    /* renamed from: n */
    public abstract int mo19995n(int i) throws InvalidProtocolBufferException;

    /* renamed from: o */
    public abstract boolean mo19994o() throws IOException;

    /* renamed from: p */
    public abstract AbstractC7039i mo19993p() throws IOException;

    /* renamed from: q */
    public abstract double mo19992q() throws IOException;

    /* renamed from: r */
    public abstract int mo19991r() throws IOException;

    /* renamed from: s */
    public abstract int mo19990s() throws IOException;

    /* renamed from: t */
    public abstract long mo19989t() throws IOException;

    /* renamed from: u */
    public abstract float mo19988u() throws IOException;

    /* renamed from: v */
    public abstract int mo19987v() throws IOException;

    /* renamed from: w */
    public abstract long mo19986w() throws IOException;

    /* renamed from: y */
    public abstract int mo19985y() throws IOException;

    /* renamed from: z */
    public abstract long mo19984z() throws IOException;

    private AbstractC7052j() {
        this.f16830b = 100;
        this.f16831c = Integer.MAX_VALUE;
    }
}
