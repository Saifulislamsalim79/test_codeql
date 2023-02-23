package com.google.firebase.perf.p177i;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.tasks.C4469m;
import com.google.firebase.C5988g;
import com.google.firebase.installations.InterfaceC6432h;
import com.google.firebase.p170o.InterfaceC6560b;
import com.google.firebase.perf.C6564b;
import com.google.firebase.perf.C6565c;
import com.google.firebase.perf.config.C6569d;
import com.google.firebase.perf.metrics.p180d.AbstractC6701e;
import com.google.firebase.perf.p172f.C6593a;
import com.google.firebase.perf.p176h.C6609a;
import com.google.firebase.perf.p176h.C6610b;
import com.google.firebase.perf.p178j.C6629f;
import com.google.firebase.perf.p178j.EnumC6625b;
import com.google.firebase.perf.p179k.C6642a;
import com.google.firebase.perf.p179k.C6648c;
import com.google.firebase.perf.p179k.C6660g;
import com.google.firebase.perf.p179k.C6663h;
import com.google.firebase.perf.p179k.C6671i;
import com.google.firebase.perf.p179k.C6681m;
import com.google.firebase.perf.p179k.EnumC6652d;
import com.google.firebase.perf.p179k.InterfaceC6674j;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p272h.p286c.p287a.p288a.InterfaceC8241g;
/* compiled from: TransportManager.java */
/* renamed from: com.google.firebase.perf.i.k */
/* loaded from: classes2.dex */
public class C6623k implements C6593a.InterfaceC6595b {

    /* renamed from: J */
    private static final C6609a f15964J = C6609a.m21475e();

    /* renamed from: K */
    private static final C6623k f15965K = new C6623k();

    /* renamed from: B */
    private Context f15967B;

    /* renamed from: C */
    private C6569d f15968C;

    /* renamed from: D */
    private C6621j f15969D;

    /* renamed from: E */
    private C6593a f15970E;

    /* renamed from: F */
    private C6648c.C6650b f15971F;

    /* renamed from: G */
    private String f15972G;

    /* renamed from: H */
    private String f15973H;

    /* renamed from: c */
    private final Map<String, Integer> f15975c;

    /* renamed from: f */
    private C5988g f15978f;

    /* renamed from: w */
    private C6565c f15979w;

    /* renamed from: x */
    private InterfaceC6432h f15980x;

    /* renamed from: y */
    private InterfaceC6560b<InterfaceC8241g> f15981y;

    /* renamed from: z */
    private C6619h f15982z;

    /* renamed from: d */
    private final ConcurrentLinkedQueue<C6620i> f15976d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    private final AtomicBoolean f15977e = new AtomicBoolean(false);

    /* renamed from: I */
    private boolean f15974I = false;

    /* renamed from: A */
    private ExecutorService f15966A = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    private C6623k() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f15975c = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        this.f15975c.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        this.f15975c.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    /* renamed from: A */
    private void m21444A(C6671i.C6673b c6673b, EnumC6652d enumC6652d) {
        if (!m21427o()) {
            if (m21429m(c6673b)) {
                f15964J.m21478b("Transport is not initialized yet, %s will be queued for to be dispatched later", m21434h(c6673b));
                this.f15976d.add(new C6620i(c6673b, enumC6652d));
                return;
            }
            return;
        }
        C6671i m21417y = m21417y(c6673b, enumC6652d);
        if (m21428n(m21417y)) {
            m21441a(m21417y);
            SessionManager.getInstance().updatePerfSessionIfExpired();
        }
    }

    /* renamed from: B */
    private void m21443B() {
        if (this.f15968C.m21617I()) {
            if (!this.f15971F.m21347F() || this.f15974I) {
                String str = null;
                try {
                    str = (String) C4469m.m27769b(this.f15980x.mo22049h(), 60000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    f15964J.m21476d("Task to retrieve Installation Id is interrupted: %s", e.getMessage());
                } catch (ExecutionException e2) {
                    f15964J.m21476d("Unable to retrieve Installation Id: %s", e2.getMessage());
                } catch (TimeoutException e3) {
                    f15964J.m21476d("Task to retrieve Installation Id is timed out: %s", e3.getMessage());
                }
                if (!TextUtils.isEmpty(str)) {
                    this.f15971F.m21344I(str);
                } else {
                    f15964J.m21471i("Firebase Installation Id is empty, contact Firebase Support for debugging.");
                }
            }
        }
    }

    /* renamed from: C */
    private void m21442C() {
        if (this.f15979w == null && m21427o()) {
            this.f15979w = C6565c.m21629c();
        }
    }

    /* renamed from: a */
    private void m21441a(C6671i c6671i) {
        if (c6671i.mo21203k()) {
            f15964J.m21473g("Logging %s. In a minute, visit the Firebase console to view your data: %s", m21434h(c6671i), m21439c(c6671i.mo21202l()));
        } else {
            f15964J.m21473g("Logging %s", m21434h(c6671i));
        }
        this.f15982z.m21459b(c6671i);
    }

    /* renamed from: b */
    private void m21440b() {
        this.f15970E.m21519k(new WeakReference<>(f15965K));
        C6648c.C6650b m21352f0 = C6648c.m21352f0();
        this.f15971F = m21352f0;
        m21352f0.m21342L(this.f15978f.m23089m().m23068c());
        C6642a.C6644b m21381Y = C6642a.m21381Y();
        m21381Y.m21377F(this.f15972G);
        m21381Y.m21376G(C6564b.f15839b);
        m21381Y.m21375H(m21432j(this.f15967B));
        m21352f0.m21345H(m21381Y);
        this.f15977e.set(true);
        while (!this.f15976d.isEmpty()) {
            final C6620i poll = this.f15976d.poll();
            if (poll != null) {
                this.f15966A.execute(new Runnable() { // from class: com.google.firebase.perf.i.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6623k.this.m21425q(poll);
                    }
                });
            }
        }
    }

    /* renamed from: c */
    private String m21439c(C6681m c6681m) {
        String m21160o0 = c6681m.m21160o0();
        if (m21160o0.startsWith("_st_")) {
            return C6610b.m21467c(this.f15973H, this.f15972G, m21160o0);
        }
        return C6610b.m21469a(this.f15973H, this.f15972G, m21160o0);
    }

    /* renamed from: d */
    private Map<String, String> m21438d() {
        m21442C();
        C6565c c6565c = this.f15979w;
        if (c6565c != null) {
            return c6565c.m21630b();
        }
        return Collections.emptyMap();
    }

    /* renamed from: e */
    public static C6623k m21437e() {
        return f15965K;
    }

    /* renamed from: f */
    private static String m21436f(C6660g c6660g) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(c6660g.m21299e0()), Integer.valueOf(c6660g.m21302b0()), Integer.valueOf(c6660g.m21303a0()));
    }

    /* renamed from: g */
    private static String m21435g(C6663h c6663h) {
        long m21249r0 = c6663h.m21289B0() ? c6663h.m21249r0() : 0L;
        String valueOf = c6663h.m21244x0() ? String.valueOf(c6663h.m21255l0()) : "UNKNOWN";
        Locale locale = Locale.ENGLISH;
        double d = m21249r0;
        Double.isNaN(d);
        return String.format(locale, "network request trace: %s (responseCode: %s, responseTime: %.4fms)", c6663h.m21247t0(), valueOf, Double.valueOf(d / 1000.0d));
    }

    /* renamed from: h */
    private static String m21434h(InterfaceC6674j interfaceC6674j) {
        if (interfaceC6674j.mo21203k()) {
            return m21433i(interfaceC6674j.mo21202l());
        }
        if (interfaceC6674j.mo21201o()) {
            return m21435g(interfaceC6674j.mo21200p());
        }
        return interfaceC6674j.mo21204i() ? m21436f(interfaceC6674j.mo21199q()) : "log";
    }

    /* renamed from: i */
    private static String m21433i(C6681m c6681m) {
        long m21163l0 = c6681m.m21163l0();
        Locale locale = Locale.ENGLISH;
        double d = m21163l0;
        Double.isNaN(d);
        return String.format(locale, "trace metric: %s (duration: %.4fms)", c6681m.m21160o0(), Double.valueOf(d / 1000.0d));
    }

    /* renamed from: j */
    private static String m21432j(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return packageInfo.versionName == null ? "" : packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* renamed from: k */
    private void m21431k(C6671i c6671i) {
        if (c6671i.mo21203k()) {
            this.f15970E.m21525e(EnumC6625b.TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        } else if (c6671i.mo21201o()) {
            this.f15970E.m21525e(EnumC6625b.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        }
    }

    /* renamed from: m */
    private boolean m21429m(InterfaceC6674j interfaceC6674j) {
        int intValue = this.f15975c.get("KEY_AVAILABLE_TRACES_FOR_CACHING").intValue();
        int intValue2 = this.f15975c.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING").intValue();
        int intValue3 = this.f15975c.get("KEY_AVAILABLE_GAUGES_FOR_CACHING").intValue();
        if (interfaceC6674j.mo21203k() && intValue > 0) {
            this.f15975c.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            return true;
        } else if (interfaceC6674j.mo21201o() && intValue2 > 0) {
            this.f15975c.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            return true;
        } else if (interfaceC6674j.mo21204i() && intValue3 > 0) {
            this.f15975c.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
            return true;
        } else {
            f15964J.m21478b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", m21434h(interfaceC6674j), Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3));
            return false;
        }
    }

    /* renamed from: n */
    private boolean m21428n(C6671i c6671i) {
        if (!this.f15968C.m21617I()) {
            f15964J.m21473g("Performance collection is not enabled, dropping %s", m21434h(c6671i));
            return false;
        } else if (!c6671i.m21215W().m21356b0()) {
            f15964J.m21470j("App Instance ID is null or empty, dropping %s", m21434h(c6671i));
            return false;
        } else if (!AbstractC6701e.m21064b(c6671i, this.f15967B)) {
            f15964J.m21470j("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", m21434h(c6671i));
            return false;
        } else if (this.f15969D.m21457b(c6671i)) {
            return true;
        } else {
            m21431k(c6671i);
            if (c6671i.mo21203k()) {
                f15964J.m21473g("Rate Limited - %s", m21433i(c6671i.mo21202l()));
            } else if (c6671i.mo21201o()) {
                f15964J.m21473g("Rate Limited - %s", m21435g(c6671i.mo21200p()));
            }
            return false;
        }
    }

    /* renamed from: y */
    private C6671i m21417y(C6671i.C6673b c6673b, EnumC6652d enumC6652d) {
        m21443B();
        C6648c.C6650b c6650b = this.f15971F;
        c6650b.m21343K(enumC6652d);
        if (c6673b.mo21203k()) {
            c6650b = c6650b.clone();
            c6650b.m21346G(m21438d());
        }
        c6673b.m21208F(c6650b);
        return c6673b.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m21416z() {
        Context m23093i = this.f15978f.m23093i();
        this.f15967B = m23093i;
        this.f15972G = m23093i.getPackageName();
        this.f15968C = C6569d.m21605f();
        this.f15969D = new C6621j(this.f15967B, new C6629f(100L, 1L, TimeUnit.MINUTES), 500L);
        this.f15970E = C6593a.m21528b();
        this.f15982z = new C6619h(this.f15981y, this.f15968C.m21610a());
        m21440b();
    }

    /* renamed from: l */
    public void m21430l(C5988g c5988g, InterfaceC6432h interfaceC6432h, InterfaceC6560b<InterfaceC8241g> interfaceC6560b) {
        this.f15978f = c5988g;
        this.f15973H = c5988g.m23089m().m23065f();
        this.f15980x = interfaceC6432h;
        this.f15981y = interfaceC6560b;
        this.f15966A.execute(new Runnable() { // from class: com.google.firebase.perf.i.b
            @Override // java.lang.Runnable
            public final void run() {
                C6623k.this.m21416z();
            }
        });
    }

    /* renamed from: o */
    public boolean m21427o() {
        return this.f15977e.get();
    }

    @Override // com.google.firebase.perf.p172f.C6593a.InterfaceC6595b
    public void onUpdateAppState(EnumC6652d enumC6652d) {
        this.f15974I = enumC6652d == EnumC6652d.FOREGROUND;
        if (m21427o()) {
            this.f15966A.execute(new Runnable() { // from class: com.google.firebase.perf.i.g
                @Override // java.lang.Runnable
                public final void run() {
                    C6623k.this.m21421u();
                }
            });
        }
    }

    /* renamed from: q */
    public /* synthetic */ void m21425q(C6620i c6620i) {
        m21444A(c6620i.f15945a, c6620i.f15946b);
    }

    /* renamed from: r */
    public /* synthetic */ void m21424r(C6681m c6681m, EnumC6652d enumC6652d) {
        m21444A(C6671i.m21213Y().m21205I(c6681m), enumC6652d);
    }

    /* renamed from: s */
    public /* synthetic */ void m21423s(C6663h c6663h, EnumC6652d enumC6652d) {
        m21444A(C6671i.m21213Y().m21206H(c6663h), enumC6652d);
    }

    /* renamed from: t */
    public /* synthetic */ void m21422t(C6660g c6660g, EnumC6652d enumC6652d) {
        m21444A(C6671i.m21213Y().m21207G(c6660g), enumC6652d);
    }

    /* renamed from: u */
    public /* synthetic */ void m21421u() {
        this.f15969D.m21458a(this.f15974I);
    }

    /* renamed from: v */
    public void m21420v(final C6660g c6660g, final EnumC6652d enumC6652d) {
        this.f15966A.execute(new Runnable() { // from class: com.google.firebase.perf.i.c
            @Override // java.lang.Runnable
            public final void run() {
                C6623k.this.m21422t(c6660g, enumC6652d);
            }
        });
    }

    /* renamed from: w */
    public void m21419w(final C6663h c6663h, final EnumC6652d enumC6652d) {
        this.f15966A.execute(new Runnable() { // from class: com.google.firebase.perf.i.e
            @Override // java.lang.Runnable
            public final void run() {
                C6623k.this.m21423s(c6663h, enumC6652d);
            }
        });
    }

    /* renamed from: x */
    public void m21418x(final C6681m c6681m, final EnumC6652d enumC6652d) {
        this.f15966A.execute(new Runnable() { // from class: com.google.firebase.perf.i.d
            @Override // java.lang.Runnable
            public final void run() {
                C6623k.this.m21424r(c6681m, enumC6652d);
            }
        });
    }
}
