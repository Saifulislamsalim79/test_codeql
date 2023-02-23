package p425j.p444e.p451f0.p456e.p457a;

import j.e.c0.c;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.InterfaceC11278c;
import p425j.p444e.InterfaceC11284d;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: CompletableAndThenCompletable.java */
/* renamed from: j.e.f0.e.a.a */
/* loaded from: classes3.dex */
public final class C11333a extends AbstractC11271b {

    /* renamed from: c */
    final InterfaceC11284d f25459c;

    /* renamed from: d */
    final InterfaceC11284d f25460d;

    /* compiled from: CompletableAndThenCompletable.java */
    /* renamed from: j.e.f0.e.a.a$a */
    /* loaded from: classes3.dex */
    static final class C11334a implements InterfaceC11278c {

        /* renamed from: c */
        final AtomicReference<c> f25461c;

        /* renamed from: d */
        final InterfaceC11278c f25462d;

        public C11334a(AtomicReference<c> atomicReference, InterfaceC11278c interfaceC11278c) {
            this.f25461c = atomicReference;
            this.f25462d = interfaceC11278c;
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: a */
        public void mo10845a() {
            this.f25462d.mo10845a();
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: b */
        public void mo10844b(Throwable th) {
            this.f25462d.mo10844b(th);
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: d */
        public void mo10616d(c cVar) {
            EnumC11296c.m11154e(this.f25461c, cVar);
        }
    }

    /* compiled from: CompletableAndThenCompletable.java */
    /* renamed from: j.e.f0.e.a.a$b */
    /* loaded from: classes3.dex */
    static final class C11335b extends AtomicReference<c> implements InterfaceC11278c, c {

        /* renamed from: c */
        final InterfaceC11278c f25463c;

        /* renamed from: d */
        final InterfaceC11284d f25464d;

        C11335b(InterfaceC11278c interfaceC11278c, InterfaceC11284d interfaceC11284d) {
            this.f25463c = interfaceC11278c;
            this.f25464d = interfaceC11284d;
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: a */
        public void mo10845a() {
            this.f25464d.mo11202b(new C11334a(this, this.f25463c));
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: b */
        public void mo10844b(Throwable th) {
            this.f25463c.mo10844b(th);
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: d */
        public void mo10616d(c cVar) {
            if (EnumC11296c.m11149m(this, cVar)) {
                this.f25463c.mo10616d(this);
            }
        }

        /* renamed from: i */
        public void m11089i() {
            EnumC11296c.m11156a(this);
        }

        /* renamed from: j */
        public boolean m11088j() {
            return EnumC11296c.m11155b(get());
        }
    }

    public C11333a(InterfaceC11284d interfaceC11284d, InterfaceC11284d interfaceC11284d2) {
        this.f25459c = interfaceC11284d;
        this.f25460d = interfaceC11284d2;
    }

    @Override // p425j.p444e.AbstractC11271b
    /* renamed from: r */
    protected void mo10805r(InterfaceC11278c interfaceC11278c) {
        this.f25459c.mo11202b(new C11335b(interfaceC11278c, this.f25460d));
    }
}
