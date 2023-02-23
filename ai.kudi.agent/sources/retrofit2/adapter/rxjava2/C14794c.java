package retrofit2.adapter.rxjava2;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11695u;
import retrofit2.C14840l;
import retrofit2.InterfaceC14801b;
/* compiled from: CallExecuteObservable.java */
/* renamed from: retrofit2.adapter.rxjava2.c */
/* loaded from: classes3.dex */
final class C14794c<T> extends AbstractC11688p<C14840l<T>> {

    /* renamed from: c */
    private final InterfaceC14801b<T> f33064c;

    /* compiled from: CallExecuteObservable.java */
    /* renamed from: retrofit2.adapter.rxjava2.c$a */
    /* loaded from: classes3.dex */
    private static final class C14795a implements j.e.c0.c {

        /* renamed from: c */
        private final InterfaceC14801b<?> f33065c;

        /* renamed from: d */
        private volatile boolean f33066d;

        C14795a(InterfaceC14801b<?> interfaceC14801b) {
            this.f33065c = interfaceC14801b;
        }

        /* renamed from: i */
        public void m340i() {
            this.f33066d = true;
            this.f33065c.cancel();
        }

        /* renamed from: j */
        public boolean m339j() {
            return this.f33066d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14794c(InterfaceC14801b<T> interfaceC14801b) {
        this.f33064c = interfaceC14801b;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super C14840l<T>> interfaceC11695u) {
        boolean z;
        InterfaceC14801b<T> mo41960clone = this.f33064c.mo41960clone();
        C14795a c14795a = new C14795a(mo41960clone);
        interfaceC11695u.mo332d(c14795a);
        try {
            C14840l<T> execute = mo41960clone.execute();
            if (!c14795a.m339j()) {
                interfaceC11695u.mo331f(execute);
            }
            if (c14795a.m339j()) {
                return;
            }
            try {
                interfaceC11695u.mo335a();
            } catch (Throwable th) {
                th = th;
                z = true;
                C11118a.m11646b(th);
                if (z) {
                    j.e.i0.a.r(th);
                } else if (c14795a.m339j()) {
                } else {
                    try {
                        interfaceC11695u.mo334b(th);
                    } catch (Throwable th2) {
                        C11118a.m11646b(th2);
                        j.e.i0.a.r(new CompositeException(th, th2));
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }
}
