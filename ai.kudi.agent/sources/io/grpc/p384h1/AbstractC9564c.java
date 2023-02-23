package io.grpc.p384h1;
/* compiled from: AbstractReadableBuffer.java */
/* renamed from: io.grpc.h1.c */
/* loaded from: classes2.dex */
public abstract class AbstractC9564c implements InterfaceC9802v1 {
    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m14454c(int i) {
        if (mo13566h() < i) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    public boolean markSupported() {
        return false;
    }

    public final int readInt() {
        m14454c(4);
        return (readUnsignedByte() << 24) | (readUnsignedByte() << 16) | (readUnsignedByte() << 8) | readUnsignedByte();
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    /* renamed from: v0 */
    public void mo13940v0() {
    }
}
