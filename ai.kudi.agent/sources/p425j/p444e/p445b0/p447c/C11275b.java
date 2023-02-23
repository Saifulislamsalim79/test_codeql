package p425j.p444e.p445b0.p447c;

import android.os.Handler;
import android.os.Message;
import j.e.c0.c;
import j.e.i0.a;
import j.e.v;
import java.util.concurrent.TimeUnit;
import p425j.p444e.p448c0.C11281d;
import p425j.p444e.v$b;
/* compiled from: HandlerScheduler.java */
/* renamed from: j.e.b0.c.b */
/* loaded from: classes3.dex */
final class C11275b extends v {

    /* renamed from: a */
    private final Handler f25411a;

    /* renamed from: b */
    private final boolean f25412b;

    /* compiled from: HandlerScheduler.java */
    /* renamed from: j.e.b0.c.b$a */
    /* loaded from: classes3.dex */
    private static final class C11276a extends v$b {

        /* renamed from: c */
        private final Handler f25413c;

        /* renamed from: d */
        private final boolean f25414d;

        /* renamed from: e */
        private volatile boolean f25415e;

        C11276a(Handler handler, boolean z) {
            this.f25413c = handler;
            this.f25414d = z;
        }

        @Override // p425j.p444e.v$b
        /* renamed from: c */
        public c mo10447c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable != null) {
                if (timeUnit != null) {
                    if (this.f25415e) {
                        return C11281d.m11210a();
                    }
                    RunnableC11277b runnableC11277b = new RunnableC11277b(this.f25413c, a.u(runnable));
                    Message obtain = Message.obtain(this.f25413c, runnableC11277b);
                    obtain.obj = this;
                    if (this.f25414d) {
                        obtain.setAsynchronous(true);
                    }
                    this.f25413c.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                    if (this.f25415e) {
                        this.f25413c.removeCallbacks(runnableC11277b);
                        return C11281d.m11210a();
                    }
                    return runnableC11277b;
                }
                throw new NullPointerException("unit == null");
            }
            throw new NullPointerException("run == null");
        }

        /* renamed from: i */
        public void m11219i() {
            this.f25415e = true;
            this.f25413c.removeCallbacksAndMessages(this);
        }

        /* renamed from: j */
        public boolean m11218j() {
            return this.f25415e;
        }
    }

    /* compiled from: HandlerScheduler.java */
    /* renamed from: j.e.b0.c.b$b */
    /* loaded from: classes3.dex */
    private static final class RunnableC11277b implements Runnable, c {

        /* renamed from: c */
        private final Handler f25416c;

        /* renamed from: d */
        private final Runnable f25417d;

        /* renamed from: e */
        private volatile boolean f25418e;

        RunnableC11277b(Handler handler, Runnable runnable) {
            this.f25416c = handler;
            this.f25417d = runnable;
        }

        /* renamed from: i */
        public void m11217i() {
            this.f25416c.removeCallbacks(this);
            this.f25418e = true;
        }

        /* renamed from: j */
        public boolean m11216j() {
            return this.f25418e;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f25417d.run();
            } catch (Throwable th) {
                a.r(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11275b(Handler handler, boolean z) {
        this.f25411a = handler;
        this.f25412b = z;
    }

    /* renamed from: a */
    public v$b m11221a() {
        return new C11276a(this.f25411a, this.f25412b);
    }

    /* renamed from: c */
    public c m11220c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable != null) {
            if (timeUnit != null) {
                RunnableC11277b runnableC11277b = new RunnableC11277b(this.f25411a, a.u(runnable));
                this.f25411a.postDelayed(runnableC11277b, timeUnit.toMillis(j));
                return runnableC11277b;
            }
            throw new NullPointerException("unit == null");
        }
        throw new NullPointerException("run == null");
    }
}
