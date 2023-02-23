package com.uber.autodispose;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ExceptionHelper.java */
/* renamed from: com.uber.autodispose.m */
/* loaded from: classes2.dex */
final class C7418m {

    /* renamed from: a */
    private static final Throwable f17579a = new C7419a();

    /* compiled from: ExceptionHelper.java */
    /* renamed from: com.uber.autodispose.m$a */
    /* loaded from: classes2.dex */
    static final class C7419a extends Throwable {
        C7419a() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m18768a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        do {
            th2 = atomicReference.get();
            if (th2 == f17579a) {
                return false;
            }
        } while (!atomicReference.compareAndSet(th2, th2 == null ? th : new CompositeException(th2, th)));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Throwable m18767b(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = f17579a;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }
}
