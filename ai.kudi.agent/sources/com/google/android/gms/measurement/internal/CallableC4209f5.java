package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.f5 */
/* loaded from: classes2.dex */
final class CallableC4209f5 implements Callable<List<C4225ga>> {

    /* renamed from: c */
    final /* synthetic */ String f10254c;

    /* renamed from: d */
    final /* synthetic */ String f10255d;

    /* renamed from: e */
    final /* synthetic */ String f10256e;

    /* renamed from: f */
    final /* synthetic */ C4385u5 f10257f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC4209f5(C4385u5 c4385u5, String str, String str2, String str3) {
        this.f10257f = c4385u5;
        this.f10254c = str;
        this.f10255d = str2;
        this.f10256e = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<C4225ga> call() throws Exception {
        C4168ba c4168ba;
        C4168ba c4168ba2;
        c4168ba = this.f10257f.f10711a;
        c4168ba.m28365e();
        c4168ba2 = this.f10257f.f10711a;
        return c4168ba2.m28379U().m28075f0(this.f10254c, this.f10255d, this.f10256e);
    }
}
