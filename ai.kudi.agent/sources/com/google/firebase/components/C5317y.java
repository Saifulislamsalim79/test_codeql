package com.google.firebase.components;

import com.google.firebase.p170o.InterfaceC6558a;
import com.google.firebase.p170o.InterfaceC6560b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OptionalProvider.java */
/* renamed from: com.google.firebase.components.y */
/* loaded from: classes2.dex */
public class C5317y<T> implements InterfaceC6560b<T>, InterfaceC6558a<T> {

    /* renamed from: c */
    private static final InterfaceC6558a.InterfaceC6559a<Object> f13159c = C5293k.f13116a;

    /* renamed from: d */
    private static final InterfaceC6560b<Object> f13160d = C5292j.f13115a;

    /* renamed from: a */
    private InterfaceC6558a.InterfaceC6559a<T> f13161a;

    /* renamed from: b */
    private volatile InterfaceC6560b<T> f13162b;

    private C5317y(InterfaceC6558a.InterfaceC6559a<T> interfaceC6559a, InterfaceC6560b<T> interfaceC6560b) {
        this.f13161a = interfaceC6559a;
        this.f13162b = interfaceC6560b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> C5317y<T> m25146b() {
        return new C5317y<>(f13159c, f13160d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ void m25145c(InterfaceC6560b interfaceC6560b) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ Object m25144d() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* synthetic */ void m25143e(InterfaceC6558a.InterfaceC6559a interfaceC6559a, InterfaceC6558a.InterfaceC6559a interfaceC6559a2, InterfaceC6560b interfaceC6560b) {
        interfaceC6559a.mo21638a(interfaceC6560b);
        interfaceC6559a2.mo21638a(interfaceC6560b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static <T> C5317y<T> m25142f(InterfaceC6560b<T> interfaceC6560b) {
        return new C5317y<>(null, interfaceC6560b);
    }

    @Override // com.google.firebase.p170o.InterfaceC6558a
    /* renamed from: a */
    public void mo21639a(final InterfaceC6558a.InterfaceC6559a<T> interfaceC6559a) {
        InterfaceC6560b<T> interfaceC6560b;
        InterfaceC6560b<T> interfaceC6560b2 = this.f13162b;
        if (interfaceC6560b2 != f13160d) {
            interfaceC6559a.mo21638a(interfaceC6560b2);
            return;
        }
        InterfaceC6560b<T> interfaceC6560b3 = null;
        synchronized (this) {
            interfaceC6560b = this.f13162b;
            if (interfaceC6560b != f13160d) {
                interfaceC6560b3 = interfaceC6560b;
            } else {
                final InterfaceC6558a.InterfaceC6559a<T> interfaceC6559a2 = this.f13161a;
                this.f13161a = new InterfaceC6558a.InterfaceC6559a() { // from class: com.google.firebase.components.i
                    @Override // com.google.firebase.p170o.InterfaceC6558a.InterfaceC6559a
                    /* renamed from: a */
                    public final void mo21638a(InterfaceC6560b interfaceC6560b4) {
                        C5317y.m25143e(InterfaceC6558a.InterfaceC6559a.this, interfaceC6559a, interfaceC6560b4);
                    }
                };
            }
        }
        if (interfaceC6560b3 != null) {
            interfaceC6559a.mo21638a(interfaceC6560b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m25141g(InterfaceC6560b<T> interfaceC6560b) {
        InterfaceC6558a.InterfaceC6559a<T> interfaceC6559a;
        if (this.f13162b == f13160d) {
            synchronized (this) {
                interfaceC6559a = this.f13161a;
                this.f13161a = null;
                this.f13162b = interfaceC6560b;
            }
            interfaceC6559a.mo21638a(interfaceC6560b);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    @Override // com.google.firebase.p170o.InterfaceC6560b
    public T get() {
        return this.f13162b.get();
    }
}
