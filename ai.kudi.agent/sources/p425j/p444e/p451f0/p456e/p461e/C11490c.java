package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.i0.a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.InterfaceC11698y;
import p425j.p444e.p450e0.InterfaceC11292g;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p454c.InterfaceC11316d;
/* compiled from: ObservableAnySingle.java */
/* renamed from: j.e.f0.e.e.c */
/* loaded from: classes3.dex */
public final class C11490c<T> extends AbstractC11696w<Boolean> implements InterfaceC11316d<Boolean> {

    /* renamed from: c */
    final InterfaceC11692s<T> f25863c;

    /* renamed from: d */
    final InterfaceC11292g<? super T> f25864d;

    /* compiled from: ObservableAnySingle.java */
    /* renamed from: j.e.f0.e.e.c$a */
    /* loaded from: classes3.dex */
    static final class C11491a<T> implements InterfaceC11695u<T>, c {

        /* renamed from: c */
        final InterfaceC11698y<? super Boolean> f25865c;

        /* renamed from: d */
        final InterfaceC11292g<? super T> f25866d;

        /* renamed from: e */
        c f25867e;

        /* renamed from: f */
        boolean f25868f;

        C11491a(InterfaceC11698y<? super Boolean> interfaceC11698y, InterfaceC11292g<? super T> interfaceC11292g) {
            this.f25865c = interfaceC11698y;
            this.f25866d = interfaceC11292g;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            if (this.f25868f) {
                return;
            }
            this.f25868f = true;
            this.f25865c.mo3151c(Boolean.FALSE);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            if (this.f25868f) {
                a.r(th);
                return;
            }
            this.f25868f = true;
            this.f25865c.mo3152b(th);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            if (EnumC11296c.m11147p(this.f25867e, cVar)) {
                this.f25867e = cVar;
                this.f25865c.mo3150d(this);
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            if (this.f25868f) {
                return;
            }
            try {
                if (this.f25866d.mo10557c(t)) {
                    this.f25868f = true;
                    this.f25867e.i();
                    this.f25865c.mo3151c(Boolean.TRUE);
                }
            } catch (Throwable th) {
                C11118a.m11646b(th);
                this.f25867e.i();
                mo334b(th);
            }
        }

        /* renamed from: i */
        public void m10945i() {
            this.f25867e.i();
        }

        /* renamed from: j */
        public boolean m10944j() {
            return this.f25867e.j();
        }
    }

    public C11490c(InterfaceC11692s<T> interfaceC11692s, InterfaceC11292g<? super T> interfaceC11292g) {
        this.f25863c = interfaceC11692s;
        this.f25864d = interfaceC11292g;
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11316d
    /* renamed from: a */
    public AbstractC11688p<Boolean> mo10806a() {
        return a.m(new C11486b(this.f25863c, this.f25864d));
    }

    @Override // p425j.p444e.AbstractC11696w
    /* renamed from: t */
    protected void mo10430t(InterfaceC11698y<? super Boolean> interfaceC11698y) {
        this.f25863c.mo10478e(new C11491a(interfaceC11698y, this.f25864d));
    }
}
