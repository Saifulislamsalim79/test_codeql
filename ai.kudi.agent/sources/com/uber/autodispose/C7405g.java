package com.uber.autodispose;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;
import p577n.p586b.InterfaceC14457c;
/* compiled from: AutoDisposeEndConsumerHelper.java */
/* renamed from: com.uber.autodispose.g */
/* loaded from: classes2.dex */
final class C7405g {
    /* renamed from: a */
    public static String m18796a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    /* renamed from: b */
    public static void m18795b(Class<?> cls) {
        j.e.i0.a.r(new ProtocolViolationException(m18796a(cls.getName())));
    }

    /* renamed from: c */
    public static boolean m18794c(AtomicReference<j.e.c0.c> atomicReference, j.e.c0.c cVar, Class<?> cls) {
        C7408j.m18790a(cVar, "next is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.i();
        if (atomicReference.get() != EnumC7399c.DISPOSED) {
            m18795b(cls);
            return false;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m18793d(AtomicReference<InterfaceC14457c> atomicReference, InterfaceC14457c interfaceC14457c, Class<?> cls) {
        C7408j.m18790a(interfaceC14457c, "next is null");
        if (atomicReference.compareAndSet(null, interfaceC14457c)) {
            return true;
        }
        interfaceC14457c.cancel();
        if (atomicReference.get() != EnumC7411l.CANCELLED) {
            m18795b(cls);
            return false;
        }
        return false;
    }
}
