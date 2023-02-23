package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p272h.p286c.p287a.p300b.p307d.p318k.HandlerC9204a;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.m0 */
/* loaded from: classes2.dex */
final class ExecutorC4470m0 implements Executor {

    /* renamed from: c */
    private final Handler f10893c = new HandlerC9204a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f10893c.post(runnable);
    }
}
