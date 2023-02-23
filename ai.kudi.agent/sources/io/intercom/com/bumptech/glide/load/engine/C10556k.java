package io.intercom.com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.load.engine.RunnableC10533g;
import io.intercom.com.bumptech.glide.load.engine.p394a0.ExecutorServiceC10519a;
import io.intercom.com.bumptech.glide.p412p.InterfaceC10857h;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import io.intercom.com.bumptech.glide.p416r.p417j.AbstractC10903b;
import io.intercom.com.bumptech.glide.p416r.p417j.C10895a;
import java.util.ArrayList;
import java.util.List;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: EngineJob.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.k */
/* loaded from: classes3.dex */
class C10556k<R> implements RunnableC10533g.InterfaceC10535b<R>, C10895a.InterfaceC10901f {

    /* renamed from: P */
    private static final C10557a f24263P = new C10557a();

    /* renamed from: Q */
    private static final Handler f24264Q = new Handler(Looper.getMainLooper(), new C10558b());

    /* renamed from: A */
    private final ExecutorServiceC10519a f24265A;

    /* renamed from: B */
    private InterfaceC10622g f24266B;

    /* renamed from: C */
    private boolean f24267C;

    /* renamed from: D */
    private boolean f24268D;

    /* renamed from: E */
    private boolean f24269E;

    /* renamed from: F */
    private boolean f24270F;

    /* renamed from: G */
    private InterfaceC10569t<?> f24271G;

    /* renamed from: H */
    private EnumC10507a f24272H;

    /* renamed from: I */
    private boolean f24273I;

    /* renamed from: J */
    private GlideException f24274J;

    /* renamed from: K */
    private boolean f24275K;

    /* renamed from: L */
    private List<InterfaceC10857h> f24276L;

    /* renamed from: M */
    private C10562o<?> f24277M;

    /* renamed from: N */
    private RunnableC10533g<R> f24278N;

    /* renamed from: O */
    private volatile boolean f24279O;

    /* renamed from: c */
    private final List<InterfaceC10857h> f24280c;

    /* renamed from: d */
    private final AbstractC10903b f24281d;

    /* renamed from: e */
    private final InterfaceC7672e<C10556k<?>> f24282e;

    /* renamed from: f */
    private final C10557a f24283f;

    /* renamed from: w */
    private final InterfaceC10559l f24284w;

    /* renamed from: x */
    private final ExecutorServiceC10519a f24285x;

    /* renamed from: y */
    private final ExecutorServiceC10519a f24286y;

    /* renamed from: z */
    private final ExecutorServiceC10519a f24287z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineJob.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.k$a */
    /* loaded from: classes3.dex */
    public static class C10557a {
        C10557a() {
        }

        /* renamed from: a */
        public <R> C10562o<R> m12743a(InterfaceC10569t<R> interfaceC10569t, boolean z) {
            return new C10562o<>(interfaceC10569t, z, true);
        }
    }

    /* compiled from: EngineJob.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.k$b */
    /* loaded from: classes3.dex */
    private static class C10558b implements Handler.Callback {
        C10558b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            C10556k c10556k = (C10556k) message.obj;
            int i = message.what;
            if (i == 1) {
                c10556k.m12750k();
            } else if (i == 2) {
                c10556k.m12751j();
            } else if (i == 3) {
                c10556k.m12752i();
            } else {
                throw new IllegalStateException("Unrecognized message: " + message.what);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10556k(ExecutorServiceC10519a executorServiceC10519a, ExecutorServiceC10519a executorServiceC10519a2, ExecutorServiceC10519a executorServiceC10519a3, ExecutorServiceC10519a executorServiceC10519a4, InterfaceC10559l interfaceC10559l, InterfaceC7672e<C10556k<?>> interfaceC7672e) {
        this(executorServiceC10519a, executorServiceC10519a2, executorServiceC10519a3, executorServiceC10519a4, interfaceC10559l, interfaceC7672e, f24263P);
    }

    /* renamed from: e */
    private void m12755e(InterfaceC10857h interfaceC10857h) {
        if (this.f24276L == null) {
            this.f24276L = new ArrayList(2);
        }
        if (this.f24276L.contains(interfaceC10857h)) {
            return;
        }
        this.f24276L.add(interfaceC10857h);
    }

    /* renamed from: h */
    private ExecutorServiceC10519a m12753h() {
        return this.f24268D ? this.f24287z : this.f24269E ? this.f24265A : this.f24286y;
    }

    /* renamed from: m */
    private boolean m12748m(InterfaceC10857h interfaceC10857h) {
        List<InterfaceC10857h> list = this.f24276L;
        return list != null && list.contains(interfaceC10857h);
    }

    /* renamed from: o */
    private void m12746o(boolean z) {
        C10893i.m12011b();
        this.f24280c.clear();
        this.f24266B = null;
        this.f24277M = null;
        this.f24271G = null;
        List<InterfaceC10857h> list = this.f24276L;
        if (list != null) {
            list.clear();
        }
        this.f24275K = false;
        this.f24279O = false;
        this.f24273I = false;
        this.f24278N.m12808O(z);
        this.f24278N = null;
        this.f24274J = null;
        this.f24272H = null;
        this.f24282e.mo11983a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.intercom.com.bumptech.glide.load.engine.RunnableC10533g.InterfaceC10535b
    /* renamed from: a */
    public void mo12759a(InterfaceC10569t<R> interfaceC10569t, EnumC10507a enumC10507a) {
        this.f24271G = interfaceC10569t;
        this.f24272H = enumC10507a;
        f24264Q.obtainMessage(1, this).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m12758b(InterfaceC10857h interfaceC10857h) {
        C10893i.m12011b();
        this.f24281d.mo11977c();
        if (this.f24273I) {
            interfaceC10857h.mo12111a(this.f24277M, this.f24272H);
        } else if (this.f24275K) {
            interfaceC10857h.mo12110c(this.f24274J);
        } else {
            this.f24280c.add(interfaceC10857h);
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.RunnableC10533g.InterfaceC10535b
    /* renamed from: c */
    public void mo12757c(GlideException glideException) {
        this.f24274J = glideException;
        f24264Q.obtainMessage(2, this).sendToTarget();
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.RunnableC10533g.InterfaceC10535b
    /* renamed from: d */
    public void mo12756d(RunnableC10533g<?> runnableC10533g) {
        m12753h().execute(runnableC10533g);
    }

    /* renamed from: f */
    void m12754f() {
        if (this.f24275K || this.f24273I || this.f24279O) {
            return;
        }
        this.f24279O = true;
        this.f24278N.m12800i();
        this.f24284w.mo12741d(this, this.f24266B);
    }

    @Override // io.intercom.com.bumptech.glide.p416r.p417j.C10895a.InterfaceC10901f
    /* renamed from: g */
    public AbstractC10903b mo11981g() {
        return this.f24281d;
    }

    /* renamed from: i */
    void m12752i() {
        this.f24281d.mo11977c();
        if (this.f24279O) {
            this.f24284w.mo12741d(this, this.f24266B);
            m12746o(false);
            return;
        }
        throw new IllegalStateException("Not cancelled");
    }

    /* renamed from: j */
    void m12751j() {
        this.f24281d.mo11977c();
        if (this.f24279O) {
            m12746o(false);
        } else if (!this.f24280c.isEmpty()) {
            if (!this.f24275K) {
                this.f24275K = true;
                this.f24284w.mo12742c(this, this.f24266B, null);
                for (InterfaceC10857h interfaceC10857h : this.f24280c) {
                    if (!m12748m(interfaceC10857h)) {
                        interfaceC10857h.mo12110c(this.f24274J);
                    }
                }
                m12746o(false);
                return;
            }
            throw new IllegalStateException("Already failed once");
        } else {
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        }
    }

    /* renamed from: k */
    void m12750k() {
        this.f24281d.mo11977c();
        if (this.f24279O) {
            this.f24271G.mo12303b();
            m12746o(false);
        } else if (!this.f24280c.isEmpty()) {
            if (!this.f24273I) {
                C10562o<?> m12743a = this.f24283f.m12743a(this.f24271G, this.f24267C);
                this.f24277M = m12743a;
                this.f24273I = true;
                m12743a.m12739a();
                this.f24284w.mo12742c(this, this.f24266B, this.f24277M);
                int size = this.f24280c.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC10857h interfaceC10857h = this.f24280c.get(i);
                    if (!m12748m(interfaceC10857h)) {
                        this.f24277M.m12739a();
                        interfaceC10857h.mo12111a(this.f24277M, this.f24272H);
                    }
                }
                this.f24277M.m12736f();
                m12746o(false);
                return;
            }
            throw new IllegalStateException("Already have resource");
        } else {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public C10556k<R> m12749l(InterfaceC10622g interfaceC10622g, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f24266B = interfaceC10622g;
        this.f24267C = z;
        this.f24268D = z2;
        this.f24269E = z3;
        this.f24270F = z4;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m12747n() {
        return this.f24270F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m12745p(InterfaceC10857h interfaceC10857h) {
        C10893i.m12011b();
        this.f24281d.mo11977c();
        if (!this.f24273I && !this.f24275K) {
            this.f24280c.remove(interfaceC10857h);
            if (this.f24280c.isEmpty()) {
                m12754f();
                return;
            }
            return;
        }
        m12755e(interfaceC10857h);
    }

    /* renamed from: q */
    public void m12744q(RunnableC10533g<R> runnableC10533g) {
        this.f24278N = runnableC10533g;
        (runnableC10533g.m12802X() ? this.f24285x : m12753h()).execute(runnableC10533g);
    }

    C10556k(ExecutorServiceC10519a executorServiceC10519a, ExecutorServiceC10519a executorServiceC10519a2, ExecutorServiceC10519a executorServiceC10519a3, ExecutorServiceC10519a executorServiceC10519a4, InterfaceC10559l interfaceC10559l, InterfaceC7672e<C10556k<?>> interfaceC7672e, C10557a c10557a) {
        this.f24280c = new ArrayList(2);
        this.f24281d = AbstractC10903b.m11979a();
        this.f24285x = executorServiceC10519a;
        this.f24286y = executorServiceC10519a2;
        this.f24287z = executorServiceC10519a3;
        this.f24265A = executorServiceC10519a4;
        this.f24284w = interfaceC10559l;
        this.f24282e = interfaceC7672e;
        this.f24283f = c10557a;
    }
}
