package p425j.p444e.p451f0.p467j;

import j.e.i0.a;
import java.util.concurrent.atomic.AtomicInteger;
import p425j.p444e.InterfaceC11695u;
import p577n.p586b.InterfaceC14456b;
/* compiled from: HalfSerializer.java */
/* renamed from: j.e.f0.j.i */
/* loaded from: classes3.dex */
public final class C11663i {
    /* renamed from: a */
    public static void m10645a(InterfaceC11695u<?> interfaceC11695u, AtomicInteger atomicInteger, C11656c c11656c) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable m10658b = c11656c.m10658b();
            if (m10658b != null) {
                interfaceC11695u.mo334b(m10658b);
            } else {
                interfaceC11695u.mo335a();
            }
        }
    }

    /* renamed from: b */
    public static void m10644b(InterfaceC14456b<?> interfaceC14456b, AtomicInteger atomicInteger, C11656c c11656c) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable m10658b = c11656c.m10658b();
            if (m10658b != null) {
                interfaceC14456b.mo1689b(m10658b);
            } else {
                interfaceC14456b.mo1690a();
            }
        }
    }

    /* renamed from: c */
    public static void m10643c(InterfaceC11695u<?> interfaceC11695u, Throwable th, AtomicInteger atomicInteger, C11656c c11656c) {
        if (c11656c.m10659a(th)) {
            if (atomicInteger.getAndIncrement() == 0) {
                interfaceC11695u.mo334b(c11656c.m10658b());
                return;
            }
            return;
        }
        a.r(th);
    }

    /* renamed from: d */
    public static void m10642d(InterfaceC14456b<?> interfaceC14456b, Throwable th, AtomicInteger atomicInteger, C11656c c11656c) {
        if (c11656c.m10659a(th)) {
            if (atomicInteger.getAndIncrement() == 0) {
                interfaceC14456b.mo1689b(c11656c.m10658b());
                return;
            }
            return;
        }
        a.r(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static <T> void m10641e(InterfaceC11695u<? super T> interfaceC11695u, T t, AtomicInteger atomicInteger, C11656c c11656c) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            interfaceC11695u.mo331f(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable m10658b = c11656c.m10658b();
                if (m10658b != null) {
                    interfaceC11695u.mo334b(m10658b);
                } else {
                    interfaceC11695u.mo335a();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static <T> void m10640f(InterfaceC14456b<? super T> interfaceC14456b, T t, AtomicInteger atomicInteger, C11656c c11656c) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            interfaceC14456b.mo1688f(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable m10658b = c11656c.m10658b();
                if (m10658b != null) {
                    interfaceC14456b.mo1689b(m10658b);
                } else {
                    interfaceC14456b.mo1690a();
                }
            }
        }
    }
}
