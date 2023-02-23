package com.google.android.gms.measurement.internal;

import java.lang.Thread;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.v4 */
/* loaded from: classes2.dex */
final class C4396v4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f10736a;

    /* renamed from: b */
    final /* synthetic */ C4429y4 f10737b;

    public C4396v4(C4429y4 c4429y4, String str) {
        this.f10737b = c4429y4;
        com.google.android.gms.common.internal.s.j(str);
        this.f10736a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        ((v5) this.f10737b).a.b().r().m28013b(this.f10736a, th);
    }
}
