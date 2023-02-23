package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.f0 */
/* loaded from: classes2.dex */
final class C4457f0<TResult> implements InterfaceC4463i0<TResult> {

    /* renamed from: a */
    private final Executor f10878a;

    /* renamed from: b */
    private final Object f10879b = new Object();

    /* renamed from: c */
    private InterfaceC4458g<? super TResult> f10880c;

    public C4457f0(Executor executor, InterfaceC4458g<? super TResult> interfaceC4458g) {
        this.f10878a = executor;
        this.f10880c = interfaceC4458g;
    }

    @Override // com.google.android.gms.tasks.InterfaceC4463i0
    /* renamed from: d */
    public final void mo27719d(j<TResult> jVar) {
        if (jVar.p()) {
            synchronized (this.f10879b) {
                if (this.f10880c == null) {
                    return;
                }
                this.f10878a.execute(new RunnableC4455e0(this, jVar));
            }
        }
    }
}
