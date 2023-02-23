package com.uber.autodispose;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: AutoDisposableHelper.java */
/* renamed from: com.uber.autodispose.c */
/* loaded from: classes2.dex */
enum EnumC7399c implements j.e.c0.c {
    DISPOSED;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m18805a(AtomicReference<j.e.c0.c> atomicReference) {
        j.e.c0.c andSet;
        j.e.c0.c cVar = atomicReference.get();
        EnumC7399c enumC7399c = DISPOSED;
        if (cVar == enumC7399c || (andSet = atomicReference.getAndSet(enumC7399c)) == enumC7399c) {
            return false;
        }
        if (andSet != null) {
            andSet.i();
            return true;
        }
        return true;
    }

    /* renamed from: i */
    public void m18804i() {
    }

    /* renamed from: j */
    public boolean m18803j() {
        return true;
    }
}
