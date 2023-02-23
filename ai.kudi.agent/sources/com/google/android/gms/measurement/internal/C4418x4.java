package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.x4 */
/* loaded from: classes2.dex */
public final class C4418x4 extends Thread {

    /* renamed from: c */
    private final Object f10788c;

    /* renamed from: d */
    private final BlockingQueue<C4407w4<?>> f10789d;

    /* renamed from: e */
    private boolean f10790e = false;

    /* renamed from: f */
    final /* synthetic */ C4429y4 f10791f;

    public C4418x4(C4429y4 c4429y4, String str, BlockingQueue<C4407w4<?>> blockingQueue) {
        this.f10791f = c4429y4;
        com.google.android.gms.common.internal.s.j(str);
        com.google.android.gms.common.internal.s.j(blockingQueue);
        this.f10788c = new Object();
        this.f10789d = blockingQueue;
        setName(str);
    }

    /* renamed from: b */
    private final void m27840b() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        C4418x4 c4418x4;
        C4418x4 c4418x42;
        obj = this.f10791f.f10830i;
        synchronized (obj) {
            if (!this.f10790e) {
                semaphore = this.f10791f.f10831j;
                semaphore.release();
                obj2 = this.f10791f.f10830i;
                obj2.notifyAll();
                c4418x4 = this.f10791f.f10824c;
                if (this == c4418x4) {
                    this.f10791f.f10824c = null;
                } else {
                    c4418x42 = this.f10791f.f10825d;
                    if (this == c4418x42) {
                        this.f10791f.f10825d = null;
                    } else {
                        ((v5) this.f10791f).a.b().r().m28014a("Current scheduler thread is neither worker nor network");
                    }
                }
                this.f10790e = true;
            }
        }
    }

    /* renamed from: c */
    private final void m27839c(InterruptedException interruptedException) {
        ((v5) this.f10791f).a.b().w().m28013b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: a */
    public final void m27841a() {
        synchronized (this.f10788c) {
            this.f10788c.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z = false;
        while (!z) {
            try {
                semaphore = this.f10791f.f10831j;
                semaphore.acquire();
                z = true;
            } catch (InterruptedException e) {
                m27839c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C4407w4<?> poll = this.f10789d.poll();
                if (poll != null) {
                    Process.setThreadPriority(true != poll.f10755d ? 10 : threadPriority);
                    poll.run();
                } else {
                    synchronized (this.f10788c) {
                        if (this.f10789d.peek() == null) {
                            boolean unused = this.f10791f.f10832k;
                            try {
                                this.f10788c.wait(30000L);
                            } catch (InterruptedException e2) {
                                m27839c(e2);
                            }
                        }
                    }
                    obj = this.f10791f.f10830i;
                    synchronized (obj) {
                        if (this.f10789d.peek() == null) {
                            break;
                        }
                    }
                }
            }
            if (((v5) this.f10791f).a.z().B(null, C4173c3.f10136k0)) {
                m27840b();
            }
        } finally {
            m27840b();
        }
    }
}
