package com.google.firebase.messaging;

import java.util.concurrent.Executor;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.l */
/* loaded from: classes2.dex */
public final /* synthetic */ class ExecutorC6516l implements Executor {

    /* renamed from: c */
    public static final /* synthetic */ ExecutorC6516l f15739c = new ExecutorC6516l();

    private /* synthetic */ ExecutorC6516l() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
