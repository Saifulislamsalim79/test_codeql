package com.google.firebase.inappmessaging.display.internal.p149r.p151b;

import android.view.LayoutInflater;
import com.google.firebase.inappmessaging.display.p145i.p146a.C6033d;
/* compiled from: InflaterModule_ProvidesInflaterserviceFactory.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.r.b.t */
/* loaded from: classes2.dex */
public final class C6124t implements Object<LayoutInflater> {

    /* renamed from: a */
    private final C6121q f14966a;

    public C6124t(C6121q c6121q) {
        this.f14966a = c6121q;
    }

    /* renamed from: a */
    public static C6124t m22673a(C6121q c6121q) {
        return new C6124t(c6121q);
    }

    /* renamed from: c */
    public static LayoutInflater m22671c(C6121q c6121q) {
        LayoutInflater m22680c = c6121q.m22680c();
        C6033d.m22945c(m22680c, "Cannot return null from a non-@Nullable @Provides method");
        return m22680c;
    }

    /* renamed from: b */
    public LayoutInflater get() {
        return m22671c(this.f14966a);
    }
}
