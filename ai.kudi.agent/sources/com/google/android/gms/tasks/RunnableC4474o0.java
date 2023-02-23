package com.google.android.gms.tasks;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.o0 */
/* loaded from: classes2.dex */
public final class RunnableC4474o0 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4472n0 f10902c;

    /* renamed from: d */
    final /* synthetic */ Callable f10903d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4474o0(C4472n0 c4472n0, Callable callable) {
        this.f10902c = c4472n0;
        this.f10903d = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f10902c.m27738t(this.f10903d.call());
        } catch (Exception e) {
            this.f10902c.m27739s(e);
        } catch (Throwable th) {
            this.f10902c.m27739s(new RuntimeException(th));
        }
    }
}
