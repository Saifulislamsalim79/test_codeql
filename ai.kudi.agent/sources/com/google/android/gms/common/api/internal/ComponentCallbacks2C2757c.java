package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.C2974l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.api.internal.c */
/* loaded from: classes2.dex */
public final class ComponentCallbacks2C2757c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: w */
    private static final ComponentCallbacks2C2757c f7744w = new ComponentCallbacks2C2757c();

    /* renamed from: c */
    private final AtomicBoolean f7745c = new AtomicBoolean();

    /* renamed from: d */
    private final AtomicBoolean f7746d = new AtomicBoolean();

    /* renamed from: e */
    private final ArrayList<InterfaceC2758a> f7747e = new ArrayList<>();

    /* renamed from: f */
    private boolean f7748f = false;

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC2758a {
        /* renamed from: a */
        void mo23077a(boolean z);
    }

    private ComponentCallbacks2C2757c() {
    }

    /* renamed from: b */
    public static ComponentCallbacks2C2757c m32048b() {
        return f7744w;
    }

    /* renamed from: c */
    public static void m32047c(Application application) {
        synchronized (f7744w) {
            ComponentCallbacks2C2757c componentCallbacks2C2757c = f7744w;
            if (!componentCallbacks2C2757c.f7748f) {
                application.registerActivityLifecycleCallbacks(componentCallbacks2C2757c);
                application.registerComponentCallbacks(f7744w);
                f7744w.f7748f = true;
            }
        }
    }

    /* renamed from: f */
    private final void m32044f(boolean z) {
        synchronized (f7744w) {
            Iterator<InterfaceC2758a> it = this.f7747e.iterator();
            while (it.hasNext()) {
                it.next().mo23077a(z);
            }
        }
    }

    /* renamed from: a */
    public void m32049a(InterfaceC2758a interfaceC2758a) {
        synchronized (f7744w) {
            this.f7747e.add(interfaceC2758a);
        }
    }

    /* renamed from: d */
    public boolean m32046d() {
        return this.f7745c.get();
    }

    /* renamed from: e */
    public boolean m32045e(boolean z) {
        if (!this.f7746d.get()) {
            if (!C2974l.m31521b()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f7746d.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f7745c.set(true);
            }
        }
        return m32046d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f7745c.compareAndSet(true, false);
        this.f7746d.set(true);
        if (compareAndSet) {
            m32044f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f7745c.compareAndSet(true, false);
        this.f7746d.set(true);
        if (compareAndSet) {
            m32044f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f7745c.compareAndSet(false, true)) {
            this.f7746d.set(true);
            m32044f(true);
        }
    }
}
