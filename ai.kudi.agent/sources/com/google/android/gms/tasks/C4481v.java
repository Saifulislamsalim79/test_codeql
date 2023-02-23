package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.v */
/* loaded from: classes2.dex */
public final class C4481v<TResult, TContinuationResult> implements InterfaceC4463i0<TResult> {

    /* renamed from: a */
    private final Executor f10916a;

    /* renamed from: b */
    private final InterfaceC4450c<TResult, TContinuationResult> f10917b;

    /* renamed from: c */
    private final C4472n0<TContinuationResult> f10918c;

    public C4481v(Executor executor, InterfaceC4450c<TResult, TContinuationResult> interfaceC4450c, C4472n0<TContinuationResult> c4472n0) {
        this.f10916a = executor;
        this.f10917b = interfaceC4450c;
        this.f10918c = c4472n0;
    }

    @Override // com.google.android.gms.tasks.InterfaceC4463i0
    /* renamed from: d */
    public final void mo27719d(j<TResult> jVar) {
        this.f10916a.execute(new RunnableC4480u(this, jVar));
    }
}
