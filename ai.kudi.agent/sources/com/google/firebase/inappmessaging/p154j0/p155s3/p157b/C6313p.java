package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.analytics.p111a.InterfaceC5174a;
import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
/* compiled from: AppMeasurementModule_ProvidesAnalyticsConnectorFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.p */
/* loaded from: classes2.dex */
public final class C6313p implements InterfaceC6144b<InterfaceC5174a> {

    /* renamed from: a */
    private final C6311o f15319a;

    public C6313p(C6311o c6311o) {
        this.f15319a = c6311o;
    }

    /* renamed from: a */
    public static C6313p m22322a(C6311o c6311o) {
        return new C6313p(c6311o);
    }

    /* renamed from: c */
    public static InterfaceC5174a m22320c(C6311o c6311o) {
        InterfaceC5174a m22327a = c6311o.m22327a();
        C6146d.m22627c(m22327a, "Cannot return null from a non-@Nullable @Provides method");
        return m22327a;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public InterfaceC5174a get() {
        return m22320c(this.f15319a);
    }
}
