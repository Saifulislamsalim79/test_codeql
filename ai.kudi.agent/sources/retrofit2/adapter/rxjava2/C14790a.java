package retrofit2.adapter.rxjava2;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11695u;
import retrofit2.C14840l;
/* compiled from: BodyObservable.java */
/* renamed from: retrofit2.adapter.rxjava2.a */
/* loaded from: classes3.dex */
final class C14790a<T> extends AbstractC11688p<T> {

    /* renamed from: c */
    private final AbstractC11688p<C14840l<T>> f33056c;

    /* compiled from: BodyObservable.java */
    /* renamed from: retrofit2.adapter.rxjava2.a$a */
    /* loaded from: classes3.dex */
    private static class C14791a<R> implements InterfaceC11695u<C14840l<R>> {

        /* renamed from: c */
        private final InterfaceC11695u<? super R> f33057c;

        /* renamed from: d */
        private boolean f33058d;

        C14791a(InterfaceC11695u<? super R> interfaceC11695u) {
            this.f33057c = interfaceC11695u;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            if (this.f33058d) {
                return;
            }
            this.f33057c.mo335a();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            if (!this.f33058d) {
                this.f33057c.mo334b(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            j.e.i0.a.r(assertionError);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: c */
        public void mo331f(C14840l<R> c14840l) {
            if (c14840l.m280e()) {
                this.f33057c.mo331f(c14840l.m284a());
                return;
            }
            this.f33058d = true;
            HttpException httpException = new HttpException(c14840l);
            try {
                this.f33057c.mo334b(httpException);
            } catch (Throwable th) {
                C11118a.m11646b(th);
                j.e.i0.a.r(new CompositeException(httpException, th));
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(j.e.c0.c cVar) {
            this.f33057c.mo332d(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14790a(AbstractC11688p<C14840l<T>> abstractC11688p) {
        this.f33056c = abstractC11688p;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        this.f33056c.mo10478e(new C14791a(interfaceC11695u));
    }
}
