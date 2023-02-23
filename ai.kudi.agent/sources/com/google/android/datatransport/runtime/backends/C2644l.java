package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.InterfaceC8363b;
import p472k.p473a.InterfaceC11700a;
/* compiled from: MetadataBackendRegistry_Factory.java */
/* renamed from: com.google.android.datatransport.runtime.backends.l */
/* loaded from: classes2.dex */
public final class C2644l implements InterfaceC8363b<C2642k> {

    /* renamed from: a */
    private final InterfaceC11700a<Context> f7419a;

    /* renamed from: b */
    private final InterfaceC11700a<C2640i> f7420b;

    public C2644l(InterfaceC11700a<Context> interfaceC11700a, InterfaceC11700a<C2640i> interfaceC11700a2) {
        this.f7419a = interfaceC11700a;
        this.f7420b = interfaceC11700a2;
    }

    /* renamed from: a */
    public static C2644l m32450a(InterfaceC11700a<Context> interfaceC11700a, InterfaceC11700a<C2640i> interfaceC11700a2) {
        return new C2644l(interfaceC11700a, interfaceC11700a2);
    }

    /* renamed from: c */
    public static C2642k m32448c(Context context, Object obj) {
        return new C2642k(context, (C2640i) obj);
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C2642k get() {
        return m32448c(this.f7419a.get(), this.f7420b.get());
    }
}
