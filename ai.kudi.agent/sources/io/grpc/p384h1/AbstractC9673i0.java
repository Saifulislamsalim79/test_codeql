package io.grpc.p384h1;

import com.google.common.base.C5042j;
import io.grpc.C10049s0;
import io.grpc.C9497c1;
import io.grpc.p384h1.InterfaceC9695k2;
import io.grpc.p384h1.InterfaceC9753r;
/* compiled from: ForwardingClientStreamListener.java */
/* renamed from: io.grpc.h1.i0 */
/* loaded from: classes2.dex */
abstract class AbstractC9673i0 implements InterfaceC9753r {
    @Override // io.grpc.p384h1.InterfaceC9695k2
    /* renamed from: a */
    public void mo13769a(InterfaceC9695k2.InterfaceC9696a interfaceC9696a) {
        mo13885e().mo13769a(interfaceC9696a);
    }

    @Override // io.grpc.p384h1.InterfaceC9753r
    /* renamed from: b */
    public void mo13768b(C10049s0 c10049s0) {
        mo13885e().mo13768b(c10049s0);
    }

    @Override // io.grpc.p384h1.InterfaceC9695k2
    /* renamed from: c */
    public void mo13767c() {
        mo13885e().mo13767c();
    }

    @Override // io.grpc.p384h1.InterfaceC9753r
    /* renamed from: d */
    public void mo13766d(C9497c1 c9497c1, InterfaceC9753r.EnumC9754a enumC9754a, C10049s0 c10049s0) {
        mo13885e().mo13766d(c9497c1, enumC9754a, c10049s0);
    }

    /* renamed from: e */
    protected abstract InterfaceC9753r mo13885e();

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25808d("delegate", mo13885e());
        return m25812c.toString();
    }
}
