package p425j.p444e.p451f0.p456e.p462f;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11697x;
import p425j.p444e.InterfaceC11698y;
import p425j.p444e.InterfaceC11699z;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: SingleCreate.java */
/* renamed from: j.e.f0.e.f.a */
/* loaded from: classes3.dex */
public final class C11580a<T> extends AbstractC11696w<T> {

    /* renamed from: c */
    final InterfaceC11699z<T> f26144c;

    /* compiled from: SingleCreate.java */
    /* renamed from: j.e.f0.e.f.a$a */
    /* loaded from: classes3.dex */
    static final class C11581a<T> extends AtomicReference<c> implements InterfaceC11697x<T>, c {

        /* renamed from: c */
        final InterfaceC11698y<? super T> f26145c;

        C11581a(InterfaceC11698y<? super T> interfaceC11698y) {
            this.f26145c = interfaceC11698y;
        }

        /* renamed from: a */
        public void m10802a(Throwable th) {
            if (mo10426b(th)) {
                return;
            }
            a.r(th);
        }

        @Override // p425j.p444e.InterfaceC11697x
        /* renamed from: b */
        public boolean mo10426b(Throwable th) {
            c andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            c cVar = get();
            EnumC11296c enumC11296c = EnumC11296c.DISPOSED;
            if (cVar == enumC11296c || (andSet = getAndSet(enumC11296c)) == EnumC11296c.DISPOSED) {
                return false;
            }
            try {
                this.f26145c.mo3152b(th);
            } finally {
                if (andSet != null) {
                    andSet.i();
                }
            }
        }

        @Override // p425j.p444e.InterfaceC11697x
        /* renamed from: c */
        public void mo10425c(T t) {
            c andSet;
            c cVar = get();
            EnumC11296c enumC11296c = EnumC11296c.DISPOSED;
            if (cVar == enumC11296c || (andSet = getAndSet(enumC11296c)) == EnumC11296c.DISPOSED) {
                return;
            }
            try {
                if (t == null) {
                    this.f26145c.mo3152b(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f26145c.mo3151c(t);
                }
                if (andSet != null) {
                    andSet.i();
                }
            } catch (Throwable th) {
                if (andSet != null) {
                    andSet.i();
                }
                throw th;
            }
        }

        /* renamed from: i */
        public void m10801i() {
            EnumC11296c.m11156a(this);
        }

        /* renamed from: j */
        public boolean m10800j() {
            return EnumC11296c.m11155b(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C11581a.class.getSimpleName(), super.toString());
        }
    }

    public C11580a(InterfaceC11699z<T> interfaceC11699z) {
        this.f26144c = interfaceC11699z;
    }

    @Override // p425j.p444e.AbstractC11696w
    /* renamed from: t */
    protected void mo10430t(InterfaceC11698y<? super T> interfaceC11698y) {
        C11581a c11581a = new C11581a(interfaceC11698y);
        interfaceC11698y.mo3150d(c11581a);
        try {
            this.f26144c.mo10424a(c11581a);
        } catch (Throwable th) {
            C11118a.m11646b(th);
            c11581a.m10802a(th);
        }
    }
}
