package p425j.p444e.p471k0;

import j.e.c0.c;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p453b.C11312b;
/* compiled from: PublishSubject.java */
/* renamed from: j.e.k0.b */
/* loaded from: classes3.dex */
public final class C11680b<T> extends AbstractC11683d<T> {

    /* renamed from: e */
    static final C11681a[] f26396e = new C11681a[0];

    /* renamed from: f */
    static final C11681a[] f26397f = new C11681a[0];

    /* renamed from: c */
    final AtomicReference<C11681a<T>[]> f26398c = new AtomicReference<>(f26397f);

    /* renamed from: d */
    Throwable f26399d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PublishSubject.java */
    /* renamed from: j.e.k0.b$a */
    /* loaded from: classes3.dex */
    public static final class C11681a<T> extends AtomicBoolean implements c {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f26400c;

        /* renamed from: d */
        final C11680b<T> f26401d;

        C11681a(InterfaceC11695u<? super T> interfaceC11695u, C11680b<T> c11680b) {
            this.f26400c = interfaceC11695u;
            this.f26401d = c11680b;
        }

        /* renamed from: a */
        public void m10562a() {
            if (get()) {
                return;
            }
            this.f26400c.mo335a();
        }

        /* renamed from: b */
        public void m10561b(Throwable th) {
            if (get()) {
                a.r(th);
            } else {
                this.f26400c.mo334b(th);
            }
        }

        /* renamed from: c */
        public void m10560c(T t) {
            if (get()) {
                return;
            }
            this.f26400c.mo331f(t);
        }

        /* renamed from: i */
        public void m10559i() {
            if (compareAndSet(false, true)) {
                this.f26401d.m10563w0(this);
            }
        }

        /* renamed from: j */
        public boolean m10558j() {
            return get();
        }
    }

    C11680b() {
    }

    /* renamed from: v0 */
    public static <T> C11680b<T> m10564v0() {
        return new C11680b<>();
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: a */
    public void mo335a() {
        C11681a<T>[] c11681aArr = this.f26398c.get();
        C11681a<T>[] c11681aArr2 = f26396e;
        if (c11681aArr == c11681aArr2) {
            return;
        }
        for (C11681a<T> c11681a : this.f26398c.getAndSet(c11681aArr2)) {
            c11681a.m10562a();
        }
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: b */
    public void mo334b(Throwable th) {
        C11312b.m11113d(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C11681a<T>[] c11681aArr = this.f26398c.get();
        C11681a<T>[] c11681aArr2 = f26396e;
        if (c11681aArr == c11681aArr2) {
            a.r(th);
            return;
        }
        this.f26399d = th;
        for (C11681a<T> c11681a : this.f26398c.getAndSet(c11681aArr2)) {
            c11681a.m10561b(th);
        }
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: d */
    public void mo332d(c cVar) {
        if (this.f26398c.get() == f26396e) {
            cVar.i();
        }
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: f */
    public void mo331f(T t) {
        C11312b.m11113d(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C11681a<T> c11681a : this.f26398c.get()) {
            c11681a.m10560c(t);
        }
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        C11681a<T> c11681a = new C11681a<>(interfaceC11695u, this);
        interfaceC11695u.mo332d(c11681a);
        if (m10565u0(c11681a)) {
            if (c11681a.m10558j()) {
                m10563w0(c11681a);
                return;
            }
            return;
        }
        Throwable th = this.f26399d;
        if (th != null) {
            interfaceC11695u.mo334b(th);
        } else {
            interfaceC11695u.mo335a();
        }
    }

    /* renamed from: u0 */
    boolean m10565u0(C11681a<T> c11681a) {
        C11681a<T>[] c11681aArr;
        C11681a<T>[] c11681aArr2;
        do {
            c11681aArr = this.f26398c.get();
            if (c11681aArr == f26396e) {
                return false;
            }
            int length = c11681aArr.length;
            c11681aArr2 = new C11681a[length + 1];
            System.arraycopy(c11681aArr, 0, c11681aArr2, 0, length);
            c11681aArr2[length] = c11681a;
        } while (!this.f26398c.compareAndSet(c11681aArr, c11681aArr2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w0 */
    void m10563w0(C11681a<T> c11681a) {
        C11681a<T>[] c11681aArr;
        C11681a[] c11681aArr2;
        do {
            c11681aArr = this.f26398c.get();
            if (c11681aArr == f26396e || c11681aArr == f26397f) {
                return;
            }
            int length = c11681aArr.length;
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (c11681aArr[i2] == c11681a) {
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
                c11681aArr2 = f26397f;
            } else {
                C11681a[] c11681aArr3 = new C11681a[length - 1];
                System.arraycopy(c11681aArr, 0, c11681aArr3, 0, i);
                System.arraycopy(c11681aArr, i + 1, c11681aArr3, i, (length - i) - 1);
                c11681aArr2 = c11681aArr3;
            }
        } while (!this.f26398c.compareAndSet(c11681aArr, c11681aArr2));
    }
}
