package com.google.firebase.crashlytics.p112h.p115j;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.C4469m;
import com.google.android.gms.tasks.InterfaceC4462i;
import com.google.android.gms.tasks.j;
import com.google.firebase.crashlytics.p112h.C5335f;
import com.google.firebase.crashlytics.p112h.InterfaceC5331d;
import com.google.firebase.crashlytics.p112h.InterfaceC5336g;
import com.google.firebase.crashlytics.p112h.p113h.InterfaceC5337a;
import com.google.firebase.crashlytics.p112h.p115j.C5403u;
import com.google.firebase.crashlytics.p112h.p116k.C5414b;
import com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0;
import com.google.firebase.crashlytics.p112h.p120n.InterfaceC5577h;
import com.google.firebase.crashlytics.p112h.p122p.InterfaceC5587e;
import com.google.firebase.crashlytics.p112h.p122p.p123i.C5591a;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CrashlyticsController.java */
/* renamed from: com.google.firebase.crashlytics.h.j.p */
/* loaded from: classes2.dex */
public class C5380p {

    /* renamed from: s */
    static final FilenameFilter f13267s = C5346a.f13196a;

    /* renamed from: a */
    private final Context f13268a;

    /* renamed from: b */
    private final C5406w f13269b;

    /* renamed from: c */
    private final C5400r f13270c;

    /* renamed from: d */
    private final C5366j0 f13271d;

    /* renamed from: e */
    private final C5375o f13272e;

    /* renamed from: f */
    private final C5347a0 f13273f;

    /* renamed from: g */
    private final InterfaceC5577h f13274g;

    /* renamed from: h */
    private final C5361h f13275h;

    /* renamed from: i */
    private final C5414b.InterfaceC5416b f13276i;

    /* renamed from: j */
    private final C5414b f13277j;

    /* renamed from: k */
    private final InterfaceC5331d f13278k;

    /* renamed from: l */
    private final String f13279l;

    /* renamed from: m */
    private final InterfaceC5337a f13280m;

    /* renamed from: n */
    private final C5362h0 f13281n;

    /* renamed from: o */
    private C5403u f13282o;

    /* renamed from: p */
    final C4465k<Boolean> f13283p = new C4465k<>();

    /* renamed from: q */
    final C4465k<Boolean> f13284q = new C4465k<>();

    /* renamed from: r */
    final C4465k<Void> f13285r = new C4465k<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.p$a */
    /* loaded from: classes2.dex */
    public class CallableC5381a implements Callable<Void> {

        /* renamed from: c */
        final /* synthetic */ long f13286c;

        CallableC5381a(long j) {
            this.f13286c = j;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f13286c);
            C5380p.this.f13280m.mo25088a("_ae", bundle);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.p$b */
    /* loaded from: classes2.dex */
    public class C5382b implements C5403u.InterfaceC5404a {
        C5382b() {
        }

        @Override // com.google.firebase.crashlytics.p112h.p115j.C5403u.InterfaceC5404a
        /* renamed from: a */
        public void mo24848a(InterfaceC5587e interfaceC5587e, Thread thread, Throwable th) {
            C5380p.this.m24954J(interfaceC5587e, thread, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.p$c */
    /* loaded from: classes2.dex */
    public class CallableC5383c implements Callable<j<Void>> {

        /* renamed from: c */
        final /* synthetic */ long f13289c;

        /* renamed from: d */
        final /* synthetic */ Throwable f13290d;

        /* renamed from: e */
        final /* synthetic */ Thread f13291e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC5587e f13292f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CrashlyticsController.java */
        /* renamed from: com.google.firebase.crashlytics.h.j.p$c$a */
        /* loaded from: classes2.dex */
        public class C5384a implements InterfaceC4462i<C5591a, Void> {

            /* renamed from: a */
            final /* synthetic */ Executor f13294a;

            C5384a(Executor executor) {
                this.f13294a = executor;
            }

            @Override // com.google.android.gms.tasks.InterfaceC4462i
            /* renamed from: b */
            public j<Void> mo20894a(C5591a c5591a) throws Exception {
                if (c5591a == null) {
                    C5335f.m25102f().m25097k("Received null app settings, cannot send reports at crash time.");
                    return C4469m.m27765f(null);
                }
                return C4469m.m27763h(C5380p.this.m24947Q(), C5380p.this.f13281n.m25030v(this.f13294a));
            }
        }

        CallableC5383c(long j, Throwable th, Thread thread, InterfaceC5587e interfaceC5587e) {
            this.f13289c = j;
            this.f13290d = th;
            this.f13291e = thread;
            this.f13292f = interfaceC5587e;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public j<Void> call() throws Exception {
            long m24955I = C5380p.m24955I(this.f13289c);
            String m24960D = C5380p.this.m24960D();
            if (m24960D != null) {
                C5380p.this.f13270c.m24881a();
                C5380p.this.f13281n.m25035q(this.f13290d, this.f13291e, m24960D, m24955I);
                C5380p.this.m24916w(this.f13289c);
                C5380p.this.m24919t(this.f13292f);
                C5380p.this.m24917v();
                if (C5380p.this.f13269b.m24843d()) {
                    Executor m24972c = C5380p.this.f13272e.m24972c();
                    return this.f13292f.mo24373a().r(m24972c, new C5384a(m24972c));
                }
                return C4469m.m27765f(null);
            }
            C5335f.m25102f().m25104d("Tried to write a fatal exception while no session was open.");
            return C4469m.m27765f(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.p$d */
    /* loaded from: classes2.dex */
    public class C5385d implements InterfaceC4462i<Void, Boolean> {
        C5385d(C5380p c5380p) {
        }

        @Override // com.google.android.gms.tasks.InterfaceC4462i
        /* renamed from: b */
        public j<Boolean> mo20894a(Void r1) throws Exception {
            return C4469m.m27765f(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.p$e */
    /* loaded from: classes2.dex */
    public class C5386e implements InterfaceC4462i<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ j f13296a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CrashlyticsController.java */
        /* renamed from: com.google.firebase.crashlytics.h.j.p$e$a */
        /* loaded from: classes2.dex */
        public class CallableC5387a implements Callable<j<Void>> {

            /* renamed from: c */
            final /* synthetic */ Boolean f13298c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CrashlyticsController.java */
            /* renamed from: com.google.firebase.crashlytics.h.j.p$e$a$a */
            /* loaded from: classes2.dex */
            public class C5388a implements InterfaceC4462i<C5591a, Void> {

                /* renamed from: a */
                final /* synthetic */ Executor f13300a;

                C5388a(Executor executor) {
                    this.f13300a = executor;
                }

                @Override // com.google.android.gms.tasks.InterfaceC4462i
                /* renamed from: b */
                public j<Void> mo20894a(C5591a c5591a) throws Exception {
                    if (c5591a != null) {
                        C5380p.this.m24947Q();
                        C5380p.this.f13281n.m25030v(this.f13300a);
                        C5380p.this.f13285r.m27773e(null);
                        return C4469m.m27765f(null);
                    }
                    C5335f.m25102f().m25097k("Received null app settings at app startup. Cannot send cached reports");
                    return C4469m.m27765f(null);
                }
            }

            CallableC5387a(Boolean bool) {
                this.f13298c = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public j<Void> call() throws Exception {
                if (!this.f13298c.booleanValue()) {
                    C5335f.m25102f().m25099i("Deleting cached crash reports...");
                    C5380p.m24921r(C5380p.this.m24951M());
                    C5380p.this.f13281n.m25031u();
                    C5380p.this.f13285r.m27773e(null);
                    return C4469m.m27765f(null);
                }
                C5335f.m25102f().m25106b("Sending cached crash reports...");
                C5380p.this.f13269b.m24844c(this.f13298c.booleanValue());
                Executor m24972c = C5380p.this.f13272e.m24972c();
                return C5386e.this.f13296a.r(m24972c, new C5388a(m24972c));
            }
        }

        C5386e(j jVar) {
            this.f13296a = jVar;
        }

        @Override // com.google.android.gms.tasks.InterfaceC4462i
        /* renamed from: b */
        public j<Void> mo20894a(Boolean bool) throws Exception {
            return C5380p.this.f13272e.m24966i(new CallableC5387a(bool));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.p$f */
    /* loaded from: classes2.dex */
    public class CallableC5389f implements Callable<Void> {

        /* renamed from: c */
        final /* synthetic */ long f13302c;

        /* renamed from: d */
        final /* synthetic */ String f13303d;

        CallableC5389f(long j, String str) {
            this.f13302c = j;
            this.f13303d = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            if (C5380p.this.m24953K()) {
                return null;
            }
            C5380p.this.f13277j.m24820g(this.f13302c, this.f13303d);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.p$g */
    /* loaded from: classes2.dex */
    public class RunnableC5390g implements Runnable {

        /* renamed from: c */
        final /* synthetic */ long f13305c;

        /* renamed from: d */
        final /* synthetic */ Throwable f13306d;

        /* renamed from: e */
        final /* synthetic */ Thread f13307e;

        RunnableC5390g(long j, Throwable th, Thread thread) {
            this.f13305c = j;
            this.f13306d = th;
            this.f13307e = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5380p.this.m24953K()) {
                return;
            }
            long m24955I = C5380p.m24955I(this.f13305c);
            String m24960D = C5380p.this.m24960D();
            if (m24960D != null) {
                C5380p.this.f13281n.m25034r(this.f13306d, this.f13307e, m24960D, m24955I);
            } else {
                C5335f.m25102f().m25097k("Tried to write a non-fatal exception while no session was open.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.p$h */
    /* loaded from: classes2.dex */
    public class CallableC5391h implements Callable<Void> {

        /* renamed from: c */
        final /* synthetic */ C5366j0 f13309c;

        CallableC5391h(C5366j0 c5366j0) {
            this.f13309c = c5366j0;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            String m24960D = C5380p.this.m24960D();
            if (m24960D != null) {
                C5380p.this.f13281n.m25032t(m24960D);
                new C5355e0(C5380p.this.m24958F()).m25055k(m24960D, this.f13309c);
                return null;
            }
            C5335f.m25102f().m25106b("Tried to cache user data while no session was open.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.p$i */
    /* loaded from: classes2.dex */
    public class CallableC5392i implements Callable<Void> {

        /* renamed from: c */
        final /* synthetic */ Map f13311c;

        /* renamed from: d */
        final /* synthetic */ boolean f13312d;

        CallableC5392i(Map map, boolean z) {
            this.f13311c = map;
            this.f13312d = z;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            new C5355e0(C5380p.this.m24958F()).m25056j(C5380p.this.m24960D(), this.f13311c, this.f13312d);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.p$j */
    /* loaded from: classes2.dex */
    public class CallableC5393j implements Callable<Void> {
        CallableC5393j() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C5380p.this.m24917v();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5380p(Context context, C5375o c5375o, C5347a0 c5347a0, C5406w c5406w, InterfaceC5577h interfaceC5577h, C5400r c5400r, C5361h c5361h, C5366j0 c5366j0, C5414b c5414b, C5414b.InterfaceC5416b interfaceC5416b, C5362h0 c5362h0, InterfaceC5331d interfaceC5331d, InterfaceC5337a interfaceC5337a) {
        new AtomicBoolean(false);
        this.f13268a = context;
        this.f13272e = c5375o;
        this.f13273f = c5347a0;
        this.f13269b = c5406w;
        this.f13274g = interfaceC5577h;
        this.f13270c = c5400r;
        this.f13275h = c5361h;
        this.f13271d = c5366j0;
        this.f13277j = c5414b;
        this.f13276i = interfaceC5416b;
        this.f13278k = interfaceC5331d;
        this.f13279l = c5361h.f13224g.mo24347a();
        this.f13280m = interfaceC5337a;
        this.f13281n = c5362h0;
    }

    /* renamed from: B */
    private static boolean m24962B() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: C */
    private Context m24961C() {
        return this.f13268a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public String m24960D() {
        List<String> m25039m = this.f13281n.m25039m();
        if (m25039m.isEmpty()) {
            return null;
        }
        return m25039m.get(0);
    }

    /* renamed from: E */
    private static long m24959E() {
        return m24955I(System.currentTimeMillis());
    }

    /* renamed from: G */
    static List<InterfaceC5358f0> m24957G(InterfaceC5336g interfaceC5336g, String str, File file, byte[] bArr) {
        C5355e0 c5355e0 = new C5355e0(file);
        File m25063c = c5355e0.m25063c(str);
        File m25064b = c5355e0.m25064b(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C5371l("logs_file", "logs", bArr));
        arrayList.add(new C5412z("crash_meta_file", "metadata", interfaceC5336g.mo25090f()));
        arrayList.add(new C5412z("session_meta_file", "session", interfaceC5336g.mo25091e()));
        arrayList.add(new C5412z("app_meta_file", "app", interfaceC5336g.mo25095a()));
        arrayList.add(new C5412z("device_meta_file", "device", interfaceC5336g.mo25093c()));
        arrayList.add(new C5412z("os_meta_file", "os", interfaceC5336g.mo25094b()));
        arrayList.add(new C5412z("minidump_file", "minidump", interfaceC5336g.mo25092d()));
        arrayList.add(new C5412z("user_meta_file", "user", m25063c));
        arrayList.add(new C5412z("keys_file", "keys", m25064b));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static long m24955I(long j) {
        return j / 1000;
    }

    /* renamed from: N */
    private static File[] m24950N(File file, FilenameFilter filenameFilter) {
        return m24914y(file.listFiles(filenameFilter));
    }

    /* renamed from: O */
    private File[] m24949O(FilenameFilter filenameFilter) {
        return m24950N(m24958F(), filenameFilter);
    }

    /* renamed from: P */
    private j<Void> m24948P(long j) {
        if (m24962B()) {
            C5335f.m25102f().m25097k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return C4469m.m27765f(null);
        }
        C5335f.m25102f().m25106b("Logging app exception event to Firebase Analytics");
        return C4469m.m27768c(new ScheduledThreadPoolExecutor(1), new CallableC5381a(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public j<Void> m24947Q() {
        File[] m24951M;
        ArrayList arrayList = new ArrayList();
        for (File file : m24951M()) {
            try {
                arrayList.add(m24948P(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                C5335f.m25102f().m25097k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return C4469m.m27764g(arrayList);
    }

    /* renamed from: V */
    private j<Boolean> m24942V() {
        if (this.f13269b.m24843d()) {
            C5335f.m25102f().m25106b("Automatic data collection is enabled. Allowing upload.");
            this.f13283p.m27773e(Boolean.FALSE);
            return C4469m.m27765f(Boolean.TRUE);
        }
        C5335f.m25102f().m25106b("Automatic data collection is disabled.");
        C5335f.m25102f().m25099i("Notifying that unsent reports are available.");
        this.f13283p.m27773e(Boolean.TRUE);
        j q = this.f13269b.m24840g().q(new C5385d(this));
        C5335f.m25102f().m25106b("Waiting for send/deleteUnsentReports to be called.");
        return C5368k0.m25013f(q, this.f13284q.m27777a());
    }

    /* renamed from: W */
    private void m24941W(String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f13268a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                C5414b c5414b = new C5414b(this.f13268a, this.f13276i, str);
                C5366j0 c5366j0 = new C5366j0();
                c5366j0.m25025e(new C5355e0(m24958F()).m25060f(str));
                this.f13281n.m25033s(str, historicalProcessExitReasons, c5414b, c5366j0);
                return;
            }
            C5335f m25102f = C5335f.m25102f();
            m25102f.m25099i("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        C5335f m25102f2 = C5335f.m25102f();
        m25102f2.m25099i("ANR feature enabled, but device is API " + Build.VERSION.SDK_INT);
    }

    /* renamed from: m */
    private void m24926m(Map<String, String> map, boolean z) {
        this.f13272e.m24967h(new CallableC5392i(map, z));
    }

    /* renamed from: n */
    private void m24925n(C5366j0 c5366j0) {
        this.f13272e.m24967h(new CallableC5391h(c5366j0));
    }

    /* renamed from: o */
    private static AbstractC5496c0.AbstractC5497a m24924o(C5347a0 c5347a0, C5361h c5361h, String str) {
        return AbstractC5496c0.AbstractC5497a.m24694b(c5347a0.m25082f(), c5361h.f13222e, c5361h.f13223f, c5347a0.mo25073a(), EnumC5407x.m24838a(c5361h.f13220c).m24837b(), str);
    }

    /* renamed from: p */
    private static AbstractC5496c0.AbstractC5498b m24923p(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return AbstractC5496c0.AbstractC5498b.m24693c(C5373n.m24990l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), C5373n.m24983s(), statFs.getBlockCount() * statFs.getBlockSize(), C5373n.m24977y(context), C5373n.m24989m(context), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* renamed from: q */
    private static AbstractC5496c0.AbstractC5499c m24922q(Context context) {
        return AbstractC5496c0.AbstractC5499c.m24692a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, C5373n.m24976z(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static void m24921r(File[] fileArr) {
        if (fileArr == null) {
            return;
        }
        for (File file : fileArr) {
            file.delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    private void m24918u(boolean z, InterfaceC5587e interfaceC5587e) {
        List<String> m25039m = this.f13281n.m25039m();
        if (m25039m.size() <= z) {
            C5335f.m25102f().m25099i("No open sessions to be closed.");
            return;
        }
        String str = m25039m.get(z ? 1 : 0);
        if (interfaceC5587e.mo24372b().mo24364a().f13787b) {
            m24941W(str);
        } else {
            C5335f.m25102f().m25099i("ANR feature disabled.");
        }
        if (this.f13278k.mo25111e(str)) {
            m24913z(str);
            this.f13278k.mo25115a(str);
        }
        this.f13281n.m25045g(m24959E(), z != 0 ? m25039m.get(0) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m24917v() {
        long m24959E = m24959E();
        String c5372m = new C5372m(this.f13273f).toString();
        C5335f m25102f = C5335f.m25102f();
        m25102f.m25106b("Opening a new session with ID " + c5372m);
        this.f13278k.mo25112d(c5372m, String.format(Locale.US, "Crashlytics Android SDK/%s", C5394q.m24893i()), m24959E, AbstractC5496c0.m24695b(m24924o(this.f13273f, this.f13275h, this.f13279l), m24922q(m24961C()), m24923p(m24961C())));
        this.f13277j.m24822e(c5372m);
        this.f13281n.m25038n(c5372m, m24959E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m24916w(long j) {
        try {
            File m24958F = m24958F();
            new File(m24958F, ".ae" + j).createNewFile();
        } catch (IOException e) {
            C5335f.m25102f().m25096l("Could not create app exception marker file.", e);
        }
    }

    /* renamed from: y */
    private static File[] m24914y(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    /* renamed from: z */
    private void m24913z(String str) {
        C5335f m25102f = C5335f.m25102f();
        m25102f.m25099i("Finalizing native report for session " + str);
        InterfaceC5336g mo25114b = this.f13278k.mo25114b(str);
        File mo25092d = mo25114b.mo25092d();
        if (mo25092d != null && mo25092d.exists()) {
            long lastModified = mo25092d.lastModified();
            C5414b c5414b = new C5414b(this.f13268a, this.f13276i, str);
            File file = new File(m24956H(), str);
            if (!file.mkdirs()) {
                C5335f.m25102f().m25097k("Couldn't create directory to store native session files, aborting.");
                return;
            }
            m24916w(lastModified);
            List<InterfaceC5358f0> m24957G = m24957G(mo25114b, str, m24958F(), c5414b.m24825b());
            C5360g0.m25053b(file, m24957G);
            this.f13281n.m25046f(str, m24957G);
            c5414b.m24826a();
            return;
        }
        C5335f m25102f2 = C5335f.m25102f();
        m25102f2.m25097k("No minidump data found for session " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean m24963A(InterfaceC5587e interfaceC5587e) {
        this.f13272e.m24973b();
        if (m24953K()) {
            C5335f.m25102f().m25097k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        C5335f.m25102f().m25099i("Finalizing previously open sessions.");
        try {
            m24918u(true, interfaceC5587e);
            C5335f.m25102f().m25099i("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            C5335f.m25102f().m25103e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    /* renamed from: F */
    File m24958F() {
        return this.f13274g.mo24405b();
    }

    /* renamed from: H */
    File m24956H() {
        return new File(m24958F(), "native-sessions");
    }

    /* renamed from: J */
    synchronized void m24954J(InterfaceC5587e interfaceC5587e, Thread thread, Throwable th) {
        C5335f m25102f = C5335f.m25102f();
        m25102f.m25106b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            C5368k0.m25018a(this.f13272e.m24966i(new CallableC5383c(System.currentTimeMillis(), th, thread, interfaceC5587e)));
        } catch (Exception e) {
            C5335f.m25102f().m25103e("Error handling uncaught exception", e);
        }
    }

    /* renamed from: K */
    boolean m24953K() {
        C5403u c5403u = this.f13282o;
        return c5403u != null && c5403u.m24850a();
    }

    /* renamed from: M */
    File[] m24951M() {
        return m24949O(f13267s);
    }

    /* renamed from: R */
    void m24946R() {
        this.f13272e.m24967h(new CallableC5393j());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public void m24945S(String str, String str2) {
        try {
            this.f13271d.m25026d(str, str2);
            m24926m(this.f13271d.m25029a(), false);
        } catch (IllegalArgumentException e) {
            Context context = this.f13268a;
            if (context != null && C5373n.m24979w(context)) {
                throw e;
            }
            C5335f.m25102f().m25104d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m24944T(String str) {
        this.f13271d.m25024f(str);
        m24925n(this.f13271d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public j<Void> m24943U(j<C5591a> jVar) {
        if (!this.f13281n.m25042j()) {
            C5335f.m25102f().m25099i("No crash reports are available to be sent.");
            this.f13283p.m27773e(Boolean.FALSE);
            return C4469m.m27765f(null);
        }
        C5335f.m25102f().m25099i("Crash reports are available to be sent.");
        return m24942V().q(new C5386e(jVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public void m24940X(Thread thread, Throwable th) {
        this.f13272e.m24968g(new RunnableC5390g(System.currentTimeMillis(), th, thread));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public void m24939Y(long j, String str) {
        this.f13272e.m24967h(new CallableC5389f(j, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean m24920s() {
        if (!this.f13270c.m24879c()) {
            String m24960D = m24960D();
            return m24960D != null && this.f13278k.mo25111e(m24960D);
        }
        C5335f.m25102f().m25099i("Found previous crash marker.");
        this.f13270c.m24878d();
        return true;
    }

    /* renamed from: t */
    void m24919t(InterfaceC5587e interfaceC5587e) {
        m24918u(false, interfaceC5587e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m24915x(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC5587e interfaceC5587e) {
        m24946R();
        C5403u c5403u = new C5403u(new C5382b(), interfaceC5587e, uncaughtExceptionHandler, this.f13278k);
        this.f13282o = c5403u;
        Thread.setDefaultUncaughtExceptionHandler(c5403u);
    }
}
