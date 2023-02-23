package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.C5988g;
import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
/* compiled from: ApiClientModule_ProvidesFirebaseAppFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.k */
/* loaded from: classes2.dex */
public final class C6303k implements InterfaceC6144b<C5988g> {

    /* renamed from: a */
    private final C6297h f15309a;

    public C6303k(C6297h c6297h) {
        this.f15309a = c6297h;
    }

    /* renamed from: a */
    public static C6303k m22349a(C6297h c6297h) {
        return new C6303k(c6297h);
    }

    /* renamed from: c */
    public static C5988g m22347c(C6297h c6297h) {
        C5988g m22366c = c6297h.m22366c();
        C6146d.m22627c(m22366c, "Cannot return null from a non-@Nullable @Provides method");
        return m22366c;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C5988g get() {
        return m22347c(this.f15309a);
    }
}
