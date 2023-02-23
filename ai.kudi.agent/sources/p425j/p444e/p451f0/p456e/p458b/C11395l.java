package p425j.p444e.p451f0.p456e.p458b;

import p425j.p444e.AbstractC11293f;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p454c.InterfaceC11313a;
import p425j.p444e.p451f0.p466i.AbstractC11647b;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p425j.p444e.p451f0.p467j.C11657d;
import p577n.p586b.InterfaceC14456b;
/* compiled from: FlowableFromArray.java */
/* renamed from: j.e.f0.e.b.l */
/* loaded from: classes3.dex */
public final class C11395l<T> extends AbstractC11293f<T> {

    /* renamed from: d */
    final T[] f25643d;

    /* compiled from: FlowableFromArray.java */
    /* renamed from: j.e.f0.e.b.l$a */
    /* loaded from: classes3.dex */
    static final class C11396a<T> extends AbstractC11398c<T> {

        /* renamed from: f */
        final InterfaceC11313a<? super T> f25644f;

        C11396a(InterfaceC11313a<? super T> interfaceC11313a, T[] tArr) {
            super(tArr);
            this.f25644f = interfaceC11313a;
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11395l.AbstractC11398c
        /* renamed from: a */
        void mo11030a() {
            T[] tArr = this.f25646c;
            int length = tArr.length;
            InterfaceC11313a<? super T> interfaceC11313a = this.f25644f;
            for (int i = this.f25647d; i != length; i++) {
                if (this.f25648e) {
                    return;
                }
                T t = tArr[i];
                if (t == null) {
                    interfaceC11313a.mo1689b(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                interfaceC11313a.mo11024h(t);
            }
            if (this.f25648e) {
                return;
            }
            interfaceC11313a.mo1690a();
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11395l.AbstractC11398c
        /* renamed from: b */
        void mo11029b(long j) {
            T[] tArr = this.f25646c;
            int length = tArr.length;
            int i = this.f25647d;
            InterfaceC11313a<? super T> interfaceC11313a = this.f25644f;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i == length) {
                            if (this.f25648e) {
                                return;
                            }
                            interfaceC11313a.mo1690a();
                            return;
                        }
                        j = get();
                        if (j2 == j) {
                            this.f25647d = i;
                            j = addAndGet(-j2);
                        }
                    } else if (this.f25648e) {
                        return;
                    } else {
                        T t = tArr[i];
                        if (t == null) {
                            interfaceC11313a.mo1689b(new NullPointerException("The element at index " + i + " is null"));
                            return;
                        }
                        if (interfaceC11313a.mo11024h(t)) {
                            j2++;
                        }
                        i++;
                    }
                }
            } while (j != 0);
        }
    }

    /* compiled from: FlowableFromArray.java */
    /* renamed from: j.e.f0.e.b.l$b */
    /* loaded from: classes3.dex */
    static final class C11397b<T> extends AbstractC11398c<T> {

        /* renamed from: f */
        final InterfaceC14456b<? super T> f25645f;

        C11397b(InterfaceC14456b<? super T> interfaceC14456b, T[] tArr) {
            super(tArr);
            this.f25645f = interfaceC14456b;
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11395l.AbstractC11398c
        /* renamed from: a */
        void mo11030a() {
            T[] tArr = this.f25646c;
            int length = tArr.length;
            InterfaceC14456b<? super T> interfaceC14456b = this.f25645f;
            for (int i = this.f25647d; i != length; i++) {
                if (this.f25648e) {
                    return;
                }
                T t = tArr[i];
                if (t == null) {
                    interfaceC14456b.mo1689b(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                interfaceC14456b.mo1688f(t);
            }
            if (this.f25648e) {
                return;
            }
            interfaceC14456b.mo1690a();
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11395l.AbstractC11398c
        /* renamed from: b */
        void mo11029b(long j) {
            T[] tArr = this.f25646c;
            int length = tArr.length;
            int i = this.f25647d;
            InterfaceC14456b<? super T> interfaceC14456b = this.f25645f;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i == length) {
                            if (this.f25648e) {
                                return;
                            }
                            interfaceC14456b.mo1690a();
                            return;
                        }
                        j = get();
                        if (j2 == j) {
                            this.f25647d = i;
                            j = addAndGet(-j2);
                        }
                    } else if (this.f25648e) {
                        return;
                    } else {
                        T t = tArr[i];
                        if (t == null) {
                            interfaceC14456b.mo1689b(new NullPointerException("The element at index " + i + " is null"));
                            return;
                        }
                        interfaceC14456b.mo1688f(t);
                        j2++;
                        i++;
                    }
                }
            } while (j != 0);
        }
    }

    /* compiled from: FlowableFromArray.java */
    /* renamed from: j.e.f0.e.b.l$c */
    /* loaded from: classes3.dex */
    static abstract class AbstractC11398c<T> extends AbstractC11647b<T> {

        /* renamed from: c */
        final T[] f25646c;

        /* renamed from: d */
        int f25647d;

        /* renamed from: e */
        volatile boolean f25648e;

        AbstractC11398c(T[] tArr) {
            this.f25646c = tArr;
        }

        /* renamed from: a */
        abstract void mo11030a();

        /* renamed from: b */
        abstract void mo11029b(long j);

        @Override // p577n.p586b.InterfaceC14457c
        public final void cancel() {
            this.f25648e = true;
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public final void clear() {
            this.f25647d = this.f25646c.length;
        }

        @Override // p577n.p586b.InterfaceC14457c
        /* renamed from: e */
        public final void mo1686e(long j) {
            if (EnumC11652g.m10669m(j) && C11657d.m10657a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo11030a();
                } else {
                    mo11029b(j);
                }
            }
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public final boolean isEmpty() {
            return this.f25647d == this.f25646c.length;
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11318f
        /* renamed from: m */
        public final int mo10681m(int i) {
            return i & 1;
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public final T poll() {
            int i = this.f25647d;
            T[] tArr = this.f25646c;
            if (i == tArr.length) {
                return null;
            }
            this.f25647d = i + 1;
            T t = tArr[i];
            C11312b.m11113d(t, "array element is null");
            return t;
        }
    }

    public C11395l(T[] tArr) {
        this.f25643d = tArr;
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    public void mo10791L(InterfaceC14456b<? super T> interfaceC14456b) {
        if (interfaceC14456b instanceof InterfaceC11313a) {
            interfaceC14456b.mo1687g(new C11396a((InterfaceC11313a) interfaceC14456b, this.f25643d));
        } else {
            interfaceC14456b.mo1687g(new C11397b(interfaceC14456b, this.f25643d));
        }
    }
}
