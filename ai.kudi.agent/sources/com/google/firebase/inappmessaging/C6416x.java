package com.google.firebase.inappmessaging;

import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import com.google.firebase.inappmessaging.p154j0.C6175e3;
import com.google.firebase.inappmessaging.p154j0.C6231o2;
import com.google.firebase.inappmessaging.p154j0.C6236p2;
import com.google.firebase.inappmessaging.p154j0.C6247q2;
import com.google.firebase.inappmessaging.p154j0.C6357z2;
import com.google.firebase.installations.InterfaceC6432h;
import p472k.p473a.InterfaceC11700a;
/* compiled from: FirebaseInAppMessaging_Factory.java */
/* renamed from: com.google.firebase.inappmessaging.x */
/* loaded from: classes2.dex */
public final class C6416x implements InterfaceC6144b<C6408r> {

    /* renamed from: a */
    private final InterfaceC11700a<C6357z2> f15498a;

    /* renamed from: b */
    private final InterfaceC11700a<C6175e3> f15499b;

    /* renamed from: c */
    private final InterfaceC11700a<C6231o2> f15500c;

    /* renamed from: d */
    private final InterfaceC11700a<InterfaceC6432h> f15501d;

    /* renamed from: e */
    private final InterfaceC11700a<C6247q2> f15502e;

    /* renamed from: f */
    private final InterfaceC11700a<C6236p2> f15503f;

    public C6416x(InterfaceC11700a<C6357z2> interfaceC11700a, InterfaceC11700a<C6175e3> interfaceC11700a2, InterfaceC11700a<C6231o2> interfaceC11700a3, InterfaceC11700a<InterfaceC6432h> interfaceC11700a4, InterfaceC11700a<C6247q2> interfaceC11700a5, InterfaceC11700a<C6236p2> interfaceC11700a6) {
        this.f15498a = interfaceC11700a;
        this.f15499b = interfaceC11700a2;
        this.f15500c = interfaceC11700a3;
        this.f15501d = interfaceC11700a4;
        this.f15502e = interfaceC11700a5;
        this.f15503f = interfaceC11700a6;
    }

    /* renamed from: a */
    public static C6416x m22084a(InterfaceC11700a<C6357z2> interfaceC11700a, InterfaceC11700a<C6175e3> interfaceC11700a2, InterfaceC11700a<C6231o2> interfaceC11700a3, InterfaceC11700a<InterfaceC6432h> interfaceC11700a4, InterfaceC11700a<C6247q2> interfaceC11700a5, InterfaceC11700a<C6236p2> interfaceC11700a6) {
        return new C6416x(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6);
    }

    /* renamed from: c */
    public static C6408r m22082c(C6357z2 c6357z2, C6175e3 c6175e3, C6231o2 c6231o2, InterfaceC6432h interfaceC6432h, C6247q2 c6247q2, C6236p2 c6236p2) {
        return new C6408r(c6357z2, c6175e3, c6231o2, interfaceC6432h, c6247q2, c6236p2);
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C6408r get() {
        return m22082c(this.f15498a.get(), this.f15499b.get(), this.f15500c.get(), this.f15501d.get(), this.f15502e.get(), this.f15503f.get());
    }
}
