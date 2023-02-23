package com.google.android.play.core.tasks;

import com.google.android.play.core.internal.C4985m;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.play.core.tasks.p */
/* loaded from: classes2.dex */
final class C5024p<ResultT> extends AbstractC5011c<ResultT> {

    /* renamed from: a */
    private final Object f12674a = new Object();

    /* renamed from: b */
    private final C5020l<ResultT> f12675b = new C5020l<>();

    /* renamed from: c */
    private boolean f12676c;

    /* renamed from: d */
    private ResultT f12677d;

    /* renamed from: e */
    private Exception f12678e;

    /* renamed from: h */
    private final void m25847h() {
        C4985m.m25919c(this.f12676c, "Task is not yet complete");
    }

    /* renamed from: k */
    private final void m25844k() {
        C4985m.m25919c(!this.f12676c, "Task is already complete");
    }

    /* renamed from: n */
    private final void m25841n() {
        synchronized (this.f12674a) {
            if (this.f12676c) {
                this.f12675b.m25861a(this);
            }
        }
    }

    @Override // com.google.android.play.core.tasks.AbstractC5011c
    /* renamed from: a */
    public final AbstractC5011c<ResultT> mo25854a(Executor executor, InterfaceC5009a interfaceC5009a) {
        this.f12675b.m25860b(new C5015g(executor, interfaceC5009a));
        m25841n();
        return this;
    }

    @Override // com.google.android.play.core.tasks.AbstractC5011c
    /* renamed from: b */
    public final AbstractC5011c<ResultT> mo25853b(InterfaceC5010b<? super ResultT> interfaceC5010b) {
        mo25852c(C5012d.f12657a, interfaceC5010b);
        return this;
    }

    @Override // com.google.android.play.core.tasks.AbstractC5011c
    /* renamed from: c */
    public final AbstractC5011c<ResultT> mo25852c(Executor executor, InterfaceC5010b<? super ResultT> interfaceC5010b) {
        this.f12675b.m25860b(new C5017i(executor, interfaceC5010b));
        m25841n();
        return this;
    }

    @Override // com.google.android.play.core.tasks.AbstractC5011c
    /* renamed from: d */
    public final Exception mo25851d() {
        Exception exc;
        synchronized (this.f12674a) {
            exc = this.f12678e;
        }
        return exc;
    }

    @Override // com.google.android.play.core.tasks.AbstractC5011c
    /* renamed from: e */
    public final ResultT mo25850e() {
        ResultT resultt;
        synchronized (this.f12674a) {
            m25847h();
            Exception exc = this.f12678e;
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            resultt = this.f12677d;
        }
        return resultt;
    }

    @Override // com.google.android.play.core.tasks.AbstractC5011c
    /* renamed from: f */
    public final boolean mo25849f() {
        boolean z;
        synchronized (this.f12674a) {
            z = this.f12676c;
        }
        return z;
    }

    @Override // com.google.android.play.core.tasks.AbstractC5011c
    /* renamed from: g */
    public final boolean mo25848g() {
        boolean z;
        synchronized (this.f12674a) {
            z = false;
            if (this.f12676c && this.f12678e == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: i */
    public final void m25846i(Exception exc) {
        synchronized (this.f12674a) {
            m25844k();
            this.f12676c = true;
            this.f12678e = exc;
        }
        this.f12675b.m25861a(this);
    }

    /* renamed from: j */
    public final void m25845j(ResultT resultt) {
        synchronized (this.f12674a) {
            m25844k();
            this.f12676c = true;
            this.f12677d = resultt;
        }
        this.f12675b.m25861a(this);
    }

    /* renamed from: l */
    public final boolean m25843l(Exception exc) {
        synchronized (this.f12674a) {
            if (this.f12676c) {
                return false;
            }
            this.f12676c = true;
            this.f12678e = exc;
            this.f12675b.m25861a(this);
            return true;
        }
    }

    /* renamed from: m */
    public final boolean m25842m(ResultT resultt) {
        synchronized (this.f12674a) {
            if (this.f12676c) {
                return false;
            }
            this.f12676c = true;
            this.f12677d = resultt;
            this.f12675b.m25861a(this);
            return true;
        }
    }
}
