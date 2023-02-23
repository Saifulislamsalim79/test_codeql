package androidx.lifecycle;

import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.p476c0.InterfaceC11719g;
import kotlinx.coroutines.AbstractC14111y1;
import kotlinx.coroutines.C14107x0;
/* compiled from: DispatchQueue.kt */
/* renamed from: androidx.lifecycle.d */
/* loaded from: classes2.dex */
public final class C1549d {

    /* renamed from: b */
    private boolean f4757b;

    /* renamed from: c */
    private boolean f4758c;

    /* renamed from: a */
    private boolean f4756a = true;

    /* renamed from: d */
    private final Queue<Runnable> f4759d = new ArrayDeque();

    /* compiled from: DispatchQueue.kt */
    /* renamed from: androidx.lifecycle.d$a */
    /* loaded from: classes2.dex */
    static final class RunnableC1550a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ Runnable f4761d;

        RunnableC1550a(InterfaceC11719g interfaceC11719g, Runnable runnable) {
            this.f4761d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1549d.this.m35542e(this.f4761d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final void m35542e(Runnable runnable) {
        if (this.f4759d.offer(runnable)) {
            m35543d();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables".toString());
    }

    /* renamed from: b */
    public final boolean m35545b() {
        return this.f4757b || !this.f4756a;
    }

    /* renamed from: c */
    public final void m35544c(InterfaceC11719g interfaceC11719g, Runnable runnable) {
        kotlin.e0.d.l.f(interfaceC11719g, "context");
        kotlin.e0.d.l.f(runnable, "runnable");
        AbstractC14111y1 mo2938J0 = C14107x0.m2944c().mo2938J0();
        if (!mo2938J0.mo3399H0(interfaceC11719g) && !m35545b()) {
            m35542e(runnable);
        } else {
            mo2938J0.mo3067o0(interfaceC11719g, new RunnableC1550a(interfaceC11719g, runnable));
        }
    }

    /* renamed from: d */
    public final void m35543d() {
        if (this.f4758c) {
            return;
        }
        try {
            this.f4758c = true;
            while ((!this.f4759d.isEmpty()) && m35545b()) {
                Runnable poll = this.f4759d.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        } finally {
            this.f4758c = false;
        }
    }

    /* renamed from: f */
    public final void m35541f() {
        this.f4757b = true;
        m35543d();
    }

    /* renamed from: g */
    public final void m35540g() {
        this.f4756a = true;
    }

    /* renamed from: h */
    public final void m35539h() {
        if (this.f4756a) {
            if (!this.f4757b) {
                this.f4756a = false;
                m35543d();
                return;
            }
            throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
        }
    }
}
