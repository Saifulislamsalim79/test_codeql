package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import com.google.firebase.inappmessaging.p152i0.p153b.C6146d;
import com.google.firebase.inappmessaging.p152i0.p153b.InterfaceC6144b;
import com.google.firebase.inappmessaging.p154j0.C6236p2;
/* compiled from: ApplicationModule_DeveloperListenerManagerFactory.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.s */
/* loaded from: classes2.dex */
public final class C6319s implements InterfaceC6144b<C6236p2> {

    /* renamed from: a */
    private final C6317r f15323a;

    public C6319s(C6317r c6317r) {
        this.f15323a = c6317r;
    }

    /* renamed from: a */
    public static C6319s m22307a(C6317r c6317r) {
        return new C6319s(c6317r);
    }

    /* renamed from: b */
    public static C6236p2 m22306b(C6317r c6317r) {
        C6236p2 m22312a = c6317r.m22312a();
        C6146d.m22627c(m22312a, "Cannot return null from a non-@Nullable @Provides method");
        return m22312a;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: c */
    public C6236p2 get() {
        return m22306b(this.f15323a);
    }
}
