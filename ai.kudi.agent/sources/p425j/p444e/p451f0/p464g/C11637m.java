package p425j.p444e.p451f0.p464g;

import j.e.c0.c;
import j.e.i0.a;
import j.e.v;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p425j.p444e.p448c0.C11281d;
import p425j.p444e.p451f0.p452a.EnumC11297d;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.v$b;
/* compiled from: TrampolineScheduler.java */
/* renamed from: j.e.f0.g.m */
/* loaded from: classes3.dex */
public final class C11637m extends v {

    /* renamed from: a */
    private static final C11637m f26291a = new C11637m();

    /* compiled from: TrampolineScheduler.java */
    /* renamed from: j.e.f0.g.m$a */
    /* loaded from: classes3.dex */
    static final class RunnableC11638a implements Runnable {

        /* renamed from: c */
        private final Runnable f26292c;

        /* renamed from: d */
        private final C11640c f26293d;

        /* renamed from: e */
        private final long f26294e;

        RunnableC11638a(Runnable runnable, C11640c c11640c, long j) {
            this.f26292c = runnable;
            this.f26293d = c11640c;
            this.f26294e = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f26293d.f26302f) {
                return;
            }
            long m10449a = this.f26293d.m10449a(TimeUnit.MILLISECONDS);
            long j = this.f26294e;
            if (j > m10449a) {
                try {
                    Thread.sleep(j - m10449a);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    a.r(e);
                    return;
                }
            }
            if (this.f26293d.f26302f) {
                return;
            }
            this.f26292c.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TrampolineScheduler.java */
    /* renamed from: j.e.f0.g.m$b */
    /* loaded from: classes3.dex */
    public static final class C11639b implements Comparable<C11639b> {

        /* renamed from: c */
        final Runnable f26295c;

        /* renamed from: d */
        final long f26296d;

        /* renamed from: e */
        final int f26297e;

        /* renamed from: f */
        volatile boolean f26298f;

        C11639b(Runnable runnable, Long l, int i) {
            this.f26295c = runnable;
            this.f26296d = l.longValue();
            this.f26297e = i;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C11639b c11639b) {
            int m11115b = C11312b.m11115b(this.f26296d, c11639b.f26296d);
            return m11115b == 0 ? C11312b.m11116a(this.f26297e, c11639b.f26297e) : m11115b;
        }
    }

    /* compiled from: TrampolineScheduler.java */
    /* renamed from: j.e.f0.g.m$c */
    /* loaded from: classes3.dex */
    static final class C11640c extends v$b implements c {

        /* renamed from: c */
        final PriorityBlockingQueue<C11639b> f26299c = new PriorityBlockingQueue<>();

        /* renamed from: d */
        private final AtomicInteger f26300d = new AtomicInteger();

        /* renamed from: e */
        final AtomicInteger f26301e = new AtomicInteger();

        /* renamed from: f */
        volatile boolean f26302f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TrampolineScheduler.java */
        /* renamed from: j.e.f0.g.m$c$a */
        /* loaded from: classes3.dex */
        public final class RunnableC11641a implements Runnable {

            /* renamed from: c */
            final C11639b f26303c;

            RunnableC11641a(C11639b c11639b) {
                this.f26303c = c11639b;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f26303c.f26298f = true;
                C11640c.this.f26299c.remove(this.f26303c);
            }
        }

        C11640c() {
        }

        @Override // p425j.p444e.v$b
        /* renamed from: b */
        public c mo10448b(Runnable runnable) {
            return m10697d(runnable, m10449a(TimeUnit.MILLISECONDS));
        }

        @Override // p425j.p444e.v$b
        /* renamed from: c */
        public c mo10447c(Runnable runnable, long j, TimeUnit timeUnit) {
            long m10449a = m10449a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return m10697d(new RunnableC11638a(runnable, this, m10449a), m10449a);
        }

        /* renamed from: d */
        c m10697d(Runnable runnable, long j) {
            if (this.f26302f) {
                return EnumC11297d.INSTANCE;
            }
            C11639b c11639b = new C11639b(runnable, Long.valueOf(j), this.f26301e.incrementAndGet());
            this.f26299c.add(c11639b);
            if (this.f26300d.getAndIncrement() == 0) {
                int i = 1;
                while (!this.f26302f) {
                    C11639b poll = this.f26299c.poll();
                    if (poll == null) {
                        i = this.f26300d.addAndGet(-i);
                        if (i == 0) {
                            return EnumC11297d.INSTANCE;
                        }
                    } else if (!poll.f26298f) {
                        poll.f26295c.run();
                    }
                }
                this.f26299c.clear();
                return EnumC11297d.INSTANCE;
            }
            return C11281d.m11207d(new RunnableC11641a(c11639b));
        }

        /* renamed from: i */
        public void m10696i() {
            this.f26302f = true;
        }

        /* renamed from: j */
        public boolean m10695j() {
            return this.f26302f;
        }
    }

    C11637m() {
    }

    /* renamed from: d */
    public static C11637m m10699d() {
        return f26291a;
    }

    /* renamed from: a */
    public v$b m10702a() {
        return new C11640c();
    }

    /* renamed from: b */
    public c m10701b(Runnable runnable) {
        a.u(runnable).run();
        return EnumC11297d.INSTANCE;
    }

    /* renamed from: c */
    public c m10700c(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            a.u(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            a.r(e);
        }
        return EnumC11297d.INSTANCE;
    }
}
