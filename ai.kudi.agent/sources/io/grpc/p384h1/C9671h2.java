package io.grpc.p384h1;

import io.grpc.p384h1.C9702l1;
import io.grpc.p384h1.InterfaceC9695k2;
import java.io.Closeable;
/* compiled from: SquelchLateMessagesAvailableDeframerListener.java */
/* renamed from: io.grpc.h1.h2 */
/* loaded from: classes2.dex */
final class C9671h2 extends AbstractC9701l0 {

    /* renamed from: a */
    private final C9702l1.InterfaceC9704b f22714a;

    /* renamed from: b */
    private boolean f22715b;

    public C9671h2(C9702l1.InterfaceC9704b interfaceC9704b) {
        this.f22714a = interfaceC9704b;
    }

    @Override // io.grpc.p384h1.AbstractC9701l0, io.grpc.p384h1.C9702l1.InterfaceC9704b
    /* renamed from: a */
    public void mo14161a(InterfaceC9695k2.InterfaceC9696a interfaceC9696a) {
        if (this.f22715b) {
            if (interfaceC9696a instanceof Closeable) {
                C9755r0.m14063e((Closeable) interfaceC9696a);
                return;
            }
            return;
        }
        super.mo14161a(interfaceC9696a);
    }

    @Override // io.grpc.p384h1.AbstractC9701l0, io.grpc.p384h1.C9702l1.InterfaceC9704b
    /* renamed from: b */
    public void mo13677b(boolean z) {
        this.f22715b = true;
        super.mo13677b(z);
    }

    @Override // io.grpc.p384h1.AbstractC9701l0, io.grpc.p384h1.C9702l1.InterfaceC9704b
    /* renamed from: d */
    public void mo13673d(Throwable th) {
        this.f22715b = true;
        super.mo13673d(th);
    }

    @Override // io.grpc.p384h1.AbstractC9701l0
    /* renamed from: e */
    protected C9702l1.InterfaceC9704b mo14173e() {
        return this.f22714a;
    }
}
