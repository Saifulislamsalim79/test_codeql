package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.t7 */
/* loaded from: classes2.dex */
final class C3522t7 implements InterfaceC3468r5 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3522t7(C3495s6 c3495s6) {
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3468r5
    /* renamed from: g */
    public final ExecutorService mo30218g(int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
