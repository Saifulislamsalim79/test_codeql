package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;
/* renamed from: com.google.android.play.core.assetpacks.x2 */
/* loaded from: classes2.dex */
final /* synthetic */ class ThreadFactoryC4941x2 implements ThreadFactory {

    /* renamed from: c */
    static final ThreadFactory f12595c = new ThreadFactoryC4941x2();

    private ThreadFactoryC4941x2() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AssetPackBackgroundExecutor");
    }
}
