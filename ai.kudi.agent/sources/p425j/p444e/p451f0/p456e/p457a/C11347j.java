package p425j.p444e.p451f0.p456e.p457a;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import j.e.c0.c;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.InterfaceC11278c;
import p425j.p444e.InterfaceC11284d;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p453b.C11312b;
/* compiled from: CompletableResumeNext.java */
/* renamed from: j.e.f0.e.a.j */
/* loaded from: classes3.dex */
public final class C11347j extends AbstractC11271b {

    /* renamed from: c */
    final InterfaceC11284d f25489c;

    /* renamed from: d */
    final InterfaceC11291f<? super Throwable, ? extends InterfaceC11284d> f25490d;

    /* compiled from: CompletableResumeNext.java */
    /* renamed from: j.e.f0.e.a.j$a */
    /* loaded from: classes3.dex */
    static final class C11348a extends AtomicReference<c> implements InterfaceC11278c, c {

        /* renamed from: c */
        final InterfaceC11278c f25491c;

        /* renamed from: d */
        final InterfaceC11291f<? super Throwable, ? extends InterfaceC11284d> f25492d;

        /* renamed from: e */
        boolean f25493e;

        C11348a(InterfaceC11278c interfaceC11278c, InterfaceC11291f<? super Throwable, ? extends InterfaceC11284d> interfaceC11291f) {
            this.f25491c = interfaceC11278c;
            this.f25492d = interfaceC11291f;
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: a */
        public void mo10845a() {
            this.f25491c.mo10845a();
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: b */
        public void mo10844b(Throwable th) {
            if (this.f25493e) {
                this.f25491c.mo10844b(th);
                return;
            }
            this.f25493e = true;
            try {
                InterfaceC11284d mo10663a = this.f25492d.mo10663a(th);
                C11312b.m11113d(mo10663a, "The errorMapper returned a null CompletableSource");
                mo10663a.mo11202b(this);
            } catch (Throwable th2) {
                C11118a.m11646b(th2);
                this.f25491c.mo10844b(new CompositeException(th, th2));
            }
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: d */
        public void mo10616d(c cVar) {
            EnumC11296c.m11154e(this, cVar);
        }

        /* renamed from: i */
        public void m11082i() {
            EnumC11296c.m11156a(this);
        }

        /* renamed from: j */
        public boolean m11081j() {
            return EnumC11296c.m11155b(get());
        }
    }

    public C11347j(InterfaceC11284d interfaceC11284d, InterfaceC11291f<? super Throwable, ? extends InterfaceC11284d> interfaceC11291f) {
        this.f25489c = interfaceC11284d;
        this.f25490d = interfaceC11291f;
    }

    @Override // p425j.p444e.AbstractC11271b
    /* renamed from: r */
    protected void mo10805r(InterfaceC11278c interfaceC11278c) {
        C11348a c11348a = new C11348a(interfaceC11278c, this.f25490d);
        interfaceC11278c.mo10616d(c11348a);
        this.f25489c.mo11202b(c11348a);
    }
}
