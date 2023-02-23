package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import com.google.firebase.installations.InterfaceC6432h;
/* compiled from: ApiClientModule_ProvidesFirebaseInstallationsFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.l */
/* loaded from: classes2.dex */
public final class C6305l implements InterfaceC6144b<InterfaceC6432h> {

    /* renamed from: a */
    private final C6297h f15310a;

    public C6305l(C6297h c6297h) {
        this.f15310a = c6297h;
    }

    /* renamed from: a */
    public static C6305l m22345a(C6297h c6297h) {
        return new C6305l(c6297h);
    }

    /* renamed from: c */
    public static InterfaceC6432h m22343c(C6297h c6297h) {
        InterfaceC6432h m22365d = c6297h.m22365d();
        C6146d.m22627c(m22365d, "Cannot return null from a non-@Nullable @Provides method");
        return m22365d;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public InterfaceC6432h get() {
        return m22343c(this.f15310a);
    }
}
