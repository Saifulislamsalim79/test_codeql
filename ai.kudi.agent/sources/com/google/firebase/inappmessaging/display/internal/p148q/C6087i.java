package com.google.firebase.inappmessaging.display.internal.p148q;

import android.view.LayoutInflater;
import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.model.AbstractC6386i;
import p472k.p473a.InterfaceC11700a;
/* compiled from: ModalBindingWrapper_Factory.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.q.i */
/* loaded from: classes2.dex */
public final class C6087i implements Object<C6085h> {

    /* renamed from: a */
    private final InterfaceC11700a<C6057l> f14890a;

    /* renamed from: b */
    private final InterfaceC11700a<LayoutInflater> f14891b;

    /* renamed from: c */
    private final InterfaceC11700a<AbstractC6386i> f14892c;

    public C6087i(InterfaceC11700a<C6057l> interfaceC11700a, InterfaceC11700a<LayoutInflater> interfaceC11700a2, InterfaceC11700a<AbstractC6386i> interfaceC11700a3) {
        this.f14890a = interfaceC11700a;
        this.f14891b = interfaceC11700a2;
        this.f14892c = interfaceC11700a3;
    }

    /* renamed from: a */
    public static C6087i m22760a(InterfaceC11700a<C6057l> interfaceC11700a, InterfaceC11700a<LayoutInflater> interfaceC11700a2, InterfaceC11700a<AbstractC6386i> interfaceC11700a3) {
        return new C6087i(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
    }

    /* renamed from: c */
    public static C6085h m22758c(C6057l c6057l, LayoutInflater layoutInflater, AbstractC6386i abstractC6386i) {
        return new C6085h(c6057l, layoutInflater, abstractC6386i);
    }

    /* renamed from: b */
    public C6085h get() {
        return m22758c(this.f14890a.get(), this.f14891b.get(), this.f14892c.get());
    }
}
