package com.google.firebase.inappmessaging.display.internal.p149r.p151b;

import android.app.Application;
import android.util.DisplayMetrics;
import com.google.firebase.inappmessaging.display.p145i.p146a.C6033d;
import p472k.p473a.InterfaceC11700a;
/* compiled from: InflaterConfigModule_ProvidesDisplayMetricsFactory.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.r.b.l */
/* loaded from: classes2.dex */
public final class C6116l implements Object<DisplayMetrics> {

    /* renamed from: a */
    private final C6110g f14951a;

    /* renamed from: b */
    private final InterfaceC11700a<Application> f14952b;

    public C6116l(C6110g c6110g, InterfaceC11700a<Application> interfaceC11700a) {
        this.f14951a = c6110g;
        this.f14952b = interfaceC11700a;
    }

    /* renamed from: a */
    public static C6116l m22697a(C6110g c6110g, InterfaceC11700a<Application> interfaceC11700a) {
        return new C6116l(c6110g, interfaceC11700a);
    }

    /* renamed from: c */
    public static DisplayMetrics m22695c(C6110g c6110g, Application application) {
        DisplayMetrics m22714f = c6110g.m22714f(application);
        C6033d.m22945c(m22714f, "Cannot return null from a non-@Nullable @Provides method");
        return m22714f;
    }

    /* renamed from: b */
    public DisplayMetrics get() {
        return m22695c(this.f14951a, this.f14952b.get());
    }
}
