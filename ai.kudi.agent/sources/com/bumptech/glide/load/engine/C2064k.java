package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.C1947d;
import com.bumptech.glide.EnumC1949f;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.InterfaceC2118f;
import com.bumptech.glide.load.InterfaceC2126l;
import com.bumptech.glide.load.engine.C2080p;
import com.bumptech.glide.load.engine.RunnableC2049h;
import com.bumptech.glide.load.engine.p067a0.C2015b;
import com.bumptech.glide.load.engine.p067a0.InterfaceC2012a;
import com.bumptech.glide.load.engine.p067a0.InterfaceC2025h;
import com.bumptech.glide.load.engine.p068b0.ExecutorServiceC2035a;
import com.bumptech.glide.p082o.InterfaceC2353g;
import com.bumptech.glide.p086q.C2376f;
import com.bumptech.glide.p086q.C2380j;
import com.bumptech.glide.p086q.p087l.C2383a;
import java.util.Map;
import java.util.concurrent.Executor;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: Engine.java */
/* renamed from: com.bumptech.glide.load.engine.k */
/* loaded from: classes2.dex */
public class C2064k implements InterfaceC2077m, InterfaceC2025h.InterfaceC2026a, C2080p.InterfaceC2081a {

    /* renamed from: i */
    private static final boolean f6255i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    private final C2083r f6256a;

    /* renamed from: b */
    private final C2079o f6257b;

    /* renamed from: c */
    private final InterfaceC2025h f6258c;

    /* renamed from: d */
    private final C2067b f6259d;

    /* renamed from: e */
    private final C2090x f6260e;

    /* renamed from: f */
    private final C2069c f6261f;

    /* renamed from: g */
    private final C2065a f6262g;

    /* renamed from: h */
    private final C2006a f6263h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Engine.java */
    /* renamed from: com.bumptech.glide.load.engine.k$a */
    /* loaded from: classes2.dex */
    public static class C2065a {

        /* renamed from: a */
        final RunnableC2049h.InterfaceC2054e f6264a;

        /* renamed from: b */
        final InterfaceC7672e<RunnableC2049h<?>> f6265b = C2383a.m33105d(150, new C2066a());

        /* renamed from: c */
        private int f6266c;

        /* compiled from: Engine.java */
        /* renamed from: com.bumptech.glide.load.engine.k$a$a */
        /* loaded from: classes2.dex */
        class C2066a implements C2383a.InterfaceC2387d<RunnableC2049h<?>> {
            C2066a() {
            }

            @Override // com.bumptech.glide.p086q.p087l.C2383a.InterfaceC2387d
            /* renamed from: a */
            public RunnableC2049h<?> create() {
                C2065a c2065a = C2065a.this;
                return new RunnableC2049h<>(c2065a.f6264a, c2065a.f6265b);
            }
        }

        C2065a(RunnableC2049h.InterfaceC2054e interfaceC2054e) {
            this.f6264a = interfaceC2054e;
        }

        /* renamed from: a */
        <R> RunnableC2049h<R> m33803a(C1947d c1947d, Object obj, C2078n c2078n, InterfaceC2118f interfaceC2118f, int i, int i2, Class<?> cls, Class<R> cls2, EnumC1949f enumC1949f, AbstractC2060j abstractC2060j, Map<Class<?>, InterfaceC2126l<?>> map, boolean z, boolean z2, boolean z3, C2122h c2122h, RunnableC2049h.InterfaceC2051b<R> interfaceC2051b) {
            RunnableC2049h<?> mo11982b = this.f6265b.mo11982b();
            C2380j.m33129d(mo11982b);
            RunnableC2049h<R> runnableC2049h = (RunnableC2049h<R>) mo11982b;
            int i3 = this.f6266c;
            this.f6266c = i3 + 1;
            runnableC2049h.m33832w(c1947d, obj, c2078n, interfaceC2118f, i, i2, cls, cls2, enumC1949f, abstractC2060j, map, z, z2, z3, c2122h, interfaceC2051b, i3);
            return runnableC2049h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Engine.java */
    /* renamed from: com.bumptech.glide.load.engine.k$b */
    /* loaded from: classes2.dex */
    public static class C2067b {

        /* renamed from: a */
        final ExecutorServiceC2035a f6268a;

        /* renamed from: b */
        final ExecutorServiceC2035a f6269b;

        /* renamed from: c */
        final ExecutorServiceC2035a f6270c;

        /* renamed from: d */
        final ExecutorServiceC2035a f6271d;

        /* renamed from: e */
        final InterfaceC2077m f6272e;

        /* renamed from: f */
        final C2080p.InterfaceC2081a f6273f;

        /* renamed from: g */
        final InterfaceC7672e<C2071l<?>> f6274g = C2383a.m33105d(150, new C2068a());

        /* compiled from: Engine.java */
        /* renamed from: com.bumptech.glide.load.engine.k$b$a */
        /* loaded from: classes2.dex */
        class C2068a implements C2383a.InterfaceC2387d<C2071l<?>> {
            C2068a() {
            }

            @Override // com.bumptech.glide.p086q.p087l.C2383a.InterfaceC2387d
            /* renamed from: a */
            public C2071l<?> create() {
                C2067b c2067b = C2067b.this;
                return new C2071l<>(c2067b.f6268a, c2067b.f6269b, c2067b.f6270c, c2067b.f6271d, c2067b.f6272e, c2067b.f6273f, c2067b.f6274g);
            }
        }

        C2067b(ExecutorServiceC2035a executorServiceC2035a, ExecutorServiceC2035a executorServiceC2035a2, ExecutorServiceC2035a executorServiceC2035a3, ExecutorServiceC2035a executorServiceC2035a4, InterfaceC2077m interfaceC2077m, C2080p.InterfaceC2081a interfaceC2081a) {
            this.f6268a = executorServiceC2035a;
            this.f6269b = executorServiceC2035a2;
            this.f6270c = executorServiceC2035a3;
            this.f6271d = executorServiceC2035a4;
            this.f6272e = interfaceC2077m;
            this.f6273f = interfaceC2081a;
        }

        /* renamed from: a */
        <R> C2071l<R> m33801a(InterfaceC2118f interfaceC2118f, boolean z, boolean z2, boolean z3, boolean z4) {
            C2071l<?> mo11982b = this.f6274g.mo11982b();
            C2380j.m33129d(mo11982b);
            C2071l<R> c2071l = (C2071l<R>) mo11982b;
            c2071l.m33787l(interfaceC2118f, z, z2, z3, z4);
            return c2071l;
        }
    }

    /* compiled from: Engine.java */
    /* renamed from: com.bumptech.glide.load.engine.k$c */
    /* loaded from: classes2.dex */
    private static class C2069c implements RunnableC2049h.InterfaceC2054e {

        /* renamed from: a */
        private final InterfaceC2012a.InterfaceC2013a f6276a;

        /* renamed from: b */
        private volatile InterfaceC2012a f6277b;

        C2069c(InterfaceC2012a.InterfaceC2013a interfaceC2013a) {
            this.f6276a = interfaceC2013a;
        }

        @Override // com.bumptech.glide.load.engine.RunnableC2049h.InterfaceC2054e
        /* renamed from: a */
        public InterfaceC2012a mo33799a() {
            if (this.f6277b == null) {
                synchronized (this) {
                    if (this.f6277b == null) {
                        this.f6277b = this.f6276a.build();
                    }
                    if (this.f6277b == null) {
                        this.f6277b = new C2015b();
                    }
                }
            }
            return this.f6277b;
        }
    }

    /* compiled from: Engine.java */
    /* renamed from: com.bumptech.glide.load.engine.k$d */
    /* loaded from: classes2.dex */
    public class C2070d {

        /* renamed from: a */
        private final C2071l<?> f6278a;

        /* renamed from: b */
        private final InterfaceC2353g f6279b;

        C2070d(InterfaceC2353g interfaceC2353g, C2071l<?> c2071l) {
            this.f6279b = interfaceC2353g;
            this.f6278a = c2071l;
        }

        /* renamed from: a */
        public void m33798a() {
            synchronized (C2064k.this) {
                this.f6278a.m33781r(this.f6279b);
            }
        }
    }

    public C2064k(InterfaceC2025h interfaceC2025h, InterfaceC2012a.InterfaceC2013a interfaceC2013a, ExecutorServiceC2035a executorServiceC2035a, ExecutorServiceC2035a executorServiceC2035a2, ExecutorServiceC2035a executorServiceC2035a3, ExecutorServiceC2035a executorServiceC2035a4, boolean z) {
        this(interfaceC2025h, interfaceC2013a, executorServiceC2035a, executorServiceC2035a2, executorServiceC2035a3, executorServiceC2035a4, null, null, null, null, null, null, z);
    }

    /* renamed from: e */
    private C2080p<?> m33811e(InterfaceC2118f interfaceC2118f) {
        InterfaceC2087u<?> mo33908d = this.f6258c.mo33908d(interfaceC2118f);
        if (mo33908d == null) {
            return null;
        }
        if (mo33908d instanceof C2080p) {
            return (C2080p) mo33908d;
        }
        return new C2080p<>(mo33908d, true, true, interfaceC2118f, this);
    }

    /* renamed from: g */
    private C2080p<?> m33809g(InterfaceC2118f interfaceC2118f) {
        C2080p<?> m33926e = this.f6263h.m33926e(interfaceC2118f);
        if (m33926e != null) {
            m33926e.m33770a();
        }
        return m33926e;
    }

    /* renamed from: h */
    private C2080p<?> m33808h(InterfaceC2118f interfaceC2118f) {
        C2080p<?> m33811e = m33811e(interfaceC2118f);
        if (m33811e != null) {
            m33811e.m33770a();
            this.f6263h.m33930a(interfaceC2118f, m33811e);
        }
        return m33811e;
    }

    /* renamed from: i */
    private C2080p<?> m33807i(C2078n c2078n, boolean z, long j) {
        if (z) {
            C2080p<?> m33809g = m33809g(c2078n);
            if (m33809g != null) {
                if (f6255i) {
                    m33806j("Loaded resource from active resources", j, c2078n);
                }
                return m33809g;
            }
            C2080p<?> m33808h = m33808h(c2078n);
            if (m33808h != null) {
                if (f6255i) {
                    m33806j("Loaded resource from cache", j, c2078n);
                }
                return m33808h;
            }
            return null;
        }
        return null;
    }

    /* renamed from: j */
    private static void m33806j(String str, long j, InterfaceC2118f interfaceC2118f) {
        Log.v("Engine", str + " in " + C2376f.m33146a(j) + "ms, key: " + interfaceC2118f);
    }

    /* renamed from: l */
    private <R> C2070d m33804l(C1947d c1947d, Object obj, InterfaceC2118f interfaceC2118f, int i, int i2, Class<?> cls, Class<R> cls2, EnumC1949f enumC1949f, AbstractC2060j abstractC2060j, Map<Class<?>, InterfaceC2126l<?>> map, boolean z, boolean z2, C2122h c2122h, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC2353g interfaceC2353g, Executor executor, C2078n c2078n, long j) {
        C2071l<?> m33765a = this.f6256a.m33765a(c2078n, z6);
        if (m33765a != null) {
            m33765a.m33797a(interfaceC2353g, executor);
            if (f6255i) {
                m33806j("Added to existing load", j, c2078n);
            }
            return new C2070d(interfaceC2353g, m33765a);
        }
        C2071l<R> m33801a = this.f6259d.m33801a(c2078n, z3, z4, z5, z6);
        RunnableC2049h<R> m33803a = this.f6262g.m33803a(c1947d, obj, c2078n, interfaceC2118f, i, i2, cls, cls2, enumC1949f, abstractC2060j, map, z, z2, z6, c2122h, m33801a);
        this.f6256a.m33763c(c2078n, m33801a);
        m33801a.m33797a(interfaceC2353g, executor);
        m33801a.m33780s(m33803a);
        if (f6255i) {
            m33806j("Started new load", j, c2078n);
        }
        return new C2070d(interfaceC2353g, m33801a);
    }

    @Override // com.bumptech.glide.load.engine.p067a0.InterfaceC2025h.InterfaceC2026a
    /* renamed from: a */
    public void mo33812a(InterfaceC2087u<?> interfaceC2087u) {
        this.f6260e.m33752a(interfaceC2087u, true);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2077m
    /* renamed from: b */
    public synchronized void mo33773b(C2071l<?> c2071l, InterfaceC2118f interfaceC2118f, C2080p<?> c2080p) {
        if (c2080p != null) {
            if (c2080p.m33768e()) {
                this.f6263h.m33930a(interfaceC2118f, c2080p);
            }
        }
        this.f6256a.m33762d(interfaceC2118f, c2071l);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2077m
    /* renamed from: c */
    public synchronized void mo33772c(C2071l<?> c2071l, InterfaceC2118f interfaceC2118f) {
        this.f6256a.m33762d(interfaceC2118f, c2071l);
    }

    @Override // com.bumptech.glide.load.engine.C2080p.InterfaceC2081a
    /* renamed from: d */
    public void mo33766d(InterfaceC2118f interfaceC2118f, C2080p<?> c2080p) {
        this.f6263h.m33927d(interfaceC2118f);
        if (c2080p.m33768e()) {
            this.f6258c.mo33909c(interfaceC2118f, c2080p);
        } else {
            this.f6260e.m33752a(c2080p, false);
        }
    }

    /* renamed from: f */
    public <R> C2070d m33810f(C1947d c1947d, Object obj, InterfaceC2118f interfaceC2118f, int i, int i2, Class<?> cls, Class<R> cls2, EnumC1949f enumC1949f, AbstractC2060j abstractC2060j, Map<Class<?>, InterfaceC2126l<?>> map, boolean z, boolean z2, C2122h c2122h, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC2353g interfaceC2353g, Executor executor) {
        long m33145b = f6255i ? C2376f.m33145b() : 0L;
        C2078n m33771a = this.f6257b.m33771a(obj, interfaceC2118f, i, i2, map, cls, cls2, c2122h);
        synchronized (this) {
            C2080p<?> m33807i = m33807i(m33771a, z3, m33145b);
            if (m33807i == null) {
                return m33804l(c1947d, obj, interfaceC2118f, i, i2, cls, cls2, enumC1949f, abstractC2060j, map, z, z2, c2122h, z3, z4, z5, z6, interfaceC2353g, executor, m33771a, m33145b);
            }
            interfaceC2353g.mo33200c(m33807i, EnumC1993a.MEMORY_CACHE);
            return null;
        }
    }

    /* renamed from: k */
    public void m33805k(InterfaceC2087u<?> interfaceC2087u) {
        if (interfaceC2087u instanceof C2080p) {
            ((C2080p) interfaceC2087u).m33767f();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    C2064k(InterfaceC2025h interfaceC2025h, InterfaceC2012a.InterfaceC2013a interfaceC2013a, ExecutorServiceC2035a executorServiceC2035a, ExecutorServiceC2035a executorServiceC2035a2, ExecutorServiceC2035a executorServiceC2035a3, ExecutorServiceC2035a executorServiceC2035a4, C2083r c2083r, C2079o c2079o, C2006a c2006a, C2067b c2067b, C2065a c2065a, C2090x c2090x, boolean z) {
        this.f6258c = interfaceC2025h;
        this.f6261f = new C2069c(interfaceC2013a);
        C2006a c2006a2 = c2006a == null ? new C2006a(z) : c2006a;
        this.f6263h = c2006a2;
        c2006a2.m33925f(this);
        this.f6257b = c2079o == null ? new C2079o() : c2079o;
        this.f6256a = c2083r == null ? new C2083r() : c2083r;
        this.f6259d = c2067b == null ? new C2067b(executorServiceC2035a, executorServiceC2035a2, executorServiceC2035a3, executorServiceC2035a4, this, this) : c2067b;
        this.f6262g = c2065a == null ? new C2065a(this.f6261f) : c2065a;
        this.f6260e = c2090x == null ? new C2090x() : c2090x;
        interfaceC2025h.mo33907e(this);
    }
}
