package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import j.e.v;
/* compiled from: SchedulerModule_ProvidesComputeSchedulerFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.m0 */
/* loaded from: classes2.dex */
public final class C6308m0 implements InterfaceC6144b<v> {

    /* renamed from: a */
    private final C6306l0 f15312a;

    public C6308m0(C6306l0 c6306l0) {
        this.f15312a = c6306l0;
    }

    /* renamed from: a */
    public static C6308m0 m22336a(C6306l0 c6306l0) {
        return new C6308m0(c6306l0);
    }

    /* renamed from: c */
    public static v m22334c(C6306l0 c6306l0) {
        v m22342a = c6306l0.m22342a();
        C6146d.m22627c(m22342a, "Cannot return null from a non-@Nullable @Provides method");
        return m22342a;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public v get() {
        return m22334c(this.f15312a);
    }
}
