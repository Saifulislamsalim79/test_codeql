package io.grpc.p384h1;

import com.google.common.base.C5042j;
import com.google.common.base.C5051n;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
/* compiled from: ForwardingReadableBuffer.java */
/* renamed from: io.grpc.h1.o0 */
/* loaded from: classes2.dex */
public abstract class AbstractC9728o0 implements InterfaceC9802v1 {

    /* renamed from: c */
    private final InterfaceC9802v1 f22833c;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9728o0(InterfaceC9802v1 interfaceC9802v1) {
        C5051n.m25779o(interfaceC9802v1, "buf");
        this.f22833c = interfaceC9802v1;
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    /* renamed from: M */
    public InterfaceC9802v1 mo13570M(int i) {
        return this.f22833c.mo13570M(i);
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    /* renamed from: N0 */
    public void mo13569N0(OutputStream outputStream, int i) throws IOException {
        this.f22833c.mo13569N0(outputStream, i);
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    /* renamed from: Y0 */
    public void mo13568Y0(ByteBuffer byteBuffer) {
        this.f22833c.mo13568Y0(byteBuffer);
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    /* renamed from: h */
    public int mo13566h() {
        return this.f22833c.mo13566h();
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    public boolean markSupported() {
        return this.f22833c.markSupported();
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    /* renamed from: n0 */
    public void mo13565n0(byte[] bArr, int i, int i2) {
        this.f22833c.mo13565n0(bArr, i, i2);
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    public int readUnsignedByte() {
        return this.f22833c.readUnsignedByte();
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    public void reset() {
        this.f22833c.reset();
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    public void skipBytes(int i) {
        this.f22833c.skipBytes(i);
    }

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25808d("delegate", this.f22833c);
        return m25812c.toString();
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    /* renamed from: v0 */
    public void mo13940v0() {
        this.f22833c.mo13940v0();
    }
}
