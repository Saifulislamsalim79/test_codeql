package com.uber.autodispose;

import p425j.p444e.AbstractC11293f;
import p425j.p444e.InterfaceC11284d;
import p577n.p586b.InterfaceC14455a;
import p577n.p586b.InterfaceC14456b;
/* compiled from: AutoDisposeFlowable.java */
/* renamed from: com.uber.autodispose.h */
/* loaded from: classes2.dex */
final class C7406h<T> extends AbstractC11293f<T> {

    /* renamed from: d */
    private final InterfaceC14455a<T> f17560d;

    /* renamed from: e */
    private final InterfaceC11284d f17561e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7406h(InterfaceC14455a<T> interfaceC14455a, InterfaceC11284d interfaceC11284d) {
        this.f17560d = interfaceC14455a;
        this.f17561e = interfaceC11284d;
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    protected void mo10791L(InterfaceC14456b<? super T> interfaceC14456b) {
        this.f17560d.mo1691a(new C7409k(this.f17561e, interfaceC14456b));
    }
}
