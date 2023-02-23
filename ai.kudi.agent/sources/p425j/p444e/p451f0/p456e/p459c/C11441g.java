package p425j.p444e.p451f0.p456e.p459c;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.InterfaceC11278c;
import p425j.p444e.InterfaceC11284d;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.InterfaceC11687o;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p453b.C11312b;
/* compiled from: MaybeFlatMapCompletable.java */
/* renamed from: j.e.f0.e.c.g */
/* loaded from: classes3.dex */
public final class C11441g<T> extends AbstractC11271b {

    /* renamed from: c */
    final InterfaceC11687o<T> f25760c;

    /* renamed from: d */
    final InterfaceC11291f<? super T, ? extends InterfaceC11284d> f25761d;

    /* compiled from: MaybeFlatMapCompletable.java */
    /* renamed from: j.e.f0.e.c.g$a */
    /* loaded from: classes3.dex */
    static final class C11442a<T> extends AtomicReference<c> implements InterfaceC11685m<T>, InterfaceC11278c, c {

        /* renamed from: c */
        final InterfaceC11278c f25762c;

        /* renamed from: d */
        final InterfaceC11291f<? super T, ? extends InterfaceC11284d> f25763d;

        C11442a(InterfaceC11278c interfaceC11278c, InterfaceC11291f<? super T, ? extends InterfaceC11284d> interfaceC11291f) {
            this.f25762c = interfaceC11278c;
            this.f25763d = interfaceC11291f;
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: a */
        public void mo10551a() {
            this.f25762c.mo10845a();
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: b */
        public void mo10550b(Throwable th) {
            this.f25762c.mo10844b(th);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: c */
        public void mo10549c(T t) {
            try {
                InterfaceC11284d mo10663a = this.f25763d.mo10663a(t);
                C11312b.m11113d(mo10663a, "The mapper returned a null CompletableSource");
                InterfaceC11284d interfaceC11284d = mo10663a;
                if (m10993j()) {
                    return;
                }
                interfaceC11284d.mo11202b(this);
            } catch (Throwable th) {
                C11118a.m11646b(th);
                mo10550b(th);
            }
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: d */
        public void mo10548d(c cVar) {
            EnumC11296c.m11154e(this, cVar);
        }

        /* renamed from: i */
        public void m10994i() {
            EnumC11296c.m11156a(this);
        }

        /* renamed from: j */
        public boolean m10993j() {
            return EnumC11296c.m11155b(get());
        }
    }

    public C11441g(InterfaceC11687o<T> interfaceC11687o, InterfaceC11291f<? super T, ? extends InterfaceC11284d> interfaceC11291f) {
        this.f25760c = interfaceC11687o;
        this.f25761d = interfaceC11291f;
    }

    @Override // p425j.p444e.AbstractC11271b
    /* renamed from: r */
    protected void mo10805r(InterfaceC11278c interfaceC11278c) {
        C11442a c11442a = new C11442a(interfaceC11278c, this.f25761d);
        interfaceC11278c.mo10616d(c11442a);
        this.f25760c.mo10546a(c11442a);
    }
}
