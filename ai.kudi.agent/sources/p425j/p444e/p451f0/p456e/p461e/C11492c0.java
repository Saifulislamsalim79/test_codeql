package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.e0.e;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p467j.C11661h;
import p425j.p444e.p468g0.AbstractC11671a;
/* compiled from: ObservablePublish.java */
/* renamed from: j.e.f0.e.e.c0 */
/* loaded from: classes3.dex */
public final class C11492c0<T> extends AbstractC11671a<T> {

    /* renamed from: c */
    final InterfaceC11692s<T> f25869c;

    /* renamed from: d */
    final AtomicReference<C11494b<T>> f25870d;

    /* renamed from: e */
    final InterfaceC11692s<T> f25871e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ObservablePublish.java */
    /* renamed from: j.e.f0.e.e.c0$a */
    /* loaded from: classes3.dex */
    public static final class C11493a<T> extends AtomicReference<Object> implements c {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f25872c;

        C11493a(InterfaceC11695u<? super T> interfaceC11695u) {
            this.f25872c = interfaceC11695u;
        }

        /* renamed from: a */
        void m10942a(C11494b<T> c11494b) {
            if (compareAndSet(null, c11494b)) {
                return;
            }
            c11494b.m10938e(this);
        }

        /* renamed from: i */
        public void m10941i() {
            Object andSet = getAndSet(this);
            if (andSet == null || andSet == this) {
                return;
            }
            ((C11494b) andSet).m10938e(this);
        }

        /* renamed from: j */
        public boolean m10940j() {
            return get() == this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ObservablePublish.java */
    /* renamed from: j.e.f0.e.e.c0$b */
    /* loaded from: classes3.dex */
    public static final class C11494b<T> implements InterfaceC11695u<T>, c {

        /* renamed from: w */
        static final C11493a[] f25873w = new C11493a[0];

        /* renamed from: x */
        static final C11493a[] f25874x = new C11493a[0];

        /* renamed from: c */
        final AtomicReference<C11494b<T>> f25875c;

        /* renamed from: f */
        final AtomicReference<c> f25878f = new AtomicReference<>();

        /* renamed from: d */
        final AtomicReference<C11493a<T>[]> f25876d = new AtomicReference<>(f25873w);

        /* renamed from: e */
        final AtomicBoolean f25877e = new AtomicBoolean();

        C11494b(AtomicReference<C11494b<T>> atomicReference) {
            this.f25875c = atomicReference;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            this.f25875c.compareAndSet(this, null);
            for (C11493a<T> c11493a : this.f25876d.getAndSet(f25874x)) {
                c11493a.f25872c.mo335a();
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            this.f25875c.compareAndSet(this, null);
            C11493a<T>[] andSet = this.f25876d.getAndSet(f25874x);
            if (andSet.length != 0) {
                for (C11493a<T> c11493a : andSet) {
                    c11493a.f25872c.mo334b(th);
                }
                return;
            }
            a.r(th);
        }

        /* renamed from: c */
        boolean m10939c(C11493a<T> c11493a) {
            C11493a<T>[] c11493aArr;
            C11493a<T>[] c11493aArr2;
            do {
                c11493aArr = this.f25876d.get();
                if (c11493aArr == f25874x) {
                    return false;
                }
                int length = c11493aArr.length;
                c11493aArr2 = new C11493a[length + 1];
                System.arraycopy(c11493aArr, 0, c11493aArr2, 0, length);
                c11493aArr2[length] = c11493a;
            } while (!this.f25876d.compareAndSet(c11493aArr, c11493aArr2));
            return true;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            EnumC11296c.m11149m(this.f25878f, cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: e */
        void m10938e(C11493a<T> c11493a) {
            C11493a<T>[] c11493aArr;
            C11493a[] c11493aArr2;
            do {
                c11493aArr = this.f25876d.get();
                int length = c11493aArr.length;
                if (length == 0) {
                    return;
                }
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (c11493aArr[i2].equals(c11493a)) {
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
                    c11493aArr2 = f25873w;
                } else {
                    C11493a[] c11493aArr3 = new C11493a[length - 1];
                    System.arraycopy(c11493aArr, 0, c11493aArr3, 0, i);
                    System.arraycopy(c11493aArr, i + 1, c11493aArr3, i, (length - i) - 1);
                    c11493aArr2 = c11493aArr3;
                }
            } while (!this.f25876d.compareAndSet(c11493aArr, c11493aArr2));
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            for (C11493a<T> c11493a : this.f25876d.get()) {
                c11493a.f25872c.mo331f(t);
            }
        }

        /* renamed from: i */
        public void m10937i() {
            if (this.f25876d.getAndSet(f25874x) != f25874x) {
                this.f25875c.compareAndSet(this, null);
                EnumC11296c.m11156a(this.f25878f);
            }
        }

        /* renamed from: j */
        public boolean m10936j() {
            return this.f25876d.get() == f25874x;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ObservablePublish.java */
    /* renamed from: j.e.f0.e.e.c0$c */
    /* loaded from: classes3.dex */
    public static final class C11495c<T> implements InterfaceC11692s<T> {

        /* renamed from: c */
        private final AtomicReference<C11494b<T>> f25879c;

        C11495c(AtomicReference<C11494b<T>> atomicReference) {
            this.f25879c = atomicReference;
        }

        @Override // p425j.p444e.InterfaceC11692s
        /* renamed from: e */
        public void mo10478e(InterfaceC11695u<? super T> interfaceC11695u) {
            C11493a c11493a = new C11493a(interfaceC11695u);
            interfaceC11695u.mo332d(c11493a);
            while (true) {
                C11494b<T> c11494b = this.f25879c.get();
                if (c11494b == null || c11494b.m10936j()) {
                    C11494b<T> c11494b2 = new C11494b<>(this.f25879c);
                    if (this.f25879c.compareAndSet(c11494b, c11494b2)) {
                        c11494b = c11494b2;
                    } else {
                        continue;
                    }
                }
                if (c11494b.m10939c(c11493a)) {
                    c11493a.m10942a(c11494b);
                    return;
                }
            }
        }
    }

    private C11492c0(InterfaceC11692s<T> interfaceC11692s, InterfaceC11692s<T> interfaceC11692s2, AtomicReference<C11494b<T>> atomicReference) {
        this.f25871e = interfaceC11692s;
        this.f25869c = interfaceC11692s2;
        this.f25870d = atomicReference;
    }

    /* renamed from: v0 */
    public static <T> AbstractC11671a<T> m10943v0(InterfaceC11692s<T> interfaceC11692s) {
        AtomicReference atomicReference = new AtomicReference();
        return a.p(new C11492c0(new C11495c(atomicReference), interfaceC11692s, atomicReference));
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        this.f25871e.mo10478e(interfaceC11695u);
    }

    @Override // p425j.p444e.p468g0.AbstractC11671a
    /* renamed from: t0 */
    public void mo10620t0(e<? super c> eVar) {
        C11494b<T> c11494b;
        while (true) {
            c11494b = this.f25870d.get();
            if (c11494b != null && !c11494b.m10936j()) {
                break;
            }
            C11494b<T> c11494b2 = new C11494b<>(this.f25870d);
            if (this.f25870d.compareAndSet(c11494b, c11494b2)) {
                c11494b = c11494b2;
                break;
            }
        }
        boolean z = true;
        z = (c11494b.f25877e.get() || !c11494b.f25877e.compareAndSet(false, true)) ? false : false;
        try {
            eVar.accept(c11494b);
            if (z) {
                this.f25869c.mo10478e(c11494b);
            }
        } catch (Throwable th) {
            C11118a.m11646b(th);
            throw C11661h.m10646d(th);
        }
    }
}
