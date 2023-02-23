package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import com.google.firebase.inappmessaging.p154j0.p158t3.InterfaceC6332a;
/* compiled from: SystemClockModule_ProvidesSystemClockModuleFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.q0 */
/* loaded from: classes2.dex */
public final class C6316q0 implements InterfaceC6144b<InterfaceC6332a> {

    /* renamed from: a */
    private final C6314p0 f15321a;

    public C6316q0(C6314p0 c6314p0) {
        this.f15321a = c6314p0;
    }

    /* renamed from: a */
    public static C6316q0 m22315a(C6314p0 c6314p0) {
        return new C6316q0(c6314p0);
    }

    /* renamed from: c */
    public static InterfaceC6332a m22313c(C6314p0 c6314p0) {
        InterfaceC6332a m22319a = c6314p0.m22319a();
        C6146d.m22627c(m22319a, "Cannot return null from a non-@Nullable @Provides method");
        return m22319a;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public InterfaceC6332a get() {
        return m22313c(this.f15321a);
    }
}
