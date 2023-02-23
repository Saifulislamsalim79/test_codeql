package com.bumptech.glide.p086q;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: Executors.java */
/* renamed from: com.bumptech.glide.q.e */
/* loaded from: classes2.dex */
public final class C2373e {

    /* renamed from: a */
    private static final Executor f6864a = new ExecutorC2374a();

    /* renamed from: b */
    private static final Executor f6865b = new ExecutorC2375b();

    /* compiled from: Executors.java */
    /* renamed from: com.bumptech.glide.q.e$a */
    /* loaded from: classes2.dex */
    class ExecutorC2374a implements Executor {

        /* renamed from: c */
        private final Handler f6866c = new Handler(Looper.getMainLooper());

        ExecutorC2374a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f6866c.post(runnable);
        }
    }

    /* compiled from: Executors.java */
    /* renamed from: com.bumptech.glide.q.e$b */
    /* loaded from: classes2.dex */
    class ExecutorC2375b implements Executor {
        ExecutorC2375b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m33148a() {
        return f6865b;
    }

    /* renamed from: b */
    public static Executor m33147b() {
        return f6864a;
    }
}
