package io.grpc.p384h1;

import io.grpc.AbstractC10001l;
import io.grpc.AbstractC10020n0;
import io.grpc.C10043s;
import io.grpc.C10049s0;
import io.grpc.C10060t0;
import io.grpc.C9497c1;
import io.grpc.C9502d;
import io.grpc.C9526h0;
import io.grpc.ExecutorC9513e1;
import io.grpc.p384h1.InterfaceC9693k1;
import io.grpc.p384h1.InterfaceC9753r;
import io.grpc.p384h1.InterfaceC9773s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DelayedClientTransport.java */
/* renamed from: io.grpc.h1.a0 */
/* loaded from: classes2.dex */
public final class C9532a0 implements InterfaceC9693k1 {

    /* renamed from: c */
    private final Executor f22311c;

    /* renamed from: d */
    private final ExecutorC9513e1 f22312d;

    /* renamed from: e */
    private Runnable f22313e;

    /* renamed from: f */
    private Runnable f22314f;

    /* renamed from: g */
    private Runnable f22315g;

    /* renamed from: h */
    private InterfaceC9693k1.InterfaceC9694a f22316h;

    /* renamed from: j */
    private C9497c1 f22318j;

    /* renamed from: k */
    private AbstractC10020n0.AbstractC10031i f22319k;

    /* renamed from: l */
    private long f22320l;

    /* renamed from: a */
    private final C9526h0 f22309a = C9526h0.m14527a(C9532a0.class, null);

    /* renamed from: b */
    private final Object f22310b = new Object();

    /* renamed from: i */
    private Collection<C9537e> f22317i = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DelayedClientTransport.java */
    /* renamed from: io.grpc.h1.a0$a */
    /* loaded from: classes2.dex */
    public class RunnableC9533a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ InterfaceC9693k1.InterfaceC9694a f22321c;

        RunnableC9533a(C9532a0 c9532a0, InterfaceC9693k1.InterfaceC9694a interfaceC9694a) {
            this.f22321c = interfaceC9694a;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22321c.mo13869d(true);
        }
    }

    /* compiled from: DelayedClientTransport.java */
    /* renamed from: io.grpc.h1.a0$b */
    /* loaded from: classes2.dex */
    class RunnableC9534b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ InterfaceC9693k1.InterfaceC9694a f22322c;

        RunnableC9534b(C9532a0 c9532a0, InterfaceC9693k1.InterfaceC9694a interfaceC9694a) {
            this.f22322c = interfaceC9694a;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22322c.mo13869d(false);
        }
    }

    /* compiled from: DelayedClientTransport.java */
    /* renamed from: io.grpc.h1.a0$c */
    /* loaded from: classes2.dex */
    class RunnableC9535c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ InterfaceC9693k1.InterfaceC9694a f22323c;

        RunnableC9535c(C9532a0 c9532a0, InterfaceC9693k1.InterfaceC9694a interfaceC9694a) {
            this.f22323c = interfaceC9694a;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22323c.mo13870c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DelayedClientTransport.java */
    /* renamed from: io.grpc.h1.a0$d */
    /* loaded from: classes2.dex */
    public class RunnableC9536d implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C9497c1 f22324c;

        RunnableC9536d(C9497c1 c9497c1) {
            this.f22324c = c9497c1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9532a0.this.f22316h.mo13872a(this.f22324c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DelayedClientTransport.java */
    /* renamed from: io.grpc.h1.a0$e */
    /* loaded from: classes2.dex */
    public class C9537e extends C9542b0 {

        /* renamed from: j */
        private final AbstractC10020n0.AbstractC10027f f22326j;

        /* renamed from: k */
        private final C10043s f22327k;

        /* renamed from: l */
        private final AbstractC10001l[] f22328l;

        /* synthetic */ C9537e(C9532a0 c9532a0, AbstractC10020n0.AbstractC10027f abstractC10027f, AbstractC10001l[] abstractC10001lArr, RunnableC9533a runnableC9533a) {
            this(abstractC10027f, abstractC10001lArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B */
        public Runnable m14489B(InterfaceC9773s interfaceC9773s) {
            C10043s m13232g = this.f22327k.m13232g();
            try {
                InterfaceC9749q mo13637b = interfaceC9773s.mo13637b(this.f22326j.mo13277c(), this.f22326j.mo13278b(), this.f22326j.mo13279a(), this.f22328l);
                this.f22327k.m13236J(m13232g);
                return m14474x(mo13637b);
            } catch (Throwable th) {
                this.f22327k.m13236J(m13232g);
                throw th;
            }
        }

        @Override // io.grpc.p384h1.C9542b0, io.grpc.p384h1.InterfaceC9749q
        /* renamed from: a */
        public void mo13804a(C9497c1 c9497c1) {
            super.mo13804a(c9497c1);
            synchronized (C9532a0.this.f22310b) {
                if (C9532a0.this.f22315g != null) {
                    boolean remove = C9532a0.this.f22317i.remove(this);
                    if (!C9532a0.this.m14492q() && remove) {
                        C9532a0.this.f22312d.m14533b(C9532a0.this.f22314f);
                        if (C9532a0.this.f22318j != null) {
                            C9532a0.this.f22312d.m14533b(C9532a0.this.f22315g);
                            C9532a0.this.f22315g = null;
                        }
                    }
                }
            }
            C9532a0.this.f22312d.m14534a();
        }

        @Override // io.grpc.p384h1.C9542b0, io.grpc.p384h1.InterfaceC9749q
        /* renamed from: k */
        public void mo13785k(C9811x0 c9811x0) {
            if (this.f22326j.mo13279a().m14557j()) {
                c9811x0.m13939a("wait_for_ready");
            }
            super.mo13785k(c9811x0);
        }

        @Override // io.grpc.p384h1.C9542b0
        /* renamed from: v */
        protected void mo14476v(C9497c1 c9497c1) {
            for (AbstractC10001l abstractC10001l : this.f22328l) {
                abstractC10001l.mo14047i(c9497c1);
            }
        }

        private C9537e(AbstractC10020n0.AbstractC10027f abstractC10027f, AbstractC10001l[] abstractC10001lArr) {
            this.f22327k = C10043s.m13237I();
            this.f22326j = abstractC10027f;
            this.f22328l = abstractC10001lArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9532a0(Executor executor, ExecutorC9513e1 executorC9513e1) {
        this.f22311c = executor;
        this.f22312d = executorC9513e1;
    }

    /* renamed from: o */
    private C9537e m14494o(AbstractC10020n0.AbstractC10027f abstractC10027f, AbstractC10001l[] abstractC10001lArr) {
        C9537e c9537e = new C9537e(this, abstractC10027f, abstractC10001lArr, null);
        this.f22317i.add(c9537e);
        if (m14493p() == 1) {
            this.f22312d.m14533b(this.f22313e);
        }
        return c9537e;
    }

    @Override // io.grpc.p384h1.InterfaceC9773s
    /* renamed from: b */
    public final InterfaceC9749q mo13637b(C10060t0<?, ?> c10060t0, C10049s0 c10049s0, C9502d c9502d, AbstractC10001l[] abstractC10001lArr) {
        InterfaceC9749q c9608f0;
        try {
            C9783t1 c9783t1 = new C9783t1(c10060t0, c10049s0, c9502d);
            AbstractC10020n0.AbstractC10031i abstractC10031i = null;
            long j = -1;
            while (true) {
                synchronized (this.f22310b) {
                    if (this.f22318j != null) {
                        c9608f0 = new C9608f0(this.f22318j, abstractC10001lArr);
                        break;
                    } else if (this.f22319k == null) {
                        c9608f0 = m14494o(c9783t1, abstractC10001lArr);
                        break;
                    } else if (abstractC10031i != null && j == this.f22320l) {
                        c9608f0 = m14494o(c9783t1, abstractC10001lArr);
                        break;
                    } else {
                        abstractC10031i = this.f22319k;
                        j = this.f22320l;
                        InterfaceC9773s m14058j = C9755r0.m14058j(abstractC10031i.mo13260a(c9783t1), c9502d.m14557j());
                        if (m14058j != null) {
                            c9608f0 = m14058j.mo13637b(c9783t1.mo13277c(), c9783t1.mo13278b(), c9783t1.mo13279a(), abstractC10001lArr);
                            break;
                        }
                    }
                }
            }
            return c9608f0;
        } finally {
            this.f22312d.m14534a();
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9693k1
    /* renamed from: c */
    public final void mo13635c(C9497c1 c9497c1) {
        synchronized (this.f22310b) {
            if (this.f22318j != null) {
                return;
            }
            this.f22318j = c9497c1;
            this.f22312d.m14533b(new RunnableC9536d(c9497c1));
            if (!m14492q() && this.f22315g != null) {
                this.f22312d.m14533b(this.f22315g);
                this.f22315g = null;
            }
            this.f22312d.m14534a();
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9693k1
    /* renamed from: d */
    public final void mo13633d(C9497c1 c9497c1) {
        Collection<C9537e> collection;
        Runnable runnable;
        mo13635c(c9497c1);
        synchronized (this.f22310b) {
            collection = this.f22317i;
            runnable = this.f22315g;
            this.f22315g = null;
            if (!this.f22317i.isEmpty()) {
                this.f22317i = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (C9537e c9537e : collection) {
                Runnable m14474x = c9537e.m14474x(new C9608f0(c9497c1, InterfaceC9753r.EnumC9754a.REFUSED, c9537e.f22328l));
                if (m14474x != null) {
                    m14474x.run();
                }
            }
            this.f22312d.execute(runnable);
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9693k1
    /* renamed from: e */
    public final Runnable mo13631e(InterfaceC9693k1.InterfaceC9694a interfaceC9694a) {
        this.f22316h = interfaceC9694a;
        this.f22313e = new RunnableC9533a(this, interfaceC9694a);
        this.f22314f = new RunnableC9534b(this, interfaceC9694a);
        this.f22315g = new RunnableC9535c(this, interfaceC9694a);
        return null;
    }

    @Override // io.grpc.InterfaceC10006l0
    /* renamed from: f */
    public C9526h0 mo13324f() {
        return this.f22309a;
    }

    @Override // io.grpc.p384h1.InterfaceC9773s
    /* renamed from: g */
    public final void mo13628g(InterfaceC9773s.InterfaceC9774a interfaceC9774a, Executor executor) {
        throw new UnsupportedOperationException("This method is not expected to be called");
    }

    /* renamed from: p */
    final int m14493p() {
        int size;
        synchronized (this.f22310b) {
            size = this.f22317i.size();
        }
        return size;
    }

    /* renamed from: q */
    public final boolean m14492q() {
        boolean z;
        synchronized (this.f22310b) {
            z = !this.f22317i.isEmpty();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final void m14491r(AbstractC10020n0.AbstractC10031i abstractC10031i) {
        synchronized (this.f22310b) {
            this.f22319k = abstractC10031i;
            this.f22320l++;
            if (abstractC10031i != null && m14492q()) {
                ArrayList arrayList = new ArrayList(this.f22317i);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C9537e c9537e = (C9537e) it.next();
                    AbstractC10020n0.C10026e mo13260a = abstractC10031i.mo13260a(c9537e.f22326j);
                    C9502d mo13279a = c9537e.f22326j.mo13279a();
                    InterfaceC9773s m14058j = C9755r0.m14058j(mo13260a, mo13279a.m14557j());
                    if (m14058j != null) {
                        Executor executor = this.f22311c;
                        if (mo13279a.m14562e() != null) {
                            executor = mo13279a.m14562e();
                        }
                        Runnable m14489B = c9537e.m14489B(m14058j);
                        if (m14489B != null) {
                            executor.execute(m14489B);
                        }
                        arrayList2.add(c9537e);
                    }
                }
                synchronized (this.f22310b) {
                    if (m14492q()) {
                        this.f22317i.removeAll(arrayList2);
                        if (this.f22317i.isEmpty()) {
                            this.f22317i = new LinkedHashSet();
                        }
                        if (!m14492q()) {
                            this.f22312d.m14533b(this.f22314f);
                            if (this.f22318j != null && this.f22315g != null) {
                                this.f22312d.m14533b(this.f22315g);
                                this.f22315g = null;
                            }
                        }
                        this.f22312d.m14534a();
                    }
                }
            }
        }
    }
}
