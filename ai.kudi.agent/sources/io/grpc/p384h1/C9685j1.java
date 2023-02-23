package io.grpc.p384h1;

import com.google.common.base.C5042j;
import com.google.common.base.C5046k;
import com.google.common.base.C5051n;
import com.google.common.base.C5057q;
import io.grpc.AbstractC10020n0;
import io.grpc.AbstractC9509e0;
import io.grpc.C10060t0;
import io.grpc.C9497c1;
import io.grpc.C9502d;
import io.grpc.p384h1.AbstractC9857z1;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedChannelServiceConfig.java */
/* renamed from: io.grpc.h1.j1 */
/* loaded from: classes2.dex */
public final class C9685j1 {

    /* renamed from: a */
    private final C9687b f22736a;

    /* renamed from: b */
    private final Map<String, C9687b> f22737b;

    /* renamed from: c */
    private final Map<String, C9687b> f22738c;

    /* renamed from: d */
    private final AbstractC9857z1.C9871c0 f22739d;

    /* renamed from: e */
    private final Object f22740e;

    /* renamed from: f */
    private final Map<String, ?> f22741f;

    /* compiled from: ManagedChannelServiceConfig.java */
    /* renamed from: io.grpc.h1.j1$b */
    /* loaded from: classes2.dex */
    static final class C9687b {

        /* renamed from: g */
        static final C9502d.C9503a<C9687b> f22742g = C9502d.C9503a.m14546b("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

        /* renamed from: a */
        final Long f22743a;

        /* renamed from: b */
        final Boolean f22744b;

        /* renamed from: c */
        final Integer f22745c;

        /* renamed from: d */
        final Integer f22746d;

        /* renamed from: e */
        final C9540a2 f22747e;

        /* renamed from: f */
        final C9782t0 f22748f;

        C9687b(Map<String, ?> map, boolean z, int i, int i2) {
            this.f22743a = C9596e2.m14349w(map);
            this.f22744b = C9596e2.m14348x(map);
            Integer m14360l = C9596e2.m14360l(map);
            this.f22745c = m14360l;
            if (m14360l != null) {
                C5051n.m25784j(m14360l.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", this.f22745c);
            }
            Integer m14361k = C9596e2.m14361k(map);
            this.f22746d = m14361k;
            if (m14361k != null) {
                C5051n.m25784j(m14361k.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", this.f22746d);
            }
            Map<String, ?> m14354r = z ? C9596e2.m14354r(map) : null;
            this.f22747e = m14354r == null ? null : m14181b(m14354r, i);
            Map<String, ?> m14368d = z ? C9596e2.m14368d(map) : null;
            this.f22748f = m14368d != null ? m14182a(m14368d, i2) : null;
        }

        /* renamed from: a */
        private static C9782t0 m14182a(Map<String, ?> map, int i) {
            Integer m14364h = C9596e2.m14364h(map);
            C5051n.m25779o(m14364h, "maxAttempts cannot be empty");
            int intValue = m14364h.intValue();
            C5051n.m25786h(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i);
            Long m14369c = C9596e2.m14369c(map);
            C5051n.m25779o(m14369c, "hedgingDelay cannot be empty");
            long longValue = m14369c.longValue();
            C5051n.m25785i(longValue >= 0, "hedgingDelay must not be negative: %s", longValue);
            return new C9782t0(min, longValue, C9596e2.m14356p(map));
        }

        /* renamed from: b */
        private static C9540a2 m14181b(Map<String, ?> map, int i) {
            Integer m14363i = C9596e2.m14363i(map);
            C5051n.m25779o(m14363i, "maxAttempts cannot be empty");
            int intValue = m14363i.intValue();
            boolean z = true;
            C5051n.m25786h(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i);
            Long m14367e = C9596e2.m14367e(map);
            C5051n.m25779o(m14367e, "initialBackoff cannot be empty");
            long longValue = m14367e.longValue();
            C5051n.m25785i(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
            Long m14362j = C9596e2.m14362j(map);
            C5051n.m25779o(m14362j, "maxBackoff cannot be empty");
            long longValue2 = m14362j.longValue();
            C5051n.m25785i(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
            Double m14371a = C9596e2.m14371a(map);
            C5051n.m25779o(m14371a, "backoffMultiplier cannot be empty");
            double doubleValue = m14371a.doubleValue();
            C5051n.m25784j(doubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", Double.valueOf(doubleValue));
            Long m14355q = C9596e2.m14355q(map);
            C5051n.m25784j(m14355q == null || m14355q.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", m14355q);
            Set<C9497c1.EnumC9499b> m14353s = C9596e2.m14353s(map);
            if (m14355q == null && m14353s.isEmpty()) {
                z = false;
            }
            C5051n.m25789e(z, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            return new C9540a2(min, longValue, longValue2, doubleValue, m14355q, m14353s);
        }

        public boolean equals(Object obj) {
            if (obj instanceof C9687b) {
                C9687b c9687b = (C9687b) obj;
                return C5046k.m25800a(this.f22743a, c9687b.f22743a) && C5046k.m25800a(this.f22744b, c9687b.f22744b) && C5046k.m25800a(this.f22745c, c9687b.f22745c) && C5046k.m25800a(this.f22746d, c9687b.f22746d) && C5046k.m25800a(this.f22747e, c9687b.f22747e) && C5046k.m25800a(this.f22748f, c9687b.f22748f);
            }
            return false;
        }

        public int hashCode() {
            return C5046k.m25799b(this.f22743a, this.f22744b, this.f22745c, this.f22746d, this.f22747e, this.f22748f);
        }

        public String toString() {
            C5042j.C5044b m25812c = C5042j.m25812c(this);
            m25812c.m25808d("timeoutNanos", this.f22743a);
            m25812c.m25808d("waitForReady", this.f22744b);
            m25812c.m25808d("maxInboundMessageSize", this.f22745c);
            m25812c.m25808d("maxOutboundMessageSize", this.f22746d);
            m25812c.m25808d("retryPolicy", this.f22747e);
            m25812c.m25808d("hedgingPolicy", this.f22748f);
            return m25812c.toString();
        }
    }

    /* compiled from: ManagedChannelServiceConfig.java */
    /* renamed from: io.grpc.h1.j1$c */
    /* loaded from: classes2.dex */
    static final class C9688c extends AbstractC9509e0 {

        /* renamed from: b */
        final C9685j1 f22749b;

        @Override // io.grpc.AbstractC9509e0
        /* renamed from: a */
        public AbstractC9509e0.C9511b mo14180a(AbstractC10020n0.AbstractC10027f abstractC10027f) {
            AbstractC9509e0.C9511b.C9512a m14537d = AbstractC9509e0.C9511b.m14537d();
            m14537d.m14535b(this.f22749b);
            return m14537d.m14536a();
        }

        private C9688c(C9685j1 c9685j1) {
            this.f22749b = c9685j1;
        }
    }

    C9685j1(C9687b c9687b, Map<String, C9687b> map, Map<String, C9687b> map2, AbstractC9857z1.C9871c0 c9871c0, Object obj, Map<String, ?> map3) {
        this.f22736a = c9687b;
        this.f22737b = Collections.unmodifiableMap(new HashMap(map));
        this.f22738c = Collections.unmodifiableMap(new HashMap(map2));
        this.f22739d = c9871c0;
        this.f22740e = obj;
        this.f22741f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C9685j1 m14189a() {
        return new C9685j1(null, new HashMap(), new HashMap(), null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C9685j1 m14188b(Map<String, ?> map, boolean z, int i, int i2, Object obj) {
        AbstractC9857z1.C9871c0 m14350v = z ? C9596e2.m14350v(map) : null;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Map<String, ?> m14370b = C9596e2.m14370b(map);
        List<Map<String, ?>> m14359m = C9596e2.m14359m(map);
        if (m14359m == null) {
            return new C9685j1(null, hashMap, hashMap2, m14350v, obj, m14370b);
        }
        C9687b c9687b = null;
        for (Map<String, ?> map2 : m14359m) {
            C9687b c9687b2 = new C9687b(map2, z, i, i2);
            List<Map<String, ?>> m14357o = C9596e2.m14357o(map2);
            if (m14357o != null && !m14357o.isEmpty()) {
                for (Map<String, ?> map3 : m14357o) {
                    String m14352t = C9596e2.m14352t(map3);
                    String m14358n = C9596e2.m14358n(map3);
                    if (C5057q.m25758b(m14352t)) {
                        C5051n.m25784j(C5057q.m25758b(m14358n), "missing service name for method %s", m14358n);
                        C5051n.m25784j(c9687b == null, "Duplicate default method config in service config %s", map);
                        c9687b = c9687b2;
                    } else if (C5057q.m25758b(m14358n)) {
                        C5051n.m25784j(!hashMap2.containsKey(m14352t), "Duplicate service %s", m14352t);
                        hashMap2.put(m14352t, c9687b2);
                    } else {
                        String m13169b = C10060t0.m13169b(m14352t, m14358n);
                        C5051n.m25784j(!hashMap.containsKey(m13169b), "Duplicate method name %s", m13169b);
                        hashMap.put(m13169b, c9687b2);
                    }
                }
            }
        }
        return new C9685j1(c9687b, hashMap, hashMap2, m14350v, obj, m14370b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public AbstractC9509e0 m14187c() {
        if (this.f22738c.isEmpty() && this.f22737b.isEmpty() && this.f22736a == null) {
            return null;
        }
        return new C9688c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Map<String, ?> m14186d() {
        return this.f22741f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Object m14185e() {
        return this.f22740e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9685j1.class != obj.getClass()) {
            return false;
        }
        C9685j1 c9685j1 = (C9685j1) obj;
        return C5046k.m25800a(this.f22736a, c9685j1.f22736a) && C5046k.m25800a(this.f22737b, c9685j1.f22737b) && C5046k.m25800a(this.f22738c, c9685j1.f22738c) && C5046k.m25800a(this.f22739d, c9685j1.f22739d) && C5046k.m25800a(this.f22740e, c9685j1.f22740e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C9687b m14184f(C10060t0<?, ?> c10060t0) {
        C9687b c9687b = this.f22737b.get(c10060t0.m13168c());
        if (c9687b == null) {
            c9687b = this.f22738c.get(c10060t0.m13167d());
        }
        return c9687b == null ? this.f22736a : c9687b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public AbstractC9857z1.C9871c0 m14183g() {
        return this.f22739d;
    }

    public int hashCode() {
        return C5046k.m25799b(this.f22736a, this.f22737b, this.f22738c, this.f22739d, this.f22740e);
    }

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25808d("defaultMethodConfig", this.f22736a);
        m25812c.m25808d("serviceMethodMap", this.f22737b);
        m25812c.m25808d("serviceMap", this.f22738c);
        m25812c.m25808d("retryThrottling", this.f22739d);
        m25812c.m25808d("loadBalancingConfig", this.f22740e);
        return m25812c.toString();
    }
}
