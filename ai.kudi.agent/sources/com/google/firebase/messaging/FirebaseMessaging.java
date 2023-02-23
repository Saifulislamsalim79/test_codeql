package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.p103q.ThreadFactoryC2978a;
import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.C4469m;
import com.google.android.gms.tasks.InterfaceC4458g;
import com.google.android.gms.tasks.InterfaceC4462i;
import com.google.firebase.C5987f;
import com.google.firebase.C5988g;
import com.google.firebase.iid.p144a.InterfaceC5996a;
import com.google.firebase.installations.InterfaceC6432h;
import com.google.firebase.messaging.C6525p0;
import com.google.firebase.messaging.C6534t0;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.p167m.C6470a;
import com.google.firebase.p167m.InterfaceC6471b;
import com.google.firebase.p167m.InterfaceC6473d;
import com.google.firebase.p169n.InterfaceC6555f;
import com.google.firebase.p170o.InterfaceC6560b;
import com.google.firebase.p181q.InterfaceC6732i;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p272h.p286c.p287a.p288a.InterfaceC8241g;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* loaded from: classes2.dex */
public class FirebaseMessaging {

    /* renamed from: l */
    private static final long f15611l = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: m */
    private static C6534t0 f15612m;

    /* renamed from: n */
    static InterfaceC8241g f15613n;

    /* renamed from: o */
    static ScheduledExecutorService f15614o;

    /* renamed from: a */
    private final C5988g f15615a;

    /* renamed from: b */
    private final InterfaceC5996a f15616b;

    /* renamed from: c */
    private final Context f15617c;

    /* renamed from: d */
    private final C6481b0 f15618d;

    /* renamed from: e */
    private final C6525p0 f15619e;

    /* renamed from: f */
    private final C6474a f15620f;

    /* renamed from: g */
    private final Executor f15621g;

    /* renamed from: h */
    private final com.google.android.gms.tasks.j<C6546y0> f15622h;

    /* renamed from: i */
    private final C6498g0 f15623i;

    /* renamed from: j */
    private boolean f15624j;

    /* renamed from: k */
    private final Application.ActivityLifecycleCallbacks f15625k;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    /* loaded from: classes2.dex */
    public class C6474a {

        /* renamed from: a */
        private final InterfaceC6473d f15626a;

        /* renamed from: b */
        private boolean f15627b;

        /* renamed from: c */
        private InterfaceC6471b<C5987f> f15628c;

        /* renamed from: d */
        private Boolean f15629d;

        C6474a(InterfaceC6473d interfaceC6473d) {
            this.f15626a = interfaceC6473d;
        }

        /* renamed from: d */
        private Boolean m21904d() {
            ApplicationInfo applicationInfo;
            Context m23093i = FirebaseMessaging.this.f15615a.m23093i();
            SharedPreferences sharedPreferences = m23093i.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = m23093i.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(m23093i.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: a */
        synchronized void m21907a() {
            if (this.f15627b) {
                return;
            }
            Boolean m21904d = m21904d();
            this.f15629d = m21904d;
            if (m21904d == null) {
                InterfaceC6471b<C5987f> interfaceC6471b = new InterfaceC6471b() { // from class: com.google.firebase.messaging.x
                    @Override // com.google.firebase.p167m.InterfaceC6471b
                    /* renamed from: a */
                    public final void mo21677a(C6470a c6470a) {
                        FirebaseMessaging.C6474a.this.m21905c(c6470a);
                    }
                };
                this.f15628c = interfaceC6471b;
                this.f15626a.mo21934a(C5987f.class, interfaceC6471b);
            }
            this.f15627b = true;
        }

        /* renamed from: b */
        synchronized boolean m21906b() {
            boolean m23083s;
            m21907a();
            Boolean bool = this.f15629d;
            if (bool != null) {
                m23083s = bool.booleanValue();
            } else {
                m23083s = FirebaseMessaging.this.f15615a.m23083s();
            }
            return m23083s;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public /* synthetic */ void m21905c(C6470a c6470a) {
            if (m21906b()) {
                FirebaseMessaging.this.m21910w();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseMessaging(C5988g c5988g, InterfaceC5996a interfaceC5996a, InterfaceC6560b<InterfaceC6732i> interfaceC6560b, InterfaceC6560b<InterfaceC6555f> interfaceC6560b2, InterfaceC6432h interfaceC6432h, InterfaceC8241g interfaceC8241g, InterfaceC6473d interfaceC6473d) {
        this(c5988g, interfaceC5996a, interfaceC6560b, interfaceC6560b2, interfaceC6432h, interfaceC8241g, interfaceC6473d, new C6498g0(c5988g.m23093i()));
    }

    /* renamed from: f */
    public static synchronized FirebaseMessaging m21927f() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(C5988g.m23092j());
        }
        return firebaseMessaging;
    }

    /* renamed from: g */
    private static synchronized C6534t0 m21926g(Context context) {
        C6534t0 c6534t0;
        synchronized (FirebaseMessaging.class) {
            if (f15612m == null) {
                f15612m = new C6534t0(context);
            }
            c6534t0 = f15612m;
        }
        return c6534t0;
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(C5988g c5988g) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) c5988g.m23095g(FirebaseMessaging.class);
            com.google.android.gms.common.internal.s.k(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    /* renamed from: h */
    private String m21925h() {
        return "[DEFAULT]".equals(this.f15615a.m23090l()) ? "" : this.f15615a.m23088n();
    }

    /* renamed from: k */
    public static InterfaceC8241g m21922k() {
        return f15613n;
    }

    /* renamed from: l */
    private void m21921l(String str) {
        if ("[DEFAULT]".equals(this.f15615a.m23090l())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf = String.valueOf(this.f15615a.m23090l());
                Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(valueOf) : new String("Invoking onNewToken for app: "));
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C6518m(this.f15617c).m21730g(intent);
        }
    }

    /* renamed from: v */
    private synchronized void m21911v() {
        if (this.f15624j) {
            return;
        }
        m21909x(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m21910w() {
        InterfaceC5996a interfaceC5996a = this.f15616b;
        if (interfaceC5996a != null) {
            interfaceC5996a.m23060c();
        } else if (m21908y(m21923j())) {
            m21911v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public String m21930c() throws IOException {
        InterfaceC5996a interfaceC5996a = this.f15616b;
        if (interfaceC5996a != null) {
            try {
                return (String) C4469m.m27770a(interfaceC5996a.m23062a());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        final C6534t0.C6535a m21923j = m21923j();
        if (!m21908y(m21923j)) {
            return m21923j.f15772a;
        }
        final String m21822c = C6498g0.m21822c(this.f15615a);
        try {
            return (String) C4469m.m27770a(this.f15619e.m21719a(m21822c, new C6525p0.InterfaceC6526a() { // from class: com.google.firebase.messaging.u
                @Override // com.google.firebase.messaging.C6525p0.InterfaceC6526a
                public final com.google.android.gms.tasks.j start() {
                    return FirebaseMessaging.this.m21917p(m21822c, m21923j);
                }
            }));
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m21929d(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (f15614o == null) {
                f15614o = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC2978a("TAG"));
            }
            f15614o.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Context m21928e() {
        return this.f15617c;
    }

    /* renamed from: i */
    public com.google.android.gms.tasks.j<String> m21924i() {
        InterfaceC5996a interfaceC5996a = this.f15616b;
        if (interfaceC5996a != null) {
            return interfaceC5996a.m23062a();
        }
        final C4465k c4465k = new C4465k();
        this.f15621g.execute(new Runnable() { // from class: com.google.firebase.messaging.q
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m21916q(c4465k);
            }
        });
        return c4465k.m27777a();
    }

    /* renamed from: j */
    C6534t0.C6535a m21923j() {
        return m21926g(this.f15617c).m21698d(m21925h(), C6498g0.m21822c(this.f15615a));
    }

    /* renamed from: m */
    public boolean m21920m() {
        return this.f15620f.m21906b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m21919n() {
        return this.f15623i.m21818g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public /* synthetic */ com.google.android.gms.tasks.j m21918o(String str, C6534t0.C6535a c6535a, String str2) throws Exception {
        m21926g(this.f15617c).m21696f(m21925h(), str, str2, this.f15623i.m21824a());
        if (c6535a == null || !str2.equals(c6535a.f15772a)) {
            m21921l(str2);
        }
        return C4469m.m27765f(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public /* synthetic */ com.google.android.gms.tasks.j m21917p(final String str, final C6534t0.C6535a c6535a) {
        return this.f15618d.m21876d().r(ExecutorC6529r.f15759c, new InterfaceC4462i() { // from class: com.google.firebase.messaging.s
            @Override // com.google.android.gms.tasks.InterfaceC4462i
            /* renamed from: a */
            public final com.google.android.gms.tasks.j mo20894a(Object obj) {
                return FirebaseMessaging.this.m21918o(str, c6535a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public /* synthetic */ void m21916q(C4465k c4465k) {
        try {
            c4465k.m27775c(m21930c());
        } catch (Exception e) {
            c4465k.m27776b(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public /* synthetic */ void m21915r() {
        if (m21920m()) {
            m21910w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public /* synthetic */ void m21914s(C6546y0 c6546y0) {
        if (m21920m()) {
            c6546y0.m21663n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public /* synthetic */ void m21913t() {
        C6515k0.m21743b(this.f15617c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public synchronized void m21912u(boolean z) {
        this.f15624j = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public synchronized void m21909x(long j) {
        m21929d(new RunnableC6537u0(this, Math.min(Math.max(30L, j + j), f15611l)), j);
        this.f15624j = true;
    }

    /* renamed from: y */
    boolean m21908y(C6534t0.C6535a c6535a) {
        return c6535a == null || c6535a.m21694b(this.f15623i.m21824a());
    }

    FirebaseMessaging(C5988g c5988g, InterfaceC5996a interfaceC5996a, InterfaceC6560b<InterfaceC6732i> interfaceC6560b, InterfaceC6560b<InterfaceC6555f> interfaceC6560b2, InterfaceC6432h interfaceC6432h, InterfaceC8241g interfaceC8241g, InterfaceC6473d interfaceC6473d, C6498g0 c6498g0) {
        this(c5988g, interfaceC5996a, interfaceC6432h, interfaceC8241g, interfaceC6473d, c6498g0, new C6481b0(c5988g, c6498g0, interfaceC6560b, interfaceC6560b2, interfaceC6432h), C6520n.m21724d(), C6520n.m21727a());
    }

    FirebaseMessaging(C5988g c5988g, InterfaceC5996a interfaceC5996a, InterfaceC6432h interfaceC6432h, InterfaceC8241g interfaceC8241g, InterfaceC6473d interfaceC6473d, C6498g0 c6498g0, C6481b0 c6481b0, Executor executor, Executor executor2) {
        this.f15624j = false;
        f15613n = interfaceC8241g;
        this.f15615a = c5988g;
        this.f15616b = interfaceC5996a;
        this.f15620f = new C6474a(interfaceC6473d);
        this.f15617c = c5988g.m23093i();
        this.f15625k = new C6522o();
        this.f15623i = c6498g0;
        this.f15618d = c6481b0;
        this.f15619e = new C6525p0(executor);
        this.f15621g = executor2;
        Context m23093i = c5988g.m23093i();
        if (m23093i instanceof Application) {
            ((Application) m23093i).registerActivityLifecycleCallbacks(this.f15625k);
        } else {
            String valueOf = String.valueOf(m23093i);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 125);
            sb.append("Context ");
            sb.append(valueOf);
            sb.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        if (interfaceC5996a != null) {
            interfaceC5996a.m23061b(new InterfaceC5996a.InterfaceC5997a(this) { // from class: com.google.firebase.messaging.t
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.v
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m21915r();
            }
        });
        com.google.android.gms.tasks.j<C6546y0> m21673d = C6546y0.m21673d(this, c6498g0, c6481b0, this.f15617c, C6520n.m21723e());
        this.f15622h = m21673d;
        m21673d.g(executor2, new InterfaceC4458g() { // from class: com.google.firebase.messaging.p
            @Override // com.google.android.gms.tasks.InterfaceC4458g
            /* renamed from: c */
            public final void mo18742c(Object obj) {
                FirebaseMessaging.this.m21914s((C6546y0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.w
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m21913t();
            }
        });
    }
}
