package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import android.app.Application;
import com.google.firebase.inappmessaging.p152i0.InterfaceC6142a;
import com.google.firebase.inappmessaging.p152i0.p153b.C6143a;
import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import com.google.firebase.inappmessaging.p154j0.C6186g3;
import com.google.firebase.inappmessaging.p154j0.C6208k2;
import com.google.firebase.inappmessaging.p154j0.C6341v2;
import p472k.p473a.InterfaceC11700a;
/* compiled from: ApiClientModule_ProvidesApiClientFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.i */
/* loaded from: classes2.dex */
public final class C6299i implements InterfaceC6144b<C6208k2> {

    /* renamed from: a */
    private final C6297h f15300a;

    /* renamed from: b */
    private final InterfaceC11700a<C6341v2> f15301b;

    /* renamed from: c */
    private final InterfaceC11700a<Application> f15302c;

    /* renamed from: d */
    private final InterfaceC11700a<C6186g3> f15303d;

    public C6299i(C6297h c6297h, InterfaceC11700a<C6341v2> interfaceC11700a, InterfaceC11700a<Application> interfaceC11700a2, InterfaceC11700a<C6186g3> interfaceC11700a3) {
        this.f15300a = c6297h;
        this.f15301b = interfaceC11700a;
        this.f15302c = interfaceC11700a2;
        this.f15303d = interfaceC11700a3;
    }

    /* renamed from: a */
    public static C6299i m22359a(C6297h c6297h, InterfaceC11700a<C6341v2> interfaceC11700a, InterfaceC11700a<Application> interfaceC11700a2, InterfaceC11700a<C6186g3> interfaceC11700a3) {
        return new C6299i(c6297h, interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
    }

    /* renamed from: c */
    public static C6208k2 m22357c(C6297h c6297h, InterfaceC6142a<C6341v2> interfaceC6142a, Application application, C6186g3 c6186g3) {
        C6208k2 m22368a = c6297h.m22368a(interfaceC6142a, application, c6186g3);
        C6146d.m22627c(m22368a, "Cannot return null from a non-@Nullable @Provides method");
        return m22368a;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C6208k2 get() {
        return m22357c(this.f15300a, C6143a.m22633a(this.f15301b), this.f15302c.get(), this.f15303d.get());
    }
}
