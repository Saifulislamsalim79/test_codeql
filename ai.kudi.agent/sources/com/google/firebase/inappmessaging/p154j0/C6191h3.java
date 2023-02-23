package com.google.firebase.inappmessaging.p154j0;

import android.app.Application;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import p472k.p473a.InterfaceC11700a;
/* compiled from: ProviderInstaller_Factory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.h3 */
/* loaded from: classes2.dex */
public final class C6191h3 implements InterfaceC6144b<C6186g3> {

    /* renamed from: a */
    private final InterfaceC11700a<Application> f15054a;

    public C6191h3(InterfaceC11700a<Application> interfaceC11700a) {
        this.f15054a = interfaceC11700a;
    }

    /* renamed from: a */
    public static C6191h3 m22594a(InterfaceC11700a<Application> interfaceC11700a) {
        return new C6191h3(interfaceC11700a);
    }

    /* renamed from: c */
    public static C6186g3 m22592c(Application application) {
        return new C6186g3(application);
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C6186g3 get() {
        return m22592c(this.f15054a.get());
    }
}
