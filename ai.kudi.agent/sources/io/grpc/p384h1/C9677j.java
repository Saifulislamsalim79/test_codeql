package io.grpc.p384h1;

import com.google.common.base.C5042j;
import com.google.common.base.C5051n;
import io.grpc.AbstractC10020n0;
import io.grpc.AbstractC10034o0;
import io.grpc.AbstractC10069u0;
import io.grpc.AbstractC9520g;
import io.grpc.C10037p0;
import io.grpc.C10090y;
import io.grpc.C9477a;
import io.grpc.C9497c1;
import io.grpc.EnumC10039q;
import io.grpc.p384h1.C9596e2;
import java.util.List;
import java.util.Map;
/* compiled from: AutoConfiguredLoadBalancerFactory.java */
/* renamed from: io.grpc.h1.j */
/* loaded from: classes2.dex */
public final class C9677j {

    /* renamed from: a */
    private final C10037p0 f22729a;

    /* renamed from: b */
    private final String f22730b;

    /* compiled from: AutoConfiguredLoadBalancerFactory.java */
    /* renamed from: io.grpc.h1.j$b */
    /* loaded from: classes2.dex */
    public final class C9679b {

        /* renamed from: a */
        private final AbstractC10020n0.AbstractC10025d f22731a;

        /* renamed from: b */
        private AbstractC10020n0 f22732b;

        /* renamed from: c */
        private AbstractC10034o0 f22733c;

        C9679b(AbstractC10020n0.AbstractC10025d abstractC10025d) {
            this.f22731a = abstractC10025d;
            AbstractC10034o0 m13248d = C9677j.this.f22729a.m13248d(C9677j.this.f22730b);
            this.f22733c = m13248d;
            if (m13248d == null) {
                throw new IllegalStateException("Could not find policy '" + C9677j.this.f22730b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
            }
            this.f22732b = m13248d.mo13294a(abstractC10025d);
        }

        /* renamed from: a */
        public AbstractC10020n0 m14200a() {
            return this.f22732b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public void m14199b(C9497c1 c9497c1) {
            m14200a().mo13307b(c9497c1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public void m14198c() {
            this.f22732b.mo13305d();
            this.f22732b = null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public C9497c1 m14197d(AbstractC10020n0.C10028g c10028g) {
            List<C10090y> m13276a = c10028g.m13276a();
            C9477a m13275b = c10028g.m13275b();
            C9596e2.C9598b c9598b = (C9596e2.C9598b) c10028g.m13274c();
            if (c9598b == null) {
                try {
                    c9598b = new C9596e2.C9598b(C9677j.this.m14203d(C9677j.this.f22730b, "using default policy"), null);
                } catch (C9683f e) {
                    this.f22731a.mo13289e(EnumC10039q.TRANSIENT_FAILURE, new C9681d(C9497c1.f22194m.m14578r(e.getMessage())));
                    this.f22732b.mo13305d();
                    this.f22733c = null;
                    this.f22732b = new C9682e();
                    return C9497c1.f22187f;
                }
            }
            if (this.f22733c == null || !c9598b.f22477a.mo13257b().equals(this.f22733c.mo13257b())) {
                this.f22731a.mo13289e(EnumC10039q.CONNECTING, new C9680c());
                this.f22732b.mo13305d();
                AbstractC10034o0 abstractC10034o0 = c9598b.f22477a;
                this.f22733c = abstractC10034o0;
                AbstractC10020n0 abstractC10020n0 = this.f22732b;
                this.f22732b = abstractC10034o0.mo13294a(this.f22731a);
                this.f22731a.mo13292b().mo13867b(AbstractC9520g.EnumC9521a.INFO, "Load balancer changed from {0} to {1}", abstractC10020n0.getClass().getSimpleName(), this.f22732b.getClass().getSimpleName());
            }
            Object obj = c9598b.f22478b;
            if (obj != null) {
                this.f22731a.mo13292b().mo13867b(AbstractC9520g.EnumC9521a.DEBUG, "Load-balancing config: {0}", c9598b.f22478b);
            }
            AbstractC10020n0 m14200a = m14200a();
            if (c10028g.m13276a().isEmpty() && !m14200a.m13308a()) {
                C9497c1 c9497c1 = C9497c1.f22195n;
                return c9497c1.m14578r("NameResolver returned no usable address. addrs=" + m13276a + ", attrs=" + m13275b);
            }
            AbstractC10020n0.C10028g.C10029a m13273d = AbstractC10020n0.C10028g.m13273d();
            m13273d.m13271b(c10028g.m13276a());
            m13273d.m13270c(m13275b);
            m13273d.m13269d(obj);
            m14200a.mo13306c(m13273d.m13272a());
            return C9497c1.f22187f;
        }
    }

    /* compiled from: AutoConfiguredLoadBalancerFactory.java */
    /* renamed from: io.grpc.h1.j$c */
    /* loaded from: classes2.dex */
    private static final class C9680c extends AbstractC10020n0.AbstractC10031i {
        private C9680c() {
        }

        @Override // io.grpc.AbstractC10020n0.AbstractC10031i
        /* renamed from: a */
        public AbstractC10020n0.C10026e mo13260a(AbstractC10020n0.AbstractC10027f abstractC10027f) {
            return AbstractC10020n0.C10026e.m13282g();
        }

        public String toString() {
            return C5042j.m25813b(C9680c.class).toString();
        }
    }

    /* compiled from: AutoConfiguredLoadBalancerFactory.java */
    /* renamed from: io.grpc.h1.j$d */
    /* loaded from: classes2.dex */
    private static final class C9681d extends AbstractC10020n0.AbstractC10031i {

        /* renamed from: a */
        private final C9497c1 f22735a;

        C9681d(C9497c1 c9497c1) {
            this.f22735a = c9497c1;
        }

        @Override // io.grpc.AbstractC10020n0.AbstractC10031i
        /* renamed from: a */
        public AbstractC10020n0.C10026e mo13260a(AbstractC10020n0.AbstractC10027f abstractC10027f) {
            return AbstractC10020n0.C10026e.m13283f(this.f22735a);
        }
    }

    /* compiled from: AutoConfiguredLoadBalancerFactory.java */
    /* renamed from: io.grpc.h1.j$e */
    /* loaded from: classes2.dex */
    private static final class C9682e extends AbstractC10020n0 {
        private C9682e() {
        }

        @Override // io.grpc.AbstractC10020n0
        /* renamed from: b */
        public void mo13307b(C9497c1 c9497c1) {
        }

        @Override // io.grpc.AbstractC10020n0
        /* renamed from: c */
        public void mo13306c(AbstractC10020n0.C10028g c10028g) {
        }

        @Override // io.grpc.AbstractC10020n0
        /* renamed from: d */
        public void mo13305d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoConfiguredLoadBalancerFactory.java */
    /* renamed from: io.grpc.h1.j$f */
    /* loaded from: classes2.dex */
    public static final class C9683f extends Exception {
        private C9683f(String str) {
            super(str);
        }
    }

    public C9677j(String str) {
        this(C10037p0.m13250b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public AbstractC10034o0 m14203d(String str, String str2) throws C9683f {
        AbstractC10034o0 m13248d = this.f22729a.m13248d(str);
        if (m13248d != null) {
            return m13248d;
        }
        throw new C9683f("Trying to load '" + str + "' because " + str2 + ", but it's unavailable");
    }

    /* renamed from: e */
    public C9679b m14202e(AbstractC10020n0.AbstractC10025d abstractC10025d) {
        return new C9679b(abstractC10025d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public AbstractC10069u0.C10073c m14201f(Map<String, ?> map) {
        List<C9596e2.C9597a> m14372A;
        if (map != null) {
            try {
                m14372A = C9596e2.m14372A(C9596e2.m14365g(map));
            } catch (RuntimeException e) {
                return AbstractC10069u0.C10073c.m13121b(C9497c1.f22189h.m14578r("can't parse load balancer configuration").m14579q(e));
            }
        } else {
            m14372A = null;
        }
        if (m14372A == null || m14372A.isEmpty()) {
            return null;
        }
        return C9596e2.m14347y(m14372A, this.f22729a);
    }

    C9677j(C10037p0 c10037p0, String str) {
        C5051n.m25779o(c10037p0, "registry");
        this.f22729a = c10037p0;
        C5051n.m25779o(str, "defaultPolicy");
        this.f22730b = str;
    }
}
