package com.google.firebase.inappmessaging.display.internal.p149r.p151b;

import android.app.Application;
import com.bumptech.glide.ComponentCallbacks2C1952h;
import com.google.firebase.inappmessaging.display.internal.C6054j;
import com.google.firebase.inappmessaging.display.p145i.p146a.C6033d;
import p472k.p473a.InterfaceC11700a;
/* compiled from: GlideModule_ProvidesGlideRequestManagerFactory.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.r.b.d */
/* loaded from: classes2.dex */
public final class C6107d implements Object<ComponentCallbacks2C1952h> {

    /* renamed from: a */
    private final C6106c f14934a;

    /* renamed from: b */
    private final InterfaceC11700a<Application> f14935b;

    /* renamed from: c */
    private final InterfaceC11700a<C6054j> f14936c;

    public C6107d(C6106c c6106c, InterfaceC11700a<Application> interfaceC11700a, InterfaceC11700a<C6054j> interfaceC11700a2) {
        this.f14934a = c6106c;
        this.f14935b = interfaceC11700a;
        this.f14936c = interfaceC11700a2;
    }

    /* renamed from: a */
    public static C6107d m22726a(C6106c c6106c, InterfaceC11700a<Application> interfaceC11700a, InterfaceC11700a<C6054j> interfaceC11700a2) {
        return new C6107d(c6106c, interfaceC11700a, interfaceC11700a2);
    }

    /* renamed from: c */
    public static ComponentCallbacks2C1952h m22724c(C6106c c6106c, Application application, C6054j c6054j) {
        ComponentCallbacks2C1952h m22727a = c6106c.m22727a(application, c6054j);
        C6033d.m22945c(m22727a, "Cannot return null from a non-@Nullable @Provides method");
        return m22727a;
    }

    /* renamed from: b */
    public ComponentCallbacks2C1952h get() {
        return m22724c(this.f14934a, this.f14935b.get(), this.f14936c.get());
    }
}
