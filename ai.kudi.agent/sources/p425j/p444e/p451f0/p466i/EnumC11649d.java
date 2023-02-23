package p425j.p444e.p451f0.p466i;

import p425j.p444e.p451f0.p454c.InterfaceC11319g;
import p577n.p586b.InterfaceC14456b;
/* compiled from: EmptySubscription.java */
/* renamed from: j.e.f0.i.d */
/* loaded from: classes3.dex */
public enum EnumC11649d implements InterfaceC11319g<Object> {
    INSTANCE;

    /* renamed from: a */
    public static void m10683a(InterfaceC14456b<?> interfaceC14456b) {
        interfaceC14456b.mo1687g(INSTANCE);
        interfaceC14456b.mo1690a();
    }

    /* renamed from: b */
    public static void m10682b(Throwable th, InterfaceC14456b<?> interfaceC14456b) {
        interfaceC14456b.mo1687g(INSTANCE);
        interfaceC14456b.mo1689b(th);
    }

    @Override // p577n.p586b.InterfaceC14457c
    public void cancel() {
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public void clear() {
    }

    @Override // p577n.p586b.InterfaceC14457c
    /* renamed from: e */
    public void mo1686e(long j) {
        EnumC11652g.m10669m(j);
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public boolean isEmpty() {
        return true;
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
    public Object poll() {
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }
}
