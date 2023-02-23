package p425j.p444e.p451f0.p456e.p461e;

import j.e.c0.c;
import j.e.i0.a;
import java.util.NoSuchElementException;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.InterfaceC11698y;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: ObservableSingleSingle.java */
/* renamed from: j.e.f0.e.e.i0 */
/* loaded from: classes3.dex */
public final class C11522i0<T> extends AbstractC11696w<T> {

    /* renamed from: c */
    final InterfaceC11692s<? extends T> f25977c;

    /* renamed from: d */
    final T f25978d;

    /* compiled from: ObservableSingleSingle.java */
    /* renamed from: j.e.f0.e.e.i0$a */
    /* loaded from: classes3.dex */
    static final class C11523a<T> implements InterfaceC11695u<T>, c {

        /* renamed from: c */
        final InterfaceC11698y<? super T> f25979c;

        /* renamed from: d */
        final T f25980d;

        /* renamed from: e */
        c f25981e;

        /* renamed from: f */
        T f25982f;

        /* renamed from: w */
        boolean f25983w;

        C11523a(InterfaceC11698y<? super T> interfaceC11698y, T t) {
            this.f25979c = interfaceC11698y;
            this.f25980d = t;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            if (this.f25983w) {
                return;
            }
            this.f25983w = true;
            T t = this.f25982f;
            this.f25982f = null;
            if (t == null) {
                t = this.f25980d;
            }
            if (t != null) {
                this.f25979c.mo3151c(t);
            } else {
                this.f25979c.mo3152b(new NoSuchElementException());
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            if (this.f25983w) {
                a.r(th);
                return;
            }
            this.f25983w = true;
            this.f25979c.mo3152b(th);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            if (EnumC11296c.m11147p(this.f25981e, cVar)) {
                this.f25981e = cVar;
                this.f25979c.mo3150d(this);
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            if (this.f25983w) {
                return;
            }
            if (this.f25982f != null) {
                this.f25983w = true;
                this.f25981e.i();
                this.f25979c.mo3152b(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.f25982f = t;
        }

        /* renamed from: i */
        public void m10887i() {
            this.f25981e.i();
        }

        /* renamed from: j */
        public boolean m10886j() {
            return this.f25981e.j();
        }
    }

    public C11522i0(InterfaceC11692s<? extends T> interfaceC11692s, T t) {
        this.f25977c = interfaceC11692s;
        this.f25978d = t;
    }

    @Override // p425j.p444e.AbstractC11696w
    /* renamed from: t */
    public void mo10430t(InterfaceC11698y<? super T> interfaceC11698y) {
        this.f25977c.mo10478e(new C11523a(interfaceC11698y, this.f25978d));
    }
}
