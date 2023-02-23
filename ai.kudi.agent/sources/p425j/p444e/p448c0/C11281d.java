package p425j.p444e.p448c0;

import p425j.p444e.p450e0.InterfaceC11287a;
import p425j.p444e.p451f0.p452a.EnumC11297d;
import p425j.p444e.p451f0.p453b.C11301a;
import p425j.p444e.p451f0.p453b.C11312b;
/* compiled from: Disposables.java */
/* renamed from: j.e.c0.d */
/* loaded from: classes3.dex */
public final class C11281d {
    /* renamed from: a */
    public static c m11210a() {
        return EnumC11297d.INSTANCE;
    }

    /* renamed from: b */
    public static c m11209b() {
        return m11207d(C11301a.f25430b);
    }

    /* renamed from: c */
    public static c m11208c(InterfaceC11287a interfaceC11287a) {
        C11312b.m11113d(interfaceC11287a, "run is null");
        return new C11279a(interfaceC11287a);
    }

    /* renamed from: d */
    public static c m11207d(Runnable runnable) {
        C11312b.m11113d(runnable, "run is null");
        return new C11283f(runnable);
    }
}
