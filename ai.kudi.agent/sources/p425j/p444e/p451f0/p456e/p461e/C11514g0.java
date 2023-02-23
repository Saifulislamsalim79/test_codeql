package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import j.e.i0.a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p452a.EnumC11297d;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p454c.InterfaceC11317e;
/* compiled from: ObservableScalarXMap.java */
/* renamed from: j.e.f0.e.e.g0 */
/* loaded from: classes3.dex */
public final class C11514g0 {

    /* compiled from: ObservableScalarXMap.java */
    /* renamed from: j.e.f0.e.e.g0$a */
    /* loaded from: classes3.dex */
    public static final class RunnableC11515a<T> extends AtomicInteger implements InterfaceC11317e<T>, Runnable {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f25965c;

        /* renamed from: d */
        final T f25966d;

        public RunnableC11515a(InterfaceC11695u<? super T> interfaceC11695u, T t) {
            this.f25965c = interfaceC11695u;
            this.f25966d = t;
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public void clear() {
            lazySet(3);
        }

        /* renamed from: i */
        public void m10891i() {
            set(3);
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public boolean isEmpty() {
            return get() != 1;
        }

        /* renamed from: j */
        public boolean m10890j() {
            return get() == 3;
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11318f
        /* renamed from: m */
        public int mo10681m(int i) {
            if ((i & 1) != 0) {
                lazySet(1);
                return 1;
            }
            return 0;
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public T poll() throws Exception {
            if (get() == 1) {
                lazySet(3);
                return this.f25966d;
            }
            return null;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f25965c.mo331f((T) this.f25966d);
                if (get() == 2) {
                    lazySet(3);
                    this.f25965c.mo335a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ObservableScalarXMap.java */
    /* renamed from: j.e.f0.e.e.g0$b */
    /* loaded from: classes3.dex */
    public static final class C11516b<T, R> extends AbstractC11688p<R> {

        /* renamed from: c */
        final T f25967c;

        /* renamed from: d */
        final InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> f25968d;

        C11516b(T t, InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> interfaceC11291f) {
            this.f25967c = t;
            this.f25968d = interfaceC11291f;
        }

        @Override // p425j.p444e.AbstractC11688p
        /* renamed from: g0 */
        public void mo336g0(InterfaceC11695u<? super R> interfaceC11695u) {
            try {
                InterfaceC11692s<? extends R> mo10663a = this.f25968d.mo10663a((T) this.f25967c);
                C11312b.m11113d(mo10663a, "The mapper returned a null ObservableSource");
                InterfaceC11692s<? extends R> interfaceC11692s = mo10663a;
                if (interfaceC11692s instanceof Callable) {
                    try {
                        Object call = ((Callable) interfaceC11692s).call();
                        if (call == null) {
                            EnumC11297d.m11144e(interfaceC11695u);
                            return;
                        }
                        RunnableC11515a runnableC11515a = new RunnableC11515a(interfaceC11695u, call);
                        interfaceC11695u.mo332d(runnableC11515a);
                        runnableC11515a.run();
                        return;
                    } catch (Throwable th) {
                        C11118a.m11646b(th);
                        EnumC11297d.m11139n(th, interfaceC11695u);
                        return;
                    }
                }
                interfaceC11692s.mo10478e(interfaceC11695u);
            } catch (Throwable th2) {
                EnumC11297d.m11139n(th2, interfaceC11695u);
            }
        }
    }

    /* renamed from: a */
    public static <T, U> AbstractC11688p<U> m10893a(T t, InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends U>> interfaceC11291f) {
        return a.m(new C11516b(t, interfaceC11291f));
    }

    /* renamed from: b */
    public static <T, R> boolean m10892b(InterfaceC11692s<T> interfaceC11692s, InterfaceC11695u<? super R> interfaceC11695u, InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> interfaceC11291f) {
        if (interfaceC11692s instanceof Callable) {
            try {
                Object obj = (Object) ((Callable) interfaceC11692s).call();
                if (obj == 0) {
                    EnumC11297d.m11144e(interfaceC11695u);
                    return true;
                }
                try {
                    InterfaceC11692s<? extends R> mo10663a = interfaceC11291f.mo10663a(obj);
                    C11312b.m11113d(mo10663a, "The mapper returned a null ObservableSource");
                    InterfaceC11692s<? extends R> interfaceC11692s2 = mo10663a;
                    if (interfaceC11692s2 instanceof Callable) {
                        try {
                            Object call = ((Callable) interfaceC11692s2).call();
                            if (call == null) {
                                EnumC11297d.m11144e(interfaceC11695u);
                                return true;
                            }
                            RunnableC11515a runnableC11515a = new RunnableC11515a(interfaceC11695u, call);
                            interfaceC11695u.mo332d(runnableC11515a);
                            runnableC11515a.run();
                        } catch (Throwable th) {
                            C11118a.m11646b(th);
                            EnumC11297d.m11139n(th, interfaceC11695u);
                            return true;
                        }
                    } else {
                        interfaceC11692s2.mo10478e(interfaceC11695u);
                    }
                    return true;
                } catch (Throwable th2) {
                    C11118a.m11646b(th2);
                    EnumC11297d.m11139n(th2, interfaceC11695u);
                    return true;
                }
            } catch (Throwable th3) {
                C11118a.m11646b(th3);
                EnumC11297d.m11139n(th3, interfaceC11695u);
                return true;
            }
        }
        return false;
    }
}
