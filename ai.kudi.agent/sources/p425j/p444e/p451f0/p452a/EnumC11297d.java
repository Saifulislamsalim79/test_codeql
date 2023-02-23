package p425j.p444e.p451f0.p452a;

import p425j.p444e.InterfaceC11278c;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.InterfaceC11698y;
import p425j.p444e.p451f0.p454c.InterfaceC11317e;
/* compiled from: EmptyDisposable.java */
/* renamed from: j.e.f0.a.d */
/* loaded from: classes3.dex */
public enum EnumC11297d implements InterfaceC11317e<Object> {
    INSTANCE,
    NEVER;

    /* renamed from: a */
    public static void m11146a(InterfaceC11278c interfaceC11278c) {
        interfaceC11278c.mo10616d(INSTANCE);
        interfaceC11278c.mo10845a();
    }

    /* renamed from: b */
    public static void m11145b(InterfaceC11685m<?> interfaceC11685m) {
        interfaceC11685m.mo10548d(INSTANCE);
        interfaceC11685m.mo10551a();
    }

    /* renamed from: e */
    public static void m11144e(InterfaceC11695u<?> interfaceC11695u) {
        interfaceC11695u.mo332d(INSTANCE);
        interfaceC11695u.mo335a();
    }

    /* renamed from: g */
    public static void m11143g(Throwable th, InterfaceC11278c interfaceC11278c) {
        interfaceC11278c.mo10616d(INSTANCE);
        interfaceC11278c.mo10844b(th);
    }

    /* renamed from: h */
    public static void m11142h(Throwable th, InterfaceC11685m<?> interfaceC11685m) {
        interfaceC11685m.mo10548d(INSTANCE);
        interfaceC11685m.mo10550b(th);
    }

    /* renamed from: n */
    public static void m11139n(Throwable th, InterfaceC11695u<?> interfaceC11695u) {
        interfaceC11695u.mo332d(INSTANCE);
        interfaceC11695u.mo334b(th);
    }

    /* renamed from: p */
    public static void m11138p(Throwable th, InterfaceC11698y<?> interfaceC11698y) {
        interfaceC11698y.mo3150d(INSTANCE);
        interfaceC11698y.mo3152b(th);
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public void clear() {
    }

    /* renamed from: i */
    public void m11141i() {
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public boolean isEmpty() {
        return true;
    }

    /* renamed from: j */
    public boolean m11140j() {
        return this == INSTANCE;
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11318f
    /* renamed from: m */
    public int mo10681m(int i) {
        return i & 2;
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public Object poll() throws Exception {
        return null;
    }
}
