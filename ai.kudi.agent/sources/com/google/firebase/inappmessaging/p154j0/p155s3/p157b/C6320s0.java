package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.C5988g;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import com.google.firebase.inappmessaging.p154j0.C6168d3;
import com.google.firebase.inappmessaging.p154j0.C6236p2;
import com.google.firebase.inappmessaging.p154j0.p158t3.InterfaceC6332a;
import com.google.firebase.installations.InterfaceC6432h;
import p272h.p286c.p287a.p288a.InterfaceC8241g;
import p472k.p473a.InterfaceC11700a;
/* compiled from: TransportClientModule_ProvidesMetricsLoggerClientFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.s0 */
/* loaded from: classes2.dex */
public final class C6320s0 implements InterfaceC6144b<C6168d3> {

    /* renamed from: a */
    private final InterfaceC11700a<C5988g> f15324a;

    /* renamed from: b */
    private final InterfaceC11700a<InterfaceC8241g> f15325b;

    /* renamed from: c */
    private final InterfaceC11700a<InterfaceC5174a> f15326c;

    /* renamed from: d */
    private final InterfaceC11700a<InterfaceC6432h> f15327d;

    /* renamed from: e */
    private final InterfaceC11700a<InterfaceC6332a> f15328e;

    /* renamed from: f */
    private final InterfaceC11700a<C6236p2> f15329f;

    public C6320s0(InterfaceC11700a<C5988g> interfaceC11700a, InterfaceC11700a<InterfaceC8241g> interfaceC11700a2, InterfaceC11700a<InterfaceC5174a> interfaceC11700a3, InterfaceC11700a<InterfaceC6432h> interfaceC11700a4, InterfaceC11700a<InterfaceC6332a> interfaceC11700a5, InterfaceC11700a<C6236p2> interfaceC11700a6) {
        this.f15324a = interfaceC11700a;
        this.f15325b = interfaceC11700a2;
        this.f15326c = interfaceC11700a3;
        this.f15327d = interfaceC11700a4;
        this.f15328e = interfaceC11700a5;
        this.f15329f = interfaceC11700a6;
    }

    /* renamed from: a */
    public static C6320s0 m22304a(InterfaceC11700a<C5988g> interfaceC11700a, InterfaceC11700a<InterfaceC8241g> interfaceC11700a2, InterfaceC11700a<InterfaceC5174a> interfaceC11700a3, InterfaceC11700a<InterfaceC6432h> interfaceC11700a4, InterfaceC11700a<InterfaceC6332a> interfaceC11700a5, InterfaceC11700a<C6236p2> interfaceC11700a6) {
        return new C6320s0(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6);
    }

    /* renamed from: c */
    public static C6168d3 m22302c(C5988g c5988g, InterfaceC8241g interfaceC8241g, InterfaceC5174a interfaceC5174a, InterfaceC6432h interfaceC6432h, InterfaceC6332a interfaceC6332a, C6236p2 c6236p2) {
        C6168d3 m22308c = C6318r0.m22308c(c5988g, interfaceC8241g, interfaceC5174a, interfaceC6432h, interfaceC6332a, c6236p2);
        C6146d.m22627c(m22308c, "Cannot return null from a non-@Nullable @Provides method");
        return m22308c;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C6168d3 get() {
        return m22302c(this.f15324a.get(), this.f15325b.get(), this.f15326c.get(), this.f15327d.get(), this.f15328e.get(), this.f15329f.get());
    }
}
