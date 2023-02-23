package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
/* loaded from: classes3.dex */
public final class CodedOutputStream {

    /* renamed from: a */
    private final byte[] f29914a;

    /* renamed from: b */
    private final int f29915b;

    /* renamed from: e */
    private final OutputStream f29918e;

    /* renamed from: d */
    private int f29917d = 0;

    /* renamed from: c */
    private int f29916c = 0;

    /* loaded from: classes3.dex */
    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f29918e = outputStream;
        this.f29914a = bArr;
        this.f29915b = bArr.length;
    }

    /* renamed from: A */
    public static int m4645A(int i, long j) {
        return m4642D(i) + m4644B(j);
    }

    /* renamed from: B */
    public static int m4644B(long j) {
        return m4575w(m4638H(j));
    }

    /* renamed from: C */
    public static int m4643C(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return m4577v(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    /* renamed from: D */
    public static int m4642D(int i) {
        return m4577v(C13624w.m4299c(i, 0));
    }

    /* renamed from: E */
    public static int m4641E(int i) {
        return m4577v(i);
    }

    /* renamed from: F */
    public static int m4640F(long j) {
        return m4575w(j);
    }

    /* renamed from: G */
    public static int m4639G(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: H */
    public static long m4638H(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: J */
    public static CodedOutputStream m4636J(OutputStream outputStream, int i) {
        return new CodedOutputStream(outputStream, new byte[i]);
    }

    /* renamed from: K */
    private void m4635K() throws IOException {
        OutputStream outputStream = this.f29918e;
        if (outputStream != null) {
            outputStream.write(this.f29914a, 0, this.f29916c);
            this.f29916c = 0;
            return;
        }
        throw new OutOfSpaceException();
    }

    /* renamed from: a */
    public static int m4619a(int i, boolean z) {
        return m4642D(i) + m4617b(z);
    }

    /* renamed from: b */
    public static int m4617b(boolean z) {
        return 1;
    }

    /* renamed from: c */
    public static int m4615c(byte[] bArr) {
        return m4577v(bArr.length) + bArr.length;
    }

    /* renamed from: d */
    public static int m4613d(int i, AbstractC13570d abstractC13570d) {
        return m4642D(i) + m4611e(abstractC13570d);
    }

    /* renamed from: e */
    public static int m4611e(AbstractC13570d abstractC13570d) {
        return m4577v(abstractC13570d.size()) + abstractC13570d.size();
    }

    /* renamed from: f */
    public static int m4609f(int i, double d) {
        return m4642D(i) + m4607g(d);
    }

    /* renamed from: g */
    public static int m4607g(double d) {
        return 8;
    }

    /* renamed from: h */
    public static int m4605h(int i, int i2) {
        return m4642D(i) + m4603i(i2);
    }

    /* renamed from: i */
    public static int m4603i(int i) {
        return m4589p(i);
    }

    /* renamed from: j */
    public static int m4601j(int i) {
        return 4;
    }

    /* renamed from: k */
    public static int m4599k(long j) {
        return 8;
    }

    /* renamed from: l */
    public static int m4597l(int i, float f) {
        return m4642D(i) + m4595m(f);
    }

    /* renamed from: m */
    public static int m4595m(float f) {
        return 4;
    }

    /* renamed from: n */
    public static int m4593n(InterfaceC13601o interfaceC13601o) {
        return interfaceC13601o.mo4384d();
    }

    /* renamed from: o */
    public static int m4591o(int i, int i2) {
        return m4642D(i) + m4589p(i2);
    }

    /* renamed from: p */
    public static int m4589p(int i) {
        if (i >= 0) {
            return m4577v(i);
        }
        return 10;
    }

    /* renamed from: q */
    public static int m4587q(long j) {
        return m4575w(j);
    }

    /* renamed from: r */
    public static int m4585r(C13595k c13595k) {
        int m4400b = c13595k.m4400b();
        return m4577v(m4400b) + m4400b;
    }

    /* renamed from: s */
    public static int m4583s(int i, InterfaceC13601o interfaceC13601o) {
        return m4642D(i) + m4581t(interfaceC13601o);
    }

    /* renamed from: t */
    public static int m4581t(InterfaceC13601o interfaceC13601o) {
        int mo4384d = interfaceC13601o.mo4384d();
        return m4577v(mo4384d) + mo4384d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static int m4579u(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: v */
    public static int m4577v(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: w */
    public static int m4575w(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: x */
    public static int m4573x(int i) {
        return 4;
    }

    /* renamed from: y */
    public static int m4571y(long j) {
        return 8;
    }

    /* renamed from: z */
    public static int m4569z(int i) {
        return m4577v(m4639G(i));
    }

    /* renamed from: I */
    public void m4637I() throws IOException {
        if (this.f29918e != null) {
            m4635K();
        }
    }

    /* renamed from: L */
    public void m4634L(int i, boolean z) throws IOException {
        m4574w0(i, 0);
        m4633M(z);
    }

    /* renamed from: M */
    public void m4633M(boolean z) throws IOException {
        m4604h0(z ? 1 : 0);
    }

    /* renamed from: N */
    public void m4632N(byte[] bArr) throws IOException {
        m4590o0(bArr.length);
        m4598k0(bArr);
    }

    /* renamed from: O */
    public void m4631O(int i, AbstractC13570d abstractC13570d) throws IOException {
        m4574w0(i, 2);
        m4630P(abstractC13570d);
    }

    /* renamed from: P */
    public void m4630P(AbstractC13570d abstractC13570d) throws IOException {
        m4590o0(abstractC13570d.size());
        m4602i0(abstractC13570d);
    }

    /* renamed from: Q */
    public void m4629Q(int i, double d) throws IOException {
        m4574w0(i, 1);
        m4628R(d);
    }

    /* renamed from: R */
    public void m4628R(double d) throws IOException {
        m4592n0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: S */
    public void m4627S(int i, int i2) throws IOException {
        m4574w0(i, 0);
        m4626T(i2);
    }

    /* renamed from: T */
    public void m4626T(int i) throws IOException {
        m4616b0(i);
    }

    /* renamed from: U */
    public void m4625U(int i) throws IOException {
        m4594m0(i);
    }

    /* renamed from: V */
    public void m4624V(long j) throws IOException {
        m4592n0(j);
    }

    /* renamed from: W */
    public void m4623W(int i, float f) throws IOException {
        m4574w0(i, 5);
        m4622X(f);
    }

    /* renamed from: X */
    public void m4622X(float f) throws IOException {
        m4594m0(Float.floatToRawIntBits(f));
    }

    /* renamed from: Y */
    public void m4621Y(int i, InterfaceC13601o interfaceC13601o) throws IOException {
        m4574w0(i, 3);
        m4620Z(interfaceC13601o);
        m4574w0(i, 4);
    }

    /* renamed from: Z */
    public void m4620Z(InterfaceC13601o interfaceC13601o) throws IOException {
        interfaceC13601o.mo4385c(this);
    }

    /* renamed from: a0 */
    public void m4618a0(int i, int i2) throws IOException {
        m4574w0(i, 0);
        m4616b0(i2);
    }

    /* renamed from: b0 */
    public void m4616b0(int i) throws IOException {
        if (i >= 0) {
            m4590o0(i);
        } else {
            m4588p0(i);
        }
    }

    /* renamed from: c0 */
    public void m4614c0(long j) throws IOException {
        m4588p0(j);
    }

    /* renamed from: d0 */
    public void m4612d0(int i, InterfaceC13601o interfaceC13601o) throws IOException {
        m4574w0(i, 2);
        m4610e0(interfaceC13601o);
    }

    /* renamed from: e0 */
    public void m4610e0(InterfaceC13601o interfaceC13601o) throws IOException {
        m4590o0(interfaceC13601o.mo4384d());
        interfaceC13601o.mo4385c(this);
    }

    /* renamed from: f0 */
    public void m4608f0(int i, InterfaceC13601o interfaceC13601o) throws IOException {
        m4574w0(1, 3);
        m4572x0(2, i);
        m4612d0(3, interfaceC13601o);
        m4574w0(1, 4);
    }

    /* renamed from: g0 */
    public void m4606g0(byte b) throws IOException {
        if (this.f29916c == this.f29915b) {
            m4635K();
        }
        byte[] bArr = this.f29914a;
        int i = this.f29916c;
        this.f29916c = i + 1;
        bArr[i] = b;
        this.f29917d++;
    }

    /* renamed from: h0 */
    public void m4604h0(int i) throws IOException {
        m4606g0((byte) i);
    }

    /* renamed from: i0 */
    public void m4602i0(AbstractC13570d abstractC13570d) throws IOException {
        m4600j0(abstractC13570d, 0, abstractC13570d.size());
    }

    /* renamed from: j0 */
    public void m4600j0(AbstractC13570d abstractC13570d, int i, int i2) throws IOException {
        int i3 = this.f29915b;
        int i4 = this.f29916c;
        if (i3 - i4 >= i2) {
            abstractC13570d.m4532m(this.f29914a, i, i4, i2);
            this.f29916c += i2;
            this.f29917d += i2;
            return;
        }
        int i5 = i3 - i4;
        abstractC13570d.m4532m(this.f29914a, i, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f29916c = this.f29915b;
        this.f29917d += i5;
        m4635K();
        if (i7 <= this.f29915b) {
            abstractC13570d.m4532m(this.f29914a, i6, 0, i7);
            this.f29916c = i7;
        } else {
            abstractC13570d.m4537e0(this.f29918e, i6, i7);
        }
        this.f29917d += i7;
    }

    /* renamed from: k0 */
    public void m4598k0(byte[] bArr) throws IOException {
        m4596l0(bArr, 0, bArr.length);
    }

    /* renamed from: l0 */
    public void m4596l0(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f29915b;
        int i4 = this.f29916c;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f29914a, i4, i2);
            this.f29916c += i2;
            this.f29917d += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f29914a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f29916c = this.f29915b;
        this.f29917d += i5;
        m4635K();
        if (i7 <= this.f29915b) {
            System.arraycopy(bArr, i6, this.f29914a, 0, i7);
            this.f29916c = i7;
        } else {
            this.f29918e.write(bArr, i6, i7);
        }
        this.f29917d += i7;
    }

    /* renamed from: m0 */
    public void m4594m0(int i) throws IOException {
        m4604h0(i & 255);
        m4604h0((i >> 8) & 255);
        m4604h0((i >> 16) & 255);
        m4604h0((i >> 24) & 255);
    }

    /* renamed from: n0 */
    public void m4592n0(long j) throws IOException {
        m4604h0(((int) j) & 255);
        m4604h0(((int) (j >> 8)) & 255);
        m4604h0(((int) (j >> 16)) & 255);
        m4604h0(((int) (j >> 24)) & 255);
        m4604h0(((int) (j >> 32)) & 255);
        m4604h0(((int) (j >> 40)) & 255);
        m4604h0(((int) (j >> 48)) & 255);
        m4604h0(((int) (j >> 56)) & 255);
    }

    /* renamed from: o0 */
    public void m4590o0(int i) throws IOException {
        while ((i & (-128)) != 0) {
            m4604h0((i & 127) | 128);
            i >>>= 7;
        }
        m4604h0(i);
    }

    /* renamed from: p0 */
    public void m4588p0(long j) throws IOException {
        while (((-128) & j) != 0) {
            m4604h0((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m4604h0((int) j);
    }

    /* renamed from: q0 */
    public void m4586q0(int i) throws IOException {
        m4594m0(i);
    }

    /* renamed from: r0 */
    public void m4584r0(long j) throws IOException {
        m4592n0(j);
    }

    /* renamed from: s0 */
    public void m4582s0(int i) throws IOException {
        m4590o0(m4639G(i));
    }

    /* renamed from: t0 */
    public void m4580t0(int i, long j) throws IOException {
        m4574w0(i, 0);
        m4578u0(j);
    }

    /* renamed from: u0 */
    public void m4578u0(long j) throws IOException {
        m4588p0(m4638H(j));
    }

    /* renamed from: v0 */
    public void m4576v0(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        m4590o0(bytes.length);
        m4598k0(bytes);
    }

    /* renamed from: w0 */
    public void m4574w0(int i, int i2) throws IOException {
        m4590o0(C13624w.m4299c(i, i2));
    }

    /* renamed from: x0 */
    public void m4572x0(int i, int i2) throws IOException {
        m4574w0(i, 0);
        m4570y0(i2);
    }

    /* renamed from: y0 */
    public void m4570y0(int i) throws IOException {
        m4590o0(i);
    }

    /* renamed from: z0 */
    public void m4568z0(long j) throws IOException {
        m4588p0(j);
    }
}
