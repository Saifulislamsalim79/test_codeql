package com.google.firebase.messaging;

import java.util.concurrent.Executor;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.c1 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ExecutorC6485c1 implements Executor {

    /* renamed from: c */
    public static final /* synthetic */ ExecutorC6485c1 f15651c = new ExecutorC6485c1();

    private /* synthetic */ ExecutorC6485c1() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
