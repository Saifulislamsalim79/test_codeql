package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
/* compiled from: GrpcChannelModule_ProvidesServiceHostFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.y */
/* loaded from: classes2.dex */
public final class C6326y implements InterfaceC6144b<String> {

    /* renamed from: a */
    private final C6324w f15335a;

    public C6326y(C6324w c6324w) {
        this.f15335a = c6324w;
    }

    /* renamed from: a */
    public static C6326y m22289a(C6324w c6324w) {
        return new C6326y(c6324w);
    }

    /* renamed from: c */
    public static String m22287c(C6324w c6324w) {
        String m22293b = c6324w.m22293b();
        C6146d.m22627c(m22293b, "Cannot return null from a non-@Nullable @Provides method");
        return m22293b;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public String get() {
        return m22287c(this.f15335a);
    }
}
