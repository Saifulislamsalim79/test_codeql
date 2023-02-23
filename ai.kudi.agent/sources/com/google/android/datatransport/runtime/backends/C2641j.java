package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import p272h.p286c.p287a.p288a.p289i.p292b0.InterfaceC8318a;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.InterfaceC8363b;
import p472k.p473a.InterfaceC11700a;
/* compiled from: CreationContextFactory_Factory.java */
/* renamed from: com.google.android.datatransport.runtime.backends.j */
/* loaded from: classes2.dex */
public final class C2641j implements InterfaceC8363b<C2640i> {

    /* renamed from: a */
    private final InterfaceC11700a<Context> f7411a;

    /* renamed from: b */
    private final InterfaceC11700a<InterfaceC8318a> f7412b;

    /* renamed from: c */
    private final InterfaceC11700a<InterfaceC8318a> f7413c;

    public C2641j(InterfaceC11700a<Context> interfaceC11700a, InterfaceC11700a<InterfaceC8318a> interfaceC11700a2, InterfaceC11700a<InterfaceC8318a> interfaceC11700a3) {
        this.f7411a = interfaceC11700a;
        this.f7412b = interfaceC11700a2;
        this.f7413c = interfaceC11700a3;
    }

    /* renamed from: a */
    public static C2641j m32458a(InterfaceC11700a<Context> interfaceC11700a, InterfaceC11700a<InterfaceC8318a> interfaceC11700a2, InterfaceC11700a<InterfaceC8318a> interfaceC11700a3) {
        return new C2641j(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
    }

    /* renamed from: c */
    public static C2640i m32456c(Context context, InterfaceC8318a interfaceC8318a, InterfaceC8318a interfaceC8318a2) {
        return new C2640i(context, interfaceC8318a, interfaceC8318a2);
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C2640i get() {
        return m32456c(this.f7411a.get(), this.f7412b.get(), this.f7413c.get());
    }
}
