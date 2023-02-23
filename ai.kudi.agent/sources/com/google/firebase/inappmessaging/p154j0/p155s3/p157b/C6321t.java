package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import android.app.Application;
import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
/* compiled from: ApplicationModule_ProvidesApplicationFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.t */
/* loaded from: classes2.dex */
public final class C6321t implements InterfaceC6144b<Application> {

    /* renamed from: a */
    private final C6317r f15330a;

    public C6321t(C6317r c6317r) {
        this.f15330a = c6317r;
    }

    /* renamed from: a */
    public static C6321t m22301a(C6317r c6317r) {
        return new C6321t(c6317r);
    }

    /* renamed from: c */
    public static Application m22299c(C6317r c6317r) {
        Application m22311b = c6317r.m22311b();
        C6146d.m22627c(m22311b, "Cannot return null from a non-@Nullable @Provides method");
        return m22311b;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public Application get() {
        return m22299c(this.f15330a);
    }
}
