package com.google.firebase.inappmessaging.display.internal.p149r.p151b;

import android.util.DisplayMetrics;
import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.display.p145i.p146a.C6033d;
import p472k.p473a.InterfaceC11700a;
/* compiled from: InflaterConfigModule_ProvidesBannerPortraitLayoutConfigFactory.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.r.b.i */
/* loaded from: classes2.dex */
public final class C6113i implements Object<C6057l> {

    /* renamed from: a */
    private final C6110g f14945a;

    /* renamed from: b */
    private final InterfaceC11700a<DisplayMetrics> f14946b;

    public C6113i(C6110g c6110g, InterfaceC11700a<DisplayMetrics> interfaceC11700a) {
        this.f14945a = c6110g;
        this.f14946b = interfaceC11700a;
    }

    /* renamed from: a */
    public static C6113i m22706a(C6110g c6110g, InterfaceC11700a<DisplayMetrics> interfaceC11700a) {
        return new C6113i(c6110g, interfaceC11700a);
    }

    /* renamed from: c */
    public static C6057l m22704c(C6110g c6110g, DisplayMetrics displayMetrics) {
        C6057l m22717c = c6110g.m22717c(displayMetrics);
        C6033d.m22945c(m22717c, "Cannot return null from a non-@Nullable @Provides method");
        return m22717c;
    }

    /* renamed from: b */
    public C6057l get() {
        return m22704c(this.f14945a, this.f14946b.get());
    }
}
