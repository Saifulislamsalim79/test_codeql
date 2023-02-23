package p272h.p286c.p287a.p288a.p289i;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.C2671t;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C2673v;
import p272h.p286c.p287a.p288a.p289i.p290a0.InterfaceC8248e;
import p272h.p286c.p287a.p288a.p289i.p292b0.InterfaceC8318a;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.InterfaceC8363b;
import p472k.p473a.InterfaceC11700a;
/* compiled from: TransportRuntime_Factory.java */
/* renamed from: h.c.a.a.i.v */
/* loaded from: classes2.dex */
public final class C8360v implements InterfaceC8363b<C8357t> {

    /* renamed from: a */
    private final InterfaceC11700a<InterfaceC8318a> f20014a;

    /* renamed from: b */
    private final InterfaceC11700a<InterfaceC8318a> f20015b;

    /* renamed from: c */
    private final InterfaceC11700a<InterfaceC8248e> f20016c;

    /* renamed from: d */
    private final InterfaceC11700a<C2671t> f20017d;

    /* renamed from: e */
    private final InterfaceC11700a<C2673v> f20018e;

    public C8360v(InterfaceC11700a<InterfaceC8318a> interfaceC11700a, InterfaceC11700a<InterfaceC8318a> interfaceC11700a2, InterfaceC11700a<InterfaceC8248e> interfaceC11700a3, InterfaceC11700a<C2671t> interfaceC11700a4, InterfaceC11700a<C2673v> interfaceC11700a5) {
        this.f20014a = interfaceC11700a;
        this.f20015b = interfaceC11700a2;
        this.f20016c = interfaceC11700a3;
        this.f20017d = interfaceC11700a4;
        this.f20018e = interfaceC11700a5;
    }

    /* renamed from: a */
    public static C8360v m16217a(InterfaceC11700a<InterfaceC8318a> interfaceC11700a, InterfaceC11700a<InterfaceC8318a> interfaceC11700a2, InterfaceC11700a<InterfaceC8248e> interfaceC11700a3, InterfaceC11700a<C2671t> interfaceC11700a4, InterfaceC11700a<C2673v> interfaceC11700a5) {
        return new C8360v(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
    }

    /* renamed from: c */
    public static C8357t m16215c(InterfaceC8318a interfaceC8318a, InterfaceC8318a interfaceC8318a2, InterfaceC8248e interfaceC8248e, C2671t c2671t, C2673v c2673v) {
        return new C8357t(interfaceC8318a, interfaceC8318a2, interfaceC8248e, c2671t, c2673v);
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C8357t get() {
        return m16215c(this.f20014a.get(), this.f20015b.get(), this.f20016c.get(), this.f20017d.get(), this.f20018e.get());
    }
}
