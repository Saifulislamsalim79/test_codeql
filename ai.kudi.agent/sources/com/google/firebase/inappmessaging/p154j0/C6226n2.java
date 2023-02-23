package com.google.firebase.inappmessaging.p154j0;

import android.app.Application;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import com.google.firebase.inappmessaging.p154j0.p158t3.InterfaceC6332a;
import p472k.p473a.InterfaceC11700a;
/* compiled from: CampaignCacheClient_Factory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.n2 */
/* loaded from: classes2.dex */
public final class C6226n2 implements InterfaceC6144b<C6221m2> {

    /* renamed from: a */
    private final InterfaceC11700a<C6181f3> f15118a;

    /* renamed from: b */
    private final InterfaceC11700a<Application> f15119b;

    /* renamed from: c */
    private final InterfaceC11700a<InterfaceC6332a> f15120c;

    public C6226n2(InterfaceC11700a<C6181f3> interfaceC11700a, InterfaceC11700a<Application> interfaceC11700a2, InterfaceC11700a<InterfaceC6332a> interfaceC11700a3) {
        this.f15118a = interfaceC11700a;
        this.f15119b = interfaceC11700a2;
        this.f15120c = interfaceC11700a3;
    }

    /* renamed from: a */
    public static C6226n2 m22516a(InterfaceC11700a<C6181f3> interfaceC11700a, InterfaceC11700a<Application> interfaceC11700a2, InterfaceC11700a<InterfaceC6332a> interfaceC11700a3) {
        return new C6226n2(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
    }

    /* renamed from: c */
    public static C6221m2 m22514c(C6181f3 c6181f3, Application application, InterfaceC6332a interfaceC6332a) {
        return new C6221m2(c6181f3, application, interfaceC6332a);
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C6221m2 get() {
        return m22514c(this.f15118a.get(), this.f15119b.get(), this.f15120c.get());
    }
}
