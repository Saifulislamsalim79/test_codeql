package com.google.android.play.core.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.play.core.tasks.o */
/* loaded from: classes2.dex */
final class ExecutorC5023o implements Executor {

    /* renamed from: c */
    private final Handler f12673c = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f12673c.post(runnable);
    }
}
