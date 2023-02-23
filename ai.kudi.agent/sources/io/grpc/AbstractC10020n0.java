package io.grpc;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import com.google.common.base.C5042j;
import com.google.common.base.C5046k;
import com.google.common.base.C5051n;
import io.grpc.AbstractC10001l;
import io.grpc.C9477a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: LoadBalancer.java */
/* renamed from: io.grpc.n0 */
/* loaded from: classes2.dex */
public abstract class AbstractC10020n0 {

    /* renamed from: a */
    public static final C9477a.C9480c<Map<String, ?>> f23742a = C9477a.C9480c.m14623a("health-checking-config");

    /* compiled from: LoadBalancer.java */
    /* renamed from: io.grpc.n0$b */
    /* loaded from: classes2.dex */
    public static final class C10022b {

        /* renamed from: a */
        private final List<C10090y> f23743a;

        /* renamed from: b */
        private final C9477a f23744b;

        /* renamed from: c */
        private final Object[][] f23745c;

        /* compiled from: LoadBalancer.java */
        /* renamed from: io.grpc.n0$b$a */
        /* loaded from: classes2.dex */
        public static final class C10023a {

            /* renamed from: a */
            private List<C10090y> f23746a;

            /* renamed from: b */
            private C9477a f23747b = C9477a.f22159b;

            /* renamed from: c */
            private Object[][] f23748c = (Object[][]) Array.newInstance(Object.class, 0, 2);

            C10023a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: c */
            public <T> C10023a m13298c(Object[][] objArr) {
                Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, objArr.length, 2);
                this.f23748c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return this;
            }

            /* renamed from: b */
            public C10022b m13299b() {
                return new C10022b(this.f23746a, this.f23747b, this.f23748c);
            }

            /* renamed from: d */
            public C10023a m13297d(C10090y c10090y) {
                this.f23746a = Collections.singletonList(c10090y);
                return this;
            }

            /* renamed from: e */
            public C10023a m13296e(List<C10090y> list) {
                C5051n.m25789e(!list.isEmpty(), "addrs is empty");
                this.f23746a = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }

            /* renamed from: f */
            public C10023a m13295f(C9477a c9477a) {
                C5051n.m25779o(c9477a, "attrs");
                this.f23747b = c9477a;
                return this;
            }
        }

        /* renamed from: c */
        public static C10023a m13302c() {
            return new C10023a();
        }

        /* renamed from: a */
        public List<C10090y> m13304a() {
            return this.f23743a;
        }

        /* renamed from: b */
        public C9477a m13303b() {
            return this.f23744b;
        }

        /* renamed from: d */
        public C10023a m13301d() {
            C10023a m13302c = m13302c();
            m13302c.m13296e(this.f23743a);
            m13302c.m13295f(this.f23744b);
            m13302c.m13298c(this.f23745c);
            return m13302c;
        }

        public String toString() {
            C5042j.C5044b m25812c = C5042j.m25812c(this);
            m25812c.m25808d("addrs", this.f23743a);
            m25812c.m25808d("attrs", this.f23744b);
            m25812c.m25808d("customOptions", Arrays.deepToString(this.f23745c));
            return m25812c.toString();
        }

        private C10022b(List<C10090y> list, C9477a c9477a, Object[][] objArr) {
            C5051n.m25779o(list, "addresses are not set");
            this.f23743a = list;
            C5051n.m25779o(c9477a, "attrs");
            this.f23744b = c9477a;
            C5051n.m25779o(objArr, "customOptions");
            this.f23745c = objArr;
        }
    }

    /* compiled from: LoadBalancer.java */
    /* renamed from: io.grpc.n0$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC10024c {
        /* renamed from: a */
        public abstract AbstractC10020n0 mo13294a(AbstractC10025d abstractC10025d);
    }

    /* compiled from: LoadBalancer.java */
    /* renamed from: io.grpc.n0$d */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC10025d {
        /* renamed from: a */
        public AbstractC10030h mo13293a(C10022b c10022b) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public AbstractC9520g mo13292b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public ExecutorC9513e1 mo13291c() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo13290d() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public abstract void mo13289e(EnumC10039q enumC10039q, AbstractC10031i abstractC10031i);
    }

    /* compiled from: LoadBalancer.java */
    /* renamed from: io.grpc.n0$e */
    /* loaded from: classes2.dex */
    public static final class C10026e {

        /* renamed from: e */
        private static final C10026e f23749e = new C10026e(null, null, C9497c1.f22187f, false);

        /* renamed from: a */
        private final AbstractC10030h f23750a;

        /* renamed from: b */
        private final AbstractC10001l.AbstractC10002a f23751b;

        /* renamed from: c */
        private final C9497c1 f23752c;

        /* renamed from: d */
        private final boolean f23753d;

        private C10026e(AbstractC10030h abstractC10030h, AbstractC10001l.AbstractC10002a abstractC10002a, C9497c1 c9497c1, boolean z) {
            this.f23750a = abstractC10030h;
            this.f23751b = abstractC10002a;
            C5051n.m25779o(c9497c1, TransactionField.STATUS);
            this.f23752c = c9497c1;
            this.f23753d = z;
        }

        /* renamed from: e */
        public static C10026e m13284e(C9497c1 c9497c1) {
            C5051n.m25789e(!c9497c1.m14580p(), "drop status shouldn't be OK");
            return new C10026e(null, null, c9497c1, true);
        }

        /* renamed from: f */
        public static C10026e m13283f(C9497c1 c9497c1) {
            C5051n.m25789e(!c9497c1.m14580p(), "error status shouldn't be OK");
            return new C10026e(null, null, c9497c1, false);
        }

        /* renamed from: g */
        public static C10026e m13282g() {
            return f23749e;
        }

        /* renamed from: h */
        public static C10026e m13281h(AbstractC10030h abstractC10030h) {
            return m13280i(abstractC10030h, null);
        }

        /* renamed from: i */
        public static C10026e m13280i(AbstractC10030h abstractC10030h, AbstractC10001l.AbstractC10002a abstractC10002a) {
            C5051n.m25779o(abstractC10030h, "subchannel");
            return new C10026e(abstractC10030h, abstractC10002a, C9497c1.f22187f, false);
        }

        /* renamed from: a */
        public C9497c1 m13288a() {
            return this.f23752c;
        }

        /* renamed from: b */
        public AbstractC10001l.AbstractC10002a m13287b() {
            return this.f23751b;
        }

        /* renamed from: c */
        public AbstractC10030h m13286c() {
            return this.f23750a;
        }

        /* renamed from: d */
        public boolean m13285d() {
            return this.f23753d;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C10026e) {
                C10026e c10026e = (C10026e) obj;
                return C5046k.m25800a(this.f23750a, c10026e.f23750a) && C5046k.m25800a(this.f23752c, c10026e.f23752c) && C5046k.m25800a(this.f23751b, c10026e.f23751b) && this.f23753d == c10026e.f23753d;
            }
            return false;
        }

        public int hashCode() {
            return C5046k.m25799b(this.f23750a, this.f23752c, this.f23751b, Boolean.valueOf(this.f23753d));
        }

        public String toString() {
            C5042j.C5044b m25812c = C5042j.m25812c(this);
            m25812c.m25808d("subchannel", this.f23750a);
            m25812c.m25808d("streamTracerFactory", this.f23751b);
            m25812c.m25808d(TransactionField.STATUS, this.f23752c);
            m25812c.m25807e("drop", this.f23753d);
            return m25812c.toString();
        }
    }

    /* compiled from: LoadBalancer.java */
    /* renamed from: io.grpc.n0$f */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC10027f {
        /* renamed from: a */
        public abstract C9502d mo13279a();

        /* renamed from: b */
        public abstract C10049s0 mo13278b();

        /* renamed from: c */
        public abstract C10060t0<?, ?> mo13277c();
    }

    /* compiled from: LoadBalancer.java */
    /* renamed from: io.grpc.n0$g */
    /* loaded from: classes2.dex */
    public static final class C10028g {

        /* renamed from: a */
        private final List<C10090y> f23754a;

        /* renamed from: b */
        private final C9477a f23755b;

        /* renamed from: c */
        private final Object f23756c;

        /* compiled from: LoadBalancer.java */
        /* renamed from: io.grpc.n0$g$a */
        /* loaded from: classes2.dex */
        public static final class C10029a {

            /* renamed from: a */
            private List<C10090y> f23757a;

            /* renamed from: b */
            private C9477a f23758b = C9477a.f22159b;

            /* renamed from: c */
            private Object f23759c;

            C10029a() {
            }

            /* renamed from: a */
            public C10028g m13272a() {
                return new C10028g(this.f23757a, this.f23758b, this.f23759c);
            }

            /* renamed from: b */
            public C10029a m13271b(List<C10090y> list) {
                this.f23757a = list;
                return this;
            }

            /* renamed from: c */
            public C10029a m13270c(C9477a c9477a) {
                this.f23758b = c9477a;
                return this;
            }

            /* renamed from: d */
            public C10029a m13269d(Object obj) {
                this.f23759c = obj;
                return this;
            }
        }

        /* renamed from: d */
        public static C10029a m13273d() {
            return new C10029a();
        }

        /* renamed from: a */
        public List<C10090y> m13276a() {
            return this.f23754a;
        }

        /* renamed from: b */
        public C9477a m13275b() {
            return this.f23755b;
        }

        /* renamed from: c */
        public Object m13274c() {
            return this.f23756c;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C10028g) {
                C10028g c10028g = (C10028g) obj;
                return C5046k.m25800a(this.f23754a, c10028g.f23754a) && C5046k.m25800a(this.f23755b, c10028g.f23755b) && C5046k.m25800a(this.f23756c, c10028g.f23756c);
            }
            return false;
        }

        public int hashCode() {
            return C5046k.m25799b(this.f23754a, this.f23755b, this.f23756c);
        }

        public String toString() {
            C5042j.C5044b m25812c = C5042j.m25812c(this);
            m25812c.m25808d("addresses", this.f23754a);
            m25812c.m25808d("attributes", this.f23755b);
            m25812c.m25808d("loadBalancingPolicyConfig", this.f23756c);
            return m25812c.toString();
        }

        private C10028g(List<C10090y> list, C9477a c9477a, Object obj) {
            C5051n.m25779o(list, "addresses");
            this.f23754a = Collections.unmodifiableList(new ArrayList(list));
            C5051n.m25779o(c9477a, "attributes");
            this.f23755b = c9477a;
            this.f23756c = obj;
        }
    }

    /* compiled from: LoadBalancer.java */
    /* renamed from: io.grpc.n0$h */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC10030h {
        /* renamed from: a */
        public final C10090y m13268a() {
            List<C10090y> mo13267b = mo13267b();
            C5051n.m25771w(mo13267b.size() == 1, "%s does not have exactly one group", mo13267b);
            return mo13267b.get(0);
        }

        /* renamed from: b */
        public List<C10090y> mo13267b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public abstract C9477a mo13266c();

        /* renamed from: d */
        public Object mo13265d() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public abstract void mo13264e();

        /* renamed from: f */
        public abstract void mo13263f();

        /* renamed from: g */
        public void mo13262g(InterfaceC10032j interfaceC10032j) {
            throw new UnsupportedOperationException("Not implemented");
        }

        /* renamed from: h */
        public void mo13261h(List<C10090y> list) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: LoadBalancer.java */
    /* renamed from: io.grpc.n0$i */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC10031i {
        /* renamed from: a */
        public abstract C10026e mo13260a(AbstractC10027f abstractC10027f);
    }

    /* compiled from: LoadBalancer.java */
    /* renamed from: io.grpc.n0$j */
    /* loaded from: classes2.dex */
    public interface InterfaceC10032j {
        /* renamed from: a */
        void mo13259a(C10041r c10041r);
    }

    /* renamed from: a */
    public boolean m13308a() {
        return false;
    }

    /* renamed from: b */
    public abstract void mo13307b(C9497c1 c9497c1);

    /* renamed from: c */
    public abstract void mo13306c(C10028g c10028g);

    /* renamed from: d */
    public abstract void mo13305d();
}
