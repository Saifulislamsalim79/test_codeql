package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.i0.a;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p450e0.InterfaceC11287a;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p454c.InterfaceC11317e;
import p425j.p444e.p451f0.p455d.AbstractC11324b;
/* compiled from: ObservableDoFinally.java */
/* renamed from: j.e.f0.e.e.j */
/* loaded from: classes3.dex */
public final class C11524j<T> extends AbstractC11483a<T, T> {

    /* renamed from: d */
    final InterfaceC11287a f25984d;

    /* compiled from: ObservableDoFinally.java */
    /* renamed from: j.e.f0.e.e.j$a */
    /* loaded from: classes3.dex */
    static final class C11525a<T> extends AbstractC11324b<T> implements InterfaceC11695u<T> {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f25985c;

        /* renamed from: d */
        final InterfaceC11287a f25986d;

        /* renamed from: e */
        c f25987e;

        /* renamed from: f */
        InterfaceC11317e<T> f25988f;

        /* renamed from: w */
        boolean f25989w;

        C11525a(InterfaceC11695u<? super T> interfaceC11695u, InterfaceC11287a interfaceC11287a) {
            this.f25985c = interfaceC11695u;
            this.f25986d = interfaceC11287a;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            this.f25985c.mo335a();
            m10885e();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            this.f25985c.mo334b(th);
            m10885e();
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public void clear() {
            this.f25988f.clear();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            if (EnumC11296c.m11147p(this.f25987e, cVar)) {
                this.f25987e = cVar;
                if (cVar instanceof InterfaceC11317e) {
                    this.f25988f = (InterfaceC11317e) cVar;
                }
                this.f25985c.mo332d(this);
            }
        }

        /* renamed from: e */
        void m10885e() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f25986d.run();
                } catch (Throwable th) {
                    C11118a.m11646b(th);
                    a.r(th);
                }
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            this.f25985c.mo331f(t);
        }

        /* renamed from: i */
        public void m10884i() {
            this.f25987e.i();
            m10885e();
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public boolean isEmpty() {
            return this.f25988f.isEmpty();
        }

        /* renamed from: j */
        public boolean m10883j() {
            return this.f25987e.j();
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11318f
        /* renamed from: m */
        public int mo10681m(int i) {
            InterfaceC11317e<T> interfaceC11317e = this.f25988f;
            if (interfaceC11317e == null || (i & 4) != 0) {
                return 0;
            }
            int mo10681m = interfaceC11317e.mo10681m(i);
            if (mo10681m != 0) {
                this.f25989w = mo10681m == 1;
            }
            return mo10681m;
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public T poll() throws Exception {
            T poll = this.f25988f.poll();
            if (poll == null && this.f25989w) {
                m10885e();
            }
            return poll;
        }
    }

    public C11524j(InterfaceC11692s<T> interfaceC11692s, InterfaceC11287a interfaceC11287a) {
        super(interfaceC11692s);
        this.f25984d = interfaceC11287a;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        this.f25839c.mo10478e(new C11525a(interfaceC11695u, this.f25984d));
    }
}
