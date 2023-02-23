package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.p058os.C1383k;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C2757c;
import com.google.android.gms.common.internal.C2906q;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.util.C2965c;
import com.google.android.gms.common.util.C2974l;
import com.google.android.gms.common.util.C2975m;
import com.google.firebase.components.C5296n;
import com.google.firebase.components.C5300p;
import com.google.firebase.components.C5306s;
import com.google.firebase.components.C5315w;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.InterfaceC5305r;
import com.google.firebase.p167m.InterfaceC6472c;
import com.google.firebase.p170o.InterfaceC6560b;
import com.google.firebase.p171p.C6561a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p201g.p218e.C7521a;
/* compiled from: FirebaseApp.java */
/* renamed from: com.google.firebase.g */
/* loaded from: classes2.dex */
public class C5988g {

    /* renamed from: i */
    private static final Object f14657i = new Object();

    /* renamed from: j */
    private static final Executor f14658j = new ExecutorC5992d();

    /* renamed from: k */
    static final Map<String, C5988g> f14659k = new C7521a();

    /* renamed from: a */
    private final Context f14660a;

    /* renamed from: b */
    private final String f14661b;

    /* renamed from: c */
    private final C5995i f14662c;

    /* renamed from: d */
    private final C5306s f14663d;

    /* renamed from: g */
    private final C5315w<C6561a> f14666g;

    /* renamed from: e */
    private final AtomicBoolean f14664e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f14665f = new AtomicBoolean();

    /* renamed from: h */
    private final List<InterfaceC5990b> f14667h = new CopyOnWriteArrayList();

    /* compiled from: FirebaseApp.java */
    /* renamed from: com.google.firebase.g$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC5990b {
        /* renamed from: a */
        void mo23078a(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FirebaseApp.java */
    /* renamed from: com.google.firebase.g$c */
    /* loaded from: classes2.dex */
    public static class C5991c implements ComponentCallbacks2C2757c.InterfaceC2758a {

        /* renamed from: a */
        private static AtomicReference<C5991c> f14668a = new AtomicReference<>();

        private C5991c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static void m23075c(Context context) {
            if (C2974l.m31522a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f14668a.get() == null) {
                    C5991c c5991c = new C5991c();
                    if (f14668a.compareAndSet(null, c5991c)) {
                        ComponentCallbacks2C2757c.m32047c(application);
                        ComponentCallbacks2C2757c.m32048b().m32049a(c5991c);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C2757c.InterfaceC2758a
        /* renamed from: a */
        public void mo23077a(boolean z) {
            synchronized (C5988g.f14657i) {
                Iterator it = new ArrayList(C5988g.f14659k.values()).iterator();
                while (it.hasNext()) {
                    C5988g c5988g = (C5988g) it.next();
                    if (c5988g.f14664e.get()) {
                        c5988g.m23079w(z);
                    }
                }
            }
        }
    }

    /* compiled from: FirebaseApp.java */
    /* renamed from: com.google.firebase.g$d */
    /* loaded from: classes2.dex */
    private static class ExecutorC5992d implements Executor {

        /* renamed from: c */
        private static final Handler f14669c = new Handler(Looper.getMainLooper());

        private ExecutorC5992d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f14669c.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FirebaseApp.java */
    /* renamed from: com.google.firebase.g$e */
    /* loaded from: classes2.dex */
    public static class C5993e extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<C5993e> f14670b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f14671a;

        public C5993e(Context context) {
            this.f14671a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static void m23073b(Context context) {
            if (f14670b.get() == null) {
                C5993e c5993e = new C5993e(context);
                if (f14670b.compareAndSet(null, c5993e)) {
                    context.registerReceiver(c5993e, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void m23072c() {
            this.f14671a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C5988g.f14657i) {
                for (C5988g c5988g : C5988g.f14659k.values()) {
                    c5988g.m23087o();
                }
            }
            m23072c();
        }
    }

    protected C5988g(final Context context, String str, C5995i c5995i) {
        new CopyOnWriteArrayList();
        s.j(context);
        this.f14660a = context;
        s.f(str);
        this.f14661b = str;
        s.j(c5995i);
        this.f14662c = c5995i;
        List<InterfaceC6560b<InterfaceC5305r>> m25204a = C5300p.m25203b(context, ComponentDiscoveryService.class).m25204a();
        C5306s.C5308b m25194f = C5306s.m25194f(f14658j);
        m25194f.m25180c(m25204a);
        m25194f.m25181b(new FirebaseCommonRegistrar());
        m25194f.m25182a(C5296n.m25216n(context, Context.class, new Class[0]));
        m25194f.m25182a(C5296n.m25216n(this, C5988g.class, new Class[0]));
        m25194f.m25182a(C5296n.m25216n(c5995i, C5995i.class, new Class[0]));
        this.f14663d = m25194f.m25179d();
        this.f14666g = new C5315w<>(new InterfaceC6560b() { // from class: com.google.firebase.a
            @Override // com.google.firebase.p170o.InterfaceC6560b
            public final Object get() {
                return C5988g.this.m23081u(context);
            }
        });
    }

    /* renamed from: f */
    private void m23096f() {
        s.n(!this.f14665f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: h */
    private static List<String> m23094h() {
        ArrayList arrayList = new ArrayList();
        synchronized (f14657i) {
            for (C5988g c5988g : f14659k.values()) {
                arrayList.add(c5988g.m23090l());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: j */
    public static C5988g m23092j() {
        C5988g c5988g;
        synchronized (f14657i) {
            c5988g = f14659k.get("[DEFAULT]");
            if (c5988g == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C2975m.m31511a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return c5988g;
    }

    /* renamed from: k */
    public static C5988g m23091k(String str) {
        C5988g c5988g;
        List<String> m23094h;
        String str2;
        synchronized (f14657i) {
            c5988g = f14659k.get(m23080v(str));
            if (c5988g == null) {
                if (m23094h().isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", m23094h);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
        }
        return c5988g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m23087o() {
        if (!C1383k.m36158a(this.f14660a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m23090l());
            C5993e.m23073b(this.f14660a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m23090l());
        this.f14663d.m25191i(m23082t());
    }

    /* renamed from: p */
    public static C5988g m23086p(Context context) {
        synchronized (f14657i) {
            if (f14659k.containsKey("[DEFAULT]")) {
                return m23092j();
            }
            C5995i m23070a = C5995i.m23070a(context);
            if (m23070a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return m23085q(context, m23070a);
        }
    }

    /* renamed from: q */
    public static C5988g m23085q(Context context, C5995i c5995i) {
        return m23084r(context, c5995i, "[DEFAULT]");
    }

    /* renamed from: r */
    public static C5988g m23084r(Context context, C5995i c5995i, String str) {
        C5988g c5988g;
        C5991c.m23075c(context);
        String m23080v = m23080v(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f14657i) {
            boolean z = !f14659k.containsKey(m23080v);
            s.n(z, "FirebaseApp name " + m23080v + " already exists!");
            s.k(context, "Application context cannot be null.");
            c5988g = new C5988g(context, m23080v, c5995i);
            f14659k.put(m23080v, c5988g);
        }
        c5988g.m23087o();
        return c5988g;
    }

    /* renamed from: v */
    private static String m23080v(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m23079w(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (InterfaceC5990b interfaceC5990b : this.f14667h) {
            interfaceC5990b.mo23078a(z);
        }
    }

    /* renamed from: e */
    public void m23097e(InterfaceC5990b interfaceC5990b) {
        m23096f();
        if (this.f14664e.get() && ComponentCallbacks2C2757c.m32048b().m32046d()) {
            interfaceC5990b.mo23078a(true);
        }
        this.f14667h.add(interfaceC5990b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5988g) {
            return this.f14661b.equals(((C5988g) obj).m23090l());
        }
        return false;
    }

    /* renamed from: g */
    public <T> T m23095g(Class<T> cls) {
        m23096f();
        return (T) this.f14663d.mo25206a(cls);
    }

    public int hashCode() {
        return this.f14661b.hashCode();
    }

    /* renamed from: i */
    public Context m23093i() {
        m23096f();
        return this.f14660a;
    }

    /* renamed from: l */
    public String m23090l() {
        m23096f();
        return this.f14661b;
    }

    /* renamed from: m */
    public C5995i m23089m() {
        m23096f();
        return this.f14662c;
    }

    /* renamed from: n */
    public String m23088n() {
        return C2965c.e(m23090l().getBytes(Charset.defaultCharset())) + "+" + C2965c.e(m23089m().m23068c().getBytes(Charset.defaultCharset()));
    }

    /* renamed from: s */
    public boolean m23083s() {
        m23096f();
        return this.f14666g.get().m21636b();
    }

    /* renamed from: t */
    public boolean m23082t() {
        return "[DEFAULT]".equals(m23090l());
    }

    public String toString() {
        C2906q.C2907a m31699c = C2906q.m31699c(this);
        m31699c.m31698a("name", this.f14661b);
        m31699c.m31698a("options", this.f14662c);
        return m31699c.toString();
    }

    /* renamed from: u */
    public /* synthetic */ C6561a m23081u(Context context) {
        return new C6561a(context, m23088n(), (InterfaceC6472c) this.f14663d.mo25206a(InterfaceC6472c.class));
    }
}
