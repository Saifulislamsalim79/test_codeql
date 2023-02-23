package com.uber.autodispose;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p577n.p586b.InterfaceC14457c;
/* compiled from: AutoSubscriptionHelper.java */
/* renamed from: com.uber.autodispose.l */
/* loaded from: classes2.dex */
enum EnumC7411l implements InterfaceC14457c {
    CANCELLED;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m18783a(AtomicReference<InterfaceC14457c> atomicReference) {
        InterfaceC14457c andSet;
        EnumC7411l enumC7411l = CANCELLED;
        if (atomicReference.get() == enumC7411l || (andSet = atomicReference.getAndSet(enumC7411l)) == enumC7411l) {
            return false;
        }
        if (andSet != null) {
            andSet.cancel();
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m18782b(AtomicReference<InterfaceC14457c> atomicReference, AtomicLong atomicLong, long j) {
        InterfaceC14457c interfaceC14457c = atomicReference.get();
        if (interfaceC14457c != null) {
            interfaceC14457c.mo1686e(j);
        } else if (m18778j(j)) {
            C7403e.m18798a(atomicLong, j);
            InterfaceC14457c interfaceC14457c2 = atomicReference.get();
            if (interfaceC14457c2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    interfaceC14457c2.mo1686e(andSet);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m18781g(AtomicReference<InterfaceC14457c> atomicReference, AtomicLong atomicLong, InterfaceC14457c interfaceC14457c) {
        if (m18779i(atomicReference, interfaceC14457c)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                interfaceC14457c.mo1686e(andSet);
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    static void m18780h() {
        j.e.i0.a.r(new IllegalStateException("Subscription already set!"));
    }

    /* renamed from: i */
    static boolean m18779i(AtomicReference<InterfaceC14457c> atomicReference, InterfaceC14457c interfaceC14457c) {
        C7408j.m18790a(interfaceC14457c, "s is null");
        if (atomicReference.compareAndSet(null, interfaceC14457c)) {
            return true;
        }
        interfaceC14457c.cancel();
        if (atomicReference.get() != CANCELLED) {
            m18780h();
            return false;
        }
        return false;
    }

    /* renamed from: j */
    static boolean m18778j(long j) {
        if (j <= 0) {
            j.e.i0.a.r(new IllegalArgumentException("n > 0 required but it was " + j));
            return false;
        }
        return true;
    }

    @Override // p577n.p586b.InterfaceC14457c
    public void cancel() {
    }

    @Override // p577n.p586b.InterfaceC14457c
    /* renamed from: e */
    public void mo1686e(long j) {
    }
}
