package com.google.mlkit.common.p186b;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: com.google.mlkit.common.b.o */
/* loaded from: classes2.dex */
public class C6945o {

    /* renamed from: b */
    private boolean f16650b;

    /* renamed from: a */
    private final Object f16649a = new Object();

    /* renamed from: c */
    private final Queue f16651c = new ArrayDeque();

    /* renamed from: d */
    private final AtomicReference f16652d = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final void m20428d() {
        synchronized (this.f16649a) {
            if (this.f16651c.isEmpty()) {
                this.f16650b = false;
                return;
            }
            C6934f0 c6934f0 = (C6934f0) this.f16651c.remove();
            m20427e(c6934f0.f16625a, c6934f0.f16626b);
        }
    }

    /* renamed from: e */
    private final void m20427e(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: com.google.mlkit.common.b.d0
                @Override // java.lang.Runnable
                public final void run() {
                    C6945o c6945o = C6945o.this;
                    Runnable runnable2 = runnable;
                    C6938h0 c6938h0 = new C6938h0(c6945o, null);
                    try {
                        runnable2.run();
                        c6938h0.close();
                    } catch (Throwable th) {
                        try {
                            c6938h0.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            m20428d();
        }
    }

    /* renamed from: a */
    public void m20431a(Executor executor, Runnable runnable) {
        synchronized (this.f16649a) {
            if (this.f16650b) {
                this.f16651c.add(new C6934f0(executor, runnable, null));
                return;
            }
            this.f16650b = true;
            m20427e(executor, runnable);
        }
    }
}
