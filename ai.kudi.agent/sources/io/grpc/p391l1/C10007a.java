package io.grpc.p391l1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import com.google.common.base.C5042j;
import com.google.common.base.C5046k;
import com.google.common.base.C5051n;
import io.grpc.AbstractC10020n0;
import io.grpc.C10041r;
import io.grpc.C10090y;
import io.grpc.C9477a;
import io.grpc.C9497c1;
import io.grpc.EnumC10039q;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: RoundRobinLoadBalancer.java */
/* renamed from: io.grpc.l1.a */
/* loaded from: classes2.dex */
final class C10007a extends AbstractC10020n0 {

    /* renamed from: g */
    static final C9477a.C9480c<C10011d<C10041r>> f23726g = C9477a.C9480c.m14623a("state-info");

    /* renamed from: h */
    private static final C9497c1 f23727h = C9497c1.f22187f.m14578r("no subchannels ready");

    /* renamed from: b */
    private final AbstractC10020n0.AbstractC10025d f23728b;

    /* renamed from: d */
    private final Random f23730d;

    /* renamed from: e */
    private EnumC10039q f23731e;

    /* renamed from: c */
    private final Map<C10090y, AbstractC10020n0.AbstractC10030h> f23729c = new HashMap();

    /* renamed from: f */
    private AbstractC10012e f23732f = new C10009b(f23727h);

    /* compiled from: RoundRobinLoadBalancer.java */
    /* renamed from: io.grpc.l1.a$a */
    /* loaded from: classes2.dex */
    class C10008a implements AbstractC10020n0.InterfaceC10032j {

        /* renamed from: a */
        final /* synthetic */ AbstractC10020n0.AbstractC10030h f23733a;

        C10008a(AbstractC10020n0.AbstractC10030h abstractC10030h) {
            this.f23733a = abstractC10030h;
        }

        @Override // io.grpc.AbstractC10020n0.InterfaceC10032j
        /* renamed from: a */
        public void mo13259a(C10041r c10041r) {
            C10007a.this.m13318j(this.f23733a, c10041r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RoundRobinLoadBalancer.java */
    /* renamed from: io.grpc.l1.a$b */
    /* loaded from: classes2.dex */
    public static final class C10009b extends AbstractC10012e {

        /* renamed from: a */
        private final C9497c1 f23735a;

        C10009b(C9497c1 c9497c1) {
            super(null);
            C5051n.m25779o(c9497c1, TransactionField.STATUS);
            this.f23735a = c9497c1;
        }

        @Override // io.grpc.AbstractC10020n0.AbstractC10031i
        /* renamed from: a */
        public AbstractC10020n0.C10026e mo13260a(AbstractC10020n0.AbstractC10027f abstractC10027f) {
            return this.f23735a.m14580p() ? AbstractC10020n0.C10026e.m13282g() : AbstractC10020n0.C10026e.m13283f(this.f23735a);
        }

        @Override // io.grpc.p391l1.C10007a.AbstractC10012e
        /* renamed from: b */
        boolean mo13310b(AbstractC10012e abstractC10012e) {
            if (abstractC10012e instanceof C10009b) {
                C10009b c10009b = (C10009b) abstractC10012e;
                if (C5046k.m25800a(this.f23735a, c10009b.f23735a) || (this.f23735a.m14580p() && c10009b.f23735a.m14580p())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            C5042j.C5044b m25813b = C5042j.m25813b(C10009b.class);
            m25813b.m25808d(TransactionField.STATUS, this.f23735a);
            return m25813b.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RoundRobinLoadBalancer.java */
    /* renamed from: io.grpc.l1.a$c */
    /* loaded from: classes2.dex */
    public static final class C10010c extends AbstractC10012e {

        /* renamed from: c */
        private static final AtomicIntegerFieldUpdater<C10010c> f23736c = AtomicIntegerFieldUpdater.newUpdater(C10010c.class, "b");

        /* renamed from: a */
        private final List<AbstractC10020n0.AbstractC10030h> f23737a;

        /* renamed from: b */
        private volatile int f23738b;

        C10010c(List<AbstractC10020n0.AbstractC10030h> list, int i) {
            super(null);
            C5051n.m25789e(!list.isEmpty(), "empty list");
            this.f23737a = list;
            this.f23738b = i - 1;
        }

        /* renamed from: c */
        private AbstractC10020n0.AbstractC10030h m13311c() {
            int size = this.f23737a.size();
            int incrementAndGet = f23736c.incrementAndGet(this);
            if (incrementAndGet >= size) {
                int i = incrementAndGet % size;
                f23736c.compareAndSet(this, incrementAndGet, i);
                incrementAndGet = i;
            }
            return this.f23737a.get(incrementAndGet);
        }

        @Override // io.grpc.AbstractC10020n0.AbstractC10031i
        /* renamed from: a */
        public AbstractC10020n0.C10026e mo13260a(AbstractC10020n0.AbstractC10027f abstractC10027f) {
            return AbstractC10020n0.C10026e.m13281h(m13311c());
        }

        @Override // io.grpc.p391l1.C10007a.AbstractC10012e
        /* renamed from: b */
        boolean mo13310b(AbstractC10012e abstractC10012e) {
            if (abstractC10012e instanceof C10010c) {
                C10010c c10010c = (C10010c) abstractC10012e;
                return c10010c == this || (this.f23737a.size() == c10010c.f23737a.size() && new HashSet(this.f23737a).containsAll(c10010c.f23737a));
            }
            return false;
        }

        public String toString() {
            C5042j.C5044b m25813b = C5042j.m25813b(C10010c.class);
            m25813b.m25808d(AttributeType.LIST, this.f23737a);
            return m25813b.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RoundRobinLoadBalancer.java */
    /* renamed from: io.grpc.l1.a$d */
    /* loaded from: classes2.dex */
    public static final class C10011d<T> {

        /* renamed from: a */
        T f23739a;

        C10011d(T t) {
            this.f23739a = t;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RoundRobinLoadBalancer.java */
    /* renamed from: io.grpc.l1.a$e */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC10012e extends AbstractC10020n0.AbstractC10031i {
        private AbstractC10012e() {
        }

        /* renamed from: b */
        abstract boolean mo13310b(AbstractC10012e abstractC10012e);

        /* synthetic */ AbstractC10012e(C10008a c10008a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10007a(AbstractC10020n0.AbstractC10025d abstractC10025d) {
        C5051n.m25779o(abstractC10025d, "helper");
        this.f23728b = abstractC10025d;
        this.f23730d = new Random();
    }

    /* renamed from: f */
    private static List<AbstractC10020n0.AbstractC10030h> m13322f(Collection<AbstractC10020n0.AbstractC10030h> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (AbstractC10020n0.AbstractC10030h abstractC10030h : collection) {
            if (m13319i(abstractC10030h)) {
                arrayList.add(abstractC10030h);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private static C10011d<C10041r> m13321g(AbstractC10020n0.AbstractC10030h abstractC10030h) {
        Object m14630b = abstractC10030h.mo13266c().m14630b(f23726g);
        C5051n.m25779o(m14630b, "STATE_INFO");
        return (C10011d) m14630b;
    }

    /* renamed from: i */
    static boolean m13319i(AbstractC10020n0.AbstractC10030h abstractC10030h) {
        return m13321g(abstractC10030h).f23739a.m13242c() == EnumC10039q.READY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public void m13318j(AbstractC10020n0.AbstractC10030h abstractC10030h, C10041r c10041r) {
        if (this.f23729c.get(m13315m(abstractC10030h.m13268a())) != abstractC10030h) {
            return;
        }
        if (c10041r.m13242c() == EnumC10039q.TRANSIENT_FAILURE || c10041r.m13242c() == EnumC10039q.IDLE) {
            this.f23728b.mo13290d();
        }
        if (c10041r.m13242c() == EnumC10039q.IDLE) {
            abstractC10030h.mo13264e();
        }
        C10011d<C10041r> m13321g = m13321g(abstractC10030h);
        if (m13321g.f23739a.m13242c().equals(EnumC10039q.TRANSIENT_FAILURE) && (c10041r.m13242c().equals(EnumC10039q.CONNECTING) || c10041r.m13242c().equals(EnumC10039q.IDLE))) {
            return;
        }
        m13321g.f23739a = c10041r;
        m13313o();
    }

    /* renamed from: k */
    private static <T> Set<T> m13317k(Set<T> set, Set<T> set2) {
        HashSet hashSet = new HashSet(set);
        hashSet.removeAll(set2);
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, io.grpc.r] */
    /* renamed from: l */
    private void m13316l(AbstractC10020n0.AbstractC10030h abstractC10030h) {
        abstractC10030h.mo13263f();
        m13321g(abstractC10030h).f23739a = C10041r.m13244a(EnumC10039q.SHUTDOWN);
    }

    /* renamed from: m */
    private static C10090y m13315m(C10090y c10090y) {
        return new C10090y(c10090y.m13078a());
    }

    /* renamed from: n */
    private static Map<C10090y, C10090y> m13314n(List<C10090y> list) {
        HashMap hashMap = new HashMap(list.size() * 2);
        for (C10090y c10090y : list) {
            hashMap.put(m13315m(c10090y), c10090y);
        }
        return hashMap;
    }

    /* renamed from: o */
    private void m13313o() {
        List<AbstractC10020n0.AbstractC10030h> m13322f = m13322f(m13320h());
        if (m13322f.isEmpty()) {
            boolean z = false;
            C9497c1 c9497c1 = f23727h;
            for (AbstractC10020n0.AbstractC10030h abstractC10030h : m13320h()) {
                C10041r c10041r = m13321g(abstractC10030h).f23739a;
                z = (c10041r.m13242c() == EnumC10039q.CONNECTING || c10041r.m13242c() == EnumC10039q.IDLE) ? true : true;
                if (c9497c1 == f23727h || !c9497c1.m14580p()) {
                    c9497c1 = c10041r.m13241d();
                }
            }
            m13312p(z ? EnumC10039q.CONNECTING : EnumC10039q.TRANSIENT_FAILURE, new C10009b(c9497c1));
            return;
        }
        m13312p(EnumC10039q.READY, new C10010c(m13322f, this.f23730d.nextInt(m13322f.size())));
    }

    /* renamed from: p */
    private void m13312p(EnumC10039q enumC10039q, AbstractC10012e abstractC10012e) {
        if (enumC10039q == this.f23731e && abstractC10012e.mo13310b(this.f23732f)) {
            return;
        }
        this.f23728b.mo13289e(enumC10039q, abstractC10012e);
        this.f23731e = enumC10039q;
        this.f23732f = abstractC10012e;
    }

    @Override // io.grpc.AbstractC10020n0
    /* renamed from: b */
    public void mo13307b(C9497c1 c9497c1) {
        if (this.f23731e != EnumC10039q.READY) {
            m13312p(EnumC10039q.TRANSIENT_FAILURE, new C10009b(c9497c1));
        }
    }

    @Override // io.grpc.AbstractC10020n0
    /* renamed from: c */
    public void mo13306c(AbstractC10020n0.C10028g c10028g) {
        List<C10090y> m13276a = c10028g.m13276a();
        Set<C10090y> keySet = this.f23729c.keySet();
        Map<C10090y, C10090y> m13314n = m13314n(m13276a);
        Set<C10090y> m13317k = m13317k(keySet, m13314n.keySet());
        for (Map.Entry<C10090y, C10090y> entry : m13314n.entrySet()) {
            C10090y key = entry.getKey();
            C10090y value = entry.getValue();
            AbstractC10020n0.AbstractC10030h abstractC10030h = this.f23729c.get(key);
            if (abstractC10030h != null) {
                abstractC10030h.mo13261h(Collections.singletonList(value));
            } else {
                C9477a.C9479b m14629c = C9477a.m14629c();
                m14629c.m14624d(f23726g, new C10011d(C10041r.m13244a(EnumC10039q.IDLE)));
                AbstractC10020n0.AbstractC10025d abstractC10025d = this.f23728b;
                AbstractC10020n0.C10022b.C10023a m13302c = AbstractC10020n0.C10022b.m13302c();
                m13302c.m13297d(value);
                m13302c.m13295f(m14629c.m14627a());
                AbstractC10020n0.AbstractC10030h mo13293a = abstractC10025d.mo13293a(m13302c.m13299b());
                C5051n.m25779o(mo13293a, "subchannel");
                AbstractC10020n0.AbstractC10030h abstractC10030h2 = mo13293a;
                abstractC10030h2.mo13262g(new C10008a(abstractC10030h2));
                this.f23729c.put(key, abstractC10030h2);
                abstractC10030h2.mo13264e();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (C10090y c10090y : m13317k) {
            arrayList.add(this.f23729c.remove(c10090y));
        }
        m13313o();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m13316l((AbstractC10020n0.AbstractC10030h) it.next());
        }
    }

    @Override // io.grpc.AbstractC10020n0
    /* renamed from: d */
    public void mo13305d() {
        for (AbstractC10020n0.AbstractC10030h abstractC10030h : m13320h()) {
            m13316l(abstractC10030h);
        }
        this.f23729c.clear();
    }

    /* renamed from: h */
    Collection<AbstractC10020n0.AbstractC10030h> m13320h() {
        return this.f23729c.values();
    }
}
