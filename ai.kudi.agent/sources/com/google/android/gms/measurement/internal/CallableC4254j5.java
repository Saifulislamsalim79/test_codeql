package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.j5 */
/* loaded from: classes2.dex */
final class CallableC4254j5 implements Callable<List<C4169c>> {

    /* renamed from: c */
    final /* synthetic */ String f10395c;

    /* renamed from: d */
    final /* synthetic */ String f10396d;

    /* renamed from: e */
    final /* synthetic */ String f10397e;

    /* renamed from: f */
    final /* synthetic */ C4385u5 f10398f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC4254j5(C4385u5 c4385u5, String str, String str2, String str3) {
        this.f10398f = c4385u5;
        this.f10395c = str;
        this.f10396d = str2;
        this.f10397e = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<C4169c> call() throws Exception {
        C4168ba c4168ba;
        C4168ba c4168ba2;
        c4168ba = this.f10398f.f10711a;
        c4168ba.m28365e();
        c4168ba2 = this.f10398f.f10711a;
        return c4168ba2.m28379U().m28078c0(this.f10395c, this.f10396d, this.f10397e);
    }
}
