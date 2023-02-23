package io.grpc.p384h1;

import com.google.common.base.C5042j;
import io.grpc.AbstractC10001l;
import io.grpc.C10049s0;
import io.grpc.C10060t0;
import io.grpc.C9497c1;
import io.grpc.C9502d;
import io.grpc.C9526h0;
import io.grpc.p384h1.InterfaceC9693k1;
import io.grpc.p384h1.InterfaceC9773s;
import java.util.concurrent.Executor;
/* compiled from: ForwardingConnectionClientTransport.java */
/* renamed from: io.grpc.h1.k0 */
/* loaded from: classes2.dex */
abstract class AbstractC9692k0 implements InterfaceC9798v {
    /* renamed from: a */
    protected abstract InterfaceC9798v mo13888a();

    @Override // io.grpc.p384h1.InterfaceC9773s
    /* renamed from: b */
    public InterfaceC9749q mo13637b(C10060t0<?, ?> c10060t0, C10049s0 c10049s0, C9502d c9502d, AbstractC10001l[] abstractC10001lArr) {
        return mo13888a().mo13637b(c10060t0, c10049s0, c9502d, abstractC10001lArr);
    }

    @Override // io.grpc.p384h1.InterfaceC9693k1
    /* renamed from: c */
    public void mo13635c(C9497c1 c9497c1) {
        mo13888a().mo13635c(c9497c1);
    }

    @Override // io.grpc.p384h1.InterfaceC9693k1
    /* renamed from: d */
    public void mo13633d(C9497c1 c9497c1) {
        mo13888a().mo13633d(c9497c1);
    }

    @Override // io.grpc.p384h1.InterfaceC9693k1
    /* renamed from: e */
    public Runnable mo13631e(InterfaceC9693k1.InterfaceC9694a interfaceC9694a) {
        return mo13888a().mo13631e(interfaceC9694a);
    }

    @Override // io.grpc.InterfaceC10006l0
    /* renamed from: f */
    public C9526h0 mo13324f() {
        return mo13888a().mo13324f();
    }

    @Override // io.grpc.p384h1.InterfaceC9773s
    /* renamed from: g */
    public void mo13628g(InterfaceC9773s.InterfaceC9774a interfaceC9774a, Executor executor) {
        mo13888a().mo13628g(interfaceC9774a, executor);
    }

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25808d("delegate", mo13888a());
        return m25812c.toString();
    }
}
