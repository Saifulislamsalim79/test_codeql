package com.google.firebase.perf.metrics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.firebase.perf.p176h.C6609a;
import com.google.firebase.perf.p177i.C6623k;
import com.google.firebase.perf.p178j.C6624a;
import com.google.firebase.perf.p178j.C6637h;
import com.google.firebase.perf.p178j.EnumC6626c;
import com.google.firebase.perf.p179k.C6681m;
import com.google.firebase.perf.p179k.EnumC6652d;
import com.google.firebase.perf.provider.FirebasePerfProvider;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks {

    /* renamed from: B */
    private static final long f16068B = TimeUnit.MINUTES.toMicros(1);

    /* renamed from: C */
    private static volatile AppStartTrace f16069C;

    /* renamed from: d */
    private final C6623k f16072d;

    /* renamed from: e */
    private final C6624a f16073e;

    /* renamed from: f */
    private Context f16074f;

    /* renamed from: c */
    private boolean f16071c = false;

    /* renamed from: w */
    private boolean f16075w = false;

    /* renamed from: x */
    private C6637h f16076x = null;

    /* renamed from: y */
    private C6637h f16077y = null;

    /* renamed from: z */
    private C6637h f16078z = null;

    /* renamed from: A */
    private boolean f16070A = false;

    /* renamed from: com.google.firebase.perf.metrics.AppStartTrace$a */
    /* loaded from: classes2.dex */
    public static class RunnableC6691a implements Runnable {

        /* renamed from: c */
        private final AppStartTrace f16079c;

        public RunnableC6691a(AppStartTrace appStartTrace) {
            this.f16079c = appStartTrace;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f16079c.f16076x == null) {
                this.f16079c.f16070A = true;
            }
        }
    }

    AppStartTrace(C6623k c6623k, C6624a c6624a) {
        this.f16072d = c6623k;
        this.f16073e = c6624a;
    }

    /* renamed from: c */
    public static AppStartTrace m21134c() {
        return f16069C != null ? f16069C : m21133d(C6623k.m21437e(), new C6624a());
    }

    /* renamed from: d */
    static AppStartTrace m21133d(C6623k c6623k, C6624a c6624a) {
        if (f16069C == null) {
            synchronized (AppStartTrace.class) {
                if (f16069C == null) {
                    f16069C = new AppStartTrace(c6623k, c6624a);
                }
            }
        }
        return f16069C;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    /* renamed from: e */
    public synchronized void m21132e(Context context) {
        if (this.f16071c) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f16071c = true;
            this.f16074f = applicationContext;
        }
    }

    /* renamed from: f */
    public synchronized void m21131f() {
        if (this.f16071c) {
            ((Application) this.f16074f).unregisterActivityLifecycleCallbacks(this);
            this.f16071c = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f16070A && this.f16076x == null) {
            new WeakReference(activity);
            this.f16076x = this.f16073e.m21415a();
            if (FirebasePerfProvider.getAppStartTime().m21400c(this.f16076x) > f16068B) {
                this.f16075w = true;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        if (!this.f16070A && this.f16078z == null && !this.f16075w) {
            new WeakReference(activity);
            this.f16078z = this.f16073e.m21415a();
            C6637h appStartTime = FirebasePerfProvider.getAppStartTime();
            C6609a m21475e = C6609a.m21475e();
            m21475e.m21479a("onResume(): " + activity.getClass().getName() + ": " + appStartTime.m21400c(this.f16078z) + " microseconds");
            C6681m.C6683b m21152x0 = C6681m.m21152x0();
            m21152x0.m21140P(EnumC6626c.APP_START_TRACE_NAME.toString());
            m21152x0.m21142N(appStartTime.m21399d());
            m21152x0.m21141O(appStartTime.m21400c(this.f16078z));
            ArrayList arrayList = new ArrayList(3);
            C6681m.C6683b m21152x02 = C6681m.m21152x0();
            m21152x02.m21140P(EnumC6626c.ON_CREATE_TRACE_NAME.toString());
            m21152x02.m21142N(appStartTime.m21399d());
            m21152x02.m21141O(appStartTime.m21400c(this.f16076x));
            arrayList.add(m21152x02.build());
            C6681m.C6683b m21152x03 = C6681m.m21152x0();
            m21152x03.m21140P(EnumC6626c.ON_START_TRACE_NAME.toString());
            m21152x03.m21142N(this.f16076x.m21399d());
            m21152x03.m21141O(this.f16076x.m21400c(this.f16077y));
            arrayList.add(m21152x03.build());
            C6681m.C6683b m21152x04 = C6681m.m21152x0();
            m21152x04.m21140P(EnumC6626c.ON_RESUME_TRACE_NAME.toString());
            m21152x04.m21142N(this.f16077y.m21399d());
            m21152x04.m21141O(this.f16077y.m21400c(this.f16078z));
            arrayList.add(m21152x04.build());
            m21152x0.m21148G(arrayList);
            m21152x0.m21147H(SessionManager.getInstance().perfSession().m20989a());
            this.f16072d.m21418x((C6681m) m21152x0.build(), EnumC6652d.FOREGROUND_BACKGROUND);
            if (this.f16071c) {
                m21131f();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.f16070A && this.f16077y == null && !this.f16075w) {
            this.f16077y = this.f16073e.m21415a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
    }
}
