package p425j.p444e.p451f0.p456e.p458b;

import io.reactivex.exceptions.C11118a;
import j.e.i0.a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.InterfaceC11676j;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p454c.InterfaceC11319g;
import p425j.p444e.p451f0.p454c.InterfaceC11322j;
import p425j.p444e.p451f0.p463f.C11607b;
import p425j.p444e.p451f0.p466i.C11651f;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p425j.p444e.p451f0.p467j.C11656c;
import p425j.p444e.p451f0.p467j.EnumC11660g;
import p577n.p586b.InterfaceC14455a;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: FlowableConcatMap.java */
/* renamed from: j.e.f0.e.b.b */
/* loaded from: classes3.dex */
public final class C11354b<T, R> extends AbstractC11351a<T, R> {

    /* renamed from: e */
    final InterfaceC11291f<? super T, ? extends InterfaceC14455a<? extends R>> f25502e;

    /* renamed from: f */
    final int f25503f;

    /* renamed from: w */
    final EnumC11660g f25504w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableConcatMap.java */
    /* renamed from: j.e.f0.e.b.b$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C11355a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25505a;

        static {
            int[] iArr = new int[EnumC11660g.values().length];
            f25505a = iArr;
            try {
                iArr[EnumC11660g.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25505a[EnumC11660g.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableConcatMap.java */
    /* renamed from: j.e.f0.e.b.b$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC11356b<T, R> extends AtomicInteger implements InterfaceC11676j<T>, InterfaceC11360f<R>, InterfaceC14457c {

        /* renamed from: A */
        volatile boolean f25506A;

        /* renamed from: C */
        volatile boolean f25508C;

        /* renamed from: D */
        int f25509D;

        /* renamed from: d */
        final InterfaceC11291f<? super T, ? extends InterfaceC14455a<? extends R>> f25511d;

        /* renamed from: e */
        final int f25512e;

        /* renamed from: f */
        final int f25513f;

        /* renamed from: w */
        InterfaceC14457c f25514w;

        /* renamed from: x */
        int f25515x;

        /* renamed from: y */
        InterfaceC11322j<T> f25516y;

        /* renamed from: z */
        volatile boolean f25517z;

        /* renamed from: c */
        final C11359e<R> f25510c = new C11359e<>(this);

        /* renamed from: B */
        final C11656c f25507B = new C11656c();

        AbstractC11356b(InterfaceC11291f<? super T, ? extends InterfaceC14455a<? extends R>> interfaceC11291f, int i) {
            this.f25511d = interfaceC11291f;
            this.f25512e = i;
            this.f25513f = i - (i >> 2);
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: a */
        public final void mo1690a() {
            this.f25517z = true;
            mo11077j();
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11354b.InterfaceC11360f
        /* renamed from: d */
        public final void mo11074d() {
            this.f25508C = false;
            mo11077j();
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: f */
        public final void mo1688f(T t) {
            if (this.f25509D != 2 && !this.f25516y.offer(t)) {
                this.f25514w.cancel();
                mo1689b(new IllegalStateException("Queue full?!"));
                return;
            }
            mo11077j();
        }

        @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
        /* renamed from: g */
        public final void mo1687g(InterfaceC14457c interfaceC14457c) {
            if (EnumC11652g.m10668n(this.f25514w, interfaceC14457c)) {
                this.f25514w = interfaceC14457c;
                if (interfaceC14457c instanceof InterfaceC11319g) {
                    InterfaceC11319g interfaceC11319g = (InterfaceC11319g) interfaceC14457c;
                    int mo10681m = interfaceC11319g.mo10681m(7);
                    if (mo10681m == 1) {
                        this.f25509D = mo10681m;
                        this.f25516y = interfaceC11319g;
                        this.f25517z = true;
                        mo11076k();
                        mo11077j();
                        return;
                    } else if (mo10681m == 2) {
                        this.f25509D = mo10681m;
                        this.f25516y = interfaceC11319g;
                        mo11076k();
                        interfaceC14457c.mo1686e(this.f25512e);
                        return;
                    }
                }
                this.f25516y = new C11607b(this.f25512e);
                mo11076k();
                interfaceC14457c.mo1686e(this.f25512e);
            }
        }

        /* renamed from: j */
        abstract void mo11077j();

        /* renamed from: k */
        abstract void mo11076k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableConcatMap.java */
    /* renamed from: j.e.f0.e.b.b$c */
    /* loaded from: classes3.dex */
    public static final class C11357c<T, R> extends AbstractC11356b<T, R> {

        /* renamed from: E */
        final InterfaceC14456b<? super R> f25518E;

        /* renamed from: F */
        final boolean f25519F;

        C11357c(InterfaceC14456b<? super R> interfaceC14456b, InterfaceC11291f<? super T, ? extends InterfaceC14455a<? extends R>> interfaceC11291f, int i, boolean z) {
            super(interfaceC11291f, i);
            this.f25518E = interfaceC14456b;
            this.f25519F = z;
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: b */
        public void mo1689b(Throwable th) {
            if (this.f25507B.m10659a(th)) {
                this.f25517z = true;
                mo11077j();
                return;
            }
            a.r(th);
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11354b.InterfaceC11360f
        /* renamed from: c */
        public void mo11075c(R r) {
            this.f25518E.mo1688f(r);
        }

        @Override // p577n.p586b.InterfaceC14457c
        public void cancel() {
            if (this.f25506A) {
                return;
            }
            this.f25506A = true;
            this.f25510c.cancel();
            this.f25514w.cancel();
        }

        @Override // p577n.p586b.InterfaceC14457c
        /* renamed from: e */
        public void mo1686e(long j) {
            this.f25510c.mo1686e(j);
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11354b.InterfaceC11360f
        /* renamed from: i */
        public void mo11073i(Throwable th) {
            if (this.f25507B.m10659a(th)) {
                if (!this.f25519F) {
                    this.f25514w.cancel();
                    this.f25517z = true;
                }
                this.f25508C = false;
                mo11077j();
                return;
            }
            a.r(th);
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11354b.AbstractC11356b
        /* renamed from: j */
        void mo11077j() {
            if (getAndIncrement() == 0) {
                while (!this.f25506A) {
                    if (!this.f25508C) {
                        boolean z = this.f25517z;
                        if (z && !this.f25519F && this.f25507B.get() != null) {
                            this.f25518E.mo1689b(this.f25507B.m10658b());
                            return;
                        }
                        try {
                            T poll = this.f25516y.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                Throwable m10658b = this.f25507B.m10658b();
                                if (m10658b != null) {
                                    this.f25518E.mo1689b(m10658b);
                                    return;
                                } else {
                                    this.f25518E.mo1690a();
                                    return;
                                }
                            } else if (!z2) {
                                try {
                                    InterfaceC14455a<? extends R> mo10663a = this.f25511d.mo10663a(poll);
                                    C11312b.m11113d(mo10663a, "The mapper returned a null Publisher");
                                    InterfaceC14455a<? extends R> interfaceC14455a = mo10663a;
                                    if (this.f25509D != 1) {
                                        int i = this.f25515x + 1;
                                        if (i == this.f25513f) {
                                            this.f25515x = 0;
                                            this.f25514w.mo1686e(i);
                                        } else {
                                            this.f25515x = i;
                                        }
                                    }
                                    if (interfaceC14455a instanceof Callable) {
                                        try {
                                            Object call = ((Callable) interfaceC14455a).call();
                                            if (call == null) {
                                                continue;
                                            } else if (this.f25510c.m10678i()) {
                                                this.f25518E.mo1688f(call);
                                            } else {
                                                this.f25508C = true;
                                                C11359e<R> c11359e = this.f25510c;
                                                c11359e.m10676k(new C11361g(call, c11359e));
                                            }
                                        } catch (Throwable th) {
                                            C11118a.m11646b(th);
                                            this.f25514w.cancel();
                                            this.f25507B.m10659a(th);
                                            this.f25518E.mo1689b(this.f25507B.m10658b());
                                            return;
                                        }
                                    } else {
                                        this.f25508C = true;
                                        interfaceC14455a.mo1691a(this.f25510c);
                                    }
                                } catch (Throwable th2) {
                                    C11118a.m11646b(th2);
                                    this.f25514w.cancel();
                                    this.f25507B.m10659a(th2);
                                    this.f25518E.mo1689b(this.f25507B.m10658b());
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            C11118a.m11646b(th3);
                            this.f25514w.cancel();
                            this.f25507B.m10659a(th3);
                            this.f25518E.mo1689b(this.f25507B.m10658b());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11354b.AbstractC11356b
        /* renamed from: k */
        void mo11076k() {
            this.f25518E.mo1687g(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableConcatMap.java */
    /* renamed from: j.e.f0.e.b.b$d */
    /* loaded from: classes3.dex */
    public static final class C11358d<T, R> extends AbstractC11356b<T, R> {

        /* renamed from: E */
        final InterfaceC14456b<? super R> f25520E;

        /* renamed from: F */
        final AtomicInteger f25521F;

        C11358d(InterfaceC14456b<? super R> interfaceC14456b, InterfaceC11291f<? super T, ? extends InterfaceC14455a<? extends R>> interfaceC11291f, int i) {
            super(interfaceC11291f, i);
            this.f25520E = interfaceC14456b;
            this.f25521F = new AtomicInteger();
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: b */
        public void mo1689b(Throwable th) {
            if (this.f25507B.m10659a(th)) {
                this.f25510c.cancel();
                if (getAndIncrement() == 0) {
                    this.f25520E.mo1689b(this.f25507B.m10658b());
                    return;
                }
                return;
            }
            a.r(th);
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11354b.InterfaceC11360f
        /* renamed from: c */
        public void mo11075c(R r) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f25520E.mo1688f(r);
                if (compareAndSet(1, 0)) {
                    return;
                }
                this.f25520E.mo1689b(this.f25507B.m10658b());
            }
        }

        @Override // p577n.p586b.InterfaceC14457c
        public void cancel() {
            if (this.f25506A) {
                return;
            }
            this.f25506A = true;
            this.f25510c.cancel();
            this.f25514w.cancel();
        }

        @Override // p577n.p586b.InterfaceC14457c
        /* renamed from: e */
        public void mo1686e(long j) {
            this.f25510c.mo1686e(j);
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11354b.InterfaceC11360f
        /* renamed from: i */
        public void mo11073i(Throwable th) {
            if (this.f25507B.m10659a(th)) {
                this.f25514w.cancel();
                if (getAndIncrement() == 0) {
                    this.f25520E.mo1689b(this.f25507B.m10658b());
                    return;
                }
                return;
            }
            a.r(th);
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11354b.AbstractC11356b
        /* renamed from: j */
        void mo11077j() {
            if (this.f25521F.getAndIncrement() == 0) {
                while (!this.f25506A) {
                    if (!this.f25508C) {
                        boolean z = this.f25517z;
                        try {
                            T poll = this.f25516y.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.f25520E.mo1690a();
                                return;
                            } else if (!z2) {
                                try {
                                    InterfaceC14455a<? extends R> mo10663a = this.f25511d.mo10663a(poll);
                                    C11312b.m11113d(mo10663a, "The mapper returned a null Publisher");
                                    InterfaceC14455a<? extends R> interfaceC14455a = mo10663a;
                                    if (this.f25509D != 1) {
                                        int i = this.f25515x + 1;
                                        if (i == this.f25513f) {
                                            this.f25515x = 0;
                                            this.f25514w.mo1686e(i);
                                        } else {
                                            this.f25515x = i;
                                        }
                                    }
                                    if (interfaceC14455a instanceof Callable) {
                                        try {
                                            Object call = ((Callable) interfaceC14455a).call();
                                            if (call == null) {
                                                continue;
                                            } else if (this.f25510c.m10678i()) {
                                                if (get() == 0 && compareAndSet(0, 1)) {
                                                    this.f25520E.mo1688f(call);
                                                    if (!compareAndSet(1, 0)) {
                                                        this.f25520E.mo1689b(this.f25507B.m10658b());
                                                        return;
                                                    }
                                                }
                                            } else {
                                                this.f25508C = true;
                                                C11359e<R> c11359e = this.f25510c;
                                                c11359e.m10676k(new C11361g(call, c11359e));
                                            }
                                        } catch (Throwable th) {
                                            C11118a.m11646b(th);
                                            this.f25514w.cancel();
                                            this.f25507B.m10659a(th);
                                            this.f25520E.mo1689b(this.f25507B.m10658b());
                                            return;
                                        }
                                    } else {
                                        this.f25508C = true;
                                        interfaceC14455a.mo1691a(this.f25510c);
                                    }
                                } catch (Throwable th2) {
                                    C11118a.m11646b(th2);
                                    this.f25514w.cancel();
                                    this.f25507B.m10659a(th2);
                                    this.f25520E.mo1689b(this.f25507B.m10658b());
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            C11118a.m11646b(th3);
                            this.f25514w.cancel();
                            this.f25507B.m10659a(th3);
                            this.f25520E.mo1689b(this.f25507B.m10658b());
                            return;
                        }
                    }
                    if (this.f25521F.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11354b.AbstractC11356b
        /* renamed from: k */
        void mo11076k() {
            this.f25520E.mo1687g(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableConcatMap.java */
    /* renamed from: j.e.f0.e.b.b$e */
    /* loaded from: classes3.dex */
    public static final class C11359e<R> extends C11651f implements InterfaceC11676j<R> {

        /* renamed from: A */
        final InterfaceC11360f<R> f25522A;

        /* renamed from: B */
        long f25523B;

        C11359e(InterfaceC11360f<R> interfaceC11360f) {
            super(false);
            this.f25522A = interfaceC11360f;
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: a */
        public void mo1690a() {
            long j = this.f25523B;
            if (j != 0) {
                this.f25523B = 0L;
                m10677j(j);
            }
            this.f25522A.mo11074d();
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: b */
        public void mo1689b(Throwable th) {
            long j = this.f25523B;
            if (j != 0) {
                this.f25523B = 0L;
                m10677j(j);
            }
            this.f25522A.mo11073i(th);
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: f */
        public void mo1688f(R r) {
            this.f25523B++;
            this.f25522A.mo11075c(r);
        }

        @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
        /* renamed from: g */
        public void mo1687g(InterfaceC14457c interfaceC14457c) {
            m10676k(interfaceC14457c);
        }
    }

    /* compiled from: FlowableConcatMap.java */
    /* renamed from: j.e.f0.e.b.b$f */
    /* loaded from: classes3.dex */
    interface InterfaceC11360f<T> {
        /* renamed from: c */
        void mo11075c(T t);

        /* renamed from: d */
        void mo11074d();

        /* renamed from: i */
        void mo11073i(Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableConcatMap.java */
    /* renamed from: j.e.f0.e.b.b$g */
    /* loaded from: classes3.dex */
    public static final class C11361g<T> implements InterfaceC14457c {

        /* renamed from: c */
        final InterfaceC14456b<? super T> f25524c;

        /* renamed from: d */
        final T f25525d;

        /* renamed from: e */
        boolean f25526e;

        C11361g(T t, InterfaceC14456b<? super T> interfaceC14456b) {
            this.f25525d = t;
            this.f25524c = interfaceC14456b;
        }

        @Override // p577n.p586b.InterfaceC14457c
        public void cancel() {
        }

        @Override // p577n.p586b.InterfaceC14457c
        /* renamed from: e */
        public void mo1686e(long j) {
            if (j <= 0 || this.f25526e) {
                return;
            }
            this.f25526e = true;
            InterfaceC14456b<? super T> interfaceC14456b = this.f25524c;
            interfaceC14456b.mo1688f((T) this.f25525d);
            interfaceC14456b.mo1690a();
        }
    }

    public C11354b(AbstractC11293f<T> abstractC11293f, InterfaceC11291f<? super T, ? extends InterfaceC14455a<? extends R>> interfaceC11291f, int i, EnumC11660g enumC11660g) {
        super(abstractC11293f);
        this.f25502e = interfaceC11291f;
        this.f25503f = i;
        this.f25504w = enumC11660g;
    }

    /* renamed from: Q */
    public static <T, R> InterfaceC14456b<T> m11078Q(InterfaceC14456b<? super R> interfaceC14456b, InterfaceC11291f<? super T, ? extends InterfaceC14455a<? extends R>> interfaceC11291f, int i, EnumC11660g enumC11660g) {
        int i2 = C11355a.f25505a[enumC11660g.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return new C11358d(interfaceC14456b, interfaceC11291f, i);
            }
            return new C11357c(interfaceC14456b, interfaceC11291f, i, true);
        }
        return new C11357c(interfaceC14456b, interfaceC11291f, i, false);
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    protected void mo10791L(InterfaceC14456b<? super R> interfaceC14456b) {
        if (C11427y.m11005b(this.f25499d, interfaceC14456b, this.f25502e)) {
            return;
        }
        this.f25499d.mo1691a(m11078Q(interfaceC14456b, this.f25502e, this.f25503f, this.f25504w));
    }
}
