package io.grpc.p384h1;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
/* compiled from: ReadableBuffer.java */
/* renamed from: io.grpc.h1.v1 */
/* loaded from: classes2.dex */
public interface InterfaceC9802v1 extends Closeable {
    /* renamed from: M */
    InterfaceC9802v1 mo13570M(int i);

    /* renamed from: N0 */
    void mo13569N0(OutputStream outputStream, int i) throws IOException;

    /* renamed from: Y0 */
    void mo13568Y0(ByteBuffer byteBuffer);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    /* renamed from: h */
    int mo13566h();

    boolean markSupported();

    /* renamed from: n0 */
    void mo13565n0(byte[] bArr, int i, int i2);

    int readUnsignedByte();

    void reset();

    void skipBytes(int i);

    /* renamed from: v0 */
    void mo13940v0();
}
