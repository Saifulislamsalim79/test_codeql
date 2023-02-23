package io.grpc.p384h1;

import com.google.common.base.C5051n;
import com.google.common.base.C5055p;
import com.google.common.util.concurrent.C5162d;
import io.grpc.C9497c1;
import io.grpc.p384h1.InterfaceC9773s;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: KeepAliveManager.java */
/* renamed from: io.grpc.h1.c1 */
/* loaded from: classes2.dex */
public class C9574c1 {

    /* renamed from: a */
    private final ScheduledExecutorService f22426a;

    /* renamed from: b */
    private final C5055p f22427b;

    /* renamed from: c */
    private final InterfaceC9579d f22428c;

    /* renamed from: d */
    private final boolean f22429d;

    /* renamed from: e */
    private EnumC9580e f22430e;

    /* renamed from: f */
    private ScheduledFuture<?> f22431f;

    /* renamed from: g */
    private ScheduledFuture<?> f22432g;

    /* renamed from: h */
    private final Runnable f22433h;

    /* renamed from: i */
    private final Runnable f22434i;

    /* renamed from: j */
    private final long f22435j;

    /* renamed from: k */
    private final long f22436k;

    /* compiled from: KeepAliveManager.java */
    /* renamed from: io.grpc.h1.c1$a */
    /* loaded from: classes2.dex */
    class RunnableC9575a implements Runnable {
        RunnableC9575a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            synchronized (C9574c1.this) {
                if (C9574c1.this.f22430e != EnumC9580e.DISCONNECTED) {
                    C9574c1.this.f22430e = EnumC9580e.DISCONNECTED;
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                C9574c1.this.f22428c.mo14405a();
            }
        }
    }

    /* compiled from: KeepAliveManager.java */
    /* renamed from: io.grpc.h1.c1$b */
    /* loaded from: classes2.dex */
    class RunnableC9576b implements Runnable {
        RunnableC9576b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            synchronized (C9574c1.this) {
                C9574c1.this.f22432g = null;
                if (C9574c1.this.f22430e != EnumC9580e.PING_SCHEDULED) {
                    if (C9574c1.this.f22430e == EnumC9580e.PING_DELAYED) {
                        C9574c1.this.f22432g = C9574c1.this.f22426a.schedule(C9574c1.this.f22434i, C9574c1.this.f22435j - C9574c1.this.f22427b.m25763d(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
                        C9574c1.this.f22430e = EnumC9580e.PING_SCHEDULED;
                    }
                    z = false;
                } else {
                    z = true;
                    C9574c1.this.f22430e = EnumC9580e.PING_SENT;
                    C9574c1.this.f22431f = C9574c1.this.f22426a.schedule(C9574c1.this.f22433h, C9574c1.this.f22436k, TimeUnit.NANOSECONDS);
                }
            }
            if (z) {
                C9574c1.this.f22428c.mo14404b();
            }
        }
    }

    /* compiled from: KeepAliveManager.java */
    /* renamed from: io.grpc.h1.c1$c */
    /* loaded from: classes2.dex */
    public static final class C9577c implements InterfaceC9579d {

        /* renamed from: a */
        private final InterfaceC9798v f22439a;

        /* compiled from: KeepAliveManager.java */
        /* renamed from: io.grpc.h1.c1$c$a */
        /* loaded from: classes2.dex */
        class C9578a implements InterfaceC9773s.InterfaceC9774a {
            C9578a() {
            }

            @Override // io.grpc.p384h1.InterfaceC9773s.InterfaceC9774a
            /* renamed from: a */
            public void mo14031a(Throwable th) {
                C9577c.this.f22439a.mo13633d(C9497c1.f22195n.m14578r("Keepalive failed. The connection is likely gone"));
            }

            @Override // io.grpc.p384h1.InterfaceC9773s.InterfaceC9774a
            /* renamed from: b */
            public void mo14030b(long j) {
            }
        }

        public C9577c(InterfaceC9798v interfaceC9798v) {
            this.f22439a = interfaceC9798v;
        }

        @Override // io.grpc.p384h1.C9574c1.InterfaceC9579d
        /* renamed from: a */
        public void mo14405a() {
            this.f22439a.mo13633d(C9497c1.f22195n.m14578r("Keepalive failed. The connection is likely gone"));
        }

        @Override // io.grpc.p384h1.C9574c1.InterfaceC9579d
        /* renamed from: b */
        public void mo14404b() {
            this.f22439a.mo13628g(new C9578a(), C5162d.m25489a());
        }
    }

    /* compiled from: KeepAliveManager.java */
    /* renamed from: io.grpc.h1.c1$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC9579d {
        /* renamed from: a */
        void mo14405a();

        /* renamed from: b */
        void mo14404b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: KeepAliveManager.java */
    /* renamed from: io.grpc.h1.c1$e */
    /* loaded from: classes2.dex */
    public enum EnumC9580e {
        IDLE,
        PING_SCHEDULED,
        PING_DELAYED,
        PING_SENT,
        IDLE_AND_PING_SENT,
        DISCONNECTED
    }

    static {
        TimeUnit.SECONDS.toNanos(10L);
        TimeUnit.MILLISECONDS.toNanos(10L);
    }

    public C9574c1(InterfaceC9579d interfaceC9579d, ScheduledExecutorService scheduledExecutorService, long j, long j2, boolean z) {
        this(interfaceC9579d, scheduledExecutorService, C5055p.m25764c(), j, j2, z);
    }

    /* renamed from: l */
    public synchronized void m14411l() {
        C5055p c5055p = this.f22427b;
        c5055p.m25761f();
        c5055p.m25760g();
        if (this.f22430e == EnumC9580e.PING_SCHEDULED) {
            this.f22430e = EnumC9580e.PING_DELAYED;
        } else if (this.f22430e == EnumC9580e.PING_SENT || this.f22430e == EnumC9580e.IDLE_AND_PING_SENT) {
            if (this.f22431f != null) {
                this.f22431f.cancel(false);
            }
            if (this.f22430e == EnumC9580e.IDLE_AND_PING_SENT) {
                this.f22430e = EnumC9580e.IDLE;
                return;
            }
            this.f22430e = EnumC9580e.PING_SCHEDULED;
            C5051n.m25773u(this.f22432g == null, "There should be no outstanding pingFuture");
            this.f22432g = this.f22426a.schedule(this.f22434i, this.f22435j, TimeUnit.NANOSECONDS);
        }
    }

    /* renamed from: m */
    public synchronized void m14410m() {
        if (this.f22430e == EnumC9580e.IDLE) {
            this.f22430e = EnumC9580e.PING_SCHEDULED;
            if (this.f22432g == null) {
                this.f22432g = this.f22426a.schedule(this.f22434i, this.f22435j - this.f22427b.m25763d(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
            }
        } else if (this.f22430e == EnumC9580e.IDLE_AND_PING_SENT) {
            this.f22430e = EnumC9580e.PING_SENT;
        }
    }

    /* renamed from: n */
    public synchronized void m14409n() {
        if (this.f22429d) {
            return;
        }
        if (this.f22430e == EnumC9580e.PING_SCHEDULED || this.f22430e == EnumC9580e.PING_DELAYED) {
            this.f22430e = EnumC9580e.IDLE;
        }
        if (this.f22430e == EnumC9580e.PING_SENT) {
            this.f22430e = EnumC9580e.IDLE_AND_PING_SENT;
        }
    }

    /* renamed from: o */
    public synchronized void m14408o() {
        if (this.f22429d) {
            m14410m();
        }
    }

    /* renamed from: p */
    public synchronized void m14407p() {
        if (this.f22430e != EnumC9580e.DISCONNECTED) {
            this.f22430e = EnumC9580e.DISCONNECTED;
            if (this.f22431f != null) {
                this.f22431f.cancel(false);
            }
            if (this.f22432g != null) {
                this.f22432g.cancel(false);
                this.f22432g = null;
            }
        }
    }

    C9574c1(InterfaceC9579d interfaceC9579d, ScheduledExecutorService scheduledExecutorService, C5055p c5055p, long j, long j2, boolean z) {
        this.f22430e = EnumC9580e.IDLE;
        this.f22433h = new RunnableC9586d1(new RunnableC9575a());
        this.f22434i = new RunnableC9586d1(new RunnableC9576b());
        C5051n.m25779o(interfaceC9579d, "keepAlivePinger");
        this.f22428c = interfaceC9579d;
        C5051n.m25779o(scheduledExecutorService, "scheduler");
        this.f22426a = scheduledExecutorService;
        C5051n.m25779o(c5055p, "stopwatch");
        this.f22427b = c5055p;
        this.f22435j = j;
        this.f22436k = j2;
        this.f22429d = z;
        c5055p.m25761f();
        c5055p.m25760g();
    }
}
