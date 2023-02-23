package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import p425j.p444e.p449d0.AbstractC11285a;
/* compiled from: ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggerStreamFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.d0 */
/* loaded from: classes2.dex */
public final class C6290d0 implements InterfaceC6144b<AbstractC11285a<String>> {

    /* renamed from: a */
    private final C6288c0 f15287a;

    public C6290d0(C6288c0 c6288c0) {
        this.f15287a = c6288c0;
    }

    /* renamed from: a */
    public static C6290d0 m22388a(C6288c0 c6288c0) {
        return new C6290d0(c6288c0);
    }

    /* renamed from: c */
    public static AbstractC11285a<String> m22386c(C6288c0 c6288c0) {
        AbstractC11285a<String> m22390b = c6288c0.m22390b();
        C6146d.m22627c(m22390b, "Cannot return null from a non-@Nullable @Provides method");
        return m22390b;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public AbstractC11285a<String> get() {
        return m22386c(this.f15287a);
    }
}
