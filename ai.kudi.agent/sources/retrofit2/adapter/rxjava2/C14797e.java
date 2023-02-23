package retrofit2.adapter.rxjava2;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11695u;
import retrofit2.C14840l;
/* compiled from: ResultObservable.java */
/* renamed from: retrofit2.adapter.rxjava2.e */
/* loaded from: classes3.dex */
final class C14797e<T> extends AbstractC11688p<C14796d<T>> {

    /* renamed from: c */
    private final AbstractC11688p<C14840l<T>> f33067c;

    /* compiled from: ResultObservable.java */
    /* renamed from: retrofit2.adapter.rxjava2.e$a */
    /* loaded from: classes3.dex */
    private static class C14798a<R> implements InterfaceC11695u<C14840l<R>> {

        /* renamed from: c */
        private final InterfaceC11695u<? super C14796d<R>> f33068c;

        C14798a(InterfaceC11695u<? super C14796d<R>> interfaceC11695u) {
            this.f33068c = interfaceC11695u;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            this.f33068c.mo335a();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            try {
                this.f33068c.mo331f(C14796d.m338a(th));
                this.f33068c.mo335a();
            } catch (Throwable th2) {
                try {
                    this.f33068c.mo334b(th2);
                } catch (Throwable th3) {
                    C11118a.m11646b(th3);
                    j.e.i0.a.r(new CompositeException(th2, th3));
                }
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: c */
        public void mo331f(C14840l<R> c14840l) {
            this.f33068c.mo331f(C14796d.m337b(c14840l));
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(j.e.c0.c cVar) {
            this.f33068c.mo332d(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14797e(AbstractC11688p<C14840l<T>> abstractC11688p) {
        this.f33067c = abstractC11688p;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super C14796d<T>> interfaceC11695u) {
        this.f33067c.mo10478e(new C14798a(interfaceC11695u));
    }
}
