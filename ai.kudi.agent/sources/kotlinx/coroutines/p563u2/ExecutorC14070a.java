package kotlinx.coroutines.p563u2;

import android.support.p050v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p489h0.AbstractC11828c;
import kotlin.p491i0.C11841h;
import kotlinx.coroutines.AbstractC13805d;
import kotlinx.coroutines.C13809e;
import kotlinx.coroutines.C13952q0;
import kotlinx.coroutines.C14034r0;
import kotlinx.coroutines.internal.C13914y;
/* compiled from: CoroutineScheduler.kt */
/* renamed from: kotlinx.coroutines.u2.a */
/* loaded from: classes3.dex */
public final class ExecutorC14070a implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;

    /* renamed from: c */
    public final int f30674c;
    volatile /* synthetic */ long controlState;

    /* renamed from: d */
    public final int f30675d;

    /* renamed from: e */
    public final long f30676e;

    /* renamed from: f */
    public final String f30677f;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: w */
    public final C14076d f30678w;

    /* renamed from: x */
    public final C14076d f30679x;

    /* renamed from: y */
    public final AtomicReferenceArray<C14072b> f30680y;

    /* renamed from: C */
    public static final C13914y f30672C = new C13914y("NOT_IN_STACK");

    /* renamed from: z */
    private static final /* synthetic */ AtomicLongFieldUpdater f30673z = AtomicLongFieldUpdater.newUpdater(ExecutorC14070a.class, "parkedWorkersStack");

    /* renamed from: A */
    static final /* synthetic */ AtomicLongFieldUpdater f30670A = AtomicLongFieldUpdater.newUpdater(ExecutorC14070a.class, "controlState");

    /* renamed from: B */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f30671B = AtomicIntegerFieldUpdater.newUpdater(ExecutorC14070a.class, "_isTerminated");

    /* compiled from: CoroutineScheduler.kt */
    /* renamed from: kotlinx.coroutines.u2.a$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C14071a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30681a;

        static {
            int[] iArr = new int[EnumC14073c.values().length];
            iArr[EnumC14073c.PARKING.ordinal()] = 1;
            iArr[EnumC14073c.BLOCKING.ordinal()] = 2;
            iArr[EnumC14073c.CPU_ACQUIRED.ordinal()] = 3;
            iArr[EnumC14073c.DORMANT.ordinal()] = 4;
            iArr[EnumC14073c.TERMINATED.ordinal()] = 5;
            f30681a = iArr;
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    /* renamed from: kotlinx.coroutines.u2.a$c */
    /* loaded from: classes3.dex */
    public enum EnumC14073c {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public ExecutorC14070a(int i, int i2, long j, String str) {
        this.f30674c = i;
        this.f30675d = i2;
        this.f30676e = j;
        this.f30677f = str;
        if (i >= 1) {
            if (this.f30675d >= this.f30674c) {
                if (this.f30675d <= 2097150) {
                    if (this.f30676e > 0) {
                        this.f30678w = new C14076d();
                        this.f30679x = new C14076d();
                        this.parkedWorkersStack = 0L;
                        this.f30680y = new AtomicReferenceArray<>(this.f30675d + 1);
                        this.controlState = this.f30674c << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + this.f30676e + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + this.f30675d + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + this.f30675d + " should be greater than or equals to core pool size " + this.f30674c).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + this.f30674c + " should be at least 1").toString());
    }

    /* renamed from: F */
    private final C14072b m3136F() {
        Thread currentThread = Thread.currentThread();
        C14072b c14072b = currentThread instanceof C14072b ? (C14072b) currentThread : null;
        if (c14072b != null && l.b(ExecutorC14070a.this, this)) {
            return c14072b;
        }
        return null;
    }

    /* renamed from: J */
    public static /* synthetic */ void m3134J(ExecutorC14070a executorC14070a, Runnable runnable, InterfaceC14082j interfaceC14082j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC14082j = C14079g.f30710c;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        executorC14070a.m3135I(runnable, interfaceC14082j, z);
    }

    /* renamed from: O */
    private final int m3133O(C14072b c14072b) {
        Object m3112g = c14072b.m3112g();
        while (m3112g != f30672C) {
            if (m3112g == null) {
                return 0;
            }
            C14072b c14072b2 = (C14072b) m3112g;
            int m3113f = c14072b2.m3113f();
            if (m3113f != 0) {
                return m3113f;
            }
            m3112g = c14072b2.m3112g();
        }
        return -1;
    }

    /* renamed from: P */
    private final C14072b m3132P() {
        while (true) {
            long j = this.parkedWorkersStack;
            C14072b c14072b = this.f30680y.get((int) (2097151 & j));
            if (c14072b == null) {
                return null;
            }
            long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
            int m3133O = m3133O(c14072b);
            if (m3133O >= 0 && f30673z.compareAndSet(this, j, m3133O | j2)) {
                c14072b.m3104o(f30672C);
                return c14072b;
            }
        }
    }

    /* renamed from: c */
    private final boolean m3127c(AbstractRunnableC14081i abstractRunnableC14081i) {
        if (abstractRunnableC14081i.f30713d.mo3090f0() == 1) {
            return this.f30679x.m3468a(abstractRunnableC14081i);
        }
        return this.f30678w.m3468a(abstractRunnableC14081i);
    }

    /* renamed from: f0 */
    private final void m3126f0(boolean z) {
        long addAndGet = f30670A.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        if (z || m3119u0() || m3122k0(addAndGet)) {
            return;
        }
        m3119u0();
    }

    /* renamed from: g */
    private final int m3125g() {
        int m10271a;
        synchronized (this.f30680y) {
            if (isTerminated()) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            m10271a = C11841h.m10271a(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (m10271a >= this.f30674c) {
                return 0;
            }
            if (i >= this.f30675d) {
                return 0;
            }
            int i2 = ((int) (this.controlState & 2097151)) + 1;
            if (i2 > 0 && this.f30680y.get(i2) == null) {
                C14072b c14072b = new C14072b(i2);
                this.f30680y.set(i2, c14072b);
                if (i2 == ((int) (2097151 & f30670A.incrementAndGet(this)))) {
                    c14072b.start();
                    return m10271a + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: i0 */
    private final AbstractRunnableC14081i m3123i0(C14072b c14072b, AbstractRunnableC14081i abstractRunnableC14081i, boolean z) {
        if (c14072b == null || c14072b.f30684d == EnumC14073c.TERMINATED) {
            return abstractRunnableC14081i;
        }
        if (abstractRunnableC14081i.f30713d.mo3090f0() == 0 && c14072b.f30684d == EnumC14073c.BLOCKING) {
            return abstractRunnableC14081i;
        }
        c14072b.f30688x = true;
        return c14072b.f30683c.m3089a(abstractRunnableC14081i, z);
    }

    /* renamed from: k0 */
    private final boolean m3122k0(long j) {
        int m10271a;
        m10271a = C11841h.m10271a(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0);
        if (m10271a < this.f30674c) {
            int m3125g = m3125g();
            if (m3125g == 1 && this.f30674c > 1) {
                m3125g();
            }
            if (m3125g > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o0 */
    static /* synthetic */ boolean m3120o0(ExecutorC14070a executorC14070a, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = executorC14070a.controlState;
        }
        return executorC14070a.m3122k0(j);
    }

    /* renamed from: u0 */
    private final boolean m3119u0() {
        C14072b m3132P;
        do {
            m3132P = m3132P();
            if (m3132P == null) {
                return false;
            }
        } while (!C14072b.f30682z.compareAndSet(m3132P, -1, 0));
        LockSupport.unpark(m3132P);
        return true;
    }

    /* renamed from: I */
    public final void m3135I(Runnable runnable, InterfaceC14082j interfaceC14082j, boolean z) {
        AbstractC13805d m3622a = C13809e.m3622a();
        if (m3622a != null) {
            m3622a.m3629d();
        }
        AbstractRunnableC14081i m3121m = m3121m(runnable, interfaceC14082j);
        C14072b m3136F = m3136F();
        AbstractRunnableC14081i m3123i0 = m3123i0(m3136F, m3121m, z);
        if (m3123i0 != null && !m3127c(m3123i0)) {
            throw new RejectedExecutionException(l.m(this.f30677f, " was terminated"));
        }
        boolean z2 = z && m3136F != null;
        if (m3121m.f30713d.mo3090f0() != 0) {
            m3126f0(z2);
        } else if (z2) {
        } else {
            m3124g0();
        }
    }

    /* renamed from: V */
    public final boolean m3131V(C14072b c14072b) {
        long j;
        long j2;
        int m3113f;
        if (c14072b.m3112g() != f30672C) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            int i = (int) (2097151 & j);
            j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
            m3113f = c14072b.m3113f();
            if (C13952q0.m3345a()) {
                if (!(m3113f != 0)) {
                    throw new AssertionError();
                }
            }
            c14072b.m3104o(this.f30680y.get(i));
        } while (!f30673z.compareAndSet(this, j, m3113f | j2));
        return true;
    }

    /* renamed from: X */
    public final void m3130X(C14072b c14072b, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
            if (i3 == i) {
                i3 = i2 == 0 ? m3133O(c14072b) : i2;
            }
            if (i3 >= 0 && f30673z.compareAndSet(this, j, j2 | i3)) {
                return;
            }
        }
    }

    /* renamed from: Z */
    public final void m3129Z(AbstractRunnableC14081i abstractRunnableC14081i) {
        try {
            abstractRunnableC14081i.run();
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                AbstractC13805d m3622a = C13809e.m3622a();
                if (m3622a == null) {
                }
            } finally {
                AbstractC13805d m3622a2 = C13809e.m3622a();
                if (m3622a2 != null) {
                    m3622a2.m3628e();
                }
            }
        }
    }

    /* renamed from: b0 */
    public final void m3128b0(long j) {
        int i;
        if (f30671B.compareAndSet(this, 0, 1)) {
            C14072b m3136F = m3136F();
            synchronized (this.f30680y) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    C14072b c14072b = this.f30680y.get(i2);
                    l.d(c14072b);
                    C14072b c14072b2 = c14072b;
                    if (c14072b2 != m3136F) {
                        while (c14072b2.isAlive()) {
                            LockSupport.unpark(c14072b2);
                            c14072b2.join(j);
                        }
                        EnumC14073c enumC14073c = c14072b2.f30684d;
                        if (C13952q0.m3345a()) {
                            if (!(enumC14073c == EnumC14073c.TERMINATED)) {
                                throw new AssertionError();
                            }
                        }
                        c14072b2.f30683c.m3083g(this.f30679x);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            this.f30679x.m3467b();
            this.f30678w.m3467b();
            while (true) {
                AbstractRunnableC14081i m3114e = m3136F == null ? null : m3136F.m3114e(true);
                if (m3114e == null && (m3114e = this.f30678w.m3465d()) == null && (m3114e = this.f30679x.m3465d()) == null) {
                    break;
                }
                m3129Z(m3114e);
            }
            if (m3136F != null) {
                m3136F.m3101r(EnumC14073c.TERMINATED);
            }
            if (C13952q0.m3345a()) {
                if (!(((int) ((this.controlState & 9223367638808264704L) >> 42)) == this.f30674c)) {
                    throw new AssertionError();
                }
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m3128b0(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m3134J(this, runnable, null, false, 6, null);
    }

    /* renamed from: g0 */
    public final void m3124g0() {
        if (m3119u0() || m3120o0(this, 0L, 1, null)) {
            return;
        }
        m3119u0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: m */
    public final AbstractRunnableC14081i m3121m(Runnable runnable, InterfaceC14082j interfaceC14082j) {
        long mo3092a = C14084l.f30719e.mo3092a();
        if (runnable instanceof AbstractRunnableC14081i) {
            AbstractRunnableC14081i abstractRunnableC14081i = (AbstractRunnableC14081i) runnable;
            abstractRunnableC14081i.f30712c = mo3092a;
            abstractRunnableC14081i.f30713d = interfaceC14082j;
            return abstractRunnableC14081i;
        }
        return new C14083k(runnable, mo3092a, interfaceC14082j);
    }

    public String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = new ArrayList();
        int length = this.f30680y.length();
        int i5 = 0;
        if (1 < length) {
            i2 = 0;
            int i6 = 0;
            i3 = 0;
            i4 = 0;
            int i7 = 1;
            while (true) {
                int i8 = i7 + 1;
                C14072b c14072b = this.f30680y.get(i7);
                if (c14072b != null) {
                    int m3084f = c14072b.f30683c.m3084f();
                    int i9 = C14071a.f30681a[c14072b.f30684d.ordinal()];
                    if (i9 == 1) {
                        i5++;
                    } else if (i9 == 2) {
                        i2++;
                        StringBuilder sb = new StringBuilder();
                        sb.append(m3084f);
                        sb.append('b');
                        arrayList.add(sb.toString());
                    } else if (i9 == 3) {
                        i6++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m3084f);
                        sb2.append('c');
                        arrayList.add(sb2.toString());
                    } else if (i9 == 4) {
                        i3++;
                        if (m3084f > 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m3084f);
                            sb3.append('d');
                            arrayList.add(sb3.toString());
                        }
                    } else if (i9 == 5) {
                        i4++;
                    }
                }
                if (i8 >= length) {
                    break;
                }
                i7 = i8;
            }
            i = i5;
            i5 = i6;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        long j = this.controlState;
        return this.f30677f + '@' + C14034r0.m3203b(this) + "[Pool Size {core = " + this.f30674c + ", max = " + this.f30675d + "}, Worker States {CPU = " + i5 + ", blocking = " + i2 + ", parked = " + i + ", dormant = " + i3 + ", terminated = " + i4 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f30678w.m3466c() + ", global blocking queue size = " + this.f30679x.m3466c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f30674c - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    /* compiled from: CoroutineScheduler.kt */
    /* renamed from: kotlinx.coroutines.u2.a$b */
    /* loaded from: classes3.dex */
    public final class C14072b extends Thread {

        /* renamed from: z */
        static final /* synthetic */ AtomicIntegerFieldUpdater f30682z = AtomicIntegerFieldUpdater.newUpdater(C14072b.class, "workerCtl");

        /* renamed from: c */
        public final C14085m f30683c;

        /* renamed from: d */
        public EnumC14073c f30684d;

        /* renamed from: e */
        private long f30685e;

        /* renamed from: f */
        private long f30686f;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;

        /* renamed from: w */
        private int f30687w;
        volatile /* synthetic */ int workerCtl;

        /* renamed from: x */
        public boolean f30688x;

        private C14072b() {
            setDaemon(true);
            this.f30683c = new C14085m();
            this.f30684d = EnumC14073c.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = ExecutorC14070a.f30672C;
            this.f30687w = AbstractC11828c.f26511d.mo10295b();
        }

        /* renamed from: a */
        private final void m3118a(int i) {
            if (i == 0) {
                return;
            }
            ExecutorC14070a.f30670A.addAndGet(ExecutorC14070a.this, -2097152L);
            EnumC14073c enumC14073c = this.f30684d;
            if (enumC14073c != EnumC14073c.TERMINATED) {
                if (C13952q0.m3345a()) {
                    if (!(enumC14073c == EnumC14073c.BLOCKING)) {
                        throw new AssertionError();
                    }
                }
                this.f30684d = EnumC14073c.DORMANT;
            }
        }

        /* renamed from: b */
        private final void m3117b(int i) {
            if (i != 0 && m3101r(EnumC14073c.BLOCKING)) {
                ExecutorC14070a.this.m3124g0();
            }
        }

        /* renamed from: c */
        private final void m3116c(AbstractRunnableC14081i abstractRunnableC14081i) {
            int mo3090f0 = abstractRunnableC14081i.f30713d.mo3090f0();
            m3111h(mo3090f0);
            m3117b(mo3090f0);
            ExecutorC14070a.this.m3129Z(abstractRunnableC14081i);
            m3118a(mo3090f0);
        }

        /* renamed from: d */
        private final AbstractRunnableC14081i m3115d(boolean z) {
            AbstractRunnableC14081i m3107l;
            AbstractRunnableC14081i m3107l2;
            if (z) {
                boolean z2 = m3109j(ExecutorC14070a.this.f30674c * 2) == 0;
                if (z2 && (m3107l2 = m3107l()) != null) {
                    return m3107l2;
                }
                AbstractRunnableC14081i m3082h = this.f30683c.m3082h();
                if (m3082h != null) {
                    return m3082h;
                }
                if (!z2 && (m3107l = m3107l()) != null) {
                    return m3107l;
                }
            } else {
                AbstractRunnableC14081i m3107l3 = m3107l();
                if (m3107l3 != null) {
                    return m3107l3;
                }
            }
            return m3100s(false);
        }

        /* renamed from: h */
        private final void m3111h(int i) {
            this.f30685e = 0L;
            if (this.f30684d == EnumC14073c.PARKING) {
                if (C13952q0.m3345a()) {
                    if (!(i == 1)) {
                        throw new AssertionError();
                    }
                }
                this.f30684d = EnumC14073c.BLOCKING;
            }
        }

        /* renamed from: i */
        private final boolean m3110i() {
            return this.nextParkedWorker != ExecutorC14070a.f30672C;
        }

        /* renamed from: k */
        private final void m3108k() {
            if (this.f30685e == 0) {
                this.f30685e = System.nanoTime() + ExecutorC14070a.this.f30676e;
            }
            LockSupport.parkNanos(ExecutorC14070a.this.f30676e);
            if (System.nanoTime() - this.f30685e >= 0) {
                this.f30685e = 0L;
                m3099t();
            }
        }

        /* renamed from: l */
        private final AbstractRunnableC14081i m3107l() {
            if (m3109j(2) == 0) {
                AbstractRunnableC14081i m3465d = ExecutorC14070a.this.f30678w.m3465d();
                return m3465d == null ? ExecutorC14070a.this.f30679x.m3465d() : m3465d;
            }
            AbstractRunnableC14081i m3465d2 = ExecutorC14070a.this.f30679x.m3465d();
            return m3465d2 == null ? ExecutorC14070a.this.f30678w.m3465d() : m3465d2;
        }

        /* renamed from: m */
        private final void m3106m() {
            loop0: while (true) {
                boolean z = false;
                while (!ExecutorC14070a.this.isTerminated() && this.f30684d != EnumC14073c.TERMINATED) {
                    AbstractRunnableC14081i m3114e = m3114e(this.f30688x);
                    if (m3114e != null) {
                        this.f30686f = 0L;
                        m3116c(m3114e);
                    } else {
                        this.f30688x = false;
                        if (this.f30686f == 0) {
                            m3102q();
                        } else if (z) {
                            m3101r(EnumC14073c.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f30686f);
                            this.f30686f = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
            }
            m3101r(EnumC14073c.TERMINATED);
        }

        /* renamed from: p */
        private final boolean m3103p() {
            boolean z;
            if (this.f30684d != EnumC14073c.CPU_ACQUIRED) {
                ExecutorC14070a executorC14070a = ExecutorC14070a.this;
                while (true) {
                    long j = executorC14070a.controlState;
                    if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                        if (ExecutorC14070a.f30670A.compareAndSet(executorC14070a, j, j - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f30684d = EnumC14073c.CPU_ACQUIRED;
            }
            return true;
        }

        /* renamed from: q */
        private final void m3102q() {
            if (!m3110i()) {
                ExecutorC14070a.this.m3131V(this);
                return;
            }
            if (C13952q0.m3345a()) {
                if (!(this.f30683c.m3084f() == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (m3110i() && this.workerCtl == -1 && !ExecutorC14070a.this.isTerminated() && this.f30684d != EnumC14073c.TERMINATED) {
                m3101r(EnumC14073c.PARKING);
                Thread.interrupted();
                m3108k();
            }
        }

        /* renamed from: s */
        private final AbstractRunnableC14081i m3100s(boolean z) {
            long m3078l;
            if (C13952q0.m3345a()) {
                if (!(this.f30683c.m3084f() == 0)) {
                    throw new AssertionError();
                }
            }
            int i = (int) (ExecutorC14070a.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int m3109j = m3109j(i);
            ExecutorC14070a executorC14070a = ExecutorC14070a.this;
            long j = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                m3109j++;
                if (m3109j > i) {
                    m3109j = 1;
                }
                C14072b c14072b = executorC14070a.f30680y.get(m3109j);
                if (c14072b != null && c14072b != this) {
                    if (C13952q0.m3345a()) {
                        if (!(this.f30683c.m3084f() == 0)) {
                            throw new AssertionError();
                        }
                    }
                    if (z) {
                        m3078l = this.f30683c.m3079k(c14072b.f30683c);
                    } else {
                        m3078l = this.f30683c.m3078l(c14072b.f30683c);
                    }
                    if (m3078l == -1) {
                        return this.f30683c.m3082h();
                    }
                    if (m3078l > 0) {
                        j = Math.min(j, m3078l);
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                j = 0;
            }
            this.f30686f = j;
            return null;
        }

        /* renamed from: t */
        private final void m3099t() {
            ExecutorC14070a executorC14070a = ExecutorC14070a.this;
            synchronized (executorC14070a.f30680y) {
                if (executorC14070a.isTerminated()) {
                    return;
                }
                if (((int) (executorC14070a.controlState & 2097151)) <= executorC14070a.f30674c) {
                    return;
                }
                if (f30682z.compareAndSet(this, -1, 1)) {
                    int m3113f = m3113f();
                    m3105n(0);
                    executorC14070a.m3130X(this, m3113f, 0);
                    int andDecrement = (int) (2097151 & ExecutorC14070a.f30670A.getAndDecrement(executorC14070a));
                    if (andDecrement != m3113f) {
                        C14072b c14072b = executorC14070a.f30680y.get(andDecrement);
                        l.d(c14072b);
                        C14072b c14072b2 = c14072b;
                        executorC14070a.f30680y.set(m3113f, c14072b2);
                        c14072b2.m3105n(m3113f);
                        executorC14070a.m3130X(c14072b2, andDecrement, m3113f);
                    }
                    executorC14070a.f30680y.set(andDecrement, null);
                    C13666w c13666w = C13666w.f30112a;
                    this.f30684d = EnumC14073c.TERMINATED;
                }
            }
        }

        /* renamed from: e */
        public final AbstractRunnableC14081i m3114e(boolean z) {
            AbstractRunnableC14081i m3465d;
            if (m3103p()) {
                return m3115d(z);
            }
            if (z) {
                m3465d = this.f30683c.m3082h();
                if (m3465d == null) {
                    m3465d = ExecutorC14070a.this.f30679x.m3465d();
                }
            } else {
                m3465d = ExecutorC14070a.this.f30679x.m3465d();
            }
            return m3465d == null ? m3100s(true) : m3465d;
        }

        /* renamed from: f */
        public final int m3113f() {
            return this.indexInArray;
        }

        /* renamed from: g */
        public final Object m3112g() {
            return this.nextParkedWorker;
        }

        /* renamed from: j */
        public final int m3109j(int i) {
            int i2 = this.f30687w;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f30687w = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: n */
        public final void m3105n(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(ExecutorC14070a.this.f30677f);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: o */
        public final void m3104o(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: r */
        public final boolean m3101r(EnumC14073c enumC14073c) {
            EnumC14073c enumC14073c2 = this.f30684d;
            boolean z = enumC14073c2 == EnumC14073c.CPU_ACQUIRED;
            if (z) {
                ExecutorC14070a.f30670A.addAndGet(ExecutorC14070a.this, 4398046511104L);
            }
            if (enumC14073c2 != enumC14073c) {
                this.f30684d = enumC14073c;
            }
            return z;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m3106m();
        }

        public C14072b(int i) {
            this();
            m3105n(i);
        }
    }
}
