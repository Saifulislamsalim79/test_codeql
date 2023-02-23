package com.google.firebase.inappmessaging.display.internal;

import android.app.Application;
import p472k.p473a.InterfaceC11700a;
/* compiled from: BindingWrapperFactory_Factory.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.b */
/* loaded from: classes2.dex */
public final class C6037b implements Object<C6036a> {

    /* renamed from: a */
    private final InterfaceC11700a<Application> f14741a;

    public C6037b(InterfaceC11700a<Application> interfaceC11700a) {
        this.f14741a = interfaceC11700a;
    }

    /* renamed from: a */
    public static C6037b m22936a(InterfaceC11700a<Application> interfaceC11700a) {
        return new C6037b(interfaceC11700a);
    }

    /* renamed from: c */
    public static C6036a m22934c(Application application) {
        return new C6036a(application);
    }

    /* renamed from: b */
    public C6036a get() {
        return m22934c(this.f14741a.get());
    }
}
