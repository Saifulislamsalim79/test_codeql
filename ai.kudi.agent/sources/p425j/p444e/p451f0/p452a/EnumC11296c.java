package p425j.p444e.p451f0.p452a;

import io.reactivex.exceptions.ProtocolViolationException;
import j.e.c0.c;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.p451f0.p453b.C11312b;
/* compiled from: DisposableHelper.java */
/* renamed from: j.e.f0.a.c */
/* loaded from: classes3.dex */
public enum EnumC11296c implements c {
    DISPOSED;

    /* renamed from: a */
    public static boolean m11156a(AtomicReference<c> atomicReference) {
        c andSet;
        c cVar = atomicReference.get();
        EnumC11296c enumC11296c = DISPOSED;
        if (cVar == enumC11296c || (andSet = atomicReference.getAndSet(enumC11296c)) == enumC11296c) {
            return false;
        }
        if (andSet != null) {
            andSet.i();
            return true;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m11155b(c cVar) {
        return cVar == DISPOSED;
    }

    /* renamed from: e */
    public static boolean m11154e(AtomicReference<c> atomicReference, c cVar) {
        c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar != null) {
                    cVar.i();
                    return false;
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        return true;
    }

    /* renamed from: g */
    public static void m11153g() {
        a.r(new ProtocolViolationException("Disposable already set!"));
    }

    /* renamed from: h */
    public static boolean m11152h(AtomicReference<c> atomicReference, c cVar) {
        c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar != null) {
                    cVar.i();
                    return false;
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        if (cVar2 != null) {
            cVar2.i();
            return true;
        }
        return true;
    }

    /* renamed from: m */
    public static boolean m11149m(AtomicReference<c> atomicReference, c cVar) {
        C11312b.m11113d(cVar, "d is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.i();
        if (atomicReference.get() != DISPOSED) {
            m11153g();
            return false;
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m11148n(AtomicReference<c> atomicReference, c cVar) {
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        if (atomicReference.get() == DISPOSED) {
            cVar.i();
            return false;
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m11147p(c cVar, c cVar2) {
        if (cVar2 == null) {
            a.r(new NullPointerException("next is null"));
            return false;
        } else if (cVar != null) {
            cVar2.i();
            m11153g();
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: i */
    public void m11151i() {
    }

    /* renamed from: j */
    public boolean m11150j() {
        return true;
    }
}
