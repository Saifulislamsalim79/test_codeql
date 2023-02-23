package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.Executor;
/* compiled from: lambda */
/* renamed from: com.google.firebase.remoteconfig.internal.h */
/* loaded from: classes2.dex */
public final /* synthetic */ class ExecutorC6749h implements Executor {

    /* renamed from: c */
    public static final /* synthetic */ ExecutorC6749h f16240c = new ExecutorC6749h();

    private /* synthetic */ ExecutorC6749h() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
