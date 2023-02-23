package com.google.firebase.messaging;

import java.util.concurrent.Executor;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ExecutorC6493f implements Executor {

    /* renamed from: c */
    public static final /* synthetic */ ExecutorC6493f f15663c = new ExecutorC6493f();

    private /* synthetic */ ExecutorC6493f() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
