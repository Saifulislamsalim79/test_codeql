package com.google.firebase.messaging;

import java.util.concurrent.Executor;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.j0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ExecutorC6513j0 implements Executor {

    /* renamed from: c */
    public static final /* synthetic */ ExecutorC6513j0 f15736c = new ExecutorC6513j0();

    private /* synthetic */ ExecutorC6513j0() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
