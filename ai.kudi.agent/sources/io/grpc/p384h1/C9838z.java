package io.grpc.p384h1;

import com.google.common.base.C5042j;
import com.google.common.base.C5051n;
import io.grpc.AbstractC9524h;
import io.grpc.C10043s;
import io.grpc.C10049s0;
import io.grpc.C10065u;
import io.grpc.C9497c1;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: DelayedClientCall.java */
/* renamed from: io.grpc.h1.z */
/* loaded from: classes2.dex */
public class C9838z<ReqT, RespT> extends AbstractC9524h<ReqT, RespT> {

    /* renamed from: j */
    private static final Logger f23105j = Logger.getLogger(C9838z.class.getName());

    /* renamed from: k */
    private static final AbstractC9524h<Object, Object> f23106k = new C9846h();

    /* renamed from: a */
    private final ScheduledFuture<?> f23107a;

    /* renamed from: b */
    private final Executor f23108b;

    /* renamed from: c */
    private final C10043s f23109c;

    /* renamed from: d */
    private volatile boolean f23110d;

    /* renamed from: e */
    private AbstractC9524h.AbstractC9525a<RespT> f23111e;

    /* renamed from: f */
    private AbstractC9524h<ReqT, RespT> f23112f;

    /* renamed from: g */
    private C9497c1 f23113g;

    /* renamed from: h */
    private List<Runnable> f23114h = new ArrayList();

    /* renamed from: i */
    private C9848j<RespT> f23115i;

    /* compiled from: DelayedClientCall.java */
    /* renamed from: io.grpc.h1.z$a */
    /* loaded from: classes2.dex */
    class RunnableC9839a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ AbstractC9524h.AbstractC9525a f23116c;

        /* renamed from: d */
        final /* synthetic */ C10049s0 f23117d;

        RunnableC9839a(AbstractC9524h.AbstractC9525a abstractC9525a, C10049s0 c10049s0) {
            this.f23116c = abstractC9525a;
            this.f23117d = c10049s0;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9838z.this.f23112f.mo13075e(this.f23116c, this.f23117d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DelayedClientCall.java */
    /* renamed from: io.grpc.h1.z$b */
    /* loaded from: classes2.dex */
    public class RunnableC9840b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ StringBuilder f23119c;

        RunnableC9840b(StringBuilder sb) {
            this.f23119c = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9838z.this.m13851j(C9497c1.f22190i.m14578r(this.f23119c.toString()), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DelayedClientCall.java */
    /* renamed from: io.grpc.h1.z$c */
    /* loaded from: classes2.dex */
    public class C9841c extends AbstractRunnableC9810x {

        /* renamed from: d */
        final /* synthetic */ C9848j f23121d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9841c(C9838z c9838z, C9848j c9848j) {
            super(c9838z.f23109c);
            this.f23121d = c9848j;
        }

        @Override // io.grpc.p384h1.AbstractRunnableC9810x
        /* renamed from: a */
        public void mo13845a() {
            this.f23121d.m13841g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DelayedClientCall.java */
    /* renamed from: io.grpc.h1.z$d */
    /* loaded from: classes2.dex */
    public class RunnableC9842d implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C9497c1 f23122c;

        RunnableC9842d(C9497c1 c9497c1) {
            this.f23122c = c9497c1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9838z.this.f23112f.mo13081a(this.f23122c.m14581o(), this.f23122c.m14583m());
        }
    }

    /* compiled from: DelayedClientCall.java */
    /* renamed from: io.grpc.h1.z$e */
    /* loaded from: classes2.dex */
    class RunnableC9843e implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Object f23124c;

        RunnableC9843e(Object obj) {
            this.f23124c = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            C9838z.this.f23112f.mo13076d(this.f23124c);
        }
    }

    /* compiled from: DelayedClientCall.java */
    /* renamed from: io.grpc.h1.z$f */
    /* loaded from: classes2.dex */
    class RunnableC9844f implements Runnable {

        /* renamed from: c */
        final /* synthetic */ int f23126c;

        RunnableC9844f(int i) {
            this.f23126c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9838z.this.f23112f.mo13079c(this.f23126c);
        }
    }

    /* compiled from: DelayedClientCall.java */
    /* renamed from: io.grpc.h1.z$g */
    /* loaded from: classes2.dex */
    class RunnableC9845g implements Runnable {
        RunnableC9845g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9838z.this.f23112f.mo13080b();
        }
    }

    /* compiled from: DelayedClientCall.java */
    /* renamed from: io.grpc.h1.z$h */
    /* loaded from: classes2.dex */
    class C9846h extends AbstractC9524h<Object, Object> {
        C9846h() {
        }

        @Override // io.grpc.AbstractC9524h
        /* renamed from: a */
        public void mo13081a(String str, Throwable th) {
        }

        @Override // io.grpc.AbstractC9524h
        /* renamed from: b */
        public void mo13080b() {
        }

        @Override // io.grpc.AbstractC9524h
        /* renamed from: c */
        public void mo13079c(int i) {
        }

        @Override // io.grpc.AbstractC9524h
        /* renamed from: d */
        public void mo13076d(Object obj) {
        }

        @Override // io.grpc.AbstractC9524h
        /* renamed from: e */
        public void mo13075e(AbstractC9524h.AbstractC9525a<Object> abstractC9525a, C10049s0 c10049s0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DelayedClientCall.java */
    /* renamed from: io.grpc.h1.z$i */
    /* loaded from: classes2.dex */
    public final class C9847i extends AbstractRunnableC9810x {

        /* renamed from: d */
        final AbstractC9524h.AbstractC9525a<RespT> f23129d;

        /* renamed from: e */
        final C9497c1 f23130e;

        C9847i(C9838z c9838z, AbstractC9524h.AbstractC9525a<RespT> abstractC9525a, C9497c1 c9497c1) {
            super(c9838z.f23109c);
            this.f23129d = abstractC9525a;
            this.f23130e = c9497c1;
        }

        @Override // io.grpc.p384h1.AbstractRunnableC9810x
        /* renamed from: a */
        public void mo13845a() {
            this.f23129d.mo13343a(this.f23130e, new C10049s0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DelayedClientCall.java */
    /* renamed from: io.grpc.h1.z$j */
    /* loaded from: classes2.dex */
    public static final class C9848j<RespT> extends AbstractC9524h.AbstractC9525a<RespT> {

        /* renamed from: a */
        private final AbstractC9524h.AbstractC9525a<RespT> f23131a;

        /* renamed from: b */
        private volatile boolean f23132b;

        /* renamed from: c */
        private List<Runnable> f23133c = new ArrayList();

        /* compiled from: DelayedClientCall.java */
        /* renamed from: io.grpc.h1.z$j$a */
        /* loaded from: classes2.dex */
        class RunnableC9849a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C10049s0 f23134c;

            RunnableC9849a(C10049s0 c10049s0) {
                this.f23134c = c10049s0;
            }

            @Override // java.lang.Runnable
            public void run() {
                C9848j.this.f23131a.mo13342b(this.f23134c);
            }
        }

        /* compiled from: DelayedClientCall.java */
        /* renamed from: io.grpc.h1.z$j$b */
        /* loaded from: classes2.dex */
        class RunnableC9850b implements Runnable {

            /* renamed from: c */
            final /* synthetic */ Object f23136c;

            RunnableC9850b(Object obj) {
                this.f23136c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                C9848j.this.f23131a.mo13341c(this.f23136c);
            }
        }

        /* compiled from: DelayedClientCall.java */
        /* renamed from: io.grpc.h1.z$j$c */
        /* loaded from: classes2.dex */
        class RunnableC9851c implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C9497c1 f23138c;

            /* renamed from: d */
            final /* synthetic */ C10049s0 f23139d;

            RunnableC9851c(C9497c1 c9497c1, C10049s0 c10049s0) {
                this.f23138c = c9497c1;
                this.f23139d = c10049s0;
            }

            @Override // java.lang.Runnable
            public void run() {
                C9848j.this.f23131a.mo13343a(this.f23138c, this.f23139d);
            }
        }

        /* compiled from: DelayedClientCall.java */
        /* renamed from: io.grpc.h1.z$j$d */
        /* loaded from: classes2.dex */
        class RunnableC9852d implements Runnable {
            RunnableC9852d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C9848j.this.f23131a.mo13844d();
            }
        }

        public C9848j(AbstractC9524h.AbstractC9525a<RespT> abstractC9525a) {
            this.f23131a = abstractC9525a;
        }

        /* renamed from: f */
        private void m13842f(Runnable runnable) {
            synchronized (this) {
                if (!this.f23132b) {
                    this.f23133c.add(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        @Override // io.grpc.AbstractC9524h.AbstractC9525a
        /* renamed from: a */
        public void mo13343a(C9497c1 c9497c1, C10049s0 c10049s0) {
            m13842f(new RunnableC9851c(c9497c1, c10049s0));
        }

        @Override // io.grpc.AbstractC9524h.AbstractC9525a
        /* renamed from: b */
        public void mo13342b(C10049s0 c10049s0) {
            if (this.f23132b) {
                this.f23131a.mo13342b(c10049s0);
            } else {
                m13842f(new RunnableC9849a(c10049s0));
            }
        }

        @Override // io.grpc.AbstractC9524h.AbstractC9525a
        /* renamed from: c */
        public void mo13341c(RespT respt) {
            if (this.f23132b) {
                this.f23131a.mo13341c(respt);
            } else {
                m13842f(new RunnableC9850b(respt));
            }
        }

        @Override // io.grpc.AbstractC9524h.AbstractC9525a
        /* renamed from: d */
        public void mo13844d() {
            if (this.f23132b) {
                this.f23131a.mo13844d();
            } else {
                m13842f(new RunnableC9852d());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        void m13841g() {
            List<Runnable> list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    if (this.f23133c.isEmpty()) {
                        this.f23133c = null;
                        this.f23132b = true;
                        return;
                    }
                    list = this.f23133c;
                    this.f23133c = arrayList;
                }
                for (Runnable runnable : list) {
                    runnable.run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C9838z(Executor executor, ScheduledExecutorService scheduledExecutorService, C10065u c10065u) {
        C5051n.m25779o(executor, "callExecutor");
        this.f23108b = executor;
        C5051n.m25779o(scheduledExecutorService, "scheduler");
        this.f23109c = C10043s.m13237I();
        this.f23107a = m13848m(scheduledExecutorService, c10065u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public void m13851j(C9497c1 c9497c1, boolean z) {
        boolean z2;
        AbstractC9524h.AbstractC9525a<RespT> abstractC9525a;
        synchronized (this) {
            if (this.f23112f == null) {
                m13846o(f23106k);
                z2 = false;
                abstractC9525a = this.f23111e;
                this.f23113g = c9497c1;
            } else if (z) {
                return;
            } else {
                z2 = true;
                abstractC9525a = null;
            }
            if (z2) {
                m13850k(new RunnableC9842d(c9497c1));
            } else {
                if (abstractC9525a != null) {
                    this.f23108b.execute(new C9847i(this, abstractC9525a, c9497c1));
                }
                m13849l();
            }
            mo13852i();
        }
    }

    /* renamed from: k */
    private void m13850k(Runnable runnable) {
        synchronized (this) {
            if (!this.f23110d) {
                this.f23114h.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r0.hasNext() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m13849l() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f23114h     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.f23114h = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.f23110d = r0     // Catch: java.lang.Throwable -> L42
            io.grpc.h1.z$j<RespT> r0 = r3.f23115i     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f23108b
            io.grpc.h1.z$c r2 = new io.grpc.h1.z$c
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List<java.lang.Runnable> r1 = r3.f23114h     // Catch: java.lang.Throwable -> L42
            r3.f23114h = r0     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            goto L46
        L45:
            throw r0
        L46:
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.p384h1.C9838z.m13849l():void");
    }

    /* renamed from: m */
    private ScheduledFuture<?> m13848m(ScheduledExecutorService scheduledExecutorService, C10065u c10065u) {
        C10065u mo13231O = this.f23109c.mo13231O();
        if (c10065u == null && mo13231O == null) {
            return null;
        }
        long min = c10065u != null ? Math.min(Long.MAX_VALUE, c10065u.m13143n(TimeUnit.NANOSECONDS)) : Long.MAX_VALUE;
        if (mo13231O != null && mo13231O.m13143n(TimeUnit.NANOSECONDS) < min) {
            min = mo13231O.m13143n(TimeUnit.NANOSECONDS);
            if (f23105j.isLoggable(Level.FINE)) {
                StringBuilder sb = new StringBuilder(String.format("Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(min)));
                if (c10065u == null) {
                    sb.append(" Explicit call timeout was not set.");
                } else {
                    sb.append(String.format(" Explicit call timeout was '%d' ns.", Long.valueOf(c10065u.m13143n(TimeUnit.NANOSECONDS))));
                }
                f23105j.fine(sb.toString());
            }
        }
        long abs = Math.abs(min) / TimeUnit.SECONDS.toNanos(1L);
        long abs2 = Math.abs(min) % TimeUnit.SECONDS.toNanos(1L);
        StringBuilder sb2 = new StringBuilder();
        if (min < 0) {
            sb2.append("ClientCall started after deadline exceeded. Deadline exceeded after -");
        } else {
            sb2.append("Deadline exceeded after ");
        }
        sb2.append(abs);
        sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        sb2.append("s. ");
        return scheduledExecutorService.schedule(new RunnableC9840b(sb2), min, TimeUnit.NANOSECONDS);
    }

    /* renamed from: o */
    private void m13846o(AbstractC9524h<ReqT, RespT> abstractC9524h) {
        C5051n.m25771w(this.f23112f == null, "realCall already set to %s", this.f23112f);
        ScheduledFuture<?> scheduledFuture = this.f23107a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f23112f = abstractC9524h;
    }

    @Override // io.grpc.AbstractC9524h
    /* renamed from: a */
    public final void mo13081a(String str, Throwable th) {
        C9497c1 m14578r;
        C9497c1 c9497c1 = C9497c1.f22188g;
        if (str != null) {
            m14578r = c9497c1.m14578r(str);
        } else {
            m14578r = c9497c1.m14578r("Call cancelled without message");
        }
        if (th != null) {
            m14578r = m14578r.m14579q(th);
        }
        m13851j(m14578r, false);
    }

    @Override // io.grpc.AbstractC9524h
    /* renamed from: b */
    public final void mo13080b() {
        m13850k(new RunnableC9845g());
    }

    @Override // io.grpc.AbstractC9524h
    /* renamed from: c */
    public final void mo13079c(int i) {
        if (this.f23110d) {
            this.f23112f.mo13079c(i);
        } else {
            m13850k(new RunnableC9844f(i));
        }
    }

    @Override // io.grpc.AbstractC9524h
    /* renamed from: d */
    public final void mo13076d(ReqT reqt) {
        if (this.f23110d) {
            this.f23112f.mo13076d(reqt);
        } else {
            m13850k(new RunnableC9843e(reqt));
        }
    }

    @Override // io.grpc.AbstractC9524h
    /* renamed from: e */
    public final void mo13075e(AbstractC9524h.AbstractC9525a<RespT> abstractC9525a, C10049s0 c10049s0) {
        C9497c1 c9497c1;
        boolean z;
        C5051n.m25773u(this.f23111e == null, "already started");
        synchronized (this) {
            C5051n.m25779o(abstractC9525a, "listener");
            this.f23111e = abstractC9525a;
            c9497c1 = this.f23113g;
            z = this.f23110d;
            if (!z) {
                C9848j<RespT> c9848j = new C9848j<>(abstractC9525a);
                this.f23115i = c9848j;
                abstractC9525a = c9848j;
            }
        }
        if (c9497c1 != null) {
            this.f23108b.execute(new C9847i(this, abstractC9525a, c9497c1));
        } else if (z) {
            this.f23112f.mo13075e(abstractC9525a, c10049s0);
        } else {
            m13850k(new RunnableC9839a(abstractC9525a, c10049s0));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public void mo13852i() {
    }

    /* renamed from: n */
    public final void m13847n(AbstractC9524h<ReqT, RespT> abstractC9524h) {
        synchronized (this) {
            if (this.f23112f != null) {
                return;
            }
            C5051n.m25779o(abstractC9524h, "call");
            m13846o(abstractC9524h);
            m13849l();
        }
    }

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25808d("realCall", this.f23112f);
        return m25812c.toString();
    }
}
