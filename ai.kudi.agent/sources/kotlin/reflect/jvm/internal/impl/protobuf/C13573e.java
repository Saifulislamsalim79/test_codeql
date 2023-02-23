package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o;
/* compiled from: CodedInputStream.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.e */
/* loaded from: classes3.dex */
public final class C13573e {

    /* renamed from: a */
    private final byte[] f29933a;

    /* renamed from: b */
    private final boolean f29934b;

    /* renamed from: c */
    private int f29935c;

    /* renamed from: d */
    private int f29936d;

    /* renamed from: e */
    private int f29937e;

    /* renamed from: f */
    private final InputStream f29938f;

    /* renamed from: g */
    private int f29939g;

    /* renamed from: h */
    private boolean f29940h;

    /* renamed from: i */
    private int f29941i;

    /* renamed from: j */
    private int f29942j;

    /* renamed from: k */
    private int f29943k;

    /* renamed from: l */
    private int f29944l;

    /* renamed from: m */
    private int f29945m;

    /* renamed from: n */
    private InterfaceC13574a f29946n;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CodedInputStream.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.e$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC13574a {
        /* renamed from: a */
        void m4480a();
    }

    private C13573e(InputStream inputStream) {
        this.f29940h = false;
        this.f29942j = Integer.MAX_VALUE;
        this.f29944l = 64;
        this.f29945m = 67108864;
        this.f29946n = null;
        this.f29933a = new byte[4096];
        this.f29935c = 0;
        this.f29937e = 0;
        this.f29941i = 0;
        this.f29938f = inputStream;
        this.f29934b = false;
    }

    /* renamed from: B */
    public static int m4525B(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.m4557k();
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
                throw InvalidProtocolBufferException.m4557k();
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw InvalidProtocolBufferException.m4562f();
    }

    /* renamed from: N */
    private void m4513N() {
        int i = this.f29935c + this.f29936d;
        this.f29935c = i;
        int i2 = this.f29941i + i;
        int i3 = this.f29942j;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f29936d = i4;
            this.f29935c = i - i4;
            return;
        }
        this.f29936d = 0;
    }

    /* renamed from: O */
    private void m4512O(int i) throws IOException {
        if (!m4507T(i)) {
            throw InvalidProtocolBufferException.m4557k();
        }
    }

    /* renamed from: S */
    private void m4508S(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f29941i;
            int i3 = this.f29937e;
            int i4 = i2 + i3 + i;
            int i5 = this.f29942j;
            if (i4 <= i5) {
                int i6 = this.f29935c;
                int i7 = i6 - i3;
                this.f29937e = i6;
                m4512O(1);
                while (true) {
                    int i8 = i - i7;
                    int i9 = this.f29935c;
                    if (i8 > i9) {
                        i7 += i9;
                        this.f29937e = i9;
                        m4512O(1);
                    } else {
                        this.f29937e = i8;
                        return;
                    }
                }
            } else {
                m4509R((i5 - i2) - i3);
                throw InvalidProtocolBufferException.m4557k();
            }
        } else {
            throw InvalidProtocolBufferException.m4561g();
        }
    }

    /* renamed from: T */
    private boolean m4507T(int i) throws IOException {
        int i2 = this.f29937e;
        if (i2 + i > this.f29935c) {
            if (this.f29941i + i2 + i > this.f29942j) {
                return false;
            }
            InterfaceC13574a interfaceC13574a = this.f29946n;
            if (interfaceC13574a != null) {
                interfaceC13574a.m4480a();
            }
            if (this.f29938f != null) {
                int i3 = this.f29937e;
                if (i3 > 0) {
                    int i4 = this.f29935c;
                    if (i4 > i3) {
                        byte[] bArr = this.f29933a;
                        System.arraycopy(bArr, i3, bArr, 0, i4 - i3);
                    }
                    this.f29941i += i3;
                    this.f29935c -= i3;
                    this.f29937e = 0;
                }
                InputStream inputStream = this.f29938f;
                byte[] bArr2 = this.f29933a;
                int i5 = this.f29935c;
                int read = inputStream.read(bArr2, i5, bArr2.length - i5);
                if (read == 0 || read < -1 || read > this.f29933a.length) {
                    StringBuilder sb = new StringBuilder(102);
                    sb.append("InputStream#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                } else if (read > 0) {
                    this.f29935c += read;
                    if ((this.f29941i + i) - this.f29945m <= 0) {
                        m4513N();
                        if (this.f29935c >= i) {
                            return true;
                        }
                        return m4507T(i);
                    }
                    throw InvalidProtocolBufferException.m4558j();
                }
            }
            return false;
        }
        StringBuilder sb2 = new StringBuilder(77);
        sb2.append("refillBuffer() called when ");
        sb2.append(i);
        sb2.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: b */
    public static int m4505b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m4504c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: d */
    private void m4503d(int i) throws IOException {
        if (this.f29935c - this.f29937e < i) {
            m4512O(i);
        }
    }

    /* renamed from: g */
    public static C13573e m4500g(InputStream inputStream) {
        return new C13573e(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static C13573e m4499h(C13598n c13598n) {
        C13573e c13573e = new C13573e(c13598n);
        try {
            c13573e.m4497j(c13598n.size());
            return c13573e;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: x */
    private byte[] m4483x(int i) throws IOException {
        if (i <= 0) {
            if (i == 0) {
                return C13588i.f29976a;
            }
            throw InvalidProtocolBufferException.m4561g();
        }
        int i2 = this.f29941i;
        int i3 = this.f29937e;
        int i4 = i2 + i3 + i;
        int i5 = this.f29942j;
        if (i4 > i5) {
            m4509R((i5 - i2) - i3);
            throw InvalidProtocolBufferException.m4557k();
        } else if (i < 4096) {
            byte[] bArr = new byte[i];
            int i6 = this.f29935c - i3;
            System.arraycopy(this.f29933a, i3, bArr, 0, i6);
            this.f29937e = this.f29935c;
            int i7 = i - i6;
            m4503d(i7);
            System.arraycopy(this.f29933a, 0, bArr, i6, i7);
            this.f29937e = i7;
            return bArr;
        } else {
            int i8 = this.f29935c;
            this.f29941i = i2 + i8;
            this.f29937e = 0;
            this.f29935c = 0;
            int i9 = i8 - i3;
            int i10 = i - i9;
            ArrayList<byte[]> arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, 4096);
                byte[] bArr2 = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    InputStream inputStream = this.f29938f;
                    int read = inputStream == null ? -1 : inputStream.read(bArr2, i11, min - i11);
                    if (read == -1) {
                        throw InvalidProtocolBufferException.m4557k();
                    }
                    this.f29941i += read;
                    i11 += read;
                }
                i10 -= min;
                arrayList.add(bArr2);
            }
            byte[] bArr3 = new byte[i];
            System.arraycopy(this.f29933a, i3, bArr3, 0, i9);
            for (byte[] bArr4 : arrayList) {
                System.arraycopy(bArr4, 0, bArr3, i9, bArr4.length);
                i9 += bArr4.length;
            }
            return bArr3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r2[r3] < 0) goto L35;
     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m4526A() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.f29937e
            int r1 = r9.f29935c
            if (r1 != r0) goto L8
            goto L7b
        L8:
            byte[] r2 = r9.f29933a
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L13
            r9.f29937e = r3
            return r0
        L13:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L19
            goto L7b
        L19:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2c
            r5 = -128(0xffffffffffffff80, double:NaN)
        L29:
            long r3 = r3 ^ r5
            int r0 = (int) r3
            goto L81
        L2c:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r7 = (long) r0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L3e
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r7
            int r0 = (int) r0
        L3c:
            r1 = r3
            goto L81
        L3e:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L4e
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L29
        L4e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L3c
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L81
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3c
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L81
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3c
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L81
        L7b:
            long r0 = r9.m4523D()
            int r1 = (int) r0
            return r1
        L81:
            r9.f29937e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C13573e.m4526A():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        if (r2[r0] < 0) goto L40;
     */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long m4524C() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C13573e.m4524C():long");
    }

    /* renamed from: D */
    long m4523D() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte m4484w = m4484w();
            j |= (m4484w & Byte.MAX_VALUE) << i;
            if ((m4484w & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.m4562f();
    }

    /* renamed from: E */
    public int m4522E() throws IOException {
        return m4482y();
    }

    /* renamed from: F */
    public long m4521F() throws IOException {
        return m4481z();
    }

    /* renamed from: G */
    public int m4520G() throws IOException {
        return m4505b(m4526A());
    }

    /* renamed from: H */
    public long m4519H() throws IOException {
        return m4504c(m4524C());
    }

    /* renamed from: I */
    public String m4518I() throws IOException {
        int m4526A = m4526A();
        if (m4526A > this.f29935c - this.f29937e || m4526A <= 0) {
            return m4526A == 0 ? "" : new String(m4483x(m4526A), "UTF-8");
        }
        String str = new String(this.f29933a, this.f29937e, m4526A, "UTF-8");
        this.f29937e += m4526A;
        return str;
    }

    /* renamed from: J */
    public String m4517J() throws IOException {
        byte[] m4483x;
        int m4526A = m4526A();
        int i = this.f29937e;
        if (m4526A <= this.f29935c - i && m4526A > 0) {
            m4483x = this.f29933a;
            this.f29937e = i + m4526A;
        } else if (m4526A == 0) {
            return "";
        } else {
            m4483x = m4483x(m4526A);
            i = 0;
        }
        if (C13623v.m4305f(m4483x, i, i + m4526A)) {
            return new String(m4483x, i, m4526A, "UTF-8");
        }
        throw InvalidProtocolBufferException.m4564d();
    }

    /* renamed from: K */
    public int m4516K() throws IOException {
        if (m4501f()) {
            this.f29939g = 0;
            return 0;
        }
        int m4526A = m4526A();
        this.f29939g = m4526A;
        if (C13624w.m4301a(m4526A) != 0) {
            return this.f29939g;
        }
        throw InvalidProtocolBufferException.m4565c();
    }

    /* renamed from: L */
    public int m4515L() throws IOException {
        return m4526A();
    }

    /* renamed from: M */
    public long m4514M() throws IOException {
        return m4524C();
    }

    /* renamed from: P */
    public boolean m4511P(int i, CodedOutputStream codedOutputStream) throws IOException {
        int m4300b = C13624w.m4300b(i);
        if (m4300b == 0) {
            long m4487t = m4487t();
            codedOutputStream.m4590o0(i);
            codedOutputStream.m4568z0(m4487t);
            return true;
        } else if (m4300b == 1) {
            long m4481z = m4481z();
            codedOutputStream.m4590o0(i);
            codedOutputStream.m4624V(m4481z);
            return true;
        } else if (m4300b == 2) {
            AbstractC13570d m4495l = m4495l();
            codedOutputStream.m4590o0(i);
            codedOutputStream.m4630P(m4495l);
            return true;
        } else if (m4300b == 3) {
            codedOutputStream.m4590o0(i);
            m4510Q(codedOutputStream);
            int m4299c = C13624w.m4299c(C13624w.m4301a(i), 4);
            m4506a(m4299c);
            codedOutputStream.m4590o0(m4299c);
            return true;
        } else if (m4300b != 4) {
            if (m4300b == 5) {
                int m4482y = m4482y();
                codedOutputStream.m4590o0(i);
                codedOutputStream.m4625U(m4482y);
                return true;
            }
            throw InvalidProtocolBufferException.m4563e();
        } else {
            return false;
        }
    }

    /* renamed from: Q */
    public void m4510Q(CodedOutputStream codedOutputStream) throws IOException {
        int m4516K;
        do {
            m4516K = m4516K();
            if (m4516K == 0) {
                return;
            }
        } while (m4511P(m4516K, codedOutputStream));
    }

    /* renamed from: R */
    public void m4509R(int i) throws IOException {
        int i2 = this.f29935c;
        int i3 = this.f29937e;
        if (i <= i2 - i3 && i >= 0) {
            this.f29937e = i3 + i;
        } else {
            m4508S(i);
        }
    }

    /* renamed from: a */
    public void m4506a(int i) throws InvalidProtocolBufferException {
        if (this.f29939g != i) {
            throw InvalidProtocolBufferException.m4566b();
        }
    }

    /* renamed from: e */
    public int m4502e() {
        int i = this.f29942j;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f29941i + this.f29937e);
    }

    /* renamed from: f */
    public boolean m4501f() throws IOException {
        return this.f29937e == this.f29935c && !m4507T(1);
    }

    /* renamed from: i */
    public void m4498i(int i) {
        this.f29942j = i;
        m4513N();
    }

    /* renamed from: j */
    public int m4497j(int i) throws InvalidProtocolBufferException {
        if (i >= 0) {
            int i2 = i + this.f29941i + this.f29937e;
            int i3 = this.f29942j;
            if (i2 <= i3) {
                this.f29942j = i2;
                m4513N();
                return i3;
            }
            throw InvalidProtocolBufferException.m4557k();
        }
        throw InvalidProtocolBufferException.m4561g();
    }

    /* renamed from: k */
    public boolean m4496k() throws IOException {
        return m4524C() != 0;
    }

    /* renamed from: l */
    public AbstractC13570d m4495l() throws IOException {
        int m4526A = m4526A();
        if (m4526A > this.f29935c - this.f29937e || m4526A <= 0) {
            if (m4526A == 0) {
                return AbstractC13570d.f29926c;
            }
            return new C13598n(m4483x(m4526A));
        }
        AbstractC13570d c13567c = (this.f29934b && this.f29940h) ? new C13567c(this.f29933a, this.f29937e, m4526A) : AbstractC13570d.m4534k(this.f29933a, this.f29937e, m4526A);
        this.f29937e += m4526A;
        return c13567c;
    }

    /* renamed from: m */
    public double m4494m() throws IOException {
        return Double.longBitsToDouble(m4481z());
    }

    /* renamed from: n */
    public int m4493n() throws IOException {
        return m4526A();
    }

    /* renamed from: o */
    public int m4492o() throws IOException {
        return m4482y();
    }

    /* renamed from: p */
    public long m4491p() throws IOException {
        return m4481z();
    }

    /* renamed from: q */
    public float m4490q() throws IOException {
        return Float.intBitsToFloat(m4482y());
    }

    /* renamed from: r */
    public void m4489r(int i, InterfaceC13601o.InterfaceC13602a interfaceC13602a, C13575f c13575f) throws IOException {
        int i2 = this.f29943k;
        if (i2 < this.f29944l) {
            this.f29943k = i2 + 1;
            interfaceC13602a.mo4381V(this, c13575f);
            m4506a(C13624w.m4299c(i, 4));
            this.f29943k--;
            return;
        }
        throw InvalidProtocolBufferException.m4560h();
    }

    /* renamed from: s */
    public int m4488s() throws IOException {
        return m4526A();
    }

    /* renamed from: t */
    public long m4487t() throws IOException {
        return m4524C();
    }

    /* renamed from: u */
    public <T extends InterfaceC13601o> T m4486u(InterfaceC13604q<T> interfaceC13604q, C13575f c13575f) throws IOException {
        int m4526A = m4526A();
        if (this.f29943k < this.f29944l) {
            int m4497j = m4497j(m4526A);
            this.f29943k++;
            T mo4377b = interfaceC13604q.mo4377b(this, c13575f);
            m4506a(0);
            this.f29943k--;
            m4498i(m4497j);
            return mo4377b;
        }
        throw InvalidProtocolBufferException.m4560h();
    }

    /* renamed from: v */
    public void m4485v(InterfaceC13601o.InterfaceC13602a interfaceC13602a, C13575f c13575f) throws IOException {
        int m4526A = m4526A();
        if (this.f29943k < this.f29944l) {
            int m4497j = m4497j(m4526A);
            this.f29943k++;
            interfaceC13602a.mo4381V(this, c13575f);
            m4506a(0);
            this.f29943k--;
            m4498i(m4497j);
            return;
        }
        throw InvalidProtocolBufferException.m4560h();
    }

    /* renamed from: w */
    public byte m4484w() throws IOException {
        if (this.f29937e == this.f29935c) {
            m4512O(1);
        }
        byte[] bArr = this.f29933a;
        int i = this.f29937e;
        this.f29937e = i + 1;
        return bArr[i];
    }

    /* renamed from: y */
    public int m4482y() throws IOException {
        int i = this.f29937e;
        if (this.f29935c - i < 4) {
            m4512O(4);
            i = this.f29937e;
        }
        byte[] bArr = this.f29933a;
        this.f29937e = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: z */
    public long m4481z() throws IOException {
        int i = this.f29937e;
        if (this.f29935c - i < 8) {
            m4512O(8);
            i = this.f29937e;
        }
        byte[] bArr = this.f29933a;
        this.f29937e = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    private C13573e(C13598n c13598n) {
        this.f29940h = false;
        this.f29942j = Integer.MAX_VALUE;
        this.f29944l = 64;
        this.f29945m = 67108864;
        this.f29946n = null;
        this.f29933a = c13598n.f29986d;
        int mo4389i0 = c13598n.mo4389i0();
        this.f29937e = mo4389i0;
        this.f29935c = mo4389i0 + c13598n.size();
        this.f29941i = -this.f29937e;
        this.f29938f = null;
        this.f29934b = true;
    }
}
