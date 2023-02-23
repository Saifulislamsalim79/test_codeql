package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.q */
/* loaded from: classes2.dex */
final class C4476q implements InterfaceC4477r {

    /* renamed from: a */
    private final CountDownLatch f10904a = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4476q(C4475p c4475p) {
    }

    @Override // com.google.android.gms.tasks.InterfaceC4452d
    /* renamed from: a */
    public final void mo20881a() {
        this.f10904a.countDown();
    }

    @Override // com.google.android.gms.tasks.InterfaceC4456f
    /* renamed from: b */
    public final void mo15657b(Exception exc) {
        this.f10904a.countDown();
    }

    @Override // com.google.android.gms.tasks.InterfaceC4458g
    /* renamed from: c */
    public final void mo18742c(Object obj) {
        this.f10904a.countDown();
    }

    /* renamed from: d */
    public final void m27731d() throws InterruptedException {
        this.f10904a.await();
    }

    /* renamed from: e */
    public final boolean m27730e(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f10904a.await(j, timeUnit);
    }
}
