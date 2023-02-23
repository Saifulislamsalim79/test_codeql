package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.z */
/* loaded from: classes2.dex */
final class C4485z<TResult> implements InterfaceC4463i0<TResult> {

    /* renamed from: a */
    private final Executor f10925a;

    /* renamed from: b */
    private final Object f10926b = new Object();

    /* renamed from: c */
    private InterfaceC4452d f10927c;

    public C4485z(Executor executor, InterfaceC4452d interfaceC4452d) {
        this.f10925a = executor;
        this.f10927c = interfaceC4452d;
    }

    @Override // com.google.android.gms.tasks.InterfaceC4463i0
    /* renamed from: d */
    public final void mo27719d(j<TResult> jVar) {
        if (jVar.n()) {
            synchronized (this.f10926b) {
                if (this.f10927c == null) {
                    return;
                }
                this.f10925a.execute(new RunnableC4484y(this));
            }
        }
    }
}
