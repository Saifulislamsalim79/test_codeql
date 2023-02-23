package kotlinx.coroutines.p563u2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C13952q0;
/* compiled from: WorkQueue.kt */
/* renamed from: kotlinx.coroutines.u2.m */
/* loaded from: classes3.dex */
public final class C14085m {

    /* renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f30720b = AtomicReferenceFieldUpdater.newUpdater(C14085m.class, Object.class, "lastScheduledTask");

    /* renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f30721c = AtomicIntegerFieldUpdater.newUpdater(C14085m.class, "producerIndex");

    /* renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f30722d = AtomicIntegerFieldUpdater.newUpdater(C14085m.class, "consumerIndex");

    /* renamed from: e */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f30723e = AtomicIntegerFieldUpdater.newUpdater(C14085m.class, "blockingTasksInBuffer");

    /* renamed from: a */
    private final AtomicReferenceArray<AbstractRunnableC14081i> f30724a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    /* renamed from: b */
    public static /* synthetic */ AbstractRunnableC14081i m3088b(C14085m c14085m, AbstractRunnableC14081i abstractRunnableC14081i, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c14085m.m3089a(abstractRunnableC14081i, z);
    }

    /* renamed from: c */
    private final AbstractRunnableC14081i m3087c(AbstractRunnableC14081i abstractRunnableC14081i) {
        if (abstractRunnableC14081i.f30713d.mo3090f0() == 1) {
            f30723e.incrementAndGet(this);
        }
        if (m3085e() == 127) {
            return abstractRunnableC14081i;
        }
        int i = this.producerIndex & 127;
        while (this.f30724a.get(i) != null) {
            Thread.yield();
        }
        this.f30724a.lazySet(i, abstractRunnableC14081i);
        f30721c.incrementAndGet(this);
        return null;
    }

    /* renamed from: d */
    private final void m3086d(AbstractRunnableC14081i abstractRunnableC14081i) {
        if (abstractRunnableC14081i != null) {
            if (abstractRunnableC14081i.f30713d.mo3090f0() == 1) {
                int decrementAndGet = f30723e.decrementAndGet(this);
                if (C13952q0.m3345a()) {
                    if (!(decrementAndGet >= 0)) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private final AbstractRunnableC14081i m3081i() {
        AbstractRunnableC14081i andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f30722d.compareAndSet(this, i, i + 1) && (andSet = this.f30724a.getAndSet(i2, null)) != null) {
                m3086d(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    private final boolean m3080j(C14076d c14076d) {
        AbstractRunnableC14081i m3081i = m3081i();
        if (m3081i == null) {
            return false;
        }
        c14076d.m3468a(m3081i);
        return true;
    }

    /* renamed from: m */
    private final long m3077m(C14085m c14085m, boolean z) {
        AbstractRunnableC14081i abstractRunnableC14081i;
        do {
            abstractRunnableC14081i = (AbstractRunnableC14081i) c14085m.lastScheduledTask;
            if (abstractRunnableC14081i == null) {
                return -2L;
            }
            if (z) {
                if (!(abstractRunnableC14081i.f30713d.mo3090f0() == 1)) {
                    return -2L;
                }
            }
            long mo3092a = C14084l.f30719e.mo3092a() - abstractRunnableC14081i.f30712c;
            long j = C14084l.f30715a;
            if (mo3092a < j) {
                return j - mo3092a;
            }
        } while (!f30720b.compareAndSet(c14085m, abstractRunnableC14081i, null));
        m3088b(this, abstractRunnableC14081i, false, 2, null);
        return -1L;
    }

    /* renamed from: a */
    public final AbstractRunnableC14081i m3089a(AbstractRunnableC14081i abstractRunnableC14081i, boolean z) {
        if (z) {
            return m3087c(abstractRunnableC14081i);
        }
        AbstractRunnableC14081i abstractRunnableC14081i2 = (AbstractRunnableC14081i) f30720b.getAndSet(this, abstractRunnableC14081i);
        if (abstractRunnableC14081i2 == null) {
            return null;
        }
        return m3087c(abstractRunnableC14081i2);
    }

    /* renamed from: e */
    public final int m3085e() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: f */
    public final int m3084f() {
        return this.lastScheduledTask != null ? m3085e() + 1 : m3085e();
    }

    /* renamed from: g */
    public final void m3083g(C14076d c14076d) {
        AbstractRunnableC14081i abstractRunnableC14081i = (AbstractRunnableC14081i) f30720b.getAndSet(this, null);
        if (abstractRunnableC14081i != null) {
            c14076d.m3468a(abstractRunnableC14081i);
        }
        do {
        } while (m3080j(c14076d));
    }

    /* renamed from: h */
    public final AbstractRunnableC14081i m3082h() {
        AbstractRunnableC14081i abstractRunnableC14081i = (AbstractRunnableC14081i) f30720b.getAndSet(this, null);
        return abstractRunnableC14081i == null ? m3081i() : abstractRunnableC14081i;
    }

    /* renamed from: k */
    public final long m3079k(C14085m c14085m) {
        if (C13952q0.m3345a()) {
            if (!(m3085e() == 0)) {
                throw new AssertionError();
            }
        }
        int i = c14085m.producerIndex;
        AtomicReferenceArray<AbstractRunnableC14081i> atomicReferenceArray = c14085m.f30724a;
        for (int i2 = c14085m.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & 127;
            if (c14085m.blockingTasksInBuffer == 0) {
                break;
            }
            AbstractRunnableC14081i abstractRunnableC14081i = atomicReferenceArray.get(i3);
            if (abstractRunnableC14081i != null) {
                if ((abstractRunnableC14081i.f30713d.mo3090f0() == 1) && atomicReferenceArray.compareAndSet(i3, abstractRunnableC14081i, null)) {
                    f30723e.decrementAndGet(c14085m);
                    m3088b(this, abstractRunnableC14081i, false, 2, null);
                    return -1L;
                }
            }
        }
        return m3077m(c14085m, true);
    }

    /* renamed from: l */
    public final long m3078l(C14085m c14085m) {
        if (C13952q0.m3345a()) {
            if (!(m3085e() == 0)) {
                throw new AssertionError();
            }
        }
        AbstractRunnableC14081i m3081i = c14085m.m3081i();
        if (m3081i != null) {
            AbstractRunnableC14081i m3088b = m3088b(this, m3081i, false, 2, null);
            if (C13952q0.m3345a()) {
                if (m3088b == null) {
                    return -1L;
                }
                throw new AssertionError();
            }
            return -1L;
        }
        return m3077m(c14085m, false);
    }
}
