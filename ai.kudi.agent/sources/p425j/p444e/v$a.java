package p425j.p444e;

import j.e.c0.c;
import p425j.p444e.p451f0.p464g.C11627g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scheduler.java */
/* renamed from: j.e.v$a */
/* loaded from: classes3.dex */
public final class v$a implements c, Runnable {

    /* renamed from: c */
    final Runnable f26430c;

    /* renamed from: d */
    final v$b f26431d;

    /* renamed from: e */
    Thread f26432e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v$a(Runnable runnable, v$b v_b) {
        this.f26430c = runnable;
        this.f26431d = v_b;
    }

    /* renamed from: i */
    public void m10451i() {
        if (this.f26432e == Thread.currentThread()) {
            v$b v_b = this.f26431d;
            if (v_b instanceof C11627g) {
                ((C11627g) v_b).m10719f();
                return;
            }
        }
        this.f26431d.i();
    }

    /* renamed from: j */
    public boolean m10450j() {
        return this.f26431d.j();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f26432e = Thread.currentThread();
        try {
            this.f26430c.run();
        } finally {
            m10451i();
            this.f26432e = null;
        }
    }
}
