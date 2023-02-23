package p425j.p444e.p451f0.p456e.p458b;

import io.reactivex.exceptions.C11118a;
import java.util.Iterator;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p454c.InterfaceC11313a;
import p425j.p444e.p451f0.p466i.AbstractC11647b;
import p425j.p444e.p451f0.p466i.EnumC11649d;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p425j.p444e.p451f0.p467j.C11657d;
import p577n.p586b.InterfaceC14456b;
/* compiled from: FlowableFromIterable.java */
/* renamed from: j.e.f0.e.b.m */
/* loaded from: classes3.dex */
public final class C11399m<T> extends AbstractC11293f<T> {

    /* renamed from: d */
    final Iterable<? extends T> f25649d;

    /* compiled from: FlowableFromIterable.java */
    /* renamed from: j.e.f0.e.b.m$a */
    /* loaded from: classes3.dex */
    static abstract class AbstractC11400a<T> extends AbstractC11647b<T> {

        /* renamed from: c */
        Iterator<? extends T> f25650c;

        /* renamed from: d */
        volatile boolean f25651d;

        /* renamed from: e */
        boolean f25652e;

        AbstractC11400a(Iterator<? extends T> it) {
            this.f25650c = it;
        }

        /* renamed from: a */
        abstract void mo11027a();

        /* renamed from: b */
        abstract void mo11026b(long j);

        @Override // p577n.p586b.InterfaceC14457c
        public final void cancel() {
            this.f25651d = true;
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public final void clear() {
            this.f25650c = null;
        }

        @Override // p577n.p586b.InterfaceC14457c
        /* renamed from: e */
        public final void mo1686e(long j) {
            if (EnumC11652g.m10669m(j) && C11657d.m10657a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo11027a();
                } else {
                    mo11026b(j);
                }
            }
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.f25650c;
            return it == null || !it.hasNext();
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11318f
        /* renamed from: m */
        public final int mo10681m(int i) {
            return i & 1;
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public final T poll() {
            Iterator<? extends T> it = this.f25650c;
            if (it == null) {
                return null;
            }
            if (!this.f25652e) {
                this.f25652e = true;
            } else if (!it.hasNext()) {
                return null;
            }
            T next = this.f25650c.next();
            C11312b.m11113d(next, "Iterator.next() returned a null value");
            return next;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableFromIterable.java */
    /* renamed from: j.e.f0.e.b.m$b */
    /* loaded from: classes3.dex */
    public static final class C11401b<T> extends AbstractC11400a<T> {

        /* renamed from: f */
        final InterfaceC11313a<? super T> f25653f;

        C11401b(InterfaceC11313a<? super T> interfaceC11313a, Iterator<? extends T> it) {
            super(it);
            this.f25653f = interfaceC11313a;
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11399m.AbstractC11400a
        /* renamed from: a */
        void mo11027a() {
            Iterator<? extends T> it = this.f25650c;
            InterfaceC11313a<? super T> interfaceC11313a = this.f25653f;
            while (!this.f25651d) {
                try {
                    Object obj = (T) it.next();
                    if (this.f25651d) {
                        return;
                    }
                    if (obj == null) {
                        interfaceC11313a.mo1689b(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    interfaceC11313a.mo11024h(obj);
                    if (this.f25651d) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f25651d) {
                                return;
                            }
                            interfaceC11313a.mo1690a();
                            return;
                        }
                    } catch (Throwable th) {
                        C11118a.m11646b(th);
                        interfaceC11313a.mo1689b(th);
                        return;
                    }
                } catch (Throwable th2) {
                    C11118a.m11646b(th2);
                    interfaceC11313a.mo1689b(th2);
                    return;
                }
            }
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11399m.AbstractC11400a
        /* renamed from: b */
        void mo11026b(long j) {
            Iterator<? extends T> it = this.f25650c;
            InterfaceC11313a<? super T> interfaceC11313a = this.f25653f;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 != j) {
                        if (this.f25651d) {
                            return;
                        }
                        try {
                            Object obj = (T) it.next();
                            if (this.f25651d) {
                                return;
                            }
                            if (obj == null) {
                                interfaceC11313a.mo1689b(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean mo11024h = interfaceC11313a.mo11024h(obj);
                            if (this.f25651d) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f25651d) {
                                        return;
                                    }
                                    interfaceC11313a.mo1690a();
                                    return;
                                } else if (mo11024h) {
                                    j2++;
                                }
                            } catch (Throwable th) {
                                C11118a.m11646b(th);
                                interfaceC11313a.mo1689b(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            C11118a.m11646b(th2);
                            interfaceC11313a.mo1689b(th2);
                            return;
                        }
                    } else {
                        j = get();
                        if (j2 == j) {
                            j = addAndGet(-j2);
                        }
                    }
                }
            } while (j != 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableFromIterable.java */
    /* renamed from: j.e.f0.e.b.m$c */
    /* loaded from: classes3.dex */
    public static final class C11402c<T> extends AbstractC11400a<T> {

        /* renamed from: f */
        final InterfaceC14456b<? super T> f25654f;

        C11402c(InterfaceC14456b<? super T> interfaceC14456b, Iterator<? extends T> it) {
            super(it);
            this.f25654f = interfaceC14456b;
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11399m.AbstractC11400a
        /* renamed from: a */
        void mo11027a() {
            Iterator<? extends T> it = this.f25650c;
            InterfaceC14456b<? super T> interfaceC14456b = this.f25654f;
            while (!this.f25651d) {
                try {
                    Object obj = (T) it.next();
                    if (this.f25651d) {
                        return;
                    }
                    if (obj == null) {
                        interfaceC14456b.mo1689b(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    interfaceC14456b.mo1688f(obj);
                    if (this.f25651d) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f25651d) {
                                return;
                            }
                            interfaceC14456b.mo1690a();
                            return;
                        }
                    } catch (Throwable th) {
                        C11118a.m11646b(th);
                        interfaceC14456b.mo1689b(th);
                        return;
                    }
                } catch (Throwable th2) {
                    C11118a.m11646b(th2);
                    interfaceC14456b.mo1689b(th2);
                    return;
                }
            }
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11399m.AbstractC11400a
        /* renamed from: b */
        void mo11026b(long j) {
            Iterator<? extends T> it = this.f25650c;
            InterfaceC14456b<? super T> interfaceC14456b = this.f25654f;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 != j) {
                        if (this.f25651d) {
                            return;
                        }
                        try {
                            Object obj = (T) it.next();
                            if (this.f25651d) {
                                return;
                            }
                            if (obj == null) {
                                interfaceC14456b.mo1689b(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            interfaceC14456b.mo1688f(obj);
                            if (this.f25651d) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f25651d) {
                                        return;
                                    }
                                    interfaceC14456b.mo1690a();
                                    return;
                                }
                                j2++;
                            } catch (Throwable th) {
                                C11118a.m11646b(th);
                                interfaceC14456b.mo1689b(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            C11118a.m11646b(th2);
                            interfaceC14456b.mo1689b(th2);
                            return;
                        }
                    } else {
                        j = get();
                        if (j2 == j) {
                            j = addAndGet(-j2);
                        }
                    }
                }
            } while (j != 0);
        }
    }

    public C11399m(Iterable<? extends T> iterable) {
        this.f25649d = iterable;
    }

    /* renamed from: Q */
    public static <T> void m11028Q(InterfaceC14456b<? super T> interfaceC14456b, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                EnumC11649d.m10683a(interfaceC14456b);
            } else if (interfaceC14456b instanceof InterfaceC11313a) {
                interfaceC14456b.mo1687g(new C11401b((InterfaceC11313a) interfaceC14456b, it));
            } else {
                interfaceC14456b.mo1687g(new C11402c(interfaceC14456b, it));
            }
        } catch (Throwable th) {
            C11118a.m11646b(th);
            EnumC11649d.m10682b(th, interfaceC14456b);
        }
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    public void mo10791L(InterfaceC14456b<? super T> interfaceC14456b) {
        try {
            m11028Q(interfaceC14456b, this.f25649d.iterator());
        } catch (Throwable th) {
            C11118a.m11646b(th);
            EnumC11649d.m10682b(th, interfaceC14456b);
        }
    }
}
