package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import java.util.Arrays;
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
/* compiled from: ObservableZip.java */
/* renamed from: j.e.f0.e.e.r0 */
/* loaded from: classes3.dex */
public final class C11564r0<T, R> extends AbstractC11688p<R> {

    /* renamed from: c */
    final InterfaceC11692s<? extends T>[] f26109c;

    /* renamed from: d */
    final Iterable<? extends InterfaceC11692s<? extends T>> f26110d;

    /* renamed from: e */
    final InterfaceC11291f<? super Object[], ? extends R> f26111e;

    /* renamed from: f */
    final int f26112f;

    /* renamed from: w */
    final boolean f26113w;

    /* compiled from: ObservableZip.java */
    /* renamed from: j.e.f0.e.e.r0$a */
    /* loaded from: classes3.dex */
    static final class C11565a<T, R> extends AtomicInteger implements c {

        /* renamed from: c */
        final InterfaceC11695u<? super R> f26114c;

        /* renamed from: d */
        final InterfaceC11291f<? super Object[], ? extends R> f26115d;

        /* renamed from: e */
        final C11566b<T, R>[] f26116e;

        /* renamed from: f */
        final T[] f26117f;

        /* renamed from: w */
        final boolean f26118w;

        /* renamed from: x */
        volatile boolean f26119x;

        C11565a(InterfaceC11695u<? super R> interfaceC11695u, InterfaceC11291f<? super Object[], ? extends R> interfaceC11291f, int i, boolean z) {
            this.f26114c = interfaceC11695u;
            this.f26115d = interfaceC11291f;
            this.f26116e = new C11566b[i];
            this.f26117f = (T[]) new Object[i];
            this.f26118w = z;
        }

        /* renamed from: a */
        void m10822a() {
            m10819d();
            m10821b();
        }

        /* renamed from: b */
        void m10821b() {
            for (C11566b<T, R> c11566b : this.f26116e) {
                c11566b.m10814c();
            }
        }

        /* renamed from: c */
        boolean m10820c(boolean z, boolean z2, InterfaceC11695u<? super R> interfaceC11695u, boolean z3, C11566b<?, ?> c11566b) {
            if (this.f26119x) {
                m10822a();
                return true;
            } else if (z) {
                if (z3) {
                    if (z2) {
                        Throwable th = c11566b.f26123f;
                        this.f26119x = true;
                        m10822a();
                        if (th != null) {
                            interfaceC11695u.mo334b(th);
                        } else {
                            interfaceC11695u.mo335a();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable th2 = c11566b.f26123f;
                if (th2 != null) {
                    this.f26119x = true;
                    m10822a();
                    interfaceC11695u.mo334b(th2);
                    return true;
                } else if (z2) {
                    this.f26119x = true;
                    m10822a();
                    interfaceC11695u.mo335a();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        /* renamed from: d */
        void m10819d() {
            for (C11566b<T, R> c11566b : this.f26116e) {
                c11566b.f26121d.clear();
            }
        }

        /* renamed from: e */
        public void m10818e() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            C11566b<T, R>[] c11566bArr = this.f26116e;
            InterfaceC11695u<? super R> interfaceC11695u = this.f26114c;
            T[] tArr = this.f26117f;
            boolean z = this.f26118w;
            int i = 1;
            while (true) {
                int i2 = 0;
                int i3 = 0;
                for (C11566b<T, R> c11566b : c11566bArr) {
                    if (tArr[i3] == null) {
                        boolean z2 = c11566b.f26122e;
                        T poll = c11566b.f26121d.poll();
                        boolean z3 = poll == null;
                        if (m10820c(z2, z3, interfaceC11695u, z, c11566b)) {
                            return;
                        }
                        if (z3) {
                            i2++;
                        } else {
                            tArr[i3] = poll;
                        }
                    } else if (c11566b.f26122e && !z && (th = c11566b.f26123f) != null) {
                        this.f26119x = true;
                        m10822a();
                        interfaceC11695u.mo334b(th);
                        return;
                    }
                    i3++;
                }
                if (i2 != 0) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    try {
                        Object obj = (R) this.f26115d.mo10663a(tArr.clone());
                        C11312b.m11113d(obj, "The zipper returned a null value");
                        interfaceC11695u.mo331f(obj);
                        Arrays.fill(tArr, (Object) null);
                    } catch (Throwable th2) {
                        C11118a.m11646b(th2);
                        m10822a();
                        interfaceC11695u.mo334b(th2);
                        return;
                    }
                }
            }
        }

        /* renamed from: f */
        public void m10817f(InterfaceC11692s<? extends T>[] interfaceC11692sArr, int i) {
            C11566b<T, R>[] c11566bArr = this.f26116e;
            int length = c11566bArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                c11566bArr[i2] = new C11566b<>(this, i);
            }
            lazySet(0);
            this.f26114c.mo332d(this);
            for (int i3 = 0; i3 < length && !this.f26119x; i3++) {
                interfaceC11692sArr[i3].mo10478e(c11566bArr[i3]);
            }
        }

        /* renamed from: i */
        public void m10816i() {
            if (this.f26119x) {
                return;
            }
            this.f26119x = true;
            m10821b();
            if (getAndIncrement() == 0) {
                m10819d();
            }
        }

        /* renamed from: j */
        public boolean m10815j() {
            return this.f26119x;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ObservableZip.java */
    /* renamed from: j.e.f0.e.e.r0$b */
    /* loaded from: classes3.dex */
    public static final class C11566b<T, R> implements InterfaceC11695u<T> {

        /* renamed from: c */
        final C11565a<T, R> f26120c;

        /* renamed from: d */
        final C11608c<T> f26121d;

        /* renamed from: e */
        volatile boolean f26122e;

        /* renamed from: f */
        Throwable f26123f;

        /* renamed from: w */
        final AtomicReference<c> f26124w = new AtomicReference<>();

        C11566b(C11565a<T, R> c11565a, int i) {
            this.f26120c = c11565a;
            this.f26121d = new C11608c<>(i);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            this.f26122e = true;
            this.f26120c.m10818e();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            this.f26123f = th;
            this.f26122e = true;
            this.f26120c.m10818e();
        }

        /* renamed from: c */
        public void m10814c() {
            EnumC11296c.m11156a(this.f26124w);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            EnumC11296c.m11149m(this.f26124w, cVar);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            this.f26121d.offer(t);
            this.f26120c.m10818e();
        }
    }

    public C11564r0(InterfaceC11692s<? extends T>[] interfaceC11692sArr, Iterable<? extends InterfaceC11692s<? extends T>> iterable, InterfaceC11291f<? super Object[], ? extends R> interfaceC11291f, int i, boolean z) {
        this.f26109c = interfaceC11692sArr;
        this.f26110d = iterable;
        this.f26111e = interfaceC11291f;
        this.f26112f = i;
        this.f26113w = z;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super R> interfaceC11695u) {
        int length;
        InterfaceC11692s<? extends T>[] interfaceC11692sArr = this.f26109c;
        if (interfaceC11692sArr == null) {
            interfaceC11692sArr = new AbstractC11688p[8];
            length = 0;
            for (InterfaceC11692s<? extends T> interfaceC11692s : this.f26110d) {
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
        if (length == 0) {
            EnumC11297d.m11144e(interfaceC11695u);
        } else {
            new C11565a(interfaceC11695u, this.f26111e, length, this.f26113w).m10817f(interfaceC11692sArr, this.f26112f);
        }
    }
}
