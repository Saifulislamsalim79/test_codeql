package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import android.app.Application;
import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import com.google.firebase.inappmessaging.p154j0.C6181f3;
import p472k.p473a.InterfaceC11700a;
/* compiled from: ProtoStorageClientModule_ProvidesProtoStorageClientForCampaignFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.g0 */
/* loaded from: classes2.dex */
public final class C6296g0 implements InterfaceC6144b<C6181f3> {

    /* renamed from: a */
    private final C6294f0 f15293a;

    /* renamed from: b */
    private final InterfaceC11700a<Application> f15294b;

    public C6296g0(C6294f0 c6294f0, InterfaceC11700a<Application> interfaceC11700a) {
        this.f15293a = c6294f0;
        this.f15294b = interfaceC11700a;
    }

    /* renamed from: a */
    public static C6296g0 m22371a(C6294f0 c6294f0, InterfaceC11700a<Application> interfaceC11700a) {
        return new C6296g0(c6294f0, interfaceC11700a);
    }

    /* renamed from: c */
    public static C6181f3 m22369c(C6294f0 c6294f0, Application application) {
        C6181f3 m22377a = c6294f0.m22377a(application);
        C6146d.m22627c(m22377a, "Cannot return null from a non-@Nullable @Provides method");
        return m22377a;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C6181f3 get() {
        return m22369c(this.f15293a, this.f15294b.get());
    }
}
