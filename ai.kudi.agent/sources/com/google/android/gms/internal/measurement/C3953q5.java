package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.q5 */
/* loaded from: classes2.dex */
final class C3953q5 extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C3985s5 f9629a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3953q5(C3985s5 c3985s5, Handler handler) {
        super(null);
        this.f9629a = c3985s5;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f9629a.m28976e();
    }
}
