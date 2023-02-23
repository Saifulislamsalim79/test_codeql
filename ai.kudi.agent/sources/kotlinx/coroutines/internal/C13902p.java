package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C13952q0;
/* compiled from: LockFreeTaskQueue.kt */
/* renamed from: kotlinx.coroutines.internal.p */
/* loaded from: classes3.dex */
public final class C13902p<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    private final int f30386a;

    /* renamed from: b */
    private final boolean f30387b;

    /* renamed from: c */
    private final int f30388c;

    /* renamed from: d */
    private /* synthetic */ AtomicReferenceArray f30389d;

    /* renamed from: e */
    public static final C13903a f30382e = new C13903a(null);

    /* renamed from: h */
    public static final C13914y f30385h = new C13914y("REMOVE_FROZEN");

    /* renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f30383f = AtomicReferenceFieldUpdater.newUpdater(C13902p.class, Object.class, "_next");

    /* renamed from: g */
    private static final /* synthetic */ AtomicLongFieldUpdater f30384g = AtomicLongFieldUpdater.newUpdater(C13902p.class, "_state");

    /* compiled from: LockFreeTaskQueue.kt */
    /* renamed from: kotlinx.coroutines.internal.p$a */
    /* loaded from: classes3.dex */
    public static final class C13903a {
        private C13903a() {
        }

        public /* synthetic */ C13903a(kotlin.e0.d.g gVar) {
            this();
        }

        /* renamed from: a */
        public final int m3453a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long m3452b(long j, int i) {
            return m3450d(j, 1073741823L) | (i << 0);
        }

        /* renamed from: c */
        public final long m3451c(long j, int i) {
            return m3450d(j, 1152921503533105152L) | (i << 30);
        }

        /* renamed from: d */
        public final long m3450d(long j, long j2) {
            return j & (j2 ^ (-1));
        }
    }

    /* compiled from: LockFreeTaskQueue.kt */
    /* renamed from: kotlinx.coroutines.internal.p$b */
    /* loaded from: classes3.dex */
    public static final class C13904b {

        /* renamed from: a */
        public final int f30390a;

        public C13904b(int i) {
            this.f30390a = i;
        }
    }

    public C13902p(int i, boolean z) {
        this.f30386a = i;
        this.f30387b = z;
        this.f30388c = i - 1;
        this.f30389d = new AtomicReferenceArray(this.f30386a);
        if (this.f30388c <= 1073741823) {
            if (!((this.f30386a & this.f30388c) == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final C13902p<E> m3463b(long j) {
        C13902p<E> c13902p = new C13902p<>(this.f30386a * 2, this.f30387b);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f30388c;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f30389d.get(i3 & i);
                if (obj == null) {
                    obj = new C13904b(i);
                }
                c13902p.f30389d.set(c13902p.f30388c & i, obj);
                i++;
            } else {
                c13902p._state = f30382e.m3450d(j, 1152921504606846976L);
                return c13902p;
            }
        }
    }

    /* renamed from: c */
    private final C13902p<E> m3462c(long j) {
        while (true) {
            C13902p<E> c13902p = (C13902p) this._next;
            if (c13902p != null) {
                return c13902p;
            }
            f30383f.compareAndSet(this, null, m3463b(j));
        }
    }

    /* renamed from: e */
    private final C13902p<E> m3460e(int i, E e) {
        Object obj = this.f30389d.get(this.f30388c & i);
        if ((obj instanceof C13904b) && ((C13904b) obj).f30390a == i) {
            this.f30389d.set(i & this.f30388c, e);
            return this;
        }
        return null;
    }

    /* renamed from: h */
    private final long m3457h() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f30384g.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: k */
    private final C13902p<E> m3454k(int i, int i2) {
        long j;
        int i3;
        do {
            j = this._state;
            i3 = (int) ((1073741823 & j) >> 0);
            if (C13952q0.m3345a()) {
                if (!(i3 == i)) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j) != 0) {
                return m3456i();
            }
        } while (!f30384g.compareAndSet(this, j, f30382e.m3452b(j, i2)));
        this.f30389d.set(this.f30388c & i3, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        return 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m3464a(E r13) {
        /*
            r12 = this;
        L0:
            long r2 = r12._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L12
            kotlinx.coroutines.internal.p$a r13 = kotlinx.coroutines.internal.C13902p.f30382e
            int r13 = r13.m3453a(r2)
            return r13
        L12:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r8 = 0
            long r0 = r0 >> r8
            int r1 = (int) r0
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r0 = 30
            long r4 = r4 >> r0
            int r9 = (int) r4
            int r10 = r12.f30388c
            int r0 = r9 + 2
            r0 = r0 & r10
            r4 = r1 & r10
            r5 = 1
            if (r0 != r4) goto L2e
            return r5
        L2e:
            boolean r0 = r12.f30387b
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 != 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f30389d
            r11 = r9 & r10
            java.lang.Object r0 = r0.get(r11)
            if (r0 == 0) goto L4d
            int r0 = r12.f30386a
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L4c
            int r9 = r9 - r1
            r1 = r9 & r4
            int r0 = r0 >> 1
            if (r1 <= r0) goto L0
        L4c:
            return r5
        L4d:
            int r0 = r9 + 1
            r0 = r0 & r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.C13902p.f30384g
            kotlinx.coroutines.internal.p$a r4 = kotlinx.coroutines.internal.C13902p.f30382e
            long r4 = r4.m3451c(r2, r0)
            r0 = r1
            r1 = r12
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f30389d
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L68:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L72
            goto L7c
        L72:
            kotlinx.coroutines.internal.p r0 = r0.m3456i()
            kotlinx.coroutines.internal.p r0 = r0.m3460e(r9, r13)
            if (r0 != 0) goto L68
        L7c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C13902p.m3464a(java.lang.Object):int");
    }

    /* renamed from: d */
    public final boolean m3461d() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f30384g.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: f */
    public final int m3459f() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    /* renamed from: g */
    public final boolean m3458g() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* renamed from: i */
    public final C13902p<E> m3456i() {
        return m3462c(m3457h());
    }

    /* renamed from: j */
    public final Object m3455j() {
        while (true) {
            long j = this._state;
            if ((1152921504606846976L & j) != 0) {
                return f30385h;
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f30388c;
            if ((i2 & i3) == (i & i3)) {
                return null;
            }
            Object obj = this.f30389d.get(i3 & i);
            if (obj == null) {
                if (this.f30387b) {
                    return null;
                }
            } else if (obj instanceof C13904b) {
                return null;
            } else {
                int i4 = (i + 1) & 1073741823;
                if (f30384g.compareAndSet(this, j, f30382e.m3452b(j, i4))) {
                    this.f30389d.set(this.f30388c & i, null);
                    return obj;
                } else if (this.f30387b) {
                    C13902p<E> c13902p = this;
                    do {
                        c13902p = c13902p.m3454k(i, i4);
                    } while (c13902p != null);
                    return obj;
                }
            }
        }
    }
}
