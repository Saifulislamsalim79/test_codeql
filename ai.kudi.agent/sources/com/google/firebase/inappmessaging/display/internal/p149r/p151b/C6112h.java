package com.google.firebase.inappmessaging.display.internal.p149r.p151b;

import android.util.DisplayMetrics;
import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.display.p145i.p146a.C6033d;
import p472k.p473a.InterfaceC11700a;
/* compiled from: InflaterConfigModule_ProvidesBannerLandscapeLayoutConfigFactory.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.r.b.h */
/* loaded from: classes2.dex */
public final class C6112h implements Object<C6057l> {

    /* renamed from: a */
    private final C6110g f14943a;

    /* renamed from: b */
    private final InterfaceC11700a<DisplayMetrics> f14944b;

    public C6112h(C6110g c6110g, InterfaceC11700a<DisplayMetrics> interfaceC11700a) {
        this.f14943a = c6110g;
        this.f14944b = interfaceC11700a;
    }

    /* renamed from: a */
    public static C6112h m22709a(C6110g c6110g, InterfaceC11700a<DisplayMetrics> interfaceC11700a) {
        return new C6112h(c6110g, interfaceC11700a);
    }

    /* renamed from: c */
    public static C6057l m22707c(C6110g c6110g, DisplayMetrics displayMetrics) {
        C6057l m22718b = c6110g.m22718b(displayMetrics);
        C6033d.m22945c(m22718b, "Cannot return null from a non-@Nullable @Provides method");
        return m22718b;
    }

    /* renamed from: b */
    public C6057l get() {
        return m22707c(this.f14943a, this.f14944b.get());
    }
}
