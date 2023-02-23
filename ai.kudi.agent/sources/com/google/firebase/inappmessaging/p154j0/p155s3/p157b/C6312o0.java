package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import j.e.v;
/* compiled from: SchedulerModule_ProvidesMainThreadSchedulerFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.o0 */
/* loaded from: classes2.dex */
public final class C6312o0 implements InterfaceC6144b<v> {

    /* renamed from: a */
    private final C6306l0 f15318a;

    public C6312o0(C6306l0 c6306l0) {
        this.f15318a = c6306l0;
    }

    /* renamed from: a */
    public static C6312o0 m22325a(C6306l0 c6306l0) {
        return new C6312o0(c6306l0);
    }

    /* renamed from: c */
    public static v m22323c(C6306l0 c6306l0) {
        v m22340c = c6306l0.m22340c();
        C6146d.m22627c(m22340c, "Cannot return null from a non-@Nullable @Provides method");
        return m22340c;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public v get() {
        return m22323c(this.f15318a);
    }
}
