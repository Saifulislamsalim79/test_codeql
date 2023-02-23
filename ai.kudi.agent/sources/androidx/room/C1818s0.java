package androidx.room;

import androidx.lifecycle.LiveData;
import androidx.room.C1775g0;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p201g.p210b.p211a.p212a.C7498a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RoomTrackingLiveData.java */
/* renamed from: androidx.room.s0 */
/* loaded from: classes2.dex */
public class C1818s0<T> extends LiveData<T> {

    /* renamed from: a */
    final AbstractC1802o0 f5533a;

    /* renamed from: b */
    final boolean f5534b;

    /* renamed from: c */
    final Callable<T> f5535c;

    /* renamed from: d */
    private final C1773f0 f5536d;

    /* renamed from: e */
    final C1775g0.AbstractC1778c f5537e;

    /* renamed from: f */
    final AtomicBoolean f5538f = new AtomicBoolean(true);

    /* renamed from: g */
    final AtomicBoolean f5539g = new AtomicBoolean(false);

    /* renamed from: h */
    final AtomicBoolean f5540h = new AtomicBoolean(false);

    /* renamed from: i */
    final Runnable f5541i = new RunnableC1819a();

    /* renamed from: j */
    final Runnable f5542j = new RunnableC1820b();

    /* compiled from: RoomTrackingLiveData.java */
    /* renamed from: androidx.room.s0$a */
    /* loaded from: classes2.dex */
    class RunnableC1819a implements Runnable {
        RunnableC1819a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            if (C1818s0.this.f5540h.compareAndSet(false, true)) {
                C1818s0.this.f5533a.getInvalidationTracker().m34536b(C1818s0.this.f5537e);
            }
            do {
                if (C1818s0.this.f5539g.compareAndSet(false, true)) {
                    T t = null;
                    z = false;
                    while (C1818s0.this.f5538f.compareAndSet(true, false)) {
                        try {
                            try {
                                t = C1818s0.this.f5535c.call();
                                z = true;
                            } catch (Exception e) {
                                throw new RuntimeException("Exception while computing database live data.", e);
                            }
                        } finally {
                            C1818s0.this.f5539g.set(false);
                        }
                    }
                    if (z) {
                        C1818s0.this.postValue(t);
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    return;
                }
            } while (C1818s0.this.f5538f.get());
        }
    }

    /* compiled from: RoomTrackingLiveData.java */
    /* renamed from: androidx.room.s0$b */
    /* loaded from: classes2.dex */
    class RunnableC1820b implements Runnable {
        RunnableC1820b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean hasActiveObservers = C1818s0.this.hasActiveObservers();
            if (C1818s0.this.f5538f.compareAndSet(false, true) && hasActiveObservers) {
                C1818s0.this.m34464b().execute(C1818s0.this.f5541i);
            }
        }
    }

    /* compiled from: RoomTrackingLiveData.java */
    /* renamed from: androidx.room.s0$c */
    /* loaded from: classes2.dex */
    class C1821c extends C1775g0.AbstractC1778c {
        C1821c(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.C1775g0.AbstractC1778c
        /* renamed from: b */
        public void mo34456b(Set<String> set) {
            C7498a.m18547f().m18544b(C1818s0.this.f5542j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1818s0(AbstractC1802o0 abstractC1802o0, C1773f0 c1773f0, boolean z, Callable<T> callable, String[] strArr) {
        this.f5533a = abstractC1802o0;
        this.f5534b = z;
        this.f5535c = callable;
        this.f5536d = c1773f0;
        this.f5537e = new C1821c(strArr);
    }

    /* renamed from: b */
    Executor m34464b() {
        if (this.f5534b) {
            return this.f5533a.getTransactionExecutor();
        }
        return this.f5533a.getQueryExecutor();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        this.f5536d.m34539b(this);
        m34464b().execute(this.f5541i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        this.f5536d.m34538c(this);
    }
}
