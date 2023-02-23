package com.google.android.gms.common.api.internal;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.c0 */
/* loaded from: classes2.dex */
final class RunnableC2759c0 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C2762d0 f7749c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2759c0(C2762d0 c2762d0) {
        this.f7749c = c2762d0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e0 e0Var = this.f7749c.f7751a;
        e0.u(e0Var).mo31967c(String.valueOf(e0.u(e0Var).getClass().getName()).concat(" disconnecting because it was signed out."));
    }
}
