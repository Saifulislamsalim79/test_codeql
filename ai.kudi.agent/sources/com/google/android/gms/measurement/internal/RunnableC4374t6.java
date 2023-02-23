package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.t6 */
/* loaded from: classes2.dex */
public final class RunnableC4374t6 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ AtomicReference f10685c;

    /* renamed from: d */
    final /* synthetic */ String f10686d;

    /* renamed from: e */
    final /* synthetic */ String f10687e;

    /* renamed from: f */
    final /* synthetic */ C4245i7 f10688f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4374t6(C4245i7 c4245i7, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f10688f = c4245i7;
        this.f10685c = atomicReference;
        this.f10686d = str2;
        this.f10687e = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((v5) this.f10688f).a.L().m27863U(this.f10685c, null, this.f10686d, this.f10687e);
    }
}
