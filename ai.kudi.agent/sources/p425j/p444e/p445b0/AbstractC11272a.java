package p425j.p444e.p445b0;

import android.os.Looper;
import j.e.b0.c.a;
import j.e.c0.c;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: MainThreadDisposable.java */
/* renamed from: j.e.b0.a */
/* loaded from: classes3.dex */
public abstract class AbstractC11272a implements c {

    /* renamed from: c */
    private final AtomicBoolean f25406c = new AtomicBoolean();

    /* compiled from: MainThreadDisposable.java */
    /* renamed from: j.e.b0.a$a */
    /* loaded from: classes3.dex */
    class RunnableC11273a implements Runnable {
        RunnableC11273a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC11272a.this.mo11230a();
        }
    }

    /* renamed from: a */
    protected abstract void mo11230a();

    /* renamed from: i */
    public final void m11229i() {
        if (this.f25406c.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo11230a();
            } else {
                a.c().b(new RunnableC11273a());
            }
        }
    }

    /* renamed from: j */
    public final boolean m11228j() {
        return this.f25406c.get();
    }
}
