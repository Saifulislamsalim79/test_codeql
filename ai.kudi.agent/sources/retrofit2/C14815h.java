package retrofit2;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import p565l.AbstractC14135d0;
import p565l.C14131c0;
import p565l.C14235v;
import p565l.InterfaceC14138e;
import p565l.InterfaceC14141f;
import p576m.AbstractC14349h;
import p576m.C14342c;
import p576m.C14353l;
import p576m.InterfaceC14346e;
import p576m.InterfaceC14365s;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OkHttpCall.java */
/* renamed from: retrofit2.h */
/* loaded from: classes3.dex */
public final class C14815h<T> implements InterfaceC14801b<T> {

    /* renamed from: c */
    private final C14844n<T, ?> f33093c;

    /* renamed from: d */
    private final Object[] f33094d;

    /* renamed from: e */
    private volatile boolean f33095e;

    /* renamed from: f */
    private InterfaceC14138e f33096f;

    /* renamed from: w */
    private Throwable f33097w;

    /* renamed from: x */
    private boolean f33098x;

    /* compiled from: OkHttpCall.java */
    /* renamed from: retrofit2.h$a */
    /* loaded from: classes3.dex */
    class C14816a implements InterfaceC14141f {

        /* renamed from: a */
        final /* synthetic */ InterfaceC14804d f33099a;

        C14816a(InterfaceC14804d interfaceC14804d) {
            this.f33099a = interfaceC14804d;
        }

        /* renamed from: c */
        private void m314c(Throwable th) {
            try {
                this.f33099a.mo322a(C14815h.this, th);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }

        @Override // p565l.InterfaceC14141f
        /* renamed from: a */
        public void mo316a(InterfaceC14138e interfaceC14138e, C14131c0 c14131c0) {
            try {
                try {
                    this.f33099a.mo321b(C14815h.this, C14815h.this.m318c(c14131c0));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                m314c(th2);
            }
        }

        @Override // p565l.InterfaceC14141f
        /* renamed from: b */
        public void mo315b(InterfaceC14138e interfaceC14138e, IOException iOException) {
            m314c(iOException);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OkHttpCall.java */
    /* renamed from: retrofit2.h$b */
    /* loaded from: classes3.dex */
    public static final class C14817b extends AbstractC14135d0 {

        /* renamed from: d */
        private final AbstractC14135d0 f33101d;

        /* renamed from: e */
        IOException f33102e;

        /* compiled from: OkHttpCall.java */
        /* renamed from: retrofit2.h$b$a */
        /* loaded from: classes3.dex */
        class C14818a extends AbstractC14349h {
            C14818a(InterfaceC14365s interfaceC14365s) {
                super(interfaceC14365s);
            }

            @Override // p576m.AbstractC14349h, p576m.InterfaceC14365s
            /* renamed from: O0 */
            public long mo312O0(C14342c c14342c, long j) throws IOException {
                try {
                    return super.mo312O0(c14342c, j);
                } catch (IOException e) {
                    C14817b.this.f33102e = e;
                    throw e;
                }
            }
        }

        C14817b(AbstractC14135d0 abstractC14135d0) {
            this.f33101d = abstractC14135d0;
        }

        @Override // p565l.AbstractC14135d0
        /* renamed from: F */
        public C14235v mo311F() {
            return this.f33101d.mo311F();
        }

        @Override // p565l.AbstractC14135d0
        /* renamed from: O */
        public InterfaceC14346e mo310O() {
            return C14353l.m2021d(new C14818a(this.f33101d.mo310O()));
        }

        /* renamed from: V */
        void m313V() throws IOException {
            IOException iOException = this.f33102e;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // p565l.AbstractC14135d0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f33101d.close();
        }

        @Override // p565l.AbstractC14135d0
        /* renamed from: m */
        public long mo309m() {
            return this.f33101d.mo309m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OkHttpCall.java */
    /* renamed from: retrofit2.h$c */
    /* loaded from: classes3.dex */
    public static final class C14819c extends AbstractC14135d0 {

        /* renamed from: d */
        private final C14235v f33104d;

        /* renamed from: e */
        private final long f33105e;

        C14819c(C14235v c14235v, long j) {
            this.f33104d = c14235v;
            this.f33105e = j;
        }

        @Override // p565l.AbstractC14135d0
        /* renamed from: F */
        public C14235v mo311F() {
            return this.f33104d;
        }

        @Override // p565l.AbstractC14135d0
        /* renamed from: O */
        public InterfaceC14346e mo310O() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }

        @Override // p565l.AbstractC14135d0
        /* renamed from: m */
        public long mo309m() {
            return this.f33105e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14815h(C14844n<T, ?> c14844n, Object[] objArr) {
        this.f33093c = c14844n;
        this.f33094d = objArr;
    }

    /* renamed from: b */
    private InterfaceC14138e m319b() throws IOException {
        InterfaceC14138e m255d = this.f33093c.m255d(this.f33094d);
        if (m255d != null) {
            return m255d;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @Override // retrofit2.InterfaceC14801b
    /* renamed from: a */
    public C14815h<T> mo41960clone() {
        return new C14815h<>(this.f33093c, this.f33094d);
    }

    /* renamed from: c */
    C14840l<T> m318c(C14131c0 c14131c0) throws IOException {
        AbstractC14135d0 m2878c = c14131c0.m2878c();
        C14131c0.C14132a m2879b0 = c14131c0.m2879b0();
        m2879b0.m2869b(new C14819c(m2878c.mo311F(), m2878c.mo309m()));
        C14131c0 m2868c = m2879b0.m2868c();
        int m2887F = m2868c.m2887F();
        if (m2887F < 200 || m2887F >= 300) {
            try {
                return C14840l.m282c(C14846o.m240a(m2878c), m2868c);
            } finally {
                m2878c.close();
            }
        } else if (m2887F != 204 && m2887F != 205) {
            C14817b c14817b = new C14817b(m2878c);
            try {
                return C14840l.m278g(this.f33093c.m254e(c14817b), m2868c);
            } catch (RuntimeException e) {
                c14817b.m313V();
                throw e;
            }
        } else {
            m2878c.close();
            return C14840l.m278g(null, m2868c);
        }
    }

    @Override // retrofit2.InterfaceC14801b
    public void cancel() {
        InterfaceC14138e interfaceC14138e;
        this.f33095e = true;
        synchronized (this) {
            interfaceC14138e = this.f33096f;
        }
        if (interfaceC14138e != null) {
            interfaceC14138e.cancel();
        }
    }

    @Override // retrofit2.InterfaceC14801b
    public C14840l<T> execute() throws IOException {
        InterfaceC14138e interfaceC14138e;
        synchronized (this) {
            if (!this.f33098x) {
                this.f33098x = true;
                if (this.f33097w != null) {
                    if (!(this.f33097w instanceof IOException)) {
                        if (this.f33097w instanceof RuntimeException) {
                            throw ((RuntimeException) this.f33097w);
                        }
                        throw ((Error) this.f33097w);
                    }
                    throw ((IOException) this.f33097w);
                }
                interfaceC14138e = this.f33096f;
                if (interfaceC14138e == null) {
                    try {
                        interfaceC14138e = m319b();
                        this.f33096f = interfaceC14138e;
                    } catch (IOException | Error | RuntimeException e) {
                        C14846o.m225p(e);
                        this.f33097w = e;
                        throw e;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f33095e) {
            interfaceC14138e.cancel();
        }
        return m318c(FirebasePerfOkHttpClient.execute(interfaceC14138e));
    }

    @Override // retrofit2.InterfaceC14801b
    /* renamed from: g0 */
    public void mo317g0(InterfaceC14804d<T> interfaceC14804d) {
        InterfaceC14138e interfaceC14138e;
        Throwable th;
        C14846o.m239b(interfaceC14804d, "callback == null");
        synchronized (this) {
            if (!this.f33098x) {
                this.f33098x = true;
                interfaceC14138e = this.f33096f;
                th = this.f33097w;
                if (interfaceC14138e == null && th == null) {
                    InterfaceC14138e m319b = m319b();
                    this.f33096f = m319b;
                    interfaceC14138e = m319b;
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            interfaceC14804d.mo322a(this, th);
            return;
        }
        if (this.f33095e) {
            interfaceC14138e.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(interfaceC14138e, new C14816a(interfaceC14804d));
    }

    @Override // retrofit2.InterfaceC14801b
    public boolean isCanceled() {
        boolean z = true;
        if (this.f33095e) {
            return true;
        }
        synchronized (this) {
            if (this.f33096f == null || !this.f33096f.isCanceled()) {
                z = false;
            }
        }
        return z;
    }
}
