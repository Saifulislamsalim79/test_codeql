package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import com.google.firebase.inappmessaging.p154j0.C6175e3;
/* compiled from: ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggersFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.e0 */
/* loaded from: classes2.dex */
public final class C6292e0 implements InterfaceC6144b<C6175e3> {

    /* renamed from: a */
    private final C6288c0 f15288a;

    public C6292e0(C6288c0 c6288c0) {
        this.f15288a = c6288c0;
    }

    /* renamed from: a */
    public static C6292e0 m22383a(C6288c0 c6288c0) {
        return new C6292e0(c6288c0);
    }

    /* renamed from: c */
    public static C6175e3 m22381c(C6288c0 c6288c0) {
        C6175e3 m22389c = c6288c0.m22389c();
        C6146d.m22627c(m22389c, "Cannot return null from a non-@Nullable @Provides method");
        return m22389c;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C6175e3 get() {
        return m22381c(this.f15288a);
    }
}
