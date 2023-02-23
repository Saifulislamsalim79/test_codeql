package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.inappmessaging.p154j0.C6175e3;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.EnumC11269a;
import p425j.p444e.InterfaceC11672h;
import p425j.p444e.InterfaceC11675i;
import p425j.p444e.p449d0.AbstractC11285a;
/* compiled from: ProgrammaticContextualTriggerFlowableModule.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.c0 */
/* loaded from: classes2.dex */
public class C6288c0 {

    /* renamed from: a */
    private C6175e3 f15285a;

    public C6288c0(C6175e3 c6175e3) {
        this.f15285a = c6175e3;
    }

    /* renamed from: a */
    public /* synthetic */ void m22391a(final InterfaceC11672h interfaceC11672h) throws Exception {
        this.f15285a.m22600a(new C6175e3.InterfaceC6176a() { // from class: com.google.firebase.inappmessaging.j0.s3.b.b
        });
    }

    /* renamed from: b */
    public AbstractC11285a<String> m22390b() {
        AbstractC11285a<String> m11194E = AbstractC11293f.m11179f(new InterfaceC11675i() { // from class: com.google.firebase.inappmessaging.j0.s3.b.a
            @Override // p425j.p444e.InterfaceC11675i
            public final void subscribe(InterfaceC11672h interfaceC11672h) {
                C6288c0.this.m22391a(interfaceC11672h);
            }
        }, EnumC11269a.BUFFER).m11194E();
        m11194E.m11201Q();
        return m11194E;
    }

    /* renamed from: c */
    public C6175e3 m22389c() {
        return this.f15285a;
    }
}
