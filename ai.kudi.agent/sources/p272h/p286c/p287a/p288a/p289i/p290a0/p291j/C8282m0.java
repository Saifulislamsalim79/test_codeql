package p272h.p286c.p287a.p288a.p289i.p290a0.p291j;

import android.content.Context;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.C8365d;
import p272h.p286c.p287a.p288a.p289i.p294w.p295b.InterfaceC8363b;
import p472k.p473a.InterfaceC11700a;
/* compiled from: EventStoreModule_PackageNameFactory.java */
/* renamed from: h.c.a.a.i.a0.j.m0 */
/* loaded from: classes2.dex */
public final class C8282m0 implements InterfaceC8363b<String> {

    /* renamed from: a */
    private final InterfaceC11700a<Context> f19882a;

    public C8282m0(InterfaceC11700a<Context> interfaceC11700a) {
        this.f19882a = interfaceC11700a;
    }

    /* renamed from: a */
    public static C8282m0 m16402a(InterfaceC11700a<Context> interfaceC11700a) {
        return new C8282m0(interfaceC11700a);
    }

    /* renamed from: c */
    public static String m16400c(Context context) {
        String m16409b = AbstractC8277k0.m16409b(context);
        C8365d.m16208c(m16409b, "Cannot return null from a non-@Nullable @Provides method");
        return m16409b;
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: b */
    public String get() {
        return m16400c(this.f19882a.get());
    }
}
