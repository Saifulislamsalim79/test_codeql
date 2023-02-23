package p425j.p444e.p451f0.p456e.p458b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.InterfaceC11676j;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p425j.p444e.p451f0.p467j.C11657d;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: FlowableOnBackpressureLatest.java */
/* renamed from: j.e.f0.e.b.w */
/* loaded from: classes3.dex */
public final class C11421w<T> extends AbstractC11351a<T, T> {

    /* compiled from: FlowableOnBackpressureLatest.java */
    /* renamed from: j.e.f0.e.b.w$a */
    /* loaded from: classes3.dex */
    static final class C11422a<T> extends AtomicInteger implements InterfaceC11676j<T>, InterfaceC14457c {

        /* renamed from: c */
        final InterfaceC14456b<? super T> f25706c;

        /* renamed from: d */
        InterfaceC14457c f25707d;

        /* renamed from: e */
        volatile boolean f25708e;

        /* renamed from: f */
        Throwable f25709f;

        /* renamed from: w */
        volatile boolean f25710w;

        /* renamed from: x */
        final AtomicLong f25711x = new AtomicLong();

        /* renamed from: y */
        final AtomicReference<T> f25712y = new AtomicReference<>();

        C11422a(InterfaceC14456b<? super T> interfaceC14456b) {
            this.f25706c = interfaceC14456b;
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: a */
        public void mo1690a() {
            this.f25708e = true;
            m11015d();
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: b */
        public void mo1689b(Throwable th) {
            this.f25709f = th;
            this.f25708e = true;
            m11015d();
        }

        /* renamed from: c */
        boolean m11016c(boolean z, boolean z2, InterfaceC14456b<?> interfaceC14456b, AtomicReference<T> atomicReference) {
            if (this.f25710w) {
                atomicReference.lazySet(null);
                return true;
            } else if (z) {
                Throwable th = this.f25709f;
                if (th != null) {
                    atomicReference.lazySet(null);
                    interfaceC14456b.mo1689b(th);
                    return true;
                } else if (z2) {
                    interfaceC14456b.mo1690a();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        @Override // p577n.p586b.InterfaceC14457c
        public void cancel() {
            if (this.f25710w) {
                return;
            }
            this.f25710w = true;
            this.f25707d.cancel();
            if (getAndIncrement() == 0) {
                this.f25712y.lazySet(null);
            }
        }

        /* renamed from: d */
        void m11015d() {
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC14456b<? super T> interfaceC14456b = this.f25706c;
            AtomicLong atomicLong = this.f25711x;
            AtomicReference<T> atomicReference = this.f25712y;
            int i = 1;
            do {
                long j = 0;
                while (true) {
                    if (j == atomicLong.get()) {
                        break;
                    }
                    boolean z = this.f25708e;
                    Object obj = (T) atomicReference.getAndSet(null);
                    boolean z2 = obj == null;
                    if (m11016c(z, z2, interfaceC14456b, atomicReference)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    interfaceC14456b.mo1688f(obj);
                    j++;
                }
                if (j == atomicLong.get()) {
                    if (m11016c(this.f25708e, atomicReference.get() == null, interfaceC14456b, atomicReference)) {
                        return;
                    }
                }
                if (j != 0) {
                    C11657d.m10654d(atomicLong, j);
                }
                i = addAndGet(-i);
            } while (i != 0);
        }

        @Override // p577n.p586b.InterfaceC14457c
        /* renamed from: e */
        public void mo1686e(long j) {
            if (EnumC11652g.m10669m(j)) {
                C11657d.m10657a(this.f25711x, j);
                m11015d();
            }
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: f */
        public void mo1688f(T t) {
            this.f25712y.lazySet(t);
            m11015d();
        }

        @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
        /* renamed from: g */
        public void mo1687g(InterfaceC14457c interfaceC14457c) {
            if (EnumC11652g.m10668n(this.f25707d, interfaceC14457c)) {
                this.f25707d = interfaceC14457c;
                this.f25706c.mo1687g(this);
                interfaceC14457c.mo1686e(Long.MAX_VALUE);
            }
        }
    }

    public C11421w(AbstractC11293f<T> abstractC11293f) {
        super(abstractC11293f);
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    protected void mo10791L(InterfaceC14456b<? super T> interfaceC14456b) {
        this.f25499d.m11188K(new C11422a(interfaceC14456b));
    }
}
