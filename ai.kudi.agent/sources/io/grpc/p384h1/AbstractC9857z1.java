package io.grpc.p384h1;

import com.google.common.base.C5046k;
import com.google.common.base.C5051n;
import io.grpc.AbstractC10001l;
import io.grpc.C10049s0;
import io.grpc.C10060t0;
import io.grpc.C10065u;
import io.grpc.C10082w;
import io.grpc.C9477a;
import io.grpc.C9497c1;
import io.grpc.ExecutorC9513e1;
import io.grpc.InterfaceC10033o;
import io.grpc.p384h1.InterfaceC9695k2;
import io.grpc.p384h1.InterfaceC9753r;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RetriableStream.java */
/* renamed from: io.grpc.h1.z1 */
/* loaded from: classes2.dex */
public abstract class AbstractC9857z1<ReqT> implements InterfaceC9749q {

    /* renamed from: a */
    private final C10060t0<ReqT, ?> f23149a;

    /* renamed from: b */
    private final Executor f23150b;

    /* renamed from: d */
    private final ScheduledExecutorService f23152d;

    /* renamed from: e */
    private final C10049s0 f23153e;

    /* renamed from: f */
    private final C9540a2 f23154f;

    /* renamed from: g */
    private final C9782t0 f23155g;

    /* renamed from: h */
    private final boolean f23156h;

    /* renamed from: j */
    private final C9888t f23158j;

    /* renamed from: k */
    private final long f23159k;

    /* renamed from: l */
    private final long f23160l;

    /* renamed from: m */
    private final C9871c0 f23161m;

    /* renamed from: q */
    private long f23165q;

    /* renamed from: r */
    private InterfaceC9753r f23166r;

    /* renamed from: s */
    private C9889u f23167s;

    /* renamed from: t */
    private C9889u f23168t;

    /* renamed from: u */
    private long f23169u;

    /* renamed from: v */
    private C9497c1 f23170v;

    /* renamed from: w */
    private boolean f23171w;

    /* renamed from: x */
    static final C10049s0.AbstractC10055f<String> f23146x = C10049s0.AbstractC10055f.m13185e("grpc-previous-rpc-attempts", C10049s0.f23786c);

    /* renamed from: y */
    static final C10049s0.AbstractC10055f<String> f23147y = C10049s0.AbstractC10055f.m13185e("grpc-retry-pushback-ms", C10049s0.f23786c);

    /* renamed from: z */
    private static final C9497c1 f23148z = C9497c1.f22188g.m14578r("Stream thrown away because RetriableStream committed");

    /* renamed from: A */
    private static Random f23145A = new Random();

    /* renamed from: c */
    private final Executor f23151c = new ExecutorC9513e1(new C9858a(this));

    /* renamed from: i */
    private final Object f23157i = new Object();

    /* renamed from: n */
    private final C9811x0 f23162n = new C9811x0();

    /* renamed from: o */
    private volatile C9895z f23163o = new C9895z(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);

    /* renamed from: p */
    private final AtomicBoolean f23164p = new AtomicBoolean();

    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$a */
    /* loaded from: classes2.dex */
    class C9858a implements Thread.UncaughtExceptionHandler {
        C9858a(AbstractC9857z1 abstractC9857z1) {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            throw C9497c1.m14584l(th).m14578r("Uncaught exception in the SynchronizationContext. Re-thrown.").m14592d();
        }
    }

    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$a0 */
    /* loaded from: classes2.dex */
    private final class C9859a0 implements InterfaceC9753r {

        /* renamed from: a */
        final C9869b0 f23172a;

        /* compiled from: RetriableStream.java */
        /* renamed from: io.grpc.h1.z1$a0$a */
        /* loaded from: classes2.dex */
        class RunnableC9860a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C10049s0 f23174c;

            RunnableC9860a(C10049s0 c10049s0) {
                this.f23174c = c10049s0;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC9857z1.this.f23166r.mo13768b(this.f23174c);
            }
        }

        /* compiled from: RetriableStream.java */
        /* renamed from: io.grpc.h1.z1$a0$b */
        /* loaded from: classes2.dex */
        class RunnableC9861b implements Runnable {

            /* compiled from: RetriableStream.java */
            /* renamed from: io.grpc.h1.z1$a0$b$a */
            /* loaded from: classes2.dex */
            class RunnableC9862a implements Runnable {
                RunnableC9862a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    C9859a0 c9859a0 = C9859a0.this;
                    AbstractC9857z1.this.m13799c0(AbstractC9857z1.this.m13803a0(c9859a0.f23172a.f23195d + 1, false));
                }
            }

            RunnableC9861b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC9857z1.this.f23150b.execute(new RunnableC9862a());
            }
        }

        /* compiled from: RetriableStream.java */
        /* renamed from: io.grpc.h1.z1$a0$c */
        /* loaded from: classes2.dex */
        class RunnableC9863c implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C9497c1 f23178c;

            /* renamed from: d */
            final /* synthetic */ InterfaceC9753r.EnumC9754a f23179d;

            /* renamed from: e */
            final /* synthetic */ C10049s0 f23180e;

            RunnableC9863c(C9497c1 c9497c1, InterfaceC9753r.EnumC9754a enumC9754a, C10049s0 c10049s0) {
                this.f23178c = c9497c1;
                this.f23179d = enumC9754a;
                this.f23180e = c10049s0;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC9857z1.this.f23171w = true;
                AbstractC9857z1.this.f23166r.mo13766d(this.f23178c, this.f23179d, this.f23180e);
            }
        }

        /* compiled from: RetriableStream.java */
        /* renamed from: io.grpc.h1.z1$a0$d */
        /* loaded from: classes2.dex */
        class RunnableC9864d implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C9869b0 f23182c;

            RunnableC9864d(C9869b0 c9869b0) {
                this.f23182c = c9869b0;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC9857z1.this.m13799c0(this.f23182c);
            }
        }

        /* compiled from: RetriableStream.java */
        /* renamed from: io.grpc.h1.z1$a0$e */
        /* loaded from: classes2.dex */
        class RunnableC9865e implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C9497c1 f23184c;

            /* renamed from: d */
            final /* synthetic */ InterfaceC9753r.EnumC9754a f23185d;

            /* renamed from: e */
            final /* synthetic */ C10049s0 f23186e;

            RunnableC9865e(C9497c1 c9497c1, InterfaceC9753r.EnumC9754a enumC9754a, C10049s0 c10049s0) {
                this.f23184c = c9497c1;
                this.f23185d = enumC9754a;
                this.f23186e = c10049s0;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC9857z1.this.f23171w = true;
                AbstractC9857z1.this.f23166r.mo13766d(this.f23184c, this.f23185d, this.f23186e);
            }
        }

        /* compiled from: RetriableStream.java */
        /* renamed from: io.grpc.h1.z1$a0$f */
        /* loaded from: classes2.dex */
        class RunnableC9866f implements Runnable {

            /* renamed from: c */
            final /* synthetic */ InterfaceC9695k2.InterfaceC9696a f23188c;

            RunnableC9866f(InterfaceC9695k2.InterfaceC9696a interfaceC9696a) {
                this.f23188c = interfaceC9696a;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC9857z1.this.f23166r.mo13769a(this.f23188c);
            }
        }

        /* compiled from: RetriableStream.java */
        /* renamed from: io.grpc.h1.z1$a0$g */
        /* loaded from: classes2.dex */
        class RunnableC9867g implements Runnable {
            RunnableC9867g() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (AbstractC9857z1.this.f23171w) {
                    return;
                }
                AbstractC9857z1.this.f23166r.mo13767c();
            }
        }

        C9859a0(C9869b0 c9869b0) {
            this.f23172a = c9869b0;
        }

        /* renamed from: e */
        private Integer m13765e(C10049s0 c10049s0) {
            String str = (String) c10049s0.m13211f(AbstractC9857z1.f23147y);
            if (str != null) {
                try {
                    return Integer.valueOf(str);
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }
            return null;
        }

        /* renamed from: f */
        private C9890v m13764f(C9497c1 c9497c1, C10049s0 c10049s0) {
            Integer m13765e = m13765e(c10049s0);
            boolean z = true;
            boolean z2 = !AbstractC9857z1.this.f23155g.f22986c.contains(c9497c1.m14582n());
            return new C9890v((z2 || ((AbstractC9857z1.this.f23161m == null || (z2 && (m13765e == null || m13765e.intValue() >= 0))) ? false : AbstractC9857z1.this.f23161m.m13761b() ^ true)) ? false : false, m13765e);
        }

        /* renamed from: g */
        private C9893x m13763g(C9497c1 c9497c1, C10049s0 c10049s0) {
            long j = 0;
            boolean z = false;
            if (AbstractC9857z1.this.f23154f != null) {
                boolean contains = AbstractC9857z1.this.f23154f.f22337f.contains(c9497c1.m14582n());
                Integer m13765e = m13765e(c10049s0);
                boolean z2 = (AbstractC9857z1.this.f23161m == null || (!contains && (m13765e == null || m13765e.intValue() >= 0))) ? false : !AbstractC9857z1.this.f23161m.m13761b();
                if (AbstractC9857z1.this.f23154f.f22332a > this.f23172a.f23195d + 1 && !z2) {
                    if (m13765e == null) {
                        if (contains) {
                            double d = AbstractC9857z1.this.f23169u;
                            double nextDouble = AbstractC9857z1.f23145A.nextDouble();
                            Double.isNaN(d);
                            j = (long) (d * nextDouble);
                            AbstractC9857z1 abstractC9857z1 = AbstractC9857z1.this;
                            double d2 = abstractC9857z1.f23169u;
                            double d3 = AbstractC9857z1.this.f23154f.f22335d;
                            Double.isNaN(d2);
                            abstractC9857z1.f23169u = Math.min((long) (d2 * d3), AbstractC9857z1.this.f23154f.f22334c);
                            z = true;
                        }
                    } else if (m13765e.intValue() >= 0) {
                        j = TimeUnit.MILLISECONDS.toNanos(m13765e.intValue());
                        AbstractC9857z1 abstractC9857z12 = AbstractC9857z1.this;
                        abstractC9857z12.f23169u = abstractC9857z12.f23154f.f22333b;
                        z = true;
                    }
                }
                return new C9893x(z, j);
            }
            return new C9893x(false, 0L);
        }

        @Override // io.grpc.p384h1.InterfaceC9695k2
        /* renamed from: a */
        public void mo13769a(InterfaceC9695k2.InterfaceC9696a interfaceC9696a) {
            C9895z c9895z = AbstractC9857z1.this.f23163o;
            C5051n.m25773u(c9895z.f23238f != null, "Headers should be received prior to messages.");
            if (c9895z.f23238f != this.f23172a) {
                return;
            }
            AbstractC9857z1.this.f23151c.execute(new RunnableC9866f(interfaceC9696a));
        }

        @Override // io.grpc.p384h1.InterfaceC9753r
        /* renamed from: b */
        public void mo13768b(C10049s0 c10049s0) {
            AbstractC9857z1.this.m13805Z(this.f23172a);
            if (AbstractC9857z1.this.f23163o.f23238f == this.f23172a) {
                if (AbstractC9857z1.this.f23161m != null) {
                    AbstractC9857z1.this.f23161m.m13760c();
                }
                AbstractC9857z1.this.f23151c.execute(new RunnableC9860a(c10049s0));
            }
        }

        @Override // io.grpc.p384h1.InterfaceC9695k2
        /* renamed from: c */
        public void mo13767c() {
            if (AbstractC9857z1.this.mo13798d()) {
                AbstractC9857z1.this.f23151c.execute(new RunnableC9867g());
            }
        }

        @Override // io.grpc.p384h1.InterfaceC9753r
        /* renamed from: d */
        public void mo13766d(C9497c1 c9497c1, InterfaceC9753r.EnumC9754a enumC9754a, C10049s0 c10049s0) {
            C9889u c9889u;
            synchronized (AbstractC9857z1.this.f23157i) {
                AbstractC9857z1.this.f23163o = AbstractC9857z1.this.f23163o.m13747g(this.f23172a);
                AbstractC9857z1.this.f23162n.m13939a(c9497c1.m14582n());
            }
            C9869b0 c9869b0 = this.f23172a;
            if (c9869b0.f23194c) {
                AbstractC9857z1.this.m13805Z(c9869b0);
                if (AbstractC9857z1.this.f23163o.f23238f == this.f23172a) {
                    AbstractC9857z1.this.f23151c.execute(new RunnableC9863c(c9497c1, enumC9754a, c10049s0));
                    return;
                }
                return;
            }
            if (AbstractC9857z1.this.f23163o.f23238f == null) {
                boolean z = true;
                if (enumC9754a == InterfaceC9753r.EnumC9754a.REFUSED && AbstractC9857z1.this.f23164p.compareAndSet(false, true)) {
                    C9869b0 m13803a0 = AbstractC9857z1.this.m13803a0(this.f23172a.f23195d, true);
                    if (AbstractC9857z1.this.f23156h) {
                        synchronized (AbstractC9857z1.this.f23157i) {
                            AbstractC9857z1.this.f23163o = AbstractC9857z1.this.f23163o.m13748f(this.f23172a, m13803a0);
                            if (AbstractC9857z1.this.m13795e0(AbstractC9857z1.this.f23163o) || AbstractC9857z1.this.f23163o.f23236d.size() != 1) {
                                z = false;
                            }
                        }
                        if (z) {
                            AbstractC9857z1.this.m13805Z(m13803a0);
                        }
                    } else if (AbstractC9857z1.this.f23154f == null || AbstractC9857z1.this.f23154f.f22332a == 1) {
                        AbstractC9857z1.this.m13805Z(m13803a0);
                    }
                    AbstractC9857z1.this.f23150b.execute(new RunnableC9864d(m13803a0));
                    return;
                } else if (enumC9754a == InterfaceC9753r.EnumC9754a.DROPPED) {
                    if (AbstractC9857z1.this.f23156h) {
                        AbstractC9857z1.this.m13797d0();
                    }
                } else {
                    AbstractC9857z1.this.f23164p.set(true);
                    if (AbstractC9857z1.this.f23156h) {
                        C9890v m13764f = m13764f(c9497c1, c10049s0);
                        if (m13764f.f23225a) {
                            AbstractC9857z1.this.m13787i0(m13764f.f23226b);
                        }
                        synchronized (AbstractC9857z1.this.f23157i) {
                            AbstractC9857z1.this.f23163o = AbstractC9857z1.this.f23163o.m13749e(this.f23172a);
                            if (m13764f.f23225a && (AbstractC9857z1.this.m13795e0(AbstractC9857z1.this.f23163o) || !AbstractC9857z1.this.f23163o.f23236d.isEmpty())) {
                                return;
                            }
                        }
                    } else {
                        C9893x m13763g = m13763g(c9497c1, c10049s0);
                        if (m13763g.f23230a) {
                            synchronized (AbstractC9857z1.this.f23157i) {
                                AbstractC9857z1 abstractC9857z1 = AbstractC9857z1.this;
                                c9889u = new C9889u(AbstractC9857z1.this.f23157i);
                                abstractC9857z1.f23167s = c9889u;
                            }
                            c9889u.m13755c(AbstractC9857z1.this.f23152d.schedule(new RunnableC9861b(), m13763g.f23231b, TimeUnit.NANOSECONDS));
                            return;
                        }
                    }
                }
            }
            AbstractC9857z1.this.m13805Z(this.f23172a);
            if (AbstractC9857z1.this.f23163o.f23238f == this.f23172a) {
                AbstractC9857z1.this.f23151c.execute(new RunnableC9865e(c9497c1, enumC9754a, c10049s0));
            }
        }
    }

    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$b */
    /* loaded from: classes2.dex */
    class C9868b implements InterfaceC9886r {

        /* renamed from: a */
        final /* synthetic */ String f23191a;

        C9868b(AbstractC9857z1 abstractC9857z1, String str) {
            this.f23191a = str;
        }

        @Override // io.grpc.p384h1.AbstractC9857z1.InterfaceC9886r
        /* renamed from: a */
        public void mo13754a(C9869b0 c9869b0) {
            c9869b0.f23192a.mo13691j(this.f23191a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$b0 */
    /* loaded from: classes2.dex */
    public static final class C9869b0 {

        /* renamed from: a */
        InterfaceC9749q f23192a;

        /* renamed from: b */
        boolean f23193b;

        /* renamed from: c */
        boolean f23194c;

        /* renamed from: d */
        final int f23195d;

        C9869b0(int i) {
            this.f23195d = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$c */
    /* loaded from: classes2.dex */
    public class RunnableC9870c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Collection f23196c;

        /* renamed from: d */
        final /* synthetic */ C9869b0 f23197d;

        /* renamed from: e */
        final /* synthetic */ Future f23198e;

        /* renamed from: f */
        final /* synthetic */ Future f23199f;

        RunnableC9870c(Collection collection, C9869b0 c9869b0, Future future, Future future2) {
            this.f23196c = collection;
            this.f23197d = c9869b0;
            this.f23198e = future;
            this.f23199f = future2;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (C9869b0 c9869b0 : this.f23196c) {
                if (c9869b0 != this.f23197d) {
                    c9869b0.f23192a.mo13804a(AbstractC9857z1.f23148z);
                }
            }
            Future future = this.f23198e;
            if (future != null) {
                future.cancel(false);
            }
            Future future2 = this.f23199f;
            if (future2 != null) {
                future2.cancel(false);
            }
            AbstractC9857z1.this.mo13791g0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$c0 */
    /* loaded from: classes2.dex */
    public static final class C9871c0 {

        /* renamed from: a */
        final int f23201a;

        /* renamed from: b */
        final int f23202b;

        /* renamed from: c */
        final int f23203c;

        /* renamed from: d */
        final AtomicInteger f23204d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C9871c0(float f, float f2) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f23204d = atomicInteger;
            this.f23203c = (int) (f2 * 1000.0f);
            int i = (int) (f * 1000.0f);
            this.f23201a = i;
            this.f23202b = i / 2;
            atomicInteger.set(i);
        }

        /* renamed from: a */
        boolean m13762a() {
            return this.f23204d.get() > this.f23202b;
        }

        /* renamed from: b */
        boolean m13761b() {
            int i;
            int i2;
            do {
                i = this.f23204d.get();
                if (i == 0) {
                    return false;
                }
                i2 = i - 1000;
            } while (!this.f23204d.compareAndSet(i, Math.max(i2, 0)));
            return i2 > this.f23202b;
        }

        /* renamed from: c */
        void m13760c() {
            int i;
            int i2;
            do {
                i = this.f23204d.get();
                i2 = this.f23201a;
                if (i == i2) {
                    return;
                }
            } while (!this.f23204d.compareAndSet(i, Math.min(this.f23203c + i, i2)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9871c0) {
                C9871c0 c9871c0 = (C9871c0) obj;
                return this.f23201a == c9871c0.f23201a && this.f23203c == c9871c0.f23203c;
            }
            return false;
        }

        public int hashCode() {
            return C5046k.m25799b(Integer.valueOf(this.f23201a), Integer.valueOf(this.f23203c));
        }
    }

    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$d */
    /* loaded from: classes2.dex */
    class C9872d implements InterfaceC9886r {

        /* renamed from: a */
        final /* synthetic */ InterfaceC10033o f23205a;

        C9872d(AbstractC9857z1 abstractC9857z1, InterfaceC10033o interfaceC10033o) {
            this.f23205a = interfaceC10033o;
        }

        @Override // io.grpc.p384h1.AbstractC9857z1.InterfaceC9886r
        /* renamed from: a */
        public void mo13754a(C9869b0 c9869b0) {
            c9869b0.f23192a.mo13802b(this.f23205a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$e */
    /* loaded from: classes2.dex */
    class C9873e implements InterfaceC9886r {

        /* renamed from: a */
        final /* synthetic */ C10065u f23206a;

        C9873e(AbstractC9857z1 abstractC9857z1, C10065u c10065u) {
            this.f23206a = c10065u;
        }

        @Override // io.grpc.p384h1.AbstractC9857z1.InterfaceC9886r
        /* renamed from: a */
        public void mo13754a(C9869b0 c9869b0) {
            c9869b0.f23192a.mo13782n(this.f23206a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$f */
    /* loaded from: classes2.dex */
    class C9874f implements InterfaceC9886r {

        /* renamed from: a */
        final /* synthetic */ C10082w f23207a;

        C9874f(AbstractC9857z1 abstractC9857z1, C10082w c10082w) {
            this.f23207a = c10082w;
        }

        @Override // io.grpc.p384h1.AbstractC9857z1.InterfaceC9886r
        /* renamed from: a */
        public void mo13754a(C9869b0 c9869b0) {
            c9869b0.f23192a.mo13788i(this.f23207a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$g */
    /* loaded from: classes2.dex */
    class C9875g implements InterfaceC9886r {
        C9875g(AbstractC9857z1 abstractC9857z1) {
        }

        @Override // io.grpc.p384h1.AbstractC9857z1.InterfaceC9886r
        /* renamed from: a */
        public void mo13754a(C9869b0 c9869b0) {
            c9869b0.f23192a.flush();
        }
    }

    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$h */
    /* loaded from: classes2.dex */
    class C9876h implements InterfaceC9886r {

        /* renamed from: a */
        final /* synthetic */ boolean f23208a;

        C9876h(AbstractC9857z1 abstractC9857z1, boolean z) {
            this.f23208a = z;
        }

        @Override // io.grpc.p384h1.AbstractC9857z1.InterfaceC9886r
        /* renamed from: a */
        public void mo13754a(C9869b0 c9869b0) {
            c9869b0.f23192a.mo13779q(this.f23208a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$i */
    /* loaded from: classes2.dex */
    class C9877i implements InterfaceC9886r {
        C9877i(AbstractC9857z1 abstractC9857z1) {
        }

        @Override // io.grpc.p384h1.AbstractC9857z1.InterfaceC9886r
        /* renamed from: a */
        public void mo13754a(C9869b0 c9869b0) {
            c9869b0.f23192a.mo13783l();
        }
    }

    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$j */
    /* loaded from: classes2.dex */
    class C9878j implements InterfaceC9886r {

        /* renamed from: a */
        final /* synthetic */ int f23209a;

        C9878j(AbstractC9857z1 abstractC9857z1, int i) {
            this.f23209a = i;
        }

        @Override // io.grpc.p384h1.AbstractC9857z1.InterfaceC9886r
        /* renamed from: a */
        public void mo13754a(C9869b0 c9869b0) {
            c9869b0.f23192a.mo13792g(this.f23209a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$k */
    /* loaded from: classes2.dex */
    class C9879k implements InterfaceC9886r {

        /* renamed from: a */
        final /* synthetic */ int f23210a;

        C9879k(AbstractC9857z1 abstractC9857z1, int i) {
            this.f23210a = i;
        }

        @Override // io.grpc.p384h1.AbstractC9857z1.InterfaceC9886r
        /* renamed from: a */
        public void mo13754a(C9869b0 c9869b0) {
            c9869b0.f23192a.mo13790h(this.f23210a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$l */
    /* loaded from: classes2.dex */
    class C9880l implements InterfaceC9886r {
        C9880l(AbstractC9857z1 abstractC9857z1) {
        }

        @Override // io.grpc.p384h1.AbstractC9857z1.InterfaceC9886r
        /* renamed from: a */
        public void mo13754a(C9869b0 c9869b0) {
            c9869b0.f23192a.mo13794f();
        }
    }

    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$m */
    /* loaded from: classes2.dex */
    class C9881m implements InterfaceC9886r {

        /* renamed from: a */
        final /* synthetic */ int f23211a;

        C9881m(AbstractC9857z1 abstractC9857z1, int i) {
            this.f23211a = i;
        }

        @Override // io.grpc.p384h1.AbstractC9857z1.InterfaceC9886r
        /* renamed from: a */
        public void mo13754a(C9869b0 c9869b0) {
            c9869b0.f23192a.mo13800c(this.f23211a);
        }
    }

    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$n */
    /* loaded from: classes2.dex */
    class C9882n implements InterfaceC9886r {

        /* renamed from: a */
        final /* synthetic */ Object f23212a;

        C9882n(Object obj) {
            this.f23212a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.grpc.p384h1.AbstractC9857z1.InterfaceC9886r
        /* renamed from: a */
        public void mo13754a(C9869b0 c9869b0) {
            c9869b0.f23192a.mo13796e(AbstractC9857z1.this.f23149a.m13161j(this.f23212a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$o */
    /* loaded from: classes2.dex */
    public class C9883o extends AbstractC10001l.AbstractC10003b {

        /* renamed from: a */
        final /* synthetic */ AbstractC10001l f23214a;

        C9883o(AbstractC9857z1 abstractC9857z1, AbstractC10001l abstractC10001l) {
            this.f23214a = abstractC10001l;
        }

        @Override // io.grpc.AbstractC10001l.AbstractC10002a
        /* renamed from: a */
        public AbstractC10001l mo13332a(AbstractC10001l.C10004c c10004c, C10049s0 c10049s0) {
            return this.f23214a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$p */
    /* loaded from: classes2.dex */
    public class RunnableC9884p implements Runnable {
        RunnableC9884p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC9857z1.this.f23171w) {
                return;
            }
            AbstractC9857z1.this.f23166r.mo13767c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$q */
    /* loaded from: classes2.dex */
    public class RunnableC9885q implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C9497c1 f23216c;

        RunnableC9885q(C9497c1 c9497c1) {
            this.f23216c = c9497c1;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC9857z1.this.f23171w = true;
            AbstractC9857z1.this.f23166r.mo13766d(this.f23216c, InterfaceC9753r.EnumC9754a.PROCESSED, new C10049s0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$r */
    /* loaded from: classes2.dex */
    public interface InterfaceC9886r {
        /* renamed from: a */
        void mo13754a(C9869b0 c9869b0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$s */
    /* loaded from: classes2.dex */
    public class C9887s extends AbstractC10001l {

        /* renamed from: a */
        private final C9869b0 f23218a;

        /* renamed from: b */
        long f23219b;

        C9887s(C9869b0 c9869b0) {
            this.f23218a = c9869b0;
        }

        @Override // io.grpc.AbstractC9507d1
        /* renamed from: h */
        public void mo13759h(long j) {
            if (AbstractC9857z1.this.f23163o.f23238f != null) {
                return;
            }
            synchronized (AbstractC9857z1.this.f23157i) {
                if (AbstractC9857z1.this.f23163o.f23238f == null && !this.f23218a.f23193b) {
                    long j2 = this.f23219b + j;
                    this.f23219b = j2;
                    if (j2 <= AbstractC9857z1.this.f23165q) {
                        return;
                    }
                    if (this.f23219b <= AbstractC9857z1.this.f23159k) {
                        long m13758a = AbstractC9857z1.this.f23158j.m13758a(this.f23219b - AbstractC9857z1.this.f23165q);
                        AbstractC9857z1.this.f23165q = this.f23219b;
                        if (m13758a > AbstractC9857z1.this.f23160l) {
                            this.f23218a.f23194c = true;
                        }
                    } else {
                        this.f23218a.f23194c = true;
                    }
                    Runnable m13806Y = this.f23218a.f23194c ? AbstractC9857z1.this.m13806Y(this.f23218a) : null;
                    if (m13806Y != null) {
                        m13806Y.run();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$t */
    /* loaded from: classes2.dex */
    public static final class C9888t {

        /* renamed from: a */
        private final AtomicLong f23221a = new AtomicLong();

        /* renamed from: a */
        long m13758a(long j) {
            return this.f23221a.addAndGet(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$u */
    /* loaded from: classes2.dex */
    public static final class C9889u {

        /* renamed from: a */
        final Object f23222a;

        /* renamed from: b */
        Future<?> f23223b;

        /* renamed from: c */
        boolean f23224c;

        C9889u(Object obj) {
            this.f23222a = obj;
        }

        /* renamed from: a */
        boolean m13757a() {
            return this.f23224c;
        }

        /* renamed from: b */
        Future<?> m13756b() {
            this.f23224c = true;
            return this.f23223b;
        }

        /* renamed from: c */
        void m13755c(Future<?> future) {
            synchronized (this.f23222a) {
                if (!this.f23224c) {
                    this.f23223b = future;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$v */
    /* loaded from: classes2.dex */
    public static final class C9890v {

        /* renamed from: a */
        final boolean f23225a;

        /* renamed from: b */
        final Integer f23226b;

        public C9890v(boolean z, Integer num) {
            this.f23225a = z;
            this.f23226b = num;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$w */
    /* loaded from: classes2.dex */
    public final class RunnableC9891w implements Runnable {

        /* renamed from: c */
        final C9889u f23227c;

        /* compiled from: RetriableStream.java */
        /* renamed from: io.grpc.h1.z1$w$a */
        /* loaded from: classes2.dex */
        class RunnableC9892a implements Runnable {
            RunnableC9892a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C9889u c9889u;
                AbstractC9857z1 abstractC9857z1 = AbstractC9857z1.this;
                boolean z = false;
                C9869b0 m13803a0 = abstractC9857z1.m13803a0(abstractC9857z1.f23163o.f23237e, false);
                synchronized (AbstractC9857z1.this.f23157i) {
                    c9889u = null;
                    if (RunnableC9891w.this.f23227c.m13757a()) {
                        z = true;
                    } else {
                        AbstractC9857z1.this.f23163o = AbstractC9857z1.this.f23163o.m13753a(m13803a0);
                        if (AbstractC9857z1.this.m13795e0(AbstractC9857z1.this.f23163o) && (AbstractC9857z1.this.f23161m == null || AbstractC9857z1.this.f23161m.m13762a())) {
                            AbstractC9857z1 abstractC9857z12 = AbstractC9857z1.this;
                            c9889u = new C9889u(AbstractC9857z1.this.f23157i);
                            abstractC9857z12.f23168t = c9889u;
                        } else {
                            AbstractC9857z1.this.f23163o = AbstractC9857z1.this.f23163o.m13750d();
                            AbstractC9857z1.this.f23168t = null;
                        }
                    }
                }
                if (!z) {
                    if (c9889u != null) {
                        c9889u.m13755c(AbstractC9857z1.this.f23152d.schedule(new RunnableC9891w(c9889u), AbstractC9857z1.this.f23155g.f22985b, TimeUnit.NANOSECONDS));
                    }
                    AbstractC9857z1.this.m13799c0(m13803a0);
                    return;
                }
                m13803a0.f23192a.mo13804a(C9497c1.f22188g.m14578r("Unneeded hedging"));
            }
        }

        RunnableC9891w(C9889u c9889u) {
            this.f23227c = c9889u;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC9857z1.this.f23150b.execute(new RunnableC9892a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$x */
    /* loaded from: classes2.dex */
    public static final class C9893x {

        /* renamed from: a */
        final boolean f23230a;

        /* renamed from: b */
        final long f23231b;

        C9893x(boolean z, long j) {
            this.f23230a = z;
            this.f23231b = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$y */
    /* loaded from: classes2.dex */
    public class C9894y implements InterfaceC9886r {
        C9894y() {
        }

        @Override // io.grpc.p384h1.AbstractC9857z1.InterfaceC9886r
        /* renamed from: a */
        public void mo13754a(C9869b0 c9869b0) {
            c9869b0.f23192a.mo13781o(new C9859a0(c9869b0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RetriableStream.java */
    /* renamed from: io.grpc.h1.z1$z */
    /* loaded from: classes2.dex */
    public static final class C9895z {

        /* renamed from: a */
        final boolean f23233a;

        /* renamed from: b */
        final List<InterfaceC9886r> f23234b;

        /* renamed from: c */
        final Collection<C9869b0> f23235c;

        /* renamed from: d */
        final Collection<C9869b0> f23236d;

        /* renamed from: e */
        final int f23237e;

        /* renamed from: f */
        final C9869b0 f23238f;

        /* renamed from: g */
        final boolean f23239g;

        /* renamed from: h */
        final boolean f23240h;

        C9895z(List<InterfaceC9886r> list, Collection<C9869b0> collection, Collection<C9869b0> collection2, C9869b0 c9869b0, boolean z, boolean z2, boolean z3, int i) {
            this.f23234b = list;
            C5051n.m25779o(collection, "drainedSubstreams");
            this.f23235c = collection;
            this.f23238f = c9869b0;
            this.f23236d = collection2;
            this.f23239g = z;
            this.f23233a = z2;
            this.f23240h = z3;
            this.f23237e = i;
            boolean z4 = false;
            C5051n.m25773u(!z2 || list == null, "passThrough should imply buffer is null");
            C5051n.m25773u((z2 && c9869b0 == null) ? false : true, "passThrough should imply winningSubstream != null");
            C5051n.m25773u(!z2 || (collection.size() == 1 && collection.contains(c9869b0)) || (collection.size() == 0 && c9869b0.f23193b), "passThrough should imply winningSubstream is drained");
            C5051n.m25773u((z && c9869b0 == null) ? true : true, "cancelled should imply committed");
        }

        /* renamed from: a */
        C9895z m13753a(C9869b0 c9869b0) {
            Collection unmodifiableCollection;
            C5051n.m25773u(!this.f23240h, "hedging frozen");
            C5051n.m25773u(this.f23238f == null, "already committed");
            if (this.f23236d == null) {
                unmodifiableCollection = Collections.singleton(c9869b0);
            } else {
                ArrayList arrayList = new ArrayList(this.f23236d);
                arrayList.add(c9869b0);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            return new C9895z(this.f23234b, this.f23235c, unmodifiableCollection, this.f23238f, this.f23239g, this.f23233a, this.f23240h, this.f23237e + 1);
        }

        /* renamed from: b */
        C9895z m13752b() {
            return new C9895z(this.f23234b, this.f23235c, this.f23236d, this.f23238f, true, this.f23233a, this.f23240h, this.f23237e);
        }

        /* renamed from: c */
        C9895z m13751c(C9869b0 c9869b0) {
            List<InterfaceC9886r> list;
            Collection emptyList;
            boolean z;
            C5051n.m25773u(this.f23238f == null, "Already committed");
            List<InterfaceC9886r> list2 = this.f23234b;
            if (this.f23235c.contains(c9869b0)) {
                list = null;
                emptyList = Collections.singleton(c9869b0);
                z = true;
            } else {
                list = list2;
                emptyList = Collections.emptyList();
                z = false;
            }
            return new C9895z(list, emptyList, this.f23236d, c9869b0, this.f23239g, z, this.f23240h, this.f23237e);
        }

        /* renamed from: d */
        C9895z m13750d() {
            return this.f23240h ? this : new C9895z(this.f23234b, this.f23235c, this.f23236d, this.f23238f, this.f23239g, this.f23233a, true, this.f23237e);
        }

        /* renamed from: e */
        C9895z m13749e(C9869b0 c9869b0) {
            ArrayList arrayList = new ArrayList(this.f23236d);
            arrayList.remove(c9869b0);
            return new C9895z(this.f23234b, this.f23235c, Collections.unmodifiableCollection(arrayList), this.f23238f, this.f23239g, this.f23233a, this.f23240h, this.f23237e);
        }

        /* renamed from: f */
        C9895z m13748f(C9869b0 c9869b0, C9869b0 c9869b02) {
            ArrayList arrayList = new ArrayList(this.f23236d);
            arrayList.remove(c9869b0);
            arrayList.add(c9869b02);
            return new C9895z(this.f23234b, this.f23235c, Collections.unmodifiableCollection(arrayList), this.f23238f, this.f23239g, this.f23233a, this.f23240h, this.f23237e);
        }

        /* renamed from: g */
        C9895z m13747g(C9869b0 c9869b0) {
            c9869b0.f23193b = true;
            if (this.f23235c.contains(c9869b0)) {
                ArrayList arrayList = new ArrayList(this.f23235c);
                arrayList.remove(c9869b0);
                return new C9895z(this.f23234b, Collections.unmodifiableCollection(arrayList), this.f23236d, this.f23238f, this.f23239g, this.f23233a, this.f23240h, this.f23237e);
            }
            return this;
        }

        /* renamed from: h */
        C9895z m13746h(C9869b0 c9869b0) {
            Collection unmodifiableCollection;
            List<InterfaceC9886r> list;
            C5051n.m25773u(!this.f23233a, "Already passThrough");
            if (c9869b0.f23193b) {
                unmodifiableCollection = this.f23235c;
            } else if (this.f23235c.isEmpty()) {
                unmodifiableCollection = Collections.singletonList(c9869b0);
            } else {
                ArrayList arrayList = new ArrayList(this.f23235c);
                arrayList.add(c9869b0);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            Collection collection = unmodifiableCollection;
            boolean z = this.f23238f != null;
            List<InterfaceC9886r> list2 = this.f23234b;
            if (z) {
                C5051n.m25773u(this.f23238f == c9869b0, "Another RPC attempt has already committed");
                list = null;
            } else {
                list = list2;
            }
            return new C9895z(list, collection, this.f23236d, this.f23238f, this.f23239g, z, this.f23240h, this.f23237e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9857z1(C10060t0<ReqT, ?> c10060t0, C10049s0 c10049s0, C9888t c9888t, long j, long j2, Executor executor, ScheduledExecutorService scheduledExecutorService, C9540a2 c9540a2, C9782t0 c9782t0, C9871c0 c9871c0) {
        this.f23149a = c10060t0;
        this.f23158j = c9888t;
        this.f23159k = j;
        this.f23160l = j2;
        this.f23150b = executor;
        this.f23152d = scheduledExecutorService;
        this.f23153e = c10049s0;
        this.f23154f = c9540a2;
        if (c9540a2 != null) {
            this.f23169u = c9540a2.f22333b;
        }
        this.f23155g = c9782t0;
        C5051n.m25789e(c9540a2 == null || c9782t0 == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f23156h = c9782t0 != null;
        this.f23161m = c9871c0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public Runnable m13806Y(C9869b0 c9869b0) {
        Future<?> future;
        Future<?> future2;
        synchronized (this.f23157i) {
            if (this.f23163o.f23238f != null) {
                return null;
            }
            Collection<C9869b0> collection = this.f23163o.f23235c;
            this.f23163o = this.f23163o.m13751c(c9869b0);
            this.f23158j.m13758a(-this.f23165q);
            if (this.f23167s != null) {
                Future<?> m13756b = this.f23167s.m13756b();
                this.f23167s = null;
                future = m13756b;
            } else {
                future = null;
            }
            if (this.f23168t != null) {
                Future<?> m13756b2 = this.f23168t.m13756b();
                this.f23168t = null;
                future2 = m13756b2;
            } else {
                future2 = null;
            }
            return new RunnableC9870c(collection, c9869b0, future, future2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public void m13805Z(C9869b0 c9869b0) {
        Runnable m13806Y = m13806Y(c9869b0);
        if (m13806Y != null) {
            m13806Y.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public C9869b0 m13803a0(int i, boolean z) {
        C9869b0 c9869b0 = new C9869b0(i);
        c9869b0.f23192a = mo13793f0(m13784k0(this.f23153e, i), new C9883o(this, new C9887s(c9869b0)), i, z);
        return c9869b0;
    }

    /* renamed from: b0 */
    private void m13801b0(InterfaceC9886r interfaceC9886r) {
        Collection<C9869b0> collection;
        synchronized (this.f23157i) {
            if (!this.f23163o.f23233a) {
                this.f23163o.f23234b.add(interfaceC9886r);
            }
            collection = this.f23163o.f23235c;
        }
        for (C9869b0 c9869b0 : collection) {
            interfaceC9886r.mo13754a(c9869b0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
        r8.f23151c.execute(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
        r0 = r9.f23192a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
        if (r8.f23163o.f23238f != r9) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
        r9 = r8.f23170v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
        r9 = io.grpc.p384h1.AbstractC9857z1.f23148z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
        r0.mo13804a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007d, code lost:
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0085, code lost:
        if (r2.hasNext() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0087, code lost:
        r4 = (io.grpc.p384h1.AbstractC9857z1.InterfaceC9886r) r2.next();
        r4.mo13754a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
        if ((r4 instanceof io.grpc.p384h1.AbstractC9857z1.C9894y) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0094, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0095, code lost:
        if (r1 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
        r4 = r8.f23163o;
        r5 = r4.f23238f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009b, code lost:
        if (r5 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009d, code lost:
        if (r5 == r9) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a2, code lost:
        if (r4.f23239g == false) goto L53;
     */
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m13799c0(io.grpc.p384h1.AbstractC9857z1.C9869b0 r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r3 = r0
            r2 = 0
        L4:
            java.lang.Object r4 = r8.f23157i
            monitor-enter(r4)
            io.grpc.h1.z1$z r5 = r8.f23163o     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto L1b
            io.grpc.h1.z1$b0 r6 = r5.f23238f     // Catch: java.lang.Throwable -> La7
            if (r6 == 0) goto L15
            io.grpc.h1.z1$b0 r6 = r5.f23238f     // Catch: java.lang.Throwable -> La7
            if (r6 == r9) goto L15
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La7
            goto L37
        L15:
            boolean r6 = r5.f23239g     // Catch: java.lang.Throwable -> La7
            if (r6 == 0) goto L1b
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La7
            goto L37
        L1b:
            java.util.List<io.grpc.h1.z1$r> r6 = r5.f23234b     // Catch: java.lang.Throwable -> La7
            int r6 = r6.size()     // Catch: java.lang.Throwable -> La7
            if (r2 != r6) goto L50
            io.grpc.h1.z1$z r0 = r5.m13746h(r9)     // Catch: java.lang.Throwable -> La7
            r8.f23163o = r0     // Catch: java.lang.Throwable -> La7
            boolean r0 = r8.mo13798d()     // Catch: java.lang.Throwable -> La7
            if (r0 != 0) goto L31
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La7
            return
        L31:
            io.grpc.h1.z1$p r0 = new io.grpc.h1.z1$p     // Catch: java.lang.Throwable -> La7
            r0.<init>()     // Catch: java.lang.Throwable -> La7
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La7
        L37:
            if (r0 == 0) goto L3f
            java.util.concurrent.Executor r9 = r8.f23151c
            r9.execute(r0)
            return
        L3f:
            io.grpc.h1.q r0 = r9.f23192a
            io.grpc.h1.z1$z r1 = r8.f23163o
            io.grpc.h1.z1$b0 r1 = r1.f23238f
            if (r1 != r9) goto L4a
            io.grpc.c1 r9 = r8.f23170v
            goto L4c
        L4a:
            io.grpc.c1 r9 = io.grpc.p384h1.AbstractC9857z1.f23148z
        L4c:
            r0.mo13804a(r9)
            return
        L50:
            boolean r6 = r9.f23193b     // Catch: java.lang.Throwable -> La7
            if (r6 == 0) goto L56
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La7
            return
        L56:
            int r6 = r2 + 128
            java.util.List<io.grpc.h1.z1$r> r7 = r5.f23234b     // Catch: java.lang.Throwable -> La7
            int r7 = r7.size()     // Catch: java.lang.Throwable -> La7
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> La7
            if (r3 != 0) goto L70
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La7
            java.util.List<io.grpc.h1.z1$r> r5 = r5.f23234b     // Catch: java.lang.Throwable -> La7
            java.util.List r2 = r5.subList(r2, r6)     // Catch: java.lang.Throwable -> La7
            r3.<init>(r2)     // Catch: java.lang.Throwable -> La7
            goto L7c
        L70:
            r3.clear()     // Catch: java.lang.Throwable -> La7
            java.util.List<io.grpc.h1.z1$r> r5 = r5.f23234b     // Catch: java.lang.Throwable -> La7
            java.util.List r2 = r5.subList(r2, r6)     // Catch: java.lang.Throwable -> La7
            r3.addAll(r2)     // Catch: java.lang.Throwable -> La7
        L7c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La7
            java.util.Iterator r2 = r3.iterator()
        L81:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto La4
            java.lang.Object r4 = r2.next()
            io.grpc.h1.z1$r r4 = (io.grpc.p384h1.AbstractC9857z1.InterfaceC9886r) r4
            r4.mo13754a(r9)
            boolean r4 = r4 instanceof io.grpc.p384h1.AbstractC9857z1.C9894y
            if (r4 == 0) goto L95
            r1 = 1
        L95:
            if (r1 == 0) goto L81
            io.grpc.h1.z1$z r4 = r8.f23163o
            io.grpc.h1.z1$b0 r5 = r4.f23238f
            if (r5 == 0) goto La0
            if (r5 == r9) goto La0
            goto La4
        La0:
            boolean r4 = r4.f23239g
            if (r4 == 0) goto L81
        La4:
            r2 = r6
            goto L4
        La7:
            r9 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La7
            goto Lab
        Laa:
            throw r9
        Lab:
            goto Laa
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.p384h1.AbstractC9857z1.m13799c0(io.grpc.h1.z1$b0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public void m13797d0() {
        Future<?> future;
        synchronized (this.f23157i) {
            future = null;
            if (this.f23168t != null) {
                Future<?> m13756b = this.f23168t.m13756b();
                this.f23168t = null;
                future = m13756b;
            }
            this.f23163o = this.f23163o.m13750d();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public boolean m13795e0(C9895z c9895z) {
        return c9895z.f23238f == null && c9895z.f23237e < this.f23155g.f22984a && !c9895z.f23240h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public void m13787i0(Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            m13797d0();
            return;
        }
        synchronized (this.f23157i) {
            if (this.f23168t == null) {
                return;
            }
            Future<?> m13756b = this.f23168t.m13756b();
            C9889u c9889u = new C9889u(this.f23157i);
            this.f23168t = c9889u;
            if (m13756b != null) {
                m13756b.cancel(false);
            }
            c9889u.m13755c(this.f23152d.schedule(new RunnableC9891w(c9889u), num.intValue(), TimeUnit.MILLISECONDS));
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: a */
    public final void mo13804a(C9497c1 c9497c1) {
        C9869b0 c9869b0 = new C9869b0(0);
        c9869b0.f23192a = new C9729o1();
        Runnable m13806Y = m13806Y(c9869b0);
        if (m13806Y != null) {
            m13806Y.run();
            this.f23151c.execute(new RunnableC9885q(c9497c1));
            return;
        }
        C9869b0 c9869b02 = null;
        synchronized (this.f23157i) {
            if (this.f23163o.f23235c.contains(this.f23163o.f23238f)) {
                c9869b02 = this.f23163o.f23238f;
            } else {
                this.f23170v = c9497c1;
            }
            this.f23163o = this.f23163o.m13752b();
        }
        if (c9869b02 != null) {
            c9869b02.f23192a.mo13804a(c9497c1);
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    /* renamed from: b */
    public final void mo13802b(InterfaceC10033o interfaceC10033o) {
        m13801b0(new C9872d(this, interfaceC10033o));
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    /* renamed from: c */
    public final void mo13800c(int i) {
        C9895z c9895z = this.f23163o;
        if (c9895z.f23233a) {
            c9895z.f23238f.f23192a.mo13800c(i);
        } else {
            m13801b0(new C9881m(this, i));
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    /* renamed from: d */
    public final boolean mo13798d() {
        for (C9869b0 c9869b0 : this.f23163o.f23235c) {
            if (c9869b0.f23192a.mo13798d()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    /* renamed from: e */
    public final void mo13796e(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    /* renamed from: f */
    public void mo13794f() {
        m13801b0(new C9880l(this));
    }

    /* renamed from: f0 */
    abstract InterfaceC9749q mo13793f0(C10049s0 c10049s0, AbstractC10001l.AbstractC10002a abstractC10002a, int i, boolean z);

    @Override // io.grpc.p384h1.InterfaceC9689j2
    public final void flush() {
        C9895z c9895z = this.f23163o;
        if (c9895z.f23233a) {
            c9895z.f23238f.f23192a.flush();
        } else {
            m13801b0(new C9875g(this));
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: g */
    public final void mo13792g(int i) {
        m13801b0(new C9878j(this, i));
    }

    /* renamed from: g0 */
    abstract void mo13791g0();

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: h */
    public final void mo13790h(int i) {
        m13801b0(new C9879k(this, i));
    }

    /* renamed from: h0 */
    abstract C9497c1 mo13789h0();

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: i */
    public final void mo13788i(C10082w c10082w) {
        m13801b0(new C9874f(this, c10082w));
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: j */
    public final void mo13691j(String str) {
        m13801b0(new C9868b(this, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final void m13786j0(ReqT reqt) {
        C9895z c9895z = this.f23163o;
        if (c9895z.f23233a) {
            c9895z.f23238f.f23192a.mo13796e(this.f23149a.m13161j(reqt));
        } else {
            m13801b0(new C9882n(reqt));
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: k */
    public void mo13785k(C9811x0 c9811x0) {
        C9895z c9895z;
        synchronized (this.f23157i) {
            c9811x0.m13938b(MetricTracker.Action.CLOSED, this.f23162n);
            c9895z = this.f23163o;
        }
        if (c9895z.f23238f != null) {
            C9811x0 c9811x02 = new C9811x0();
            c9895z.f23238f.f23192a.mo13785k(c9811x02);
            c9811x0.m13938b("committed", c9811x02);
            return;
        }
        C9811x0 c9811x03 = new C9811x0();
        for (C9869b0 c9869b0 : c9895z.f23235c) {
            C9811x0 c9811x04 = new C9811x0();
            c9869b0.f23192a.mo13785k(c9811x04);
            c9811x03.m13939a(c9811x04);
        }
        c9811x0.m13938b("open", c9811x03);
    }

    /* renamed from: k0 */
    final C10049s0 m13784k0(C10049s0 c10049s0, int i) {
        C10049s0 c10049s02 = new C10049s0();
        c10049s02.m13206k(c10049s0);
        if (i > 0) {
            c10049s02.m13203n(f23146x, String.valueOf(i));
        }
        return c10049s02;
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: l */
    public final void mo13783l() {
        m13801b0(new C9877i(this));
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: m */
    public final C9477a mo13690m() {
        if (this.f23163o.f23238f != null) {
            return this.f23163o.f23238f.f23192a.mo13690m();
        }
        return C9477a.f22159b;
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: n */
    public final void mo13782n(C10065u c10065u) {
        m13801b0(new C9873e(this, c10065u));
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: o */
    public final void mo13781o(InterfaceC9753r interfaceC9753r) {
        this.f23166r = interfaceC9753r;
        C9497c1 mo13789h0 = mo13789h0();
        if (mo13789h0 != null) {
            mo13804a(mo13789h0);
            return;
        }
        synchronized (this.f23157i) {
            this.f23163o.f23234b.add(new C9894y());
        }
        C9869b0 m13803a0 = m13803a0(0, false);
        if (this.f23156h) {
            C9889u c9889u = null;
            synchronized (this.f23157i) {
                this.f23163o = this.f23163o.m13753a(m13803a0);
                if (m13795e0(this.f23163o) && (this.f23161m == null || this.f23161m.m13762a())) {
                    c9889u = new C9889u(this.f23157i);
                    this.f23168t = c9889u;
                }
            }
            if (c9889u != null) {
                c9889u.m13755c(this.f23152d.schedule(new RunnableC9891w(c9889u), this.f23155g.f22985b, TimeUnit.NANOSECONDS));
            }
        }
        m13799c0(m13803a0);
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: q */
    public final void mo13779q(boolean z) {
        m13801b0(new C9876h(this, z));
    }
}
