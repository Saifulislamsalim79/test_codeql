package p425j.p444e.p451f0.p456e.p459c;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11677k;
import p425j.p444e.InterfaceC11684l;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.InterfaceC11686n;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: MaybeCreate.java */
/* renamed from: j.e.f0.e.c.c */
/* loaded from: classes3.dex */
public final class C11434c<T> extends AbstractC11677k<T> {

    /* renamed from: c */
    final InterfaceC11686n<T> f25748c;

    /* compiled from: MaybeCreate.java */
    /* renamed from: j.e.f0.e.c.c$a */
    /* loaded from: classes3.dex */
    static final class C11435a<T> extends AtomicReference<c> implements InterfaceC11684l<T>, c {

        /* renamed from: c */
        final InterfaceC11685m<? super T> f25749c;

        C11435a(InterfaceC11685m<? super T> interfaceC11685m) {
            this.f25749c = interfaceC11685m;
        }

        @Override // p425j.p444e.InterfaceC11684l
        /* renamed from: a */
        public void mo10554a() {
            c andSet;
            c cVar = get();
            EnumC11296c enumC11296c = EnumC11296c.DISPOSED;
            if (cVar == enumC11296c || (andSet = getAndSet(enumC11296c)) == EnumC11296c.DISPOSED) {
                return;
            }
            try {
                this.f25749c.mo10551a();
            } finally {
                if (andSet != null) {
                    andSet.i();
                }
            }
        }

        @Override // p425j.p444e.InterfaceC11684l
        /* renamed from: b */
        public void mo10553b(Throwable th) {
            if (m11001d(th)) {
                return;
            }
            a.r(th);
        }

        @Override // p425j.p444e.InterfaceC11684l
        /* renamed from: c */
        public void mo10552c(T t) {
            c andSet;
            c cVar = get();
            EnumC11296c enumC11296c = EnumC11296c.DISPOSED;
            if (cVar == enumC11296c || (andSet = getAndSet(enumC11296c)) == EnumC11296c.DISPOSED) {
                return;
            }
            try {
                if (t == null) {
                    this.f25749c.mo10550b(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f25749c.mo10549c(t);
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

        /* renamed from: d */
        public boolean m11001d(Throwable th) {
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
                this.f25749c.mo10550b(th);
            } finally {
                if (andSet != null) {
                    andSet.i();
                }
            }
        }

        /* renamed from: i */
        public void m11000i() {
            EnumC11296c.m11156a(this);
        }

        /* renamed from: j */
        public boolean m10999j() {
            return EnumC11296c.m11155b(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C11435a.class.getSimpleName(), super.toString());
        }
    }

    public C11434c(InterfaceC11686n<T> interfaceC11686n) {
        this.f25748c = interfaceC11686n;
    }

    @Override // p425j.p444e.AbstractC11677k
    /* renamed from: u */
    protected void mo10582u(InterfaceC11685m<? super T> interfaceC11685m) {
        C11435a c11435a = new C11435a(interfaceC11685m);
        interfaceC11685m.mo10548d(c11435a);
        try {
            this.f25748c.mo10547a(c11435a);
        } catch (Throwable th) {
            C11118a.m11646b(th);
            c11435a.mo10553b(th);
        }
    }
}
