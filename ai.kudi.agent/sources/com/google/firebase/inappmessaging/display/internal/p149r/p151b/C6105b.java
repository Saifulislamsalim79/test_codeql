package com.google.firebase.inappmessaging.display.internal.p149r.p151b;

import android.app.Application;
import com.google.firebase.inappmessaging.display.p145i.p146a.C6033d;
/* compiled from: ApplicationModule_ProvidesApplicationFactory.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.r.b.b */
/* loaded from: classes2.dex */
public final class C6105b implements Object<Application> {

    /* renamed from: a */
    private final C6104a f14933a;

    public C6105b(C6104a c6104a) {
        this.f14933a = c6104a;
    }

    /* renamed from: a */
    public static C6105b m22730a(C6104a c6104a) {
        return new C6105b(c6104a);
    }

    /* renamed from: c */
    public static Application m22728c(C6104a c6104a) {
        Application m22731a = c6104a.m22731a();
        C6033d.m22945c(m22731a, "Cannot return null from a non-@Nullable @Provides method");
        return m22731a;
    }

    /* renamed from: b */
    public Application get() {
        return m22728c(this.f14933a);
    }
}
