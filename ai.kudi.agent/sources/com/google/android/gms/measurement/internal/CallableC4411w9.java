package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.w9 */
/* loaded from: classes2.dex */
public final class CallableC4411w9 implements Callable<String> {

    /* renamed from: c */
    final /* synthetic */ C4307na f10778c;

    /* renamed from: d */
    final /* synthetic */ C4168ba f10779d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC4411w9(C4168ba c4168ba, C4307na c4307na) {
        this.f10779d = c4168ba;
        this.f10778c = c4307na;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() throws Exception {
        C4168ba c4168ba = this.f10779d;
        String str = this.f10778c.f10529c;
        com.google.android.gms.common.internal.s.j(str);
        if (c4168ba.m28380T(str).m28182k() && C4226h.m28191b(this.f10778c.f10528N).m28182k()) {
            return this.f10779d.m28382R(this.f10778c).m28218f0();
        }
        this.f10779d.m28371b().v().m28014a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
