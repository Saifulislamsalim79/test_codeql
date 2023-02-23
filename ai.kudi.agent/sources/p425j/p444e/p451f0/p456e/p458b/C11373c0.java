package p425j.p444e.p451f0.p456e.p458b;

import j.e.i0.a;
import j.e.v;
import java.util.concurrent.atomic.AtomicBoolean;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.InterfaceC11676j;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: FlowableUnsubscribeOn.java */
/* renamed from: j.e.f0.e.b.c0 */
/* loaded from: classes3.dex */
public final class C11373c0<T> extends AbstractC11351a<T, T> {

    /* renamed from: e */
    final v f25545e;

    /* compiled from: FlowableUnsubscribeOn.java */
    /* renamed from: j.e.f0.e.b.c0$a */
    /* loaded from: classes3.dex */
    static final class C11374a<T> extends AtomicBoolean implements InterfaceC11676j<T>, InterfaceC14457c {

        /* renamed from: c */
        final InterfaceC14456b<? super T> f25546c;

        /* renamed from: d */
        final v f25547d;

        /* renamed from: e */
        InterfaceC14457c f25548e;

        /* compiled from: FlowableUnsubscribeOn.java */
        /* renamed from: j.e.f0.e.b.c0$a$a */
        /* loaded from: classes3.dex */
        final class RunnableC11375a implements Runnable {
            RunnableC11375a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C11374a.this.f25548e.cancel();
            }
        }

        C11374a(InterfaceC14456b<? super T> interfaceC14456b, v vVar) {
            this.f25546c = interfaceC14456b;
            this.f25547d = vVar;
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: a */
        public void mo1690a() {
            if (get()) {
                return;
            }
            this.f25546c.mo1690a();
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: b */
        public void mo1689b(Throwable th) {
            if (get()) {
                a.r(th);
            } else {
                this.f25546c.mo1689b(th);
            }
        }

        @Override // p577n.p586b.InterfaceC14457c
        public void cancel() {
            if (compareAndSet(false, true)) {
                this.f25547d.b(new RunnableC11375a());
            }
        }

        @Override // p577n.p586b.InterfaceC14457c
        /* renamed from: e */
        public void mo1686e(long j) {
            this.f25548e.mo1686e(j);
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: f */
        public void mo1688f(T t) {
            if (get()) {
                return;
            }
            this.f25546c.mo1688f(t);
        }

        @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
        /* renamed from: g */
        public void mo1687g(InterfaceC14457c interfaceC14457c) {
            if (EnumC11652g.m10668n(this.f25548e, interfaceC14457c)) {
                this.f25548e = interfaceC14457c;
                this.f25546c.mo1687g(this);
            }
        }
    }

    public C11373c0(AbstractC11293f<T> abstractC11293f, v vVar) {
        super(abstractC11293f);
        this.f25545e = vVar;
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    protected void mo10791L(InterfaceC14456b<? super T> interfaceC14456b) {
        this.f25499d.m11188K(new C11374a(interfaceC14456b, this.f25545e));
    }
}
