package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import android.app.Application;
import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import com.google.firebase.inappmessaging.p154j0.C6181f3;
import p472k.p473a.InterfaceC11700a;
/* compiled from: ProtoStorageClientModule_ProvidesProtoStorageClientForLimiterStoreFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.i0 */
/* loaded from: classes2.dex */
public final class C6300i0 implements InterfaceC6144b<C6181f3> {

    /* renamed from: a */
    private final C6294f0 f15304a;

    /* renamed from: b */
    private final InterfaceC11700a<Application> f15305b;

    public C6300i0(C6294f0 c6294f0, InterfaceC11700a<Application> interfaceC11700a) {
        this.f15304a = c6294f0;
        this.f15305b = interfaceC11700a;
    }

    /* renamed from: a */
    public static C6300i0 m22356a(C6294f0 c6294f0, InterfaceC11700a<Application> interfaceC11700a) {
        return new C6300i0(c6294f0, interfaceC11700a);
    }

    /* renamed from: c */
    public static C6181f3 m22354c(C6294f0 c6294f0, Application application) {
        C6181f3 m22375c = c6294f0.m22375c(application);
        C6146d.m22627c(m22375c, "Cannot return null from a non-@Nullable @Provides method");
        return m22375c;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C6181f3 get() {
        return m22354c(this.f15304a, this.f15305b.get());
    }
}
