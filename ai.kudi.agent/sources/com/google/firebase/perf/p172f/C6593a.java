package com.google.firebase.perf.p172f;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.core.app.C1308h;
import com.google.firebase.perf.config.C6569d;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.p176h.C6609a;
import com.google.firebase.perf.p177i.C6623k;
import com.google.firebase.perf.p178j.C6624a;
import com.google.firebase.perf.p178j.C6637h;
import com.google.firebase.perf.p178j.C6641k;
import com.google.firebase.perf.p178j.EnumC6625b;
import com.google.firebase.perf.p178j.EnumC6626c;
import com.google.firebase.perf.p179k.C6681m;
import com.google.firebase.perf.p179k.EnumC6652d;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: AppStateMonitor.java */
/* renamed from: com.google.firebase.perf.f.a */
/* loaded from: classes2.dex */
public class C6593a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: I */
    private static final C6609a f15885I = C6609a.m21475e();

    /* renamed from: J */
    private static volatile C6593a f15886J;

    /* renamed from: A */
    private final C6624a f15887A;

    /* renamed from: B */
    private C1308h f15888B;

    /* renamed from: C */
    private C6637h f15889C;

    /* renamed from: D */
    private C6637h f15890D;

    /* renamed from: H */
    private boolean f15894H;

    /* renamed from: y */
    private final C6623k f15901y;

    /* renamed from: c */
    private final WeakHashMap<Activity, Boolean> f15895c = new WeakHashMap<>();

    /* renamed from: d */
    private final WeakHashMap<Activity, Trace> f15896d = new WeakHashMap<>();

    /* renamed from: e */
    private final Map<String, Long> f15897e = new HashMap();

    /* renamed from: f */
    private final Set<WeakReference<InterfaceC6595b>> f15898f = new HashSet();

    /* renamed from: w */
    private Set<InterfaceC6594a> f15899w = new HashSet();

    /* renamed from: x */
    private final AtomicInteger f15900x = new AtomicInteger(0);

    /* renamed from: E */
    private EnumC6652d f15891E = EnumC6652d.BACKGROUND;

    /* renamed from: F */
    private boolean f15892F = false;

    /* renamed from: G */
    private boolean f15893G = true;

    /* renamed from: z */
    private final C6569d f15902z = C6569d.m21605f();

    /* compiled from: AppStateMonitor.java */
    /* renamed from: com.google.firebase.perf.f.a$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC6594a {
        /* renamed from: a */
        void mo21513a();
    }

    /* compiled from: AppStateMonitor.java */
    /* renamed from: com.google.firebase.perf.f.a$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC6595b {
        void onUpdateAppState(EnumC6652d enumC6652d);
    }

    C6593a(C6623k c6623k, C6624a c6624a) {
        this.f15894H = false;
        this.f15901y = c6623k;
        this.f15887A = c6624a;
        boolean m21526d = m21526d();
        this.f15894H = m21526d;
        if (m21526d) {
            this.f15888B = new C1308h();
        }
    }

    /* renamed from: b */
    public static C6593a m21528b() {
        if (f15886J == null) {
            synchronized (C6593a.class) {
                if (f15886J == null) {
                    f15886J = new C6593a(C6623k.m21437e(), new C6624a());
                }
            }
        }
        return f15886J;
    }

    /* renamed from: c */
    public static String m21527c(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    /* renamed from: d */
    private boolean m21526d() {
        try {
            Class.forName("androidx.core.app.h");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: h */
    private boolean m21522h(Activity activity) {
        return this.f15894H;
    }

    /* renamed from: l */
    private void m21518l() {
        synchronized (this.f15898f) {
            for (InterfaceC6594a interfaceC6594a : this.f15899w) {
                if (interfaceC6594a != null) {
                    interfaceC6594a.mo21513a();
                }
            }
        }
    }

    /* renamed from: m */
    private void m21517m(Activity activity) {
        Trace trace;
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        if (this.f15896d.containsKey(activity) && (trace = this.f15896d.get(activity)) != null) {
            this.f15896d.remove(activity);
            SparseIntArray[] m36437b = this.f15888B.m36437b();
            int i3 = 0;
            if (m36437b == null || (sparseIntArray = m36437b[0]) == null) {
                i = 0;
                i2 = 0;
            } else {
                int i4 = 0;
                i = 0;
                i2 = 0;
                while (i3 < sparseIntArray.size()) {
                    int keyAt = sparseIntArray.keyAt(i3);
                    int valueAt = sparseIntArray.valueAt(i3);
                    i4 += valueAt;
                    if (keyAt > 700) {
                        i2 += valueAt;
                    }
                    if (keyAt > 16) {
                        i += valueAt;
                    }
                    i3++;
                }
                i3 = i4;
            }
            if (i3 > 0) {
                trace.putMetric(EnumC6625b.FRAMES_TOTAL.toString(), i3);
            }
            if (i > 0) {
                trace.putMetric(EnumC6625b.FRAMES_SLOW.toString(), i);
            }
            if (i2 > 0) {
                trace.putMetric(EnumC6625b.FRAMES_FROZEN.toString(), i2);
            }
            if (C6641k.m21392b(activity.getApplicationContext())) {
                C6609a c6609a = f15885I;
                c6609a.m21479a("sendScreenTrace name:" + m21527c(activity) + " _fr_tot:" + i3 + " _fr_slo:" + i + " _fr_fzn:" + i2);
            }
            trace.stop();
        }
    }

    /* renamed from: n */
    private void m21516n(String str, C6637h c6637h, C6637h c6637h2) {
        if (this.f15902z.m21617I()) {
            C6681m.C6683b m21152x0 = C6681m.m21152x0();
            m21152x0.m21140P(str);
            m21152x0.m21142N(c6637h.m21399d());
            m21152x0.m21141O(c6637h.m21400c(c6637h2));
            m21152x0.m21147H(SessionManager.getInstance().perfSession().m20989a());
            int andSet = this.f15900x.getAndSet(0);
            synchronized (this.f15897e) {
                m21152x0.m21145K(this.f15897e);
                if (andSet != 0) {
                    m21152x0.m21143M(EnumC6625b.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                }
                this.f15897e.clear();
            }
            this.f15901y.m21418x(m21152x0.build(), EnumC6652d.FOREGROUND_BACKGROUND);
        }
    }

    /* renamed from: p */
    private void m21514p(EnumC6652d enumC6652d) {
        this.f15891E = enumC6652d;
        synchronized (this.f15898f) {
            Iterator<WeakReference<InterfaceC6595b>> it = this.f15898f.iterator();
            while (it.hasNext()) {
                InterfaceC6595b interfaceC6595b = it.next().get();
                if (interfaceC6595b != null) {
                    interfaceC6595b.onUpdateAppState(this.f15891E);
                } else {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public EnumC6652d m21529a() {
        return this.f15891E;
    }

    /* renamed from: e */
    public void m21525e(String str, long j) {
        synchronized (this.f15897e) {
            Long l = this.f15897e.get(str);
            if (l == null) {
                this.f15897e.put(str, Long.valueOf(j));
            } else {
                this.f15897e.put(str, Long.valueOf(l.longValue() + j));
            }
        }
    }

    /* renamed from: f */
    public void m21524f(int i) {
        this.f15900x.addAndGet(i);
    }

    /* renamed from: g */
    public boolean m21523g() {
        return this.f15893G;
    }

    /* renamed from: i */
    public synchronized void m21521i(Context context) {
        if (this.f15892F) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f15892F = true;
        }
    }

    /* renamed from: j */
    public void m21520j(InterfaceC6594a interfaceC6594a) {
        synchronized (this.f15898f) {
            this.f15899w.add(interfaceC6594a);
        }
    }

    /* renamed from: k */
    public void m21519k(WeakReference<InterfaceC6595b> weakReference) {
        synchronized (this.f15898f) {
            this.f15898f.add(weakReference);
        }
    }

    /* renamed from: o */
    public void m21515o(WeakReference<InterfaceC6595b> weakReference) {
        synchronized (this.f15898f) {
            this.f15898f.remove(weakReference);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        if (this.f15895c.isEmpty()) {
            this.f15889C = this.f15887A.m21415a();
            this.f15895c.put(activity, Boolean.TRUE);
            m21514p(EnumC6652d.FOREGROUND);
            if (this.f15893G) {
                m21518l();
                this.f15893G = false;
            } else {
                m21516n(EnumC6626c.BACKGROUND_TRACE_NAME.toString(), this.f15890D, this.f15889C);
            }
        } else {
            this.f15895c.put(activity, Boolean.TRUE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (m21522h(activity) && this.f15902z.m21617I()) {
            this.f15888B.m36438a(activity);
            Trace trace = new Trace(m21527c(activity), this.f15901y, this.f15887A, this);
            trace.start();
            this.f15896d.put(activity, trace);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        if (m21522h(activity)) {
            m21517m(activity);
        }
        if (this.f15895c.containsKey(activity)) {
            this.f15895c.remove(activity);
            if (this.f15895c.isEmpty()) {
                this.f15890D = this.f15887A.m21415a();
                m21514p(EnumC6652d.BACKGROUND);
                m21516n(EnumC6626c.FOREGROUND_TRACE_NAME.toString(), this.f15889C, this.f15890D);
            }
        }
    }
}
