package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import java.util.Iterator;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p452a.EnumC11297d;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p455d.AbstractC11325c;
/* compiled from: ObservableFromIterable.java */
/* renamed from: j.e.f0.e.e.t */
/* loaded from: classes3.dex */
public final class C11568t<T> extends AbstractC11688p<T> {

    /* renamed from: c */
    final Iterable<? extends T> f26126c;

    /* compiled from: ObservableFromIterable.java */
    /* renamed from: j.e.f0.e.e.t$a */
    /* loaded from: classes3.dex */
    static final class C11569a<T> extends AbstractC11325c<T> {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f26127c;

        /* renamed from: d */
        final Iterator<? extends T> f26128d;

        /* renamed from: e */
        volatile boolean f26129e;

        /* renamed from: f */
        boolean f26130f;

        /* renamed from: w */
        boolean f26131w;

        /* renamed from: x */
        boolean f26132x;

        C11569a(InterfaceC11695u<? super T> interfaceC11695u, Iterator<? extends T> it) {
            this.f26127c = interfaceC11695u;
            this.f26128d = it;
        }

        /* renamed from: a */
        void m10813a() {
            while (!m10811j()) {
                try {
                    T next = this.f26128d.next();
                    C11312b.m11113d(next, "The iterator returned a null value");
                    this.f26127c.mo331f(next);
                    if (m10811j()) {
                        return;
                    }
                    try {
                        if (!this.f26128d.hasNext()) {
                            if (m10811j()) {
                                return;
                            }
                            this.f26127c.mo335a();
                            return;
                        }
                    } catch (Throwable th) {
                        C11118a.m11646b(th);
                        this.f26127c.mo334b(th);
                        return;
                    }
                } catch (Throwable th2) {
                    C11118a.m11646b(th2);
                    this.f26127c.mo334b(th2);
                    return;
                }
            }
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public void clear() {
            this.f26131w = true;
        }

        /* renamed from: i */
        public void m10812i() {
            this.f26129e = true;
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public boolean isEmpty() {
            return this.f26131w;
        }

        /* renamed from: j */
        public boolean m10811j() {
            return this.f26129e;
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11318f
        /* renamed from: m */
        public int mo10681m(int i) {
            if ((i & 1) != 0) {
                this.f26130f = true;
                return 1;
            }
            return 0;
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public T poll() {
            if (this.f26131w) {
                return null;
            }
            if (this.f26132x) {
                if (!this.f26128d.hasNext()) {
                    this.f26131w = true;
                    return null;
                }
            } else {
                this.f26132x = true;
            }
            T next = this.f26128d.next();
            C11312b.m11113d(next, "The iterator returned a null value");
            return next;
        }
    }

    public C11568t(Iterable<? extends T> iterable) {
        this.f26126c = iterable;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        try {
            Iterator<? extends T> it = this.f26126c.iterator();
            try {
                if (!it.hasNext()) {
                    EnumC11297d.m11144e(interfaceC11695u);
                    return;
                }
                C11569a c11569a = new C11569a(interfaceC11695u, it);
                interfaceC11695u.mo332d(c11569a);
                if (c11569a.f26130f) {
                    return;
                }
                c11569a.m10813a();
            } catch (Throwable th) {
                C11118a.m11646b(th);
                EnumC11297d.m11139n(th, interfaceC11695u);
            }
        } catch (Throwable th2) {
            C11118a.m11646b(th2);
            EnumC11297d.m11139n(th2, interfaceC11695u);
        }
    }
}
