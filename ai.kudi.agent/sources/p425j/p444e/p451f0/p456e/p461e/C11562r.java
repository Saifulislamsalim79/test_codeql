package p425j.p444e.p451f0.p456e.p461e;

import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p455d.AbstractC11325c;
/* compiled from: ObservableFromArray.java */
/* renamed from: j.e.f0.e.e.r */
/* loaded from: classes3.dex */
public final class C11562r<T> extends AbstractC11688p<T> {

    /* renamed from: c */
    final T[] f26103c;

    /* compiled from: ObservableFromArray.java */
    /* renamed from: j.e.f0.e.e.r$a */
    /* loaded from: classes3.dex */
    static final class C11563a<T> extends AbstractC11325c<T> {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f26104c;

        /* renamed from: d */
        final T[] f26105d;

        /* renamed from: e */
        int f26106e;

        /* renamed from: f */
        boolean f26107f;

        /* renamed from: w */
        volatile boolean f26108w;

        C11563a(InterfaceC11695u<? super T> interfaceC11695u, T[] tArr) {
            this.f26104c = interfaceC11695u;
            this.f26105d = tArr;
        }

        /* renamed from: a */
        void m10825a() {
            T[] tArr = this.f26105d;
            int length = tArr.length;
            for (int i = 0; i < length && !m10823j(); i++) {
                T t = tArr[i];
                if (t == null) {
                    InterfaceC11695u<? super T> interfaceC11695u = this.f26104c;
                    interfaceC11695u.mo334b(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                this.f26104c.mo331f(t);
            }
            if (m10823j()) {
                return;
            }
            this.f26104c.mo335a();
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public void clear() {
            this.f26106e = this.f26105d.length;
        }

        /* renamed from: i */
        public void m10824i() {
            this.f26108w = true;
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public boolean isEmpty() {
            return this.f26106e == this.f26105d.length;
        }

        /* renamed from: j */
        public boolean m10823j() {
            return this.f26108w;
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11318f
        /* renamed from: m */
        public int mo10681m(int i) {
            if ((i & 1) != 0) {
                this.f26107f = true;
                return 1;
            }
            return 0;
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public T poll() {
            int i = this.f26106e;
            T[] tArr = this.f26105d;
            if (i != tArr.length) {
                this.f26106e = i + 1;
                T t = tArr[i];
                C11312b.m11113d(t, "The array element is null");
                return t;
            }
            return null;
        }
    }

    public C11562r(T[] tArr) {
        this.f26103c = tArr;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        C11563a c11563a = new C11563a(interfaceC11695u, this.f26103c);
        interfaceC11695u.mo332d(c11563a);
        if (c11563a.f26107f) {
            return;
        }
        c11563a.m10825a();
    }
}
