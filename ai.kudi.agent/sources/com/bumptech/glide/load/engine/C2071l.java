package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.InterfaceC2118f;
import com.bumptech.glide.load.engine.C2080p;
import com.bumptech.glide.load.engine.RunnableC2049h;
import com.bumptech.glide.load.engine.p068b0.ExecutorServiceC2035a;
import com.bumptech.glide.p082o.InterfaceC2353g;
import com.bumptech.glide.p086q.C2373e;
import com.bumptech.glide.p086q.C2380j;
import com.bumptech.glide.p086q.p087l.AbstractC2392c;
import com.bumptech.glide.p086q.p087l.C2383a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: EngineJob.java */
/* renamed from: com.bumptech.glide.load.engine.l */
/* loaded from: classes2.dex */
class C2071l<R> implements RunnableC2049h.InterfaceC2051b<R>, C2383a.InterfaceC2389f {

    /* renamed from: Q */
    private static final C2074c f6281Q = new C2074c();

    /* renamed from: A */
    private final ExecutorServiceC2035a f6282A;

    /* renamed from: B */
    private final ExecutorServiceC2035a f6283B;

    /* renamed from: C */
    private final AtomicInteger f6284C;

    /* renamed from: D */
    private InterfaceC2118f f6285D;

    /* renamed from: E */
    private boolean f6286E;

    /* renamed from: F */
    private boolean f6287F;

    /* renamed from: G */
    private boolean f6288G;

    /* renamed from: H */
    private boolean f6289H;

    /* renamed from: I */
    private InterfaceC2087u<?> f6290I;

    /* renamed from: J */
    EnumC1993a f6291J;

    /* renamed from: K */
    private boolean f6292K;

    /* renamed from: L */
    GlideException f6293L;

    /* renamed from: M */
    private boolean f6294M;

    /* renamed from: N */
    C2080p<?> f6295N;

    /* renamed from: O */
    private RunnableC2049h<R> f6296O;

    /* renamed from: P */
    private volatile boolean f6297P;

    /* renamed from: c */
    final C2076e f6298c;

    /* renamed from: d */
    private final AbstractC2392c f6299d;

    /* renamed from: e */
    private final C2080p.InterfaceC2081a f6300e;

    /* renamed from: f */
    private final InterfaceC7672e<C2071l<?>> f6301f;

    /* renamed from: w */
    private final C2074c f6302w;

    /* renamed from: x */
    private final InterfaceC2077m f6303x;

    /* renamed from: y */
    private final ExecutorServiceC2035a f6304y;

    /* renamed from: z */
    private final ExecutorServiceC2035a f6305z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EngineJob.java */
    /* renamed from: com.bumptech.glide.load.engine.l$a */
    /* loaded from: classes2.dex */
    public class RunnableC2072a implements Runnable {

        /* renamed from: c */
        private final InterfaceC2353g f6306c;

        RunnableC2072a(InterfaceC2353g interfaceC2353g) {
            this.f6306c = interfaceC2353g;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f6306c.mo33199i()) {
                synchronized (C2071l.this) {
                    if (C2071l.this.f6298c.m33777e(this.f6306c)) {
                        C2071l.this.m33793e(this.f6306c);
                    }
                    C2071l.this.m33790i();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EngineJob.java */
    /* renamed from: com.bumptech.glide.load.engine.l$b */
    /* loaded from: classes2.dex */
    public class RunnableC2073b implements Runnable {

        /* renamed from: c */
        private final InterfaceC2353g f6308c;

        RunnableC2073b(InterfaceC2353g interfaceC2353g) {
            this.f6308c = interfaceC2353g;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f6308c.mo33199i()) {
                synchronized (C2071l.this) {
                    if (C2071l.this.f6298c.m33777e(this.f6308c)) {
                        C2071l.this.f6295N.m33770a();
                        C2071l.this.m33792f(this.f6308c);
                        C2071l.this.m33781r(this.f6308c);
                    }
                    C2071l.this.m33790i();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineJob.java */
    /* renamed from: com.bumptech.glide.load.engine.l$c */
    /* loaded from: classes2.dex */
    public static class C2074c {
        C2074c() {
        }

        /* renamed from: a */
        public <R> C2080p<R> m33779a(InterfaceC2087u<R> interfaceC2087u, boolean z, InterfaceC2118f interfaceC2118f, C2080p.InterfaceC2081a interfaceC2081a) {
            return new C2080p<>(interfaceC2087u, z, true, interfaceC2118f, interfaceC2081a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineJob.java */
    /* renamed from: com.bumptech.glide.load.engine.l$d */
    /* loaded from: classes2.dex */
    public static final class C2075d {

        /* renamed from: a */
        final InterfaceC2353g f6310a;

        /* renamed from: b */
        final Executor f6311b;

        C2075d(InterfaceC2353g interfaceC2353g, Executor executor) {
            this.f6310a = interfaceC2353g;
            this.f6311b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2075d) {
                return this.f6310a.equals(((C2075d) obj).f6310a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6310a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineJob.java */
    /* renamed from: com.bumptech.glide.load.engine.l$e */
    /* loaded from: classes2.dex */
    public static final class C2076e implements Iterable<C2075d> {

        /* renamed from: c */
        private final List<C2075d> f6312c;

        C2076e() {
            this(new ArrayList(2));
        }

        /* renamed from: h */
        private static C2075d m33775h(InterfaceC2353g interfaceC2353g) {
            return new C2075d(interfaceC2353g, C2373e.m33148a());
        }

        void clear() {
            this.f6312c.clear();
        }

        /* renamed from: d */
        void m33778d(InterfaceC2353g interfaceC2353g, Executor executor) {
            this.f6312c.add(new C2075d(interfaceC2353g, executor));
        }

        /* renamed from: e */
        boolean m33777e(InterfaceC2353g interfaceC2353g) {
            return this.f6312c.contains(m33775h(interfaceC2353g));
        }

        /* renamed from: f */
        C2076e m33776f() {
            return new C2076e(new ArrayList(this.f6312c));
        }

        boolean isEmpty() {
            return this.f6312c.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<C2075d> iterator() {
            return this.f6312c.iterator();
        }

        /* renamed from: k */
        void m33774k(InterfaceC2353g interfaceC2353g) {
            this.f6312c.remove(m33775h(interfaceC2353g));
        }

        int size() {
            return this.f6312c.size();
        }

        C2076e(List<C2075d> list) {
            this.f6312c = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2071l(ExecutorServiceC2035a executorServiceC2035a, ExecutorServiceC2035a executorServiceC2035a2, ExecutorServiceC2035a executorServiceC2035a3, ExecutorServiceC2035a executorServiceC2035a4, InterfaceC2077m interfaceC2077m, C2080p.InterfaceC2081a interfaceC2081a, InterfaceC7672e<C2071l<?>> interfaceC7672e) {
        this(executorServiceC2035a, executorServiceC2035a2, executorServiceC2035a3, executorServiceC2035a4, interfaceC2077m, interfaceC2081a, interfaceC7672e, f6281Q);
    }

    /* renamed from: j */
    private ExecutorServiceC2035a m33789j() {
        if (this.f6287F) {
            return this.f6282A;
        }
        return this.f6288G ? this.f6283B : this.f6305z;
    }

    /* renamed from: m */
    private boolean m33786m() {
        return this.f6294M || this.f6292K || this.f6297P;
    }

    /* renamed from: q */
    private synchronized void m33782q() {
        if (this.f6285D != null) {
            this.f6298c.clear();
            this.f6285D = null;
            this.f6295N = null;
            this.f6290I = null;
            this.f6294M = false;
            this.f6297P = false;
            this.f6292K = false;
            this.f6296O.m33848O(false);
            this.f6296O = null;
            this.f6293L = null;
            this.f6291J = null;
            this.f6301f.mo11983a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m33797a(InterfaceC2353g interfaceC2353g, Executor executor) {
        this.f6299d.mo33092c();
        this.f6298c.m33778d(interfaceC2353g, executor);
        boolean z = true;
        if (this.f6292K) {
            m33788k(1);
            executor.execute(new RunnableC2073b(interfaceC2353g));
        } else if (this.f6294M) {
            m33788k(1);
            executor.execute(new RunnableC2072a(interfaceC2353g));
        } else {
            if (this.f6297P) {
                z = false;
            }
            C2380j.m33132a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    @Override // com.bumptech.glide.load.engine.RunnableC2049h.InterfaceC2051b
    /* renamed from: b */
    public void mo33796b(GlideException glideException) {
        synchronized (this) {
            this.f6293L = glideException;
        }
        m33785n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.RunnableC2049h.InterfaceC2051b
    /* renamed from: c */
    public void mo33795c(InterfaceC2087u<R> interfaceC2087u, EnumC1993a enumC1993a) {
        synchronized (this) {
            this.f6290I = interfaceC2087u;
            this.f6291J = enumC1993a;
        }
        m33784o();
    }

    @Override // com.bumptech.glide.load.engine.RunnableC2049h.InterfaceC2051b
    /* renamed from: d */
    public void mo33794d(RunnableC2049h<?> runnableC2049h) {
        m33789j().execute(runnableC2049h);
    }

    /* renamed from: e */
    void m33793e(InterfaceC2353g interfaceC2353g) {
        try {
            interfaceC2353g.mo33201b(this.f6293L);
        } catch (Throwable th) {
            throw new C2034b(th);
        }
    }

    /* renamed from: f */
    void m33792f(InterfaceC2353g interfaceC2353g) {
        try {
            interfaceC2353g.mo33200c(this.f6295N, this.f6291J);
        } catch (Throwable th) {
            throw new C2034b(th);
        }
    }

    @Override // com.bumptech.glide.p086q.p087l.C2383a.InterfaceC2389f
    /* renamed from: g */
    public AbstractC2392c mo33100g() {
        return this.f6299d;
    }

    /* renamed from: h */
    void m33791h() {
        if (m33786m()) {
            return;
        }
        this.f6297P = true;
        this.f6296O.m33841a();
        this.f6303x.mo33772c(this, this.f6285D);
    }

    /* renamed from: i */
    void m33790i() {
        C2080p<?> c2080p;
        synchronized (this) {
            this.f6299d.mo33092c();
            C2380j.m33132a(m33786m(), "Not yet complete!");
            int decrementAndGet = this.f6284C.decrementAndGet();
            C2380j.m33132a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                c2080p = this.f6295N;
                m33782q();
            } else {
                c2080p = null;
            }
        }
        if (c2080p != null) {
            c2080p.m33767f();
        }
    }

    /* renamed from: k */
    synchronized void m33788k(int i) {
        C2380j.m33132a(m33786m(), "Not yet complete!");
        if (this.f6284C.getAndAdd(i) == 0 && this.f6295N != null) {
            this.f6295N.m33770a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public synchronized C2071l<R> m33787l(InterfaceC2118f interfaceC2118f, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f6285D = interfaceC2118f;
        this.f6286E = z;
        this.f6287F = z2;
        this.f6288G = z3;
        this.f6289H = z4;
        return this;
    }

    /* renamed from: n */
    void m33785n() {
        synchronized (this) {
            this.f6299d.mo33092c();
            if (this.f6297P) {
                m33782q();
            } else if (!this.f6298c.isEmpty()) {
                if (!this.f6294M) {
                    this.f6294M = true;
                    InterfaceC2118f interfaceC2118f = this.f6285D;
                    C2076e m33776f = this.f6298c.m33776f();
                    m33788k(m33776f.size() + 1);
                    this.f6303x.mo33773b(this, interfaceC2118f, null);
                    Iterator<C2075d> it = m33776f.iterator();
                    while (it.hasNext()) {
                        C2075d next = it.next();
                        next.f6311b.execute(new RunnableC2072a(next.f6310a));
                    }
                    m33790i();
                    return;
                }
                throw new IllegalStateException("Already failed once");
            } else {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
        }
    }

    /* renamed from: o */
    void m33784o() {
        synchronized (this) {
            this.f6299d.mo33092c();
            if (this.f6297P) {
                this.f6290I.mo33303b();
                m33782q();
            } else if (!this.f6298c.isEmpty()) {
                if (!this.f6292K) {
                    this.f6295N = this.f6302w.m33779a(this.f6290I, this.f6286E, this.f6285D, this.f6300e);
                    this.f6292K = true;
                    C2076e m33776f = this.f6298c.m33776f();
                    m33788k(m33776f.size() + 1);
                    this.f6303x.mo33773b(this, this.f6285D, this.f6295N);
                    Iterator<C2075d> it = m33776f.iterator();
                    while (it.hasNext()) {
                        C2075d next = it.next();
                        next.f6311b.execute(new RunnableC2073b(next.f6310a));
                    }
                    m33790i();
                    return;
                }
                throw new IllegalStateException("Already have resource");
            } else {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m33783p() {
        return this.f6289H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public synchronized void m33781r(InterfaceC2353g interfaceC2353g) {
        boolean z;
        this.f6299d.mo33092c();
        this.f6298c.m33774k(interfaceC2353g);
        if (this.f6298c.isEmpty()) {
            m33791h();
            if (!this.f6292K && !this.f6294M) {
                z = false;
                if (z && this.f6284C.get() == 0) {
                    m33782q();
                }
            }
            z = true;
            if (z) {
                m33782q();
            }
        }
    }

    /* renamed from: s */
    public synchronized void m33780s(RunnableC2049h<R> runnableC2049h) {
        this.f6296O = runnableC2049h;
        (runnableC2049h.m33842X() ? this.f6304y : m33789j()).execute(runnableC2049h);
    }

    C2071l(ExecutorServiceC2035a executorServiceC2035a, ExecutorServiceC2035a executorServiceC2035a2, ExecutorServiceC2035a executorServiceC2035a3, ExecutorServiceC2035a executorServiceC2035a4, InterfaceC2077m interfaceC2077m, C2080p.InterfaceC2081a interfaceC2081a, InterfaceC7672e<C2071l<?>> interfaceC7672e, C2074c c2074c) {
        this.f6298c = new C2076e();
        this.f6299d = AbstractC2392c.m33094a();
        this.f6284C = new AtomicInteger();
        this.f6304y = executorServiceC2035a;
        this.f6305z = executorServiceC2035a2;
        this.f6282A = executorServiceC2035a3;
        this.f6283B = executorServiceC2035a4;
        this.f6303x = interfaceC2077m;
        this.f6300e = interfaceC2081a;
        this.f6301f = interfaceC7672e;
        this.f6302w = c2074c;
    }
}
