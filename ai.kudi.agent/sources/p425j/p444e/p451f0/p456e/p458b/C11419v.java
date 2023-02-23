package p425j.p444e.p451f0.p456e.p458b;

import io.reactivex.exceptions.MissingBackpressureException;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicLong;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.InterfaceC11676j;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p425j.p444e.p451f0.p467j.C11657d;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: FlowableOnBackpressureError.java */
/* renamed from: j.e.f0.e.b.v */
/* loaded from: classes3.dex */
public final class C11419v<T> extends AbstractC11351a<T, T> {

    /* compiled from: FlowableOnBackpressureError.java */
    /* renamed from: j.e.f0.e.b.v$a */
    /* loaded from: classes3.dex */
    static final class C11420a<T> extends AtomicLong implements InterfaceC11676j<T>, InterfaceC14457c {

        /* renamed from: c */
        final InterfaceC14456b<? super T> f25703c;

        /* renamed from: d */
        InterfaceC14457c f25704d;

        /* renamed from: e */
        boolean f25705e;

        C11420a(InterfaceC14456b<? super T> interfaceC14456b) {
            this.f25703c = interfaceC14456b;
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: a */
        public void mo1690a() {
            if (this.f25705e) {
                return;
            }
            this.f25705e = true;
            this.f25703c.mo1690a();
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: b */
        public void mo1689b(Throwable th) {
            if (this.f25705e) {
                a.r(th);
                return;
            }
            this.f25705e = true;
            this.f25703c.mo1689b(th);
        }

        @Override // p577n.p586b.InterfaceC14457c
        public void cancel() {
            this.f25704d.cancel();
        }

        @Override // p577n.p586b.InterfaceC14457c
        /* renamed from: e */
        public void mo1686e(long j) {
            if (EnumC11652g.m10669m(j)) {
                C11657d.m10657a(this, j);
            }
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: f */
        public void mo1688f(T t) {
            if (this.f25705e) {
                return;
            }
            if (get() != 0) {
                this.f25703c.mo1688f(t);
                C11657d.m10654d(this, 1L);
                return;
            }
            mo1689b(new MissingBackpressureException("could not emit value due to lack of requests"));
        }

        @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
        /* renamed from: g */
        public void mo1687g(InterfaceC14457c interfaceC14457c) {
            if (EnumC11652g.m10668n(this.f25704d, interfaceC14457c)) {
                this.f25704d = interfaceC14457c;
                this.f25703c.mo1687g(this);
                interfaceC14457c.mo1686e(Long.MAX_VALUE);
            }
        }
    }

    public C11419v(AbstractC11293f<T> abstractC11293f) {
        super(abstractC11293f);
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    protected void mo10791L(InterfaceC14456b<? super T> interfaceC14456b) {
        this.f25499d.m11188K(new C11420a(interfaceC14456b));
    }
}
