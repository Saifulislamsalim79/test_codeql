package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p452a.EnumC11297d;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p463f.C11608c;
import p425j.p444e.p451f0.p467j.C11656c;
/* compiled from: ObservableCombineLatest.java */
/* renamed from: j.e.f0.e.e.d */
/* loaded from: classes3.dex */
public final class C11496d<T, R> extends AbstractC11688p<R> {

    /* renamed from: c */
    final InterfaceC11692s<? extends T>[] f25880c;

    /* renamed from: d */
    final Iterable<? extends InterfaceC11692s<? extends T>> f25881d;

    /* renamed from: e */
    final InterfaceC11291f<? super Object[], ? extends R> f25882e;

    /* renamed from: f */
    final int f25883f;

    /* renamed from: w */
    final boolean f25884w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ObservableCombineLatest.java */
    /* renamed from: j.e.f0.e.e.d$a */
    /* loaded from: classes3.dex */
    public static final class C11497a<T, R> extends AtomicReference<c> implements InterfaceC11695u<T> {

        /* renamed from: c */
        final C11498b<T, R> f25885c;

        /* renamed from: d */
        final int f25886d;

        C11497a(C11498b<T, R> c11498b, int i) {
            this.f25885c = c11498b;
            this.f25886d = i;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            this.f25885c.m10931d(this.f25886d);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            this.f25885c.m10930e(this.f25886d, th);
        }

        /* renamed from: c */
        public void m10935c() {
            EnumC11296c.m11156a(this);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            EnumC11296c.m11149m(this, cVar);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            this.f25885c.m10929f(this.f25886d, t);
        }
    }

    /* compiled from: ObservableCombineLatest.java */
    /* renamed from: j.e.f0.e.e.d$b */
    /* loaded from: classes3.dex */
    static final class C11498b<T, R> extends AtomicInteger implements c {

        /* renamed from: A */
        final C11656c f25887A = new C11656c();

        /* renamed from: B */
        int f25888B;

        /* renamed from: C */
        int f25889C;

        /* renamed from: c */
        final InterfaceC11695u<? super R> f25890c;

        /* renamed from: d */
        final InterfaceC11291f<? super Object[], ? extends R> f25891d;

        /* renamed from: e */
        final C11497a<T, R>[] f25892e;

        /* renamed from: f */
        Object[] f25893f;

        /* renamed from: w */
        final C11608c<Object[]> f25894w;

        /* renamed from: x */
        final boolean f25895x;

        /* renamed from: y */
        volatile boolean f25896y;

        /* renamed from: z */
        volatile boolean f25897z;

        C11498b(InterfaceC11695u<? super R> interfaceC11695u, InterfaceC11291f<? super Object[], ? extends R> interfaceC11291f, int i, int i2, boolean z) {
            this.f25890c = interfaceC11695u;
            this.f25891d = interfaceC11291f;
            this.f25895x = z;
            this.f25893f = new Object[i];
            C11497a<T, R>[] c11497aArr = new C11497a[i];
            for (int i3 = 0; i3 < i; i3++) {
                c11497aArr[i3] = new C11497a<>(this, i3);
            }
            this.f25892e = c11497aArr;
            this.f25894w = new C11608c<>(i2);
        }

        /* renamed from: a */
        void m10934a() {
            for (C11497a<T, R> c11497a : this.f25892e) {
                c11497a.m10935c();
            }
        }

        /* renamed from: b */
        void m10933b(C11608c<?> c11608c) {
            synchronized (this) {
                this.f25893f = null;
            }
            c11608c.clear();
        }

        /* renamed from: c */
        void m10932c() {
            if (getAndIncrement() != 0) {
                return;
            }
            C11608c<Object[]> c11608c = this.f25894w;
            InterfaceC11695u<? super R> interfaceC11695u = this.f25890c;
            boolean z = this.f25895x;
            int i = 1;
            while (!this.f25896y) {
                if (!z && this.f25887A.get() != null) {
                    m10934a();
                    m10933b(c11608c);
                    interfaceC11695u.mo334b(this.f25887A.m10658b());
                    return;
                }
                boolean z2 = this.f25897z;
                Object[] poll = c11608c.poll();
                boolean z3 = poll == null;
                if (z2 && z3) {
                    m10933b(c11608c);
                    Throwable m10658b = this.f25887A.m10658b();
                    if (m10658b == null) {
                        interfaceC11695u.mo335a();
                        return;
                    } else {
                        interfaceC11695u.mo334b(m10658b);
                        return;
                    }
                } else if (z3) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    try {
                        Object obj = (R) this.f25891d.mo10663a(poll);
                        C11312b.m11113d(obj, "The combiner returned a null value");
                        interfaceC11695u.mo331f(obj);
                    } catch (Throwable th) {
                        C11118a.m11646b(th);
                        this.f25887A.m10659a(th);
                        m10934a();
                        m10933b(c11608c);
                        interfaceC11695u.mo334b(this.f25887A.m10658b());
                        return;
                    }
                }
            }
            m10933b(c11608c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
            if (r2 == r0.length) goto L19;
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void m10931d(int r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.f25893f     // Catch: java.lang.Throwable -> L25
                if (r0 != 0) goto L7
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
                return
            L7:
                r4 = r0[r4]     // Catch: java.lang.Throwable -> L25
                r1 = 1
                if (r4 != 0) goto Le
                r4 = 1
                goto Lf
            Le:
                r4 = 0
            Lf:
                if (r4 != 0) goto L19
                int r2 = r3.f25889C     // Catch: java.lang.Throwable -> L25
                int r2 = r2 + r1
                r3.f25889C = r2     // Catch: java.lang.Throwable -> L25
                int r0 = r0.length     // Catch: java.lang.Throwable -> L25
                if (r2 != r0) goto L1b
            L19:
                r3.f25897z = r1     // Catch: java.lang.Throwable -> L25
            L1b:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
                if (r4 == 0) goto L21
                r3.m10934a()
            L21:
                r3.m10932c()
                return
            L25:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p425j.p444e.p451f0.p456e.p461e.C11496d.C11498b.m10931d(int):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
            if (r1 == r4.length) goto L20;
         */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void m10930e(int r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                j.e.f0.j.c r0 = r2.f25887A
                boolean r0 = r0.m10659a(r4)
                if (r0 == 0) goto L36
                boolean r4 = r2.f25895x
                r0 = 1
                if (r4 == 0) goto L2d
                monitor-enter(r2)
                java.lang.Object[] r4 = r2.f25893f     // Catch: java.lang.Throwable -> L2a
                if (r4 != 0) goto L14
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
                return
            L14:
                r3 = r4[r3]     // Catch: java.lang.Throwable -> L2a
                if (r3 != 0) goto L1a
                r3 = 1
                goto L1b
            L1a:
                r3 = 0
            L1b:
                if (r3 != 0) goto L25
                int r1 = r2.f25889C     // Catch: java.lang.Throwable -> L2a
                int r1 = r1 + r0
                r2.f25889C = r1     // Catch: java.lang.Throwable -> L2a
                int r4 = r4.length     // Catch: java.lang.Throwable -> L2a
                if (r1 != r4) goto L27
            L25:
                r2.f25897z = r0     // Catch: java.lang.Throwable -> L2a
            L27:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
                r0 = r3
                goto L2d
            L2a:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
                throw r3
            L2d:
                if (r0 == 0) goto L32
                r2.m10934a()
            L32:
                r2.m10932c()
                goto L39
            L36:
                j.e.i0.a.r(r4)
            L39:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p425j.p444e.p451f0.p456e.p461e.C11496d.C11498b.m10930e(int, java.lang.Throwable):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: f */
        void m10929f(int i, T t) {
            boolean z;
            synchronized (this) {
                Object[] objArr = this.f25893f;
                if (objArr == null) {
                    return;
                }
                Object obj = objArr[i];
                int i2 = this.f25888B;
                if (obj == null) {
                    i2++;
                    this.f25888B = i2;
                }
                objArr[i] = t;
                if (i2 == objArr.length) {
                    this.f25894w.offer(objArr.clone());
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    m10932c();
                }
            }
        }

        /* renamed from: g */
        public void m10928g(InterfaceC11692s<? extends T>[] interfaceC11692sArr) {
            C11497a<T, R>[] c11497aArr = this.f25892e;
            int length = c11497aArr.length;
            this.f25890c.mo332d(this);
            for (int i = 0; i < length && !this.f25897z && !this.f25896y; i++) {
                interfaceC11692sArr[i].mo10478e(c11497aArr[i]);
            }
        }

        /* renamed from: i */
        public void m10927i() {
            if (this.f25896y) {
                return;
            }
            this.f25896y = true;
            m10934a();
            if (getAndIncrement() == 0) {
                m10933b(this.f25894w);
            }
        }

        /* renamed from: j */
        public boolean m10926j() {
            return this.f25896y;
        }
    }

    public C11496d(InterfaceC11692s<? extends T>[] interfaceC11692sArr, Iterable<? extends InterfaceC11692s<? extends T>> iterable, InterfaceC11291f<? super Object[], ? extends R> interfaceC11291f, int i, boolean z) {
        this.f25880c = interfaceC11692sArr;
        this.f25881d = iterable;
        this.f25882e = interfaceC11291f;
        this.f25883f = i;
        this.f25884w = z;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super R> interfaceC11695u) {
        int length;
        InterfaceC11692s<? extends T>[] interfaceC11692sArr = this.f25880c;
        if (interfaceC11692sArr == null) {
            interfaceC11692sArr = new AbstractC11688p[8];
            length = 0;
            for (InterfaceC11692s<? extends T> interfaceC11692s : this.f25881d) {
                if (length == interfaceC11692sArr.length) {
                    InterfaceC11692s<? extends T>[] interfaceC11692sArr2 = new InterfaceC11692s[(length >> 2) + length];
                    System.arraycopy(interfaceC11692sArr, 0, interfaceC11692sArr2, 0, length);
                    interfaceC11692sArr = interfaceC11692sArr2;
                }
                interfaceC11692sArr[length] = interfaceC11692s;
                length++;
            }
        } else {
            length = interfaceC11692sArr.length;
        }
        int i = length;
        if (i == 0) {
            EnumC11297d.m11144e(interfaceC11695u);
        } else {
            new C11498b(interfaceC11695u, this.f25882e, i, this.f25883f, this.f25884w).m10928g(interfaceC11692sArr);
        }
    }
}
