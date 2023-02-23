package com.google.firebase.inappmessaging.display.internal.p148q;

import android.view.LayoutInflater;
import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.model.AbstractC6386i;
import p472k.p473a.InterfaceC11700a;
/* compiled from: CardBindingWrapper_Factory.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.q.e */
/* loaded from: classes2.dex */
public final class C6082e implements Object<C6080d> {

    /* renamed from: a */
    private final InterfaceC11700a<C6057l> f14869a;

    /* renamed from: b */
    private final InterfaceC11700a<LayoutInflater> f14870b;

    /* renamed from: c */
    private final InterfaceC11700a<AbstractC6386i> f14871c;

    public C6082e(InterfaceC11700a<C6057l> interfaceC11700a, InterfaceC11700a<LayoutInflater> interfaceC11700a2, InterfaceC11700a<AbstractC6386i> interfaceC11700a3) {
        this.f14869a = interfaceC11700a;
        this.f14870b = interfaceC11700a2;
        this.f14871c = interfaceC11700a3;
    }

    /* renamed from: a */
    public static C6082e m22776a(InterfaceC11700a<C6057l> interfaceC11700a, InterfaceC11700a<LayoutInflater> interfaceC11700a2, InterfaceC11700a<AbstractC6386i> interfaceC11700a3) {
        return new C6082e(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
    }

    /* renamed from: c */
    public static C6080d m22774c(C6057l c6057l, LayoutInflater layoutInflater, AbstractC6386i abstractC6386i) {
        return new C6080d(c6057l, layoutInflater, abstractC6386i);
    }

    /* renamed from: b */
    public C6080d get() {
        return m22774c(this.f14869a.get(), this.f14870b.get(), this.f14871c.get());
    }
}
