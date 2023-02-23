package p425j.p444e.p451f0.p463f;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p425j.p444e.p451f0.p454c.InterfaceC11321i;
import p425j.p444e.p451f0.p467j.C11668l;
/* compiled from: SpscArrayQueue.java */
/* renamed from: j.e.f0.f.b */
/* loaded from: classes3.dex */
public final class C11607b<E> extends AtomicReferenceArray<E> implements InterfaceC11321i<E> {

    /* renamed from: x */
    private static final Integer f26193x = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: c */
    final int f26194c;

    /* renamed from: d */
    final AtomicLong f26195d;

    /* renamed from: e */
    long f26196e;

    /* renamed from: f */
    final AtomicLong f26197f;

    /* renamed from: w */
    final int f26198w;

    public C11607b(int i) {
        super(C11668l.m10623a(i));
        this.f26194c = length() - 1;
        this.f26195d = new AtomicLong();
        this.f26197f = new AtomicLong();
        this.f26198w = Math.min(i / 4, f26193x.intValue());
    }

    /* renamed from: a */
    int m10778a(long j) {
        return this.f26194c & ((int) j);
    }

    /* renamed from: b */
    int m10777b(long j, int i) {
        return ((int) j) & i;
    }

    /* renamed from: c */
    E m10776c(int i) {
        return get(i);
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* renamed from: d */
    void m10775d(long j) {
        this.f26197f.lazySet(j);
    }

    /* renamed from: e */
    void m10774e(int i, E e) {
        lazySet(i, e);
    }

    /* renamed from: f */
    void m10773f(long j) {
        this.f26195d.lazySet(j);
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public boolean isEmpty() {
        return this.f26195d.get() == this.f26197f.get();
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public boolean offer(E e) {
        if (e != null) {
            int i = this.f26194c;
            long j = this.f26195d.get();
            int m10777b = m10777b(j, i);
            if (j >= this.f26196e) {
                long j2 = this.f26198w + j;
                if (m10776c(m10777b(j2, i)) == null) {
                    this.f26196e = j2;
                } else if (m10776c(m10777b) != null) {
                    return false;
                }
            }
            m10774e(m10777b, e);
            m10773f(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11321i, p425j.p444e.p451f0.p454c.InterfaceC11322j
    public E poll() {
        long j = this.f26197f.get();
        int m10778a = m10778a(j);
        E m10776c = m10776c(m10778a);
        if (m10776c == null) {
            return null;
        }
        m10775d(j + 1);
        m10774e(m10778a, null);
        return m10776c;
    }
}
