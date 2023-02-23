package p425j.p444e.p451f0.p464g;

import j.e.c0.c;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p425j.p444e.p451f0.p452a.InterfaceC11295b;
/* compiled from: ScheduledRunnable.java */
/* renamed from: j.e.f0.g.j */
/* loaded from: classes3.dex */
public final class RunnableC11631j extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, c {

    /* renamed from: d */
    static final Object f26274d = new Object();

    /* renamed from: e */
    static final Object f26275e = new Object();

    /* renamed from: f */
    static final Object f26276f = new Object();

    /* renamed from: w */
    static final Object f26277w = new Object();

    /* renamed from: c */
    final Runnable f26278c;

    public RunnableC11631j(Runnable runnable, InterfaceC11295b interfaceC11295b) {
        super(3);
        this.f26278c = runnable;
        lazySet(0, interfaceC11295b);
    }

    /* renamed from: a */
    public void m10715a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f26277w) {
                return;
            }
            if (obj == f26275e) {
                future.cancel(false);
                return;
            } else if (obj == f26276f) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    /* renamed from: i */
    public void m10714i() {
        Object obj;
        Object obj2;
        while (true) {
            Object obj3 = get(1);
            if (obj3 == f26277w || obj3 == f26275e || obj3 == f26276f) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (compareAndSet(1, obj3, z ? f26276f : f26275e)) {
                if (obj3 != null) {
                    ((Future) obj3).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f26277w || obj == (obj2 = f26274d) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((InterfaceC11295b) obj).mo11135c(this);
    }

    /* renamed from: j */
    public boolean m10713j() {
        Object obj = get(0);
        return obj == f26274d || obj == f26277w;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean compareAndSet;
        Object obj4;
        Object obj5;
        lazySet(2, Thread.currentThread());
        try {
            this.f26278c.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != f26274d) {
                    ((InterfaceC11295b) obj4).mo11135c(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 != f26275e) {
                        return;
                    }
                    return;
                } while (!compareAndSet(1, obj5, f26277w));
            } catch (Throwable th) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj4 = get(0);
        if (obj4 != f26274d && compareAndSet(0, obj4, f26277w) && obj4 != null) {
            ((InterfaceC11295b) obj4).mo11135c(this);
        }
        do {
            obj5 = get(1);
            if (obj5 != f26275e || obj5 == f26276f) {
                return;
            }
        } while (!compareAndSet(1, obj5, f26277w));
    }
}
