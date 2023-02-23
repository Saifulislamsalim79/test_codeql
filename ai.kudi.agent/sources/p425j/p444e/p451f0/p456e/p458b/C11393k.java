package p425j.p444e.p451f0.p456e.p458b;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.MissingBackpressureException;
import j.e.i0.a;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.InterfaceC11676j;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p454c.InterfaceC11319g;
import p425j.p444e.p451f0.p454c.InterfaceC11322j;
import p425j.p444e.p451f0.p463f.C11607b;
import p425j.p444e.p451f0.p466i.AbstractC11646a;
import p425j.p444e.p451f0.p466i.EnumC11649d;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p425j.p444e.p451f0.p467j.C11657d;
import p425j.p444e.p451f0.p467j.C11661h;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: FlowableFlattenIterable.java */
/* renamed from: j.e.f0.e.b.k */
/* loaded from: classes3.dex */
public final class C11393k<T, R> extends AbstractC11351a<T, R> {

    /* renamed from: e */
    final InterfaceC11291f<? super T, ? extends Iterable<? extends R>> f25628e;

    /* renamed from: f */
    final int f25629f;

    /* compiled from: FlowableFlattenIterable.java */
    /* renamed from: j.e.f0.e.b.k$a */
    /* loaded from: classes3.dex */
    static final class C11394a<T, R> extends AbstractC11646a<R> implements InterfaceC11676j<T> {

        /* renamed from: A */
        volatile boolean f25630A;

        /* renamed from: C */
        Iterator<? extends R> f25632C;

        /* renamed from: D */
        int f25633D;

        /* renamed from: E */
        int f25634E;

        /* renamed from: c */
        final InterfaceC14456b<? super R> f25635c;

        /* renamed from: d */
        final InterfaceC11291f<? super T, ? extends Iterable<? extends R>> f25636d;

        /* renamed from: e */
        final int f25637e;

        /* renamed from: f */
        final int f25638f;

        /* renamed from: x */
        InterfaceC14457c f25640x;

        /* renamed from: y */
        InterfaceC11322j<T> f25641y;

        /* renamed from: z */
        volatile boolean f25642z;

        /* renamed from: B */
        final AtomicReference<Throwable> f25631B = new AtomicReference<>();

        /* renamed from: w */
        final AtomicLong f25639w = new AtomicLong();

        C11394a(InterfaceC14456b<? super R> interfaceC14456b, InterfaceC11291f<? super T, ? extends Iterable<? extends R>> interfaceC11291f, int i) {
            this.f25635c = interfaceC14456b;
            this.f25636d = interfaceC11291f;
            this.f25637e = i;
            this.f25638f = i - (i >> 2);
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: a */
        public void mo1690a() {
            if (this.f25642z) {
                return;
            }
            this.f25642z = true;
            m11031k();
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: b */
        public void mo1689b(Throwable th) {
            if (!this.f25642z && C11661h.m10649a(this.f25631B, th)) {
                this.f25642z = true;
                m11031k();
                return;
            }
            a.r(th);
        }

        @Override // p577n.p586b.InterfaceC14457c
        public void cancel() {
            if (this.f25630A) {
                return;
            }
            this.f25630A = true;
            this.f25640x.cancel();
            if (getAndIncrement() == 0) {
                this.f25641y.clear();
            }
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public void clear() {
            this.f25632C = null;
            this.f25641y.clear();
        }

        @Override // p577n.p586b.InterfaceC14457c
        /* renamed from: e */
        public void mo1686e(long j) {
            if (EnumC11652g.m10669m(j)) {
                C11657d.m10657a(this.f25639w, j);
                m11031k();
            }
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: f */
        public void mo1688f(T t) {
            if (this.f25642z) {
                return;
            }
            if (this.f25634E == 0 && !this.f25641y.offer(t)) {
                mo1689b(new MissingBackpressureException("Queue is full?!"));
            } else {
                m11031k();
            }
        }

        @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
        /* renamed from: g */
        public void mo1687g(InterfaceC14457c interfaceC14457c) {
            if (EnumC11652g.m10668n(this.f25640x, interfaceC14457c)) {
                this.f25640x = interfaceC14457c;
                if (interfaceC14457c instanceof InterfaceC11319g) {
                    InterfaceC11319g interfaceC11319g = (InterfaceC11319g) interfaceC14457c;
                    int mo10681m = interfaceC11319g.mo10681m(3);
                    if (mo10681m == 1) {
                        this.f25634E = mo10681m;
                        this.f25641y = interfaceC11319g;
                        this.f25642z = true;
                        this.f25635c.mo1687g(this);
                        return;
                    } else if (mo10681m == 2) {
                        this.f25634E = mo10681m;
                        this.f25641y = interfaceC11319g;
                        this.f25635c.mo1687g(this);
                        interfaceC14457c.mo1686e(this.f25637e);
                        return;
                    }
                }
                this.f25641y = new C11607b(this.f25637e);
                this.f25635c.mo1687g(this);
                interfaceC14457c.mo1686e(this.f25637e);
            }
        }

        /* renamed from: i */
        boolean m11033i(boolean z, boolean z2, InterfaceC14456b<?> interfaceC14456b, InterfaceC11322j<?> interfaceC11322j) {
            if (this.f25630A) {
                this.f25632C = null;
                interfaceC11322j.clear();
                return true;
            } else if (z) {
                if (this.f25631B.get() == null) {
                    if (z2) {
                        interfaceC14456b.mo1690a();
                        return true;
                    }
                    return false;
                }
                Throwable m10648b = C11661h.m10648b(this.f25631B);
                this.f25632C = null;
                interfaceC11322j.clear();
                interfaceC14456b.mo1689b(m10648b);
                return true;
            } else {
                return false;
            }
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public boolean isEmpty() {
            return this.f25632C == null && this.f25641y.isEmpty();
        }

        /* renamed from: j */
        void m11032j(boolean z) {
            if (z) {
                int i = this.f25633D + 1;
                if (i == this.f25638f) {
                    this.f25633D = 0;
                    this.f25640x.mo1686e(i);
                    return;
                }
                this.f25633D = i;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x00f7, code lost:
            if (r13 != r9) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00f9, code lost:
            r5 = r18.f25642z;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00ff, code lost:
            if (r3.isEmpty() == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0101, code lost:
            if (r6 != null) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0103, code lost:
            r15 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0105, code lost:
            r15 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x010a, code lost:
            if (m11033i(r5, r15, r2, r3) == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x010c, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x010f, code lost:
            if (r13 == 0) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0118, code lost:
            if (r9 == Long.MAX_VALUE) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x011a, code lost:
            r18.f25639w.addAndGet(-r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0120, code lost:
            if (r6 != null) goto L73;
         */
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void m11031k() {
            /*
                Method dump skipped, instructions count: 302
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p425j.p444e.p451f0.p456e.p458b.C11393k.C11394a.m11031k():void");
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11318f
        /* renamed from: m */
        public int mo10681m(int i) {
            return ((i & 1) == 0 || this.f25634E != 1) ? 0 : 1;
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f25632C;
            while (true) {
                if (it == null) {
                    T poll = this.f25641y.poll();
                    if (poll != null) {
                        it = this.f25636d.mo10663a(poll).iterator();
                        if (it.hasNext()) {
                            this.f25632C = it;
                            break;
                        }
                        it = null;
                    } else {
                        return null;
                    }
                } else {
                    break;
                }
            }
            R next = it.next();
            C11312b.m11113d(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f25632C = null;
            }
            return next;
        }
    }

    public C11393k(AbstractC11293f<T> abstractC11293f, InterfaceC11291f<? super T, ? extends Iterable<? extends R>> interfaceC11291f, int i) {
        super(abstractC11293f);
        this.f25628e = interfaceC11291f;
        this.f25629f = i;
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    public void mo10791L(InterfaceC14456b<? super R> interfaceC14456b) {
        AbstractC11293f<T> abstractC11293f = this.f25499d;
        if (abstractC11293f instanceof Callable) {
            try {
                Object call = ((Callable) abstractC11293f).call();
                if (call == null) {
                    EnumC11649d.m10683a(interfaceC14456b);
                    return;
                }
                try {
                    C11399m.m11028Q(interfaceC14456b, this.f25628e.mo10663a(call).iterator());
                    return;
                } catch (Throwable th) {
                    C11118a.m11646b(th);
                    EnumC11649d.m10682b(th, interfaceC14456b);
                    return;
                }
            } catch (Throwable th2) {
                C11118a.m11646b(th2);
                EnumC11649d.m10682b(th2, interfaceC14456b);
                return;
            }
        }
        abstractC11293f.m11188K(new C11394a(interfaceC14456b, this.f25628e, this.f25629f));
    }
}
