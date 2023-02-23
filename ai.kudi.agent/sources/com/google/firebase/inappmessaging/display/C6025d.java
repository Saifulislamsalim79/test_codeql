package com.google.firebase.inappmessaging.display;

import android.app.Application;
import com.google.firebase.inappmessaging.C6408r;
import com.google.firebase.inappmessaging.display.internal.C6036a;
import com.google.firebase.inappmessaging.display.internal.C6038c;
import com.google.firebase.inappmessaging.display.internal.C6044e;
import com.google.firebase.inappmessaging.display.internal.C6048g;
import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.display.internal.C6066n;
import java.util.Map;
import p472k.p473a.InterfaceC11700a;
/* compiled from: FirebaseInAppMessagingDisplay_Factory.java */
/* renamed from: com.google.firebase.inappmessaging.display.d */
/* loaded from: classes2.dex */
public final class C6025d implements Object<C6015c> {

    /* renamed from: a */
    private final InterfaceC11700a<C6408r> f14722a;

    /* renamed from: b */
    private final InterfaceC11700a<Map<String, InterfaceC11700a<C6057l>>> f14723b;

    /* renamed from: c */
    private final InterfaceC11700a<C6044e> f14724c;

    /* renamed from: d */
    private final InterfaceC11700a<C6066n> f14725d;

    /* renamed from: e */
    private final InterfaceC11700a<C6066n> f14726e;

    /* renamed from: f */
    private final InterfaceC11700a<C6048g> f14727f;

    /* renamed from: g */
    private final InterfaceC11700a<Application> f14728g;

    /* renamed from: h */
    private final InterfaceC11700a<C6036a> f14729h;

    /* renamed from: i */
    private final InterfaceC11700a<C6038c> f14730i;

    public C6025d(InterfaceC11700a<C6408r> interfaceC11700a, InterfaceC11700a<Map<String, InterfaceC11700a<C6057l>>> interfaceC11700a2, InterfaceC11700a<C6044e> interfaceC11700a3, InterfaceC11700a<C6066n> interfaceC11700a4, InterfaceC11700a<C6066n> interfaceC11700a5, InterfaceC11700a<C6048g> interfaceC11700a6, InterfaceC11700a<Application> interfaceC11700a7, InterfaceC11700a<C6036a> interfaceC11700a8, InterfaceC11700a<C6038c> interfaceC11700a9) {
        this.f14722a = interfaceC11700a;
        this.f14723b = interfaceC11700a2;
        this.f14724c = interfaceC11700a3;
        this.f14725d = interfaceC11700a4;
        this.f14726e = interfaceC11700a5;
        this.f14727f = interfaceC11700a6;
        this.f14728g = interfaceC11700a7;
        this.f14729h = interfaceC11700a8;
        this.f14730i = interfaceC11700a9;
    }

    /* renamed from: a */
    public static C6025d m22957a(InterfaceC11700a<C6408r> interfaceC11700a, InterfaceC11700a<Map<String, InterfaceC11700a<C6057l>>> interfaceC11700a2, InterfaceC11700a<C6044e> interfaceC11700a3, InterfaceC11700a<C6066n> interfaceC11700a4, InterfaceC11700a<C6066n> interfaceC11700a5, InterfaceC11700a<C6048g> interfaceC11700a6, InterfaceC11700a<Application> interfaceC11700a7, InterfaceC11700a<C6036a> interfaceC11700a8, InterfaceC11700a<C6038c> interfaceC11700a9) {
        return new C6025d(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7, interfaceC11700a8, interfaceC11700a9);
    }

    /* renamed from: c */
    public static C6015c m22955c(C6408r c6408r, Map<String, InterfaceC11700a<C6057l>> map, C6044e c6044e, C6066n c6066n, C6066n c6066n2, C6048g c6048g, Application application, C6036a c6036a, C6038c c6038c) {
        return new C6015c(c6408r, map, c6044e, c6066n, c6066n2, c6048g, application, c6036a, c6038c);
    }

    /* renamed from: b */
    public C6015c get() {
        return m22955c(this.f14722a.get(), this.f14723b.get(), this.f14724c.get(), this.f14725d.get(), this.f14726e.get(), this.f14727f.get(), this.f14728g.get(), this.f14729h.get(), this.f14730i.get());
    }
}
