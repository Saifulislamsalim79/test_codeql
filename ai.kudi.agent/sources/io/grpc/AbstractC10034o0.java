package io.grpc;

import com.google.common.base.C5042j;
import io.grpc.AbstractC10020n0;
import io.grpc.AbstractC10069u0;
import java.util.Map;
/* compiled from: LoadBalancerProvider.java */
/* renamed from: io.grpc.o0 */
/* loaded from: classes2.dex */
public abstract class AbstractC10034o0 extends AbstractC10020n0.AbstractC10024c {

    /* renamed from: a */
    private static final AbstractC10069u0.C10073c f23760a = AbstractC10069u0.C10073c.m13122a(new C10035a());

    /* compiled from: LoadBalancerProvider.java */
    /* renamed from: io.grpc.o0$a */
    /* loaded from: classes2.dex */
    private static final class C10035a {
        C10035a() {
        }

        public String toString() {
            return "service config is unused";
        }
    }

    /* renamed from: b */
    public abstract String mo13257b();

    /* renamed from: c */
    public abstract int mo13256c();

    /* renamed from: d */
    public abstract boolean mo13255d();

    /* renamed from: e */
    public AbstractC10069u0.C10073c mo13254e(Map<String, ?> map) {
        return f23760a;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25808d("policy", mo13257b());
        m25812c.m25810b("priority", mo13256c());
        m25812c.m25807e("available", mo13255d());
        return m25812c.toString();
    }
}
