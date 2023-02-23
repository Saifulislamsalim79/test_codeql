package com.google.android.play.core.tasks;

import java.util.concurrent.CountDownLatch;
/* renamed from: com.google.android.play.core.tasks.q */
/* loaded from: classes2.dex */
final class C5025q implements InterfaceC5010b, InterfaceC5009a {

    /* renamed from: a */
    private final CountDownLatch f12679a = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5025q(byte[] bArr) {
    }

    /* renamed from: a */
    public final void m25840a() throws InterruptedException {
        this.f12679a.await();
    }

    @Override // com.google.android.play.core.tasks.InterfaceC5009a
    /* renamed from: b */
    public final void mo25839b(Exception exc) {
        this.f12679a.countDown();
    }

    @Override // com.google.android.play.core.tasks.InterfaceC5010b
    /* renamed from: c */
    public final void mo25838c(Object obj) {
        this.f12679a.countDown();
    }
}
