package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import android.app.Application;
import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import p425j.p444e.p449d0.AbstractC11285a;
import p472k.p473a.InterfaceC11700a;
/* compiled from: ForegroundFlowableModule_ProvidesAppForegroundEventStreamFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.v */
/* loaded from: classes2.dex */
public final class C6323v implements InterfaceC6144b<AbstractC11285a<String>> {

    /* renamed from: a */
    private final C6322u f15331a;

    /* renamed from: b */
    private final InterfaceC11700a<Application> f15332b;

    public C6323v(C6322u c6322u, InterfaceC11700a<Application> interfaceC11700a) {
        this.f15331a = c6322u;
        this.f15332b = interfaceC11700a;
    }

    /* renamed from: a */
    public static C6323v m22297a(C6322u c6322u, InterfaceC11700a<Application> interfaceC11700a) {
        return new C6323v(c6322u, interfaceC11700a);
    }

    /* renamed from: c */
    public static AbstractC11285a<String> m22295c(C6322u c6322u, Application application) {
        AbstractC11285a<String> m22298a = c6322u.m22298a(application);
        C6146d.m22627c(m22298a, "Cannot return null from a non-@Nullable @Provides method");
        return m22298a;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public AbstractC11285a<String> get() {
        return m22295c(this.f15331a, this.f15332b.get());
    }
}
