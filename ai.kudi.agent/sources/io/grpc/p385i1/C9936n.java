package io.grpc.p385i1;

import io.grpc.p384h1.InterfaceC9748p2;
import p576m.C14342c;
/* compiled from: OkHttpWritableBuffer.java */
/* renamed from: io.grpc.i1.n */
/* loaded from: classes2.dex */
class C9936n implements InterfaceC9748p2 {

    /* renamed from: a */
    private final C14342c f23436a;

    /* renamed from: b */
    private int f23437b;

    /* renamed from: c */
    private int f23438c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9936n(C14342c c14342c, int i) {
        this.f23436a = c14342c;
        this.f23437b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C14342c m13559a() {
        return this.f23436a;
    }

    @Override // io.grpc.p384h1.InterfaceC9748p2
    /* renamed from: b */
    public void mo13558b(byte[] bArr, int i, int i2) {
        this.f23436a.m2062X0(bArr, i, i2);
        this.f23437b -= i2;
        this.f23438c += i2;
    }

    @Override // io.grpc.p384h1.InterfaceC9748p2
    /* renamed from: c */
    public int mo13557c() {
        return this.f23437b;
    }

    @Override // io.grpc.p384h1.InterfaceC9748p2
    /* renamed from: d */
    public void mo13556d(byte b) {
        this.f23436a.m2061Z0(b);
        this.f23437b--;
        this.f23438c++;
    }

    @Override // io.grpc.p384h1.InterfaceC9748p2
    /* renamed from: h */
    public int mo13555h() {
        return this.f23438c;
    }

    @Override // io.grpc.p384h1.InterfaceC9748p2
    public void release() {
    }
}
