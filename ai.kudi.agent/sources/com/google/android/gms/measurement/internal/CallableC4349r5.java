package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.r5 */
/* loaded from: classes2.dex */
final class CallableC4349r5 implements Callable<List<C4225ga>> {

    /* renamed from: c */
    final /* synthetic */ String f10636c;

    /* renamed from: d */
    final /* synthetic */ C4385u5 f10637d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC4349r5(C4385u5 c4385u5, String str) {
        this.f10637d = c4385u5;
        this.f10636c = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<C4225ga> call() throws Exception {
        C4168ba c4168ba;
        C4168ba c4168ba2;
        c4168ba = this.f10637d.f10711a;
        c4168ba.m28365e();
        c4168ba2 = this.f10637d.f10711a;
        return c4168ba2.m28379U().m28076e0(this.f10636c);
    }
}
