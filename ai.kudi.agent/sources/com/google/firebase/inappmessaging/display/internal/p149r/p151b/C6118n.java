package com.google.firebase.inappmessaging.display.internal.p149r.p151b;

import android.util.DisplayMetrics;
import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.display.p145i.p146a.C6033d;
import p472k.p473a.InterfaceC11700a;
/* compiled from: InflaterConfigModule_ProvidesModalLandscapeConfigFactory.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.r.b.n */
/* loaded from: classes2.dex */
public final class C6118n implements Object<C6057l> {

    /* renamed from: a */
    private final C6110g f14955a;

    /* renamed from: b */
    private final InterfaceC11700a<DisplayMetrics> f14956b;

    public C6118n(C6110g c6110g, InterfaceC11700a<DisplayMetrics> interfaceC11700a) {
        this.f14955a = c6110g;
        this.f14956b = interfaceC11700a;
    }

    /* renamed from: a */
    public static C6118n m22691a(C6110g c6110g, InterfaceC11700a<DisplayMetrics> interfaceC11700a) {
        return new C6118n(c6110g, interfaceC11700a);
    }

    /* renamed from: c */
    public static C6057l m22689c(C6110g c6110g, DisplayMetrics displayMetrics) {
        C6057l m22712h = c6110g.m22712h(displayMetrics);
        C6033d.m22945c(m22712h, "Cannot return null from a non-@Nullable @Provides method");
        return m22712h;
    }

    /* renamed from: b */
    public C6057l get() {
        return m22689c(this.f14955a, this.f14956b.get());
    }
}
