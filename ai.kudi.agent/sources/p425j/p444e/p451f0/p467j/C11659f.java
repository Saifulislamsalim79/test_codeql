package p425j.p444e.p451f0.p467j;

import io.reactivex.exceptions.ProtocolViolationException;
import j.e.c0.c;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p453b.C11312b;
/* compiled from: EndConsumerHelper.java */
/* renamed from: j.e.f0.j.f */
/* loaded from: classes3.dex */
public final class C11659f {
    /* renamed from: a */
    public static String m10652a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    /* renamed from: b */
    public static void m10651b(Class<?> cls) {
        a.r(new ProtocolViolationException(m10652a(cls.getName())));
    }

    /* renamed from: c */
    public static boolean m10650c(AtomicReference<c> atomicReference, c cVar, Class<?> cls) {
        C11312b.m11113d(cVar, "next is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.i();
        if (atomicReference.get() != EnumC11296c.DISPOSED) {
            m10651b(cls);
            return false;
        }
        return false;
    }
}
