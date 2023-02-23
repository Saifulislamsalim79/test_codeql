package com.google.firebase.messaging;

import java.util.concurrent.Executor;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.r */
/* loaded from: classes2.dex */
public final /* synthetic */ class ExecutorC6529r implements Executor {

    /* renamed from: c */
    public static final /* synthetic */ ExecutorC6529r f15759c = new ExecutorC6529r();

    private /* synthetic */ ExecutorC6529r() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
