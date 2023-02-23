package com.google.firebase.messaging;

import java.util.concurrent.Executor;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.a0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ExecutorC6477a0 implements Executor {

    /* renamed from: c */
    public static final /* synthetic */ ExecutorC6477a0 f15635c = new ExecutorC6477a0();

    private /* synthetic */ ExecutorC6477a0() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
