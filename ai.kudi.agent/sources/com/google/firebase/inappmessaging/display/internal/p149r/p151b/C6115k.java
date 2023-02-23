package com.google.firebase.inappmessaging.display.internal.p149r.p151b;

import android.util.DisplayMetrics;
import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.display.p145i.p146a.C6033d;
import p472k.p473a.InterfaceC11700a;
/* compiled from: InflaterConfigModule_ProvidesCardPortraitConfigFactory.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.r.b.k */
/* loaded from: classes2.dex */
public final class C6115k implements Object<C6057l> {

    /* renamed from: a */
    private final C6110g f14949a;

    /* renamed from: b */
    private final InterfaceC11700a<DisplayMetrics> f14950b;

    public C6115k(C6110g c6110g, InterfaceC11700a<DisplayMetrics> interfaceC11700a) {
        this.f14949a = c6110g;
        this.f14950b = interfaceC11700a;
    }

    /* renamed from: a */
    public static C6115k m22700a(C6110g c6110g, InterfaceC11700a<DisplayMetrics> interfaceC11700a) {
        return new C6115k(c6110g, interfaceC11700a);
    }

    /* renamed from: c */
    public static C6057l m22698c(C6110g c6110g, DisplayMetrics displayMetrics) {
        C6057l m22715e = c6110g.m22715e(displayMetrics);
        C6033d.m22945c(m22715e, "Cannot return null from a non-@Nullable @Provides method");
        return m22715e;
    }

    /* renamed from: b */
    public C6057l get() {
        return m22698c(this.f14949a, this.f14950b.get());
    }
}
