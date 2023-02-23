package p425j.p444e.p471k0;

import j.e.c0.c;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p467j.C11653a;
import p425j.p444e.p451f0.p467j.C11661h;
import p425j.p444e.p451f0.p467j.EnumC11664j;
/* compiled from: BehaviorSubject.java */
/* renamed from: j.e.k0.a */
/* loaded from: classes3.dex */
public final class C11678a<T> extends AbstractC11683d<T> {

    /* renamed from: c */
    final AtomicReference<Object> f26381c;

    /* renamed from: d */
    final AtomicReference<C11679a<T>[]> f26382d;

    /* renamed from: e */
    final ReadWriteLock f26383e;

    /* renamed from: f */
    final Lock f26384f;

    /* renamed from: w */
    final Lock f26385w;

    /* renamed from: x */
    final AtomicReference<Throwable> f26386x;

    /* renamed from: y */
    long f26387y;

    /* renamed from: z */
    private static final Object[] f26380z = new Object[0];

    /* renamed from: A */
    static final C11679a[] f26378A = new C11679a[0];

    /* renamed from: B */
    static final C11679a[] f26379B = new C11679a[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BehaviorSubject.java */
    /* renamed from: j.e.k0.a$a */
    /* loaded from: classes3.dex */
    public static final class C11679a<T> implements c, C11653a.InterfaceC11654a<Object> {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f26388c;

        /* renamed from: d */
        final C11678a<T> f26389d;

        /* renamed from: e */
        boolean f26390e;

        /* renamed from: f */
        boolean f26391f;

        /* renamed from: w */
        C11653a<Object> f26392w;

        /* renamed from: x */
        boolean f26393x;

        /* renamed from: y */
        volatile boolean f26394y;

        /* renamed from: z */
        long f26395z;

        C11679a(InterfaceC11695u<? super T> interfaceC11695u, C11678a<T> c11678a) {
            this.f26388c = interfaceC11695u;
            this.f26389d = c11678a;
        }

        /* renamed from: a */
        void m10570a() {
            if (this.f26394y) {
                return;
            }
            synchronized (this) {
                if (this.f26394y) {
                    return;
                }
                if (this.f26390e) {
                    return;
                }
                C11678a<T> c11678a = this.f26389d;
                Lock lock = c11678a.f26384f;
                lock.lock();
                this.f26395z = c11678a.f26387y;
                Object obj = c11678a.f26381c.get();
                lock.unlock();
                this.f26391f = obj != null;
                this.f26390e = true;
                if (obj == null || mo10557c(obj)) {
                    return;
                }
                m10569b();
            }
        }

        /* renamed from: b */
        void m10569b() {
            C11653a<Object> c11653a;
            while (!this.f26394y) {
                synchronized (this) {
                    c11653a = this.f26392w;
                    if (c11653a == null) {
                        this.f26391f = false;
                        return;
                    }
                    this.f26392w = null;
                }
                c11653a.m10665c(this);
            }
        }

        @Override // p425j.p444e.p451f0.p467j.C11653a.InterfaceC11654a, p425j.p444e.p450e0.InterfaceC11292g
        /* renamed from: c */
        public boolean mo10557c(Object obj) {
            return this.f26394y || EnumC11664j.m10639a(obj, this.f26388c);
        }

        /* renamed from: d */
        void m10568d(Object obj, long j) {
            if (this.f26394y) {
                return;
            }
            if (!this.f26393x) {
                synchronized (this) {
                    if (this.f26394y) {
                        return;
                    }
                    if (this.f26395z == j) {
                        return;
                    }
                    if (this.f26391f) {
                        C11653a<Object> c11653a = this.f26392w;
                        if (c11653a == null) {
                            c11653a = new C11653a<>(4);
                            this.f26392w = c11653a;
                        }
                        c11653a.m10666b(obj);
                        return;
                    }
                    this.f26390e = true;
                    this.f26393x = true;
                }
            }
            mo10557c(obj);
        }

        /* renamed from: i */
        public void m10567i() {
            if (this.f26394y) {
                return;
            }
            this.f26394y = true;
            this.f26389d.m10573x0(this);
        }

        /* renamed from: j */
        public boolean m10566j() {
            return this.f26394y;
        }
    }

    C11678a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f26383e = reentrantReadWriteLock;
        this.f26384f = reentrantReadWriteLock.readLock();
        this.f26385w = this.f26383e.writeLock();
        this.f26382d = new AtomicReference<>(f26378A);
        this.f26381c = new AtomicReference<>();
        this.f26386x = new AtomicReference<>();
    }

    /* renamed from: v0 */
    public static <T> C11678a<T> m10575v0() {
        return new C11678a<>();
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: a */
    public void mo335a() {
        if (this.f26386x.compareAndSet(null, C11661h.f26352a)) {
            Object m10637e = EnumC11664j.m10637e();
            for (C11679a<T> c11679a : m10571z0(m10637e)) {
                c11679a.m10568d(m10637e, this.f26387y);
            }
        }
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: b */
    public void mo334b(Throwable th) {
        C11312b.m11113d(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f26386x.compareAndSet(null, th)) {
            a.r(th);
            return;
        }
        Object m10635h = EnumC11664j.m10635h(th);
        for (C11679a<T> c11679a : m10571z0(m10635h)) {
            c11679a.m10568d(m10635h, this.f26387y);
        }
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: d */
    public void mo332d(c cVar) {
        if (this.f26386x.get() != null) {
            cVar.i();
        }
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: f */
    public void mo331f(T t) {
        C11312b.m11113d(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f26386x.get() != null) {
            return;
        }
        EnumC11664j.m10630p(t);
        m10572y0(t);
        for (C11679a<T> c11679a : this.f26382d.get()) {
            c11679a.m10568d(t, this.f26387y);
        }
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        C11679a<T> c11679a = new C11679a<>(interfaceC11695u, this);
        interfaceC11695u.mo332d(c11679a);
        if (m10576u0(c11679a)) {
            if (c11679a.f26394y) {
                m10573x0(c11679a);
                return;
            } else {
                c11679a.m10570a();
                return;
            }
        }
        Throwable th = this.f26386x.get();
        if (th == C11661h.f26352a) {
            interfaceC11695u.mo335a();
        } else {
            interfaceC11695u.mo334b(th);
        }
    }

    /* renamed from: u0 */
    boolean m10576u0(C11679a<T> c11679a) {
        C11679a<T>[] c11679aArr;
        C11679a<T>[] c11679aArr2;
        do {
            c11679aArr = this.f26382d.get();
            if (c11679aArr == f26379B) {
                return false;
            }
            int length = c11679aArr.length;
            c11679aArr2 = new C11679a[length + 1];
            System.arraycopy(c11679aArr, 0, c11679aArr2, 0, length);
            c11679aArr2[length] = c11679a;
        } while (!this.f26382d.compareAndSet(c11679aArr, c11679aArr2));
        return true;
    }

    /* renamed from: w0 */
    public T m10574w0() {
        T t = (T) this.f26381c.get();
        if (EnumC11664j.m10632m(t) || EnumC11664j.m10631n(t)) {
            return null;
        }
        EnumC11664j.m10633j(t);
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x0 */
    void m10573x0(C11679a<T> c11679a) {
        C11679a<T>[] c11679aArr;
        C11679a[] c11679aArr2;
        do {
            c11679aArr = this.f26382d.get();
            int length = c11679aArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (c11679aArr[i2] == c11679a) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c11679aArr2 = f26378A;
            } else {
                C11679a[] c11679aArr3 = new C11679a[length - 1];
                System.arraycopy(c11679aArr, 0, c11679aArr3, 0, i);
                System.arraycopy(c11679aArr, i + 1, c11679aArr3, i, (length - i) - 1);
                c11679aArr2 = c11679aArr3;
            }
        } while (!this.f26382d.compareAndSet(c11679aArr, c11679aArr2));
    }

    /* renamed from: y0 */
    void m10572y0(Object obj) {
        this.f26385w.lock();
        this.f26387y++;
        this.f26381c.lazySet(obj);
        this.f26385w.unlock();
    }

    /* renamed from: z0 */
    C11679a<T>[] m10571z0(Object obj) {
        C11679a<T>[] andSet = this.f26382d.getAndSet(f26379B);
        if (andSet != f26379B) {
            m10572y0(obj);
        }
        return andSet;
    }
}
