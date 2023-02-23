package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;
/* renamed from: com.google.android.play.core.tasks.g */
/* loaded from: classes2.dex */
final class C5015g<ResultT> implements InterfaceC5019k<ResultT> {

    /* renamed from: a */
    private final Executor f12661a;

    /* renamed from: b */
    private final Object f12662b = new Object();

    /* renamed from: c */
    private final InterfaceC5009a f12663c;

    public C5015g(Executor executor, InterfaceC5009a interfaceC5009a) {
        this.f12661a = executor;
        this.f12663c = interfaceC5009a;
    }

    @Override // com.google.android.play.core.tasks.InterfaceC5019k
    /* renamed from: a */
    public final void mo25862a(AbstractC5011c<ResultT> abstractC5011c) {
        if (abstractC5011c.mo25848g()) {
            return;
        }
        synchronized (this.f12662b) {
            if (this.f12663c == null) {
                return;
            }
            this.f12661a.execute(new RunnableC5014f(this, abstractC5011c));
        }
    }
}
