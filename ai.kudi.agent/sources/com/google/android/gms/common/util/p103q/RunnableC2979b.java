package com.google.android.gms.common.util.p103q;

import android.os.Process;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.util.q.b */
/* loaded from: classes2.dex */
final class RunnableC2979b implements Runnable {

    /* renamed from: c */
    private final Runnable f8154c;

    public RunnableC2979b(Runnable runnable, int i) {
        this.f8154c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f8154c.run();
    }
}
