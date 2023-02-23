package com.google.protobuf;

import com.google.protobuf.C7110s1;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes2.dex */
public abstract class CodedOutputStream extends AbstractC7033h {

    /* renamed from: c */
    private static final Logger f16741c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d */
    private static final boolean f16742d = C7102r1.m19698I();

    /* renamed from: a */
    C7074l f16743a;

    /* renamed from: b */
    private boolean f16744b;

    /* loaded from: classes2.dex */
    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.CodedOutputStream$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC6991b extends CodedOutputStream {

        /* renamed from: e */
        final byte[] f16745e;

        /* renamed from: f */
        final int f16746f;

        /* renamed from: g */
        int f16747g;

        /* renamed from: h */
        int f16748h;

        AbstractC6991b(int i) {
            super();
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.f16745e = bArr;
                this.f16746f = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* renamed from: c1 */
        final void m20298c1(byte b) {
            byte[] bArr = this.f16745e;
            int i = this.f16747g;
            this.f16747g = i + 1;
            bArr[i] = b;
            this.f16748h++;
        }

        /* renamed from: d1 */
        final void m20297d1(int i) {
            byte[] bArr = this.f16745e;
            int i2 = this.f16747g;
            int i3 = i2 + 1;
            this.f16747g = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f16747g = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f16747g = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f16747g = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.f16748h += 4;
        }

        /* renamed from: e1 */
        final void m20296e1(long j) {
            byte[] bArr = this.f16745e;
            int i = this.f16747g;
            int i2 = i + 1;
            this.f16747g = i2;
            bArr[i] = (byte) (j & 255);
            int i3 = i2 + 1;
            this.f16747g = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i3 + 1;
            this.f16747g = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i4 + 1;
            this.f16747g = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i5 + 1;
            this.f16747g = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f16747g = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f16747g = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f16747g = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.f16748h += 8;
        }

        /* renamed from: f1 */
        final void m20295f1(int i) {
            if (i >= 0) {
                m20293h1(i);
            } else {
                m20292i1(i);
            }
        }

        /* renamed from: g1 */
        final void m20294g1(int i, int i2) {
            m20293h1(C7118t1.m19562c(i, i2));
        }

        /* renamed from: h1 */
        final void m20293h1(int i) {
            if (CodedOutputStream.f16742d) {
                long j = this.f16747g;
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.f16745e;
                    int i2 = this.f16747g;
                    this.f16747g = i2 + 1;
                    C7102r1.m19692O(bArr, i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.f16745e;
                int i3 = this.f16747g;
                this.f16747g = i3 + 1;
                C7102r1.m19692O(bArr2, i3, (byte) i);
                this.f16748h += (int) (this.f16747g - j);
                return;
            }
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.f16745e;
                int i4 = this.f16747g;
                this.f16747g = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                this.f16748h++;
                i >>>= 7;
            }
            byte[] bArr4 = this.f16745e;
            int i5 = this.f16747g;
            this.f16747g = i5 + 1;
            bArr4[i5] = (byte) i;
            this.f16748h++;
        }

        /* renamed from: i1 */
        final void m20292i1(long j) {
            if (CodedOutputStream.f16742d) {
                long j2 = this.f16747g;
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f16745e;
                    int i = this.f16747g;
                    this.f16747g = i + 1;
                    C7102r1.m19692O(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f16745e;
                int i2 = this.f16747g;
                this.f16747g = i2 + 1;
                C7102r1.m19692O(bArr2, i2, (byte) j);
                this.f16748h += (int) (this.f16747g - j2);
                return;
            }
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.f16745e;
                int i3 = this.f16747g;
                this.f16747g = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                this.f16748h++;
                j >>>= 7;
            }
            byte[] bArr4 = this.f16745e;
            int i4 = this.f16747g;
            this.f16747g = i4 + 1;
            bArr4[i4] = (byte) j;
            this.f16748h++;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: j0 */
        public final int mo20288j0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.CodedOutputStream$c */
    /* loaded from: classes2.dex */
    public static class C6992c extends CodedOutputStream {

        /* renamed from: e */
        private final byte[] f16749e;

        /* renamed from: f */
        private final int f16750f;

        /* renamed from: g */
        private int f16751g;

        C6992c(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f16749e = bArr;
                    this.f16751g = i;
                    this.f16750f = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            throw new NullPointerException("buffer");
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: F0 */
        public final void mo20287F0(int i, int i2) throws IOException {
            mo20279X0(i, 0);
            mo20286G0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: G0 */
        public final void mo20286G0(int i) throws IOException {
            if (i >= 0) {
                mo20277Z0(i);
            } else {
                mo20275b1(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: J0 */
        final void mo20285J0(int i, InterfaceC7100r0 interfaceC7100r0, InterfaceC7038h1 interfaceC7038h1) throws IOException {
            mo20279X0(i, 2);
            mo20277Z0(((AbstractC6994a) interfaceC7100r0).m20242s(interfaceC7038h1));
            interfaceC7038h1.mo19424b(interfaceC7100r0, this.f16743a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: K0 */
        public final void mo20284K0(InterfaceC7100r0 interfaceC7100r0) throws IOException {
            mo20277Z0(interfaceC7100r0.mo19378d());
            interfaceC7100r0.mo19376j(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: L0 */
        public final void mo20283L0(int i, InterfaceC7100r0 interfaceC7100r0) throws IOException {
            mo20279X0(1, 3);
            mo20278Y0(2, i);
            m20289e1(3, interfaceC7100r0);
            mo20279X0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: M0 */
        public final void mo20282M0(int i, AbstractC7039i abstractC7039i) throws IOException {
            mo20279X0(1, 3);
            mo20278Y0(2, i);
            mo20264p0(3, abstractC7039i);
            mo20279X0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: V0 */
        public final void mo20281V0(int i, String str) throws IOException {
            mo20279X0(i, 2);
            mo20280W0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: W0 */
        public final void mo20280W0(String str) throws IOException {
            int i = this.f16751g;
            try {
                int m20339Y = CodedOutputStream.m20339Y(str.length() * 3);
                int m20339Y2 = CodedOutputStream.m20339Y(str.length());
                if (m20339Y2 == m20339Y) {
                    int i2 = i + m20339Y2;
                    this.f16751g = i2;
                    int m19622i = C7110s1.m19622i(str, this.f16749e, i2, mo20288j0());
                    this.f16751g = i;
                    mo20277Z0((m19622i - i) - m20339Y2);
                    this.f16751g = m19622i;
                } else {
                    mo20277Z0(C7110s1.m19621j(str));
                    this.f16751g = C7110s1.m19622i(str, this.f16749e, this.f16751g, mo20288j0());
                }
            } catch (C7110s1.C7114d e) {
                this.f16751g = i;
                m20331e0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: X0 */
        public final void mo20279X0(int i, int i2) throws IOException {
            mo20277Z0(C7118t1.m19562c(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: Y0 */
        public final void mo20278Y0(int i, int i2) throws IOException {
            mo20279X0(i, 0);
            mo20277Z0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: Z0 */
        public final void mo20277Z0(int i) throws IOException {
            if (!CodedOutputStream.f16742d || C7014d.m20216c() || mo20288j0() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f16749e;
                        int i2 = this.f16751g;
                        this.f16751g = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16751g), Integer.valueOf(this.f16750f), 1), e);
                    }
                }
                byte[] bArr2 = this.f16749e;
                int i3 = this.f16751g;
                this.f16751g = i3 + 1;
                bArr2[i3] = (byte) i;
            } else if ((i & (-128)) == 0) {
                byte[] bArr3 = this.f16749e;
                int i4 = this.f16751g;
                this.f16751g = i4 + 1;
                C7102r1.m19692O(bArr3, i4, (byte) i);
            } else {
                byte[] bArr4 = this.f16749e;
                int i5 = this.f16751g;
                this.f16751g = i5 + 1;
                C7102r1.m19692O(bArr4, i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & (-128)) == 0) {
                    byte[] bArr5 = this.f16749e;
                    int i7 = this.f16751g;
                    this.f16751g = i7 + 1;
                    C7102r1.m19692O(bArr5, i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f16749e;
                int i8 = this.f16751g;
                this.f16751g = i8 + 1;
                C7102r1.m19692O(bArr6, i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & (-128)) == 0) {
                    byte[] bArr7 = this.f16749e;
                    int i10 = this.f16751g;
                    this.f16751g = i10 + 1;
                    C7102r1.m19692O(bArr7, i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f16749e;
                int i11 = this.f16751g;
                this.f16751g = i11 + 1;
                C7102r1.m19692O(bArr8, i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & (-128)) == 0) {
                    byte[] bArr9 = this.f16749e;
                    int i13 = this.f16751g;
                    this.f16751g = i13 + 1;
                    C7102r1.m19692O(bArr9, i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f16749e;
                int i14 = this.f16751g;
                this.f16751g = i14 + 1;
                C7102r1.m19692O(bArr10, i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f16749e;
                int i15 = this.f16751g;
                this.f16751g = i15 + 1;
                C7102r1.m19692O(bArr11, i15, (byte) (i12 >>> 7));
            }
        }

        @Override // com.google.protobuf.AbstractC7033h
        /* renamed from: a */
        public final void mo20113a(ByteBuffer byteBuffer) throws IOException {
            m20291c1(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: a1 */
        public final void mo20276a1(int i, long j) throws IOException {
            mo20279X0(i, 0);
            mo20275b1(j);
        }

        @Override // com.google.protobuf.AbstractC7033h
        /* renamed from: b */
        public final void mo20112b(byte[] bArr, int i, int i2) throws IOException {
            m20290d1(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: b1 */
        public final void mo20275b1(long j) throws IOException {
            if (CodedOutputStream.f16742d && mo20288j0() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f16749e;
                    int i = this.f16751g;
                    this.f16751g = i + 1;
                    C7102r1.m19692O(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f16749e;
                int i2 = this.f16751g;
                this.f16751g = i2 + 1;
                C7102r1.m19692O(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f16749e;
                    int i3 = this.f16751g;
                    this.f16751g = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16751g), Integer.valueOf(this.f16750f), 1), e);
                }
            }
            byte[] bArr4 = this.f16749e;
            int i4 = this.f16751g;
            this.f16751g = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        /* renamed from: c1 */
        public final void m20291c1(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f16749e, this.f16751g, remaining);
                this.f16751g += remaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16751g), Integer.valueOf(this.f16750f), Integer.valueOf(remaining)), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: d0 */
        public void mo20274d0() {
        }

        /* renamed from: d1 */
        public final void m20290d1(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f16749e, this.f16751g, i2);
                this.f16751g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16751g), Integer.valueOf(this.f16750f), Integer.valueOf(i2)), e);
            }
        }

        /* renamed from: e1 */
        public final void m20289e1(int i, InterfaceC7100r0 interfaceC7100r0) throws IOException {
            mo20279X0(i, 2);
            mo20284K0(interfaceC7100r0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: j0 */
        public final int mo20288j0() {
            return this.f16750f - this.f16751g;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: k0 */
        public final void mo20272k0(byte b) throws IOException {
            try {
                byte[] bArr = this.f16749e;
                int i = this.f16751g;
                this.f16751g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16751g), Integer.valueOf(this.f16750f), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: l0 */
        public final void mo20270l0(int i, boolean z) throws IOException {
            mo20279X0(i, 0);
            mo20272k0(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: o0 */
        public final void mo20266o0(byte[] bArr, int i, int i2) throws IOException {
            mo20277Z0(i2);
            m20290d1(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: p0 */
        public final void mo20264p0(int i, AbstractC7039i abstractC7039i) throws IOException {
            mo20279X0(i, 2);
            mo20263q0(abstractC7039i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: q0 */
        public final void mo20263q0(AbstractC7039i abstractC7039i) throws IOException {
            mo20277Z0(abstractC7039i.size());
            abstractC7039i.mo19317i0(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: v0 */
        public final void mo20262v0(int i, int i2) throws IOException {
            mo20279X0(i, 5);
            mo20261w0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: w0 */
        public final void mo20261w0(int i) throws IOException {
            try {
                byte[] bArr = this.f16749e;
                int i2 = this.f16751g;
                int i3 = i2 + 1;
                this.f16751g = i3;
                bArr[i2] = (byte) (i & 255);
                byte[] bArr2 = this.f16749e;
                int i4 = i3 + 1;
                this.f16751g = i4;
                bArr2[i3] = (byte) ((i >> 8) & 255);
                byte[] bArr3 = this.f16749e;
                int i5 = i4 + 1;
                this.f16751g = i5;
                bArr3[i4] = (byte) ((i >> 16) & 255);
                byte[] bArr4 = this.f16749e;
                this.f16751g = i5 + 1;
                bArr4[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16751g), Integer.valueOf(this.f16750f), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: x0 */
        public final void mo20260x0(int i, long j) throws IOException {
            mo20279X0(i, 1);
            mo20259y0(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: y0 */
        public final void mo20259y0(long j) throws IOException {
            try {
                byte[] bArr = this.f16749e;
                int i = this.f16751g;
                int i2 = i + 1;
                this.f16751g = i2;
                bArr[i] = (byte) (((int) j) & 255);
                byte[] bArr2 = this.f16749e;
                int i3 = i2 + 1;
                this.f16751g = i3;
                bArr2[i2] = (byte) (((int) (j >> 8)) & 255);
                byte[] bArr3 = this.f16749e;
                int i4 = i3 + 1;
                this.f16751g = i4;
                bArr3[i3] = (byte) (((int) (j >> 16)) & 255);
                byte[] bArr4 = this.f16749e;
                int i5 = i4 + 1;
                this.f16751g = i5;
                bArr4[i4] = (byte) (((int) (j >> 24)) & 255);
                byte[] bArr5 = this.f16749e;
                int i6 = i5 + 1;
                this.f16751g = i6;
                bArr5[i5] = (byte) (((int) (j >> 32)) & 255);
                byte[] bArr6 = this.f16749e;
                int i7 = i6 + 1;
                this.f16751g = i7;
                bArr6[i6] = (byte) (((int) (j >> 40)) & 255);
                byte[] bArr7 = this.f16749e;
                int i8 = i7 + 1;
                this.f16751g = i8;
                bArr7[i7] = (byte) (((int) (j >> 48)) & 255);
                byte[] bArr8 = this.f16749e;
                this.f16751g = i8 + 1;
                bArr8[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16751g), Integer.valueOf(this.f16750f), 1), e);
            }
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$d */
    /* loaded from: classes2.dex */
    private static final class C6993d extends AbstractC6991b {

        /* renamed from: i */
        private final OutputStream f16752i;

        C6993d(OutputStream outputStream, int i) {
            super(i);
            if (outputStream != null) {
                this.f16752i = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        /* renamed from: j1 */
        private void m20273j1() throws IOException {
            this.f16752i.write(this.f16745e, 0, this.f16747g);
            this.f16747g = 0;
        }

        /* renamed from: k1 */
        private void m20271k1(int i) throws IOException {
            if (this.f16746f - this.f16747g < i) {
                m20273j1();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: F0 */
        public void mo20287F0(int i, int i2) throws IOException {
            m20271k1(20);
            m20294g1(i, 0);
            m20295f1(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: G0 */
        public void mo20286G0(int i) throws IOException {
            if (i >= 0) {
                mo20277Z0(i);
            } else {
                mo20275b1(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: J0 */
        void mo20285J0(int i, InterfaceC7100r0 interfaceC7100r0, InterfaceC7038h1 interfaceC7038h1) throws IOException {
            mo20279X0(i, 2);
            m20265o1(interfaceC7100r0, interfaceC7038h1);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: K0 */
        public void mo20284K0(InterfaceC7100r0 interfaceC7100r0) throws IOException {
            mo20277Z0(interfaceC7100r0.mo19378d());
            interfaceC7100r0.mo19376j(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: L0 */
        public void mo20283L0(int i, InterfaceC7100r0 interfaceC7100r0) throws IOException {
            mo20279X0(1, 3);
            mo20278Y0(2, i);
            m20267n1(3, interfaceC7100r0);
            mo20279X0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: M0 */
        public void mo20282M0(int i, AbstractC7039i abstractC7039i) throws IOException {
            mo20279X0(1, 3);
            mo20278Y0(2, i);
            mo20264p0(3, abstractC7039i);
            mo20279X0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: V0 */
        public void mo20281V0(int i, String str) throws IOException {
            mo20279X0(i, 2);
            mo20280W0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: W0 */
        public void mo20280W0(String str) throws IOException {
            int m19621j;
            try {
                int length = str.length() * 3;
                int m20339Y = CodedOutputStream.m20339Y(length);
                int i = m20339Y + length;
                if (i > this.f16746f) {
                    byte[] bArr = new byte[length];
                    int m19622i = C7110s1.m19622i(str, bArr, 0, length);
                    mo20277Z0(m19622i);
                    mo20112b(bArr, 0, m19622i);
                    return;
                }
                if (i > this.f16746f - this.f16747g) {
                    m20273j1();
                }
                int m20339Y2 = CodedOutputStream.m20339Y(str.length());
                int i2 = this.f16747g;
                try {
                    try {
                        if (m20339Y2 == m20339Y) {
                            int i3 = i2 + m20339Y2;
                            this.f16747g = i3;
                            int m19622i2 = C7110s1.m19622i(str, this.f16745e, i3, this.f16746f - i3);
                            this.f16747g = i2;
                            m19621j = (m19622i2 - i2) - m20339Y2;
                            m20293h1(m19621j);
                            this.f16747g = m19622i2;
                        } else {
                            m19621j = C7110s1.m19621j(str);
                            m20293h1(m19621j);
                            this.f16747g = C7110s1.m19622i(str, this.f16745e, this.f16747g, m19621j);
                        }
                        this.f16748h += m19621j;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        throw new OutOfSpaceException(e);
                    }
                } catch (C7110s1.C7114d e2) {
                    this.f16748h -= this.f16747g - i2;
                    this.f16747g = i2;
                    throw e2;
                }
            } catch (C7110s1.C7114d e3) {
                m20331e0(str, e3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: X0 */
        public void mo20279X0(int i, int i2) throws IOException {
            mo20277Z0(C7118t1.m19562c(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: Y0 */
        public void mo20278Y0(int i, int i2) throws IOException {
            m20271k1(20);
            m20294g1(i, 0);
            m20293h1(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: Z0 */
        public void mo20277Z0(int i) throws IOException {
            m20271k1(5);
            m20293h1(i);
        }

        @Override // com.google.protobuf.AbstractC7033h
        /* renamed from: a */
        public void mo20113a(ByteBuffer byteBuffer) throws IOException {
            m20269l1(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: a1 */
        public void mo20276a1(int i, long j) throws IOException {
            m20271k1(20);
            m20294g1(i, 0);
            m20292i1(j);
        }

        @Override // com.google.protobuf.AbstractC7033h
        /* renamed from: b */
        public void mo20112b(byte[] bArr, int i, int i2) throws IOException {
            m20268m1(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: b1 */
        public void mo20275b1(long j) throws IOException {
            m20271k1(10);
            m20292i1(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: d0 */
        public void mo20274d0() throws IOException {
            if (this.f16747g > 0) {
                m20273j1();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: k0 */
        public void mo20272k0(byte b) throws IOException {
            if (this.f16747g == this.f16746f) {
                m20273j1();
            }
            m20298c1(b);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: l0 */
        public void mo20270l0(int i, boolean z) throws IOException {
            m20271k1(11);
            m20294g1(i, 0);
            m20298c1(z ? (byte) 1 : (byte) 0);
        }

        /* renamed from: l1 */
        public void m20269l1(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            int i = this.f16746f;
            int i2 = this.f16747g;
            if (i - i2 >= remaining) {
                byteBuffer.get(this.f16745e, i2, remaining);
                this.f16747g += remaining;
                this.f16748h += remaining;
                return;
            }
            int i3 = i - i2;
            byteBuffer.get(this.f16745e, i2, i3);
            int i4 = remaining - i3;
            this.f16747g = this.f16746f;
            this.f16748h += i3;
            m20273j1();
            while (true) {
                int i5 = this.f16746f;
                if (i4 > i5) {
                    byteBuffer.get(this.f16745e, 0, i5);
                    this.f16752i.write(this.f16745e, 0, this.f16746f);
                    int i6 = this.f16746f;
                    i4 -= i6;
                    this.f16748h += i6;
                } else {
                    byteBuffer.get(this.f16745e, 0, i4);
                    this.f16747g = i4;
                    this.f16748h += i4;
                    return;
                }
            }
        }

        /* renamed from: m1 */
        public void m20268m1(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f16746f;
            int i4 = this.f16747g;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.f16745e, i4, i2);
                this.f16747g += i2;
                this.f16748h += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.f16745e, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f16747g = this.f16746f;
            this.f16748h += i5;
            m20273j1();
            if (i7 <= this.f16746f) {
                System.arraycopy(bArr, i6, this.f16745e, 0, i7);
                this.f16747g = i7;
            } else {
                this.f16752i.write(bArr, i6, i7);
            }
            this.f16748h += i7;
        }

        /* renamed from: n1 */
        public void m20267n1(int i, InterfaceC7100r0 interfaceC7100r0) throws IOException {
            mo20279X0(i, 2);
            mo20284K0(interfaceC7100r0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: o0 */
        public void mo20266o0(byte[] bArr, int i, int i2) throws IOException {
            mo20277Z0(i2);
            m20268m1(bArr, i, i2);
        }

        /* renamed from: o1 */
        void m20265o1(InterfaceC7100r0 interfaceC7100r0, InterfaceC7038h1 interfaceC7038h1) throws IOException {
            mo20277Z0(((AbstractC6994a) interfaceC7100r0).m20242s(interfaceC7038h1));
            interfaceC7038h1.mo19424b(interfaceC7100r0, this.f16743a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: p0 */
        public void mo20264p0(int i, AbstractC7039i abstractC7039i) throws IOException {
            mo20279X0(i, 2);
            mo20263q0(abstractC7039i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: q0 */
        public void mo20263q0(AbstractC7039i abstractC7039i) throws IOException {
            mo20277Z0(abstractC7039i.size());
            abstractC7039i.mo19317i0(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: v0 */
        public void mo20262v0(int i, int i2) throws IOException {
            m20271k1(14);
            m20294g1(i, 5);
            m20297d1(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: w0 */
        public void mo20261w0(int i) throws IOException {
            m20271k1(4);
            m20297d1(i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: x0 */
        public void mo20260x0(int i, long j) throws IOException {
            m20271k1(18);
            m20294g1(i, 1);
            m20296e1(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: y0 */
        public void mo20259y0(long j) throws IOException {
            m20271k1(8);
            m20296e1(j);
        }
    }

    /* renamed from: A */
    public static int m20378A(int i, C7023e0 c7023e0) {
        return (m20341W(1) * 2) + m20340X(2, i) + m20376B(3, c7023e0);
    }

    /* renamed from: B */
    public static int m20376B(int i, C7023e0 c7023e0) {
        return m20341W(i) + m20374C(c7023e0);
    }

    /* renamed from: C */
    public static int m20374C(C7023e0 c7023e0) {
        return m20372D(c7023e0.m20166b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static int m20372D(int i) {
        return m20339Y(i) + i;
    }

    /* renamed from: E */
    public static int m20370E(int i, InterfaceC7100r0 interfaceC7100r0) {
        return (m20341W(1) * 2) + m20340X(2, i) + m20368F(3, interfaceC7100r0);
    }

    /* renamed from: F */
    public static int m20368F(int i, InterfaceC7100r0 interfaceC7100r0) {
        return m20341W(i) + m20366H(interfaceC7100r0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static int m20367G(int i, InterfaceC7100r0 interfaceC7100r0, InterfaceC7038h1 interfaceC7038h1) {
        return m20341W(i) + m20364I(interfaceC7100r0, interfaceC7038h1);
    }

    /* renamed from: H */
    public static int m20366H(InterfaceC7100r0 interfaceC7100r0) {
        return m20372D(interfaceC7100r0.mo19378d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static int m20364I(InterfaceC7100r0 interfaceC7100r0, InterfaceC7038h1 interfaceC7038h1) {
        return m20372D(((AbstractC6994a) interfaceC7100r0).m20242s(interfaceC7038h1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static int m20362J(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: K */
    public static int m20361K(int i, AbstractC7039i abstractC7039i) {
        return (m20341W(1) * 2) + m20340X(2, i) + m20326h(3, abstractC7039i);
    }

    @Deprecated
    /* renamed from: L */
    public static int m20360L(int i) {
        return m20339Y(i);
    }

    /* renamed from: M */
    public static int m20359M(int i, int i2) {
        return m20341W(i) + m20358N(i2);
    }

    /* renamed from: N */
    public static int m20358N(int i) {
        return 4;
    }

    /* renamed from: O */
    public static int m20356O(int i, long j) {
        return m20341W(i) + m20354P(j);
    }

    /* renamed from: P */
    public static int m20354P(long j) {
        return 8;
    }

    /* renamed from: Q */
    public static int m20352Q(int i, int i2) {
        return m20341W(i) + m20350R(i2);
    }

    /* renamed from: R */
    public static int m20350R(int i) {
        return m20339Y(m20336b0(i));
    }

    /* renamed from: S */
    public static int m20348S(int i, long j) {
        return m20341W(i) + m20346T(j);
    }

    /* renamed from: T */
    public static int m20346T(long j) {
        return m20337a0(m20334c0(j));
    }

    /* renamed from: U */
    public static int m20344U(int i, String str) {
        return m20341W(i) + m20342V(str);
    }

    /* renamed from: V */
    public static int m20342V(String str) {
        int length;
        try {
            length = C7110s1.m19621j(str);
        } catch (C7110s1.C7114d unused) {
            length = str.getBytes(C6997a0.f16756a).length;
        }
        return m20372D(length);
    }

    /* renamed from: W */
    public static int m20341W(int i) {
        return m20339Y(C7118t1.m19562c(i, 0));
    }

    /* renamed from: X */
    public static int m20340X(int i, int i2) {
        return m20341W(i) + m20339Y(i2);
    }

    /* renamed from: Y */
    public static int m20339Y(int i) {
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

    /* renamed from: Z */
    public static int m20338Z(int i, long j) {
        return m20341W(i) + m20337a0(j);
    }

    /* renamed from: a0 */
    public static int m20337a0(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* renamed from: b0 */
    public static int m20336b0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: c0 */
    public static long m20334c0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: e */
    public static int m20332e(int i, boolean z) {
        return m20341W(i) + m20330f(z);
    }

    /* renamed from: f */
    public static int m20330f(boolean z) {
        return 1;
    }

    /* renamed from: g */
    public static int m20328g(byte[] bArr) {
        return m20372D(bArr.length);
    }

    /* renamed from: g0 */
    public static CodedOutputStream m20327g0(OutputStream outputStream, int i) {
        return new C6993d(outputStream, i);
    }

    /* renamed from: h */
    public static int m20326h(int i, AbstractC7039i abstractC7039i) {
        return m20341W(i) + m20324i(abstractC7039i);
    }

    /* renamed from: h0 */
    public static CodedOutputStream m20325h0(byte[] bArr) {
        return m20323i0(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static int m20324i(AbstractC7039i abstractC7039i) {
        return m20372D(abstractC7039i.size());
    }

    /* renamed from: i0 */
    public static CodedOutputStream m20323i0(byte[] bArr, int i, int i2) {
        return new C6992c(bArr, i, i2);
    }

    /* renamed from: j */
    public static int m20322j(int i, double d) {
        return m20341W(i) + m20321k(d);
    }

    /* renamed from: k */
    public static int m20321k(double d) {
        return 8;
    }

    /* renamed from: l */
    public static int m20320l(int i, int i2) {
        return m20341W(i) + m20319m(i2);
    }

    /* renamed from: m */
    public static int m20319m(int i) {
        return m20302x(i);
    }

    /* renamed from: n */
    public static int m20317n(int i, int i2) {
        return m20341W(i) + m20315o(i2);
    }

    /* renamed from: o */
    public static int m20315o(int i) {
        return 4;
    }

    /* renamed from: p */
    public static int m20314p(int i, long j) {
        return m20341W(i) + m20313q(j);
    }

    /* renamed from: q */
    public static int m20313q(long j) {
        return 8;
    }

    /* renamed from: r */
    public static int m20312r(int i, float f) {
        return m20341W(i) + m20310s(f);
    }

    /* renamed from: s */
    public static int m20310s(float f) {
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: t */
    public static int m20308t(int i, InterfaceC7100r0 interfaceC7100r0, InterfaceC7038h1 interfaceC7038h1) {
        return (m20341W(i) * 2) + m20304v(interfaceC7100r0, interfaceC7038h1);
    }

    @Deprecated
    /* renamed from: u */
    public static int m20306u(InterfaceC7100r0 interfaceC7100r0) {
        return interfaceC7100r0.mo19378d();
    }

    @Deprecated
    /* renamed from: v */
    static int m20304v(InterfaceC7100r0 interfaceC7100r0, InterfaceC7038h1 interfaceC7038h1) {
        return ((AbstractC6994a) interfaceC7100r0).m20242s(interfaceC7038h1);
    }

    /* renamed from: w */
    public static int m20303w(int i, int i2) {
        return m20341W(i) + m20302x(i2);
    }

    /* renamed from: x */
    public static int m20302x(int i) {
        if (i >= 0) {
            return m20339Y(i);
        }
        return 10;
    }

    /* renamed from: y */
    public static int m20301y(int i, long j) {
        return m20341W(i) + m20300z(j);
    }

    /* renamed from: z */
    public static int m20300z(long j) {
        return m20337a0(j);
    }

    /* renamed from: A0 */
    public final void m20377A0(float f) throws IOException {
        mo20261w0(Float.floatToRawIntBits(f));
    }

    @Deprecated
    /* renamed from: B0 */
    public final void m20375B0(int i, InterfaceC7100r0 interfaceC7100r0) throws IOException {
        mo20279X0(i, 3);
        m20371D0(interfaceC7100r0);
        mo20279X0(i, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: C0 */
    public final void m20373C0(int i, InterfaceC7100r0 interfaceC7100r0, InterfaceC7038h1 interfaceC7038h1) throws IOException {
        mo20279X0(i, 3);
        m20369E0(interfaceC7100r0, interfaceC7038h1);
        mo20279X0(i, 4);
    }

    @Deprecated
    /* renamed from: D0 */
    public final void m20371D0(InterfaceC7100r0 interfaceC7100r0) throws IOException {
        interfaceC7100r0.mo19376j(this);
    }

    @Deprecated
    /* renamed from: E0 */
    final void m20369E0(InterfaceC7100r0 interfaceC7100r0, InterfaceC7038h1 interfaceC7038h1) throws IOException {
        interfaceC7038h1.mo19424b(interfaceC7100r0, this.f16743a);
    }

    /* renamed from: F0 */
    public abstract void mo20287F0(int i, int i2) throws IOException;

    /* renamed from: G0 */
    public abstract void mo20286G0(int i) throws IOException;

    /* renamed from: H0 */
    public final void m20365H0(int i, long j) throws IOException {
        mo20276a1(i, j);
    }

    /* renamed from: I0 */
    public final void m20363I0(long j) throws IOException {
        mo20275b1(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0 */
    public abstract void mo20285J0(int i, InterfaceC7100r0 interfaceC7100r0, InterfaceC7038h1 interfaceC7038h1) throws IOException;

    /* renamed from: K0 */
    public abstract void mo20284K0(InterfaceC7100r0 interfaceC7100r0) throws IOException;

    /* renamed from: L0 */
    public abstract void mo20283L0(int i, InterfaceC7100r0 interfaceC7100r0) throws IOException;

    /* renamed from: M0 */
    public abstract void mo20282M0(int i, AbstractC7039i abstractC7039i) throws IOException;

    /* renamed from: N0 */
    public final void m20357N0(int i, int i2) throws IOException {
        mo20262v0(i, i2);
    }

    /* renamed from: O0 */
    public final void m20355O0(int i) throws IOException {
        mo20261w0(i);
    }

    /* renamed from: P0 */
    public final void m20353P0(int i, long j) throws IOException {
        mo20260x0(i, j);
    }

    /* renamed from: Q0 */
    public final void m20351Q0(long j) throws IOException {
        mo20259y0(j);
    }

    /* renamed from: R0 */
    public final void m20349R0(int i, int i2) throws IOException {
        mo20278Y0(i, m20336b0(i2));
    }

    /* renamed from: S0 */
    public final void m20347S0(int i) throws IOException {
        mo20277Z0(m20336b0(i));
    }

    /* renamed from: T0 */
    public final void m20345T0(int i, long j) throws IOException {
        mo20276a1(i, m20334c0(j));
    }

    /* renamed from: U0 */
    public final void m20343U0(long j) throws IOException {
        mo20275b1(m20334c0(j));
    }

    /* renamed from: V0 */
    public abstract void mo20281V0(int i, String str) throws IOException;

    /* renamed from: W0 */
    public abstract void mo20280W0(String str) throws IOException;

    /* renamed from: X0 */
    public abstract void mo20279X0(int i, int i2) throws IOException;

    /* renamed from: Y0 */
    public abstract void mo20278Y0(int i, int i2) throws IOException;

    /* renamed from: Z0 */
    public abstract void mo20277Z0(int i) throws IOException;

    /* renamed from: a1 */
    public abstract void mo20276a1(int i, long j) throws IOException;

    /* renamed from: b1 */
    public abstract void mo20275b1(long j) throws IOException;

    /* renamed from: d */
    public final void m20333d() {
        if (mo20288j0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: d0 */
    public abstract void mo20274d0() throws IOException;

    /* renamed from: e0 */
    final void m20331e0(String str, C7110s1.C7114d c7114d) throws IOException {
        f16741c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c7114d);
        byte[] bytes = str.getBytes(C6997a0.f16756a);
        try {
            mo20277Z0(bytes.length);
            mo20112b(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public boolean m20329f0() {
        return this.f16744b;
    }

    /* renamed from: j0 */
    public abstract int mo20288j0();

    /* renamed from: k0 */
    public abstract void mo20272k0(byte b) throws IOException;

    /* renamed from: l0 */
    public abstract void mo20270l0(int i, boolean z) throws IOException;

    /* renamed from: m0 */
    public final void m20318m0(boolean z) throws IOException {
        mo20272k0(z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: n0 */
    public final void m20316n0(byte[] bArr) throws IOException {
        mo20266o0(bArr, 0, bArr.length);
    }

    /* renamed from: o0 */
    abstract void mo20266o0(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: p0 */
    public abstract void mo20264p0(int i, AbstractC7039i abstractC7039i) throws IOException;

    /* renamed from: q0 */
    public abstract void mo20263q0(AbstractC7039i abstractC7039i) throws IOException;

    /* renamed from: r0 */
    public final void m20311r0(int i, double d) throws IOException {
        mo20260x0(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: s0 */
    public final void m20309s0(double d) throws IOException {
        mo20259y0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: t0 */
    public final void m20307t0(int i, int i2) throws IOException {
        mo20287F0(i, i2);
    }

    /* renamed from: u0 */
    public final void m20305u0(int i) throws IOException {
        mo20286G0(i);
    }

    /* renamed from: v0 */
    public abstract void mo20262v0(int i, int i2) throws IOException;

    /* renamed from: w0 */
    public abstract void mo20261w0(int i) throws IOException;

    /* renamed from: x0 */
    public abstract void mo20260x0(int i, long j) throws IOException;

    /* renamed from: y0 */
    public abstract void mo20259y0(long j) throws IOException;

    /* renamed from: z0 */
    public final void m20299z0(int i, float f) throws IOException {
        mo20262v0(i, Float.floatToRawIntBits(f));
    }

    private CodedOutputStream() {
    }
}
