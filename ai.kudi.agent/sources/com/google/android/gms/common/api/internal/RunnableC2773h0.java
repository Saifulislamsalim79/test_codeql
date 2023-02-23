package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.api.C2730a;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.h0 */
/* loaded from: classes2.dex */
final class RunnableC2773h0 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C2826b f7790c;

    /* renamed from: d */
    final /* synthetic */ C2776i0 f7791d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2773h0(C2776i0 c2776i0, C2826b c2826b) {
        this.f7791d = c2776i0;
        this.f7790c = c2826b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2754b c2754b;
        C2730a.InterfaceC2739f interfaceC2739f;
        C2730a.InterfaceC2739f interfaceC2739f2;
        C2730a.InterfaceC2739f interfaceC2739f3;
        C2730a.InterfaceC2739f interfaceC2739f4;
        C2776i0 c2776i0 = this.f7791d;
        Map A = InterfaceC2769g.A(c2776i0.f7802f);
        c2754b = c2776i0.f7798b;
        e0 e0Var = (e0) A.get(c2754b);
        if (e0Var == null) {
            return;
        }
        if (this.f7790c.m31879s()) {
            this.f7791d.f7801e = true;
            interfaceC2739f = this.f7791d.f7797a;
            if (interfaceC2739f.mo15467n()) {
                this.f7791d.m31972h();
                return;
            }
            try {
                C2776i0 c2776i02 = this.f7791d;
                interfaceC2739f3 = c2776i02.f7797a;
                interfaceC2739f4 = c2776i02.f7797a;
                interfaceC2739f3.mo31968b(null, interfaceC2739f4.mo31732a());
                return;
            } catch (SecurityException e) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                interfaceC2739f2 = this.f7791d.f7797a;
                interfaceC2739f2.mo31967c("Failed to get service from broker.");
                e0Var.H(new C2826b(10), (Exception) null);
                return;
            }
        }
        e0Var.H(this.f7790c, (Exception) null);
    }
}
