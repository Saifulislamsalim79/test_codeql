package com.google.android.gms.cloudmessaging;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.d0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ExecutorC2705d0 implements Executor {

    /* renamed from: c */
    public static final /* synthetic */ ExecutorC2705d0 f7642c = new ExecutorC2705d0();

    private /* synthetic */ ExecutorC2705d0() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
