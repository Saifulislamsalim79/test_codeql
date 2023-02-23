package com.google.firebase.database.p131s;

import com.google.android.gms.common.internal.s;
import com.google.firebase.C5988g;
import com.google.firebase.database.C5615f;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.p127p.C5642o;
import com.google.firebase.database.p129r.C5684i;
import com.google.firebase.database.p129r.C5688l;
import com.google.firebase.database.p129r.InterfaceC5685j;
import com.google.firebase.database.p129r.InterfaceC5690n;
import com.google.firebase.database.p131s.C5743g;
import com.google.firebase.database.p131s.InterfaceC5892y;
import com.google.firebase.database.p131s.p133h0.C5757d;
import com.google.firebase.database.p131s.p133h0.InterfaceC5758e;
import com.google.firebase.database.p131s.p134i0.AbstractC5775c;
import com.google.firebase.database.p138t.C5899c;
import com.google.firebase.database.p138t.InterfaceC5900d;
import java.io.File;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: Context.java */
/* renamed from: com.google.firebase.database.s.g */
/* loaded from: classes2.dex */
public class C5743g {

    /* renamed from: a */
    protected InterfaceC5900d f14134a;

    /* renamed from: b */
    protected InterfaceC5829k f14135b;

    /* renamed from: c */
    protected InterfaceC5892y f14136c;

    /* renamed from: d */
    protected InterfaceC5892y f14137d;

    /* renamed from: e */
    protected InterfaceC5861q f14138e;

    /* renamed from: f */
    protected String f14139f;

    /* renamed from: g */
    protected List<String> f14140g;

    /* renamed from: h */
    protected String f14141h;

    /* renamed from: j */
    protected boolean f14143j;

    /* renamed from: l */
    protected C5988g f14145l;

    /* renamed from: m */
    private InterfaceC5758e f14146m;

    /* renamed from: p */
    private InterfaceC5832m f14149p;

    /* renamed from: i */
    protected InterfaceC5900d.EnumC5901a f14142i = InterfaceC5900d.EnumC5901a.INFO;

    /* renamed from: k */
    protected long f14144k = 10485760;

    /* renamed from: n */
    private boolean f14147n = false;

    /* renamed from: o */
    private boolean f14148o = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Context.java */
    /* renamed from: com.google.firebase.database.s.g$a */
    /* loaded from: classes2.dex */
    public class C5744a implements InterfaceC5892y.InterfaceC5893a {

        /* renamed from: a */
        final /* synthetic */ ScheduledExecutorService f14150a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC5685j.InterfaceC5686a f14151b;

        C5744a(ScheduledExecutorService scheduledExecutorService, InterfaceC5685j.InterfaceC5686a interfaceC5686a) {
            this.f14150a = scheduledExecutorService;
            this.f14151b = interfaceC5686a;
        }

        @Override // com.google.firebase.database.p131s.InterfaceC5892y.InterfaceC5893a
        /* renamed from: a */
        public void mo23381a(final String str) {
            ScheduledExecutorService scheduledExecutorService = this.f14150a;
            final InterfaceC5685j.InterfaceC5686a interfaceC5686a = this.f14151b;
            scheduledExecutorService.execute(new Runnable() { // from class: com.google.firebase.database.s.b
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC5685j.InterfaceC5686a.this.mo24075a(str);
                }
            });
        }

        @Override // com.google.firebase.database.p131s.InterfaceC5892y.InterfaceC5893a
        public void onError(final String str) {
            ScheduledExecutorService scheduledExecutorService = this.f14150a;
            final InterfaceC5685j.InterfaceC5686a interfaceC5686a = this.f14151b;
            scheduledExecutorService.execute(new Runnable() { // from class: com.google.firebase.database.s.a
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC5685j.InterfaceC5686a.this.onError(str);
                }
            });
        }
    }

    /* renamed from: F */
    private void m23941F() {
        this.f14135b.mo23596a();
        this.f14138e.mo23492a();
    }

    /* renamed from: G */
    private static InterfaceC5685j m23940G(final InterfaceC5892y interfaceC5892y, final ScheduledExecutorService scheduledExecutorService) {
        return new InterfaceC5685j() { // from class: com.google.firebase.database.s.c
            @Override // com.google.firebase.database.p129r.InterfaceC5685j
            /* renamed from: a */
            public final void mo23996a(boolean z, InterfaceC5685j.InterfaceC5686a interfaceC5686a) {
                InterfaceC5892y.this.mo23383a(z, new C5743g.C5744a(scheduledExecutorService, interfaceC5686a));
            }
        };
    }

    /* renamed from: b */
    private String m23938b(String str) {
        return "Firebase/5/" + C5615f.m24315g() + "/" + str;
    }

    /* renamed from: c */
    private void m23937c() {
        s.k(this.f14137d, "You must register an appCheckTokenProvider before initializing Context.");
    }

    /* renamed from: d */
    private void m23936d() {
        s.k(this.f14136c, "You must register an authTokenProvider before initializing Context.");
    }

    /* renamed from: e */
    private void m23935e() {
        if (this.f14135b == null) {
            this.f14135b = m23920t().mo23577b(this);
        }
    }

    /* renamed from: f */
    private void m23934f() {
        if (this.f14134a == null) {
            this.f14134a = m23920t().mo23575d(this, this.f14142i, this.f14140g);
        }
    }

    /* renamed from: g */
    private void m23933g() {
        if (this.f14138e == null) {
            this.f14138e = this.f14149p.mo23572g(this);
        }
    }

    /* renamed from: h */
    private void m23932h() {
        if (this.f14139f == null) {
            this.f14139f = "default";
        }
    }

    /* renamed from: i */
    private void m23931i() {
        if (this.f14141h == null) {
            this.f14141h = m23938b(m23920t().mo23578a(this));
        }
    }

    /* renamed from: o */
    private ScheduledExecutorService m23925o() {
        InterfaceC5861q m23919u = m23919u();
        if (m23919u instanceof AbstractC5775c) {
            return ((AbstractC5775c) m23919u).m23800c();
        }
        throw new RuntimeException("Custom run loops are not supported!");
    }

    /* renamed from: t */
    private InterfaceC5832m m23920t() {
        if (this.f14149p == null) {
            m23914z();
        }
        return this.f14149p;
    }

    /* renamed from: y */
    private void m23915y() {
        m23934f();
        m23920t();
        m23931i();
        m23935e();
        m23933g();
        m23932h();
        m23936d();
        m23937c();
    }

    /* renamed from: z */
    private synchronized void m23914z() {
        this.f14149p = new C5642o(this.f14145l);
    }

    /* renamed from: A */
    public boolean m23946A() {
        return this.f14147n;
    }

    /* renamed from: B */
    public boolean m23945B() {
        return this.f14143j;
    }

    /* renamed from: D */
    public InterfaceC5690n m23943D(C5688l c5688l, InterfaceC5690n.InterfaceC5691a interfaceC5691a) {
        return m23920t().mo23573f(this, m23927m(), c5688l, interfaceC5691a);
    }

    /* renamed from: E */
    public void m23942E() {
        if (this.f14148o) {
            m23941F();
            this.f14148o = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m23939a() {
        if (m23946A()) {
            throw new DatabaseException("Modifications to DatabaseConfig objects must occur before they are in use");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public synchronized void m23930j() {
        if (!this.f14147n) {
            this.f14147n = true;
            m23915y();
        }
    }

    /* renamed from: k */
    public InterfaceC5892y m23929k() {
        return this.f14137d;
    }

    /* renamed from: l */
    public InterfaceC5892y m23928l() {
        return this.f14136c;
    }

    /* renamed from: m */
    public C5684i m23927m() {
        return new C5684i(m23923q(), m23940G(m23928l(), m23925o()), m23940G(m23929k(), m23925o()), m23925o(), m23945B(), C5615f.m24315g(), m23916x(), this.f14145l.m23089m().m23068c(), m23918v().getAbsolutePath());
    }

    /* renamed from: n */
    public InterfaceC5829k m23926n() {
        return this.f14135b;
    }

    /* renamed from: p */
    public C5899c m23924p(String str) {
        return new C5899c(this.f14134a, str);
    }

    /* renamed from: q */
    public InterfaceC5900d m23923q() {
        return this.f14134a;
    }

    /* renamed from: r */
    public long m23922r() {
        return this.f14144k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public InterfaceC5758e m23921s(String str) {
        InterfaceC5758e interfaceC5758e = this.f14146m;
        if (interfaceC5758e != null) {
            return interfaceC5758e;
        }
        if (this.f14143j) {
            InterfaceC5758e mo23574e = this.f14149p.mo23574e(this, str);
            if (mo23574e != null) {
                return mo23574e;
            }
            throw new IllegalArgumentException("You have enabled persistence, but persistence is not supported on this platform.");
        }
        return new C5757d();
    }

    /* renamed from: u */
    public InterfaceC5861q m23919u() {
        return this.f14138e;
    }

    /* renamed from: v */
    public File m23918v() {
        return m23920t().mo23576c();
    }

    /* renamed from: w */
    public String m23917w() {
        return this.f14139f;
    }

    /* renamed from: x */
    public String m23916x() {
        return this.f14141h;
    }
}
