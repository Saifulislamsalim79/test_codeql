package com.google.firebase.inappmessaging.display.internal.p148q;

import android.view.LayoutInflater;
import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.model.AbstractC6386i;
import p472k.p473a.InterfaceC11700a;
/* compiled from: BannerBindingWrapper_Factory.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.q.b */
/* loaded from: classes2.dex */
public final class C6078b implements Object<C6077a> {

    /* renamed from: a */
    private final InterfaceC11700a<C6057l> f14851a;

    /* renamed from: b */
    private final InterfaceC11700a<LayoutInflater> f14852b;

    /* renamed from: c */
    private final InterfaceC11700a<AbstractC6386i> f14853c;

    public C6078b(InterfaceC11700a<C6057l> interfaceC11700a, InterfaceC11700a<LayoutInflater> interfaceC11700a2, InterfaceC11700a<AbstractC6386i> interfaceC11700a3) {
        this.f14851a = interfaceC11700a;
        this.f14852b = interfaceC11700a2;
        this.f14853c = interfaceC11700a3;
    }

    /* renamed from: a */
    public static C6078b m22791a(InterfaceC11700a<C6057l> interfaceC11700a, InterfaceC11700a<LayoutInflater> interfaceC11700a2, InterfaceC11700a<AbstractC6386i> interfaceC11700a3) {
        return new C6078b(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
    }

    /* renamed from: c */
    public static C6077a m22789c(C6057l c6057l, LayoutInflater layoutInflater, AbstractC6386i abstractC6386i) {
        return new C6077a(c6057l, layoutInflater, abstractC6386i);
    }

    /* renamed from: b */
    public C6077a get() {
        return m22789c(this.f14851a.get(), this.f14852b.get(), this.f14853c.get());
    }
}
