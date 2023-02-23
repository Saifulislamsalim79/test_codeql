package p425j.p444e.p451f0.p456e.p458b;

import io.reactivex.exceptions.C11118a;
import j.e.e0.e;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicLong;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.InterfaceC11676j;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p425j.p444e.p451f0.p467j.C11657d;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: FlowableOnBackpressureDrop.java */
/* renamed from: j.e.f0.e.b.u */
/* loaded from: classes3.dex */
public final class C11417u<T> extends AbstractC11351a<T, T> implements e<T> {

    /* renamed from: e */
    final e<? super T> f25698e;

    /* compiled from: FlowableOnBackpressureDrop.java */
    /* renamed from: j.e.f0.e.b.u$a */
    /* loaded from: classes3.dex */
    static final class C11418a<T> extends AtomicLong implements InterfaceC11676j<T>, InterfaceC14457c {

        /* renamed from: c */
        final InterfaceC14456b<? super T> f25699c;

        /* renamed from: d */
        final e<? super T> f25700d;

        /* renamed from: e */
        InterfaceC14457c f25701e;

        /* renamed from: f */
        boolean f25702f;

        C11418a(InterfaceC14456b<? super T> interfaceC14456b, e<? super T> eVar) {
            this.f25699c = interfaceC14456b;
            this.f25700d = eVar;
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: a */
        public void mo1690a() {
            if (this.f25702f) {
                return;
            }
            this.f25702f = true;
            this.f25699c.mo1690a();
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: b */
        public void mo1689b(Throwable th) {
            if (this.f25702f) {
                a.r(th);
                return;
            }
            this.f25702f = true;
            this.f25699c.mo1689b(th);
        }

        @Override // p577n.p586b.InterfaceC14457c
        public void cancel() {
            this.f25701e.cancel();
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
            if (this.f25702f) {
                return;
            }
            if (get() != 0) {
                this.f25699c.mo1688f(t);
                C11657d.m10654d(this, 1L);
                return;
            }
            try {
                this.f25700d.accept(t);
            } catch (Throwable th) {
                C11118a.m11646b(th);
                cancel();
                mo1689b(th);
            }
        }

        @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
        /* renamed from: g */
        public void mo1687g(InterfaceC14457c interfaceC14457c) {
            if (EnumC11652g.m10668n(this.f25701e, interfaceC14457c)) {
                this.f25701e = interfaceC14457c;
                this.f25699c.mo1687g(this);
                interfaceC14457c.mo1686e(Long.MAX_VALUE);
            }
        }
    }

    public C11417u(AbstractC11293f<T> abstractC11293f) {
        super(abstractC11293f);
        this.f25698e = this;
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    protected void mo10791L(InterfaceC14456b<? super T> interfaceC14456b) {
        this.f25499d.m11188K(new C11418a(interfaceC14456b, this.f25698e));
    }

    public void accept(T t) {
    }
}
