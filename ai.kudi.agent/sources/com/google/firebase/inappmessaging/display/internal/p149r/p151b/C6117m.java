package com.google.firebase.inappmessaging.display.internal.p149r.p151b;

import android.util.DisplayMetrics;
import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.display.p145i.p146a.C6033d;
import p472k.p473a.InterfaceC11700a;
/* compiled from: InflaterConfigModule_ProvidesLandscapeImageLayoutConfigFactory.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.r.b.m */
/* loaded from: classes2.dex */
public final class C6117m implements Object<C6057l> {

    /* renamed from: a */
    private final C6110g f14953a;

    /* renamed from: b */
    private final InterfaceC11700a<DisplayMetrics> f14954b;

    public C6117m(C6110g c6110g, InterfaceC11700a<DisplayMetrics> interfaceC11700a) {
        this.f14953a = c6110g;
        this.f14954b = interfaceC11700a;
    }

    /* renamed from: a */
    public static C6117m m22694a(C6110g c6110g, InterfaceC11700a<DisplayMetrics> interfaceC11700a) {
        return new C6117m(c6110g, interfaceC11700a);
    }

    /* renamed from: c */
    public static C6057l m22692c(C6110g c6110g, DisplayMetrics displayMetrics) {
        C6057l m22713g = c6110g.m22713g(displayMetrics);
        C6033d.m22945c(m22713g, "Cannot return null from a non-@Nullable @Provides method");
        return m22713g;
    }

    /* renamed from: b */
    public C6057l get() {
        return m22692c(this.f14953a, this.f14954b.get());
    }
}
