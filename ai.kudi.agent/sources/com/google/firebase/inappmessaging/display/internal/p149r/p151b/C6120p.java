package com.google.firebase.inappmessaging.display.internal.p149r.p151b;

import android.util.DisplayMetrics;
import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.display.p145i.p146a.C6033d;
import p472k.p473a.InterfaceC11700a;
/* compiled from: InflaterConfigModule_ProvidesPortraitImageLayoutConfigFactory.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.r.b.p */
/* loaded from: classes2.dex */
public final class C6120p implements Object<C6057l> {

    /* renamed from: a */
    private final C6110g f14959a;

    /* renamed from: b */
    private final InterfaceC11700a<DisplayMetrics> f14960b;

    public C6120p(C6110g c6110g, InterfaceC11700a<DisplayMetrics> interfaceC11700a) {
        this.f14959a = c6110g;
        this.f14960b = interfaceC11700a;
    }

    /* renamed from: a */
    public static C6120p m22685a(C6110g c6110g, InterfaceC11700a<DisplayMetrics> interfaceC11700a) {
        return new C6120p(c6110g, interfaceC11700a);
    }

    /* renamed from: c */
    public static C6057l m22683c(C6110g c6110g, DisplayMetrics displayMetrics) {
        C6057l m22710j = c6110g.m22710j(displayMetrics);
        C6033d.m22945c(m22710j, "Cannot return null from a non-@Nullable @Provides method");
        return m22710j;
    }

    /* renamed from: b */
    public C6057l get() {
        return m22683c(this.f14959a, this.f14960b.get());
    }
}
