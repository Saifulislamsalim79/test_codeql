package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.b0 */
/* loaded from: classes2.dex */
final class C4449b0<TResult> implements InterfaceC4463i0<TResult> {

    /* renamed from: a */
    private final Executor f10868a;

    /* renamed from: b */
    private final Object f10869b = new Object();

    /* renamed from: c */
    private InterfaceC4454e<TResult> f10870c;

    public C4449b0(Executor executor, InterfaceC4454e<TResult> interfaceC4454e) {
        this.f10868a = executor;
        this.f10870c = interfaceC4454e;
    }

    @Override // com.google.android.gms.tasks.InterfaceC4463i0
    /* renamed from: d */
    public final void mo27719d(j<TResult> jVar) {
        synchronized (this.f10869b) {
            if (this.f10870c == null) {
                return;
            }
            this.f10868a.execute(new RunnableC4447a0(this, jVar));
        }
    }
}
