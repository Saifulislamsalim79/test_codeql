package io.grpc.p391l1;

import io.grpc.AbstractC10020n0;
import io.grpc.AbstractC10034o0;
import io.grpc.AbstractC10069u0;
import java.util.Map;
/* compiled from: SecretRoundRobinLoadBalancerProvider.java */
/* renamed from: io.grpc.l1.b */
/* loaded from: classes2.dex */
public final class C10013b extends AbstractC10034o0 {
    @Override // io.grpc.AbstractC10020n0.AbstractC10024c
    /* renamed from: a */
    public AbstractC10020n0 mo13294a(AbstractC10020n0.AbstractC10025d abstractC10025d) {
        return new C10007a(abstractC10025d);
    }

    @Override // io.grpc.AbstractC10034o0
    /* renamed from: b */
    public String mo13257b() {
        return "round_robin";
    }

    @Override // io.grpc.AbstractC10034o0
    /* renamed from: c */
    public int mo13256c() {
        return 5;
    }

    @Override // io.grpc.AbstractC10034o0
    /* renamed from: d */
    public boolean mo13255d() {
        return true;
    }

    @Override // io.grpc.AbstractC10034o0
    /* renamed from: e */
    public AbstractC10069u0.C10073c mo13254e(Map<String, ?> map) {
        return AbstractC10069u0.C10073c.m13122a("no service config");
    }
}
