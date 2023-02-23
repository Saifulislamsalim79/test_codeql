package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.j0 */
/* loaded from: classes2.dex */
final class C4464j0<TResult> {

    /* renamed from: a */
    private final Object f10886a = new Object();

    /* renamed from: b */
    private Queue<InterfaceC4463i0<TResult>> f10887b;

    /* renamed from: c */
    private boolean f10888c;

    /* renamed from: a */
    public final void m27779a(InterfaceC4463i0<TResult> interfaceC4463i0) {
        synchronized (this.f10886a) {
            if (this.f10887b == null) {
                this.f10887b = new ArrayDeque();
            }
            this.f10887b.add(interfaceC4463i0);
        }
    }

    /* renamed from: b */
    public final void m27778b(j<TResult> jVar) {
        InterfaceC4463i0<TResult> poll;
        synchronized (this.f10886a) {
            if (this.f10887b != null && !this.f10888c) {
                this.f10888c = true;
                while (true) {
                    synchronized (this.f10886a) {
                        poll = this.f10887b.poll();
                        if (poll == null) {
                            this.f10888c = false;
                            return;
                        }
                    }
                    poll.mo27719d(jVar);
                }
            }
        }
    }
}
