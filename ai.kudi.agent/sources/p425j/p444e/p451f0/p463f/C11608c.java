package p425j.p444e.p451f0.p463f;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p425j.p444e.p451f0.p454c.InterfaceC11321i;
import p425j.p444e.p451f0.p467j.C11668l;
/* compiled from: SpscLinkedArrayQueue.java */
/* renamed from: j.e.f0.f.c */
/* loaded from: classes3.dex */
public final class C11608c<T> implements InterfaceC11321i<T> {

    /* renamed from: A */
    static final int f26199A = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: B */
    private static final Object f26200B = new Object();

    /* renamed from: d */
    int f26202d;

    /* renamed from: e */
    long f26203e;

    /* renamed from: f */
    final int f26204f;

    /* renamed from: w */
    AtomicReferenceArray<Object> f26205w;

    /* renamed from: x */
    final int f26206x;

    /* renamed from: y */
    AtomicReferenceArray<Object> f26207y;

    /* renamed from: c */
    final AtomicLong f26201c = new AtomicLong();

    /* renamed from: z */
    final AtomicLong f26208z = new AtomicLong();

    public C11608c(int i) {
        int m10623a = C11668l.m10623a(Math.max(8, i));
        int i2 = m10623a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(m10623a + 1);
        this.f26205w = atomicReferenceArray;
        this.f26204f = i2;
        m10772a(m10623a);
        this.f26207y = atomicReferenceArray;
        this.f26206x = i2;
        this.f26203e = i2 - 1;
        m10758p(0L);
    }

    /* renamed from: a */
    private void m10772a(int i) {
        this.f26202d = Math.min(i / 4, f26199A);
    }

    /* renamed from: b */
    private static int m10771b(int i) {
        return i;
    }

    /* renamed from: c */
    private static int m10770c(long j, int i) {
        int i2 = ((int) j) & i;
        m10771b(i2);
        return i2;
    }

    /* renamed from: d */
    private long m10769d() {
        return this.f26208z.get();
    }

    /* renamed from: e */
    private long m10768e() {
        return this.f26201c.get();
    }

    /* renamed from: f */
    private long m10767f() {
        return this.f26208z.get();
    }

    /* renamed from: g */
    private static <E> Object m10766g(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: h */
    private AtomicReferenceArray<Object> m10765h(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        m10771b(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) m10766g(atomicReferenceArray, i);
        m10760n(atomicReferenceArray, i, null);
        return atomicReferenceArray2;
    }

    /* renamed from: i */
    private long m10764i() {
        return this.f26201c.get();
    }

    /* renamed from: j */
    private T m10763j(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f26207y = atomicReferenceArray;
        int m10770c = m10770c(j, i);
        T t = (T) m10766g(atomicReferenceArray, m10770c);
        if (t != null) {
            m10760n(atomicReferenceArray, m10770c, null);
            m10761l(j + 1);
        }
        return t;
    }

    /* renamed from: k */
    private void m10762k(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f26205w = atomicReferenceArray2;
        this.f26203e = (j2 + j) - 1;
        m10760n(atomicReferenceArray2, i, t);
        m10759o(atomicReferenceArray, atomicReferenceArray2);
        m10760n(atomicReferenceArray, i, f26200B);
        m10758p(j + 1);
    }

    /* renamed from: l */
    private void m10761l(long j) {
        this.f26208z.lazySet(j);
    }

    /* renamed from: n */
    private static void m10760n(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: o */
    private void m10759o(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        int length = atomicReferenceArray.length() - 1;
        m10771b(length);
        m10760n(atomicReferenceArray, length, atomicReferenceArray2);
    }

    /* renamed from: p */
    private void m10758p(long j) {
        this.f26201c.lazySet(j);
    }

    /* renamed from: q */
    private boolean m10757q(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m10760n(atomicReferenceArray, i, t);
        m10758p(j + 1);
        return true;
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public boolean isEmpty() {
        return m10764i() == m10767f();
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f26205w;
            long m10768e = m10768e();
            int i = this.f26204f;
            int m10770c = m10770c(m10768e, i);
            if (m10768e < this.f26203e) {
                return m10757q(atomicReferenceArray, t, m10768e, m10770c);
            }
            long j = this.f26202d + m10768e;
            if (m10766g(atomicReferenceArray, m10770c(j, i)) == null) {
                this.f26203e = j - 1;
                return m10757q(atomicReferenceArray, t, m10768e, m10770c);
            } else if (m10766g(atomicReferenceArray, m10770c(1 + m10768e, i)) == null) {
                return m10757q(atomicReferenceArray, t, m10768e, m10770c);
            } else {
                m10762k(atomicReferenceArray, m10768e, m10770c, t, i);
                return true;
            }
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11321i, p425j.p444e.p451f0.p454c.InterfaceC11322j
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f26207y;
        long m10769d = m10769d();
        int i = this.f26206x;
        int m10770c = m10770c(m10769d, i);
        T t = (T) m10766g(atomicReferenceArray, m10770c);
        boolean z = t == f26200B;
        if (t == null || z) {
            if (z) {
                return m10763j(m10765h(atomicReferenceArray, i + 1), m10769d, i);
            }
            return null;
        }
        m10760n(atomicReferenceArray, m10770c, null);
        m10761l(m10769d + 1);
        return t;
    }
}
