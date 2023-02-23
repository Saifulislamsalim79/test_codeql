package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.a9 */
/* loaded from: classes2.dex */
public final class RunnableC4156a9 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4168ba f10009c;

    /* renamed from: d */
    final /* synthetic */ Runnable f10010d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4156a9(C4179c9 c4179c9, C4168ba c4168ba, Runnable runnable) {
        this.f10009c = c4168ba;
        this.f10010d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10009c.m28365e();
        this.f10009c.m28354j0(this.f10010d);
        this.f10009c.m28399A();
    }
}
