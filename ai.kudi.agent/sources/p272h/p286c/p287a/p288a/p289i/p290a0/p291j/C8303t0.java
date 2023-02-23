package p272h.p286c.p287a.p288a.p289i.p290a0.p291j;

import android.content.Context;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.InterfaceC8363b;
import p472k.p473a.InterfaceC11700a;
/* compiled from: SchemaManager_Factory.java */
/* renamed from: h.c.a.a.i.a0.j.t0 */
/* loaded from: classes2.dex */
public final class C8303t0 implements InterfaceC8363b<C8300s0> {

    /* renamed from: a */
    private final InterfaceC11700a<Context> f19917a;

    /* renamed from: b */
    private final InterfaceC11700a<String> f19918b;

    /* renamed from: c */
    private final InterfaceC11700a<Integer> f19919c;

    public C8303t0(InterfaceC11700a<Context> interfaceC11700a, InterfaceC11700a<String> interfaceC11700a2, InterfaceC11700a<Integer> interfaceC11700a3) {
        this.f19917a = interfaceC11700a;
        this.f19918b = interfaceC11700a2;
        this.f19919c = interfaceC11700a3;
    }

    /* renamed from: a */
    public static C8303t0 m16317a(InterfaceC11700a<Context> interfaceC11700a, InterfaceC11700a<String> interfaceC11700a2, InterfaceC11700a<Integer> interfaceC11700a3) {
        return new C8303t0(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
    }

    /* renamed from: c */
    public static C8300s0 m16315c(Context context, String str, int i) {
        return new C8300s0(context, str, i);
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public C8300s0 get() {
        return m16315c(this.f19917a.get(), this.f19918b.get(), this.f19919c.get().intValue());
    }
}
