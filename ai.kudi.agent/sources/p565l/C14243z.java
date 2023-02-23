package p565l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.connection.C14473a;
import p565l.p566g0.AbstractRunnableC14147b;
import p565l.p566g0.p567e.C14152a;
import p565l.p566g0.p568f.C14166a;
import p565l.p566g0.p568f.C14167b;
import p565l.p566g0.p568f.C14174g;
import p565l.p566g0.p568f.C14177j;
import p565l.p566g0.p571i.C14198f;
import p576m.C14337a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealCall.java */
/* renamed from: l.z */
/* loaded from: classes3.dex */
public final class C14243z implements InterfaceC14138e {

    /* renamed from: c */
    final C14239x f31255c;

    /* renamed from: d */
    final C14177j f31256d;

    /* renamed from: e */
    final C14337a f31257e;

    /* renamed from: f */
    private AbstractC14222p f31258f;

    /* renamed from: w */
    final C14116a0 f31259w;

    /* renamed from: x */
    final boolean f31260x;

    /* renamed from: y */
    private boolean f31261y;

    /* compiled from: RealCall.java */
    /* renamed from: l.z$a */
    /* loaded from: classes3.dex */
    class C14244a extends C14337a {
        C14244a() {
        }

        @Override // p576m.C14337a
        /* renamed from: t */
        protected void mo1440t() {
            C14243z.this.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealCall.java */
    /* renamed from: l.z$b */
    /* loaded from: classes3.dex */
    public final class C14245b extends AbstractRunnableC14147b {

        /* renamed from: d */
        private final InterfaceC14141f f31263d;

        C14245b(InterfaceC14141f interfaceC14141f) {
            super("OkHttp %s", C14243z.this.m2411f());
            this.f31263d = interfaceC14141f;
        }

        @Override // p565l.p566g0.AbstractRunnableC14147b
        /* renamed from: e */
        protected void mo1487e() {
            IOException e;
            C14131c0 m2413d;
            C14243z.this.f31257e.m2086k();
            boolean z = true;
            try {
                try {
                    m2413d = C14243z.this.m2413d();
                } catch (IOException e2) {
                    e = e2;
                    z = false;
                }
                try {
                    if (C14243z.this.f31256d.m2698d()) {
                        this.f31263d.mo315b(C14243z.this, new IOException("Canceled"));
                    } else {
                        this.f31263d.mo316a(C14243z.this, m2413d);
                    }
                } catch (IOException e3) {
                    e = e3;
                    IOException m2410g = C14243z.this.m2410g(e);
                    if (!z) {
                        C14243z.this.f31258f.m2583b(C14243z.this, m2410g);
                        this.f31263d.mo315b(C14243z.this, m2410g);
                    } else {
                        C14198f m2653j = C14198f.m2653j();
                        m2653j.mo2646q(4, "Callback failure for " + C14243z.this.m2409h(), m2410g);
                    }
                }
            } finally {
                C14243z.this.f31255c.m2451j().m2589e(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public void m2408f(ExecutorService executorService) {
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    C14243z.this.f31258f.m2583b(C14243z.this, interruptedIOException);
                    this.f31263d.mo315b(C14243z.this, interruptedIOException);
                    C14243z.this.f31255c.m2451j().m2589e(this);
                }
            } catch (Throwable th) {
                C14243z.this.f31255c.m2451j().m2589e(this);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g */
        public C14243z m2407g() {
            return C14243z.this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h */
        public String m2406h() {
            return C14243z.this.f31259w.m2913i().m2516m();
        }
    }

    private C14243z(C14239x c14239x, C14116a0 c14116a0, boolean z) {
        this.f31255c = c14239x;
        this.f31259w = c14116a0;
        this.f31260x = z;
        this.f31256d = new C14177j(c14239x, z);
        C14244a c14244a = new C14244a();
        this.f31257e = c14244a;
        c14244a.mo1946g(c14239x.m2457d(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    private void m2415b() {
        this.f31256d.m2693i(C14198f.m2653j().mo2649n("response.body().close()"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C14243z m2412e(C14239x c14239x, C14116a0 c14116a0, boolean z) {
        C14243z c14243z = new C14243z(c14239x, c14116a0, z);
        c14243z.f31258f = c14239x.m2449l().mo2563a(c14243z);
        return c14243z;
    }

    @Override // p565l.InterfaceC14138e
    /* renamed from: J */
    public void mo2417J(InterfaceC14141f interfaceC14141f) {
        synchronized (this) {
            if (!this.f31261y) {
                this.f31261y = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        m2415b();
        this.f31258f.m2582c(this);
        this.f31255c.m2451j().m2593a(new C14245b(interfaceC14141f));
    }

    /* renamed from: c */
    public C14243z clone() {
        return m2412e(this.f31255c, this.f31259w, this.f31260x);
    }

    @Override // p565l.InterfaceC14138e
    public void cancel() {
        this.f31256d.m2701a();
    }

    /* renamed from: d */
    C14131c0 m2413d() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f31255c.m2445q());
        arrayList.add(this.f31256d);
        arrayList.add(new C14166a(this.f31255c.m2452i()));
        arrayList.add(new C14152a(this.f31255c.m2444r()));
        arrayList.add(new C14473a(this.f31255c));
        if (!this.f31260x) {
            arrayList.addAll(this.f31255c.m2443s());
        }
        arrayList.add(new C14167b(this.f31260x));
        return new C14174g(arrayList, null, null, null, 0, this.f31259w, this, this.f31258f, this.f31255c.m2455f(), this.f31255c.m2436z(), this.f31255c.m2461D()).mo2478a(this.f31259w);
    }

    @Override // p565l.InterfaceC14138e
    public C14131c0 execute() throws IOException {
        synchronized (this) {
            if (!this.f31261y) {
                this.f31261y = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        m2415b();
        this.f31257e.m2086k();
        this.f31258f.m2582c(this);
        try {
            try {
                this.f31255c.m2451j().m2592b(this);
                C14131c0 m2413d = m2413d();
                if (m2413d != null) {
                    return m2413d;
                }
                throw new IOException("Canceled");
            } catch (IOException e) {
                IOException m2410g = m2410g(e);
                this.f31258f.m2583b(this, m2410g);
                throw m2410g;
            }
        } finally {
            this.f31255c.m2451j().m2588f(this);
        }
    }

    /* renamed from: f */
    String m2411f() {
        return this.f31259w.m2913i().m2533C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public IOException m2410g(IOException iOException) {
        if (this.f31257e.m2083n()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
            return interruptedIOException;
        }
        return iOException;
    }

    /* renamed from: h */
    String m2409h() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.f31260x ? "web socket" : "call");
        sb.append(" to ");
        sb.append(m2411f());
        return sb.toString();
    }

    @Override // p565l.InterfaceC14138e
    public boolean isCanceled() {
        return this.f31256d.m2698d();
    }

    @Override // p565l.InterfaceC14138e
    public C14116a0 request() {
        return this.f31259w;
    }
}
