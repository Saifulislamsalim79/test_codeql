package io.reactivex.exceptions;

import p425j.p444e.p451f0.p467j.C11661h;
/* compiled from: Exceptions.java */
/* renamed from: io.reactivex.exceptions.a */
/* loaded from: classes3.dex */
public final class C11118a {
    /* renamed from: a */
    public static RuntimeException m11647a(Throwable th) {
        throw C11661h.m10646d(th);
    }

    /* renamed from: b */
    public static void m11646b(Throwable th) {
        if (!(th instanceof VirtualMachineError)) {
            if (!(th instanceof ThreadDeath)) {
                if (th instanceof LinkageError) {
                    throw ((LinkageError) th);
                }
                return;
            }
            throw ((ThreadDeath) th);
        }
        throw ((VirtualMachineError) th);
    }
}
