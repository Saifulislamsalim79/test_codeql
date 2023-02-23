package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p491i0.C11839f;
import kotlinx.coroutines.internal.C13878d0;
import kotlinx.coroutines.internal.C13902p;
import kotlinx.coroutines.internal.C13914y;
import kotlinx.coroutines.internal.InterfaceC13880e0;
/* compiled from: EventLoop.common.kt */
/* renamed from: kotlinx.coroutines.c1 */
/* loaded from: classes3.dex */
public abstract class AbstractC13760c1 extends AbstractC13807d1 {

    /* renamed from: w */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f30205w = AtomicReferenceFieldUpdater.newUpdater(AbstractC13760c1.class, Object.class, "_queue");

    /* renamed from: x */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f30206x = AtomicReferenceFieldUpdater.newUpdater(AbstractC13760c1.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* compiled from: EventLoop.common.kt */
    /* renamed from: kotlinx.coroutines.c1$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractRunnableC13761a implements Runnable, Comparable<AbstractRunnableC13761a>, InterfaceC14110y0, InterfaceC13880e0 {

        /* renamed from: c */
        public long f30207c;

        /* renamed from: d */
        private Object f30208d;

        /* renamed from: e */
        private int f30209e;

        @Override // kotlinx.coroutines.internal.InterfaceC13880e0
        /* renamed from: a */
        public void mo3530a(C13878d0<?> c13878d0) {
            C13914y c13914y;
            Object obj = this.f30208d;
            c13914y = C13815f1.f30263a;
            if (obj != c13914y) {
                this.f30208d = c13878d0;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // kotlinx.coroutines.internal.InterfaceC13880e0
        /* renamed from: e */
        public C13878d0<?> mo3529e() {
            Object obj = this.f30208d;
            if (obj instanceof C13878d0) {
                return (C13878d0) obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.InterfaceC13880e0
        /* renamed from: g */
        public void mo3528g(int i) {
            this.f30209e = i;
        }

        @Override // kotlinx.coroutines.internal.InterfaceC13880e0
        /* renamed from: h */
        public int mo3527h() {
            return this.f30209e;
        }

        @Override // kotlinx.coroutines.InterfaceC14110y0
        /* renamed from: i */
        public final synchronized void mo2939i() {
            C13914y c13914y;
            C13914y c13914y2;
            Object obj = this.f30208d;
            c13914y = C13815f1.f30263a;
            if (obj == c13914y) {
                return;
            }
            C13762b c13762b = obj instanceof C13762b ? (C13762b) obj : null;
            if (c13762b != null) {
                c13762b.m3537g(this);
            }
            c13914y2 = C13815f1.f30263a;
            this.f30208d = c13914y2;
        }

        @Override // java.lang.Comparable
        /* renamed from: j */
        public int compareTo(AbstractRunnableC13761a abstractRunnableC13761a) {
            long j = this.f30207c - abstractRunnableC13761a.f30207c;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        /* renamed from: m */
        public final synchronized int m3731m(long j, C13762b c13762b, AbstractC13760c1 abstractC13760c1) {
            C13914y c13914y;
            Object obj = this.f30208d;
            c13914y = C13815f1.f30263a;
            if (obj == c13914y) {
                return 2;
            }
            synchronized (c13762b) {
                AbstractRunnableC13761a m3542b = c13762b.m3542b();
                if (abstractC13760c1.m3747C0()) {
                    return 1;
                }
                if (m3542b == null) {
                    c13762b.f30210b = j;
                } else {
                    long j2 = m3542b.f30207c;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - c13762b.f30210b > 0) {
                        c13762b.f30210b = j;
                    }
                }
                if (this.f30207c - c13762b.f30210b < 0) {
                    this.f30207c = c13762b.f30210b;
                }
                c13762b.m3543a(this);
                return 0;
            }
        }

        /* renamed from: n */
        public final boolean m3730n(long j) {
            return j - this.f30207c >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f30207c + ']';
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* renamed from: kotlinx.coroutines.c1$b */
    /* loaded from: classes3.dex */
    public static final class C13762b extends C13878d0<AbstractRunnableC13761a> {

        /* renamed from: b */
        public long f30210b;

        public C13762b(long j) {
            this.f30210b = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: C0 */
    public final boolean m3747C0() {
        return this._isCompleted;
    }

    /* renamed from: g1 */
    private final void m3744g1() {
        C13914y c13914y;
        C13914y c13914y2;
        if (C13952q0.m3345a() && !m3747C0()) {
            throw new AssertionError();
        }
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30205w;
                c13914y = C13815f1.f30264b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, null, c13914y)) {
                    return;
                }
            } else if (!(obj instanceof C13902p)) {
                c13914y2 = C13815f1.f30264b;
                if (obj == c13914y2) {
                    return;
                }
                C13902p c13902p = new C13902p(8, true);
                if (obj != null) {
                    c13902p.m3464a((Runnable) obj);
                    if (f30205w.compareAndSet(this, obj, c13902p)) {
                        return;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                }
            } else {
                ((C13902p) obj).m3461d();
                return;
            }
        }
    }

    /* renamed from: h1 */
    private final Runnable m3743h1() {
        C13914y c13914y;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof C13902p)) {
                c13914y = C13815f1.f30264b;
                if (obj == c13914y) {
                    return null;
                }
                if (f30205w.compareAndSet(this, obj, null)) {
                    if (obj != null) {
                        return (Runnable) obj;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                }
            } else if (obj != null) {
                C13902p c13902p = (C13902p) obj;
                Object m3455j = c13902p.m3455j();
                if (m3455j != C13902p.f30385h) {
                    return (Runnable) m3455j;
                }
                f30205w.compareAndSet(this, obj, c13902p.m3456i());
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
            }
        }
    }

    /* renamed from: j1 */
    private final boolean m3741j1(Runnable runnable) {
        C13914y c13914y;
        while (true) {
            Object obj = this._queue;
            if (m3747C0()) {
                return false;
            }
            if (obj == null) {
                if (f30205w.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (!(obj instanceof C13902p)) {
                c13914y = C13815f1.f30264b;
                if (obj == c13914y) {
                    return false;
                }
                C13902p c13902p = new C13902p(8, true);
                if (obj != null) {
                    c13902p.m3464a((Runnable) obj);
                    c13902p.m3464a(runnable);
                    if (f30205w.compareAndSet(this, obj, c13902p)) {
                        return true;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                }
            } else if (obj != null) {
                C13902p c13902p2 = (C13902p) obj;
                int m3464a = c13902p2.m3464a(runnable);
                if (m3464a == 0) {
                    return true;
                }
                if (m3464a == 1) {
                    f30205w.compareAndSet(this, obj, c13902p2.m3456i());
                } else if (m3464a == 2) {
                    return false;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
            }
        }
    }

    /* renamed from: m1 */
    private final void m3738m1() {
        AbstractC13805d m3622a = C13809e.m3622a();
        long nanoTime = m3622a == null ? System.nanoTime() : m3622a.m3632a();
        while (true) {
            C13762b c13762b = (C13762b) this._delayed;
            AbstractRunnableC13761a m3535i = c13762b == null ? null : c13762b.m3535i();
            if (m3535i == null) {
                return;
            }
            m3624d1(nanoTime, m3535i);
        }
    }

    /* renamed from: p1 */
    private final int m3735p1(long j, AbstractRunnableC13761a abstractRunnableC13761a) {
        if (m3747C0()) {
            return 1;
        }
        C13762b c13762b = (C13762b) this._delayed;
        if (c13762b == null) {
            f30206x.compareAndSet(this, null, new C13762b(j));
            Object obj = this._delayed;
            kotlin.e0.d.l.d(obj);
            c13762b = (C13762b) obj;
        }
        return abstractRunnableC13761a.m3731m(j, c13762b, this);
    }

    /* renamed from: q1 */
    private final void m3734q1(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    /* renamed from: r1 */
    private final boolean m3733r1(AbstractRunnableC13761a abstractRunnableC13761a) {
        C13762b c13762b = (C13762b) this._delayed;
        return (c13762b == null ? null : c13762b.m3539e()) == abstractRunnableC13761a;
    }

    @Override // kotlinx.coroutines.AbstractC13756b1
    /* renamed from: P0 */
    protected long mo3746P0() {
        C13914y c13914y;
        if (super.mo3746P0() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof C13902p)) {
                c13914y = C13815f1.f30264b;
                return obj == c13914y ? Long.MAX_VALUE : 0L;
            } else if (!((C13902p) obj).m3458g()) {
                return 0L;
            }
        }
        C13762b c13762b = (C13762b) this._delayed;
        AbstractRunnableC13761a m3539e = c13762b == null ? null : c13762b.m3539e();
        if (m3539e == null) {
            return Long.MAX_VALUE;
        }
        long j = m3539e.f30207c;
        AbstractC13805d m3622a = C13809e.m3622a();
        return C11839f.m10279b(j - (m3622a == null ? System.nanoTime() : m3622a.m3632a()), 0L);
    }

    /* renamed from: i1 */
    public final void m3742i1(Runnable runnable) {
        if (m3741j1(runnable)) {
            m3623e1();
        } else {
            RunnableC14039s0.f30618y.m3742i1(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k1 */
    public boolean m3740k1() {
        C13914y c13914y;
        if (m3750Z0()) {
            C13762b c13762b = (C13762b) this._delayed;
            if (c13762b == null || c13762b.m3540d()) {
                Object obj = this._queue;
                if (obj != null) {
                    if (obj instanceof C13902p) {
                        return ((C13902p) obj).m3458g();
                    }
                    c13914y = C13815f1.f30264b;
                    if (obj != c13914y) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0057  */
    /* renamed from: l1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long m3739l1() {
        /*
            r9 = this;
            boolean r0 = r9.m3749b1()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = r9._delayed
            kotlinx.coroutines.c1$b r0 = (kotlinx.coroutines.AbstractC13760c1.C13762b) r0
            if (r0 == 0) goto L4d
            boolean r3 = r0.m3540d()
            if (r3 != 0) goto L4d
            kotlinx.coroutines.d r3 = kotlinx.coroutines.C13809e.m3622a()
            if (r3 != 0) goto L20
            long r3 = java.lang.System.nanoTime()
            goto L24
        L20:
            long r3 = r3.m3632a()
        L24:
            monitor-enter(r0)
            kotlinx.coroutines.internal.e0 r5 = r0.m3542b()     // Catch: java.lang.Throwable -> L4a
            r6 = 0
            if (r5 != 0) goto L2e
            monitor-exit(r0)
            goto L45
        L2e:
            kotlinx.coroutines.c1$a r5 = (kotlinx.coroutines.AbstractC13760c1.AbstractRunnableC13761a) r5     // Catch: java.lang.Throwable -> L4a
            boolean r7 = r5.m3730n(r3)     // Catch: java.lang.Throwable -> L4a
            r8 = 0
            if (r7 == 0) goto L3c
            boolean r5 = r9.m3741j1(r5)     // Catch: java.lang.Throwable -> L4a
            goto L3d
        L3c:
            r5 = 0
        L3d:
            if (r5 == 0) goto L44
            kotlinx.coroutines.internal.e0 r5 = r0.m3536h(r8)     // Catch: java.lang.Throwable -> L4a
            r6 = r5
        L44:
            monitor-exit(r0)
        L45:
            kotlinx.coroutines.c1$a r6 = (kotlinx.coroutines.AbstractC13760c1.AbstractRunnableC13761a) r6
            if (r6 != 0) goto L24
            goto L4d
        L4a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L4d:
            java.lang.Runnable r0 = r9.m3743h1()
            if (r0 == 0) goto L57
            r0.run()
            return r1
        L57:
            long r0 = r9.mo3746P0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC13760c1.m3739l1():long");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n1 */
    public final void m3737n1() {
        this._queue = null;
        this._delayed = null;
    }

    @Override // kotlinx.coroutines.AbstractC13857h0
    /* renamed from: o0 */
    public final void mo3067o0(InterfaceC11719g interfaceC11719g, Runnable runnable) {
        m3742i1(runnable);
    }

    /* renamed from: o1 */
    public final void m3736o1(long j, AbstractRunnableC13761a abstractRunnableC13761a) {
        int m3735p1 = m3735p1(j, abstractRunnableC13761a);
        if (m3735p1 == 0) {
            if (m3733r1(abstractRunnableC13761a)) {
                m3623e1();
            }
        } else if (m3735p1 == 1) {
            m3624d1(j, abstractRunnableC13761a);
        } else if (m3735p1 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    @Override // kotlinx.coroutines.AbstractC13756b1
    protected void shutdown() {
        C13924k2.f30408a.m3402b();
        m3734q1(true);
        m3744g1();
        do {
        } while (m3739l1() <= 0);
        m3738m1();
    }
}
