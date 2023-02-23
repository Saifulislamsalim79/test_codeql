package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.n0 */
/* loaded from: classes2.dex */
public final class C4472n0<TResult> extends j<TResult> {

    /* renamed from: a */
    private final Object f10895a = new Object();

    /* renamed from: b */
    private final C4464j0<TResult> f10896b = new C4464j0<>();

    /* renamed from: c */
    private boolean f10897c;

    /* renamed from: d */
    private volatile boolean f10898d;

    /* renamed from: e */
    private TResult f10899e;

    /* renamed from: f */
    private Exception f10900f;

    /* renamed from: A */
    private final void m27758A() {
        synchronized (this.f10895a) {
            if (this.f10897c) {
                this.f10896b.m27778b(this);
            }
        }
    }

    /* renamed from: x */
    private final void m27734x() {
        com.google.android.gms.common.internal.s.n(this.f10897c, "Task is not yet complete");
    }

    /* renamed from: y */
    private final void m27733y() {
        if (this.f10898d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: z */
    private final void m27732z() {
        if (this.f10897c) {
            throw DuplicateTaskCompletionException.m27802a(this);
        }
    }

    /* renamed from: a */
    public final j<TResult> m27757a(Executor executor, InterfaceC4452d interfaceC4452d) {
        this.f10896b.m27779a(new C4485z(executor, interfaceC4452d));
        m27758A();
        return this;
    }

    /* renamed from: b */
    public final j<TResult> m27756b(InterfaceC4454e<TResult> interfaceC4454e) {
        this.f10896b.m27779a(new C4449b0(C4467l.f10891a, interfaceC4454e));
        m27758A();
        return this;
    }

    /* renamed from: c */
    public final j<TResult> m27755c(Executor executor, InterfaceC4454e<TResult> interfaceC4454e) {
        this.f10896b.m27779a(new C4449b0(executor, interfaceC4454e));
        m27758A();
        return this;
    }

    /* renamed from: d */
    public final j<TResult> m27754d(InterfaceC4456f interfaceC4456f) {
        m27753e(C4467l.f10891a, interfaceC4456f);
        return this;
    }

    /* renamed from: e */
    public final j<TResult> m27753e(Executor executor, InterfaceC4456f interfaceC4456f) {
        this.f10896b.m27779a(new C4453d0(executor, interfaceC4456f));
        m27758A();
        return this;
    }

    /* renamed from: f */
    public final j<TResult> m27752f(InterfaceC4458g<? super TResult> interfaceC4458g) {
        m27751g(C4467l.f10891a, interfaceC4458g);
        return this;
    }

    /* renamed from: g */
    public final j<TResult> m27751g(Executor executor, InterfaceC4458g<? super TResult> interfaceC4458g) {
        this.f10896b.m27779a(new C4457f0(executor, interfaceC4458g));
        m27758A();
        return this;
    }

    /* renamed from: h */
    public final <TContinuationResult> j<TContinuationResult> m27750h(InterfaceC4450c<TResult, TContinuationResult> interfaceC4450c) {
        return m27749i(C4467l.f10891a, interfaceC4450c);
    }

    /* renamed from: i */
    public final <TContinuationResult> j<TContinuationResult> m27749i(Executor executor, InterfaceC4450c<TResult, TContinuationResult> interfaceC4450c) {
        C4472n0 c4472n0 = new C4472n0();
        this.f10896b.m27779a(new C4481v(executor, interfaceC4450c, c4472n0));
        m27758A();
        return c4472n0;
    }

    /* renamed from: j */
    public final <TContinuationResult> j<TContinuationResult> m27748j(Executor executor, InterfaceC4450c<TResult, j<TContinuationResult>> interfaceC4450c) {
        C4472n0 c4472n0 = new C4472n0();
        this.f10896b.m27779a(new C4483x(executor, interfaceC4450c, c4472n0));
        m27758A();
        return c4472n0;
    }

    /* renamed from: k */
    public final Exception m27747k() {
        Exception exc;
        synchronized (this.f10895a) {
            exc = this.f10900f;
        }
        return exc;
    }

    /* renamed from: l */
    public final TResult m27746l() {
        TResult tresult;
        synchronized (this.f10895a) {
            m27734x();
            m27733y();
            Exception exc = this.f10900f;
            if (exc == null) {
                tresult = this.f10899e;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return tresult;
    }

    /* renamed from: m */
    public final <X extends Throwable> TResult m27745m(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f10895a) {
            m27734x();
            m27733y();
            if (!cls.isInstance(this.f10900f)) {
                Exception exc = this.f10900f;
                if (exc == null) {
                    tresult = this.f10899e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw cls.cast(this.f10900f);
            }
        }
        return tresult;
    }

    /* renamed from: n */
    public final boolean m27744n() {
        return this.f10898d;
    }

    /* renamed from: o */
    public final boolean m27743o() {
        boolean z;
        synchronized (this.f10895a) {
            z = this.f10897c;
        }
        return z;
    }

    /* renamed from: p */
    public final boolean m27742p() {
        boolean z;
        synchronized (this.f10895a) {
            z = false;
            if (this.f10897c && !this.f10898d && this.f10900f == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: q */
    public final <TContinuationResult> j<TContinuationResult> m27741q(InterfaceC4462i<TResult, TContinuationResult> interfaceC4462i) {
        Executor executor = C4467l.f10891a;
        C4472n0 c4472n0 = new C4472n0();
        this.f10896b.m27779a(new C4461h0(executor, interfaceC4462i, c4472n0));
        m27758A();
        return c4472n0;
    }

    /* renamed from: r */
    public final <TContinuationResult> j<TContinuationResult> m27740r(Executor executor, InterfaceC4462i<TResult, TContinuationResult> interfaceC4462i) {
        C4472n0 c4472n0 = new C4472n0();
        this.f10896b.m27779a(new C4461h0(executor, interfaceC4462i, c4472n0));
        m27758A();
        return c4472n0;
    }

    /* renamed from: s */
    public final void m27739s(Exception exc) {
        com.google.android.gms.common.internal.s.k(exc, "Exception must not be null");
        synchronized (this.f10895a) {
            m27732z();
            this.f10897c = true;
            this.f10900f = exc;
        }
        this.f10896b.m27778b(this);
    }

    /* renamed from: t */
    public final void m27738t(TResult tresult) {
        synchronized (this.f10895a) {
            m27732z();
            this.f10897c = true;
            this.f10899e = tresult;
        }
        this.f10896b.m27778b(this);
    }

    /* renamed from: u */
    public final boolean m27737u() {
        synchronized (this.f10895a) {
            if (this.f10897c) {
                return false;
            }
            this.f10897c = true;
            this.f10898d = true;
            this.f10896b.m27778b(this);
            return true;
        }
    }

    /* renamed from: v */
    public final boolean m27736v(Exception exc) {
        com.google.android.gms.common.internal.s.k(exc, "Exception must not be null");
        synchronized (this.f10895a) {
            if (this.f10897c) {
                return false;
            }
            this.f10897c = true;
            this.f10900f = exc;
            this.f10896b.m27778b(this);
            return true;
        }
    }

    /* renamed from: w */
    public final boolean m27735w(TResult tresult) {
        synchronized (this.f10895a) {
            if (this.f10897c) {
                return false;
            }
            this.f10897c = true;
            this.f10899e = tresult;
            this.f10896b.m27778b(this);
            return true;
        }
    }
}
