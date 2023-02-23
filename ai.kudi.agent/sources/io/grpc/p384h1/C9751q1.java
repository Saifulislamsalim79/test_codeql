package io.grpc.p384h1;

import com.google.common.base.C5042j;
import io.grpc.AbstractC10040q0;
import io.grpc.AbstractC9524h;
import io.grpc.C10060t0;
import io.grpc.C9502d;
import io.grpc.C9526h0;
import io.grpc.InterfaceC9522g0;
import io.grpc.p384h1.C9734p;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
/* compiled from: OobChannel.java */
/* renamed from: io.grpc.h1.q1 */
/* loaded from: classes2.dex */
final class C9751q1 extends AbstractC10040q0 implements InterfaceC9522g0<Object> {

    /* renamed from: a */
    private C9814y0 f22890a;

    /* renamed from: b */
    private final C9526h0 f22891b;

    /* renamed from: c */
    private final String f22892c;

    /* renamed from: d */
    private final Executor f22893d;

    /* renamed from: e */
    private final ScheduledExecutorService f22894e;

    /* renamed from: f */
    private final C9710m f22895f;

    /* renamed from: g */
    private final C9734p.InterfaceC9743e f22896g;

    static {
        Logger.getLogger(C9751q1.class.getName());
    }

    @Override // io.grpc.AbstractC9508e
    /* renamed from: a */
    public String mo13366a() {
        return this.f22892c;
    }

    @Override // io.grpc.InterfaceC10006l0
    /* renamed from: f */
    public C9526h0 mo13324f() {
        return this.f22891b;
    }

    @Override // io.grpc.AbstractC9508e
    /* renamed from: h */
    public <RequestT, ResponseT> AbstractC9524h<RequestT, ResponseT> mo13365h(C10060t0<RequestT, ResponseT> c10060t0, C9502d c9502d) {
        return new C9734p(c10060t0, c9502d.m14562e() == null ? this.f22893d : c9502d.m14562e(), c9502d, this.f22896g, this.f22894e, this.f22895f, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C9814y0 m14068i() {
        return this.f22890a;
    }

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25809c("logId", this.f22891b.m14524d());
        m25812c.m25808d("authority", this.f22892c);
        return m25812c.toString();
    }
}
