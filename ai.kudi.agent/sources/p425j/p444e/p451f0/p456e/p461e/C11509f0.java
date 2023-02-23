package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import j.e.c0.c;
import java.util.concurrent.atomic.AtomicInteger;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p450e0.InterfaceC11292g;
import p425j.p444e.p451f0.p452a.C11300g;
/* compiled from: ObservableRetryPredicate.java */
/* renamed from: j.e.f0.e.e.f0 */
/* loaded from: classes3.dex */
public final class C11509f0<T> extends AbstractC11483a<T, T> {

    /* renamed from: d */
    final InterfaceC11292g<? super Throwable> f25943d;

    /* renamed from: e */
    final long f25944e;

    /* compiled from: ObservableRetryPredicate.java */
    /* renamed from: j.e.f0.e.e.f0$a */
    /* loaded from: classes3.dex */
    static final class C11510a<T> extends AtomicInteger implements InterfaceC11695u<T> {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f25945c;

        /* renamed from: d */
        final C11300g f25946d;

        /* renamed from: e */
        final InterfaceC11692s<? extends T> f25947e;

        /* renamed from: f */
        final InterfaceC11292g<? super Throwable> f25948f;

        /* renamed from: w */
        long f25949w;

        C11510a(InterfaceC11695u<? super T> interfaceC11695u, long j, InterfaceC11292g<? super Throwable> interfaceC11292g, C11300g c11300g, InterfaceC11692s<? extends T> interfaceC11692s) {
            this.f25945c = interfaceC11695u;
            this.f25946d = c11300g;
            this.f25947e = interfaceC11692s;
            this.f25948f = interfaceC11292g;
            this.f25949w = j;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            this.f25945c.mo335a();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            long j = this.f25949w;
            if (j != Long.MAX_VALUE) {
                this.f25949w = j - 1;
            }
            if (j == 0) {
                this.f25945c.mo334b(th);
                return;
            }
            try {
                if (!this.f25948f.mo10557c(th)) {
                    this.f25945c.mo334b(th);
                } else {
                    m10900c();
                }
            } catch (Throwable th2) {
                C11118a.m11646b(th2);
                this.f25945c.mo334b(new CompositeException(th, th2));
            }
        }

        /* renamed from: c */
        void m10900c() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f25946d.m11127j()) {
                    this.f25947e.mo10478e(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            this.f25946d.m11130a(cVar);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            this.f25945c.mo331f(t);
        }
    }

    public C11509f0(AbstractC11688p<T> abstractC11688p, long j, InterfaceC11292g<? super Throwable> interfaceC11292g) {
        super(abstractC11688p);
        this.f25943d = interfaceC11292g;
        this.f25944e = j;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        C11300g c11300g = new C11300g();
        interfaceC11695u.mo332d(c11300g);
        new C11510a(interfaceC11695u, this.f25944e, this.f25943d, c11300g, this.f25839c).m10900c();
    }
}
