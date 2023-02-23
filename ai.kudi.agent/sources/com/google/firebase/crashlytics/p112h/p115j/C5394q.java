package com.google.firebase.crashlytics.p112h.p115j;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.C4469m;
import com.google.android.gms.tasks.j;
import com.google.firebase.C5988g;
import com.google.firebase.crashlytics.p112h.C5335f;
import com.google.firebase.crashlytics.p112h.InterfaceC5331d;
import com.google.firebase.crashlytics.p112h.p113h.InterfaceC5337a;
import com.google.firebase.crashlytics.p112h.p114i.InterfaceC5343a;
import com.google.firebase.crashlytics.p112h.p114i.InterfaceC5344b;
import com.google.firebase.crashlytics.p112h.p116k.C5414b;
import com.google.firebase.crashlytics.p112h.p120n.C5578i;
import com.google.firebase.crashlytics.p112h.p120n.InterfaceC5577h;
import com.google.firebase.crashlytics.p112h.p122p.InterfaceC5587e;
import com.google.firebase.crashlytics.p112h.p125q.C5599a;
import com.google.firebase.crashlytics.p112h.p125q.C5601c;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: CrashlyticsCore.java */
/* renamed from: com.google.firebase.crashlytics.h.j.q */
/* loaded from: classes2.dex */
public class C5394q {

    /* renamed from: a */
    private final Context f13315a;

    /* renamed from: b */
    private final C5406w f13316b;

    /* renamed from: c */
    private final long f13317c = System.currentTimeMillis();

    /* renamed from: d */
    private C5400r f13318d;

    /* renamed from: e */
    private C5400r f13319e;

    /* renamed from: f */
    private C5380p f13320f;

    /* renamed from: g */
    private final C5347a0 f13321g;

    /* renamed from: h */
    public final InterfaceC5344b f13322h;

    /* renamed from: i */
    private final InterfaceC5337a f13323i;

    /* renamed from: j */
    private final ExecutorService f13324j;

    /* renamed from: k */
    private final C5375o f13325k;

    /* renamed from: l */
    private final InterfaceC5331d f13326l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsCore.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.q$a */
    /* loaded from: classes2.dex */
    public class CallableC5395a implements Callable<j<Void>> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC5587e f13327c;

        CallableC5395a(InterfaceC5587e interfaceC5587e) {
            this.f13327c = interfaceC5587e;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public j<Void> call() throws Exception {
            return C5394q.this.m24896f(this.f13327c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsCore.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.q$b */
    /* loaded from: classes2.dex */
    public class RunnableC5396b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ InterfaceC5587e f13329c;

        RunnableC5396b(InterfaceC5587e interfaceC5587e) {
            this.f13329c = interfaceC5587e;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5394q.this.m24896f(this.f13329c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsCore.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.q$c */
    /* loaded from: classes2.dex */
    public class CallableC5397c implements Callable<Boolean> {
        CallableC5397c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() throws Exception {
            try {
                boolean m24878d = C5394q.this.f13318d.m24878d();
                if (!m24878d) {
                    C5335f.m25102f().m25097k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(m24878d);
            } catch (Exception e) {
                C5335f.m25102f().m25103e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsCore.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.q$d */
    /* loaded from: classes2.dex */
    public class CallableC5398d implements Callable<Boolean> {
        CallableC5398d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() throws Exception {
            return Boolean.valueOf(C5394q.this.f13320f.m24920s());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CrashlyticsCore.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.q$e */
    /* loaded from: classes2.dex */
    public static final class C5399e implements C5414b.InterfaceC5416b {

        /* renamed from: a */
        private final InterfaceC5577h f13333a;

        public C5399e(InterfaceC5577h interfaceC5577h) {
            this.f13333a = interfaceC5577h;
        }

        @Override // com.google.firebase.crashlytics.p112h.p116k.C5414b.InterfaceC5416b
        /* renamed from: a */
        public File mo24819a() {
            File file = new File(this.f13333a.mo24405b(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    public C5394q(C5988g c5988g, C5347a0 c5347a0, InterfaceC5331d interfaceC5331d, C5406w c5406w, InterfaceC5344b interfaceC5344b, InterfaceC5337a interfaceC5337a, ExecutorService executorService) {
        this.f13316b = c5406w;
        this.f13315a = c5988g.m23093i();
        this.f13321g = c5347a0;
        this.f13326l = interfaceC5331d;
        this.f13322h = interfaceC5344b;
        this.f13323i = interfaceC5337a;
        this.f13324j = executorService;
        this.f13325k = new C5375o(executorService);
    }

    /* renamed from: d */
    private void m24898d() {
        try {
            Boolean.TRUE.equals((Boolean) C5368k0.m25018a(this.f13325k.m24967h(new CallableC5398d())));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public j<Void> m24896f(InterfaceC5587e interfaceC5587e) {
        m24888n();
        try {
            this.f13322h.mo25087a(new InterfaceC5343a() { // from class: com.google.firebase.crashlytics.h.j.b
                @Override // com.google.firebase.crashlytics.p112h.p114i.InterfaceC5343a
                /* renamed from: a */
                public final void mo25074a(String str) {
                    C5394q.this.m24891k(str);
                }
            });
            if (!interfaceC5587e.mo24372b().mo24364a().f13786a) {
                C5335f.m25102f().m25106b("Collection of crash reports disabled in Crashlytics settings.");
                return C4469m.m27766e(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f13320f.m24963A(interfaceC5587e)) {
                C5335f.m25102f().m25097k("Previous sessions could not be finalized.");
            }
            return this.f13320f.m24943U(interfaceC5587e.mo24373a());
        } catch (Exception e) {
            C5335f.m25102f().m25103e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return C4469m.m27766e(e);
        } finally {
            m24889m();
        }
    }

    /* renamed from: h */
    private void m24894h(InterfaceC5587e interfaceC5587e) {
        Future<?> submit = this.f13324j.submit(new RunnableC5396b(interfaceC5587e));
        C5335f.m25102f().m25106b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            C5335f.m25102f().m25103e("Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            C5335f.m25102f().m25103e("Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            C5335f.m25102f().m25103e("Crashlytics timed out during initialization.", e3);
        }
    }

    /* renamed from: i */
    public static String m24893i() {
        return "18.2.4";
    }

    /* renamed from: j */
    static boolean m24892j(String str, boolean z) {
        if (!z) {
            C5335f.m25102f().m25099i("Configured not to require a build ID.");
            return true;
        } else if (TextUtils.isEmpty(str)) {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: e */
    boolean m24897e() {
        return this.f13318d.m24879c();
    }

    /* renamed from: g */
    public j<Void> m24895g(InterfaceC5587e interfaceC5587e) {
        return C5368k0.m25017b(this.f13324j, new CallableC5395a(interfaceC5587e));
    }

    /* renamed from: k */
    public void m24891k(String str) {
        this.f13320f.m24939Y(System.currentTimeMillis() - this.f13317c, str);
    }

    /* renamed from: l */
    public void m24890l(Throwable th) {
        this.f13320f.m24940X(Thread.currentThread(), th);
    }

    /* renamed from: m */
    void m24889m() {
        this.f13325k.m24967h(new CallableC5397c());
    }

    /* renamed from: n */
    void m24888n() {
        this.f13325k.m24973b();
        this.f13318d.m24881a();
        C5335f.m25102f().m25099i("Initialization marker file was created.");
    }

    /* renamed from: o */
    public boolean m24887o(C5361h c5361h, InterfaceC5587e interfaceC5587e) {
        if (m24892j(c5361h.f13219b, C5373n.m24991k(this.f13315a, "com.crashlytics.RequireBuildId", true))) {
            try {
                C5578i c5578i = new C5578i(this.f13315a);
                this.f13319e = new C5400r("crash_marker", c5578i);
                this.f13318d = new C5400r("initialization_marker", c5578i);
                C5366j0 c5366j0 = new C5366j0();
                C5399e c5399e = new C5399e(c5578i);
                C5414b c5414b = new C5414b(this.f13315a, c5399e);
                this.f13320f = new C5380p(this.f13315a, this.f13325k, this.f13321g, this.f13316b, c5578i, this.f13319e, c5361h, c5366j0, c5414b, c5399e, C5362h0.m25047e(this.f13315a, this.f13321g, c5578i, c5361h, c5414b, c5366j0, new C5599a(1024, new C5601c(10)), interfaceC5587e), this.f13326l, this.f13323i);
                boolean m24897e = m24897e();
                m24898d();
                this.f13320f.m24915x(Thread.getDefaultUncaughtExceptionHandler(), interfaceC5587e);
                if (m24897e && C5373n.m24999c(this.f13315a)) {
                    C5335f.m25102f().m25106b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    m24894h(interfaceC5587e);
                    return false;
                }
                C5335f.m25102f().m25106b("Successfully configured exception handler.");
                return true;
            } catch (Exception e) {
                C5335f.m25102f().m25103e("Crashlytics was not started due to an exception during initialization", e);
                this.f13320f = null;
                return false;
            }
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
    }

    /* renamed from: p */
    public void m24886p(String str, String str2) {
        this.f13320f.m24945S(str, str2);
    }

    /* renamed from: q */
    public void m24885q(String str) {
        this.f13320f.m24944T(str);
    }
}
