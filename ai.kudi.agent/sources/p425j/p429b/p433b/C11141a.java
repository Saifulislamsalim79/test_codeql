package p425j.p429b.p433b;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* compiled from: AsyncTimeout.java */
/* renamed from: j.b.b.a */
/* loaded from: classes3.dex */
public class C11141a extends C11171t {
    private static final long IDLE_TIMEOUT_MILLIS = TimeUnit.SECONDS.toMillis(60);
    private static final long IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(IDLE_TIMEOUT_MILLIS);
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    static C11141a head;
    private boolean inQueue;
    private C11141a next;
    private long timeoutAt;

    /* compiled from: AsyncTimeout.java */
    /* renamed from: j.b.b.a$a */
    /* loaded from: classes3.dex */
    class C11142a implements InterfaceC11169r {

        /* renamed from: c */
        final /* synthetic */ InterfaceC11169r f25199c;

        C11142a(InterfaceC11169r interfaceC11169r) {
            this.f25199c = interfaceC11169r;
        }

        @Override // p425j.p429b.p433b.InterfaceC11169r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C11141a.this.enter();
            try {
                try {
                    this.f25199c.close();
                    C11141a.this.exit(true);
                } catch (IOException e) {
                    throw C11141a.this.exit(e);
                }
            } catch (Throwable th) {
                C11141a.this.exit(false);
                throw th;
            }
        }

        @Override // p425j.p429b.p433b.InterfaceC11169r, java.io.Flushable
        public void flush() throws IOException {
            C11141a.this.enter();
            try {
                try {
                    this.f25199c.flush();
                    C11141a.this.exit(true);
                } catch (IOException e) {
                    throw C11141a.this.exit(e);
                }
            } catch (Throwable th) {
                C11141a.this.exit(false);
                throw th;
            }
        }

        @Override // p425j.p429b.p433b.InterfaceC11169r
        public C11171t timeout() {
            return C11141a.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f25199c + ")";
        }

        @Override // p425j.p429b.p433b.InterfaceC11169r
        public void write(C11146c c11146c, long j) throws IOException {
            C11173u.m11454b(c11146c.f25206d, 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                C11166o c11166o = c11146c.f25205c;
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += c11166o.f25246c - c11166o.f25245b;
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    c11166o = c11166o.f25249f;
                }
                C11141a.this.enter();
                try {
                    try {
                        this.f25199c.write(c11146c, j2);
                        j -= j2;
                        C11141a.this.exit(true);
                    } catch (IOException e) {
                        throw C11141a.this.exit(e);
                    }
                } catch (Throwable th) {
                    C11141a.this.exit(false);
                    throw th;
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.java */
    /* renamed from: j.b.b.a$b */
    /* loaded from: classes3.dex */
    class C11143b implements InterfaceC11170s {

        /* renamed from: c */
        final /* synthetic */ InterfaceC11170s f25201c;

        C11143b(InterfaceC11170s interfaceC11170s) {
            this.f25201c = interfaceC11170s;
        }

        @Override // p425j.p429b.p433b.InterfaceC11170s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C11141a.this.enter();
            try {
                try {
                    this.f25201c.close();
                    C11141a.this.exit(true);
                } catch (IOException e) {
                    throw C11141a.this.exit(e);
                }
            } catch (Throwable th) {
                C11141a.this.exit(false);
                throw th;
            }
        }

        @Override // p425j.p429b.p433b.InterfaceC11170s
        public long read(C11146c c11146c, long j) throws IOException {
            C11141a.this.enter();
            try {
                try {
                    long read = this.f25201c.read(c11146c, j);
                    C11141a.this.exit(true);
                    return read;
                } catch (IOException e) {
                    throw C11141a.this.exit(e);
                }
            } catch (Throwable th) {
                C11141a.this.exit(false);
                throw th;
            }
        }

        @Override // p425j.p429b.p433b.InterfaceC11170s
        public C11171t timeout() {
            return C11141a.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f25201c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsyncTimeout.java */
    /* renamed from: j.b.b.a$c */
    /* loaded from: classes3.dex */
    public static final class C11144c extends Thread {
        C11144c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
            r1.timedOut();
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
                java.lang.Class<j.b.b.a> r0 = p425j.p429b.p433b.C11141a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                j.b.b.a r1 = p425j.p429b.p433b.C11141a.awaitTimeout()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                j.b.b.a r2 = p425j.p429b.p433b.C11141a.head     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                p425j.p429b.p433b.C11141a.head = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.timedOut()     // Catch: java.lang.InterruptedException -> L0
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
            throw new UnsupportedOperationException("Method not decompiled: p425j.p429b.p433b.C11141a.C11144c.run():void");
        }
    }

    static C11141a awaitTimeout() throws InterruptedException {
        C11141a c11141a = head.next;
        if (c11141a == null) {
            long nanoTime = System.nanoTime();
            C11141a.class.wait(IDLE_TIMEOUT_MILLIS);
            if (head.next != null || System.nanoTime() - nanoTime < IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return head;
        }
        long remainingNanos = c11141a.remainingNanos(System.nanoTime());
        if (remainingNanos > 0) {
            long j = remainingNanos / 1000000;
            C11141a.class.wait(j, (int) (remainingNanos - (1000000 * j)));
            return null;
        }
        head.next = c11141a.next;
        c11141a.next = null;
        return c11141a;
    }

    private static synchronized boolean cancelScheduledTimeout(C11141a c11141a) {
        synchronized (C11141a.class) {
            for (C11141a c11141a2 = head; c11141a2 != null; c11141a2 = c11141a2.next) {
                if (c11141a2.next == c11141a) {
                    c11141a2.next = c11141a.next;
                    c11141a.next = null;
                    return false;
                }
            }
            return true;
        }
    }

    private long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    private static synchronized void scheduleTimeout(C11141a c11141a, long j, boolean z) {
        synchronized (C11141a.class) {
            if (head == null) {
                head = new C11141a();
                new C11144c().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                c11141a.timeoutAt = Math.min(j, c11141a.deadlineNanoTime() - nanoTime) + nanoTime;
            } else if (j != 0) {
                c11141a.timeoutAt = j + nanoTime;
            } else if (z) {
                c11141a.timeoutAt = c11141a.deadlineNanoTime();
            } else {
                throw new AssertionError();
            }
            long remainingNanos = c11141a.remainingNanos(nanoTime);
            C11141a c11141a2 = head;
            while (c11141a2.next != null && remainingNanos >= c11141a2.next.remainingNanos(nanoTime)) {
                c11141a2 = c11141a2.next;
            }
            c11141a.next = c11141a2.next;
            c11141a2.next = c11141a;
            if (c11141a2 == head) {
                C11141a.class.notify();
            }
        }
    }

    public final void enter() {
        if (!this.inQueue) {
            long timeoutNanos = timeoutNanos();
            boolean hasDeadline = hasDeadline();
            if (timeoutNanos != 0 || hasDeadline) {
                this.inQueue = true;
                scheduleTimeout(this, timeoutNanos, hasDeadline);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final boolean exit() {
        if (this.inQueue) {
            this.inQueue = false;
            return cancelScheduledTimeout(this);
        }
        return false;
    }

    protected IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final InterfaceC11169r sink(InterfaceC11169r interfaceC11169r) {
        return new C11142a(interfaceC11169r);
    }

    public final InterfaceC11170s source(InterfaceC11170s interfaceC11170s) {
        return new C11143b(interfaceC11170s);
    }

    protected void timedOut() {
    }

    final void exit(boolean z) throws IOException {
        if (exit() && z) {
            throw newTimeoutException(null);
        }
    }

    final IOException exit(IOException iOException) throws IOException {
        return !exit() ? iOException : newTimeoutException(iOException);
    }
}
