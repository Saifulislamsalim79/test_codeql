package com.google.android.gms.internal.measurement;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.y0 */
/* loaded from: classes2.dex */
final class C4076y0 implements InterfaceC4044w0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4076y0(C4060x0 c4060x0) {
    }

    /* renamed from: b */
    public static final ExecutorService m28616b(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4044w0
    /* renamed from: a */
    public final ExecutorService mo28617a(ThreadFactory threadFactory, int i) {
        return m28616b(1, threadFactory, 1);
    }
}
