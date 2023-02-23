package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;
/* renamed from: com.google.android.play.core.assetpacks.y2 */
/* loaded from: classes2.dex */
final /* synthetic */ class ThreadFactoryC4945y2 implements ThreadFactory {

    /* renamed from: c */
    static final ThreadFactory f12600c = new ThreadFactoryC4945y2();

    private ThreadFactoryC4945y2() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "UpdateListenerExecutor");
    }
}
