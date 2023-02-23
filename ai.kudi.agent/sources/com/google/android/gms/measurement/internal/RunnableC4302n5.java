package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C4009td;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.n5 */
/* loaded from: classes2.dex */
final class RunnableC4302n5 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4379u f10496c;

    /* renamed from: d */
    final /* synthetic */ C4307na f10497d;

    /* renamed from: e */
    final /* synthetic */ C4385u5 f10498e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4302n5(C4385u5 c4385u5, C4379u c4379u, C4307na c4307na) {
        this.f10498e = c4385u5;
        this.f10496c = c4379u;
        this.f10497d = c4307na;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4168ba c4168ba;
        C4379u m27936p1 = this.f10498e.m27936p1(this.f10496c, this.f10497d);
        C4009td.m28898b();
        c4168ba = this.f10498e.f10711a;
        if (c4168ba.m28381S().B(null, C4173c3.f10150r0)) {
            this.f10498e.m27932s1(m27936p1, this.f10497d);
        } else {
            this.f10498e.m27937o(m27936p1, this.f10497d);
        }
    }
}
