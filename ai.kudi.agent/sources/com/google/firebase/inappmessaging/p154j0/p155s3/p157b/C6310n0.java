package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import j.e.v;
/* compiled from: SchedulerModule_ProvidesIOSchedulerFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.n0 */
/* loaded from: classes2.dex */
public final class C6310n0 implements InterfaceC6144b<v> {

    /* renamed from: a */
    private final C6306l0 f15315a;

    public C6310n0(C6306l0 c6306l0) {
        this.f15315a = c6306l0;
    }

    /* renamed from: a */
    public static C6310n0 m22330a(C6306l0 c6306l0) {
        return new C6310n0(c6306l0);
    }

    /* renamed from: c */
    public static v m22328c(C6306l0 c6306l0) {
        v m22341b = c6306l0.m22341b();
        C6146d.m22627c(m22341b, "Cannot return null from a non-@Nullable @Provides method");
        return m22341b;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public v get() {
        return m22328c(this.f15315a);
    }
}
