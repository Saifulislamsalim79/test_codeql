package p565l;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.connection.C14475c;
import okhttp3.internal.connection.C14476d;
import okhttp3.internal.connection.C14479f;
import p565l.p566g0.C14148c;
import p565l.p566g0.p571i.C14198f;
/* compiled from: ConnectionPool.java */
/* renamed from: l.j */
/* loaded from: classes3.dex */
public final class C14212j {

    /* renamed from: g */
    private static final Executor f31096g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C14148c.m2811G("OkHttp ConnectionPool", true));

    /* renamed from: a */
    private final int f31097a;

    /* renamed from: b */
    private final long f31098b;

    /* renamed from: c */
    private final Runnable f31099c;

    /* renamed from: d */
    private final Deque<C14475c> f31100d;

    /* renamed from: e */
    final C14476d f31101e;

    /* renamed from: f */
    boolean f31102f;

    /* compiled from: ConnectionPool.java */
    /* renamed from: l.j$a */
    /* loaded from: classes3.dex */
    class RunnableC14213a implements Runnable {
        RunnableC14213a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long m2625a = C14212j.this.m2625a(System.nanoTime());
                if (m2625a == -1) {
                    return;
                }
                if (m2625a > 0) {
                    long j = m2625a / 1000000;
                    long j2 = m2625a - (1000000 * j);
                    synchronized (C14212j.this) {
                        try {
                            C14212j.this.wait(j, (int) j2);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public C14212j() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    /* renamed from: e */
    private int m2621e(C14475c c14475c, long j) {
        List<Reference<C14479f>> list = c14475c.f31862n;
        int i = 0;
        while (i < list.size()) {
            Reference<C14479f> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C14198f.m2653j().mo2645r("A connection to " + c14475c.m1596p().m2832a().m2922l() + " was leaked. Did you forget to close a response body?", ((C14479f.C14480a) reference).f31889a);
                list.remove(i);
                c14475c.f31859k = true;
                if (list.isEmpty()) {
                    c14475c.f31863o = j - this.f31098b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* renamed from: a */
    long m2625a(long j) {
        synchronized (this) {
            C14475c c14475c = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (C14475c c14475c2 : this.f31100d) {
                if (m2621e(c14475c2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - c14475c2.f31863o;
                    if (j3 > j2) {
                        c14475c = c14475c2;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.f31098b && i <= this.f31097a) {
                if (i > 0) {
                    return this.f31098b - j2;
                } else if (i2 > 0) {
                    return this.f31098b;
                } else {
                    this.f31102f = false;
                    return -1L;
                }
            }
            this.f31100d.remove(c14475c);
            C14148c.m2800h(c14475c.m1595q());
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m2624b(C14475c c14475c) {
        if (!c14475c.f31859k && this.f31097a != 0) {
            notifyAll();
            return false;
        }
        this.f31100d.remove(c14475c);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Socket m2623c(C14115a c14115a, C14479f c14479f) {
        for (C14475c c14475c : this.f31100d) {
            if (c14475c.m1600l(c14115a, null) && c14475c.m1598n() && c14475c != c14479f.m1575d()) {
                return c14479f.m1566m(c14475c);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C14475c m2622d(C14115a c14115a, C14479f c14479f, C14140e0 c14140e0) {
        for (C14475c c14475c : this.f31100d) {
            if (c14475c.m1600l(c14115a, c14140e0)) {
                c14479f.m1578a(c14475c, true);
                return c14475c;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m2620f(C14475c c14475c) {
        if (!this.f31102f) {
            this.f31102f = true;
            f31096g.execute(this.f31099c);
        }
        this.f31100d.add(c14475c);
    }

    public C14212j(int i, long j, TimeUnit timeUnit) {
        this.f31099c = new RunnableC14213a();
        this.f31100d = new ArrayDeque();
        this.f31101e = new C14476d();
        this.f31097a = i;
        this.f31098b = timeUnit.toNanos(j);
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
    }
}
