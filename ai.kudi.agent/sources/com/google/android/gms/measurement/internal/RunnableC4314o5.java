package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.o5 */
/* loaded from: classes2.dex */
final class RunnableC4314o5 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4379u f10551c;

    /* renamed from: d */
    final /* synthetic */ String f10552d;

    /* renamed from: e */
    final /* synthetic */ C4385u5 f10553e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4314o5(C4385u5 c4385u5, C4379u c4379u, String str) {
        this.f10553e = c4385u5;
        this.f10551c = c4379u;
        this.f10552d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4168ba c4168ba;
        C4168ba c4168ba2;
        c4168ba = this.f10553e.f10711a;
        c4168ba.m28365e();
        c4168ba2 = this.f10553e.f10711a;
        c4168ba2.m28355j(this.f10551c, this.f10552d);
    }
}
