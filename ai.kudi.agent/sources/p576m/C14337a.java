package p576m;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* compiled from: AsyncTimeout.java */
/* renamed from: m.a */
/* loaded from: classes3.dex */
public class C14337a extends C14366t {

    /* renamed from: h */
    private static final long f31606h = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: i */
    private static final long f31607i = TimeUnit.MILLISECONDS.toNanos(f31606h);

    /* renamed from: j */
    static C14337a f31608j;

    /* renamed from: e */
    private boolean f31609e;

    /* renamed from: f */
    private C14337a f31610f;

    /* renamed from: g */
    private long f31611g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncTimeout.java */
    /* renamed from: m.a$a */
    /* loaded from: classes3.dex */
    public class C14338a implements InterfaceC14364r {

        /* renamed from: c */
        final /* synthetic */ InterfaceC14364r f31612c;

        C14338a(InterfaceC14364r interfaceC14364r) {
            this.f31612c = interfaceC14364r;
        }

        @Override // p576m.InterfaceC14364r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C14337a.this.m2086k();
            try {
                try {
                    this.f31612c.close();
                    C14337a.this.m2084m(true);
                } catch (IOException e) {
                    throw C14337a.this.m2085l(e);
                }
            } catch (Throwable th) {
                C14337a.this.m2084m(false);
                throw th;
            }
        }

        @Override // p576m.InterfaceC14364r, java.io.Flushable
        public void flush() throws IOException {
            C14337a.this.m2086k();
            try {
                try {
                    this.f31612c.flush();
                    C14337a.this.m2084m(true);
                } catch (IOException e) {
                    throw C14337a.this.m2085l(e);
                }
            } catch (Throwable th) {
                C14337a.this.m2084m(false);
                throw th;
            }
        }

        @Override // p576m.InterfaceC14364r
        /* renamed from: r0 */
        public void mo1444r0(C14342c c14342c, long j) throws IOException {
            C14368u.m1944b(c14342c.f31619d, 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                C14361o c14361o = c14342c.f31618c;
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += c14361o.f31654c - c14361o.f31653b;
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    c14361o = c14361o.f31657f;
                }
                C14337a.this.m2086k();
                try {
                    try {
                        this.f31612c.mo1444r0(c14342c, j2);
                        j -= j2;
                        C14337a.this.m2084m(true);
                    } catch (IOException e) {
                        throw C14337a.this.m2085l(e);
                    }
                } catch (Throwable th) {
                    C14337a.this.m2084m(false);
                    throw th;
                }
            }
        }

        @Override // p576m.InterfaceC14364r
        public C14366t timeout() {
            return C14337a.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f31612c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncTimeout.java */
    /* renamed from: m.a$b */
    /* loaded from: classes3.dex */
    public class C14339b implements InterfaceC14365s {

        /* renamed from: c */
        final /* synthetic */ InterfaceC14365s f31614c;

        C14339b(InterfaceC14365s interfaceC14365s) {
            this.f31614c = interfaceC14365s;
        }

        @Override // p576m.InterfaceC14365s
        /* renamed from: O0 */
        public long mo312O0(C14342c c14342c, long j) throws IOException {
            C14337a.this.m2086k();
            try {
                try {
                    long mo312O0 = this.f31614c.mo312O0(c14342c, j);
                    C14337a.this.m2084m(true);
                    return mo312O0;
                } catch (IOException e) {
                    throw C14337a.this.m2085l(e);
                }
            } catch (Throwable th) {
                C14337a.this.m2084m(false);
                throw th;
            }
        }

        @Override // p576m.InterfaceC14365s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C14337a.this.m2086k();
            try {
                try {
                    this.f31614c.close();
                    C14337a.this.m2084m(true);
                } catch (IOException e) {
                    throw C14337a.this.m2085l(e);
                }
            } catch (Throwable th) {
                C14337a.this.m2084m(false);
                throw th;
            }
        }

        @Override // p576m.InterfaceC14365s
        public C14366t timeout() {
            return C14337a.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f31614c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsyncTimeout.java */
    /* renamed from: m.a$c */
    /* loaded from: classes3.dex */
    public static final class C14340c extends Thread {
        C14340c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
            r1.mo1440t();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<m.a> r0 = p576m.C14337a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                m.a r1 = p576m.C14337a.m2088i()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                m.a r2 = p576m.C14337a.f31608j     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                p576m.C14337a.f31608j = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.mo1440t()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L1d
            L1c:
                throw r1
            L1d:
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: p576m.C14337a.C14340c.run():void");
        }
    }

    /* renamed from: i */
    static C14337a m2088i() throws InterruptedException {
        C14337a c14337a = f31608j.f31610f;
        if (c14337a == null) {
            long nanoTime = System.nanoTime();
            C14337a.class.wait(f31606h);
            if (f31608j.f31610f != null || System.nanoTime() - nanoTime < f31607i) {
                return null;
            }
            return f31608j;
        }
        long m2082p = c14337a.m2082p(System.nanoTime());
        if (m2082p > 0) {
            long j = m2082p / 1000000;
            C14337a.class.wait(j, (int) (m2082p - (1000000 * j)));
            return null;
        }
        f31608j.f31610f = c14337a.f31610f;
        c14337a.f31610f = null;
        return c14337a;
    }

    /* renamed from: j */
    private static synchronized boolean m2087j(C14337a c14337a) {
        synchronized (C14337a.class) {
            for (C14337a c14337a2 = f31608j; c14337a2 != null; c14337a2 = c14337a2.f31610f) {
                if (c14337a2.f31610f == c14337a) {
                    c14337a2.f31610f = c14337a.f31610f;
                    c14337a.f31610f = null;
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: p */
    private long m2082p(long j) {
        return this.f31611g - j;
    }

    /* renamed from: q */
    private static synchronized void m2081q(C14337a c14337a, long j, boolean z) {
        synchronized (C14337a.class) {
            if (f31608j == null) {
                f31608j = new C14337a();
                new C14340c().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                c14337a.f31611g = Math.min(j, c14337a.mo1951c() - nanoTime) + nanoTime;
            } else if (j != 0) {
                c14337a.f31611g = j + nanoTime;
            } else if (z) {
                c14337a.f31611g = c14337a.mo1951c();
            } else {
                throw new AssertionError();
            }
            long m2082p = c14337a.m2082p(nanoTime);
            C14337a c14337a2 = f31608j;
            while (c14337a2.f31610f != null && m2082p >= c14337a2.f31610f.m2082p(nanoTime)) {
                c14337a2 = c14337a2.f31610f;
            }
            c14337a.f31610f = c14337a2.f31610f;
            c14337a2.f31610f = c14337a;
            if (c14337a2 == f31608j) {
                C14337a.class.notify();
            }
        }
    }

    /* renamed from: k */
    public final void m2086k() {
        if (!this.f31609e) {
            long mo1949h = mo1949h();
            boolean mo1950e = mo1950e();
            if (mo1949h != 0 || mo1950e) {
                this.f31609e = true;
                m2081q(this, mo1949h, mo1950e);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    /* renamed from: l */
    final IOException m2085l(IOException iOException) throws IOException {
        return !m2083n() ? iOException : mo1441o(iOException);
    }

    /* renamed from: m */
    final void m2084m(boolean z) throws IOException {
        if (m2083n() && z) {
            throw mo1441o(null);
        }
    }

    /* renamed from: n */
    public final boolean m2083n() {
        if (this.f31609e) {
            this.f31609e = false;
            return m2087j(this);
        }
        return false;
    }

    /* renamed from: o */
    protected IOException mo1441o(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: r */
    public final InterfaceC14364r m2080r(InterfaceC14364r interfaceC14364r) {
        return new C14338a(interfaceC14364r);
    }

    /* renamed from: s */
    public final InterfaceC14365s m2079s(InterfaceC14365s interfaceC14365s) {
        return new C14339b(interfaceC14365s);
    }

    /* renamed from: t */
    protected void mo1440t() {
    }
}
