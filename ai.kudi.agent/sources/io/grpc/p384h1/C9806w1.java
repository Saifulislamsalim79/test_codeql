package io.grpc.p384h1;

import com.google.common.base.C5051n;
import io.grpc.InterfaceC10017m0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
/* compiled from: ReadableBuffers.java */
/* renamed from: io.grpc.h1.w1 */
/* loaded from: classes2.dex */
public final class C9806w1 {

    /* renamed from: a */
    private static final InterfaceC9802v1 f23027a = new C9809c(new byte[0]);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReadableBuffers.java */
    /* renamed from: io.grpc.h1.w1$a */
    /* loaded from: classes2.dex */
    public class C9807a extends AbstractC9728o0 {
        C9807a(InterfaceC9802v1 interfaceC9802v1) {
            super(interfaceC9802v1);
        }

        @Override // io.grpc.p384h1.InterfaceC9802v1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* compiled from: ReadableBuffers.java */
    /* renamed from: io.grpc.h1.w1$c */
    /* loaded from: classes2.dex */
    private static class C9809c extends AbstractC9564c {

        /* renamed from: c */
        int f23029c;

        /* renamed from: d */
        final int f23030d;

        /* renamed from: e */
        final byte[] f23031e;

        /* renamed from: f */
        int f23032f;

        C9809c(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // io.grpc.p384h1.InterfaceC9802v1
        /* renamed from: N0 */
        public void mo13569N0(OutputStream outputStream, int i) throws IOException {
            m14454c(i);
            outputStream.write(this.f23031e, this.f23029c, i);
            this.f23029c += i;
        }

        @Override // io.grpc.p384h1.InterfaceC9802v1
        /* renamed from: Y0 */
        public void mo13568Y0(ByteBuffer byteBuffer) {
            C5051n.m25779o(byteBuffer, "dest");
            int remaining = byteBuffer.remaining();
            m14454c(remaining);
            byteBuffer.put(this.f23031e, this.f23029c, remaining);
            this.f23029c += remaining;
        }

        @Override // io.grpc.p384h1.InterfaceC9802v1
        /* renamed from: g */
        public C9809c mo13570M(int i) {
            m14454c(i);
            int i2 = this.f23029c;
            this.f23029c = i2 + i;
            return new C9809c(this.f23031e, i2, i);
        }

        @Override // io.grpc.p384h1.InterfaceC9802v1
        /* renamed from: h */
        public int mo13566h() {
            return this.f23030d - this.f23029c;
        }

        @Override // io.grpc.p384h1.AbstractC9564c, io.grpc.p384h1.InterfaceC9802v1
        public boolean markSupported() {
            return true;
        }

        @Override // io.grpc.p384h1.InterfaceC9802v1
        /* renamed from: n0 */
        public void mo13565n0(byte[] bArr, int i, int i2) {
            System.arraycopy(this.f23031e, this.f23029c, bArr, i, i2);
            this.f23029c += i2;
        }

        @Override // io.grpc.p384h1.InterfaceC9802v1
        public int readUnsignedByte() {
            m14454c(1);
            byte[] bArr = this.f23031e;
            int i = this.f23029c;
            this.f23029c = i + 1;
            return bArr[i] & 255;
        }

        @Override // io.grpc.p384h1.AbstractC9564c, io.grpc.p384h1.InterfaceC9802v1
        public void reset() {
            int i = this.f23032f;
            if (i != -1) {
                this.f23029c = i;
                return;
            }
            throw new InvalidMarkException();
        }

        @Override // io.grpc.p384h1.InterfaceC9802v1
        public void skipBytes(int i) {
            m14454c(i);
            this.f23029c += i;
        }

        @Override // io.grpc.p384h1.AbstractC9564c, io.grpc.p384h1.InterfaceC9802v1
        /* renamed from: v0 */
        public void mo13940v0() {
            this.f23032f = this.f23029c;
        }

        C9809c(byte[] bArr, int i, int i2) {
            this.f23032f = -1;
            C5051n.m25789e(i >= 0, "offset must be >= 0");
            C5051n.m25789e(i2 >= 0, "length must be >= 0");
            int i3 = i2 + i;
            C5051n.m25789e(i3 <= bArr.length, "offset + length exceeds array boundary");
            C5051n.m25779o(bArr, "bytes");
            this.f23031e = bArr;
            this.f23029c = i;
            this.f23030d = i3;
        }
    }

    /* renamed from: a */
    public static InterfaceC9802v1 m13947a() {
        return f23027a;
    }

    /* renamed from: b */
    public static InterfaceC9802v1 m13946b(InterfaceC9802v1 interfaceC9802v1) {
        return new C9807a(interfaceC9802v1);
    }

    /* renamed from: c */
    public static InputStream m13945c(InterfaceC9802v1 interfaceC9802v1, boolean z) {
        if (!z) {
            interfaceC9802v1 = m13946b(interfaceC9802v1);
        }
        return new C9808b(interfaceC9802v1);
    }

    /* renamed from: d */
    public static byte[] m13944d(InterfaceC9802v1 interfaceC9802v1) {
        C5051n.m25779o(interfaceC9802v1, "buffer");
        int mo13566h = interfaceC9802v1.mo13566h();
        byte[] bArr = new byte[mo13566h];
        interfaceC9802v1.mo13565n0(bArr, 0, mo13566h);
        return bArr;
    }

    /* renamed from: e */
    public static String m13943e(InterfaceC9802v1 interfaceC9802v1, Charset charset) {
        C5051n.m25779o(charset, "charset");
        return new String(m13944d(interfaceC9802v1), charset);
    }

    /* renamed from: f */
    public static InterfaceC9802v1 m13942f(byte[] bArr, int i, int i2) {
        return new C9809c(bArr, i, i2);
    }

    /* compiled from: ReadableBuffers.java */
    /* renamed from: io.grpc.h1.w1$b */
    /* loaded from: classes2.dex */
    private static final class C9808b extends InputStream implements InterfaceC10017m0 {

        /* renamed from: c */
        private InterfaceC9802v1 f23028c;

        public C9808b(InterfaceC9802v1 interfaceC9802v1) {
            C5051n.m25779o(interfaceC9802v1, "buffer");
            this.f23028c = interfaceC9802v1;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f23028c.mo13566h();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f23028c.close();
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.f23028c.mo13940v0();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.f23028c.markSupported();
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f23028c.mo13566h() == 0) {
                return -1;
            }
            return this.f23028c.readUnsignedByte();
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            this.f23028c.reset();
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            int min = (int) Math.min(this.f23028c.mo13566h(), j);
            this.f23028c.skipBytes(min);
            return min;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (this.f23028c.mo13566h() == 0) {
                return -1;
            }
            int min = Math.min(this.f23028c.mo13566h(), i2);
            this.f23028c.mo13565n0(bArr, i, min);
            return min;
        }
    }
}
