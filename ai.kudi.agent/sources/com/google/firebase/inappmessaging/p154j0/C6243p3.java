package com.google.firebase.inappmessaging.p154j0;

import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import j.e.v;
import p472k.p473a.InterfaceC11700a;
/* compiled from: Schedulers_Factory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.p3 */
/* loaded from: classes2.dex */
public final class C6243p3 implements InterfaceC6144b<C6232o3> {

    /* renamed from: a */
    private final InterfaceC11700a<v> f15148a;

    /* renamed from: b */
    private final InterfaceC11700a<v> f15149b;

    /* renamed from: c */
    private final InterfaceC11700a<v> f15150c;

    public C6243p3(InterfaceC11700a<v> interfaceC11700a, InterfaceC11700a<v> interfaceC11700a2, InterfaceC11700a<v> interfaceC11700a3) {
        this.f15148a = interfaceC11700a;
        this.f15149b = interfaceC11700a2;
        this.f15150c = interfaceC11700a3;
    }

    /* renamed from: a */
    public static C6243p3 m22490a(InterfaceC11700a<v> interfaceC11700a, InterfaceC11700a<v> interfaceC11700a2, InterfaceC11700a<v> interfaceC11700a3) {
        return new C6243p3(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
    }

    /* renamed from: c */
    public static C6232o3 m22488c(v vVar, v vVar2, v vVar3) {
        return new C6232o3(vVar, vVar2, vVar3);
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C6232o3 get() {
        return m22488c(this.f15148a.get(), this.f15149b.get(), this.f15150c.get());
    }
}
