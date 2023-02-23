package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.x */
/* loaded from: classes2.dex */
final class C4483x<TResult, TContinuationResult> implements InterfaceC4458g<TContinuationResult>, InterfaceC4456f, InterfaceC4452d, InterfaceC4463i0 {

    /* renamed from: a */
    private final Executor f10921a;

    /* renamed from: b */
    private final InterfaceC4450c<TResult, j<TContinuationResult>> f10922b;

    /* renamed from: c */
    private final C4472n0<TContinuationResult> f10923c;

    public C4483x(Executor executor, InterfaceC4450c<TResult, j<TContinuationResult>> interfaceC4450c, C4472n0<TContinuationResult> c4472n0) {
        this.f10921a = executor;
        this.f10922b = interfaceC4450c;
        this.f10923c = c4472n0;
    }

    @Override // com.google.android.gms.tasks.InterfaceC4452d
    /* renamed from: a */
    public final void mo20881a() {
        this.f10923c.m27737u();
    }

    @Override // com.google.android.gms.tasks.InterfaceC4456f
    /* renamed from: b */
    public final void mo15657b(Exception exc) {
        this.f10923c.m27739s(exc);
    }

    @Override // com.google.android.gms.tasks.InterfaceC4458g
    /* renamed from: c */
    public final void mo18742c(TContinuationResult tcontinuationresult) {
        this.f10923c.m27738t(tcontinuationresult);
    }

    @Override // com.google.android.gms.tasks.InterfaceC4463i0
    /* renamed from: d */
    public final void mo27719d(j<TResult> jVar) {
        this.f10921a.execute(new RunnableC4482w(this, jVar));
    }
}
