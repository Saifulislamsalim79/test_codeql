package io.grpc.p388j1.p389a;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InterfaceC7007a1;
import com.google.protobuf.InterfaceC7100r0;
import io.grpc.InterfaceC10017m0;
import io.grpc.InterfaceC10088x;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProtoInputStream.java */
/* renamed from: io.grpc.j1.a.a */
/* loaded from: classes2.dex */
public final class C9982a extends InputStream implements InterfaceC10088x, InterfaceC10017m0 {

    /* renamed from: c */
    private InterfaceC7100r0 f23692c;

    /* renamed from: d */
    private final InterfaceC7007a1<?> f23693d;

    /* renamed from: e */
    private ByteArrayInputStream f23694e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9982a(InterfaceC7100r0 interfaceC7100r0, InterfaceC7007a1<?> interfaceC7007a1) {
        this.f23692c = interfaceC7100r0;
        this.f23693d = interfaceC7007a1;
    }

    @Override // java.io.InputStream
    public int available() {
        InterfaceC7100r0 interfaceC7100r0 = this.f23692c;
        if (interfaceC7100r0 != null) {
            return interfaceC7100r0.mo19378d();
        }
        ByteArrayInputStream byteArrayInputStream = this.f23694e;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // io.grpc.InterfaceC10088x
    /* renamed from: c */
    public int mo13082c(OutputStream outputStream) throws IOException {
        InterfaceC7100r0 interfaceC7100r0 = this.f23692c;
        if (interfaceC7100r0 != null) {
            int mo19378d = interfaceC7100r0.mo19378d();
            this.f23692c.mo19710c(outputStream);
            this.f23692c = null;
            return mo19378d;
        }
        ByteArrayInputStream byteArrayInputStream = this.f23694e;
        if (byteArrayInputStream != null) {
            int m13375a = (int) C9983b.m13375a(byteArrayInputStream, outputStream);
            this.f23694e = null;
            return m13375a;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public InterfaceC7100r0 m13377g() {
        InterfaceC7100r0 interfaceC7100r0 = this.f23692c;
        if (interfaceC7100r0 != null) {
            return interfaceC7100r0;
        }
        throw new IllegalStateException("message not available");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public InterfaceC7007a1<?> m13376m() {
        return this.f23693d;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f23692c != null) {
            this.f23694e = new ByteArrayInputStream(this.f23692c.mo19709e());
            this.f23692c = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f23694e;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        InterfaceC7100r0 interfaceC7100r0 = this.f23692c;
        if (interfaceC7100r0 != null) {
            int mo19378d = interfaceC7100r0.mo19378d();
            if (mo19378d == 0) {
                this.f23692c = null;
                this.f23694e = null;
                return -1;
            } else if (i2 >= mo19378d) {
                CodedOutputStream m20323i0 = CodedOutputStream.m20323i0(bArr, i, mo19378d);
                this.f23692c.mo19376j(m20323i0);
                m20323i0.mo20274d0();
                m20323i0.m20333d();
                this.f23692c = null;
                this.f23694e = null;
                return mo19378d;
            } else {
                this.f23694e = new ByteArrayInputStream(this.f23692c.mo19709e());
                this.f23692c = null;
            }
        }
        ByteArrayInputStream byteArrayInputStream = this.f23694e;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
