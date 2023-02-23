package p425j.p444e.p451f0.p466i;

import io.reactivex.exceptions.ProtocolViolationException;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p467j.C11657d;
import p577n.p586b.InterfaceC14457c;
/* compiled from: SubscriptionHelper.java */
/* renamed from: j.e.f0.i.g */
/* loaded from: classes3.dex */
public enum EnumC11652g implements InterfaceC14457c {
    CANCELLED;

    /* renamed from: a */
    public static boolean m10675a(AtomicReference<InterfaceC14457c> atomicReference) {
        InterfaceC14457c andSet;
        EnumC11652g enumC11652g = CANCELLED;
        if (atomicReference.get() == enumC11652g || (andSet = atomicReference.getAndSet(enumC11652g)) == enumC11652g) {
            return false;
        }
        if (andSet != null) {
            andSet.cancel();
            return true;
        }
        return true;
    }

    /* renamed from: b */
    public static void m10674b(AtomicReference<InterfaceC14457c> atomicReference, AtomicLong atomicLong, long j) {
        InterfaceC14457c interfaceC14457c = atomicReference.get();
        if (interfaceC14457c != null) {
            interfaceC14457c.mo1686e(j);
        } else if (m10669m(j)) {
            C11657d.m10657a(atomicLong, j);
            InterfaceC14457c interfaceC14457c2 = atomicReference.get();
            if (interfaceC14457c2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    interfaceC14457c2.mo1686e(andSet);
                }
            }
        }
    }

    /* renamed from: g */
    public static boolean m10673g(AtomicReference<InterfaceC14457c> atomicReference, AtomicLong atomicLong, InterfaceC14457c interfaceC14457c) {
        if (m10670j(atomicReference, interfaceC14457c)) {
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
    public static void m10672h(long j) {
        a.r(new ProtocolViolationException("More produced than requested: " + j));
    }

    /* renamed from: i */
    public static void m10671i() {
        a.r(new ProtocolViolationException("Subscription already set!"));
    }

    /* renamed from: j */
    public static boolean m10670j(AtomicReference<InterfaceC14457c> atomicReference, InterfaceC14457c interfaceC14457c) {
        C11312b.m11113d(interfaceC14457c, "s is null");
        if (atomicReference.compareAndSet(null, interfaceC14457c)) {
            return true;
        }
        interfaceC14457c.cancel();
        if (atomicReference.get() != CANCELLED) {
            m10671i();
            return false;
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m10669m(long j) {
        if (j <= 0) {
            a.r(new IllegalArgumentException("n > 0 required but it was " + j));
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static boolean m10668n(InterfaceC14457c interfaceC14457c, InterfaceC14457c interfaceC14457c2) {
        if (interfaceC14457c2 == null) {
            a.r(new NullPointerException("next is null"));
            return false;
        } else if (interfaceC14457c != null) {
            interfaceC14457c2.cancel();
            m10671i();
            return false;
        } else {
            return true;
        }
    }

    @Override // p577n.p586b.InterfaceC14457c
    public void cancel() {
    }

    @Override // p577n.p586b.InterfaceC14457c
    /* renamed from: e */
    public void mo1686e(long j) {
    }
}
