package io.grpc.p384h1;

import com.google.common.base.C5051n;
import io.grpc.C10049s0;
import io.grpc.C10065u;
import io.grpc.C10082w;
import io.grpc.C9477a;
import io.grpc.C9497c1;
import io.grpc.InterfaceC10033o;
import io.grpc.p384h1.InterfaceC9695k2;
import io.grpc.p384h1.InterfaceC9753r;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DelayedStream.java */
/* renamed from: io.grpc.h1.b0 */
/* loaded from: classes2.dex */
class C9542b0 implements InterfaceC9749q {

    /* renamed from: a */
    private volatile boolean f22338a;

    /* renamed from: b */
    private InterfaceC9753r f22339b;

    /* renamed from: c */
    private InterfaceC9749q f22340c;

    /* renamed from: d */
    private C9497c1 f22341d;

    /* renamed from: f */
    private C9557o f22343f;

    /* renamed from: g */
    private long f22344g;

    /* renamed from: h */
    private long f22345h;

    /* renamed from: e */
    private List<Runnable> f22342e = new ArrayList();

    /* renamed from: i */
    private List<Runnable> f22346i = new ArrayList();

    /* compiled from: DelayedStream.java */
    /* renamed from: io.grpc.h1.b0$a */
    /* loaded from: classes2.dex */
    class RunnableC9543a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ int f22347c;

        RunnableC9543a(int i) {
            this.f22347c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9542b0.this.f22340c.mo13800c(this.f22347c);
        }
    }

    /* compiled from: DelayedStream.java */
    /* renamed from: io.grpc.h1.b0$b */
    /* loaded from: classes2.dex */
    class RunnableC9544b implements Runnable {
        RunnableC9544b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9542b0.this.f22340c.mo13794f();
        }
    }

    /* compiled from: DelayedStream.java */
    /* renamed from: io.grpc.h1.b0$c */
    /* loaded from: classes2.dex */
    class RunnableC9545c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ InterfaceC10033o f22350c;

        RunnableC9545c(InterfaceC10033o interfaceC10033o) {
            this.f22350c = interfaceC10033o;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9542b0.this.f22340c.mo13802b(this.f22350c);
        }
    }

    /* compiled from: DelayedStream.java */
    /* renamed from: io.grpc.h1.b0$d */
    /* loaded from: classes2.dex */
    class RunnableC9546d implements Runnable {

        /* renamed from: c */
        final /* synthetic */ boolean f22352c;

        RunnableC9546d(boolean z) {
            this.f22352c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9542b0.this.f22340c.mo13779q(this.f22352c);
        }
    }

    /* compiled from: DelayedStream.java */
    /* renamed from: io.grpc.h1.b0$e */
    /* loaded from: classes2.dex */
    class RunnableC9547e implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C10082w f22354c;

        RunnableC9547e(C10082w c10082w) {
            this.f22354c = c10082w;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9542b0.this.f22340c.mo13788i(this.f22354c);
        }
    }

    /* compiled from: DelayedStream.java */
    /* renamed from: io.grpc.h1.b0$f */
    /* loaded from: classes2.dex */
    class RunnableC9548f implements Runnable {

        /* renamed from: c */
        final /* synthetic */ int f22356c;

        RunnableC9548f(int i) {
            this.f22356c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9542b0.this.f22340c.mo13792g(this.f22356c);
        }
    }

    /* compiled from: DelayedStream.java */
    /* renamed from: io.grpc.h1.b0$g */
    /* loaded from: classes2.dex */
    class RunnableC9549g implements Runnable {

        /* renamed from: c */
        final /* synthetic */ int f22358c;

        RunnableC9549g(int i) {
            this.f22358c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9542b0.this.f22340c.mo13790h(this.f22358c);
        }
    }

    /* compiled from: DelayedStream.java */
    /* renamed from: io.grpc.h1.b0$h */
    /* loaded from: classes2.dex */
    class RunnableC9550h implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C10065u f22360c;

        RunnableC9550h(C10065u c10065u) {
            this.f22360c = c10065u;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9542b0.this.f22340c.mo13782n(this.f22360c);
        }
    }

    /* compiled from: DelayedStream.java */
    /* renamed from: io.grpc.h1.b0$i */
    /* loaded from: classes2.dex */
    class RunnableC9551i implements Runnable {
        RunnableC9551i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9542b0.this.m14478t();
        }
    }

    /* compiled from: DelayedStream.java */
    /* renamed from: io.grpc.h1.b0$j */
    /* loaded from: classes2.dex */
    class RunnableC9552j implements Runnable {

        /* renamed from: c */
        final /* synthetic */ String f22363c;

        RunnableC9552j(String str) {
            this.f22363c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9542b0.this.f22340c.mo13691j(this.f22363c);
        }
    }

    /* compiled from: DelayedStream.java */
    /* renamed from: io.grpc.h1.b0$k */
    /* loaded from: classes2.dex */
    class RunnableC9553k implements Runnable {

        /* renamed from: c */
        final /* synthetic */ InputStream f22365c;

        RunnableC9553k(InputStream inputStream) {
            this.f22365c = inputStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9542b0.this.f22340c.mo13796e(this.f22365c);
        }
    }

    /* compiled from: DelayedStream.java */
    /* renamed from: io.grpc.h1.b0$l */
    /* loaded from: classes2.dex */
    class RunnableC9554l implements Runnable {
        RunnableC9554l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9542b0.this.f22340c.flush();
        }
    }

    /* compiled from: DelayedStream.java */
    /* renamed from: io.grpc.h1.b0$m */
    /* loaded from: classes2.dex */
    class RunnableC9555m implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C9497c1 f22368c;

        RunnableC9555m(C9497c1 c9497c1) {
            this.f22368c = c9497c1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9542b0.this.f22340c.mo13804a(this.f22368c);
        }
    }

    /* compiled from: DelayedStream.java */
    /* renamed from: io.grpc.h1.b0$n */
    /* loaded from: classes2.dex */
    class RunnableC9556n implements Runnable {
        RunnableC9556n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9542b0.this.f22340c.mo13783l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DelayedStream.java */
    /* renamed from: io.grpc.h1.b0$o */
    /* loaded from: classes2.dex */
    public static class C9557o implements InterfaceC9753r {

        /* renamed from: a */
        private final InterfaceC9753r f22371a;

        /* renamed from: b */
        private volatile boolean f22372b;

        /* renamed from: c */
        private List<Runnable> f22373c = new ArrayList();

        /* compiled from: DelayedStream.java */
        /* renamed from: io.grpc.h1.b0$o$a */
        /* loaded from: classes2.dex */
        class RunnableC9558a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ InterfaceC9695k2.InterfaceC9696a f22374c;

            RunnableC9558a(InterfaceC9695k2.InterfaceC9696a interfaceC9696a) {
                this.f22374c = interfaceC9696a;
            }

            @Override // java.lang.Runnable
            public void run() {
                C9557o.this.f22371a.mo13769a(this.f22374c);
            }
        }

        /* compiled from: DelayedStream.java */
        /* renamed from: io.grpc.h1.b0$o$b */
        /* loaded from: classes2.dex */
        class RunnableC9559b implements Runnable {
            RunnableC9559b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C9557o.this.f22371a.mo13767c();
            }
        }

        /* compiled from: DelayedStream.java */
        /* renamed from: io.grpc.h1.b0$o$c */
        /* loaded from: classes2.dex */
        class RunnableC9560c implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C10049s0 f22377c;

            RunnableC9560c(C10049s0 c10049s0) {
                this.f22377c = c10049s0;
            }

            @Override // java.lang.Runnable
            public void run() {
                C9557o.this.f22371a.mo13768b(this.f22377c);
            }
        }

        /* compiled from: DelayedStream.java */
        /* renamed from: io.grpc.h1.b0$o$d */
        /* loaded from: classes2.dex */
        class RunnableC9561d implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C9497c1 f22379c;

            /* renamed from: d */
            final /* synthetic */ InterfaceC9753r.EnumC9754a f22380d;

            /* renamed from: e */
            final /* synthetic */ C10049s0 f22381e;

            RunnableC9561d(C9497c1 c9497c1, InterfaceC9753r.EnumC9754a enumC9754a, C10049s0 c10049s0) {
                this.f22379c = c9497c1;
                this.f22380d = enumC9754a;
                this.f22381e = c10049s0;
            }

            @Override // java.lang.Runnable
            public void run() {
                C9557o.this.f22371a.mo13766d(this.f22379c, this.f22380d, this.f22381e);
            }
        }

        public C9557o(InterfaceC9753r interfaceC9753r) {
            this.f22371a = interfaceC9753r;
        }

        /* renamed from: f */
        private void m14472f(Runnable runnable) {
            synchronized (this) {
                if (!this.f22372b) {
                    this.f22373c.add(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        @Override // io.grpc.p384h1.InterfaceC9695k2
        /* renamed from: a */
        public void mo13769a(InterfaceC9695k2.InterfaceC9696a interfaceC9696a) {
            if (this.f22372b) {
                this.f22371a.mo13769a(interfaceC9696a);
            } else {
                m14472f(new RunnableC9558a(interfaceC9696a));
            }
        }

        @Override // io.grpc.p384h1.InterfaceC9753r
        /* renamed from: b */
        public void mo13768b(C10049s0 c10049s0) {
            m14472f(new RunnableC9560c(c10049s0));
        }

        @Override // io.grpc.p384h1.InterfaceC9695k2
        /* renamed from: c */
        public void mo13767c() {
            if (this.f22372b) {
                this.f22371a.mo13767c();
            } else {
                m14472f(new RunnableC9559b());
            }
        }

        @Override // io.grpc.p384h1.InterfaceC9753r
        /* renamed from: d */
        public void mo13766d(C9497c1 c9497c1, InterfaceC9753r.EnumC9754a enumC9754a, C10049s0 c10049s0) {
            m14472f(new RunnableC9561d(c9497c1, enumC9754a, c10049s0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public void m14471g() {
            List<Runnable> list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    if (this.f22373c.isEmpty()) {
                        this.f22373c = null;
                        this.f22372b = true;
                        return;
                    }
                    list = this.f22373c;
                    this.f22373c = arrayList;
                }
                for (Runnable runnable : list) {
                    runnable.run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    /* renamed from: s */
    private void m14479s(Runnable runnable) {
        C5051n.m25773u(this.f22339b != null, "May only be called after start");
        synchronized (this) {
            if (!this.f22338a) {
                this.f22342e.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r0.hasNext() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m14478t() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f22342e     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L1d
            r0 = 0
            r3.f22342e = r0     // Catch: java.lang.Throwable -> L3b
            r0 = 1
            r3.f22338a = r0     // Catch: java.lang.Throwable -> L3b
            io.grpc.h1.b0$o r0 = r3.f22343f     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L1c
            r0.m14471g()
        L1c:
            return
        L1d:
            java.util.List<java.lang.Runnable> r1 = r3.f22342e     // Catch: java.lang.Throwable -> L3b
            r3.f22342e = r0     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r0 = r1.iterator()
        L26:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L26
        L36:
            r1.clear()
            r0 = r1
            goto L5
        L3b:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3e:
            throw r0
        L3f:
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.p384h1.C9542b0.m14478t():void");
    }

    /* renamed from: u */
    private void m14477u(InterfaceC9753r interfaceC9753r) {
        for (Runnable runnable : this.f22346i) {
            runnable.run();
        }
        this.f22346i = null;
        this.f22340c.mo13781o(interfaceC9753r);
    }

    /* renamed from: w */
    private void m14475w(InterfaceC9749q interfaceC9749q) {
        C5051n.m25771w(this.f22340c == null, "realStream already set to %s", this.f22340c);
        this.f22340c = interfaceC9749q;
        this.f22345h = System.nanoTime();
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: a */
    public void mo13804a(C9497c1 c9497c1) {
        boolean z = true;
        C5051n.m25773u(this.f22339b != null, "May only be called after start");
        C5051n.m25779o(c9497c1, "reason");
        synchronized (this) {
            if (this.f22340c == null) {
                m14475w(C9729o1.f22834a);
                this.f22341d = c9497c1;
                z = false;
            }
        }
        if (z) {
            m14479s(new RunnableC9555m(c9497c1));
            return;
        }
        m14478t();
        mo14476v(c9497c1);
        this.f22339b.mo13766d(c9497c1, InterfaceC9753r.EnumC9754a.PROCESSED, new C10049s0());
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    /* renamed from: b */
    public void mo13802b(InterfaceC10033o interfaceC10033o) {
        C5051n.m25773u(this.f22339b == null, "May only be called before start");
        C5051n.m25779o(interfaceC10033o, "compressor");
        this.f22346i.add(new RunnableC9545c(interfaceC10033o));
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    /* renamed from: c */
    public void mo13800c(int i) {
        C5051n.m25773u(this.f22339b != null, "May only be called after start");
        if (this.f22338a) {
            this.f22340c.mo13800c(i);
        } else {
            m14479s(new RunnableC9543a(i));
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    /* renamed from: d */
    public boolean mo13798d() {
        if (this.f22338a) {
            return this.f22340c.mo13798d();
        }
        return false;
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    /* renamed from: e */
    public void mo13796e(InputStream inputStream) {
        C5051n.m25773u(this.f22339b != null, "May only be called after start");
        C5051n.m25779o(inputStream, MetricTracker.Object.MESSAGE);
        if (this.f22338a) {
            this.f22340c.mo13796e(inputStream);
        } else {
            m14479s(new RunnableC9553k(inputStream));
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    /* renamed from: f */
    public void mo13794f() {
        C5051n.m25773u(this.f22339b == null, "May only be called before start");
        this.f22346i.add(new RunnableC9544b());
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    public void flush() {
        C5051n.m25773u(this.f22339b != null, "May only be called after start");
        if (this.f22338a) {
            this.f22340c.flush();
        } else {
            m14479s(new RunnableC9554l());
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: g */
    public void mo13792g(int i) {
        C5051n.m25773u(this.f22339b == null, "May only be called before start");
        this.f22346i.add(new RunnableC9548f(i));
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: h */
    public void mo13790h(int i) {
        C5051n.m25773u(this.f22339b == null, "May only be called before start");
        this.f22346i.add(new RunnableC9549g(i));
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: i */
    public void mo13788i(C10082w c10082w) {
        C5051n.m25773u(this.f22339b == null, "May only be called before start");
        C5051n.m25779o(c10082w, "decompressorRegistry");
        this.f22346i.add(new RunnableC9547e(c10082w));
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: j */
    public void mo13691j(String str) {
        C5051n.m25773u(this.f22339b == null, "May only be called before start");
        C5051n.m25779o(str, "authority");
        this.f22346i.add(new RunnableC9552j(str));
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: k */
    public void mo13785k(C9811x0 c9811x0) {
        synchronized (this) {
            if (this.f22339b == null) {
                return;
            }
            if (this.f22340c != null) {
                c9811x0.m13938b("buffered_nanos", Long.valueOf(this.f22345h - this.f22344g));
                this.f22340c.mo13785k(c9811x0);
            } else {
                c9811x0.m13938b("buffered_nanos", Long.valueOf(System.nanoTime() - this.f22344g));
                c9811x0.m13939a("waiting_for_connection");
            }
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: l */
    public void mo13783l() {
        C5051n.m25773u(this.f22339b != null, "May only be called after start");
        m14479s(new RunnableC9556n());
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: m */
    public C9477a mo13690m() {
        InterfaceC9749q interfaceC9749q;
        synchronized (this) {
            interfaceC9749q = this.f22340c;
        }
        if (interfaceC9749q != null) {
            return interfaceC9749q.mo13690m();
        }
        return C9477a.f22159b;
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: n */
    public void mo13782n(C10065u c10065u) {
        C5051n.m25773u(this.f22339b == null, "May only be called before start");
        this.f22346i.add(new RunnableC9550h(c10065u));
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: o */
    public void mo13781o(InterfaceC9753r interfaceC9753r) {
        C9497c1 c9497c1;
        boolean z;
        C5051n.m25779o(interfaceC9753r, "listener");
        C5051n.m25773u(this.f22339b == null, "already started");
        synchronized (this) {
            c9497c1 = this.f22341d;
            z = this.f22338a;
            if (!z) {
                C9557o c9557o = new C9557o(interfaceC9753r);
                this.f22343f = c9557o;
                interfaceC9753r = c9557o;
            }
            this.f22339b = interfaceC9753r;
            this.f22344g = System.nanoTime();
        }
        if (c9497c1 != null) {
            interfaceC9753r.mo13766d(c9497c1, InterfaceC9753r.EnumC9754a.PROCESSED, new C10049s0());
        } else if (z) {
            m14477u(interfaceC9753r);
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: q */
    public void mo13779q(boolean z) {
        C5051n.m25773u(this.f22339b == null, "May only be called before start");
        this.f22346i.add(new RunnableC9546d(z));
    }

    /* renamed from: v */
    protected void mo14476v(C9497c1 c9497c1) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final Runnable m14474x(InterfaceC9749q interfaceC9749q) {
        synchronized (this) {
            if (this.f22340c != null) {
                return null;
            }
            C5051n.m25779o(interfaceC9749q, "stream");
            m14475w(interfaceC9749q);
            InterfaceC9753r interfaceC9753r = this.f22339b;
            if (interfaceC9753r == null) {
                this.f22342e = null;
                this.f22338a = true;
            }
            if (interfaceC9753r == null) {
                return null;
            }
            m14477u(interfaceC9753r);
            return new RunnableC9551i();
        }
    }
}
