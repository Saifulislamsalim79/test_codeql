package p425j.p444e.p451f0.p456e.p457a;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import j.e.c0.c;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.InterfaceC11278c;
import p425j.p444e.InterfaceC11284d;
import p425j.p444e.p450e0.InterfaceC11292g;
/* compiled from: CompletableOnErrorComplete.java */
/* renamed from: j.e.f0.e.a.h */
/* loaded from: classes3.dex */
public final class C11343h extends AbstractC11271b {

    /* renamed from: c */
    final InterfaceC11284d f25475c;

    /* renamed from: d */
    final InterfaceC11292g<? super Throwable> f25476d;

    /* compiled from: CompletableOnErrorComplete.java */
    /* renamed from: j.e.f0.e.a.h$a */
    /* loaded from: classes3.dex */
    final class C11344a implements InterfaceC11278c {

        /* renamed from: c */
        private final InterfaceC11278c f25477c;

        C11344a(InterfaceC11278c interfaceC11278c) {
            this.f25477c = interfaceC11278c;
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: a */
        public void mo10845a() {
            this.f25477c.mo10845a();
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: b */
        public void mo10844b(Throwable th) {
            try {
                if (C11343h.this.f25476d.mo10557c(th)) {
                    this.f25477c.mo10845a();
                } else {
                    this.f25477c.mo10844b(th);
                }
            } catch (Throwable th2) {
                C11118a.m11646b(th2);
                this.f25477c.mo10844b(new CompositeException(th, th2));
            }
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: d */
        public void mo10616d(c cVar) {
            this.f25477c.mo10616d(cVar);
        }
    }

    public C11343h(InterfaceC11284d interfaceC11284d, InterfaceC11292g<? super Throwable> interfaceC11292g) {
        this.f25475c = interfaceC11284d;
        this.f25476d = interfaceC11292g;
    }

    @Override // p425j.p444e.AbstractC11271b
    /* renamed from: r */
    protected void mo10805r(InterfaceC11278c interfaceC11278c) {
        this.f25475c.mo11202b(new C11344a(interfaceC11278c));
    }
}
