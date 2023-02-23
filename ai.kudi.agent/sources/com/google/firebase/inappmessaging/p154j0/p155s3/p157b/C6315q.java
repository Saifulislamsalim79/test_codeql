package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import com.google.firebase.p167m.InterfaceC6473d;
/* compiled from: AppMeasurementModule_ProvidesSubsriberFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.q */
/* loaded from: classes2.dex */
public final class C6315q implements InterfaceC6144b<InterfaceC6473d> {

    /* renamed from: a */
    private final C6311o f15320a;

    public C6315q(C6311o c6311o) {
        this.f15320a = c6311o;
    }

    /* renamed from: a */
    public static C6315q m22318a(C6311o c6311o) {
        return new C6315q(c6311o);
    }

    /* renamed from: c */
    public static InterfaceC6473d m22316c(C6311o c6311o) {
        InterfaceC6473d m22326b = c6311o.m22326b();
        C6146d.m22627c(m22326b, "Cannot return null from a non-@Nullable @Provides method");
        return m22326b;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public InterfaceC6473d get() {
        return m22316c(this.f15320a);
    }
}
