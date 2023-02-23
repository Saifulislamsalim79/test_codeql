package io.grpc.p384h1;

import com.google.common.base.C5042j;
import io.grpc.AbstractC10040q0;
import io.grpc.AbstractC9524h;
import io.grpc.C10060t0;
import io.grpc.C9502d;
/* compiled from: ForwardingManagedChannel.java */
/* renamed from: io.grpc.h1.m0 */
/* loaded from: classes2.dex */
abstract class AbstractC9712m0 extends AbstractC10040q0 {

    /* renamed from: a */
    private final AbstractC10040q0 f22795a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9712m0(AbstractC10040q0 abstractC10040q0) {
        this.f22795a = abstractC10040q0;
    }

    @Override // io.grpc.AbstractC9508e
    /* renamed from: a */
    public String mo13366a() {
        return this.f22795a.mo13366a();
    }

    @Override // io.grpc.AbstractC9508e
    /* renamed from: h */
    public <RequestT, ResponseT> AbstractC9524h<RequestT, ResponseT> mo13365h(C10060t0<RequestT, ResponseT> c10060t0, C9502d c9502d) {
        return this.f22795a.mo13365h(c10060t0, c9502d);
    }

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25808d("delegate", this.f22795a);
        return m25812c.toString();
    }
}
