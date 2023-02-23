package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import android.app.Application;
import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import com.google.firebase.inappmessaging.p154j0.C6181f3;
import p472k.p473a.InterfaceC11700a;
/* compiled from: ProtoStorageClientModule_ProvidesProtoStorageClientForImpressionStoreFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.h0 */
/* loaded from: classes2.dex */
public final class C6298h0 implements InterfaceC6144b<C6181f3> {

    /* renamed from: a */
    private final C6294f0 f15298a;

    /* renamed from: b */
    private final InterfaceC11700a<Application> f15299b;

    public C6298h0(C6294f0 c6294f0, InterfaceC11700a<Application> interfaceC11700a) {
        this.f15298a = c6294f0;
        this.f15299b = interfaceC11700a;
    }

    /* renamed from: a */
    public static C6298h0 m22362a(C6294f0 c6294f0, InterfaceC11700a<Application> interfaceC11700a) {
        return new C6298h0(c6294f0, interfaceC11700a);
    }

    /* renamed from: c */
    public static C6181f3 m22360c(C6294f0 c6294f0, Application application) {
        C6181f3 m22376b = c6294f0.m22376b(application);
        C6146d.m22627c(m22376b, "Cannot return null from a non-@Nullable @Provides method");
        return m22376b;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C6181f3 get() {
        return m22360c(this.f15298a, this.f15299b.get());
    }
}
