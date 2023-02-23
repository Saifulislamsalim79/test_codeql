package io.grpc.p385i1;

import io.grpc.p384h1.AbstractC9564c;
import io.grpc.p384h1.InterfaceC9802v1;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p576m.C14342c;
/* compiled from: OkHttpReadableBuffer.java */
/* renamed from: io.grpc.i1.k */
/* loaded from: classes2.dex */
class C9933k extends AbstractC9564c {

    /* renamed from: c */
    private final C14342c f23434c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9933k(C14342c c14342c) {
        this.f23434c = c14342c;
    }

    /* renamed from: g */
    private void m13567g() throws EOFException {
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    /* renamed from: M */
    public InterfaceC9802v1 mo13570M(int i) {
        C14342c c14342c = new C14342c();
        c14342c.mo1444r0(this.f23434c, i);
        return new C9933k(c14342c);
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    /* renamed from: N0 */
    public void mo13569N0(OutputStream outputStream, int i) throws IOException {
        this.f23434c.m2051g1(outputStream, i);
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    /* renamed from: Y0 */
    public void mo13568Y0(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.p384h1.AbstractC9564c, io.grpc.p384h1.InterfaceC9802v1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f23434c.m2058c();
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    /* renamed from: h */
    public int mo13566h() {
        return (int) this.f23434c.m2072F0();
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    /* renamed from: n0 */
    public void mo13565n0(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int m2049i0 = this.f23434c.m2049i0(bArr, i, i2);
            if (m2049i0 == -1) {
                throw new IndexOutOfBoundsException("EOF trying to read " + i2 + " bytes");
            }
            i2 -= m2049i0;
            i += m2049i0;
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    public int readUnsignedByte() {
        try {
            m13567g();
            return this.f23434c.readByte() & 255;
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    public void skipBytes(int i) {
        try {
            this.f23434c.mo1994a(i);
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }
}
