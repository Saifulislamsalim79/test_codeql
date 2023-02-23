package io.grpc.p384h1;

import com.google.common.base.C5046k;
import com.google.common.base.C5051n;
import io.grpc.AbstractC10020n0;
import io.grpc.C10049s0;
import io.grpc.C10060t0;
import io.grpc.C9502d;
/* compiled from: PickSubchannelArgsImpl.java */
/* renamed from: io.grpc.h1.t1 */
/* loaded from: classes2.dex */
public final class C9783t1 extends AbstractC10020n0.AbstractC10027f {

    /* renamed from: a */
    private final C9502d f22987a;

    /* renamed from: b */
    private final C10049s0 f22988b;

    /* renamed from: c */
    private final C10060t0<?, ?> f22989c;

    public C9783t1(C10060t0<?, ?> c10060t0, C10049s0 c10049s0, C9502d c9502d) {
        C5051n.m25779o(c10060t0, "method");
        this.f22989c = c10060t0;
        C5051n.m25779o(c10049s0, "headers");
        this.f22988b = c10049s0;
        C5051n.m25779o(c9502d, "callOptions");
        this.f22987a = c9502d;
    }

    @Override // io.grpc.AbstractC10020n0.AbstractC10027f
    /* renamed from: a */
    public C9502d mo13279a() {
        return this.f22987a;
    }

    @Override // io.grpc.AbstractC10020n0.AbstractC10027f
    /* renamed from: b */
    public C10049s0 mo13278b() {
        return this.f22988b;
    }

    @Override // io.grpc.AbstractC10020n0.AbstractC10027f
    /* renamed from: c */
    public C10060t0<?, ?> mo13277c() {
        return this.f22989c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9783t1.class != obj.getClass()) {
            return false;
        }
        C9783t1 c9783t1 = (C9783t1) obj;
        return C5046k.m25800a(this.f22987a, c9783t1.f22987a) && C5046k.m25800a(this.f22988b, c9783t1.f22988b) && C5046k.m25800a(this.f22989c, c9783t1.f22989c);
    }

    public int hashCode() {
        return C5046k.m25799b(this.f22987a, this.f22988b, this.f22989c);
    }

    public final String toString() {
        return "[method=" + this.f22989c + " headers=" + this.f22988b + " callOptions=" + this.f22987a + "]";
    }
}
