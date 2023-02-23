package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.analytics.p111a.InterfaceC5174a;
import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import com.google.firebase.inappmessaging.p154j0.C6202j2;
import p472k.p473a.InterfaceC11700a;
/* compiled from: AnalyticsEventsModule_ProvidesAnalyticsEventsManagerFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.g */
/* loaded from: classes2.dex */
public final class C6295g implements InterfaceC6144b<C6202j2> {

    /* renamed from: a */
    private final C6291e f15291a;

    /* renamed from: b */
    private final InterfaceC11700a<InterfaceC5174a> f15292b;

    public C6295g(C6291e c6291e, InterfaceC11700a<InterfaceC5174a> interfaceC11700a) {
        this.f15291a = c6291e;
        this.f15292b = interfaceC11700a;
    }

    /* renamed from: a */
    public static C6295g m22374a(C6291e c6291e, InterfaceC11700a<InterfaceC5174a> interfaceC11700a) {
        return new C6295g(c6291e, interfaceC11700a);
    }

    /* renamed from: c */
    public static C6202j2 m22372c(C6291e c6291e, InterfaceC5174a interfaceC5174a) {
        C6202j2 m22384b = c6291e.m22384b(interfaceC5174a);
        C6146d.m22627c(m22384b, "Cannot return null from a non-@Nullable @Provides method");
        return m22384b;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C6202j2 get() {
        return m22372c(this.f15291a, this.f15292b.get());
    }
}
