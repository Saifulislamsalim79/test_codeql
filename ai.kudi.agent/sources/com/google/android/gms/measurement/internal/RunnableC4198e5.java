package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.e5 */
/* loaded from: classes2.dex */
final class RunnableC4198e5 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4169c f10231c;

    /* renamed from: d */
    final /* synthetic */ C4385u5 f10232d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4198e5(C4385u5 c4385u5, C4169c c4169c) {
        this.f10232d = c4385u5;
        this.f10231c = c4169c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4168ba c4168ba;
        C4168ba c4168ba2;
        C4168ba c4168ba3;
        c4168ba = this.f10232d.f10711a;
        c4168ba.m28365e();
        if (this.f10231c.f10079e.m28270f() == null) {
            c4168ba3 = this.f10232d.f10711a;
            c4168ba3.m28346r(this.f10231c);
            return;
        }
        c4168ba2 = this.f10232d.f10711a;
        c4168ba2.m28341w(this.f10231c);
    }
}
