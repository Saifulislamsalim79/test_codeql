package com.google.firebase.inappmessaging.display.internal.p149r.p151b;

import android.util.DisplayMetrics;
import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.display.p145i.p146a.C6033d;
import p472k.p473a.InterfaceC11700a;
/* compiled from: InflaterConfigModule_ProvidesModalPortraitConfigFactory.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.r.b.o */
/* loaded from: classes2.dex */
public final class C6119o implements Object<C6057l> {

    /* renamed from: a */
    private final C6110g f14957a;

    /* renamed from: b */
    private final InterfaceC11700a<DisplayMetrics> f14958b;

    public C6119o(C6110g c6110g, InterfaceC11700a<DisplayMetrics> interfaceC11700a) {
        this.f14957a = c6110g;
        this.f14958b = interfaceC11700a;
    }

    /* renamed from: a */
    public static C6119o m22688a(C6110g c6110g, InterfaceC11700a<DisplayMetrics> interfaceC11700a) {
        return new C6119o(c6110g, interfaceC11700a);
    }

    /* renamed from: c */
    public static C6057l m22686c(C6110g c6110g, DisplayMetrics displayMetrics) {
        C6057l m22711i = c6110g.m22711i(displayMetrics);
        C6033d.m22945c(m22711i, "Cannot return null from a non-@Nullable @Provides method");
        return m22711i;
    }

    /* renamed from: b */
    public C6057l get() {
        return m22686c(this.f14957a, this.f14958b.get());
    }
}
