package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.tasks.i */
/* loaded from: classes2.dex */
public final class C5017i<ResultT> implements InterfaceC5019k<ResultT> {

    /* renamed from: a */
    private final Executor f12666a;

    /* renamed from: b */
    private final Object f12667b = new Object();

    /* renamed from: c */
    private final InterfaceC5010b<? super ResultT> f12668c;

    public C5017i(Executor executor, InterfaceC5010b<? super ResultT> interfaceC5010b) {
        this.f12666a = executor;
        this.f12668c = interfaceC5010b;
    }

    @Override // com.google.android.play.core.tasks.InterfaceC5019k
    /* renamed from: a */
    public final void mo25862a(AbstractC5011c<ResultT> abstractC5011c) {
        if (abstractC5011c.mo25848g()) {
            synchronized (this.f12667b) {
                if (this.f12668c == null) {
                    return;
                }
                this.f12666a.execute(new RunnableC5016h(this, abstractC5011c));
            }
        }
    }
}
