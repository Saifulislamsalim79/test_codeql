package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: LockFreeLinkedList.kt */
/* renamed from: kotlinx.coroutines.internal.n */
/* loaded from: classes3.dex */
public class C13897n {

    /* renamed from: c */
    static final /* synthetic */ AtomicReferenceFieldUpdater f30375c = AtomicReferenceFieldUpdater.newUpdater(C13897n.class, Object.class, "_next");

    /* renamed from: d */
    static final /* synthetic */ AtomicReferenceFieldUpdater f30376d = AtomicReferenceFieldUpdater.newUpdater(C13897n.class, Object.class, "_prev");

    /* renamed from: e */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f30377e = AtomicReferenceFieldUpdater.newUpdater(C13897n.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* compiled from: LockFreeLinkedList.kt */
    /* renamed from: kotlinx.coroutines.internal.n$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC13898a extends AbstractC13870b {
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* renamed from: kotlinx.coroutines.internal.n$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC13899b extends AbstractC13877d<C13897n> {

        /* renamed from: b */
        public final C13897n f30378b;

        /* renamed from: c */
        public C13897n f30379c;

        public AbstractC13899b(C13897n c13897n) {
            this.f30378b = c13897n;
        }

        @Override // kotlinx.coroutines.internal.AbstractC13877d
        /* renamed from: h */
        public void mo2973d(C13897n c13897n, Object obj) {
            boolean z = obj == null;
            C13897n c13897n2 = z ? this.f30378b : this.f30379c;
            if (c13897n2 != null && C13897n.f30375c.compareAndSet(c13897n, this, c13897n2) && z) {
                C13897n c13897n3 = this.f30378b;
                C13897n c13897n4 = this.f30379c;
                kotlin.e0.d.l.d(c13897n4);
                c13897n3.m3481o(c13897n4);
            }
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* renamed from: kotlinx.coroutines.internal.n$c */
    /* loaded from: classes3.dex */
    public static final class C13900c extends AbstractC13910u {

        /* renamed from: a */
        public final AbstractC13898a f30380a;

        /* renamed from: d */
        public final void m3469d() {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        if (kotlinx.coroutines.internal.C13897n.f30375c.compareAndSet(r3, r2, ((kotlinx.coroutines.internal.C13911v) r4).f30400a) != false) goto L23;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlinx.coroutines.internal.C13897n m3483m(kotlinx.coroutines.internal.AbstractC13910u r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.n r0 = (kotlinx.coroutines.internal.C13897n) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.C13897n.f30376d
            boolean r0 = r1.compareAndSet(r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.mo3475v()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.AbstractC13910u
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            kotlinx.coroutines.internal.u r0 = (kotlinx.coroutines.internal.AbstractC13910u) r0
            boolean r0 = r8.m3437b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            kotlinx.coroutines.internal.u r4 = (kotlinx.coroutines.internal.AbstractC13910u) r4
            r4.mo3436c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C13911v
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.C13897n.f30375c
            kotlinx.coroutines.internal.v r4 = (kotlinx.coroutines.internal.C13911v) r4
            kotlinx.coroutines.internal.n r4 = r4.f30400a
            boolean r2 = r5.compareAndSet(r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.n r2 = (kotlinx.coroutines.internal.C13897n) r2
            goto L7
        L52:
            r3 = r4
            kotlinx.coroutines.internal.n r3 = (kotlinx.coroutines.internal.C13897n) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C13897n.m3483m(kotlinx.coroutines.internal.u):kotlinx.coroutines.internal.n");
    }

    /* renamed from: n */
    private final C13897n m3482n(C13897n c13897n) {
        while (c13897n.mo3475v()) {
            c13897n = (C13897n) c13897n._prev;
        }
        return c13897n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m3481o(C13897n c13897n) {
        C13897n c13897n2;
        do {
            c13897n2 = (C13897n) c13897n._prev;
            if (m3480p() != c13897n) {
                return;
            }
        } while (!f30376d.compareAndSet(c13897n, c13897n2, this));
        if (mo3475v()) {
            c13897n.m3483m(null);
        }
    }

    /* renamed from: z */
    private final C13911v m3471z() {
        C13911v c13911v = (C13911v) this._removedRef;
        if (c13911v == null) {
            C13911v c13911v2 = new C13911v(this);
            f30377e.lazySet(this, c13911v2);
            return c13911v2;
        }
        return c13911v;
    }

    /* renamed from: A */
    public final int m3488A(C13897n c13897n, C13897n c13897n2, AbstractC13899b abstractC13899b) {
        f30376d.lazySet(c13897n, this);
        f30375c.lazySet(c13897n, c13897n2);
        abstractC13899b.f30379c = c13897n2;
        if (f30375c.compareAndSet(this, c13897n2, abstractC13899b)) {
            return abstractC13899b.mo3436c(this) == null ? 1 : 2;
        }
        return 0;
    }

    /* renamed from: h */
    public final void m3486h(C13897n c13897n) {
        do {
        } while (!m3478s().m3485j(c13897n, this));
    }

    /* renamed from: j */
    public final boolean m3485j(C13897n c13897n, C13897n c13897n2) {
        f30376d.lazySet(c13897n, this);
        f30375c.lazySet(c13897n, c13897n2);
        if (f30375c.compareAndSet(this, c13897n2, c13897n)) {
            c13897n.m3481o(c13897n2);
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m3484l(C13897n c13897n) {
        f30376d.lazySet(c13897n, this);
        f30375c.lazySet(c13897n, this);
        while (m3480p() == this) {
            if (f30375c.compareAndSet(this, this, c13897n)) {
                c13897n.m3481o(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public final Object m3480p() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof AbstractC13910u)) {
                return obj;
            }
            ((AbstractC13910u) obj).mo3436c(this);
        }
    }

    /* renamed from: r */
    public final C13897n m3479r() {
        return C13896m.m3489b(m3480p());
    }

    /* renamed from: s */
    public final C13897n m3478s() {
        C13897n m3483m = m3483m(null);
        return m3483m == null ? m3482n((C13897n) this._prev) : m3483m;
    }

    /* renamed from: t */
    public final void m3477t() {
        ((C13911v) m3480p()).f30400a.m3476u();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append('@');
        sb.append((Object) Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    /* renamed from: u */
    public final void m3476u() {
        C13897n c13897n = this;
        while (true) {
            Object m3480p = c13897n.m3480p();
            if (!(m3480p instanceof C13911v)) {
                c13897n.m3483m(null);
                return;
            }
            c13897n = ((C13911v) m3480p).f30400a;
        }
    }

    /* renamed from: v */
    public boolean mo3475v() {
        return m3480p() instanceof C13911v;
    }

    /* renamed from: w */
    public boolean mo3474w() {
        return m3472y() == null;
    }

    /* renamed from: x */
    public final C13897n m3473x() {
        while (true) {
            C13897n c13897n = (C13897n) m3480p();
            if (c13897n == this) {
                return null;
            }
            if (c13897n.mo3474w()) {
                return c13897n;
            }
            c13897n.m3477t();
        }
    }

    /* renamed from: y */
    public final C13897n m3472y() {
        Object m3480p;
        C13897n c13897n;
        do {
            m3480p = m3480p();
            if (m3480p instanceof C13911v) {
                return ((C13911v) m3480p).f30400a;
            }
            if (m3480p == this) {
                return (C13897n) m3480p;
            }
            c13897n = (C13897n) m3480p;
        } while (!f30375c.compareAndSet(this, m3480p, c13897n.m3471z()));
        c13897n.m3483m(null);
        return null;
    }
}
