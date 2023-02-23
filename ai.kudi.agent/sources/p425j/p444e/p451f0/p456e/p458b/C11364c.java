package p425j.p444e.p451f0.p456e.p458b;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.MissingBackpressureException;
import j.e.c0.c;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.EnumC11269a;
import p425j.p444e.InterfaceC11672h;
import p425j.p444e.InterfaceC11675i;
import p425j.p444e.p451f0.p452a.C11300g;
import p425j.p444e.p451f0.p463f.C11608c;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p425j.p444e.p451f0.p467j.C11657d;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: FlowableCreate.java */
/* renamed from: j.e.f0.e.b.c */
/* loaded from: classes3.dex */
public final class C11364c<T> extends AbstractC11293f<T> {

    /* renamed from: d */
    final InterfaceC11675i<T> f25532d;

    /* renamed from: e */
    final EnumC11269a f25533e;

    /* compiled from: FlowableCreate.java */
    /* renamed from: j.e.f0.e.b.c$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C11365a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25534a;

        static {
            int[] iArr = new int[EnumC11269a.values().length];
            f25534a = iArr;
            try {
                iArr[EnumC11269a.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25534a[EnumC11269a.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25534a[EnumC11269a.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25534a[EnumC11269a.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableCreate.java */
    /* renamed from: j.e.f0.e.b.c$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC11366b<T> extends AtomicLong implements InterfaceC11672h<T>, InterfaceC14457c {

        /* renamed from: c */
        final InterfaceC14456b<? super T> f25535c;

        /* renamed from: d */
        final C11300g f25536d = new C11300g();

        AbstractC11366b(InterfaceC14456b<? super T> interfaceC14456b) {
            this.f25535c = interfaceC14456b;
        }

        @Override // p425j.p444e.InterfaceC11286e
        /* renamed from: a */
        public void mo10905a() {
            m11070g();
        }

        /* renamed from: b */
        public boolean mo11066b(Throwable th) {
            return m11069h(th);
        }

        @Override // p425j.p444e.InterfaceC11672h
        /* renamed from: c */
        public final void mo10618c(c cVar) {
            this.f25536d.m11129b(cVar);
        }

        @Override // p577n.p586b.InterfaceC14457c
        public final void cancel() {
            this.f25536d.m11128i();
            mo11064k();
        }

        @Override // p577n.p586b.InterfaceC14457c
        /* renamed from: e */
        public final void mo1686e(long j) {
            if (EnumC11652g.m10669m(j)) {
                C11657d.m10657a(this, j);
                mo11065j();
            }
        }

        /* renamed from: g */
        protected void m11070g() {
            if (isCancelled()) {
                return;
            }
            try {
                this.f25535c.mo1690a();
            } finally {
                this.f25536d.m11128i();
            }
        }

        /* renamed from: h */
        protected boolean m11069h(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                return false;
            }
            try {
                this.f25535c.mo1689b(th);
                this.f25536d.m11128i();
                return true;
            } catch (Throwable th2) {
                this.f25536d.m11128i();
                throw th2;
            }
        }

        /* renamed from: i */
        public final void m11068i(Throwable th) {
            if (mo11066b(th)) {
                return;
            }
            a.r(th);
        }

        @Override // p425j.p444e.InterfaceC11672h
        public final boolean isCancelled() {
            return this.f25536d.m11127j();
        }

        /* renamed from: j */
        void mo11065j() {
        }

        /* renamed from: k */
        void mo11064k() {
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }

    /* compiled from: FlowableCreate.java */
    /* renamed from: j.e.f0.e.b.c$c */
    /* loaded from: classes3.dex */
    static final class C11367c<T> extends AbstractC11366b<T> {

        /* renamed from: e */
        final C11608c<T> f25537e;

        /* renamed from: f */
        Throwable f25538f;

        /* renamed from: w */
        volatile boolean f25539w;

        /* renamed from: x */
        final AtomicInteger f25540x;

        C11367c(InterfaceC14456b<? super T> interfaceC14456b, int i) {
            super(interfaceC14456b);
            this.f25537e = new C11608c<>(i);
            this.f25540x = new AtomicInteger();
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11364c.AbstractC11366b, p425j.p444e.InterfaceC11286e
        /* renamed from: a */
        public void mo10905a() {
            this.f25539w = true;
            m11067l();
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11364c.AbstractC11366b
        /* renamed from: b */
        public boolean mo11066b(Throwable th) {
            if (this.f25539w || isCancelled()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f25538f = th;
            this.f25539w = true;
            m11067l();
            return true;
        }

        @Override // p425j.p444e.InterfaceC11286e
        /* renamed from: f */
        public void mo10903f(T t) {
            if (this.f25539w || isCancelled()) {
                return;
            }
            if (t == null) {
                m11068i(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            this.f25537e.offer(t);
            m11067l();
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11364c.AbstractC11366b
        /* renamed from: j */
        void mo11065j() {
            m11067l();
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11364c.AbstractC11366b
        /* renamed from: k */
        void mo11064k() {
            if (this.f25540x.getAndIncrement() == 0) {
                this.f25537e.clear();
            }
        }

        /* renamed from: l */
        void m11067l() {
            if (this.f25540x.getAndIncrement() != 0) {
                return;
            }
            InterfaceC14456b<? super T> interfaceC14456b = this.f25535c;
            C11608c<T> c11608c = this.f25537e;
            int i = 1;
            do {
                long j = get();
                long j2 = 0;
                while (j2 != j) {
                    if (isCancelled()) {
                        c11608c.clear();
                        return;
                    }
                    boolean z = this.f25539w;
                    Object obj = (T) c11608c.poll();
                    boolean z2 = obj == null;
                    if (z && z2) {
                        Throwable th = this.f25538f;
                        if (th != null) {
                            m11069h(th);
                            return;
                        } else {
                            m11070g();
                            return;
                        }
                    } else if (z2) {
                        break;
                    } else {
                        interfaceC14456b.mo1688f(obj);
                        j2++;
                    }
                }
                if (j2 == j) {
                    if (isCancelled()) {
                        c11608c.clear();
                        return;
                    }
                    boolean z3 = this.f25539w;
                    boolean isEmpty = c11608c.isEmpty();
                    if (z3 && isEmpty) {
                        Throwable th2 = this.f25538f;
                        if (th2 != null) {
                            m11069h(th2);
                            return;
                        } else {
                            m11070g();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    C11657d.m10654d(this, j2);
                }
                i = this.f25540x.addAndGet(-i);
            } while (i != 0);
        }
    }

    /* compiled from: FlowableCreate.java */
    /* renamed from: j.e.f0.e.b.c$d */
    /* loaded from: classes3.dex */
    static final class C11368d<T> extends AbstractC11372h<T> {
        C11368d(InterfaceC14456b<? super T> interfaceC14456b) {
            super(interfaceC14456b);
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11364c.AbstractC11372h
        /* renamed from: l */
        void mo11062l() {
        }
    }

    /* compiled from: FlowableCreate.java */
    /* renamed from: j.e.f0.e.b.c$e */
    /* loaded from: classes3.dex */
    static final class C11369e<T> extends AbstractC11372h<T> {
        C11369e(InterfaceC14456b<? super T> interfaceC14456b) {
            super(interfaceC14456b);
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11364c.AbstractC11372h
        /* renamed from: l */
        void mo11062l() {
            m11068i(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    /* compiled from: FlowableCreate.java */
    /* renamed from: j.e.f0.e.b.c$f */
    /* loaded from: classes3.dex */
    static final class C11370f<T> extends AbstractC11366b<T> {

        /* renamed from: e */
        final AtomicReference<T> f25541e;

        /* renamed from: f */
        Throwable f25542f;

        /* renamed from: w */
        volatile boolean f25543w;

        /* renamed from: x */
        final AtomicInteger f25544x;

        C11370f(InterfaceC14456b<? super T> interfaceC14456b) {
            super(interfaceC14456b);
            this.f25541e = new AtomicReference<>();
            this.f25544x = new AtomicInteger();
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11364c.AbstractC11366b, p425j.p444e.InterfaceC11286e
        /* renamed from: a */
        public void mo10905a() {
            this.f25543w = true;
            m11063l();
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11364c.AbstractC11366b
        /* renamed from: b */
        public boolean mo11066b(Throwable th) {
            if (this.f25543w || isCancelled()) {
                return false;
            }
            if (th == null) {
                m11068i(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.f25542f = th;
            this.f25543w = true;
            m11063l();
            return true;
        }

        @Override // p425j.p444e.InterfaceC11286e
        /* renamed from: f */
        public void mo10903f(T t) {
            if (this.f25543w || isCancelled()) {
                return;
            }
            if (t == null) {
                m11068i(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            this.f25541e.set(t);
            m11063l();
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11364c.AbstractC11366b
        /* renamed from: j */
        void mo11065j() {
            m11063l();
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11364c.AbstractC11366b
        /* renamed from: k */
        void mo11064k() {
            if (this.f25544x.getAndIncrement() == 0) {
                this.f25541e.lazySet(null);
            }
        }

        /* renamed from: l */
        void m11063l() {
            if (this.f25544x.getAndIncrement() != 0) {
                return;
            }
            InterfaceC14456b<? super T> interfaceC14456b = this.f25535c;
            AtomicReference<T> atomicReference = this.f25541e;
            int i = 1;
            do {
                long j = get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    } else if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    } else {
                        boolean z = this.f25543w;
                        Object obj = (T) atomicReference.getAndSet(null);
                        boolean z2 = obj == null;
                        if (z && z2) {
                            Throwable th = this.f25542f;
                            if (th != null) {
                                m11069h(th);
                                return;
                            } else {
                                m11070g();
                                return;
                            }
                        } else if (z2) {
                            break;
                        } else {
                            interfaceC14456b.mo1688f(obj);
                            j2++;
                        }
                    }
                }
                if (j2 == j) {
                    if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z3 = this.f25543w;
                    boolean z4 = atomicReference.get() == null;
                    if (z3 && z4) {
                        Throwable th2 = this.f25542f;
                        if (th2 != null) {
                            m11069h(th2);
                            return;
                        } else {
                            m11070g();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    C11657d.m10654d(this, j2);
                }
                i = this.f25544x.addAndGet(-i);
            } while (i != 0);
        }
    }

    /* compiled from: FlowableCreate.java */
    /* renamed from: j.e.f0.e.b.c$g */
    /* loaded from: classes3.dex */
    static final class C11371g<T> extends AbstractC11366b<T> {
        C11371g(InterfaceC14456b<? super T> interfaceC14456b) {
            super(interfaceC14456b);
        }

        @Override // p425j.p444e.InterfaceC11286e
        /* renamed from: f */
        public void mo10903f(T t) {
            long j;
            if (isCancelled()) {
                return;
            }
            if (t != null) {
                this.f25535c.mo1688f(t);
                do {
                    j = get();
                    if (j == 0) {
                        return;
                    }
                } while (!compareAndSet(j, j - 1));
                return;
            }
            m11068i(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        }
    }

    /* compiled from: FlowableCreate.java */
    /* renamed from: j.e.f0.e.b.c$h */
    /* loaded from: classes3.dex */
    static abstract class AbstractC11372h<T> extends AbstractC11366b<T> {
        AbstractC11372h(InterfaceC14456b<? super T> interfaceC14456b) {
            super(interfaceC14456b);
        }

        @Override // p425j.p444e.InterfaceC11286e
        /* renamed from: f */
        public final void mo10903f(T t) {
            if (isCancelled()) {
                return;
            }
            if (t == null) {
                m11068i(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (get() != 0) {
                this.f25535c.mo1688f(t);
                C11657d.m10654d(this, 1L);
            } else {
                mo11062l();
            }
        }

        /* renamed from: l */
        abstract void mo11062l();
    }

    public C11364c(InterfaceC11675i<T> interfaceC11675i, EnumC11269a enumC11269a) {
        this.f25532d = interfaceC11675i;
        this.f25533e = enumC11269a;
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    public void mo10791L(InterfaceC14456b<? super T> interfaceC14456b) {
        AbstractC11366b c11371g;
        int i = C11365a.f25534a[this.f25533e.ordinal()];
        if (i == 1) {
            c11371g = new C11371g(interfaceC14456b);
        } else if (i == 2) {
            c11371g = new C11369e(interfaceC14456b);
        } else if (i == 3) {
            c11371g = new C11368d(interfaceC14456b);
        } else if (i != 4) {
            c11371g = new C11367c(interfaceC14456b, AbstractC11293f.m11182c());
        } else {
            c11371g = new C11370f(interfaceC14456b);
        }
        interfaceC14456b.mo1687g(c11371g);
        try {
            this.f25532d.subscribe(c11371g);
        } catch (Throwable th) {
            C11118a.m11646b(th);
            c11371g.m11068i(th);
        }
    }
}
