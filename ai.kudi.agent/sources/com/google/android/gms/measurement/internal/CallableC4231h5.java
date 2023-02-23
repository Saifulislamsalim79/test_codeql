package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.h5 */
/* loaded from: classes2.dex */
final class CallableC4231h5 implements Callable<List<C4225ga>> {

    /* renamed from: c */
    final /* synthetic */ String f10331c;

    /* renamed from: d */
    final /* synthetic */ String f10332d;

    /* renamed from: e */
    final /* synthetic */ String f10333e;

    /* renamed from: f */
    final /* synthetic */ C4385u5 f10334f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC4231h5(C4385u5 c4385u5, String str, String str2, String str3) {
        this.f10334f = c4385u5;
        this.f10331c = str;
        this.f10332d = str2;
        this.f10333e = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<C4225ga> call() throws Exception {
        C4168ba c4168ba;
        C4168ba c4168ba2;
        c4168ba = this.f10334f.f10711a;
        c4168ba.m28365e();
        c4168ba2 = this.f10334f.f10711a;
        return c4168ba2.m28379U().m28075f0(this.f10331c, this.f10332d, this.f10333e);
    }
}
