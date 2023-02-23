package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.InterfaceC2634e;
import com.google.android.datatransport.runtime.synchronization.InterfaceC2676a;
import java.util.concurrent.Executor;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8270h0;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8272i0;
import p272h.p286c.p287a.p288a.p289i.p292b0.InterfaceC8318a;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.InterfaceC8363b;
import p472k.p473a.InterfaceC11700a;
/* compiled from: Uploader_Factory.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.u */
/* loaded from: classes2.dex */
public final class C2672u implements InterfaceC8363b<C2671t> {

    /* renamed from: a */
    private final InterfaceC11700a<Context> f7481a;

    /* renamed from: b */
    private final InterfaceC11700a<InterfaceC2634e> f7482b;

    /* renamed from: c */
    private final InterfaceC11700a<InterfaceC8272i0> f7483c;

    /* renamed from: d */
    private final InterfaceC11700a<InterfaceC2675x> f7484d;

    /* renamed from: e */
    private final InterfaceC11700a<Executor> f7485e;

    /* renamed from: f */
    private final InterfaceC11700a<InterfaceC2676a> f7486f;

    /* renamed from: g */
    private final InterfaceC11700a<InterfaceC8318a> f7487g;

    /* renamed from: h */
    private final InterfaceC11700a<InterfaceC8318a> f7488h;

    /* renamed from: i */
    private final InterfaceC11700a<InterfaceC8270h0> f7489i;

    public C2672u(InterfaceC11700a<Context> interfaceC11700a, InterfaceC11700a<InterfaceC2634e> interfaceC11700a2, InterfaceC11700a<InterfaceC8272i0> interfaceC11700a3, InterfaceC11700a<InterfaceC2675x> interfaceC11700a4, InterfaceC11700a<Executor> interfaceC11700a5, InterfaceC11700a<InterfaceC2676a> interfaceC11700a6, InterfaceC11700a<InterfaceC8318a> interfaceC11700a7, InterfaceC11700a<InterfaceC8318a> interfaceC11700a8, InterfaceC11700a<InterfaceC8270h0> interfaceC11700a9) {
        this.f7481a = interfaceC11700a;
        this.f7482b = interfaceC11700a2;
        this.f7483c = interfaceC11700a3;
        this.f7484d = interfaceC11700a4;
        this.f7485e = interfaceC11700a5;
        this.f7486f = interfaceC11700a6;
        this.f7487g = interfaceC11700a7;
        this.f7488h = interfaceC11700a8;
        this.f7489i = interfaceC11700a9;
    }

    /* renamed from: a */
    public static C2672u m32408a(InterfaceC11700a<Context> interfaceC11700a, InterfaceC11700a<InterfaceC2634e> interfaceC11700a2, InterfaceC11700a<InterfaceC8272i0> interfaceC11700a3, InterfaceC11700a<InterfaceC2675x> interfaceC11700a4, InterfaceC11700a<Executor> interfaceC11700a5, InterfaceC11700a<InterfaceC2676a> interfaceC11700a6, InterfaceC11700a<InterfaceC8318a> interfaceC11700a7, InterfaceC11700a<InterfaceC8318a> interfaceC11700a8, InterfaceC11700a<InterfaceC8270h0> interfaceC11700a9) {
        return new C2672u(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7, interfaceC11700a8, interfaceC11700a9);
    }

    /* renamed from: c */
    public static C2671t m32406c(Context context, InterfaceC2634e interfaceC2634e, InterfaceC8272i0 interfaceC8272i0, InterfaceC2675x interfaceC2675x, Executor executor, InterfaceC2676a interfaceC2676a, InterfaceC8318a interfaceC8318a, InterfaceC8318a interfaceC8318a2, InterfaceC8270h0 interfaceC8270h0) {
        return new C2671t(context, interfaceC2634e, interfaceC8272i0, interfaceC2675x, executor, interfaceC2676a, interfaceC8318a, interfaceC8318a2, interfaceC8270h0);
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C2671t get() {
        return m32406c(this.f7481a.get(), this.f7482b.get(), this.f7483c.get(), this.f7484d.get(), this.f7485e.get(), this.f7486f.get(), this.f7487g.get(), this.f7488h.get(), this.f7489i.get());
    }
}
