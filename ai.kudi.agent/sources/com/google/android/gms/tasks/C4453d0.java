package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.d0 */
/* loaded from: classes2.dex */
final class C4453d0<TResult> implements InterfaceC4463i0<TResult> {

    /* renamed from: a */
    private final Executor f10873a;

    /* renamed from: b */
    private final Object f10874b = new Object();

    /* renamed from: c */
    private InterfaceC4456f f10875c;

    public C4453d0(Executor executor, InterfaceC4456f interfaceC4456f) {
        this.f10873a = executor;
        this.f10875c = interfaceC4456f;
    }

    @Override // com.google.android.gms.tasks.InterfaceC4463i0
    /* renamed from: d */
    public final void mo27719d(j<TResult> jVar) {
        if (jVar.p() || jVar.n()) {
            return;
        }
        synchronized (this.f10874b) {
            if (this.f10875c == null) {
                return;
            }
            this.f10873a.execute(new RunnableC4451c0(this, jVar));
        }
    }
}
