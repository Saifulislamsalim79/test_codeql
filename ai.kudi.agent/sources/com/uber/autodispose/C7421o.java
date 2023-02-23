package com.uber.autodispose;

import java.util.concurrent.atomic.AtomicInteger;
import p577n.p586b.InterfaceC14456b;
/* compiled from: HalfSerializer.java */
/* renamed from: com.uber.autodispose.o */
/* loaded from: classes2.dex */
final class C7421o {
    /* renamed from: a */
    public static void m18765a(InterfaceC14456b<?> interfaceC14456b, AtomicInteger atomicInteger, C7398b c7398b) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable m18806b = c7398b.m18806b();
            if (m18806b != null) {
                interfaceC14456b.mo1689b(m18806b);
            } else {
                interfaceC14456b.mo1690a();
            }
        }
    }

    /* renamed from: b */
    public static void m18764b(InterfaceC14456b<?> interfaceC14456b, Throwable th, AtomicInteger atomicInteger, C7398b c7398b) {
        if (c7398b.m18807a(th)) {
            if (atomicInteger.getAndIncrement() == 0) {
                interfaceC14456b.mo1689b(c7398b.m18806b());
                return;
            }
            return;
        }
        j.e.i0.a.r(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static <T> boolean m18763c(InterfaceC14456b<? super T> interfaceC14456b, T t, AtomicInteger atomicInteger, C7398b c7398b) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            interfaceC14456b.mo1688f(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable m18806b = c7398b.m18806b();
                if (m18806b != null) {
                    interfaceC14456b.mo1689b(m18806b);
                } else {
                    interfaceC14456b.mo1690a();
                }
                return true;
            }
        }
        return false;
    }
}
