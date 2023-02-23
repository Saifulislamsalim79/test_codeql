package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import com.google.firebase.inappmessaging.p154j0.C6248q3;
/* compiled from: ApiClientModule_ProvidesSharedPreferencesUtilsFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.m */
/* loaded from: classes2.dex */
public final class C6307m implements InterfaceC6144b<C6248q3> {

    /* renamed from: a */
    private final C6297h f15311a;

    public C6307m(C6297h c6297h) {
        this.f15311a = c6297h;
    }

    /* renamed from: a */
    public static C6307m m22339a(C6297h c6297h) {
        return new C6307m(c6297h);
    }

    /* renamed from: c */
    public static C6248q3 m22337c(C6297h c6297h) {
        C6248q3 m22364e = c6297h.m22364e();
        C6146d.m22627c(m22364e, "Cannot return null from a non-@Nullable @Provides method");
        return m22364e;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C6248q3 get() {
        return m22337c(this.f15311a);
    }
}
