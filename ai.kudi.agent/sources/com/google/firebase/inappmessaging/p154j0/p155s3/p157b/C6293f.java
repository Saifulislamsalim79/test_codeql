package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import com.google.firebase.inappmessaging.p154j0.C6202j2;
import p425j.p444e.p449d0.AbstractC11285a;
import p472k.p473a.InterfaceC11700a;
/* compiled from: AnalyticsEventsModule_ProvidesAnalyticsConnectorEventsFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.f */
/* loaded from: classes2.dex */
public final class C6293f implements InterfaceC6144b<AbstractC11285a<String>> {

    /* renamed from: a */
    private final C6291e f15289a;

    /* renamed from: b */
    private final InterfaceC11700a<C6202j2> f15290b;

    public C6293f(C6291e c6291e, InterfaceC11700a<C6202j2> interfaceC11700a) {
        this.f15289a = c6291e;
        this.f15290b = interfaceC11700a;
    }

    /* renamed from: a */
    public static C6293f m22380a(C6291e c6291e, InterfaceC11700a<C6202j2> interfaceC11700a) {
        return new C6293f(c6291e, interfaceC11700a);
    }

    /* renamed from: c */
    public static AbstractC11285a<String> m22378c(C6291e c6291e, C6202j2 c6202j2) {
        AbstractC11285a<String> m22385a = c6291e.m22385a(c6202j2);
        C6146d.m22627c(m22385a, "Cannot return null from a non-@Nullable @Provides method");
        return m22385a;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public AbstractC11285a<String> get() {
        return m22378c(this.f15289a, this.f15290b.get());
    }
}
