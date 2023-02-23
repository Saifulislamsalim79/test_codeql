package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.C4469m;
import com.google.android.gms.tasks.InterfaceC4450c;
import com.google.android.gms.tasks.j;
import com.google.firebase.C5988g;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import com.google.firebase.crashlytics.p112h.C5332e;
import com.google.firebase.crashlytics.p112h.C5335f;
import com.google.firebase.crashlytics.p112h.InterfaceC5331d;
import com.google.firebase.crashlytics.p112h.p115j.C5347a0;
import com.google.firebase.crashlytics.p112h.p115j.C5361h;
import com.google.firebase.crashlytics.p112h.p115j.C5373n;
import com.google.firebase.crashlytics.p112h.p115j.C5394q;
import com.google.firebase.crashlytics.p112h.p115j.C5406w;
import com.google.firebase.crashlytics.p112h.p115j.C5408y;
import com.google.firebase.crashlytics.p112h.p119m.C5568b;
import com.google.firebase.crashlytics.p112h.p122p.C5585d;
import com.google.firebase.crashlytics.p112h.p126r.C5604a;
import com.google.firebase.installations.InterfaceC6432h;
import com.google.firebase.p170o.InterfaceC6558a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
/* compiled from: FirebaseCrashlytics.java */
/* renamed from: com.google.firebase.crashlytics.g */
/* loaded from: classes2.dex */
public class C5325g {

    /* renamed from: a */
    final C5394q f13173a;

    /* compiled from: FirebaseCrashlytics.java */
    /* renamed from: com.google.firebase.crashlytics.g$a */
    /* loaded from: classes2.dex */
    class C5326a implements InterfaceC4450c<Void, Object> {
        C5326a() {
        }

        @Override // com.google.android.gms.tasks.InterfaceC4450c
        /* renamed from: a */
        public Object mo20893a(j<Void> jVar) throws Exception {
            if (jVar.p()) {
                return null;
            }
            C5335f.m25102f().m25103e("Error fetching settings.", jVar.k());
            return null;
        }
    }

    /* compiled from: FirebaseCrashlytics.java */
    /* renamed from: com.google.firebase.crashlytics.g$b */
    /* loaded from: classes2.dex */
    class CallableC5327b implements Callable<Void> {

        /* renamed from: c */
        final /* synthetic */ boolean f13174c;

        /* renamed from: d */
        final /* synthetic */ C5394q f13175d;

        /* renamed from: e */
        final /* synthetic */ C5585d f13176e;

        CallableC5327b(boolean z, C5394q c5394q, C5585d c5585d) {
            this.f13174c = z;
            this.f13175d = c5394q;
            this.f13176e = c5585d;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            if (this.f13174c) {
                this.f13175d.m24895g(this.f13176e);
                return null;
            }
            return null;
        }
    }

    private C5325g(C5394q c5394q) {
        this.f13173a = c5394q;
    }

    /* renamed from: a */
    public static C5325g m25123a() {
        C5325g c5325g = (C5325g) C5988g.m23092j().m23095g(C5325g.class);
        if (c5325g != null) {
            return c5325g;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C5325g m25122b(C5988g c5988g, InterfaceC6432h interfaceC6432h, InterfaceC6558a<InterfaceC5331d> interfaceC6558a, InterfaceC6558a<InterfaceC5174a> interfaceC6558a2) {
        Context m23093i = c5988g.m23093i();
        String packageName = m23093i.getPackageName();
        C5335f m25102f = C5335f.m25102f();
        m25102f.m25101g("Initializing Firebase Crashlytics " + C5394q.m24893i() + " for " + packageName);
        C5406w c5406w = new C5406w(c5988g);
        C5347a0 c5347a0 = new C5347a0(m23093i, packageName, interfaceC6432h, c5406w);
        C5332e c5332e = new C5332e(interfaceC6558a);
        C5323e c5323e = new C5323e(interfaceC6558a2);
        C5394q c5394q = new C5394q(c5988g, c5347a0, c5332e, c5406w, c5323e.m25133b(), c5323e.m25134a(), C5408y.m24834c("Crashlytics Exception Handler"));
        String m23068c = c5988g.m23089m().m23068c();
        String m24988n = C5373n.m24988n(m23093i);
        C5335f m25102f2 = C5335f.m25102f();
        m25102f2.m25106b("Mapping file ID is: " + m24988n);
        try {
            C5361h m25052a = C5361h.m25052a(m23093i, c5347a0, m23068c, m24988n, new C5604a(m23093i));
            C5335f m25102f3 = C5335f.m25102f();
            m25102f3.m25099i("Installer package name is: " + m25052a.f13220c);
            ExecutorService m24834c = C5408y.m24834c("com.google.firebase.crashlytics.startup");
            C5585d m24381l = C5585d.m24381l(m23093i, m23068c, c5347a0, new C5568b(), m25052a.f13222e, m25052a.f13223f, c5406w);
            m24381l.m24377p(m24834c).i(m24834c, new C5326a());
            C4469m.m27768c(m24834c, new CallableC5327b(c5394q.m24887o(m25052a, m24381l), c5394q, m24381l));
            return new C5325g(c5394q);
        } catch (PackageManager.NameNotFoundException e) {
            C5335f.m25102f().m25103e("Error retrieving app package info.", e);
            return null;
        }
    }

    /* renamed from: c */
    public void m25121c(String str) {
        this.f13173a.m24891k(str);
    }

    /* renamed from: d */
    public void m25120d(Throwable th) {
        if (th == null) {
            C5335f.m25102f().m25097k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f13173a.m24890l(th);
        }
    }

    /* renamed from: e */
    public void m25119e(String str, String str2) {
        this.f13173a.m24886p(str, str2);
    }

    /* renamed from: f */
    public void m25118f(String str, boolean z) {
        this.f13173a.m24886p(str, Boolean.toString(z));
    }

    /* renamed from: g */
    public void m25117g(String str) {
        this.f13173a.m24885q(str);
    }
}
