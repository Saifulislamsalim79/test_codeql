package com.google.firebase.inappmessaging.display.internal.p149r.p151b;

import android.util.DisplayMetrics;
import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.display.p145i.p146a.C6033d;
import p472k.p473a.InterfaceC11700a;
/* compiled from: InflaterConfigModule_ProvidesCardLandscapeConfigFactory.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.r.b.j */
/* loaded from: classes2.dex */
public final class C6114j implements Object<C6057l> {

    /* renamed from: a */
    private final C6110g f14947a;

    /* renamed from: b */
    private final InterfaceC11700a<DisplayMetrics> f14948b;

    public C6114j(C6110g c6110g, InterfaceC11700a<DisplayMetrics> interfaceC11700a) {
        this.f14947a = c6110g;
        this.f14948b = interfaceC11700a;
    }

    /* renamed from: a */
    public static C6114j m22703a(C6110g c6110g, InterfaceC11700a<DisplayMetrics> interfaceC11700a) {
        return new C6114j(c6110g, interfaceC11700a);
    }

    /* renamed from: c */
    public static C6057l m22701c(C6110g c6110g, DisplayMetrics displayMetrics) {
        C6057l m22716d = c6110g.m22716d(displayMetrics);
        C6033d.m22945c(m22716d, "Cannot return null from a non-@Nullable @Provides method");
        return m22716d;
    }

    /* renamed from: b */
    public C6057l get() {
        return m22701c(this.f14947a, this.f14948b.get());
    }
}
