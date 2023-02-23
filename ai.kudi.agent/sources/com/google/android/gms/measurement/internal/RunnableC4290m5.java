package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.m5 */
/* loaded from: classes2.dex */
final class RunnableC4290m5 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4307na f10467c;

    /* renamed from: d */
    final /* synthetic */ C4385u5 f10468d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4290m5(C4385u5 c4385u5, C4307na c4307na) {
        this.f10468d = c4385u5;
        this.f10467c = c4307na;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4168ba c4168ba;
        C4168ba c4168ba2;
        c4168ba = this.f10468d.f10711a;
        c4168ba.m28365e();
        c4168ba2 = this.f10468d.f10711a;
        C4307na c4307na = this.f10467c;
        c4168ba2.m28373a().m27823h();
        c4168ba2.m28361g();
        com.google.android.gms.common.internal.s.f(c4307na.f10529c);
        C4226h m28191b = C4226h.m28191b(c4307na.f10528N);
        C4226h m28380T = c4168ba2.m28380T(c4307na.f10529c);
        c4168ba2.m28371b().v().m28012c("Setting consent, package, consent", c4307na.f10529c, m28191b);
        c4168ba2.m28339y(c4307na.f10529c, m28191b);
        if (m28191b.m28180m(m28380T)) {
            c4168ba2.m28343u(c4307na);
        }
    }
}
