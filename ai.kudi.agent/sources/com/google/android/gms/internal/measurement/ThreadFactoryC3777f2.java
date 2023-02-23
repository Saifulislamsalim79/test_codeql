package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.f2 */
/* loaded from: classes2.dex */
public final class ThreadFactoryC3777f2 implements ThreadFactory {

    /* renamed from: c */
    private final ThreadFactory f9294c = Executors.defaultThreadFactory();

    /* JADX INFO: Access modifiers changed from: package-private */
    public ThreadFactoryC3777f2(C4046w2 c4046w2) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f9294c.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
