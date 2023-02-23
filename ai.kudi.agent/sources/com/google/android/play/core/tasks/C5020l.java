package com.google.android.play.core.tasks;

import java.util.ArrayDeque;
import java.util.Queue;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.tasks.l */
/* loaded from: classes2.dex */
public final class C5020l<ResultT> {

    /* renamed from: a */
    private final Object f12669a = new Object();

    /* renamed from: b */
    private Queue<InterfaceC5019k<ResultT>> f12670b;

    /* renamed from: c */
    private boolean f12671c;

    /* renamed from: a */
    public final void m25861a(AbstractC5011c<ResultT> abstractC5011c) {
        InterfaceC5019k<ResultT> poll;
        synchronized (this.f12669a) {
            if (this.f12670b != null && !this.f12671c) {
                this.f12671c = true;
                while (true) {
                    synchronized (this.f12669a) {
                        poll = this.f12670b.poll();
                        if (poll == null) {
                            this.f12671c = false;
                            return;
                        }
                    }
                    poll.mo25862a(abstractC5011c);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m25860b(InterfaceC5019k<ResultT> interfaceC5019k) {
        synchronized (this.f12669a) {
            if (this.f12670b == null) {
                this.f12670b = new ArrayDeque();
            }
            this.f12670b.add(interfaceC5019k);
        }
    }
}
