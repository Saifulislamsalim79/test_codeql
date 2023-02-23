package retrofit2.adapter.rxjava2;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11695u;
import retrofit2.C14840l;
import retrofit2.InterfaceC14801b;
import retrofit2.InterfaceC14804d;
/* compiled from: CallEnqueueObservable.java */
/* renamed from: retrofit2.adapter.rxjava2.b */
/* loaded from: classes3.dex */
final class C14792b<T> extends AbstractC11688p<C14840l<T>> {

    /* renamed from: c */
    private final InterfaceC14801b<T> f33059c;

    /* compiled from: CallEnqueueObservable.java */
    /* renamed from: retrofit2.adapter.rxjava2.b$a */
    /* loaded from: classes3.dex */
    private static final class C14793a<T> implements j.e.c0.c, InterfaceC14804d<T> {

        /* renamed from: c */
        private final InterfaceC14801b<?> f33060c;

        /* renamed from: d */
        private final InterfaceC11695u<? super C14840l<T>> f33061d;

        /* renamed from: e */
        private volatile boolean f33062e;

        /* renamed from: f */
        boolean f33063f = false;

        C14793a(InterfaceC14801b<?> interfaceC14801b, InterfaceC11695u<? super C14840l<T>> interfaceC11695u) {
            this.f33060c = interfaceC14801b;
            this.f33061d = interfaceC11695u;
        }

        @Override // retrofit2.InterfaceC14804d
        /* renamed from: a */
        public void mo322a(InterfaceC14801b<T> interfaceC14801b, Throwable th) {
            if (interfaceC14801b.isCanceled()) {
                return;
            }
            try {
                this.f33061d.mo334b(th);
            } catch (Throwable th2) {
                C11118a.m11646b(th2);
                j.e.i0.a.r(new CompositeException(th, th2));
            }
        }

        @Override // retrofit2.InterfaceC14804d
        /* renamed from: b */
        public void mo321b(InterfaceC14801b<T> interfaceC14801b, C14840l<T> c14840l) {
            if (this.f33062e) {
                return;
            }
            try {
                this.f33061d.mo331f(c14840l);
                if (this.f33062e) {
                    return;
                }
                this.f33063f = true;
                this.f33061d.mo335a();
            } catch (Throwable th) {
                if (this.f33063f) {
                    j.e.i0.a.r(th);
                } else if (this.f33062e) {
                } else {
                    try {
                        this.f33061d.mo334b(th);
                    } catch (Throwable th2) {
                        C11118a.m11646b(th2);
                        j.e.i0.a.r(new CompositeException(th, th2));
                    }
                }
            }
        }

        /* renamed from: i */
        public void m342i() {
            this.f33062e = true;
            this.f33060c.cancel();
        }

        /* renamed from: j */
        public boolean m341j() {
            return this.f33062e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14792b(InterfaceC14801b<T> interfaceC14801b) {
        this.f33059c = interfaceC14801b;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super C14840l<T>> interfaceC11695u) {
        InterfaceC14801b<T> mo41960clone = this.f33059c.mo41960clone();
        C14793a c14793a = new C14793a(mo41960clone, interfaceC11695u);
        interfaceC11695u.mo332d(c14793a);
        mo41960clone.mo317g0(c14793a);
    }
}
