package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.y4 */
/* loaded from: classes2.dex */
public final class C4429y4 extends w5 {

    /* renamed from: l */
    private static final AtomicLong f10823l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c */
    private C4418x4 f10824c;

    /* renamed from: d */
    private C4418x4 f10825d;

    /* renamed from: e */
    private final PriorityBlockingQueue<C4407w4<?>> f10826e;

    /* renamed from: f */
    private final BlockingQueue<C4407w4<?>> f10827f;

    /* renamed from: g */
    private final Thread.UncaughtExceptionHandler f10828g;

    /* renamed from: h */
    private final Thread.UncaughtExceptionHandler f10829h;

    /* renamed from: i */
    private final Object f10830i;

    /* renamed from: j */
    private final Semaphore f10831j;

    /* renamed from: k */
    private volatile boolean f10832k;

    C4429y4(b5 b5Var) {
        super(b5Var);
        this.f10830i = new Object();
        this.f10831j = new Semaphore(2);
        this.f10826e = new PriorityBlockingQueue<>();
        this.f10827f = new LinkedBlockingQueue();
        this.f10828g = new C4396v4(this, "Thread death: Uncaught exception on worker thread");
        this.f10829h = new C4396v4(this, "Thread death: Uncaught exception on network thread");
    }

    /* renamed from: D */
    private final void m27825D(C4407w4<?> c4407w4) {
        synchronized (this.f10830i) {
            this.f10826e.add(c4407w4);
            C4418x4 c4418x4 = this.f10824c;
            if (c4418x4 == null) {
                C4418x4 c4418x42 = new C4418x4(this, "Measurement Worker", this.f10826e);
                this.f10824c = c4418x42;
                c4418x42.setUncaughtExceptionHandler(this.f10828g);
                this.f10824c.start();
            } else {
                c4418x4.m27841a();
            }
        }
    }

    /* renamed from: A */
    public final void m27828A(Runnable runnable) throws IllegalStateException {
        k();
        com.google.android.gms.common.internal.s.j(runnable);
        m27825D(new C4407w4<>(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: C */
    public final boolean m27826C() {
        return Thread.currentThread() == this.f10824c;
    }

    /* renamed from: g */
    public final void m27824g() {
        if (Thread.currentThread() != this.f10825d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: h */
    public final void m27823h() {
        if (Thread.currentThread() != this.f10824c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: j */
    protected final boolean m27822j() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final <T> T m27818r(AtomicReference<T> atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            ((v5) this).a.a().m27810z(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                ((v5) this).a.b().w().m28014a(str.length() != 0 ? "Interrupted waiting for ".concat(str) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            ((v5) this).a.b().w().m28014a(str.length() != 0 ? "Timed out waiting for ".concat(str) : new String("Timed out waiting for "));
        }
        return t;
    }

    /* renamed from: s */
    public final <V> Future<V> m27817s(Callable<V> callable) throws IllegalStateException {
        k();
        com.google.android.gms.common.internal.s.j(callable);
        C4407w4<?> c4407w4 = new C4407w4<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f10824c) {
            if (!this.f10826e.isEmpty()) {
                ((v5) this).a.b().w().m28014a("Callable skipped the worker queue.");
            }
            c4407w4.run();
        } else {
            m27825D(c4407w4);
        }
        return c4407w4;
    }

    /* renamed from: t */
    public final <V> Future<V> m27816t(Callable<V> callable) throws IllegalStateException {
        k();
        com.google.android.gms.common.internal.s.j(callable);
        C4407w4<?> c4407w4 = new C4407w4<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f10824c) {
            c4407w4.run();
        } else {
            m27825D(c4407w4);
        }
        return c4407w4;
    }

    /* renamed from: y */
    public final void m27811y(Runnable runnable) throws IllegalStateException {
        k();
        com.google.android.gms.common.internal.s.j(runnable);
        C4407w4<?> c4407w4 = new C4407w4<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.f10830i) {
            this.f10827f.add(c4407w4);
            C4418x4 c4418x4 = this.f10825d;
            if (c4418x4 == null) {
                C4418x4 c4418x42 = new C4418x4(this, "Measurement Network", this.f10827f);
                this.f10825d = c4418x42;
                c4418x42.setUncaughtExceptionHandler(this.f10829h);
                this.f10825d.start();
            } else {
                c4418x4.m27841a();
            }
        }
    }

    /* renamed from: z */
    public final void m27810z(Runnable runnable) throws IllegalStateException {
        k();
        com.google.android.gms.common.internal.s.j(runnable);
        m27825D(new C4407w4<>(this, runnable, false, "Task exception on worker thread"));
    }
}
