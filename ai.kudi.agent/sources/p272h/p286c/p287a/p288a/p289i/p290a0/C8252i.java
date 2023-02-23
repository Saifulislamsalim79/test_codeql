package p272h.p286c.p287a.p288a.p289i.p290a0;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2666s;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC2675x;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8272i0;
import p272h.p286c.p287a.p288a.p289i.p292b0.InterfaceC8318a;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.C8365d;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.InterfaceC8363b;
import p472k.p473a.InterfaceC11700a;
/* compiled from: SchedulingModule_WorkSchedulerFactory.java */
/* renamed from: h.c.a.a.i.a0.i */
/* loaded from: classes2.dex */
public final class C8252i implements InterfaceC8363b<InterfaceC2675x> {

    /* renamed from: a */
    private final InterfaceC11700a<Context> f19831a;

    /* renamed from: b */
    private final InterfaceC11700a<InterfaceC8272i0> f19832b;

    /* renamed from: c */
    private final InterfaceC11700a<AbstractC2666s> f19833c;

    /* renamed from: d */
    private final InterfaceC11700a<InterfaceC8318a> f19834d;

    public C8252i(InterfaceC11700a<Context> interfaceC11700a, InterfaceC11700a<InterfaceC8272i0> interfaceC11700a2, InterfaceC11700a<AbstractC2666s> interfaceC11700a3, InterfaceC11700a<InterfaceC8318a> interfaceC11700a4) {
        this.f19831a = interfaceC11700a;
        this.f19832b = interfaceC11700a2;
        this.f19833c = interfaceC11700a3;
        this.f19834d = interfaceC11700a4;
    }

    /* renamed from: a */
    public static C8252i m16425a(InterfaceC11700a<Context> interfaceC11700a, InterfaceC11700a<InterfaceC8272i0> interfaceC11700a2, InterfaceC11700a<AbstractC2666s> interfaceC11700a3, InterfaceC11700a<InterfaceC8318a> interfaceC11700a4) {
        return new C8252i(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
    }

    /* renamed from: c */
    public static InterfaceC2675x m16423c(Context context, InterfaceC8272i0 interfaceC8272i0, AbstractC2666s abstractC2666s, InterfaceC8318a interfaceC8318a) {
        InterfaceC2675x m16426a = AbstractC8251h.m16426a(context, interfaceC8272i0, abstractC2666s, interfaceC8318a);
        C8365d.m16208c(m16426a, "Cannot return null from a non-@Nullable @Provides method");
        return m16426a;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public InterfaceC2675x get() {
        return m16423c(this.f19831a.get(), this.f19832b.get(), this.f19833c.get(), this.f19834d.get());
    }
}
